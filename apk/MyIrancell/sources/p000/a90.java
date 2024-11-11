package p000;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;
import p000.a80;
import p000.z80;

/* loaded from: classes.dex */
public final class a90 {

    /* renamed from: a */
    public final g70 f62a;

    /* renamed from: b */
    private z80.C3517a f63b;

    /* renamed from: c */
    private k80 f64c;

    /* renamed from: d */
    private final p70 f65d;

    /* renamed from: e */
    public final k70 f66e;

    /* renamed from: f */
    public final v70 f67f;

    /* renamed from: g */
    private final Object f68g;

    /* renamed from: h */
    private final z80 f69h;

    /* renamed from: i */
    private int f70i;

    /* renamed from: j */
    private w80 f71j;

    /* renamed from: k */
    private boolean f72k;

    /* renamed from: l */
    private boolean f73l;

    /* renamed from: m */
    private boolean f74m;

    /* renamed from: n */
    private d90 f75n;

    /* renamed from: a90$a */
    /* loaded from: classes.dex */
    public static final class C0012a extends WeakReference<a90> {

        /* renamed from: a */
        public final Object f76a;

        C0012a(a90 a90Var, Object obj) {
            super(a90Var);
            this.f76a = obj;
        }
    }

    public a90(p70 p70Var, g70 g70Var, k70 k70Var, v70 v70Var, Object obj) {
        this.f65d = p70Var;
        this.f62a = g70Var;
        this.f66e = k70Var;
        this.f67f = v70Var;
        this.f69h = new z80(g70Var, m107i(), k70Var, v70Var);
        this.f68g = obj;
    }

    /* renamed from: a */
    private Socket m102a(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (z3) {
            this.f75n = null;
        }
        if (z2) {
            this.f73l = true;
        }
        w80 w80Var = this.f71j;
        if (w80Var == null) {
            return null;
        }
        if (z) {
            w80Var.f13793k = true;
        }
        if (this.f75n != null) {
            return null;
        }
        if (!this.f73l && !this.f71j.f13793k) {
            return null;
        }
        m105b(this.f71j);
        if (this.f71j.f13796n.isEmpty()) {
            this.f71j.f13797o = System.nanoTime();
            if (m80.f12098a.mo11330a(this.f65d, this.f71j)) {
                socket = this.f71j.m16173f();
                this.f71j = null;
                return socket;
            }
        }
        socket = null;
        this.f71j = null;
        return socket;
    }

