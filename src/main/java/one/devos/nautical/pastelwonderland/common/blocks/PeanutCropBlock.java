package one.devos.nautical.pastelwonderland.common.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import one.devos.nautical.pastelwonderland.common.PastelwonderlandItems;

public class PeanutCropBlock extends CropBlock {
    public PeanutCropBlock(Properties properties) {
        super(properties);
    }

    private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]{
            Block.box(.0d, .0d, .0d, 16.d, 2.d, 16.d),
            Block.box(.0d, .0d, .0d, 16.d, 4.d, 16.d),
            Block.box(.0d, .0d, .0d, 16.d, 6.d, 16.d),
            Block.box(.0d, .0d, .0d, 16.d, 8.d, 16.d),
            Block.box(.0d, .0d, .0d, 16.d, 10.d, 16.d),
            Block.box(.0d, .0d, .0d, 16.d, 12.d, 16.d),
            Block.box(.0d, .0d, .0d, 16.d, 14.d, 16.d),
            Block.box(.0d, .0d, .0d, 16.d, 16.d, 16.d)
    };

    @Override
    protected ItemLike getBaseSeedId(){
        return PastelwonderlandItems.PEANUT.asItem();
    }

    @Override
    public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return SHAPE_BY_AGE[blockState.getValue(getAgeProperty())];
    }
}
