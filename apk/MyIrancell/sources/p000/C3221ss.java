package p000;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: ss */
/* loaded from: classes.dex */
final class C3221ss<TResult> implements InterfaceC2358ct<TResult> {

    /* renamed from: a */
    private final Executor f13143a;

    /* renamed from: b */
    private final Object f13144b = new Object();

    /* renamed from: c */
    @GuardedBy("mLock")
    private InterfaceC2443es f13145c;

    public C3221ss(Executor executor, InterfaceC2443es interfaceC2443es) {
        this.f13143a = executor;
        this.f13145c = interfaceC2443es;
    }

    @Override // p000.InterfaceC2358ct
    /* renamed from: a */
    public final void mo3191a(AbstractC2871ks abstractC2871ks) {
        if (abstractC2871ks.mo11823c()) {
            synchronized (this.f13144b) {
                if (this.f13145c == null) {
                    return;
                }
                this.f13143a.execute(new RunnableC3273ts(this));
            }
        }
    }

    @Override // p000.InterfaceC2358ct
    public final void cancel() {
        synchronized (this.f13144b) {
            this.f13145c = null;
        }
    }
}
