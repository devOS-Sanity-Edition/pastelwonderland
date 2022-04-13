package one.devos.nautical.pastelwonderland.common.entities.mallard;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.level.Level;

public class MallardEntity extends PathfinderMob {
    public MallardEntity(EntityType<? extends PathfinderMob> entityType, Level level) {
        super(entityType, level);
    }
}
