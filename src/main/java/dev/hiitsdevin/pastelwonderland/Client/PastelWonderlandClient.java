package dev.hiitsdevin.pastelwonderland.Client;

import dev.hiitsdevin.pastelwonderland.Base.Client.Transparency;
import dev.hiitsdevin.pastelwonderland.Entities.Mallards.MallardRenderer;
import dev.hiitsdevin.pastelwonderland.PastelWonderland;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

//unused. turned out to be useless bc vanilla was able to render the leaves just fine lol
//do we want to remove this? maybe. -devin
@Environment(EnvType.CLIENT)
public class PastelWonderlandClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.INSTANCE.register(PastelWonderland.MALLARD, (dispatcher, context) -> {
            return new MallardRenderer(dispatcher);
        });

        //Transparency.init();
    }
}