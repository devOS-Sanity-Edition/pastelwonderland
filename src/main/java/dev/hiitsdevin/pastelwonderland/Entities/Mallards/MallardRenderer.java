package dev.hiitsdevin.pastelwonderland.Entities.Mallards;

import dev.hiitsdevin.pastelwonderland.Entities.Mallards.Models.MallardModel;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import static dev.hiitsdevin.pastelwonderland.PastelWonderland.MOD_ID;

// the amount of shit i have to make for a fucking mob is  a n n o y i n g  m e  -Devin
public class MallardRenderer extends MobEntityRenderer<MallardEntity, MallardModel> {
    public MallardRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new MallardModel(), 0.25f);
    }

    @Override
    public Identifier getTexture(MallardEntity entity) {
        return new Identifier(MOD_ID, "textures/entity/mallard/mallard.png");
    }
}


