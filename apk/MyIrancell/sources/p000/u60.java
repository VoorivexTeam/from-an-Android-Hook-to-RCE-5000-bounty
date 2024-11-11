package p000;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class u60 {

    /* renamed from: a */
    private final x60 f13410a;

    /* renamed from: b */
    private final c60 f13411b;

    /* renamed from: e */
    private final AtomicInteger f13414e;

    /* renamed from: f */
    private volatile Thread f13415f;

    /* renamed from: g */
    private volatile boolean f13416g;

    /* renamed from: c */
    private final Object f13412c = new Object();

    /* renamed from: d */
    private final Object f13413d = new Object();

    /* renamed from: h */
    private volatile int f13417h = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u60$b */
    /* loaded from: classes.dex */
    public class RunnableC3291b implements Runnable {
        private RunnableC3291b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u60.this.m15728e();
        }
    }

    public u60(x60 x60Var, c60 c60Var) {
        t60.m15549a(x60Var);
        this.f13410a = x60Var;
        t60.m15549a(c60Var);
        this.f13411b = c60Var;
        this.f13414e = new AtomicInteger();
    }

    /* renamed from: b */
    private void m15724b() {
        int i = this.f13414e.get();
        if (i < 1) {
            return;
        }
        this.f13414e.set(0);
        throw new v60("Error reading source " + i + " times");
    }

    /* renamed from: b */
    private void m15725b(long j, long j2) {
        m15735a(j, j2);
        synchronized (this.f13412c) {
            this.f13412c.notifyAll();
        }
    }

    /* renamed from: c */
    private synchronized void m15726c() {
        boolean z = (this.f13415f == null || this.f13415f.getState() == Thread.State.TERMINATED) ? false : true;
        if (!this.f13416g && !this.f13411b.mo3603d() && !z) {
            this.f13415f = new Thread(new RunnableC3291b(), "Source reader for " + this.f13410a);
            this.f13415f.start();
        }
    }

    /* renamed from: d */
    private void m15727d() {
        synchronized (this.f13412c) {
            try {
                try {
                    this.f13412c.wait(1000L);
                } catch (InterruptedException e) {
                    throw new v60("Waiting source data is interrupted!", e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m15728e() {
        long j = -1;
        long j2 = 0;
        try {
            j2 = this.f13411b.mo3599a();
            this.f13410a.mo14725a(j2);
            j = this.f13410a.mo14724a();
            byte[] bArr = new byte[8192];
            while (true) {
                int mo14723a = this.f13410a.mo14723a(bArr);
                if (mo14723a == -1) {
                    m15730g();
                    m15729f();
                    break;
                }
                synchronized (this.f13413d) {
                    if (m15731h()) {
                        return;
                    } else {
                        this.f13411b.mo3600a(bArr, mo14723a);
                    }
                }
                j2 += mo14723a;
                m15725b(j2, j);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* renamed from: f */
    private void m15729f() {
        this.f13417h = 100;
        mo14053a(this.f13417h);
    }

    /* renamed from: g */
    private void m15730g() {
        synchronized (this.f13413d) {
            if (!m15731h() && this.f13411b.mo3599a() == this.f13410a.mo14724a()) {
                this.f13411b.mo3602c();
            }
        }
    }

    /* renamed from: h */
    private boolean m15731h() {
        return Thread.currentThread().isInterrupted() || this.f13416g;
    }

    /* renamed from: i */
    private void m15732i() {
        try {
            this.f13410a.mo14726b();
        } catch (v60 e) {
            m15736a(new v60("Error closing source " + this.f13410a, e));
        }
    }

    /* renamed from: a */
    public int m15733a(byte[] bArr, long j, int i) {
        w60.m16144a(bArr, j, i);
        while (!this.f13411b.mo3603d() && this.f13411b.mo3599a() < i + j && !this.f13416g) {
            m15726c();
            m15727d();
            m15724b();
        }
        int mo3598a = this.f13411b.mo3598a(bArr, j, i);
        if (this.f13411b.mo3603d() && this.f13417h != 100) {
            this.f13417h = 100;
            mo14053a(100);
        }
        return mo3598a;
    }

    /* renamed from: a */
    public void m15734a() {
        synchronized (this.f13413d) {
            i50.m12376d("Shutdown proxy for " + this.f13410a);
            try {
                this.f13416g = true;
                if (this.f13415f != null) {
                    this.f13415f.interrupt();
                }
                this.f13411b.mo3601b();
            } catch (v60 e) {
                m15736a(e);
            }
        }
    }

    /* renamed from: a */
    protected void mo14053a(int i) {
        throw null;
    }

    /* renamed from: a */
    protected void m15735a(long j, long j2) {
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1)) == 0 ? 100 : (int) ((((float) j) / ((float) j2)) * 100.0f);
        boolean z = i != this.f13417h;
        if ((j2 >= 0) && z) {
            mo14053a(i);
        }
        this.f13417h = i;
    }

    /* renamed from: a */
    protected final void m15736a(Throwable th) {
        if (th instanceof r60) {
            i50.m12376d("ProxyCache is interrupted");
        } else {
            i50.m12368a("ProxyCache error");
            th.printStackTrace();
        }
    }
}
