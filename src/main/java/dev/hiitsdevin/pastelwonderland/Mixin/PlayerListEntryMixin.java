package dev.hiitsdevin.pastelwonderland.Mixin;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import dev.hiitsdevin.pastelwonderland.PastelWonderland;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Map;


@Mixin(PlayerListEntry.class)
public abstract class PlayerListEntryMixin {
    protected PlayerListEntryMixin() throws IOException {
    }

    @Shadow @Nullable public abstract Identifier getCapeTexture();

    File cape = new File("assets/pastelwonderland/textures/pastelwonderlandcape.png");
    BufferedImage capeImage;


    @Accessor
    public abstract Map<MinecraftProfileTexture.Type, Identifier> getTextures();

    @Accessor
    public abstract GameProfile getProfile();

    @Environment(EnvType.CLIENT)
    @Inject(method = "getCapeTexture", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/network/PlayerListEntry;loadTextures()V"))
    public void injectIntoTextures(CallbackInfoReturnable<Identifier> cir) throws IOException {
            // This path goes to the textures file "resources/assets/pastelwonderland/"
        File capeCheck = new File(PastelWonderland.MOD_ID + "/cape.png");
        if (capeCheck.exists()) {
            Identifier cape = new Identifier(PastelWonderland.MOD_ID, "textures/pastelwonderlandcape.png");
            getTextures().put(MinecraftProfileTexture.Type.CAPE, cape);
        } else {
            return;
        }
    }
}
