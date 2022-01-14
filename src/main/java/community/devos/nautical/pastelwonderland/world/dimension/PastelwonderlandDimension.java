package community.devos.nautical.pastelwonderland.world.dimension;

import community.devos.nautical.pastelwonderland.Pastelwonderland;
import community.devos.nautical.pastelwonderland.common.PastelwonderlandBlocks;
import community.devos.nautical.pastelwonderland.common.PastelwonderlandPortalBlock;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

import static community.devos.nautical.pastelwonderland.Pastelwonderland.MOD_ID;
import static community.devos.nautical.pastelwonderland.Pastelwonderland.locate;
import static community.devos.nautical.pastelwonderland.common.PastelwonderlandBlocks.*;


public class PastelwonderlandDimension {

    public static final ResourceKey<Level> PW_WORLD_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY, locate(Pastelwonderland.MOD_ID));

    public static void init() {
        CustomPortalBuilder.beginPortal()
                .frameBlock(RED_PASTEL_BLOCK)
                .customPortalBlock(PASTEL_PORTAL_BLOCK)
                .destDimID(locate(MOD_ID))
                .tintColor(123, 123, 123)
                .lightWithItem(Items.AMETHYST_SHARD)
                .registerPortal();
    }


}
