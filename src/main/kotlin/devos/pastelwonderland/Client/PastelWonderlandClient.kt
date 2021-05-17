// this is in every kt file but this rewrite is severely broken, if you can assist, please pull request and compare with main or rewrite branch. i'm so fucking sorry. -devin
// if you get a lot of red lines like shown here: https://cdn.discordapp.com/attachments/839722904676991056/843428635217100840/idea64_trv44LotCK.png
// then yeah that seems about right, again, im so so so sorry :C

package devos.pastelwonderland.Client

import devos.pastelwonderland.PastelWonderland
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.fabricmc.fabric.api.event.client.ClientTickCallback
import net.minecraft.client.MinecraftClient


@Environment(EnvType.CLIENT)
class PastelWonderlandClient : ClientModInitializer {
    override fun onInitializeClient() {
        // bye bye fucko boingo
        // TODO("Not yet implemented")

        repeat(10) {
            print("uwu wats dis owo \n")
        }
    }
}