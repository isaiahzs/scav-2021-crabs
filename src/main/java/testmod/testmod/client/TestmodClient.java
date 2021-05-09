package testmod.testmod.client;

import testmod.testmod.client.client.CreeperCrabEntityRenderer;
import testmod.testmod.client.client.CubeEntityRenderer;
import testmod.testmod.Testmod;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import testmod.testmod.client.client.PigCrabEntityRenderer;
import testmod.testmod.client.client.VillagerCrabEntityRenderer;

@Environment(EnvType.CLIENT)
public class TestmodClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("THIS IS A TEST");
        EntityRendererRegistry.INSTANCE.register(Testmod.CUBE, (dispatcher, context) -> {
            return new CubeEntityRenderer(dispatcher);
        });
        EntityRendererRegistry.INSTANCE.register(Testmod.CRAEBBER, (dispatcher, context) -> {
            return new CreeperCrabEntityRenderer(dispatcher);
        });
        EntityRendererRegistry.INSTANCE.register(Testmod.CROINK, (dispatcher, context) -> {
            return new PigCrabEntityRenderer(dispatcher);
        });
        EntityRendererRegistry.INSTANCE.register(Testmod.CRABBAGER, (dispatcher, context) -> {
            return new VillagerCrabEntityRenderer(dispatcher);
        });
    }
}
