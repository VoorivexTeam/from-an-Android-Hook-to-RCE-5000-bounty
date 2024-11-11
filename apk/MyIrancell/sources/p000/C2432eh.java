package p000;

/* renamed from: eh */
/* loaded from: classes.dex */
public final class C2432eh implements InterfaceC2513gh, InterfaceC2473fh {

    /* renamed from: b */
    private final InterfaceC2513gh f10012b;

    /* renamed from: c */
    private InterfaceC2473fh f10013c;

    /* renamed from: d */
    private InterfaceC2473fh f10014d;

    public C2432eh(InterfaceC2513gh interfaceC2513gh) {
        this.f10012b = interfaceC2513gh;
    }

    /* renamed from: g */
    private boolean m11593g(InterfaceC2473fh interfaceC2473fh) {
        return interfaceC2473fh.equals(this.f10013c) || (this.f10013c.mo11603c() && interfaceC2473fh.equals(this.f10014d));
    }

    /* renamed from: h */
    private boolean m11594h() {
        InterfaceC2513gh interfaceC2513gh = this.f10012b;
        return interfaceC2513gh == null || interfaceC2513gh.mo11610f(this);
    }

    /* renamed from: i */
    private boolean m11595i() {
        InterfaceC2513gh interfaceC2513gh = this.f10012b;
        return interfaceC2513gh == null || interfaceC2513gh.mo11604c(this);
    }

    /* renamed from: j */
    private boolean m11596j() {
        InterfaceC2513gh interfaceC2513gh = this.f10012b;
        return interfaceC2513gh == null || interfaceC2513gh.mo11606d(this);
    }

    /* renamed from: k */
    private boolean m11597k() {
        InterfaceC2513gh interfaceC2513gh = this.f10012b;
        return interfaceC2513gh != null && interfaceC2513gh.mo11608e();
    }

    @Override // p000.InterfaceC2473fh
    /* renamed from: a */
    public void mo11598a() {
        if (this.f10013c.isRunning()) {
            return;
        }
        this.f10013c.mo11598a();
    }

    @Override // p000.InterfaceC2513gh
    /* renamed from: a */
    public void mo11599a(InterfaceC2473fh interfaceC2473fh) {
        if (!interfaceC2473fh.equals(this.f10014d)) {
            if (this.f10014d.isRunning()) {
                return;
            }
            this.f10014d.mo11598a();
        } else {
            InterfaceC2513gh interfaceC2513gh = this.f10012b;
            if (interfaceC2513gh != null) {
                interfaceC2513gh.mo11599a(this);
            }
        }
    }

    /* renamed from: a */
    public void m11600a(InterfaceC2473fh interfaceC2473fh, InterfaceC2473fh interfaceC2473fh2) {
        this.f10013c = interfaceC2473fh;
        this.f10014d = interfaceC2473fh2;
    }

    @Override // p000.InterfaceC2473fh
    /* renamed from: b */
    public void mo11601b() {
        this.f10013c.mo11601b();
        this.f10014d.mo11601b();
    }

    @Override // p000.InterfaceC2473fh
    /* renamed from: b */
    public boolean mo11602b(InterfaceC2473fh interfaceC2473fh) {
        if (!(interfaceC2473fh instanceof C2432eh)) {
            return false;
        }
        C2432eh c2432eh = (C2432eh) interfaceC2473fh;
        return this.f10013c.mo11602b(c2432eh.f10013c) && this.f10014d.mo11602b(c2432eh.f10014d);
    }

    @Override // p000.InterfaceC2473fh
    /* renamed from: c */
    public boolean mo11603c() {
        return this.f10013c.mo11603c() && this.f10014d.mo11603c();
    }

    @Override // p000.InterfaceC2513gh
    /* renamed from: c */
    public boolean mo11604c(InterfaceC2473fh interfaceC2473fh) {
        return m11595i() && m11593g(interfaceC2473fh);
    }

    @Override // p000.InterfaceC2473fh
    public void clear() {
        this.f10013c.clear();
        if (this.f10014d.isRunning()) {
            this.f10014d.clear();
        }
    }

    @Override // p000.InterfaceC2473fh
    /* renamed from: d */
    public boolean mo11605d() {
        return (this.f10013c.mo11603c() ? this.f10014d : this.f10013c).mo11605d();
    }

    @Override // p000.InterfaceC2513gh
    /* renamed from: d */
    public boolean mo11606d(InterfaceC2473fh interfaceC2473fh) {
        return m11596j() && m11593g(interfaceC2473fh);
    }

    @Override // p000.InterfaceC2513gh
    /* renamed from: e */
    public void mo11607e(InterfaceC2473fh interfaceC2473fh) {
        InterfaceC2513gh interfaceC2513gh = this.f10012b;
        if (interfaceC2513gh != null) {
            interfaceC2513gh.mo11607e(this);
        }
    }

    @Override // p000.InterfaceC2513gh
    /* renamed from: e */
    public boolean mo11608e() {
        return m11597k() || mo11609f();
    }

    @Override // p000.InterfaceC2473fh
    /* renamed from: f */
    public boolean mo11609f() {
        return (this.f10013c.mo11603c() ? this.f10014d : this.f10013c).mo11609f();
    }

    @Override // p000.InterfaceC2513gh
    /* renamed from: f */
    public boolean mo11610f(InterfaceC2473fh interfaceC2473fh) {
        return m11594h() && m11593g(interfaceC2473fh);
    }

    @Override // p000.InterfaceC2473fh
    /* renamed from: g */
    public boolean mo11611g() {
        return (this.f10013c.mo11603c() ? this.f10014d : this.f10013c).mo11611g();
    }

    @Override // p000.InterfaceC2473fh
    public boolean isRunning() {
        return (this.f10013c.mo11603c() ? this.f10014d : this.f10013c).isRunning();
    }
}
