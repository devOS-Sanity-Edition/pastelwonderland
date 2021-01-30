package dev.hiitsdevin.pastelwonderland.Entities.Tater;

import dev.hiitsdevin.pastelwonderland.Entities.Mallards.MallardEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;

import java.util.Objects;

public class TaterEntity extends MallardEntity {
    private static final Ingredient BREEDING_INGREDIENT;

    public TaterEntity(EntityType<? extends MallardEntity> entityType, World world) {
        super(entityType, world);
        //this.setHealth(2);
        //this.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).setBaseValue(2.0D);
        //this.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).setBaseValue(0.25D);
    }

    public MallardEntity createChild(ServerWorld serverWorld, PassiveEntity passiveEntity) {
        return null;
    }

    static {
        BREEDING_INGREDIENT = Ingredient.ofItems(Items.WHEAT_SEEDS, Items.MELON_SEEDS, Items.PUMPKIN_SEEDS, Items.BEETROOT_SEEDS);
    }
}
