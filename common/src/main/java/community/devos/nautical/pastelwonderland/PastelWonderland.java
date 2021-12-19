package community.devos.nautical.pastelwonderland;

import community.devos.nautical.pastelwonderland.common.Blocks;
import community.devos.nautical.pastelwonderland.common.ItemGroups;
import community.devos.nautical.pastelwonderland.common.Items;
import community.devos.nautical.pastelwonderland.common.entities.Entity;
import community.devos.nautical.pastelwonderland.common.entities.mallard.MallardEntity;
import dev.architectury.core.RegistryEntry;
import dev.architectury.networking.NetworkManager;
import dev.architectury.platform.Platform;
import dev.architectury.registry.level.entity.EntityRendererRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.client.Minecraft;
import net.minecraft.core.Registry;
import net.minecraft.network.protocol.Packet;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.SpawnGroupData;


public class PastelWonderland {
    public static final String MOD_ID = "pastelwonderland";
    public static final String VERSION = "0.1.0";
    public static final boolean devEnv = Platform.isDevelopmentEnvironment();

    public static String PastelWonderlandVersion = "Pastel Wonderland - Dev Environment - Build: " + VERSION;
    public static String PastelWonderlandViewDisclaimer = "What you see here may not be representative of the final build!";
    public static String PastelWonderlandFPS = "Game FPS: " + Minecraft.getInstance().fpsString;

    public static void init() {
        Items.init();
        Blocks.init();
        Entity.init();
        ItemGroups.init();
        PastelWonderlandClient.init();


        
        System.out.println(ExampleExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
