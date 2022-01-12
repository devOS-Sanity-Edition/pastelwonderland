package community.devos.nautical.pastelwonderland.common;

import community.devos.nautical.pastelwonderland.Pastelwonderland;
import io.wispforest.owo.itemgroup.OwoItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.*;

import static community.devos.nautical.pastelwonderland.Pastelwonderland.MOD_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class Blocks {


    public static void init() {
        String[] colors = {"pastel_base", "light_red", "red", "orange", "yellow", "light_green", "green", "light_blue", "blue", "purple", "magenta", "brown", "black", "light_gray", "gray"};
        for (String color : colors) {
            Block PASTEL_BLOCK = register(color, new Block(FabricBlockSettings.copy(WHITE_CONCRETE)));
            Block PASTEL_POWDER_BLOCK = register(color + "_powder", new ConcretePowderBlock(PASTEL_BLOCK, FabricBlockSettings.copy(WHITE_CONCRETE_POWDER)));
            Block PASTEL_FENCE_BLOCK = register_decorations(color + "_fence", new FenceBlock(FabricBlockSettings.copy(WHITE_CONCRETE)));
            Block PASTEL_FENCE_GATE_BLOCK = register_decorations(color + "_fence_gate", new FenceGateBlock(FabricBlockSettings.copy(WHITE_CONCRETE)));
            Block PASTEL_WALL_BLOCK = register_decorations(color + "_wall", new Block(FabricBlockSettings.copy(WHITE_CONCRETE)));
            Block PASTEL_SLAB_BLOCK = register(color + "_slab", new Block(FabricBlockSettings.copy(WHITE_CONCRETE)));
            Block PASTEL_STAIR_BLOCK = register(color + "_stairs", new PastelStairs(STONE_STAIRS.defaultBlockState(), FabricBlockSettings.copy(WHITE_CONCRETE)));
            Block PASTEL_WOOL_BLOCK = register(color + "_wool", new Block(FabricBlockSettings.copy(WHITE_CONCRETE)));
        }
    }

    private static Block register(String name, Block block) {
        Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, name), new BlockItem(block, new OwoItemSettings().group(Pastelwonderland.PW_ITEM_GROUP).tab(0)));
        return Registry.register(Registry.BLOCK, new ResourceLocation(MOD_ID, name), block);
    }
    private static Block register_decorations(String name, Block block) {
        Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, name), new BlockItem(block, new OwoItemSettings().group(Pastelwonderland.PW_ITEM_GROUP).tab(1)));
        return Registry.register(Registry.BLOCK, new ResourceLocation(MOD_ID, name), block);
    }
}
