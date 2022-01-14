package community.devos.nautical.pastelwonderland.common;

import community.devos.nautical.pastelwonderland.Pastelwonderland;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.kyrptonaught.customportalapi.CustomPortalBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import static community.devos.nautical.pastelwonderland.Pastelwonderland.locate;

public class PastelwonderlandPortalBlock extends CustomPortalBlock {
    public PastelwonderlandPortalBlock(Properties settings) {
        super(settings);
    }

    @Override
    public Block getPortalBase(Level world, BlockPos pos) {
        return PastelwonderlandBlocks.RED_PASTEL_BLOCK;
    }
}
