package p000;

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
import p000.a90;

/* loaded from: classes.dex */
public final class p70 {

    /* renamed from: g */
    private static final Executor f12568g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), o80.m14454a("OkHttp ConnectionPool", true));

    /* renamed from: a */
    private final int f12569a;

    /* renamed from: b */
    private final long f12570b;

    /* renamed from: c */
    private final Runnable f12571c;

    /* renamed from: d */
    private final Deque<w80> f12572d;

    /* renamed from: e */
    final x80 f12573e;

    /* renamed from: f */
    boolean f12574f;

    /* renamed from: p70$a */
    /* loaded from: classes.dex */
    class RunnableC3074a implements Runnable {
        RunnableC3074a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                long m14731a = p70.this.m14731a(System.nanoTime());
                if (m14731a == -1) {
                    return;
                }
                if (m14731a > 0) {
                    long j = m14731a / 1000000;
                    long j2 = m14731a - (1000000 * j);
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
        this.f12571c = new RunnableC3074a();
        this.f12572d = new ArrayDeque();
        this.f12573e = new x80();
        this.f12569a = i;
        this.f12570b = timeUnit.toNanos(j);
        if (j > 0) {
            return;
        }
        throw new IllegalArgumentException("keepAliveDuration <= 0: " + j);
    }

    /* renamed from: a */
    private int m14730a(w80 w80Var, long j) {
        List<Reference<a90>> list = w80Var.f13796n;
        int i = 0;
        while (i < list.size()) {
            Reference<a90> reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                ga0.m11953c().mo3356a("A connection to " + w80Var.m16172e().m13627a().m11917k() + " was leaked. Did you forget to close a response body?", ((a90.C0012a) reference).f76a);
                list.remove(i);
                w80Var.f13793k = true;
                if (list.isEmpty()) {
                    w80Var.f13797o = j - this.f12570b;
                    return 0;
                }
            }
        }
        return list.size();
    }

    /* renamed from: a */
    long m14731a(long j) {
        synchronized (this) {
            w80 w80Var = null;
            long j2 = Long.MIN_VALUE;
            int i = 0;
            int i2 = 0;
            for (w80 w80Var2 : this.f12572d) {
                if (m14730a(w80Var2, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - w80Var2.f13797o;
                    if (j3 > j2) {
                        w80Var = w80Var2;
                        j2 = j3;
                    }
                }
            }
            if (j2 < this.f12570b && i <= this.f12569a) {
                if (i > 0) {
                    return this.f12570b - j2;
                }
                if (i2 > 0) {
                    return this.f12570b;
                }
                this.f12574f = false;
                return -1L;
            }
            this.f12572d.remove(w80Var);
            o80.m14459a(w80Var.m16173f());
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: a */
    public Socket m14732a(g70 g70Var, a90 a90Var) {
        for (w80 w80Var : this.f12572d) {
            if (w80Var.m16166a(g70Var, null) && w80Var.m16171d() && w80Var != a90Var.m115c()) {
                return a90Var.m109a(w80Var);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: a */
    public w80 m14733a(g70 g70Var, a90 a90Var, k80 k80Var) {
        for (w80 w80Var : this.f12572d) {
            if (w80Var.m16166a(g70Var, k80Var)) {
                a90Var.m112a(w80Var, true);
                return w80Var;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m14734a(w80 w80Var) {
        if (w80Var.f13793k || this.f12569a == 0) {
            this.f12572d.remove(w80Var);
            return true;
        }
        notifyAll();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m14735b(w80 w80Var) {
        if (!this.f12574f) {
            this.f12574f = true;
            f12568g.execute(this.f12571c);
        }
        this.f12572d.add(w80Var);
    }
}
