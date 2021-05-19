package devos.pastelwonderland.Base.Gameplay

import devos.pastelwonderland.Base.Organization.BlockInfo.PastelConcreteBlock
import devos.pastelwonderland.Base.Organization.BlockInfo.PastelFence
import devos.pastelwonderland.Base.Organization.BlockInfo.PastelFenceGates
import devos.pastelwonderland.Base.Organization.BlockInfo.PastelGlassBlock
import devos.pastelwonderland.Base.Organization.BlockInfo.PastelGlowstone
import devos.pastelwonderland.Base.Organization.BlockInfo.PastelLeaves
import devos.pastelwonderland.Base.Organization.BlockInfo.PastelSlabs
import devos.pastelwonderland.Base.Organization.BlockInfo.PastelStairs
import devos.pastelwonderland.Base.Organization.BlockInfo.PastelWalls
import devos.pastelwonderland.PastelWonderland
import devos.pastelwonderland.PastelWonderland.Companion.PW_MOD_ID
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.block.*
import net.minecraft.block.Blocks
import net.minecraft.client.render.RenderLayer
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry


//Copy these block settings
object Blocks {
    @kotlin.jvm.JvmField
    //Full blocks
    val RED = register("red", PastelConcreteBlock())
    val DARK_RED = register("dark_red", PastelConcreteBlock())
    val ORANGE = register("orange", PastelConcreteBlock())
    val YELLOW = register("yellow", PastelConcreteBlock())
    val GREEN = register("green", PastelConcreteBlock())
    val DARK_GREEN = register("dark_green", PastelConcreteBlock())
    val BLUE = register("blue", PastelConcreteBlock())
    val DARK_BLUE = register("dark_blue", PastelConcreteBlock())
    val PURPLE = register("purple", PastelConcreteBlock())
    val MAGENTA = register("magenta", PastelConcreteBlock())
    val BLACK = register("black", PastelConcreteBlock())
    val GRAY = register("gray", PastelConcreteBlock())
    val DARK_GRAY = register("dark_gray", PastelConcreteBlock())
    val WHITE = register("white", PastelConcreteBlock())
    val BROWN = register("brown", PastelConcreteBlock())

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
    val PASTEL_ORE = register("pastel_ore", OreBlock(FabricBlockSettings.copy(Blocks.IRON_ORE)))
    val BLUE_LEAVES = register("blue_leaves", PastelLeaves())
    val RED_LEAVES = register("red_leaves", PastelLeaves())
    val YELLOW_LEAVES = register("yellow_leaves", PastelLeaves())
    val GREEN_LEAVES = register("green_leaves", PastelLeaves())

    //Fences
    val RED_FENCE = register("red_fence", PastelFence())

    val DARK_RED_FENCE = register("dark_red_fence", PastelFence())
    val ORANGE_FENCE = register("orange_fence", PastelFence())
    val YELLOW_FENCE = register("yellow_fence", PastelFence())
    val GREEN__FENCE = register("green_fence", PastelFence())
    val DARK_GREEN_FENCE = register("dark_green_fence", PastelFence())
    val BLUE_FENCE = register("blue_fence", PastelFence())
    val DARK_BLUE_FENCE = register("dark_blue_fence", PastelFence())
    val PURPLE_FENCE = register("purple_fence", PastelFence())
    val MAGENTA_FENCE = register("magenta_fence", PastelFence())
    val BLACK_FENCE = register("black_fence", PastelFence())
    val GRAY_FENCE = register("gray_fence", PastelFence())
    val DARK_GRAY_FENCE = register("dark_gray_fence", PastelFence())
    val WHITE_FENCE = register("white_fence", PastelFence())
    val BROWN_FENCE = register("brown_fence", PastelFence())
    //Fence Gates
    val RED_FENCE_GATE = register("red_fence_gate", PastelFenceGates())

    val DARK_RED_FENCE_GATE = register("dark_red_fence_gate", PastelFenceGates())
    val ORANGE_FENCE_GATE = register("orange_fence_gate", PastelFenceGates())
    val YELLOW_FENCE_GATE = register("yellow_fence_gate", PastelFenceGates())
    val GREEN_FENCE_GATE = register("green_fence_gate", PastelFenceGates())
    val DARK_GREEN_FENCE_GATE = register("dark_green_fence_gate", PastelFenceGates())
    val BLUE_FENCE_GATE = register("blue_fence_gate", PastelFenceGates())
    val DARK_BLUE_FENCE_GATE = register("dark_blue_fence_gate", PastelFenceGates())
    val PURPLE_FENCE_GATE = register("purple_fence_gate", PastelFenceGates())
    val MAGENTA_FENCE_GATE = register("magenta_fence_gate", PastelFenceGates())
    val BLACK_FENCE_GATE = register("black_fence_gate", PastelFenceGates())
    val GRAY_FENCE_GATE = register("gray_fence_gate", PastelFenceGates())
    val DARK_GRAY_FENCE_GATE = register("dark_gray_fence_gate", PastelFenceGates())
    val WHITE_FENCE_GATE = register("white_fence_gate", PastelFenceGates())
    val BROWN_FENCE_GATE = register("brown_fence_gate", PastelFenceGates())

