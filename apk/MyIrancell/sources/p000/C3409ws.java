package p000;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ws */
/* loaded from: classes.dex */
public final class C3409ws<TResult> implements InterfaceC2358ct<TResult> {

    /* renamed from: a */
    private final Executor f13965a;

    /* renamed from: b */
    private final Object f13966b = new Object();

    /* renamed from: c */
    @GuardedBy("mLock")
    private InterfaceC2524gs f13967c;

    public C3409ws(Executor executor, InterfaceC2524gs interfaceC2524gs) {
        this.f13965a = executor;
        this.f13967c = interfaceC2524gs;
    }

    @Override // p000.InterfaceC2358ct
    /* renamed from: a */
    public final void mo3191a(AbstractC2871ks<TResult> abstractC2871ks) {
        if (abstractC2871ks.mo11825e() || abstractC2871ks.mo11823c()) {
            return;
        }
        synchronized (this.f13966b) {
            if (this.f13967c == null) {
                return;
            }
            this.f13965a.execute(new RunnableC3449xs(this, abstractC2871ks));
        }
    }

    @Override // p000.InterfaceC2358ct
    public final void cancel() {
        synchronized (this.f13966b) {
            this.f13967c = null;
        }
    }
}
