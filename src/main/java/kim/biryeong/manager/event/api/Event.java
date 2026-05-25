package kim.biryeong.manager.event.api;

import net.minecraft.resources.Identifier;

/**
 * imported from Fabric Event API
 * @param <T>
 */
public abstract class Event<T> {
    protected volatile T invoker;
    public T invoker() {
        return invoker;
    }
    public abstract void register(T listener);
    public static final Identifier EVENT_BUS = Identifier.fromNamespaceAndPath("fabric", "default");

    public void register(Identifier phase, T listener) {
        register(listener);
    }
    public void addPhaseOrdering(Identifier firstPhase, Identifier secondPhase) {
    }
}
