package community.devos.nautical.pastelwonderland.util;

import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

import static community.devos.nautical.pastelwonderland.Pastelwonderland.MOD_NAME;

public class LoggerHelper {

    //Call it stupid to have this, it seems kinda fun to have though, I want to mess around with actually logging some things, plus might help when worldgen comes around.
    public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);

    public static void log(String level, String message) {
        if(Objects.equals(level, "info")) {
            LOGGER.info(message);
        }
        else if(Objects.equals(level, "warn")) {
            LOGGER.warn(message);
        }
        else if(Objects.equals(level, "error")) {
            LOGGER.error(message);
        }
        else if(Objects.equals(level, "dev_info") && FabricLoader.getInstance().isDevelopmentEnvironment()) {
            LOGGER.info("[Dev Env] " + message);
        }
        else {
            LOGGER.info(message);
        }
    }
}
