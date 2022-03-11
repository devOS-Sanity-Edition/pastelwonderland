package one.devos.nautical.pastelwonderland.world.dimension;

import one.devos.nautical.pastelwonderland.Pastelwonderland;
import one.devos.nautical.pastelwonderland.common.PastelwonderlandBlocks;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

import static one.devos.nautical.pastelwonderland.Pastelwonderland.MOD_ID;
import static one.devos.nautical.pastelwonderland.Pastelwonderland.locate;


public class PastelwonderlandDimension {

    public static final ResourceKey<Level> PW_WORLD_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY, locate(Pastelwonderland.MOD_ID));

    public static void init() {
        CustomPortalBuilder.beginPortal()
                .frameBlock(PastelwonderlandBlocks.RED_PASTEL_BLOCK)
                .customPortalBlock(PastelwonderlandBlocks.PASTEL_PORTAL_BLOCK)
                .destDimID(locate(MOD_ID))
                .tintColor(123, 123, 123)
                .lightWithItem(Items.AMETHYST_SHARD)
                .registerPortal();
    }


}
