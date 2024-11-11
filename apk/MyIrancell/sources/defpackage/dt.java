package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class dt<TResult> {
    private final Object a = new Object();

    @GuardedBy("mLock")
    private Queue<ct<TResult>> b;

    @GuardedBy("mLock")
    private boolean c;

    public final void a(ct<TResult> ctVar) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(ctVar);
        }
    }

    public final void a(ks<TResult> ksVar) {
        ct<TResult> poll;
        synchronized (this.a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.a) {
                        poll = this.b.poll();
                        if (poll == null) {
                            this.c = false;
                            return;
                        }
                    }
                    poll.a(ksVar);
                }
            }
        }
    }
}
