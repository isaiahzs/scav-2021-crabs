package testmod.testmod.client.client;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import testmod.testmod.entity.VillagerCrabEntity;

public class VillagerCrabEntityModel extends EntityModel<VillagerCrabEntity> {
    private final ModelPart bone;
    private final ModelPart otherhumerus_r1;
    private final ModelPart bb_main;

    public VillagerCrabEntityModel() {
        textureWidth = 32;
        textureHeight = 32;

        bone = new ModelPart(this);
        bone.setPivot(0.0F, 24.0F, 0.0F);


        otherhumerus_r1 = new ModelPart(this);
        otherhumerus_r1.setPivot(0.0F, 0.0F, 0.0F);
        bone.addChild(otherhumerus_r1);
        setRotationAngle(otherhumerus_r1, -0.9163F, 0.0F, 0.0F);
        otherhumerus_r1.setTextureOffset(12, 19).addCuboid(6.0F, -8.0F, -11.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
        otherhumerus_r1.setTextureOffset(14, 3).addCuboid(-8.0F, -8.0F, -11.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
        otherhumerus_r1.setTextureOffset(29, 13).addCuboid(6.0F, -2.0F, -11.0F, -12.0F, 2.0F, 2.0F, 0.0F, false);

        bb_main = new ModelPart(this);
        bb_main.setPivot(0.0F, 24.0F, 0.0F);
        bb_main.setTextureOffset(3, 21).addCuboid(-4.0F, -8.0F, -2.0F, 8.0F, 5.0F, 4.0F, 0.0F, false);
        bb_main.setTextureOffset(0, 9).addCuboid(-6.0F, -14.0F, -3.0F, 12.0F, 6.0F, 6.0F, 0.0F, false);
        bb_main.setTextureOffset(8, 16).addCuboid(-3.0F, -14.0F, -3.0F, 6.0F, 4.0F, 6.0F, 0.0F, false);
        bb_main.setTextureOffset(8, 5).addCuboid(3.0F, -14.0F, -4.0F, -6.0F, 3.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(0, 0).addCuboid(-3.0F, -3.0F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(0, 0).addCuboid(2.0F, -3.0F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(16, 28).addCuboid(-4.0F, -3.0F, -2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(0, 0).addCuboid(-2.0F, -3.0F, -2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(28, 28).addCuboid(1.0F, -3.0F, -2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        bb_main.setTextureOffset(0, 0).addCuboid(3.0F, -3.0F, -2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
    }

    @Override
    public void setAngles(VillagerCrabEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha){
        bone.render(matrices, vertices, light, overlay);
        bb_main.render(matrices, vertices, light, overlay);
    }

    public void setRotationAngle(ModelPart modelRenderer, float x, float y, float z) {
        modelRenderer.pitch = x;
        modelRenderer.yaw = y;
        modelRenderer.roll = z;
    }
}
