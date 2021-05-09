package testmod.testmod.client.client;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import testmod.testmod.entity.PigCrabEntity;
import testmod.testmod.entity.VillagerCrabEntity;

public class VillagerCrabEntityRenderer extends MobEntityRenderer<VillagerCrabEntity, VillagerCrabEntityModel> {

    public VillagerCrabEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new VillagerCrabEntityModel(), 0.5f);
    }

    @Override
    public Identifier getTexture(VillagerCrabEntity entity) {
        return new Identifier("crabmods", "textures/entity/crabbager/crabbager.png");
    }
}