    /* renamed from: a */
    private w80 m103a(int i, int i2, int i3, int i4, boolean z) {
        Socket m106h;
        Socket socket;
        w80 w80Var;
        w80 w80Var2;
        k80 k80Var;
        boolean z2;
        boolean z3;
        z80.C3517a c3517a;
        synchronized (this.f65d) {
            if (this.f73l) {
                throw new IllegalStateException("released");
            }
            if (this.f75n != null) {
                throw new IllegalStateException("codec != null");
            }
            if (this.f74m) {
                throw new IOException("Canceled");
            }
            w80 w80Var3 = this.f71j;
            m106h = m106h();
            socket = null;
            if (this.f71j != null) {
                w80Var2 = this.f71j;
                w80Var = null;
            } else {
                w80Var = w80Var3;
                w80Var2 = null;
            }
            if (!this.f72k) {
                w80Var = null;
            }
            if (w80Var2 == null) {
                m80.f12098a.mo11324a(this.f65d, this.f62a, this, null);
                if (this.f71j != null) {
                    w80Var2 = this.f71j;
                    k80Var = null;
                    z2 = true;
                } else {
                    k80Var = this.f64c;
                }
            } else {
                k80Var = null;
            }
            z2 = false;
        }
        o80.m14459a(m106h);
        if (w80Var != null) {
            this.f67f.m15963b(this.f66e, w80Var);
        }
        if (z2) {
            this.f67f.m15959a(this.f66e, w80Var2);
        }
        if (w80Var2 != null) {
            return w80Var2;
        }
        if (k80Var != null || ((c3517a = this.f63b) != null && c3517a.m16853b())) {
            z3 = false;
        } else {
            this.f63b = this.f69h.m16851b();
            z3 = true;
        }
        synchronized (this.f65d) {
            if (this.f74m) {
                throw new IOException("Canceled");
            }
            if (z3) {
                List<k80> m16852a = this.f63b.m16852a();
                int size = m16852a.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        break;
                    }
                    k80 k80Var2 = m16852a.get(i5);
                    m80.f12098a.mo11324a(this.f65d, this.f62a, this, k80Var2);
                    if (this.f71j != null) {
                        w80Var2 = this.f71j;
                        this.f64c = k80Var2;
                        z2 = true;
                        break;
                    }
                    i5++;
                }
            }
            if (!z2) {
                if (k80Var == null) {
                    k80Var = this.f63b.m16854c();
                }
                this.f64c = k80Var;
                this.f70i = 0;
                w80Var2 = new w80(this.f65d, k80Var);
                m112a(w80Var2, false);
            }
        }
        if (!z2) {
            w80Var2.m16165a(i, i2, i3, i4, z, this.f66e, this.f67f);
            m107i().m16463a(w80Var2.m16172e());
            synchronized (this.f65d) {
                this.f72k = true;
                m80.f12098a.mo11331b(this.f65d, w80Var2);
                if (w80Var2.m16171d()) {
                    socket = m80.f12098a.mo11323a(this.f65d, this.f62a, this);
                    w80Var2 = this.f71j;
                }
            }
            o80.m14459a(socket);
        }
        this.f67f.m15959a(this.f66e, w80Var2);
        return w80Var2;
    }

    /* renamed from: a */
    private w80 m104a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        while (true) {
            w80 m103a = m103a(i, i2, i3, i4, z);
            synchronized (this.f65d) {
                if (m103a.f13794l == 0) {
                    return m103a;
                }
                if (m103a.m16168a(z2)) {
                    return m103a;
                }
                m117e();
            }
        }
    }

    /* renamed from: b */
    private void m105b(w80 w80Var) {
        int size = w80Var.f13796n.size();
        for (int i = 0; i < size; i++) {
            if (w80Var.f13796n.get(i).get() == this) {
                w80Var.f13796n.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: h */
    private Socket m106h() {
        w80 w80Var = this.f71j;
        if (w80Var == null || !w80Var.f13793k) {
            return null;
        }
        return m102a(false, false, true);
    }

    /* renamed from: i */
    private x80 m107i() {
        return m80.f12098a.mo11325a(this.f65d);
    }

    /* renamed from: a */
    public d90 m108a(d80 d80Var, a80.InterfaceC0010a interfaceC0010a, boolean z) {
        try {
            d90 m16164a = m104a(interfaceC0010a.mo95a(), interfaceC0010a.mo97b(), interfaceC0010a.mo98c(), d80Var.m11315u(), d80Var.m11294A(), z).m16164a(d80Var, interfaceC0010a, this);
            synchronized (this.f65d) {
                this.f75n = m16164a;
            }
            return m16164a;
        } catch (IOException e) {
            throw new y80(e);
        }
    }

    /* renamed from: a */
    public Socket m109a(w80 w80Var) {
        if (this.f75n != null || this.f71j.f13796n.size() != 1) {
            throw new IllegalStateException();
        }
        Reference<a90> reference = this.f71j.f13796n.get(0);
        Socket m102a = m102a(true, false, false);
        this.f71j = w80Var;
        w80Var.f13796n.add(reference);
        return m102a;
    }

    /* renamed from: a */
    public void m110a() {
        d90 d90Var;
        w80 w80Var;
        synchronized (this.f65d) {
            this.f74m = true;
            d90Var = this.f75n;
            w80Var = this.f71j;
        }
        if (d90Var != null) {
            d90Var.cancel();
        } else if (w80Var != null) {
            w80Var.m16169b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x001c, code lost:
    
        if (r7 != p000.o90.CANCEL) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[Catch: all -> 0x0066, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:8:0x0012, B:11:0x001e, B:13:0x0048, B:15:0x0052, B:19:0x0058, B:28:0x001a, B:30:0x0021, B:32:0x0025, B:34:0x002d, B:36:0x0031, B:38:0x0037, B:41:0x003d), top: B:3:0x0003 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m111a(java.io.IOException r7) {
        /*
            r6 = this;
            p70 r0 = r6.f65d
            monitor-enter(r0)
            boolean r1 = r7 instanceof p000.aa0     // Catch: java.lang.Throwable -> L66
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L21
            aa0 r7 = (p000.aa0) r7     // Catch: java.lang.Throwable -> L66
            o90 r7 = r7.f83b     // Catch: java.lang.Throwable -> L66
            o90 r1 = p000.o90.REFUSED_STREAM     // Catch: java.lang.Throwable -> L66
            if (r7 != r1) goto L1a
            int r7 = r6.f70i     // Catch: java.lang.Throwable -> L66
            int r7 = r7 + r4
            r6.f70i = r7     // Catch: java.lang.Throwable -> L66
            if (r7 <= r4) goto L47
            goto L1e
        L1a:
            o90 r1 = p000.o90.CANCEL     // Catch: java.lang.Throwable -> L66
            if (r7 == r1) goto L47
        L1e:
            r6.f64c = r3     // Catch: java.lang.Throwable -> L66
            goto L45
        L21:
            w80 r1 = r6.f71j     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L47
            w80 r1 = r6.f71j     // Catch: java.lang.Throwable -> L66
            boolean r1 = r1.m16171d()     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L31
            boolean r1 = r7 instanceof p000.n90     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L47
        L31:
            w80 r1 = r6.f71j     // Catch: java.lang.Throwable -> L66
            int r1 = r1.f13794l     // Catch: java.lang.Throwable -> L66
            if (r1 != 0) goto L45
            k80 r1 = r6.f64c     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L1e
            if (r7 == 0) goto L1e
            z80 r1 = r6.f69h     // Catch: java.lang.Throwable -> L66
            k80 r5 = r6.f64c     // Catch: java.lang.Throwable -> L66
            r1.m16849a(r5, r7)     // Catch: java.lang.Throwable -> L66
            goto L1e
        L45:
            r7 = 1
            goto L48
        L47:
            r7 = 0
        L48:
            w80 r1 = r6.f71j     // Catch: java.lang.Throwable -> L66
            java.net.Socket r7 = r6.m102a(r7, r2, r4)     // Catch: java.lang.Throwable -> L66
            w80 r2 = r6.f71j     // Catch: java.lang.Throwable -> L66
            if (r2 != 0) goto L58
            boolean r2 = r6.f72k     // Catch: java.lang.Throwable -> L66
            if (r2 != 0) goto L57
            goto L58
        L57:
            r3 = r1
        L58:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L66
            p000.o80.m14459a(r7)
            if (r3 == 0) goto L65
            v70 r7 = r6.f67f
            k70 r0 = r6.f66e
            r7.m15963b(r0, r3)
        L65:
            return
        L66:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L66
            goto L6a
        L69:
            throw r7
        L6a:
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.a90.m111a(java.io.IOException):void");
    }

    /* renamed from: a */
    public void m112a(w80 w80Var, boolean z) {
        if (this.f71j != null) {
            throw new IllegalStateException();
        }
        this.f71j = w80Var;
        this.f72k = z;
        w80Var.f13796n.add(new C0012a(this, this.f68g));
    }

    /* renamed from: a */
    public void m113a(boolean z, d90 d90Var, long j, IOException iOException) {
        w80 w80Var;
        Socket m102a;
        boolean z2;
        this.f67f.m15962b(this.f66e, j);
        synchronized (this.f65d) {
            if (d90Var != null) {
                if (d90Var == this.f75n) {
                    if (!z) {
                        this.f71j.f13794l++;
                    }
                    w80Var = this.f71j;
                    m102a = m102a(z, false, true);
                    if (this.f71j != null) {
                        w80Var = null;
                    }
                    z2 = this.f73l;
                }
            }
            throw new IllegalStateException("expected " + this.f75n + " but was " + d90Var);
        }
        o80.m14459a(m102a);
        if (w80Var != null) {
            this.f67f.m15963b(this.f66e, w80Var);
        }
        if (iOException != null) {
            this.f67f.m15953a(this.f66e, m80.f12098a.mo11322a(this.f66e, iOException));
        } else if (z2) {
            m80.f12098a.mo11322a(this.f66e, (IOException) null);
            this.f67f.m15949a(this.f66e);
        }
    }

    /* renamed from: b */
    public d90 m114b() {
        d90 d90Var;
        synchronized (this.f65d) {
            d90Var = this.f75n;
        }
        return d90Var;
    }

    /* renamed from: c */
    public synchronized w80 m115c() {
        return this.f71j;
    }

    /* renamed from: d */
    public boolean m116d() {
        z80.C3517a c3517a;
        return this.f64c != null || ((c3517a = this.f63b) != null && c3517a.m16853b()) || this.f69h.m16850a();
    }

    /* renamed from: e */
    public void m117e() {
        w80 w80Var;
        Socket m102a;
        synchronized (this.f65d) {
            w80Var = this.f71j;
            m102a = m102a(true, false, false);
            if (this.f71j != null) {
                w80Var = null;
            }
        }
        o80.m14459a(m102a);
        if (w80Var != null) {
            this.f67f.m15963b(this.f66e, w80Var);
        }
    }

    /* renamed from: f */
    public void m118f() {
        w80 w80Var;
        Socket m102a;
        synchronized (this.f65d) {
            w80Var = this.f71j;
            m102a = m102a(false, true, false);
            if (this.f71j != null) {
                w80Var = null;
            }
        }
        o80.m14459a(m102a);
        if (w80Var != null) {
            m80.f12098a.mo11322a(this.f66e, (IOException) null);
            this.f67f.m15963b(this.f66e, w80Var);
            this.f67f.m15949a(this.f66e);
        }
    }

    /* renamed from: g */
    public k80 m119g() {
        return this.f64c;
    }

    public String toString() {
        w80 m115c = m115c();
        return m115c != null ? m115c.toString() : this.f62a.toString();
    }
}
