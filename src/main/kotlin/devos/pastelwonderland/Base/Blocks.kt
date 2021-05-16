// this is in every kt file but this rewrite is severely broken, if you can assist, please pull request and compare with main or rewrite branch. i'm so fucking sorry. -devin
// if you get a lot of red lines like shown here: https://cdn.discordapp.com/attachments/839722904676991056/843428635217100840/idea64_trv44LotCK.png
// then yeah that seems about right, again, im so so so sorry :C

package devos.pastelwonderland.Base

import devos.pastelwonderland.PastelWonderland
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.*
import net.minecraft.block.AbstractBlock.ContextPredicate
import net.minecraft.block.Blocks
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.math.BlockPos
import net.minecraft.util.registry.Registry
import net.minecraft.world.BlockView

class Blocks {
    val RED = register("red", Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)))
    val DARK_RED = register("dark_red", Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)))
    val BLUE = register("blue", Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)))
    val GREEN = register("green", Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)))
    val BLACK = register("black", Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)))
    val WHITE = register("white", Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)))
    val GRAY = register("gray", Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)))
    val MAGENTA = register("magenta", Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)))
    val PURPLE = register("purple", Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)))
    val ORANGE = register("orange", Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)))
    val YELLOW = register("yellow", Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)))
    val BROWN = register("brown", Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)))

    //Powder Blocks
    val RED_POWDER =
        register("red_powder", ConcretePowderBlock(RED, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val DARK_RED_POWDER =
        register("dark_red_powder", ConcretePowderBlock(RED, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val ORANGE_POWDER =
        register("orange_powder", ConcretePowderBlock(ORANGE, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val YELLOW_POWDER =
        register("yellow_powder", ConcretePowderBlock(YELLOW, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val GREEN_POWDER =
        register("green_powder", ConcretePowderBlock(GREEN, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val BLUE_POWDER =
        register("blue_powder", ConcretePowderBlock(BLUE, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val PURPLE_POWDER =
        register("purple_powder", ConcretePowderBlock(PURPLE, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val MAGENTA_POWDER =
        register("magenta_powder", ConcretePowderBlock(MAGENTA, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val GRAY_POWDER =
        register("gray_powder", ConcretePowderBlock(GRAY, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val BLACK_POWDER =
        register("black_powder", ConcretePowderBlock(BLACK, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val BROWN_POWDER =
        register("brown_powder", ConcretePowderBlock(BROWN, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val WHITE_POWDER =
        register("white_powder", ConcretePowderBlock(WHITE, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))

    //Nature Blocks
    val PASTEL_DIRT = register("dirt", Block(FabricBlockSettings.copy(Blocks.DIRT)))
    val PASTEL_GRASS = register("grass", GrassBlock(FabricBlockSettings.copy(Blocks.GRASS_BLOCK)))
    val PASTEL_STONE = register("stone", Block(FabricBlockSettings.copy(Blocks.STONE)))
    val PASTEL_SAND = register("sand", SandBlock(14269048, FabricBlockSettings.copy(Blocks.SAND)))
    val PASTEL_LOG = register("log", PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)))

    //broken, refer to line 69 [lmao xd]
//    val BLUE_LEAVES = register("blue_leaves", Leaves())
//    val RED_LEAVES = register("red_leaves", Leaves())
//    val YELLOW_LEAVES = Leaves()?.let { register("yellow_leaves", it) }
//    val GREEN_LEAVES = Leaves()?.let { register("green_leaves", it) }

    //Functions
    // broken, will need help
//    open fun Leaves(): LeavesBlock? {
//        return LeavesBlock(
//            FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque().blockVision(
//                ContextPredicate { blockState: BlockState?, blockView: BlockView?, blockPos: BlockPos? ->
//                    devos.pastelwonderland.Base.Blocks.(
//                        blockState,
//                        blockView,
//                        blockPos
//                    )
//                }).suffocates(
//                ContextPredicate { blockState: BlockState?, blockView: BlockView?, blockPos: BlockPos? ->
//                    devos.pastelwonderland.Base.Blocks.never(
//                        blockState,
//                        blockView,
//                        blockPos
//                    )
//                })
//        )
//    }
//
//    private fun ContextPredicate(function: (BlockState?, BlockView?, BlockPos?) -> Unit): AbstractBlock.ContextPredicate {
//        return false
//    }
//
//    fun never(blockState: BlockState?, blockView: BlockView?, blockPos: BlockPos?): Boolean {
//        return false
//    }

    private fun register(name: String, block: Block): Block {
        Registry.register(Registry.ITEM, Identifier("pastelwonderland", name), BlockItem(block, Item.Settings().group(BLOCKS)))
        return Registry.register(Registry.BLOCK, Identifier("pastelwonderland", name), block)
    }

    fun init() {

    }
}