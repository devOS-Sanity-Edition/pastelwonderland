// Made with Blockbench 3.7.5
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports

package dev.hiitsdevin.pastelwonderland.Entities.Tater.Models;

import dev.hiitsdevin.pastelwonderland.Entities.Mallards.MallardEntity;
import dev.hiitsdevin.pastelwonderland.Entities.Tater.TaterEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class TaterModel extends EntityModel<TaterEntity> {
private final ModelPart bb_main;
public TaterModel() {
		textureWidth = 32;
		textureHeight = 32;
		bb_main = new ModelPart(this);
		bb_main.setPivot(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addCuboid(-4.0F, -14.0F, -4.0F, 8.0F, 14.0F, 8.0F, 0.0F, false);
}
	@Override
	public void setAngles(TaterEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

	}
@Override
public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
}
public void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
}

	}