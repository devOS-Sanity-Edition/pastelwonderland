// this is in every kt file but this rewrite is severely broken, if you can assist, please pull request and compare with main or rewrite branch. i'm so fucking sorry. -devin
// if you get a lot of red lines like shown here: https://cdn.discordapp.com/attachments/839722904676991056/843428635217100840/idea64_trv44LotCK.png
// then yeah that seems about right, again, im so so so sorry :C

// 🦀 CRAB IN THE CODE 🦀
// live laugh taze
// wait why do i hear a taser coming towards me-

package devos.pastelwonderland

import devos.pastelwonderland.Base.*
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.fabricmc.loader.api.FabricLoader
import net.minecraft.item.ItemStack
import net.minecraft.util.Identifier


class PastelWonderland : ModInitializer {
    // maybe one day, tater will be a thing here again, no promises.
    // it's been months since this but i dont think im adding back tater. i still feel heavily discouraged after the first time. i'm sorry.
    // while doing this kotlin rewrite... im thinking about it, albeit, still rly sad ngl.
    override fun onInitialize() {
        Blocks.init()
        Items.init()
        Portals.init()
        ToolsAndArmor.init()

        // comment this thing below out lol
        if (net.fabricmc.loader.FabricLoader.INSTANCE.isDevelopmentEnvironment()) { DevDisclaimer.init() }
    }

    companion object {
        const val PW_MOD_ID = "pastelwonderland"
        val VERSION = FabricLoader.getInstance().getModContainer(PW_MOD_ID).get().metadata.version.toString()
    }
}


//@Suppress("unused")
//fun init() {
//    // This code runs as soon as Minecraft is in a mod-load-ready state.
//    // However, some things (like resources) may still be uninitialized.
//    // Proceed with mild caution.
//
//    println("Hello Fabric world!")
//}

