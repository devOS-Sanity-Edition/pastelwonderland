// 🦀 CRAB IN THE CODE 🦀
// live laugh taze
// wait why do i hear a taser coming towards me-

package dev.hiitsdevin.pastelwonderland;

import net.fabricmc.api.ModInitializer;


public class PastelWonderland implements ModInitializer {

    // for the text render. be sure to comment out both HudRenderCallsbacks when you're not in a dev env.
    public static final String PrototypePastelVersion = "Pastel Wonderland - Development Build v0.0.2";
    public static final String PrototypePastelDistribution = "If this build is not public please do not redistribute it!";
    public static final String MOD_ID = "pastelwonderland";

    @Override
    public final void onInitialize() {
        // modularity who
        // each separate class for organizational reasons, this is great
        Blocks.init();
        DevDisclaimer.init();
        Items.init();
        Portals.init();
        //OreGen.init();
    }
}
