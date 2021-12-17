package commmunity.devos.nautical.pastelwonderland.fabric;

import commmunity.devos.nautical.pastelwonderland.PastelWonderland;
import net.fabricmc.api.ModInitializer;

public class PastelWonderlandFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        PastelWonderland.init();
    }
}
