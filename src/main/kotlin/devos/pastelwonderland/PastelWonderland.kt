// 🦀 CRAB IN THE CODE 🦀
// live laugh taze
// wait why do i hear a taser coming towards me-

package devos.pastelwonderland

import devos.pastelwonderland.Base.DevDisclaimer
import devos.pastelwonderland.Base.Gameplay.Blocks
import devos.pastelwonderland.Base.Gameplay.Items
import devos.pastelwonderland.Base.Gameplay.Portals
import devos.pastelwonderland.Base.Gameplay.ToolsAndArmor
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.fabricmc.fabric.api.tag.TagRegistry
import net.fabricmc.loader.api.FabricLoader
import net.minecraft.block.Block
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.tag.Tag
import net.minecraft.util.Identifier


class PastelWonderland : ModInitializer {
    // maybe one day, tater will be a thing here again, no promises.
    // it's been months since this but i dont think im adding back tater. i still feel heavily discouraged after the first time. i'm sorry.
    // while doing this kotlin rewrite... im thinking about it, albeit, still rly sad ngl.

    // Aye Devin, while it would be nice to add it back, its fine, besides, we could instead add "pineapples" as thats the quilt meme

    //ok this doesn't like to be anywhere else so
    val DIRT = blockTagRegister("dirt")
    override fun onInitialize() {
        Blocks.init()
        Items.init()
        Portals.init()
        ToolsAndArmor.init()

        // comment this thing below out lol
        // no lmfao
        if (FabricLoader.getInstance().isDevelopmentEnvironment) { DevDisclaimer.init() }
    }

    companion object {
        const val PW_MOD_ID = "pastelwonderland"
        val VERSION = FabricLoader.getInstance().getModContainer(PW_MOD_ID).get().metadata.version.toString()
        val BLOCKS: ItemGroup = FabricItemGroupBuilder.create(Identifier(PW_MOD_ID, "blocks")).icon { ItemStack(Blocks.RED) }.build()
        val ITEMS: ItemGroup = FabricItemGroupBuilder.create(Identifier(PW_MOD_ID, "items")).icon { ItemStack(Items.PASTEL_INGOT) }.build()
    }
    fun blockTagRegister(id: String?): Tag<Block> {
        return TagRegistry.block(Identifier("c", id))
        // Bruh?
    }
}