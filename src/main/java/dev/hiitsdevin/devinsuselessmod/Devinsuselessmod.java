// 🦀 CRAB IN THE CODE 🦀

package dev.hiitsdevin.devinsuselessmod;

import dev.hiitsdevin.devinsuselessmod.client.DevinsuselessmodClient;
import net.fabricmc.api.ModInitializer;
import net.kyrptonaught.customportalapi.CustomPortalApiRegistry;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Devinsuselessmod implements ModInitializer {

    //TODO:
    // - Add a custom biome consistent of the prototype texture blocks - Work in Progress ✅
    // - Figure out how to make fence and wall textures
    // - Figure out custom building generation
    // - Learn how to make commands
    // - Learn how to make a GUI
    // - Make some sort of a new "chest" like thing

    // FIXME: Fix Cjab's creeper.properties random entities file - Done ✅

    @Override
    public void onInitialize() {
        CustomPortalApiRegistry.addPortal(Blocks.BLACK, new Identifier("devin", "devin"), 63, 63, 63);
        CustomPortalApiRegistry.addPortal(Blocks.RED, new Identifier("devin", "devin"), 253,174,187);


        // modularity who
        // each separate class for organizational reasons, this is great
        Items.init();
        Blocks.init();
    }
}
