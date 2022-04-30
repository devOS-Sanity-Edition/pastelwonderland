package one.devos.nautical.pastelwonderland.common.entities.mallard;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import one.devos.nautical.pastelwonderland.Pastelwonderland;

import java.util.function.Predicate;

public class MallardEntity extends Animal {
    private static EntityDataAccessor<Integer> VARIANT;
    private static final Ingredient FOOD_ITEMS;
    private static Predicate<Entity> AVOID_PLAYERS;

    public MallardEntity(EntityType<? extends MallardEntity> entityType, Level level) {
        super(entityType, level);
        this.setHealth(6F);
    }

    public boolean causeFallDamage(float f, float g, DamageSource damageSource) {
        return false;
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.4D));
        this.goalSelector.addGoal(2, new BreedGoal(this, 1.0D));
        this.goalSelector.addGoal(3, new TemptGoal(this, 1.0D, FOOD_ITEMS, false));
        this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.1D));
        this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(7, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(8, new RandomStrollGoal(this, 1.1D));
    }

    protected float getStandingEyeHeight(Pose pose, EntityDimensions entityDimensions) {
//        return this.isBaby() ? entityDimensions.height * 0.92F : entityDimensions.height * 0.92F;
        return entityDimensions.height;
    }

    public static Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 6.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.25);
    }

    public void aiStep() {
        super.aiStep();
        Vec3 vec3 = this.getDeltaMovement();
        if (!this.onGround && vec3.y < 0.0D) {
            this.setDeltaMovement(vec3.multiply(1.0D, 0.6D, 1.0D));
        }
    }

    public int getVariant() {
        return Mth.clamp((Integer)this.entityData.get(VARIANT), 0, 5);
    }

    public void setVariant(int variant) {
        this.entityData.set(VARIANT, variant);
    }

    protected void defineSynchedData() {
        super.defineSynchedData();
        if (!this.getCommandSenderWorld().dimension().location().getPath().equals("pastelwonderland")) {
            this.entityData.define(VARIANT, Math.random() <= 0.5 ? 0 : 1);
        } else {
            this.entityData.define(VARIANT, Math.random() <= 0.5 ? 3 : 4);
        }
    }

    public void addAdditionalSaveData(CompoundTag tag) {
        super.addAdditionalSaveData(tag);
        tag.putInt("Variant", this.getVariant());
    }

    public void readAdditionalSaveData(CompoundTag tag) {
        super.readAdditionalSaveData(tag);
        this.setVariant(tag.getInt("Variant"));
    }

    public MallardEntity getBreedOffspring(ServerLevel serverLevel, AgeableMob ageableMob) {
        return (MallardEntity) Pastelwonderland.MALLARD_ENTITY.create(serverLevel);
    }

    static {
        VARIANT = SynchedEntityData.defineId(MallardEntity.class, EntityDataSerializers.INT);
        FOOD_ITEMS = Ingredient.of(new ItemLike[]{Items.WHEAT_SEEDS, Items.MELON_SEEDS, Items.PUMPKIN_SEEDS, Items.BEETROOT_SEEDS, Items.EMERALD});
    }
}
