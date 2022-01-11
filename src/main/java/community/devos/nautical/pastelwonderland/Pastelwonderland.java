package community.devos.nautical.pastelwonderland;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;

import static community.devos.nautical.pastelwonderland.util.LoggerHelper.log;


public class Pastelwonderland implements ModInitializer {

    public static final String MOD_ID = "pastelwonderland";
    public static final String VERSION = FabricLoader.getInstance().getModContainer(MOD_ID).get().getMetadata().getVersion().getFriendlyString();
    public static final String MOD_NAME = FabricLoader.getInstance().getModContainer(MOD_ID).get().getMetadata().getName();



    @Override
    public void onInitialize() {
        log("info", "Pastel Wonderland initialzing");
        log("dev_info", "Pastel Wonderland Dev Env on Version: " + VERSION);
    }
}
