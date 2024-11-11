package defpackage;

import defpackage.a80;
import defpackage.z80;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;

/* loaded from: classes.dex */
public final class a90 {
    public final g70 a;
    private z80.a b;
    private k80 c;
    private final p70 d;
    public final k70 e;
    public final v70 f;
    private final Object g;
    private final z80 h;
    private int i;
    private w80 j;
    private boolean k;
    private boolean l;
    private boolean m;
    private d90 n;

    /* loaded from: classes.dex */
    public static final class a extends WeakReference<a90> {
        public final Object a;

        a(a90 a90Var, Object obj) {
            super(a90Var);
            this.a = obj;
        }
    }

    public a90(p70 p70Var, g70 g70Var, k70 k70Var, v70 v70Var, Object obj) {
        this.d = p70Var;
        this.a = g70Var;
        this.e = k70Var;
        this.f = v70Var;
        this.h = new z80(g70Var, i(), k70Var, v70Var);
        this.g = obj;
    }

    private Socket a(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (z3) {
            this.n = null;
        }
        if (z2) {
            this.l = true;
        }
        w80 w80Var = this.j;
        if (w80Var == null) {
            return null;
        }
        if (z) {
            w80Var.k = true;
        }
        if (this.n != null) {
            return null;
        }
        if (!this.l && !this.j.k) {
            return null;
        }
        b(this.j);
        if (this.j.n.isEmpty()) {
            this.j.o = System.nanoTime();
            if (m80.a.a(this.d, this.j)) {
                socket = this.j.f();
                this.j = null;
                return socket;
            }
        }
        socket = null;
        this.j = null;
        return socket;
    }

