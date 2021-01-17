// 🦀 CRAB IN THE CODE 🦀
// live laugh taze
// wait why do i hear a taser coming towards me-

package dev.hiitsdevin.devinsuselessmod;

import net.fabricmc.api.ModInitializer;


public class Devinsuselessmod implements ModInitializer {

    // for the text render. be sure to comment out both HudRenderCallsbacks when you're not in a dev env.
    public static final String PrototypePastelVersion = "Devin's Useless Mod - Development Build v0.0.1";
    public static final String PrototypePastelDistribution = "If this build isn't public, and you got it from Devin, please do not redistribute!";

    @Override
    public void onInitialize() {
        // modularity who
        // each separate class for organizational reasons, this is great
        Blocks.init();
        DevDisclaimer.init();
        Items.init();
        Portals.init();
    }
}
