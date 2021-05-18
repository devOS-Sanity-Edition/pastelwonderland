package devos.pastelwonderland.Base.Organization

import devos.pastelwonderland.Base.Gameplay.Blocks
import devos.pastelwonderland.Base.Gameplay.Items
import devos.pastelwonderland.Base.Gameplay.ToolsAndArmor
import devos.pastelwonderland.PastelWonderland.Companion.PW_MOD_ID
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.util.Identifier

object ItemGroup {
    val PW_BLOCK_GROUP = FabricItemGroupBuilder.build(
        Identifier(PW_MOD_ID, "blocks")
    ) { ItemStack(Blocks.RED) }

    val PW_ARMOUR_AND_TOOLS = FabricItemGroupBuilder.build(
        Identifier(PW_MOD_ID, "armourandtools")
    ) { ItemStack(ToolsAndArmor.PASTEL_PICK) }

    val PW_FOODS = FabricItemGroupBuilder.create(Identifier(PW_MOD_ID, "foods")).icon {
        ItemStack(Items.COTTON_CANDY_ICE_CREAM)
    }.build()

    val PW_MISC = FabricItemGroupBuilder.build(
        Identifier(PW_MOD_ID, "misc")
    ) { ItemStack(Items.PASTEL_INGOT) }

    fun pwBlocks(): Item.Settings {
        return Item.Settings().group(PW_BLOCK_GROUP)
    }

    fun pwArmourAndTools(): Item.Settings {
        return Item.Settings().group(PW_ARMOUR_AND_TOOLS)
    }

    fun pwFood(): Item.Settings {
        return Item.Settings().group(PW_FOODS)
    }

    fun pwMisc(): Item.Settings {
        return Item.Settings().group(PW_MISC)
    }
}
