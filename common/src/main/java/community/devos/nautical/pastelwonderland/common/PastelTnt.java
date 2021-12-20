package community.devos.nautical.pastelwonderland.common;

import net.minecraft.world.level.block.TntBlock;
import net.minecraft.world.level.block.state.BlockState;

public class PastelTnt extends TntBlock {
    public PastelTnt(BlockState blockState, Properties properties) {
        super(properties);
        this.registerDefaultState((BlockState)this.defaultBlockState().setValue(UNSTABLE, false));
    }
}