    private w80 a(int i, int i2, int i3, int i4, boolean z) {
        Socket h;
        Socket socket;
        w80 w80Var;
        w80 w80Var2;
        k80 k80Var;
        boolean z2;
        boolean z3;
        z80.a aVar;
        synchronized (this.d) {
            if (this.l) {
                throw new IllegalStateException("released");
            }
            if (this.n != null) {
                throw new IllegalStateException("codec != null");
            }
            if (this.m) {
                throw new IOException("Canceled");
            }
            w80 w80Var3 = this.j;
            h = h();
            socket = null;
            if (this.j != null) {
                w80Var2 = this.j;
                w80Var = null;
            } else {
                w80Var = w80Var3;
                w80Var2 = null;
            }
            if (!this.k) {
                w80Var = null;
            }
            if (w80Var2 == null) {
                m80.a.a(this.d, this.a, this, null);
                if (this.j != null) {
                    w80Var2 = this.j;
                    k80Var = null;
                    z2 = true;
                } else {
                    k80Var = this.c;
                }
            } else {
                k80Var = null;
            }
            z2 = false;
        }
        o80.a(h);
        if (w80Var != null) {
            this.f.b(this.e, w80Var);
        }
        if (z2) {
            this.f.a(this.e, w80Var2);
        }
        if (w80Var2 != null) {
            return w80Var2;
        }
        if (k80Var != null || ((aVar = this.b) != null && aVar.b())) {
            z3 = false;
        } else {
            this.b = this.h.b();
            z3 = true;
        }
        synchronized (this.d) {
            if (this.m) {
                throw new IOException("Canceled");
            }
            if (z3) {
                List<k80> a2 = this.b.a();
                int size = a2.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        break;
                    }
                    k80 k80Var2 = a2.get(i5);
                    m80.a.a(this.d, this.a, this, k80Var2);
                    if (this.j != null) {
                        w80Var2 = this.j;
                        this.c = k80Var2;
                        z2 = true;
                        break;
                    }
                    i5++;
                }
            }
            if (!z2) {
                if (k80Var == null) {
                    k80Var = this.b.c();
                }
                this.c = k80Var;
                this.i = 0;
                w80Var2 = new w80(this.d, k80Var);
                a(w80Var2, false);
            }
        }
        if (!z2) {
            w80Var2.a(i, i2, i3, i4, z, this.e, this.f);
            i().a(w80Var2.e());
            synchronized (this.d) {
                this.k = true;
                m80.a.b(this.d, w80Var2);
                if (w80Var2.d()) {
                    socket = m80.a.a(this.d, this.a, this);
                    w80Var2 = this.j;
                }
            }
            o80.a(socket);
        }
        this.f.a(this.e, w80Var2);
        return w80Var2;
    }

    private w80 a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        while (true) {
            w80 a2 = a(i, i2, i3, i4, z);
            synchronized (this.d) {
                if (a2.l == 0) {
                    return a2;
                }
                if (a2.a(z2)) {
                    return a2;
                }
                e();
            }
        }
    }

    private void b(w80 w80Var) {
        int size = w80Var.n.size();
        for (int i = 0; i < size; i++) {
            if (w80Var.n.get(i).get() == this) {
                w80Var.n.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    private Socket h() {
        w80 w80Var = this.j;
        if (w80Var == null || !w80Var.k) {
            return null;
        }
        return a(false, false, true);
    }

    private x80 i() {
        return m80.a.a(this.d);
    }

    public d90 a(d80 d80Var, a80.a aVar, boolean z) {
        try {
            d90 a2 = a(aVar.a(), aVar.b(), aVar.c(), d80Var.u(), d80Var.A(), z).a(d80Var, aVar, this);
            synchronized (this.d) {
                this.n = a2;
            }
            return a2;
        } catch (IOException e) {
            throw new y80(e);
        }
    }

    public Socket a(w80 w80Var) {
        if (this.n != null || this.j.n.size() != 1) {
            throw new IllegalStateException();
        }
        Reference<a90> reference = this.j.n.get(0);
        Socket a2 = a(true, false, false);
        this.j = w80Var;
        w80Var.n.add(reference);
        return a2;
    }

    public void a() {
        d90 d90Var;
        w80 w80Var;
        synchronized (this.d) {
            this.m = true;
            d90Var = this.n;
            w80Var = this.j;
        }
        if (d90Var != null) {
            d90Var.cancel();
        } else if (w80Var != null) {
            w80Var.b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x001c, code lost:
    
        if (r7 != defpackage.o90.CANCEL) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[Catch: all -> 0x0066, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:8:0x0012, B:11:0x001e, B:13:0x0048, B:15:0x0052, B:19:0x0058, B:28:0x001a, B:30:0x0021, B:32:0x0025, B:34:0x002d, B:36:0x0031, B:38:0x0037, B:41:0x003d), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.io.IOException r7) {
        /*
            r6 = this;
            p70 r0 = r6.d
            monitor-enter(r0)
            boolean r1 = r7 instanceof defpackage.aa0     // Catch: java.lang.Throwable -> L66
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L21
            aa0 r7 = (defpackage.aa0) r7     // Catch: java.lang.Throwable -> L66
            o90 r7 = r7.b     // Catch: java.lang.Throwable -> L66
            o90 r1 = defpackage.o90.REFUSED_STREAM     // Catch: java.lang.Throwable -> L66
            if (r7 != r1) goto L1a
            int r7 = r6.i     // Catch: java.lang.Throwable -> L66
            int r7 = r7 + r4
            r6.i = r7     // Catch: java.lang.Throwable -> L66
            if (r7 <= r4) goto L47
            goto L1e
        L1a:
            o90 r1 = defpackage.o90.CANCEL     // Catch: java.lang.Throwable -> L66
            if (r7 == r1) goto L47
        L1e:
            r6.c = r3     // Catch: java.lang.Throwable -> L66
            goto L45
        L21:
            w80 r1 = r6.j     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L47
            w80 r1 = r6.j     // Catch: java.lang.Throwable -> L66
            boolean r1 = r1.d()     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L31
            boolean r1 = r7 instanceof defpackage.n90     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L47
        L31:
            w80 r1 = r6.j     // Catch: java.lang.Throwable -> L66
            int r1 = r1.l     // Catch: java.lang.Throwable -> L66
            if (r1 != 0) goto L45
            k80 r1 = r6.c     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L1e
            if (r7 == 0) goto L1e
            z80 r1 = r6.h     // Catch: java.lang.Throwable -> L66
            k80 r5 = r6.c     // Catch: java.lang.Throwable -> L66
            r1.a(r5, r7)     // Catch: java.lang.Throwable -> L66
            goto L1e
        L45:
            r7 = 1
            goto L48
        L47:
            r7 = 0
        L48:
            w80 r1 = r6.j     // Catch: java.lang.Throwable -> L66
            java.net.Socket r7 = r6.a(r7, r2, r4)     // Catch: java.lang.Throwable -> L66
            w80 r2 = r6.j     // Catch: java.lang.Throwable -> L66
            if (r2 != 0) goto L58
            boolean r2 = r6.k     // Catch: java.lang.Throwable -> L66
            if (r2 != 0) goto L57
            goto L58
        L57:
            r3 = r1
        L58:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L66
            defpackage.o80.a(r7)
            if (r3 == 0) goto L65
            v70 r7 = r6.f
            k70 r0 = r6.e
            r7.b(r0, r3)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a90.a(java.io.IOException):void");
    }

    public void a(w80 w80Var, boolean z) {
        if (this.j != null) {
            throw new IllegalStateException();
        }
        this.j = w80Var;
        this.k = z;
        w80Var.n.add(new a(this, this.g));
    }

    public void a(boolean z, d90 d90Var, long j, IOException iOException) {
        w80 w80Var;
        Socket a2;
        boolean z2;
        this.f.b(this.e, j);
        synchronized (this.d) {
            if (d90Var != null) {
                if (d90Var == this.n) {
                    if (!z) {
                        this.j.l++;
                    }
                    w80Var = this.j;
                    a2 = a(z, false, true);
                    if (this.j != null) {
                        w80Var = null;
                    }
                    z2 = this.l;
                }
            }
            throw new IllegalStateException("expected " + this.n + " but was " + d90Var);
        }
        o80.a(a2);
        if (w80Var != null) {
            this.f.b(this.e, w80Var);
        }
        if (iOException != null) {
            this.f.a(this.e, m80.a.a(this.e, iOException));
        } else if (z2) {
            m80.a.a(this.e, (IOException) null);
            this.f.a(this.e);
        }
    }

    public d90 b() {
        d90 d90Var;
        synchronized (this.d) {
            d90Var = this.n;
        }
        return d90Var;
    }

    public synchronized w80 c() {
        return this.j;
    }

    public boolean d() {
        z80.a aVar;
        return this.c != null || ((aVar = this.b) != null && aVar.b()) || this.h.a();
    }

    public void e() {
        w80 w80Var;
        Socket a2;
        synchronized (this.d) {
            w80Var = this.j;
            a2 = a(true, false, false);
            if (this.j != null) {
                w80Var = null;
            }
        }
        o80.a(a2);
        if (w80Var != null) {
            this.f.b(this.e, w80Var);
        }
    }

    public void f() {
        w80 w80Var;
        Socket a2;
        synchronized (this.d) {
            w80Var = this.j;
            a2 = a(false, true, false);
            if (this.j != null) {
                w80Var = null;
            }
        }
        o80.a(a2);
        if (w80Var != null) {
            m80.a.a(this.e, (IOException) null);
            this.f.b(this.e, w80Var);
            this.f.a(this.e);
        }
    }

    public k80 g() {
        return this.c;
    }

    public String toString() {
        w80 c = c();
        return c != null ? c.toString() : this.a.toString();
    }
}
