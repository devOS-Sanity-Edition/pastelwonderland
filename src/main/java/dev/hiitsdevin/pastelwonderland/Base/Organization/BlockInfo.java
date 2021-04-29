package dev.hiitsdevin.pastelwonderland.Base.Organization;

import dev.hiitsdevin.pastelwonderland.Base.Blocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.StainedGlassPaneBlock;
import net.minecraft.util.DyeColor;

import static net.minecraft.block.Blocks.*;

public class BlockInfo {

    public static Block ConcreteBlock() {
        return new Block(FabricBlockSettings.copy(WHITE_CONCRETE));
    }

}
