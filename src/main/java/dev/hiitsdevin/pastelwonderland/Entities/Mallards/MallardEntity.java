package dev.hiitsdevin.pastelwonderland.Entities.Mallards;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import java.util.Objects;

public class MallardEntity extends MobEntity {
    public MallardEntity(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world);
        this.setHealth(2);
        Objects.requireNonNull(this.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH)).setBaseValue(2.0D);
    }
}
