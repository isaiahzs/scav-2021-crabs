package testmod.testmod.client.client;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import testmod.testmod.entity.CreeperCrabEntity;

public class CreeperCrabEntityModel extends EntityModel<CreeperCrabEntity> {
    private final ModelPart bone;
    private final ModelPart hislilhand3_r1;
    private final ModelPart bone2;
    private final ModelPart hislilhand6_r1;
    private final ModelPart bb_main;

    public CreeperCrabEntityModel() {
        textureWidth = 16;
        textureHeight = 16;

        bone = new ModelPart(this);
        bone.setPivot(0.0F, 24.0F, 0.0F);


        hislilhand3_r1 = new ModelPart(this);
        hislilhand3_r1.setPivot(0.0F, 0.0F, 0.0F);
        bone.addChild(hislilhand3_r1);
        setRotationAngle(hislilhand3_r1, -0.2182F, 0.8727F, 0.0F);
        hislilhand3_r1.setTextureOffset(0, 0).addCuboid(1.0F, -6.0F, 6.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        hislilhand3_r1.setTextureOffset(0, 0).addCuboid(0.0F, -5.0F, 6.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        hislilhand3_r1.setTextureOffset(0, 0).addCuboid(0.0F, -6.0F, 0.0F, 2.0F, 2.0F, 7.0F, 0.0F, false);

        bone2 = new ModelPart(this);
        bone2.setPivot(0.0F, 24.0F, 0.0F);


        hislilhand6_r1 = new ModelPart(this);
        hislilhand6_r1.setPivot(0.0F, 0.0F, 0.0F);
        bone2.addChild(hislilhand6_r1);
        setRotationAngle(hislilhand6_r1, -0.2182F, -0.8727F, 0.0F);
        hislilhand6_r1.setTextureOffset(0, 0).addCuboid(-1.0F, -5.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        hislilhand6_r1.setTextureOffset(0, 0).addCuboid(-2.0F, -6.0F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        hislilhand6_r1.setTextureOffset(0, 0).addCuboid(-2.0F, -6.0F, 0.0F, 2.0F, 2.0F, 7.0F, 0.0F, false);

        bb_main = new ModelPart(this);
        bb_main.setPivot(0.0F, 24.0F, 0.0F);
        bb_main.setTextureOffset(0, 0).addCuboid(-2.0F, -4.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
        bb_main.setTextureOffset(0, 0).addCuboid(1.0F, -2.0F, 1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        bb_main.setTextureOffset(0, 0).addCuboid(-3.0F, -2.0F, 1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        bb_main.setTextureOffset(0, 0).addCuboid(1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        bb_main.setTextureOffset(0, 0).addCuboid(-3.0F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        bb_main.setTextureOffset(0, 0).addCuboid(-4.0F, -8.0F, -4.0F, 8.0F, 4.0F, 8.0F, 0.0F, false);
        bb_main.setTextureOffset(0, 12).addCuboid(-4.0F, -8.0F, 4.0F, 8.0F, 4.0F, 0.0F, 0.0F, false);
    }

    @Override
    public void setAngles(CreeperCrabEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha){
        bone.render(matrices, vertices, light, overlay);
        bone2.render(matrices, vertices, light, overlay);
        bb_main.render(matrices, vertices, light, overlay);
    }

    public void setRotationAngle(ModelPart modelRenderer, float x, float y, float z) {
        modelRenderer.pitch = x;
        modelRenderer.yaw = y;
        modelRenderer.roll = z;
    }
}
