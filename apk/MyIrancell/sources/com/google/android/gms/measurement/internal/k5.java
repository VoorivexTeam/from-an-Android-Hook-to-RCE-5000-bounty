package com.google.android.gms.measurement.internal;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k5 extends Thread {
    private final Object b;
    private final BlockingQueue<h5<?>> c;
    private boolean d = false;
    private final /* synthetic */ g5 e;

    public k5(g5 g5Var, String str, BlockingQueue<h5<?>> blockingQueue) {
        this.e = g5Var;
        com.google.android.gms.common.internal.u.a(str);
        com.google.android.gms.common.internal.u.a(blockingQueue);
        this.b = new Object();
        this.c = blockingQueue;
        setName(str);
    }

    private final void a(InterruptedException interruptedException) {
        this.e.k().w().a(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    private final void b() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        k5 k5Var;
        k5 k5Var2;
        obj = this.e.i;
        synchronized (obj) {
            if (!this.d) {
                semaphore = this.e.j;
                semaphore.release();
                obj2 = this.e.i;
                obj2.notifyAll();
                k5Var = this.e.c;
                if (this == k5Var) {
                    g5.a(this.e, null);
                } else {
                    k5Var2 = this.e.d;
                    if (this == k5Var2) {
                        g5.b(this.e, null);
                    } else {
                        this.e.k().t().a("Current scheduler thread is neither worker nor network");
                    }
                }
                this.d = true;
            }
        }
    }

    public final void a() {
        synchronized (this.b) {
            this.b.notifyAll();
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
                semaphore = this.e.j;
                semaphore.acquire();
                z2 = true;
            } catch (InterruptedException e) {
                a(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                h5<?> poll = this.c.poll();
                if (poll == null) {
                    synchronized (this.b) {
                        if (this.c.peek() == null) {
                            z = this.e.k;
                            if (!z) {
                                try {
                                    this.b.wait(30000L);
                                } catch (InterruptedException e2) {
                                    a(e2);
                                }
                            }
                        }
                    }
                    obj = this.e.i;
                    synchronized (obj) {
                        if (this.c.peek() == null) {
                            break;
                        }
                    }
                } else {
                    Process.setThreadPriority(poll.c ? threadPriority : 10);
                    poll.run();
                }
            }
            if (this.e.m().a(o.S0)) {
                b();
            }
        } finally {
            b();
        }
    }
}
