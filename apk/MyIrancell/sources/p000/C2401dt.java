package p000;

import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: dt */
/* loaded from: classes.dex */
public final class C2401dt<TResult> {

    /* renamed from: a */
    private final Object f9878a = new Object();

    /* renamed from: b */
    @GuardedBy("mLock")
    private Queue<InterfaceC2358ct<TResult>> f9879b;

    /* renamed from: c */
    @GuardedBy("mLock")
    private boolean f9880c;

    /* renamed from: a */
    public final void m11482a(InterfaceC2358ct<TResult> interfaceC2358ct) {
        synchronized (this.f9878a) {
            if (this.f9879b == null) {
                this.f9879b = new ArrayDeque();
            }
            this.f9879b.add(interfaceC2358ct);
        }
    }

    /* renamed from: a */
    public final void m11483a(AbstractC2871ks<TResult> abstractC2871ks) {
        InterfaceC2358ct<TResult> poll;
        synchronized (this.f9878a) {
            if (this.f9879b != null && !this.f9880c) {
                this.f9880c = true;
                while (true) {
                    synchronized (this.f9878a) {
                        poll = this.f9879b.poll();
                        if (poll == null) {
                            this.f9880c = false;
                            return;
                        }
                    }
                    poll.mo3191a(abstractC2871ks);
                }
            }
        }
    }
}
