// 🦀 CRAB IN THE CODE 🦀
// live laugh taze
// wait why do i hear a taser coming towards me-

package dev.hiitsdevin.pastelwonderland;
import dev.hiitsdevin.pastelwonderland.Base.*;
import dev.hiitsdevin.pastelwonderland.Entities.Mallards.MallardEntity;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.ai.brain.Activity;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class PastelWonderland implements ModInitializer {

    // for the text render. be sure to comment out both HudRenderCallsbacks when you're not in a dev env.
    public static final String PrototypePastelVersion = "Pastel Wonderland - Development Build v0.0.2";
    public static final String PrototypePastelDistribution = "If this build is not public please do not redistribute it!";
    public static final String MOD_ID = "pastelwonderland";

    public static final EntityType<MallardEntity> MALLARD = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("pastelwonderland", "mallard"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, MallardEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
    );

    public static final Activity EXIST = Activity.register("exist");

    @Override
    public final void onInitialize() {
        // modularity who, me bitch
        // each separate class for organizational reasons, this is great
        Blocks.init();
        DevDisclaimer.init();
        Items.init();
        Portals.init();

        FabricDefaultAttributeRegistry.register(MALLARD, MallardEntity.createMobAttributes());
    }
}
