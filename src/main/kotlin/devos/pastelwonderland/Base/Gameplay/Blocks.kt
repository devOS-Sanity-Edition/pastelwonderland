package devos.pastelwonderland.Base.Gameplay

import devos.pastelwonderland.Base.Organization.BlockInfo.ConcreteBlock
import devos.pastelwonderland.Base.Organization.BlockInfo.Leaves
import devos.pastelwonderland.Base.Organization.BlockInfo.PastelFence
import devos.pastelwonderland.Base.Organization.ItemGroup
import devos.pastelwonderland.PastelWonderland.Companion.PW_MOD_ID
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.*
import net.minecraft.block.Blocks
import net.minecraft.item.BlockItem
import net.minecraft.util.Identifier
import net.minecraft.util.math.BlockPos
import net.minecraft.util.registry.Registry
import net.minecraft.world.BlockView

//Copy these block settings
object Blocks {
    @kotlin.jvm.JvmField
    //Full blocks
    val RED = register("red", ConcreteBlock())
    val DARK_RED = register("dark_red", ConcreteBlock())
    val ORANGE = register("orange", ConcreteBlock())
    val YELLOW = register("yellow", ConcreteBlock())
    val GREEN = register("green", ConcreteBlock())
    val DARK_GREEN = register("dark_green", ConcreteBlock())
    val BLUE = register("blue", ConcreteBlock())
    val DARK_BLUE = register("dark_blue", ConcreteBlock())
    val PURPLE = register("purple", ConcreteBlock())
    val MAGENTA = register("magenta", ConcreteBlock())
    val BLACK = register("black", ConcreteBlock())
    val GRAY = register("gray", ConcreteBlock())
    val DARK_GRAY = register("dark_gray", ConcreteBlock())
    val WHITE = register("white", ConcreteBlock())
    val BROWN = register("brown", ConcreteBlock())

    //Powder Blocks
    val RED_POWDER = register("red_powder", ConcretePowderBlock(RED, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val DARK_RED_POWDER = register("dark_red_powder", ConcretePowderBlock(DARK_RED, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val ORANGE_POWDER = register("orange_powder", ConcretePowderBlock(ORANGE, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val YELLOW_POWDER = register("yellow_powder", ConcretePowderBlock(YELLOW, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val GREEN_POWDER = register("green_powder", ConcretePowderBlock(GREEN, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val DARK_GREEN_POWDER = register("dark_green_powder", ConcretePowderBlock(GREEN, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val BLUE_POWDER = register("blue_powder", ConcretePowderBlock(BLUE, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val DARK_BLUE_POWDER = register("dark_blue_powder", ConcretePowderBlock(BLUE, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val PURPLE_POWDER = register("purple_powder", ConcretePowderBlock(PURPLE, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val MAGENTA_POWDER = register("magenta_powder", ConcretePowderBlock(MAGENTA, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val BLACK_POWDER = register("black_powder", ConcretePowderBlock(BLACK, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val GRAY_POWDER = register("gray_powder", ConcretePowderBlock(GRAY, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val DARK_GRAY_POWDER = register("dark_gray_powder", ConcretePowderBlock(GRAY, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val WHITE_POWDER = register("white_powder", ConcretePowderBlock(WHITE, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val BROWN_POWDER = register("brown_powder", ConcretePowderBlock(BROWN, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))

    //Nature Blocks
    val PASTEL_DIRT = register("dirt", Block(FabricBlockSettings.copy(Blocks.DIRT)))
    val PASTEL_GRASS = register("grass", GrassBlock(FabricBlockSettings.copy(Blocks.GRASS_BLOCK)))
    val PASTEL_STONE = register("stone", Block(FabricBlockSettings.copy(Blocks.STONE)))
    val PASTEL_SAND = register("sand", SandBlock(14269048, FabricBlockSettings.copy(Blocks.SAND)))
    val PASTEL_LOG = register("log", PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)))
    val BLUE_LEAVES = register("blue_leaves", Leaves())
    val RED_LEAVES = register("red_leaves", Leaves())
    val YELLOW_LEAVES = register("yellow_leaves", Leaves())
    val GREEN_LEAVES = register("green_leaves", Leaves())

    //Fences
    val RED_FENCE = register("red_fence", PastelFence())

    //Functions
    private fun register(name: String, block: Block): Block {
        Registry.register(Registry.ITEM, Identifier(PW_MOD_ID, name), BlockItem(block, ItemGroup.pwBlocks()))
        return Registry.register(Registry.BLOCK, Identifier(PW_MOD_ID, name), block)
    }

    fun init() {

    }
}
