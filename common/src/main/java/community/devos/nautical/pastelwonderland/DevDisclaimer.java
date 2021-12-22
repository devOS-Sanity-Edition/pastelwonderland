package community.devos.nautical.pastelwonderland;

import com.mojang.authlib.minecraft.client.MinecraftClient;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;

public class DevDisclaimer {
    public static void init() {
        if (PastelWonderland.devEnv) {
            Minecraft.getInstance().gui.getFont().drawShadow(PoseStack poseStack, "Test", 1, 1, 0xFFFFFF);
        }
    }
}
