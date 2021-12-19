package community.devos.nautical.pastelwonderland.forge;

import community.devos.nautical.pastelwonderland.PastelWonderland;
import community.devos.nautical.pastelwonderland.PastelWonderlandClient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = PastelWonderland.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PastelWonderlandForgeClient {
    @SubscribeEvent
    public static void onInitializeClient(final FMLClientSetupEvent event) {
        PastelWonderlandClient.init();
    }
}
