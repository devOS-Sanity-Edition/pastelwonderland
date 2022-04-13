package one.devos.nautical.pastelwonderland.common.blocks;

import net.kyrptonaught.customportalapi.CustomPortalBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import one.devos.nautical.pastelwonderland.common.PastelwonderlandBlocks;

public class PastelwonderlandPortalBlock extends CustomPortalBlock {
    public PastelwonderlandPortalBlock(Properties settings) {
        super(settings);
    }

    @Override
    public Block getPortalBase(Level world, BlockPos pos) {
        return PastelwonderlandBlocks.RED_PASTEL_BLOCK;
    }
}
