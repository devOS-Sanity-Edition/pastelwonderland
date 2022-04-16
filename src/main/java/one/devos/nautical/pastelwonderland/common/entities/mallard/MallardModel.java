package one.devos.nautical.pastelwonderland.common.entities.mallard;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

import static one.devos.nautical.pastelwonderland.Pastelwonderland.MOD_ID;

public class MallardModel<T extends LivingEntity> extends EntityModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(MOD_ID, "mallard"), "mallard");
    private final ModelPart head;
    private final ModelPart body;
    private final ModelPart tail;
    private final ModelPart left_wing;
    private final ModelPart right_wing;
    private final ModelPart left_leg;
    private final ModelPart right_leg;

    public MallardModel(ModelPart root) {
        this.head = root.getChild("head");
        this.body = root.getChild("body");
        this.tail = root.getChild("tail");
        this.left_wing = root.getChild("left_wing");
        this.right_wing = root.getChild("right_wing");
        this.left_leg = root.getChild("left_leg");
        this.right_leg = root.getChild("right_leg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.0F, -2.5F, 0.2618F, 0.0F, 0.0F));

        PartDefinition bone8 = head.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(12, 0).addBox(-0.5F, -0.2358F, -1.9484F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.2358F, -3.1076F, -0.0873F, 0.0F, 0.0F));

        PartDefinition bone9 = head.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(11, 14).addBox(-1.5F, -5.6099F, -3.8527F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.1752F, -3.3695F, -1.0472F, 0.0F, 0.0F));

        PartDefinition bone2 = head.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(-1.0F, 16.0F, -2.0F));

        PartDefinition bone = body.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(12, 20).addBox(0.0F, -0.4292F, -2.26F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

        PartDefinition bone4 = body.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -1.7917F, -0.7066F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.0F, 2.5F, 0.0873F, 0.0F, 0.0F));

        PartDefinition bone5 = body.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(13, 5).addBox(-2.0F, -1.7026F, -3.3124F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.0F, 2.5F, -0.0873F, 0.0F, 0.0F));

        PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 17).addBox(-2.0F, -1.5434F, 2.9161F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 19.25F, 0.5F, 0.2618F, 0.0F, 0.0F));

        PartDefinition left_wing = partdefinition.addOrReplaceChild("left_wing", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 17.5F, -1.0F));

        PartDefinition right_wing = partdefinition.addOrReplaceChild("right_wing", CubeListBuilder.create().texOffs(0, 8).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.5F, 17.5F, -1.0F));

        PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 0).addBox(0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 21.0F, 1.0F));

        PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 21.0F, 1.0F));

        return LayerDefinition.create(meshdefinition, 32, 32);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.xRot = headPitch * 0.017453292F;
        this.head.yRot = netHeadYaw * 0.017453292F;
        this.right_leg.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.left_leg.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * 1.4F * limbSwingAmount;
        if (entity.isInWater()) {
            this.right_leg.xRot = 1.309F;
            this.left_leg.xRot = 1.309F;
            if (entity.hurtTime > 0) {
                this.right_wing.zRot = (float) ((Mth.abs(Mth.cos(ageInTicks))*1.5) * entity.hurtTime / 7.5);
                this.left_wing.zRot = (float) (-(Mth.abs(Mth.cos(ageInTicks))*1.5) * entity.hurtTime / 7.5);
            } else {
                this.right_wing.zRot = 0F;
                this.left_wing.zRot = 0F;
            }
        } else {
            this.right_leg.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
            this.left_leg.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * 1.4F * limbSwingAmount;
            if (!entity.isOnGround()) {
                this.right_wing.zRot =  (float) (Mth.abs(Mth.cos(ageInTicks))*1.5);
                this.left_wing.zRot = (float) (-Mth.abs(Mth.cos(ageInTicks))*1.5);
            } else {
                this.right_wing.zRot = 0.0F;
                this.left_wing.zRot = 0.0F;
            }
        }
//        if (entity.isAggressive) {
//            this.right_wing.yRot = 1.309F + Mth.cos(limbSwing * 5F) * 1.4F * limbSwingAmount;
//            this.left_wing.yRot = -1.309F - Mth.cos(limbSwing * 5F) * 1.4F * limbSwingAmount;
//            this.head.xRot = headPitch * 0.017453292F + 1.309F;
//        }
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        head.render(poseStack, buffer, packedLight, packedOverlay);
        body.render(poseStack, buffer, packedLight, packedOverlay);
        tail.render(poseStack, buffer, packedLight, packedOverlay);
        left_wing.render(poseStack, buffer, packedLight, packedOverlay);
        right_wing.render(poseStack, buffer, packedLight, packedOverlay);
        left_leg.render(poseStack, buffer, packedLight, packedOverlay);
        right_leg.render(poseStack, buffer, packedLight, packedOverlay);
    }
}