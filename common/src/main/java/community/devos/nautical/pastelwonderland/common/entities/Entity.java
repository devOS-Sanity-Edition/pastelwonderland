package community.devos.nautical.pastelwonderland.common.entities;

import community.devos.nautical.pastelwonderland.PastelWonderland;
import community.devos.nautical.pastelwonderland.common.entities.mallard.MallardEntity;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.entity.EntityType;

public class Entity {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(PastelWonderland.MOD_ID, Registry.ENTITY_TYPE_REGISTRY);
    public static final RegistrySupplier<EntityType<MallardEntity>> MALLARD_ENTITY = ENTITIES.register("mallard", () -> MallardEntity.MALLARD);

    public static void init() {
        ENTITIES.register();
    }
}
