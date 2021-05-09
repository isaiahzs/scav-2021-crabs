package testmod.testmod.client.client;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import testmod.testmod.entity.CreeperCrabEntity;
import testmod.testmod.entity.CubeEntity;

public class CreeperCrabEntityRenderer extends MobEntityRenderer<CreeperCrabEntity, CreeperCrabEntityModel> {

    public CreeperCrabEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new CreeperCrabEntityModel(), 0.5f);
    }

    @Override
    public Identifier getTexture(CreeperCrabEntity entity) {
        return new Identifier("crabmods", "textures/entity/craebber/craebber.png");
    }
}
