package devos.pastelwonderland.Base.Gameplay

import devos.pastelwonderland.PastelWonderland.Companion.PW_MOD_ID
import net.kyrptonaught.customportalapi.CustomPortalApiRegistry
import net.minecraft.util.Identifier

object Portals {
    fun init() {
        // registers portal ability, probably more blocks soon, idk.
        CustomPortalApiRegistry.addPortal(Blocks.RED, Identifier(PW_MOD_ID, "pastel_dim"), 253, 174, 187)
        CustomPortalApiRegistry.addPortal(Blocks.ORANGE, Identifier(PW_MOD_ID, "pastel_dim"), 255, 187, 164)
        CustomPortalApiRegistry.addPortal(Blocks.YELLOW, Identifier(PW_MOD_ID, "pastel_dim"), 243, 241, 161)
        CustomPortalApiRegistry.addPortal(Blocks.GREEN, Identifier(PW_MOD_ID, "pastel_dim"), 109, 213, 195)
        CustomPortalApiRegistry.addPortal(Blocks.BLUE, Identifier(PW_MOD_ID, "pastel_dim"), 116, 209, 234)
        CustomPortalApiRegistry.addPortal(Blocks.PURPLE, Identifier(PW_MOD_ID, "pastel_dim"), 191, 155, 222)
        CustomPortalApiRegistry.addPortal(Blocks.MAGENTA, Identifier(PW_MOD_ID, "pastel_dim"), 241, 178, 220)
        CustomPortalApiRegistry.addPortal(Blocks.BLACK, Identifier(PW_MOD_ID, "pastel_dim"), 63, 63, 63)
        CustomPortalApiRegistry.addPortal(Blocks.GRAY, Identifier(PW_MOD_ID, "pastel_dim"), 191, 191, 191)
        CustomPortalApiRegistry.addPortal(Blocks.BROWN, Identifier(PW_MOD_ID, "pastel_dim"), 191, 68, 20)
    }
}