package dev.hiitsdevin.pastelwonderland.Entities.Mallards.Models;

import dev.hiitsdevin.pastelwonderland.Entities.Mallards.MallardEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class MallardModel extends EntityModel<MallardEntity> {
    private final ModelPart head;
    private final ModelPart bone8;
    private final ModelPart bone9;
    private final ModelPart bone2;
    private final ModelPart body;
    private final ModelPart bone;
    private final ModelPart bone4;
    private final ModelPart bone5;
    private final ModelPart tail;
    private final ModelPart left_wing;
    private final ModelPart right_wing;
    private final ModelPart left_leg;
    private final ModelPart right_leg;
    public MallardModel() {
        textureWidth = 32;
        textureHeight = 32;
        head = new ModelPart(this);
        head.setPivot(0.0F, 16.0F, -2.5F);
        setRotationAngle(head, 0.2618F, 0.0F, 0.0F);


        bone8 = new ModelPart(this);
        bone8.setPivot(-0.5F, -1.2358F, -3.1076F);
        head.addChild(bone8);
        setRotationAngle(bone8, -0.0873F, 0.0F, 0.0F);
        bone8.setTextureOffset(12, 0).addCuboid(-0.5F, -0.2358F, -1.9484F, 2.0F, 1.0F, 3.0F, 0.0F, false);

        bone9 = new ModelPart(this);
        bone9.setPivot(0.0F, 3.1752F, -3.3695F);
        head.addChild(bone9);
        setRotationAngle(bone9, -1.0472F, 0.0F, 0.0F);
        bone9.setTextureOffset(11, 14).addCuboid(-1.5F, -5.6099F, -3.8527F, 3.0F, 3.0F, 3.0F, 0.0F, false);

        bone2 = new ModelPart(this);
        bone2.setPivot(0.0F, 0.0F, 0.0F);
        head.addChild(bone2);


        body = new ModelPart(this);
        body.setPivot(-1.0F, 16.0F, -2.0F);


        bone = new ModelPart(this);
        bone.setPivot(0.0F, 0.0F, 0.0F);
        body.addChild(bone);
        setRotationAngle(bone, 0.2618F, 0.0F, 0.0F);
        bone.setTextureOffset(12, 20).addCuboid(0.0F, -0.4292F, -2.26F, 2.0F, 5.0F, 2.0F, 0.0F, false);

        bone4 = new ModelPart(this);
        bone4.setPivot(1.0F, 3.0F, 2.5F);
        body.addChild(bone4);
        setRotationAngle(bone4, 0.0873F, 0.0F, 0.0F);
        bone4.setTextureOffset(0, 0).addCuboid(-2.0F, -1.7917F, -0.7066F, 4.0F, 4.0F, 4.0F, 0.0F, false);

        bone5 = new ModelPart(this);
        bone5.setPivot(1.0F, 3.0F, 2.5F);
        body.addChild(bone5);
        setRotationAngle(bone5, -0.0873F, 0.0F, 0.0F);
        bone5.setTextureOffset(13, 5).addCuboid(-2.0F, -1.7026F, -3.3124F, 4.0F, 4.0F, 3.0F, 0.0F, false);

        tail = new ModelPart(this);
        tail.setPivot(0.5F, 19.25F, 0.5F);
        setRotationAngle(tail, 0.2618F, 0.0F, 0.0F);
        tail.setTextureOffset(0, 17).addCuboid(-2.0F, -1.5434F, 2.9161F, 3.0F, 3.0F, 3.0F, 0.0F, false);

        left_wing = new ModelPart(this);
        left_wing.setPivot(2.5F, 17.5F, -1.0F);
        left_wing.setTextureOffset(0, 8).addCuboid(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);

        right_wing = new ModelPart(this);
        right_wing.setPivot(-2.5F, 17.5F, -1.0F);
        right_wing.setTextureOffset(0, 8).addCuboid(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 6.0F, 0.0F, true);

        left_leg = new ModelPart(this);
        left_leg.setPivot(0.0F, 21.0F, 1.0F);
        setRotationAngle(left_leg, 1.309F, 0.0F, 0.0F);
        left_leg.setTextureOffset(0, 0).addCuboid(0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        right_leg = new ModelPart(this);
        right_leg.setPivot(0.0F, 21.0F, 1.0F);
        setRotationAngle(right_leg, 1.309F, 0.0F, 0.0F);
        right_leg.setTextureOffset(0, 0).addCuboid(-1.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, true);
    }

    public MallardModel(ModelPart head, ModelPart bone8, ModelPart bone9, ModelPart bone2, ModelPart body, ModelPart bone, ModelPart bone4, ModelPart bone5, ModelPart tail, ModelPart left_wing, ModelPart right_wing, ModelPart left_leg, ModelPart right_leg) {
        this.head = head;
        this.bone8 = bone8;
        this.bone9 = bone9;
        this.bone2 = bone2;
        this.body = body;
        this.bone = bone;
        this.bone4 = bone4;
        this.bone5 = bone5;
        this.tail = tail;
        this.left_wing = left_wing;
        this.right_wing = right_wing;
        this.left_leg = left_leg;
        this.right_leg = right_leg;
    }

    @Override
    public void setAngles(MallardEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }

    @Override
    public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){

        head.render(matrixStack, buffer, packedLight, packedOverlay);
        body.render(matrixStack, buffer, packedLight, packedOverlay);
        tail.render(matrixStack, buffer, packedLight, packedOverlay);
        left_wing.render(matrixStack, buffer, packedLight, packedOverlay);
        right_wing.render(matrixStack, buffer, packedLight, packedOverlay);
        left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
        right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
    }
    public void setRotationAngle(ModelPart bone, float x, float y, float z) {
        bone.pitch = x;
        bone.yaw = y;
        bone.roll = z;
    }
}
