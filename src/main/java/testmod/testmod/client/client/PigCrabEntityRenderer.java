package testmod.testmod.client.client;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import testmod.testmod.entity.CubeEntity;
import testmod.testmod.entity.PigCrabEntity;

public class PigCrabEntityRenderer extends MobEntityRenderer<PigCrabEntity, PigCrabEntityModel> {

    public PigCrabEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new PigCrabEntityModel(), 0.5f);
    }

    @Override
    public Identifier getTexture(PigCrabEntity entity) {
        return new Identifier("crabmods", "textures/entity/pigcrab/pigcrab.png");
    }
}
