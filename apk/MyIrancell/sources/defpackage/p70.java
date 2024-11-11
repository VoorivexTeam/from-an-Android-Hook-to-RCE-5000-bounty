package defpackage;

import defpackage.a90;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class p70 {
    private static final Executor g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), o80.a("OkHttp ConnectionPool", true));
    private final int a;
    private final long b;
    private final Runnable c;
    private final Deque<w80> d;
    final x80 e;
    boolean f;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                long a = p70.this.a(System.nanoTime());
                if (a == -1) {
                    return;
                }
                if (a > 0) {
                    long j = a / 1000000;
                    long j2 = a - (1000000 * j);
                    synchronized (p70.this) {
                        try {
                            p70.this.wait(j, (int) j2);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
        }
    }

    public p70() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    public p70(int i, long j, TimeUnit timeUnit) {
        this.c = new a();
        this.d = new ArrayDeque();
        this.e = new x80();
        this.a = i;
        this.b = timeUnit.toNanos(j);
        if (j > 0) {
            return;
        }
        throw new IllegalArgumentException("keepAliveDuration <= 0: " + j);
    }

    private int a(w80 w80Var, long j) {
        List<Reference<a90>> list = w80Var.n;
        int i = 0;
        while (i < list.size()) {
            Reference<a90> reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                ga0.c().a("A connection to " + w80Var.e().a().k() + " was leaked. Did you forget to close a response body?", ((a90.a) reference).a);
                list.remove(i);
                w80Var.k = true;
                if (list.isEmpty()) {
                    w80Var.o = j - this.b;
                    return 0;
                }
            }
        }
        return list.size();
    }

    long a(long j) {
        synchronized (this) {
            w80 w80Var = null;
            long j2 = Long.MIN_VALUE;
            int i = 0;
            int i2 = 0;
            for (w80 w80Var2 : this.d) {
                if (a(w80Var2, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - w80Var2.o;
                    if (j3 > j2) {
                        w80Var = w80Var2;
                        j2 = j3;
                    }
                }
            }
            if (j2 < this.b && i <= this.a) {
                if (i > 0) {
                    return this.b - j2;
                }
                if (i2 > 0) {
                    return this.b;
                }
                this.f = false;
                return -1L;
            }
            this.d.remove(w80Var);
            o80.a(w80Var.f());
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public Socket a(g70 g70Var, a90 a90Var) {
        for (w80 w80Var : this.d) {
            if (w80Var.a(g70Var, null) && w80Var.d() && w80Var != a90Var.c()) {
                return a90Var.a(w80Var);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public w80 a(g70 g70Var, a90 a90Var, k80 k80Var) {
        for (w80 w80Var : this.d) {
            if (w80Var.a(g70Var, k80Var)) {
                a90Var.a(w80Var, true);
                return w80Var;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(w80 w80Var) {
        if (w80Var.k || this.a == 0) {
            this.d.remove(w80Var);
            return true;
        }
        notifyAll();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(w80 w80Var) {
        if (!this.f) {
            this.f = true;
            g.execute(this.c);
        }
        this.d.add(w80Var);
    }
}
