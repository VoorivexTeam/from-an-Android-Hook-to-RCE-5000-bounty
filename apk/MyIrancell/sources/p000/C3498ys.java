package p000;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ys */
/* loaded from: classes.dex */
public final class C3498ys<TResult> implements InterfaceC2358ct<TResult> {

    /* renamed from: a */
    private final Executor f14278a;

    /* renamed from: b */
    private final Object f14279b = new Object();

    /* renamed from: c */
    @GuardedBy("mLock")
    private InterfaceC2564hs<? super TResult> f14280c;

    public C3498ys(Executor executor, InterfaceC2564hs<? super TResult> interfaceC2564hs) {
        this.f14278a = executor;
        this.f14280c = interfaceC2564hs;
    }

    @Override // p000.InterfaceC2358ct
    /* renamed from: a */
    public final void mo3191a(AbstractC2871ks<TResult> abstractC2871ks) {
        if (abstractC2871ks.mo11825e()) {
            synchronized (this.f14279b) {
                if (this.f14280c == null) {
                    return;
                }
                this.f14278a.execute(new RunnableC3540zs(this, abstractC2871ks));
            }
        }
    }

    @Override // p000.InterfaceC2358ct
    public final void cancel() {
        synchronized (this.f14279b) {
            this.f14280c = null;
        }
    }
}
