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
import devos.pastelwonderland.Base.Organization.BlockInfo.PastelWoodLogs
import devos.pastelwonderland.Base.Organization.BlockInfo.PastelWoodPlanks
import devos.pastelwonderland.Base.Organization.BlockInfo.PastelWool
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
    val LIGHT_RED = register("light_red", PastelConcreteBlock())
    val RED = register("red", PastelConcreteBlock())
    val ORANGE = register("orange", PastelConcreteBlock())
    val YELLOW = register("yellow", PastelConcreteBlock())
    val LIGHT_GREEN = register("light_green", PastelConcreteBlock())
    val GREEN = register("green", PastelConcreteBlock())
    val LIGHT_BLUE = register("light_blue", PastelConcreteBlock())
    val BLUE = register("blue", PastelConcreteBlock())
    val PURPLE = register("purple", PastelConcreteBlock())
    val MAGENTA = register("magenta", PastelConcreteBlock())
    val BLACK = register("black", PastelConcreteBlock())
    val LIGHT_GRAY = register("light_gray", PastelConcreteBlock())
    val GRAY = register("gray", PastelConcreteBlock())
    val PASTEL_BASE = register("pastel_base", PastelConcreteBlock())
    val BROWN = register("brown", PastelConcreteBlock())

    //Powder Blocks
    val LIGHT_RED_POWDER = register("light_red_powder", ConcretePowderBlock(LIGHT_RED, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val RED_POWDER = register("red_powder", ConcretePowderBlock(RED, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val ORANGE_POWDER = register("orange_powder", ConcretePowderBlock(ORANGE, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val YELLOW_POWDER = register("yellow_powder", ConcretePowderBlock(YELLOW, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val LIGHT_GREEN_POWDER = register("light_green_powder", ConcretePowderBlock(LIGHT_GREEN, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val GREEN_POWDER = register("green_powder", ConcretePowderBlock(GREEN, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val LIGHT_BLUE_POWDER = register("light_blue_powder", ConcretePowderBlock(LIGHT_BLUE, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val BLUE_POWDER = register("blue_powder", ConcretePowderBlock(BLUE, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val PURPLE_POWDER = register("purple_powder", ConcretePowderBlock(PURPLE, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val MAGENTA_POWDER = register("magenta_powder", ConcretePowderBlock(MAGENTA, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val BLACK_POWDER = register("black_powder", ConcretePowderBlock(BLACK, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val LIGHT_GRAY_POWDER = register("light_gray_powder", ConcretePowderBlock(LIGHT_GRAY, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val GRAY_POWDER = register("gray_powder", ConcretePowderBlock(GRAY, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val PASTEL_BASE_POWDER = register("pastel_base_powder", ConcretePowderBlock(PASTEL_BASE, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))
    val BROWN_POWDER = register("brown_powder", ConcretePowderBlock(BROWN, FabricBlockSettings.copy(Blocks.WHITE_CONCRETE_POWDER)))

    //Nature Blocks
    val PASTEL_DIRT = register("dirt", Block(FabricBlockSettings.copy(Blocks.DIRT)))
    val PASTEL_GRASS = register("grass", GrassBlock(FabricBlockSettings.copy(Blocks.GRASS_BLOCK)))
    val PASTEL_STONE = register("stone", Block(FabricBlockSettings.copy(Blocks.STONE)))
    val PASTEL_SAND = register("sand", SandBlock(14269048, FabricBlockSettings.copy(Blocks.SAND)))
    val PASTEL_ORE = register("pastel_ore", OreBlock(FabricBlockSettings.copy(Blocks.IRON_ORE)))
    val LIGHT_BLUE_LEAVES = register("light_blue_leaves", PastelLeaves())
    val LIGHT_RED_LEAVES = register("light_red_leaves", PastelLeaves())
    val YELLOW_LEAVES = register("yellow_leaves", PastelLeaves())
    val LIGHT_GREEN_LEAVES = register("light_green_leaves", PastelLeaves())

    //Fences
    val LIGHT_RED_FENCE = register("light_red_fence", PastelFence())
    val RED_FENCE = register("red_fence", PastelFence())
    val ORANGE_FENCE = register("orange_fence", PastelFence())
    val YELLOW_FENCE = register("yellow_fence", PastelFence())
    val LIGHT_GREEN__FENCE = register("light_green_fence", PastelFence())
    val GREEN_FENCE = register("green_fence", PastelFence())
    val LIGHT_BLUE_FENCE = register("light_blue_fence", PastelFence())
    val BLUE_FENCE = register("blue_fence", PastelFence())
    val PURPLE_FENCE = register("purple_fence", PastelFence())
    val MAGENTA_FENCE = register("magenta_fence", PastelFence())
    val BLACK_FENCE = register("black_fence", PastelFence())
    val LIGHT_GRAY_FENCE = register("light_gray_fence", PastelFence())
    val GRAY_FENCE = register("gray_fence", PastelFence())
    val PASTEL_BASE_FENCE = register("pastel_base_fence", PastelFence())
    val BROWN_FENCE = register("brown_fence", PastelFence())
    //Fence Gates
    val LIGHT_RED_FENCE_GATE = register("light_red_fence_gate", PastelFenceGates())
    val RED_FENCE_GATE = register("red_fence_gate", PastelFenceGates())
    val ORANGE_FENCE_GATE = register("orange_fence_gate", PastelFenceGates())
    val YELLOW_FENCE_GATE = register("yellow_fence_gate", PastelFenceGates())
    val LIGHT_GREEN_FENCE_GATE = register("light_green_fence_gate", PastelFenceGates())
    val GREEN_FENCE_GATE = register("green_fence_gate", PastelFenceGates())
    val LIGHT_BLUE_FENCE_GATE = register("light_blue_fence_gate", PastelFenceGates())
    val BLUE_FENCE_GATE = register("blue_fence_gate", PastelFenceGates())
    val PURPLE_FENCE_GATE = register("purple_fence_gate", PastelFenceGates())
    val MAGENTA_FENCE_GATE = register("magenta_fence_gate", PastelFenceGates())
    val BLACK_FENCE_GATE = register("black_fence_gate", PastelFenceGates())
    val LIGHT_GRAY_FENCE_GATE = register("light_gray_fence_gate", PastelFenceGates())
    val GRAY_FENCE_GATE = register("gray_fence_gate", PastelFenceGates())
    val PASTEL_BASE_FENCE_GATE = register("pastel_base_fence_gate", PastelFenceGates())
    val BROWN_FENCE_GATE = register("brown_fence_gate", PastelFenceGates())

    //Glass
    val LIGHT_RED_GLASS = registerGlassBlock("light_red_glass", PastelGlassBlock())
    val RED_GLASS = registerGlassBlock("red_glass", PastelGlassBlock())
    val ORANGE_GLASS = registerGlassBlock("orange_glass", PastelGlassBlock())
    val YELLOW_GLASS = registerGlassBlock("yellow_glass", PastelGlassBlock())
    val LIGHT_GREEN_GLASS = registerGlassBlock("light_green_glass", PastelGlassBlock())
    val GREEN_GLASS = registerGlassBlock("green_glass", PastelGlassBlock())
    val LIGHT_BLUE_GLASS = registerGlassBlock("light_blue_glass", PastelGlassBlock())
    val BLUE_GLASS = registerGlassBlock("blue_glass", PastelGlassBlock())
    val PURPLE_GLASS = registerGlassBlock("purple_glass", PastelGlassBlock())
    val MAGENTA_GLASS = registerGlassBlock("magenta_glass", PastelGlassBlock())
    val BLACK_GLASS = registerGlassBlock("black_glass", PastelGlassBlock())
    val LIGHT_GRAY_GLASS = registerGlassBlock("light_gray_glass", PastelGlassBlock())
    val GRAY_GLASS = registerGlassBlock("gray_glass", PastelGlassBlock())
    val PASTEL_BASE_GLASS = registerGlassBlock("pastel_base_glass", PastelGlassBlock())
    val BROWN_GLASS = registerGlassBlock("brown_glass", PastelGlassBlock())

    val LIGHT_RED_GLASS_ITEM = registerGlassItem("light_red_glass", LIGHT_RED_GLASS)
    val RED_GLASS_ITEM = registerGlassItem("red_glass", RED_GLASS)
    val ORANGE_GLASS_ITEM = registerGlassItem("orange_glass", ORANGE_GLASS)
    val YELLOW_GLASS_ITEM = registerGlassItem("yellow_glass", YELLOW_GLASS)
    val LIGHT_GREEN_GLASS_ITEM = registerGlassItem("light_green_glass", LIGHT_GREEN_GLASS)
    val GREEN_GLASS_ITEM = registerGlassItem("green_glass", GREEN_GLASS)
    val LIGHT_BLUE_GLASS_ITEM = registerGlassItem("light_blue_glass", LIGHT_BLUE_GLASS)
    val BLUE_GLASS_ITEM = registerGlassItem("blue_glass", BLUE_GLASS)
    val PURPLE_GLASS_ITEM = registerGlassItem("purple_glass", PURPLE_GLASS)
    val MAGENTA_GLASS_ITEM = registerGlassItem("magenta_glass", MAGENTA_GLASS)
    val BLACK_GLASS_ITEM = registerGlassItem("black_glass", BLACK_GLASS)
    val LIGHT_GRAY_GLASS_ITEM = registerGlassItem("light_gray_glass", LIGHT_GRAY_GLASS)
    val GRAY_GLASS_ITEM = registerGlassItem("gray_glass", GRAY_GLASS)
    val PASTEL_BASE_GLASS_ITEM = registerGlassItem("pastel_base_glass", PASTEL_BASE_GLASS)
    val BROWN_GLASS_ITEM = registerGlassItem("brown_glass", BROWN_GLASS)

    //Glowstone
    val LIGHT_RED_GLOWSTONE = register("light_red_glowstone", PastelGlowstone())

    //Slabs
    val LIGHT_RED_SLAB = register("light_red_slab", PastelSlabs())
    val RED_SLAB = register("red_slab", PastelSlabs())
    val ORANGE_SLAB = register("orange_slab", PastelSlabs())
    val YELLOW_SLAB = register("yellow_slab", PastelSlabs())
    val LIGHT_GREEN_SLAB = register("light_green_slab", PastelSlabs())
    val GREEN_SLAB = register("green_slab", PastelSlabs())
    val LIGHT_BLUE_SLAB = register("light_blue_slab", PastelSlabs())
    val BLUE_SLAB = register("blue_slab", PastelSlabs())
    val PURPLE_SLAB = register("purple_slab", PastelSlabs())
    val MAGENTA_SLAB = register("magenta_slab", PastelSlabs())
    val BLACK_SLAB = register("black_slab", PastelSlabs())
    val LIGHT_GRAY_SLAB = register("light_gray_slab", PastelSlabs())
    val GRAY_SLAB = register("gray_slab", PastelSlabs())
    val PASTEL_BASE_SLAB = register("pastel_base_slab", PastelSlabs())
    val BROWN_SLAB = register("brown_slab", PastelSlabs())

    //Stairs
    val LIGHT_RED_STAIRS = register("light_red_stairs", PastelStairs())
    val RED_STAIRS = register("red_stairs", PastelStairs())
    val ORANGE_STAIRS = register("orange_stairs", PastelStairs())
    val YELLOW_STAIRS = register("yellow_stairs", PastelStairs())
    val LIGHT_GREEN_STAIRS = register("light_green_stairs", PastelStairs())
    val GREEN_STAIRS = register("green_stairs", PastelStairs())
    val LIGHT_BLUE_STAIRS = register("light_blue_stairs", PastelStairs())
    val BLUE_STAIRS = register("blue_stairs", PastelStairs())
    val PURPLE_STAIRS = register("purple_stairs", PastelStairs())
    val MAGENTA_STAIRS = register("magenta_stairs", PastelStairs())
    val BLACK_STAIRS = register("black_stairs", PastelStairs())
    val LIGHT_GRAY_STAIRS = register("light_gray_stairs", PastelStairs())
    val GRAY_STAIRS = register("gray_stairs", PastelStairs())
    val PASTEL_BASE_STAIRS = register("pastel_base_stairs", PastelStairs())
    val BROWN_STAIRS = register("brown_stairs", PastelStairs())

    //Walls
    val LIGHT_RED_WALL = register("light_red_wall", PastelWalls())
    val RED_WALL = register("red_wall", PastelWalls())
    val ORANGE_WALL = register("orange_wall", PastelWalls())
    val YELLOW_WALL = register("yellow_wall", PastelWalls())
    val LIGHT_GREEN__WALL = register("light_green_wall", PastelWalls())
    val GREEN_WALL = register("green_wall", PastelWalls())
    val LIGHT_BLUE_WALL = register("light_blue_wall", PastelWalls())
    val BLUE_WALL = register("blue_wall", PastelWalls())
    val PURPLE_WALL = register("purple_wall", PastelWalls())
    val MAGENTA_WALL = register("magenta_wall", PastelWalls())
    val BLACK_WALL = register("black_wall", PastelWalls())
    val LIGHT_GRAY_WALL = register("light_gray_wall", PastelWalls())
    val GRAY_WALL = register("gray_wall", PastelWalls())
    val PASTEL_BASE_WALL = register("pastel_base_wall", PastelWalls())
    val BROWN_WALL = register("brown_wall", PastelWalls())

    //Wools
    val LIGHT_RED_WOOL = register("light_red_wool", PastelWool())
    val RED_WOOL = register("red_wool", PastelWool())
    val ORANGE_WOOL = register("orange_wool", PastelWool())
    val YELLOW_WOOL = register("yellow_wool", PastelWool())
    val LIGHT_GREEN_WOOL = register("light_green_wool", PastelWool())
    val GREEN_WOOL = register("green_wool", PastelWool())
    val LIGHT_BLUE_WOOL = register("light_blue_wool", PastelWool())
    val BLUE_WOOL = register("blue_wool", PastelWool())
    val PURPLE_WOOL = register("purple_wool", PastelWool())
    val MAGENTA_WOOL = register("magenta_wool", PastelWool())
    val BLACK_WOOL = register("black_wool", PastelWool())
    val LIGHT_GRAY_WOOL = register("light_gray_wool", PastelWool())
    val GRAY_WOOL = register("gray_wool", PastelWool())
    val PASTEL_BASE_WOOL = register("pastel_base_wool", PastelWool())
    val BROWN_WOOL = register("brown_wool", PastelWool())

    // Start of Wood Varients

    //Logs
    val LIGHT_RED_LOG = register("light_red_log", PastelWoodLogs())
    val LIGHT_GREEN_LOG = register("light_green_log", PastelWoodLogs())
    val LIGHT_BLUE_LOG = register("light_blue_log", PastelWoodLogs())
    val YELLOW_LOG = register("yellow_log", PastelWoodLogs())

    //Planks
    val LIGHT_RED_PLANK = register("light_red_plank", PastelWoodPlanks())
    val LIGHT_GREEN_PLANK = register("light_green_plank", PastelWoodPlanks())
    val LIGHT_BLUE_PLANK = register("light_blue_plank", PastelWoodPlanks())
    val YELLOW_PLANK = register("yellow_plank", PastelWoodPlanks())

    //Plank Stairs
    val LIGHT_RED_PLANK_STAIRS = register("light_red_plank_stairs", PastelStairs())
    val LIGHT_GREEN_PLANK_STAIRS = register("light_green_plank_stairs", PastelStairs())
    val LIGHT_BLUE_PLANK_STAIRS = register("light_blue_plank_stairs", PastelStairs())
    val YELLOW_PLANK_STAIRS = register("yellow_plank_stairs", PastelStairs())

    //Plank Slabs
    val LIGHT_RED_PLANK_SLAB = register("light_red_plank_slab", PastelSlabs())
    val LIGHT_GREEN_PLANK_SLAB = register("light_green_plank_slab", PastelSlabs())
    val LIGHT_BLUE_PLANK_SLAB = register("light_blue_plank_slab", PastelSlabs())
    val YELLOW_PLANK_SLAB = register("yellow_plank_slab", PastelSlabs())

    //Plank Fence Gates
    val LIGHT_RED_PLANK_FENCE_GATE = register("light_red_plank_fence_gate", PastelFenceGates())
    val LIGHT_GREEN_PLANK_FENCE_GATE = register("light_green_plank_fence_gate", PastelFenceGates())
    val LIGHT_BLUE_PLANK_FENCE_GATE = register("light_blue_plank_fence_gate", PastelFenceGates())
    val YELLOW_PLANK_FENCE_GATE = register("yellow_plank_fence_gate", PastelFenceGates())

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
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), LIGHT_RED_GLASS, RED_GLASS, ORANGE_GLASS, YELLOW_GLASS, LIGHT_GREEN_GLASS, GREEN_GLASS, LIGHT_BLUE_GLASS, BLUE_GLASS, PURPLE_GLASS, MAGENTA_GLASS, BLACK_GLASS, LIGHT_GRAY_GLASS, GRAY_GLASS, PASTEL_BASE_GLASS, BROWN_GLASS)
        BlockRenderLayerMap.INSTANCE.putItems(RenderLayer.getTranslucent(), LIGHT_RED_GLASS_ITEM, RED_GLASS_ITEM, ORANGE_GLASS_ITEM, YELLOW_GLASS_ITEM, LIGHT_GREEN_GLASS_ITEM, GREEN_GLASS_ITEM, LIGHT_BLUE_GLASS_ITEM, BLUE_GLASS_ITEM, PURPLE_GLASS_ITEM, MAGENTA_GLASS_ITEM, BLACK_GLASS_ITEM, LIGHT_GRAY_GLASS_ITEM, GRAY_GLASS_ITEM, PASTEL_BASE_GLASS_ITEM, BROWN_GLASS_ITEM);
    }
}
