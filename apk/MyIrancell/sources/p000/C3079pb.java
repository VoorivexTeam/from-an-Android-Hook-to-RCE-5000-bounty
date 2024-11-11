package p000;

import com.bumptech.glide.load.InterfaceC0573g;

/* renamed from: pb */
/* loaded from: classes.dex */
class C3079pb<Z> implements InterfaceC3353vb<Z> {

    /* renamed from: b */
    private final boolean f12587b;

    /* renamed from: c */
    private final boolean f12588c;

    /* renamed from: d */
    private final InterfaceC3353vb<Z> f12589d;

    /* renamed from: e */
    private a f12590e;

    /* renamed from: f */
    private InterfaceC0573g f12591f;

    /* renamed from: g */
    private int f12592g;

    /* renamed from: h */
    private boolean f12593h;

    /* renamed from: pb$a */
    /* loaded from: classes.dex */
    interface a {
        /* renamed from: a */
        void mo13666a(InterfaceC0573g interfaceC0573g, C3079pb<?> c3079pb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3079pb(InterfaceC3353vb<Z> interfaceC3353vb, boolean z, boolean z2) {
        C2816ji.m13459a(interfaceC3353vb);
        this.f12589d = interfaceC3353vb;
        this.f12587b = z;
        this.f12588c = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m14744a() {
        if (this.f12593h) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f12592g++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m14745a(InterfaceC0573g interfaceC0573g, a aVar) {
        this.f12591f = interfaceC0573g;
        this.f12590e = aVar;
    }

    @Override // p000.InterfaceC3353vb
    /* renamed from: b */
    public synchronized void mo3383b() {
        if (this.f12592g > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f12593h) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f12593h = true;
        if (this.f12588c) {
            this.f12589d.mo3383b();
        }
    }

    @Override // p000.InterfaceC3353vb
    /* renamed from: c */
    public int mo3384c() {
        return this.f12589d.mo3384c();
    }

    @Override // p000.InterfaceC3353vb
    /* renamed from: d */
    public Class<Z> mo3385d() {
        return this.f12589d.mo3385d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public InterfaceC3353vb<Z> m14746e() {
        return this.f12589d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m14747f() {
        return this.f12587b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m14748g() {
        synchronized (this.f12590e) {
            synchronized (this) {
                if (this.f12592g <= 0) {
                    throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
                }
                int i = this.f12592g - 1;
                this.f12592g = i;
                if (i == 0) {
                    this.f12590e.mo13666a(this.f12591f, this);
                }
            }
        }
    }

    @Override // p000.InterfaceC3353vb
    public Z get() {
        return this.f12589d.get();
    }

    public synchronized String toString() {
        return "EngineResource{isCacheable=" + this.f12587b + ", listener=" + this.f12590e + ", key=" + this.f12591f + ", acquired=" + this.f12592g + ", isRecycled=" + this.f12593h + ", resource=" + this.f12589d + '}';
    }
}
