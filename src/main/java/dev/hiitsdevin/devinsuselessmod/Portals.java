package dev.hiitsdevin.devinsuselessmod;

import net.fabricmc.api.ModInitializer;
import net.kyrptonaught.customportalapi.CustomPortalApiRegistry;
import net.minecraft.util.Identifier;

public class Portals {
    public static void init() {
        // registers portal ability, probably more blocks soon, idk.
        CustomPortalApiRegistry.addPortal(Blocks.RED, new Identifier("devin", "devin"), 253,174,187);
        CustomPortalApiRegistry.addPortal(Blocks.ORANGE, new Identifier("devin", "devin"), 255,187,164);
        CustomPortalApiRegistry.addPortal(Blocks.YELLOW, new Identifier("devin", "devin"), 243,241,161);
        CustomPortalApiRegistry.addPortal(Blocks.GREEN, new Identifier("devin", "devin"), 109,213,195);
        CustomPortalApiRegistry.addPortal(Blocks.BLUE, new Identifier("devin", "devin"), 116,209,234);
        CustomPortalApiRegistry.addPortal(Blocks.PURPLE, new Identifier("devin", "devin"), 191,155,222);
        CustomPortalApiRegistry.addPortal(Blocks.MAGENTA, new Identifier("devin", "devin"), 241,178,220);
        CustomPortalApiRegistry.addPortal(Blocks.BLACK, new Identifier("devin", "devin"), 63, 63, 63);
        CustomPortalApiRegistry.addPortal(Blocks.GRAY, new Identifier("devin", "devin"), 191,191,191);

        // just for the hell of it.
        CustomPortalApiRegistry.addPortal(net.minecraft.block.Blocks.CRYING_OBSIDIAN, new Identifier("minecraft", "the_nether"), 83,45,182);

        // tested to see if this worked..
        // spoiler alert: it did. 🎉
        CustomPortalApiRegistry.addPortal(Blocks.MICHAEL_REEVES, new Identifier("devin", "devin"), 255,255,255);
    }
}
