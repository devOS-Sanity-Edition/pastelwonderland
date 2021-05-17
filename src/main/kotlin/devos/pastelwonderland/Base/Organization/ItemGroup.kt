package devos.pastelwonderland.Base.Organization

import devos.pastelwonderland.Base.Blocks
import devos.pastelwonderland.Base.Items
import devos.pastelwonderland.PastelWonderland.Companion.PW_MOD_ID
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.util.Identifier

object ItemGroup {
    val PW_ARMOUR_AND_TOOLS = FabricItemGroupBuilder.build(
        Identifier(PW_MOD_ID, "armourandtools")
    ) { ItemStack(Items.VANILLA_MOCHI) } //put PASTEL_PICK back later

    val PW_BLOCK_GROUP = FabricItemGroupBuilder.build(
        Identifier(PW_MOD_ID, "blocks")
    ) { ItemStack(Blocks.RED) }

    val PW_FOODS = FabricItemGroupBuilder.create(Identifier(PW_MOD_ID, "foods")).icon {
        ItemStack(Items.MALLARD_COOKED)
    }.build()

    val PW_MISC = FabricItemGroupBuilder.build(
        Identifier(PW_MOD_ID, "misc")
    ) { ItemStack(Items.VANILLA_ICE_CREAM) } //put PASTEL_INGOT back laater

    fun pwArmourAndTools(): Item.Settings {
        return Item.Settings().group(PW_ARMOUR_AND_TOOLS)
    }

    fun pwBlocks(): Item.Settings {
        return Item.Settings().group(PW_BLOCK_GROUP)
    }

    fun pwFood(): Item.Settings {
        return Item.Settings().group(PW_FOODS)
    }

    fun pwMisc(): Item.Settings {
        return Item.Settings().group(PW_MISC)
    }
}
