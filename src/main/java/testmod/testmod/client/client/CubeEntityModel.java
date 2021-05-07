package testmod.testmod.client.client;

import net.minecraft.client.model.ModelPart;
import testmod.testmod.entity.CubeEntity;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class CubeEntityModel extends EntityModel<CubeEntity> {
    private final ModelPart bb_main;
    private final ModelPart cube_r1;
    private final ModelPart cube_r2;
    private final ModelPart cube_r3;
    private final ModelPart cube_r4;
    private final ModelPart cube_r5;
    private final ModelPart cube_r6;

    public CubeEntityModel() {
        textureWidth = 16;
        textureHeight = 16;

        bb_main = new ModelPart(this);
        bb_main.setPivot(0.0F, 24.0F, 0.0F);
        bb_main.setTextureOffset(0, 0).addCuboid(-5.0F, -1.0F, -4.0F, 11.0F, 1.0F, 8.0F, 0.0F, false);
        bb_main.setTextureOffset(0, 0).addCuboid(-6.0F, -3.0F, -3.0F, 4.0F, 3.0F, 6.0F, 0.0F, false);
        bb_main.setTextureOffset(0, 0).addCuboid(1.0F, -1.0F, 3.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        bb_main.setTextureOffset(0, 0).addCuboid(1.0F, -1.0F, -7.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

        cube_r1 = new ModelPart(this);
        cube_r1.setPivot(0.0F, 2.0F, -3.0F);
        bb_main.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.2618F, 0.0F);
        cube_r1.setTextureOffset(0, 0).addCuboid(-12.0F, -5.0F, -4.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r2 = new ModelPart(this);
        cube_r2.setPivot(0.0F, 0.0F, -3.0F);
        bb_main.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, -0.2618F, 0.3491F);
        cube_r2.setTextureOffset(0, 0).addCuboid(-9.0F, 0.0F, 0.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r3 = new ModelPart(this);
        cube_r3.setPivot(0.0F, 0.0F, 3.0F);
        bb_main.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 0.2618F, 0.3491F);
        cube_r3.setTextureOffset(0, 0).addCuboid(-9.0F, 0.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r4 = new ModelPart(this);
        cube_r4.setPivot(0.0F, 2.0F, 3.0F);
        bb_main.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, -0.2618F, 0.0F);
        cube_r4.setTextureOffset(0, 0).addCuboid(-12.0F, -5.0F, 3.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r5 = new ModelPart(this);
        cube_r5.setPivot(0.0F, 0.0F, 3.0F);
        bb_main.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 0.1309F, 0.0F);
        cube_r5.setTextureOffset(0, 0).addCuboid(0.0F, -1.0F, -10.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        cube_r6 = new ModelPart(this);
        cube_r6.setPivot(0.0F, 0.0F, 3.0F);
        bb_main.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, -0.3054F, 0.0F);
        cube_r6.setTextureOffset(0, 0).addCuboid(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
    }

    @Override
    public void setAngles(CubeEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha){
        bb_main.render(matrices, vertices, light, overlay);
    }

    public void setRotationAngle(ModelPart modelPart, float x, float y, float z) {
        modelPart.pitch = x;
        modelPart.yaw = y;
        modelPart.roll = z;
    }
}


/*public class CubeEntityModel extends EntityModel<CubeEntity> {

    private final ModelPart base;

    public CubeEntityModel() {
        this.textureHeight = 64;
        this.textureWidth = 64;

        base = new ModelPart(this, 0, 0);
        base.addCuboid(-6, -6, -6, 12, 12, 12);
    }

    @Override
    public void setAngles(CubeEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        // translate model down
        matrices.translate(0, 1.125, 0);

        // render cube
        base.render(matrices, vertices, light, overlay);
    }
}*/