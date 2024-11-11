package p000;

/* renamed from: fm */
/* loaded from: classes.dex */
final /* synthetic */ class RunnableC2478fm implements Runnable {

    /* renamed from: b */
    private final C2558hm f10136b;

    /* renamed from: c */
    private final AbstractC3266tl f10137c;

    /* renamed from: d */
    private final InterfaceC2900lk f10138d;

    /* renamed from: e */
    private final AbstractC3089pl f10139e;

    private RunnableC2478fm(C2558hm c2558hm, AbstractC3266tl abstractC3266tl, InterfaceC2900lk interfaceC2900lk, AbstractC3089pl abstractC3089pl) {
        this.f10136b = c2558hm;
        this.f10137c = abstractC3266tl;
        this.f10138d = interfaceC2900lk;
        this.f10139e = abstractC3089pl;
    }

    /* renamed from: a */
    public static Runnable m11793a(C2558hm c2558hm, AbstractC3266tl abstractC3266tl, InterfaceC2900lk interfaceC2900lk, AbstractC3089pl abstractC3089pl) {
        return new RunnableC2478fm(c2558hm, abstractC3266tl, interfaceC2900lk, abstractC3089pl);
    }

    @Override // java.lang.Runnable
    public void run() {
        C2558hm.m12238a(this.f10136b, this.f10137c, this.f10138d, this.f10139e);
    }
}
