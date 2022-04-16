package one.devos.nautical.pastelwonderland.common.entities.mallard;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

import static one.devos.nautical.pastelwonderland.Pastelwonderland.MOD_ID;

public class MallardRenderer extends MobRenderer<MallardEntity, net.minecraft.client.model.EntityModel<one.devos.nautical.pastelwonderland.common.entities.mallard.MallardEntity>> {
    public MallardRenderer(EntityRendererProvider.Context context) {
        super(context, new MallardModel(context.bakeLayer(MallardModel.LAYER_LOCATION)), 0.25f);
    }


    @Override
    public ResourceLocation getTextureLocation(MallardEntity entity) {
//        return new ResourceLocation(MOD_ID, "textures/entity/mallard/pallard.png");
        if (false) {
            if (!entity.isBaby()) {
                if (entity.getVariant() == 1) {
                    return new ResourceLocation(MOD_ID, "textures/entity/mallard/mallard.png");
                } else {
                    return new ResourceLocation(MOD_ID, "textures/entity/mallard/mallady.png");
                }
            } else {
                return new ResourceLocation(MOD_ID, "textures/entity/mallard/mababy.png");
            }
        } else {
            if (!entity.isBaby()) {
                if (entity.getVariant() == 1) {
                    return new ResourceLocation(MOD_ID, "textures/entity/mallard/pallard.png");
                } else {
                    return new ResourceLocation(MOD_ID, "textures/entity/mallard/pallady.png");
                }
            } else {
                return new ResourceLocation(MOD_ID, "textures/entity/mallard/pababy.png");
            }
        }
    }
}
