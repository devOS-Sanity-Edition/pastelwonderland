package dev.hiitsdevin.devinsuselessmod;

import dev.hiitsdevin.devinsuselessmod.client.DevinsuselessmodClient;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Devinsuselessmod implements ModInitializer {

    @Override
    public void onInitialize() {
        Items.init();
        Blocks.init();
    }
}
