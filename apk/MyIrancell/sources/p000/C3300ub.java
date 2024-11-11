package p000;

import p000.C2898li;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ub */
/* loaded from: classes.dex */
public final class C3300ub<Z> implements InterfaceC3353vb<Z>, C2898li.f {

    /* renamed from: f */
    private static final InterfaceC3283u1<C3300ub<?>> f13457f = C2898li.m13868a(20, new a());

    /* renamed from: b */
    private final AbstractC2990ni f13458b = AbstractC2990ni.m14334b();

    /* renamed from: c */
    private InterfaceC3353vb<Z> f13459c;

    /* renamed from: d */
    private boolean f13460d;

    /* renamed from: e */
    private boolean f13461e;

    /* renamed from: ub$a */
    /* loaded from: classes.dex */
    class a implements C2898li.d<C3300ub<?>> {
        a() {
        }

        @Override // p000.C2898li.d
        /* renamed from: a, reason: avoid collision after fix types in other method */
        public C3300ub<?> mo13672a() {
            return new C3300ub<>();
        }
    }

    C3300ub() {
    }

    /* renamed from: a */
    private void m15785a(InterfaceC3353vb<Z> interfaceC3353vb) {
        this.f13461e = false;
        this.f13460d = true;
        this.f13459c = interfaceC3353vb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <Z> C3300ub<Z> m15786b(InterfaceC3353vb<Z> interfaceC3353vb) {
        C3300ub mo13874a = f13457f.mo13874a();
        C2816ji.m13459a(mo13874a);
        C3300ub c3300ub = mo13874a;
        c3300ub.m15785a(interfaceC3353vb);
        return c3300ub;
    }

    /* renamed from: f */
    private void m15787f() {
        this.f13459c = null;
        f13457f.mo13875a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m15788a() {
        this.f13458b.mo14335a();
        if (!this.f13460d) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f13460d = false;
        if (this.f13461e) {
            mo3383b();
        }
    }

    @Override // p000.InterfaceC3353vb
    /* renamed from: b */
    public synchronized void mo3383b() {
        this.f13458b.mo14335a();
        this.f13461e = true;
        if (!this.f13460d) {
            this.f13459c.mo3383b();
            m15787f();
        }
    }

    @Override // p000.InterfaceC3353vb
    /* renamed from: c */
    public int mo3384c() {
        return this.f13459c.mo3384c();
    }

    @Override // p000.InterfaceC3353vb
    /* renamed from: d */
    public Class<Z> mo3385d() {
        return this.f13459c.mo3385d();
    }

    @Override // p000.C2898li.f
    /* renamed from: e */
    public AbstractC2990ni mo12179e() {
        return this.f13458b;
    }

    @Override // p000.InterfaceC3353vb
    public Z get() {
        return this.f13459c.get();
    }
}
