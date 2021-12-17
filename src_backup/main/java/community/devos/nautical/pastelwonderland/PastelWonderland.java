package community.devos.nautical.pastelwonderland;

import com.mojang.authlib.minecraft.client.MinecraftClient;
import community.devos.nautical.pastelwonderland.common.Blocks;
import community.devos.nautical.pastelwonderland.common.Items;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.Minecraft;

public class PastelWonderland implements ModInitializer {
    public static final String MOD_ID = "pastelwonderland";
    public static final String VERSION = FabricLoader.getInstance().getModContainer(MOD_ID).get().getMetadata().getVersion().toString(); // for later
    public static String overlayPastelWonderlandVersion = "Pastel Wonderland - Dev Build: " + VERSION;
    public static String overlayPastelWonderlandDisclaimer = "What you see here may not be representative of the final build!";
    public static String overlayPastelWonderlandFPSDevelopment = "Game FPS: " + Minecraft.getInstance().fpsString;


    @Override
    public final void onInitialize() {
        Blocks.init();
        Items.init();
    }
}
