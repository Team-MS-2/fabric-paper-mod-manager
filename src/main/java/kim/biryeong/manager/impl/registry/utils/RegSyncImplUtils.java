package kim.biryeong.manager.impl.registry.utils;

import net.minecraft.resources.Identifier;

public class RegSyncImplUtils {
    public static boolean isVanillaId(Identifier id) {
        return id.getNamespace().equals("minecraft") || id.getNamespace().equals("brigadier");
    }
}
