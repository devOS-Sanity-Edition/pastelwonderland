package community.devos.nautical.pastelwonderland.forge;

import dev.architectury.platform.forge.EventBuses;
import community.devos.nautical.pastelwonderland.PastelWonderland;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(PastelWonderland.MOD_ID)
public class PastelWonderlandForge {
    public PastelWonderlandForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(PastelWonderland.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        PastelWonderland.init();
    }
}
