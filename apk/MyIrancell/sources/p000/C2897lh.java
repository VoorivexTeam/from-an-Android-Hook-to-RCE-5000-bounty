package p000;

/* renamed from: lh */
/* loaded from: classes.dex */
public class C2897lh implements InterfaceC2513gh, InterfaceC2473fh {

    /* renamed from: b */
    private final InterfaceC2513gh f11873b;

    /* renamed from: c */
    private InterfaceC2473fh f11874c;

    /* renamed from: d */
    private InterfaceC2473fh f11875d;

    /* renamed from: e */
    private boolean f11876e;

    C2897lh() {
        this(null);
    }

    public C2897lh(InterfaceC2513gh interfaceC2513gh) {
        this.f11873b = interfaceC2513gh;
    }

    /* renamed from: h */
    private boolean m13861h() {
        InterfaceC2513gh interfaceC2513gh = this.f11873b;
        return interfaceC2513gh == null || interfaceC2513gh.mo11610f(this);
    }

    /* renamed from: i */
    private boolean m13862i() {
        InterfaceC2513gh interfaceC2513gh = this.f11873b;
        return interfaceC2513gh == null || interfaceC2513gh.mo11604c(this);
    }

    /* renamed from: j */
    private boolean m13863j() {
        InterfaceC2513gh interfaceC2513gh = this.f11873b;
        return interfaceC2513gh == null || interfaceC2513gh.mo11606d(this);
    }

    /* renamed from: k */
    private boolean m13864k() {
        InterfaceC2513gh interfaceC2513gh = this.f11873b;
        return interfaceC2513gh != null && interfaceC2513gh.mo11608e();
    }

    @Override // p000.InterfaceC2473fh
    /* renamed from: a */
    public void mo11598a() {
        this.f11876e = true;
        if (!this.f11874c.mo11611g() && !this.f11875d.isRunning()) {
            this.f11875d.mo11598a();
        }
        if (!this.f11876e || this.f11874c.isRunning()) {
            return;
        }
        this.f11874c.mo11598a();
    }

    @Override // p000.InterfaceC2513gh
    /* renamed from: a */
    public void mo11599a(InterfaceC2473fh interfaceC2473fh) {
        InterfaceC2513gh interfaceC2513gh;
        if (interfaceC2473fh.equals(this.f11874c) && (interfaceC2513gh = this.f11873b) != null) {
            interfaceC2513gh.mo11599a(this);
        }
    }

    /* renamed from: a */
    public void m13865a(InterfaceC2473fh interfaceC2473fh, InterfaceC2473fh interfaceC2473fh2) {
        this.f11874c = interfaceC2473fh;
        this.f11875d = interfaceC2473fh2;
    }

    @Override // p000.InterfaceC2473fh
    /* renamed from: b */
    public void mo11601b() {
        this.f11874c.mo11601b();
        this.f11875d.mo11601b();
    }

    @Override // p000.InterfaceC2473fh
    /* renamed from: b */
    public boolean mo11602b(InterfaceC2473fh interfaceC2473fh) {
        if (!(interfaceC2473fh instanceof C2897lh)) {
            return false;
        }
        C2897lh c2897lh = (C2897lh) interfaceC2473fh;
        InterfaceC2473fh interfaceC2473fh2 = this.f11874c;
        if (interfaceC2473fh2 == null) {
            if (c2897lh.f11874c != null) {
                return false;
            }
        } else if (!interfaceC2473fh2.mo11602b(c2897lh.f11874c)) {
            return false;
        }
        InterfaceC2473fh interfaceC2473fh3 = this.f11875d;
        InterfaceC2473fh interfaceC2473fh4 = c2897lh.f11875d;
        if (interfaceC2473fh3 == null) {
            if (interfaceC2473fh4 != null) {
                return false;
            }
        } else if (!interfaceC2473fh3.mo11602b(interfaceC2473fh4)) {
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC2473fh
    /* renamed from: c */
    public boolean mo11603c() {
        return this.f11874c.mo11603c();
    }

    @Override // p000.InterfaceC2513gh
    /* renamed from: c */
    public boolean mo11604c(InterfaceC2473fh interfaceC2473fh) {
        return m13862i() && interfaceC2473fh.equals(this.f11874c) && !mo11608e();
    }

    @Override // p000.InterfaceC2473fh
    public void clear() {
        this.f11876e = false;
        this.f11875d.clear();
        this.f11874c.clear();
    }

    @Override // p000.InterfaceC2473fh
    /* renamed from: d */
    public boolean mo11605d() {
        return this.f11874c.mo11605d();
    }

    @Override // p000.InterfaceC2513gh
    /* renamed from: d */
    public boolean mo11606d(InterfaceC2473fh interfaceC2473fh) {
        return m13863j() && (interfaceC2473fh.equals(this.f11874c) || !this.f11874c.mo11609f());
    }

    @Override // p000.InterfaceC2513gh
    /* renamed from: e */
    public void mo11607e(InterfaceC2473fh interfaceC2473fh) {
        if (interfaceC2473fh.equals(this.f11875d)) {
            return;
        }
        InterfaceC2513gh interfaceC2513gh = this.f11873b;
        if (interfaceC2513gh != null) {
            interfaceC2513gh.mo11607e(this);
        }
        if (this.f11875d.mo11611g()) {
            return;
        }
        this.f11875d.clear();
    }

    @Override // p000.InterfaceC2513gh
    /* renamed from: e */
    public boolean mo11608e() {
        return m13864k() || mo11609f();
    }

    @Override // p000.InterfaceC2473fh
    /* renamed from: f */
    public boolean mo11609f() {
        return this.f11874c.mo11609f() || this.f11875d.mo11609f();
    }

    @Override // p000.InterfaceC2513gh
    /* renamed from: f */
    public boolean mo11610f(InterfaceC2473fh interfaceC2473fh) {
        return m13861h() && interfaceC2473fh.equals(this.f11874c);
    }

    @Override // p000.InterfaceC2473fh
    /* renamed from: g */
    public boolean mo11611g() {
        return this.f11874c.mo11611g() || this.f11875d.mo11611g();
    }

    @Override // p000.InterfaceC2473fh
    public boolean isRunning() {
        return this.f11874c.isRunning();
    }
}
