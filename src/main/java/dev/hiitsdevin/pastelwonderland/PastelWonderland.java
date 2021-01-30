// 🦀 CRAB IN THE CODE 🦀
// live laugh taze
// wait why do i hear a taser coming towards me-

package dev.hiitsdevin.pastelwonderland;

import dev.hiitsdevin.pastelwonderland.Base.*;
import dev.hiitsdevin.pastelwonderland.Entities.Mallards.MallardEntity;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class PastelWonderland implements ModInitializer {
    public static final String MOD_ID = "pastelwonderland";
    public static final String VERSION = FabricLoader.getInstance().getModContainer(MOD_ID).get().getMetadata().getVersion().toString();
    public static String PastelWonderlandVersion = "Pastel Wonderland - Dev Build: " + VERSION;
    public static String PastelWonderlandViewDisclaimer = "What you see here may not be representative of the final build!";
    public static String PastelWonderlandFPSDevelopment = "Game FPS: " + MinecraftClient.getInstance().fpsDebugString;


    public static final EntityType<MallardEntity> MALLARD = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("pastelwonderland", "mallard"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, MallardEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
    );

    // maybe one day, tater will be a thing here again, no promises.

    @Override
    public final void onInitialize() {
        Blocks.init();
        DevDisclaimer.init();
        Items.init();
        Portals.init();

        FabricDefaultAttributeRegistry.register(MALLARD, MallardEntity.createMobAttributes());
    }
}
