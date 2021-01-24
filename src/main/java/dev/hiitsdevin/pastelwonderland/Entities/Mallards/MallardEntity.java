package dev.hiitsdevin.pastelwonderland.Entities.Mallards;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class MallardEntity extends MobEntity {
    public MallardEntity(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world);
    }
}
