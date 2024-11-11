package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: pq */
/* loaded from: classes.dex */
final class C3094pq implements InterfaceC3055oq {
    private C3094pq() {
    }

    @Override // p000.InterfaceC3055oq
    /* renamed from: a */
    public final ScheduledExecutorService mo14648a(int i, int i2) {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }
}
