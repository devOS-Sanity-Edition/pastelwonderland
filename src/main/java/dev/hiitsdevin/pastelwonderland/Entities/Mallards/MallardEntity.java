package dev.hiitsdevin.pastelwonderland.Entities.Mallards;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class MallardEntity extends PathAwareEntity {
    public MallardEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }
}
