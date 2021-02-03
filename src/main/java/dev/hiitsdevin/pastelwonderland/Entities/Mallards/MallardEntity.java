package dev.hiitsdevin.pastelwonderland.Entities.Mallards;

import dev.hiitsdevin.pastelwonderland.PastelWonderland;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.Durations;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.Angerable;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.IntRange;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;
import java.util.UUID;

public class MallardEntity extends AnimalEntity implements Angerable {
    private static final TrackedData<Integer> VARIANT;
    private static final Ingredient BREEDING_INGREDIENT;
    public float flapProgress;
    public float maxWingDeviation;
    public float prevMaxWingDeviation;
    public float prevFlapProgress;
    public float flapSpeed = 1.0F;
    private static final IntRange ANGER_TIME_RANGE;
    private int angerTime;
    private UUID targetUuid;

    public MallardEntity(EntityType<? extends MallardEntity> entityType, World world) {
        super(entityType, world);
        this.setHealth(2);
        Objects.requireNonNull(this.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH)).setBaseValue(2.0D);
        Objects.requireNonNull(this.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED)).setBaseValue(0.25D);
    }

    @Override
    public void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
//        this.goalSelector.add(1, new EscapeDangerGoal(this, 1.4D));
        this.goalSelector.add(2, new AnimalMateGoal(this, 1.0D));
        this.goalSelector.add(3, new TemptGoal(this, 1.0D, false, BREEDING_INGREDIENT));
        this.goalSelector.add(4, new FollowParentGoal(this, 1.1D));
        this.goalSelector.add(5, new WanderAroundFarGoal(this, 1.0D));
        this.goalSelector.add(6, new LookAtEntityGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.add(7, new LookAroundGoal(this));
        this.targetSelector.add(1, new MallardEntity.MallardRevengeGoal()); // Not working quite yet -Zenith
    }

    public MallardEntity createChild(ServerWorld serverWorld, PassiveEntity passiveEntity) {
        return (MallardEntity) PastelWonderland.MALLARD.create(serverWorld);
    }

    protected float getActiveEyeHeight(EntityPose pose, EntityDimensions dimensions) {
        return this.isBaby() ? dimensions.height : dimensions.height * 1.25F;
    }

    public boolean handleFallDamage(float fallDistance, float damageMultiplier) {
        return false;
    }

    public boolean isBreedingItem(ItemStack stack) {
        return BREEDING_INGREDIENT.test(stack);
    }

    public int getVariant() {
        return MathHelper.clamp((Integer)this.dataTracker.get(VARIANT), 0, 2);
    }

    public void setVariant(int variant) {
        this.dataTracker.set(VARIANT, variant);
    }

    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(VARIANT, Math.random() <= 0.5 ? 1 : 2);
    }

    public void writeCustomDataToTag(CompoundTag tag) {
        super.writeCustomDataToTag(tag);
        tag.putInt("Variant", this.getVariant());
    }

    public void readCustomDataFromTag(CompoundTag tag) {
        super.readCustomDataFromTag(tag);
        this.setVariant(tag.getInt("Variant"));
    }

    public void tickMovement() {
        super.tickMovement();
        this.prevFlapProgress = this.flapProgress;
        this.prevMaxWingDeviation = this.maxWingDeviation;
        this.maxWingDeviation = (float)((double)this.maxWingDeviation + (double)(this.onGround ? -1 : 4) * 0.3D);
        this.maxWingDeviation = MathHelper.clamp(this.maxWingDeviation, 0.0F, 1.0F);
        if (!this.onGround && this.flapSpeed < 1.0F) {
            this.flapSpeed = 1.0F;
        }

        this.flapSpeed = (float)((double)this.flapSpeed * 0.9D);
        Vec3d vec3d = this.getVelocity();
        if (!this.onGround && vec3d.y < 0.0D) {
            this.setVelocity(vec3d.multiply(1.0D, 0.6D, 1.0D));
        }

        this.flapProgress += this.flapSpeed * 2.0F;
    }

    public void chooseRandomAngerTime() {
        this.setAngerTime(ANGER_TIME_RANGE.choose(this.random));
    }

    public void setAngerTime(int ticks) {
        this.angerTime = ticks;
    }

    public int getAngerTime() {
        return this.angerTime;
    }

    public void setAngryAt(@Nullable UUID uuid) {
        this.targetUuid = uuid;
    }

    public UUID getAngryAt() {
        return this.targetUuid;
    }

    class MallardRevengeGoal extends RevengeGoal {
        public MallardRevengeGoal() {
            super(MallardEntity.this, new Class[0]);
        }

        public void start() {
            super.start();
            if (MallardEntity.this.isBaby()) {
                this.callSameTypeForRevenge();
                this.stop();
            }

        }

        protected void setMobEntityTarget(MobEntity mob, LivingEntity target) {
            if (mob instanceof MallardEntity && !mob.isBaby()) {
                super.setMobEntityTarget(mob, target);
            }

        }
    }


    static {
        VARIANT = DataTracker.registerData(MallardEntity.class, TrackedDataHandlerRegistry.INTEGER);
        BREEDING_INGREDIENT = Ingredient.ofItems(Items.WHEAT_SEEDS, Items.MELON_SEEDS, Items.PUMPKIN_SEEDS, Items.BEETROOT_SEEDS);
        ANGER_TIME_RANGE = Durations.betweenSeconds(20, 39);
    }
}