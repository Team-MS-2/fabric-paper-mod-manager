package kim.biryeong.manager.mixin;

import net.minecraft.core.registries.BuiltInRegistries;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Previously used to invoke FabricLoader entrypoints.
 * With Horizon, each mod handles its own initialization via MainMixin.
 * This mixin is kept as a no-op for compatibility.
 */
@Mixin(BuiltInRegistries.class)
public class BuiltInRegistriesMixin {
    @Inject(method = "createContents", at = @At("RETURN"))
    private static void onBootstrap(CallbackInfo ci) {
        // No-op: Horizon handles mod initialization via per-mod MainMixin injections
    }
}