    //Glass
    val WHITE_GLASS = registerGlassBlock("white_glass", PastelGlassBlock())
    val BLACK_GLASS = registerGlassBlock("black_glass", PastelGlassBlock())
    val WHITE_GLASS_ITEM = registerGlassItem("white_glass", WHITE_GLASS)
    val BLACK_GLASS_ITEM = registerGlassItem("black_glass", BLACK_GLASS)

    //Glowstone
    val RED_GLOWSTONE = register("red_glowstone", PastelGlowstone())

    //Slabs
    val RED_SLAB = register("red_slab", PastelSlabs())
    val DARK_RED_SLAB = register("dark_red_slab", PastelSlabs())
    val ORANGE_SLAB = register("orange_slab", PastelSlabs())
    val YELLOW_SLAB = register("yellow_slab", PastelSlabs())
    val GREEN_SLAB = register("green_slab", PastelSlabs())
    val DARK_GREEN_SLAB = register("dark_green_slab", PastelSlabs())
    val BLUE_SLAB = register("blue_slab", PastelSlabs())
    val DARK_BLUE_SLAB = register("dark_blue_slab", PastelSlabs())
    val PURPLE_SLAB = register("purple_slab", PastelSlabs())
    val MAGENTA_SLAB = register("magenta_slab", PastelSlabs())
    val BLACK_SLAB = register("black_slab", PastelSlabs())
    val GRAY_SLAB = register("gray_slab", PastelSlabs())
    val DARK_GRAY_SLAB = register("dark_gray_slab", PastelSlabs())
    val WHITE_SLAB = register("white_slab", PastelSlabs())
    val BROWN_SLAB = register("brown_slab", PastelSlabs())

    //Stairs
    val RED_STAIRS = register("red_stairs", PastelStairs())
    val DARK_RED_STAIRS = register("dark_red_stairs", PastelStairs())
    val ORANGE_STAIRS = register("orange_stairs", PastelStairs())
    val YELLOW_STAIRS = register("yellow_stairs", PastelStairs())
    val GREEN_STAIRS = register("green_stairs", PastelStairs())
    val DARK_GREEN_STAIRS = register("dark_green_stairs", PastelStairs())
    val BLUE_STAIRS = register("blue_stairs", PastelStairs())
    val DARK_BLUE_STAIRS = register("dark_blue_stairs", PastelStairs())
    val PURPLE_STAIRS = register("purple_stairs", PastelStairs())
    val MAGENTA_STAIRS = register("magenta_stairs", PastelStairs())
    val BLACK_STAIRS = register("black_stairs", PastelStairs())
    val GRAY_STAIRS = register("gray_stairs", PastelStairs())
    val DARK_GRAY_STAIRS = register("dark_gray_stairs", PastelStairs())
    val WHITE_STAIRS = register("white_stairs", PastelStairs())
    val BROWN_STAIRS = register("brown_stairs", PastelStairs())

    //Walls
    val RED_WALL = register("red_wall", PastelWalls())
    val DARK_RED_WALL = register("dark_red_wall", PastelWalls())
    val ORANGE_WALL = register("orange_wall", PastelWalls())
    val YELLOW_WALL = register("yellow_wall", PastelWalls())
    val GREEN__WALL = register("green_wall", PastelWalls())
    val DARK_GREEN_WALL = register("dark_green_wall", PastelWalls())
    val BLUE_WALL = register("blue_wall", PastelWalls())
    val DARK_BLUE_WALL = register("dark_blue_wall", PastelWalls())
    val PURPLE_WALL = register("purple_wall", PastelWalls())
    val MAGENTA_WALL = register("magenta_wall", PastelWalls())
    val BLACK_WALL = register("black_wall", PastelWalls())
    val GRAY_WALL = register("gray_wall", PastelWalls())
    val DARK_GRAY_WALL = register("dark_gray_wall", PastelWalls())
    val WHITE_WALL = register("white_wall", PastelWalls())
    val BROWN_WALL = register("brown_wall", PastelWalls())

    //Functions
    private fun register(name: String, block: Block): Block {
        Registry.register(Registry.ITEM, Identifier(PW_MOD_ID, name), BlockItem(block, FabricItemSettings().group(PastelWonderland.BLOCKS)))
        return Registry.register(Registry.BLOCK, Identifier(PW_MOD_ID, name), block)
    }
    private fun registerGlassBlock(name: String, block: Block): Block {
        return Registry.register(Registry.BLOCK, Identifier(PW_MOD_ID, name), block)
    }
    private fun registerGlassItem(name: String, block: Block): Item {
        return Registry.register(Registry.ITEM, Identifier(PW_MOD_ID, name), BlockItem(block, FabricItemSettings().group(PastelWonderland.BLOCKS)))
    }

    fun init() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), WHITE_GLASS, BLACK_GLASS); // make sure to add glass pane after that WHITE_GLASS after you get it added
        BlockRenderLayerMap.INSTANCE.putItems(RenderLayer.getTranslucent(), WHITE_GLASS_ITEM, BLACK_GLASS_ITEM);
    }
}
