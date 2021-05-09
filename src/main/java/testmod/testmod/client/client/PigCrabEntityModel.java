package testmod.testmod.client.client;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import testmod.testmod.entity.PigCrabEntity;

public class PigCrabEntityModel extends EntityModel<PigCrabEntity> {
    private final ModelPart bb_main;
    private final ModelPart cube_r1;
    private final ModelPart cube_r2;
    private final ModelPart cube_r3;
    private final ModelPart cube_r4;
    private final ModelPart cube_r5;

    public PigCrabEntityModel() {
        textureWidth = 64;
        textureHeight = 32;

        bb_main = new ModelPart(this);
        bb_main.setPivot(0.0F, 24.0F, 0.0F);
        bb_main.setTextureOffset(0, 0).addCuboid(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
        bb_main.setTextureOffset(24, 27).addCuboid(5.0F, 7.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(24, 27).addCuboid(5.0F, 7.0F, 5.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(24, 27).addCuboid(5.0F, 7.0F, 10.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(24, 27).addCuboid(-6.0F, 7.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(24, 27).addCuboid(-6.0F, 7.0F, 5.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(24, 27).addCuboid(-6.0F, 7.0F, 10.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(16, 16).addCuboid(-3.0F, 0.0F, -9.0F, 6.0F, 4.0F, 0.0F, 0.0F, false);

        cube_r1 = new ModelPart(this);
        cube_r1.setPivot(13.0F, 3.0F, -8.0F);
        bb_main.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        cube_r1.setTextureOffset(52, 0).addCuboid(-1.0F, -2.5F, -2.0F, 2.0F, 3.0F, 4.0F, 0.0F, false);

        cube_r2 = new ModelPart(this);
        cube_r2.setPivot(-13.0F, 3.0F, -10.0F);
        bb_main.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.0F, -1.5708F);
        cube_r2.setTextureOffset(0, 18).addCuboid(-2.0F, -2.0F, -4.0F, 4.0F, 6.0F, 8.0F, 0.0F, false);

        cube_r3 = new ModelPart(this);
        cube_r3.setPivot(0.0F, 0.0F, 0.0F);
        bb_main.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, -0.5236F, -3.1416F);
        cube_r3.setTextureOffset(24, 0).addCuboid(-14.0F, -4.0F, 0.0F, 9.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r4 = new ModelPart(this);
        cube_r4.setPivot(0.0F, 0.0F, 0.0F);
        bb_main.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, -0.5236F, 0.0F);
        cube_r4.setTextureOffset(24, 0).addCuboid(-14.0F, 2.0F, 0.0F, 9.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r5 = new ModelPart(this);
        cube_r5.setPivot(0.0F, 0.0F, 0.0F);
        bb_main.addChild(cube_r5);
        setRotationAngle(cube_r5, 1.5708F, 0.0F, 0.0F);
        cube_r5.setTextureOffset(28, 8).addCuboid(-5.0F, -3.0F, -7.0F, 10.0F, 16.0F, 8.0F, 0.0F, false);
    }

    @Override
    public void setAngles(PigCrabEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha){
        bb_main.render(matrices, vertices, light, overlay);
    }

    public void setRotationAngle(ModelPart modelRenderer, float x, float y, float z) {
        modelRenderer.pitch = x;
        modelRenderer.yaw = y;
        modelRenderer.roll = z;
    }
}
