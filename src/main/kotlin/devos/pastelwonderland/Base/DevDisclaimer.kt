package devos.pastelwonderland.Base

import devos.pastelwonderland.PastelWonderland
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback
import net.fabricmc.fabric.api.event.client.ClientTickCallback
import net.minecraft.client.MinecraftClient
import net.minecraft.client.util.math.MatrixStack


object DevDisclaimer {
        fun init() {
                // disclaimer text only shows in dev environment as of jan 27th. production build doesnt have it.

                var PastelWonderlandVersion = "Pastel Wonderland: Kotlin Rewrite - Dev Build: ${PastelWonderland.VERSION}"
                var PastelWonderlandViewDisclaimer = "What you see here may not be representative of the final build! Screw you if you dont like this disclaimer."
                var PastelWonderlandFPSDevelopment = "Game FPS: " + MinecraftClient.getInstance().fpsDebugString

                ClientTickCallback.EVENT.register(ClientTickCallback { client: MinecraftClient? ->
                        if (MinecraftClient.getInstance().options.debugEnabled) {
                                PastelWonderlandVersion = ""
                                PastelWonderlandViewDisclaimer = ""
                                PastelWonderlandFPSDevelopment = ""
                        }
                        else {
                                PastelWonderlandVersion = "Pastel Wonderland: Kotlin Rewrite - Dev Build: " + PastelWonderland.VERSION
                                PastelWonderlandViewDisclaimer = "What you see here may not be representative of the final build!"
                                PastelWonderlandFPSDevelopment = "Game FPS: " + MinecraftClient.getInstance().fpsDebugString
                        }
                })

                if (net.fabricmc.loader.FabricLoader.INSTANCE.isDevelopmentEnvironment()) {
                        HudRenderCallback.EVENT.register(HudRenderCallback { matrices: MatrixStack?, delta: Float ->
                                MinecraftClient.getInstance().textRenderer.drawWithShadow(
                                        matrices,
                                        PastelWonderlandVersion,
                                        1f,
                                        1f,
                                        0xFFFFFF
                                ) // shoot me where it hurts most please.
                        })

                        // Game FPS
                        HudRenderCallback.EVENT.register(HudRenderCallback { matrices: MatrixStack?, delta: Float ->
                                MinecraftClient.getInstance().textRenderer.drawWithShadow(matrices, PastelWonderlandFPSDevelopment, 1f, 10f, 0xFFFFFF)
                        })


                        // renders Distribution text
                        HudRenderCallback.EVENT.register(HudRenderCallback { matrices: MatrixStack?, delta: Float ->
                                MinecraftClient.getInstance().textRenderer.drawWithShadow(matrices, PastelWonderlandViewDisclaimer, 1f, 20f, 0xFF4040)
                        })
                }
        }
}
// This class would only be seen by developers, tiem to copy and paste Red Heart by Haachama
// Hi how are you? Are you calling up my phone? Baby tel-
// You know know what fuck that.