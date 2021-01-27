package dev.hiitsdevin.pastelwonderland.Base.Organization;

import dev.hiitsdevin.pastelwonderland.Base.Blocks;
import dev.hiitsdevin.pastelwonderland.Base.Items;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import static dev.hiitsdevin.pastelwonderland.PastelWonderland.MOD_ID;

public class ItemGroup {
    public static final net.minecraft.item.ItemGroup PW_BLOCK_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "Blocks"), () -> new ItemStack(Blocks.RED));
    public static Item.Settings pwBlocks() {
        return new Item.Settings().group(PW_BLOCK_GROUP);
    }

    public static final net.minecraft.item.ItemGroup PW_ARMOUR_AND_TOOLS = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "ArmourAndTools"), () -> new ItemStack(Items.PASTEL_PICK));
    public static Item.Settings pwArmourAndTools() {
        return new Item.Settings().group(PW_ARMOUR_AND_TOOLS);
    }

    public static final net.minecraft.item.ItemGroup PW_MISC = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "Misc"), () -> new ItemStack(Items.PASTEL_INGOT));
    public static Item.Settings pwMisc() {
        return new Item.Settings().group(PW_MISC);
    }
}
