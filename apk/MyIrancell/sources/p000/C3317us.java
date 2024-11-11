package p000;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: us */
/* loaded from: classes.dex */
public final class C3317us<TResult> implements InterfaceC2358ct<TResult> {

    /* renamed from: a */
    private final Executor f13500a;

    /* renamed from: b */
    private final Object f13501b = new Object();

    /* renamed from: c */
    @GuardedBy("mLock")
    private InterfaceC2484fs<TResult> f13502c;

    public C3317us(Executor executor, InterfaceC2484fs<TResult> interfaceC2484fs) {
        this.f13500a = executor;
        this.f13502c = interfaceC2484fs;
    }

    @Override // p000.InterfaceC2358ct
    /* renamed from: a */
    public final void mo3191a(AbstractC2871ks<TResult> abstractC2871ks) {
        synchronized (this.f13501b) {
            if (this.f13502c == null) {
                return;
            }
            this.f13500a.execute(new RunnableC3370vs(this, abstractC2871ks));
        }
    }

    @Override // p000.InterfaceC2358ct
    public final void cancel() {
        synchronized (this.f13501b) {
            this.f13502c = null;
        }
    }
}
