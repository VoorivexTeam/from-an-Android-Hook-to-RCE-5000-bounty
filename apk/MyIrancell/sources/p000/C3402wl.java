package p000;

import p000.AbstractC3214sl;

/* renamed from: wl */
/* loaded from: classes.dex */
final class C3402wl<T> implements InterfaceC2818jk<T> {

    /* renamed from: a */
    private final AbstractC3266tl f13957a;

    /* renamed from: b */
    private final String f13958b;

    /* renamed from: c */
    private final C2476fk f13959c;

    /* renamed from: d */
    private final InterfaceC2598ik<T, byte[]> f13960d;

    /* renamed from: e */
    private final InterfaceC3442xl f13961e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3402wl(AbstractC3266tl abstractC3266tl, String str, C2476fk c2476fk, InterfaceC2598ik<T, byte[]> interfaceC2598ik, InterfaceC3442xl interfaceC3442xl) {
        this.f13957a = abstractC3266tl;
        this.f13958b = str;
        this.f13959c = c2476fk;
        this.f13960d = interfaceC2598ik;
        this.f13961e = interfaceC3442xl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ void m16381a(Exception exc) {
    }

    @Override // p000.InterfaceC2818jk
    /* renamed from: a */
    public void mo10741a(AbstractC2516gk<T> abstractC2516gk) {
        m16382a(abstractC2516gk, C3363vl.m16038a());
    }

    /* renamed from: a */
    public void m16382a(AbstractC2516gk<T> abstractC2516gk, InterfaceC2900lk interfaceC2900lk) {
        InterfaceC3442xl interfaceC3442xl = this.f13961e;
        AbstractC3214sl.a m15443g = AbstractC3214sl.m15443g();
        m15443g.mo13509a(this.f13957a);
        m15443g.mo13506a((AbstractC2516gk<?>) abstractC2516gk);
        m15443g.mo13508a(this.f13958b);
        m15443g.mo13507a((InterfaceC2598ik<?, byte[]>) this.f13960d);
        m15443g.mo13505a(this.f13959c);
        interfaceC3442xl.mo16500a(m15443g.mo13510a(), interfaceC2900lk);
    }
}
