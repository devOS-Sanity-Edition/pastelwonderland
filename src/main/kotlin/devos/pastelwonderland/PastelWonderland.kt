// 🦀 CRAB IN THE CODE 🦀
// live laugh taze
// wait why do i hear a taser coming towards me-

package devos.pastelwonderland

import devos.pastelwonderland.Base.*
import devos.pastelwonderland.Base.Gameplay.Blocks
import devos.pastelwonderland.Base.Gameplay.Items
import devos.pastelwonderland.Base.Gameplay.Portals
import devos.pastelwonderland.Base.Gameplay.ToolsAndArmor
import net.fabricmc.api.ModInitializer
import net.fabricmc.loader.api.FabricLoader


class PastelWonderland : ModInitializer {
    // maybe one day, tater will be a thing here again, no promises.
    // it's been months since this but i dont think im adding back tater. i still feel heavily discouraged after the first time. i'm sorry.
    // while doing this kotlin rewrite... im thinking about it, albeit, still rly sad ngl.

    // Aye Devin, while it would be nice to add it back, its fine, besides, we could instead add "pineapples" as thats the quilt meme
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
    }
}