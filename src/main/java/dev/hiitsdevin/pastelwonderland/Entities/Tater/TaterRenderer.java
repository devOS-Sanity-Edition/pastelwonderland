package dev.hiitsdevin.pastelwonderland.Entities.Tater;

import dev.hiitsdevin.pastelwonderland.Entities.Tater.Models.TaterModel;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class TaterRenderer extends MobEntityRenderer<TaterEntity, TaterModel> {
    public TaterRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new TaterModel(), 0.5f);
    }

    @Override
    public Identifier getTexture(TaterEntity entity) {
        return new Identifier("pastelwonderland", "textures/entity/tater/tater.png");
    }
}
