package dev.hiitsdevin.pastelwonderland.Base;

import net.kyrptonaught.customportalapi.CustomPortalApiRegistry;
import net.minecraft.util.Identifier;
import static dev.hiitsdevin.pastelwonderland.PastelWonderland.MOD_ID;

public class Portals {
    public static void init() {
        // registers portal ability, probably more blocks soon, idk.
        CustomPortalApiRegistry.addPortal(Blocks.RED, new Identifier(MOD_ID, "pastel_dim"), 253, 174, 187);
        CustomPortalApiRegistry.addPortal(Blocks.ORANGE, new Identifier(MOD_ID, "pastel_dim"), 255, 187, 164);
        CustomPortalApiRegistry.addPortal(Blocks.YELLOW, new Identifier(MOD_ID, "pastel_dim"), 243, 241, 161);
        CustomPortalApiRegistry.addPortal(Blocks.GREEN, new Identifier(MOD_ID, "pastel_dim"), 109, 213, 195);
        CustomPortalApiRegistry.addPortal(Blocks.BLUE, new Identifier(MOD_ID, "pastel_dim"), 116, 209, 234);
        CustomPortalApiRegistry.addPortal(Blocks.PURPLE, new Identifier(MOD_ID, "pastel_dim"), 191, 155, 222);
        CustomPortalApiRegistry.addPortal(Blocks.MAGENTA, new Identifier(MOD_ID, "pastel_dim"), 241, 178, 220);
        CustomPortalApiRegistry.addPortal(Blocks.BLACK, new Identifier(MOD_ID, "pastel_dim"), 63,  63,  63);
        CustomPortalApiRegistry.addPortal(Blocks.GRAY, new Identifier(MOD_ID, "pastel_dim"), 191, 191, 191);
        CustomPortalApiRegistry.addPortal(Blocks.BROWN, new Identifier(MOD_ID, "pastel_dim"), 191, 68, 20);
    }
}
