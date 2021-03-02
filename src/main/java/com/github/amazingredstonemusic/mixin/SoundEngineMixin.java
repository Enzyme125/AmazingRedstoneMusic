package com.github.amazingredstonemusic.mixin;

import net.minecraft.client.sound.SoundEngine;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(SoundEngine.class)
public class SoundEngineMixin {
    @ModifyArg(
            method="init()V", at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/client/sound/SoundEngine$SourceSetImpl;<init>(I)V"),
            index = 0)
    private int CancelMaxCount(int i){
        return 1073741824;
    }
}
