package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.C1057u;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.k5 */
/* loaded from: classes.dex */
public final class C1786k5 extends Thread {

    /* renamed from: b */
    private final Object f7710b;

    /* renamed from: c */
    private final BlockingQueue<C1750h5<?>> f7711c;

    /* renamed from: d */
    private boolean f7712d = false;

    /* renamed from: e */
    private final /* synthetic */ C1738g5 f7713e;

    public C1786k5(C1738g5 c1738g5, String str, BlockingQueue<C1750h5<?>> blockingQueue) {
        this.f7713e = c1738g5;
        C1057u.m7286a(str);
        C1057u.m7286a(blockingQueue);
        this.f7710b = new Object();
        this.f7711c = blockingQueue;
        setName(str);
    }

    /* renamed from: a */
    private final void m9455a(InterruptedException interruptedException) {
        this.f7713e.mo9324k().m9312w().m9366a(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    /* renamed from: b */
    private final void m9456b() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        C1786k5 c1786k5;
        C1786k5 c1786k52;
        obj = this.f7713e.f7573i;
        synchronized (obj) {
            if (!this.f7712d) {
                semaphore = this.f7713e.f7574j;
                semaphore.release();
                obj2 = this.f7713e.f7573i;
                obj2.notifyAll();
                c1786k5 = this.f7713e.f7567c;
                if (this == c1786k5) {
                    C1738g5.m9333a(this.f7713e, null);
                } else {
                    c1786k52 = this.f7713e.f7568d;
                    if (this == c1786k52) {
                        C1738g5.m9336b(this.f7713e, null);
                    } else {
                        this.f7713e.mo9324k().m9309t().m9365a("Current scheduler thread is neither worker nor network");
                    }
                }
                this.f7712d = true;
            }
        }
    }

    /* renamed from: a */
    public final void m9457a() {
        synchronized (this.f7710b) {
            this.f7710b.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        Object obj;
        boolean z;
        boolean z2 = false;
        while (!z2) {
            try {
                semaphore = this.f7713e.f7574j;
                semaphore.acquire();
                z2 = true;
            } catch (InterruptedException e) {
                m9455a(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C1750h5<?> poll = this.f7711c.poll();
                if (poll == null) {
                    synchronized (this.f7710b) {
                        if (this.f7711c.peek() == null) {
                            z = this.f7713e.f7575k;
                            if (!z) {
                                try {
                                    this.f7710b.wait(30000L);
                                } catch (InterruptedException e2) {
                                    m9455a(e2);
                                }
                            }
                        }
                    }
                    obj = this.f7713e.f7573i;
                    synchronized (obj) {
                        if (this.f7711c.peek() == null) {
                            break;
                        }
                    }
                } else {
                    Process.setThreadPriority(poll.f7594c ? threadPriority : 10);
                    poll.run();
                }
            }
            if (this.f7713e.m9326m().m9480a(C1828o.f7835S0)) {
                m9456b();
            }
        } finally {
            m9456b();
        }
    }
}
