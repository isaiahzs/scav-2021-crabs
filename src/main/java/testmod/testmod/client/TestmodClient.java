package testmod.testmod.client;

import testmod.testmod.client.client.CubeEntityRenderer;
import testmod.testmod.Testmod;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class TestmodClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("THIS IS A TEST");
        EntityRendererRegistry.INSTANCE.register(Testmod.CUBE, (dispatcher, context) -> {
            return new CubeEntityRenderer(dispatcher);
        });
    }
}
