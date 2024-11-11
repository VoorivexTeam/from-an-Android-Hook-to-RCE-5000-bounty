package p000;

/* renamed from: yn */
/* loaded from: classes.dex */
public final class C3493yn implements n30<InterfaceC3404wn> {

    /* renamed from: a */
    private static final C3493yn f14275a = new C3493yn();

    /* renamed from: a */
    public static C3493yn m16655a() {
        return f14275a;
    }

    /* renamed from: b */
    public static InterfaceC3404wn m16656b() {
        InterfaceC3404wn m16502a = AbstractC3444xn.m16502a();
        p30.m14711a(m16502a, "Cannot return null from a non-@Nullable @Provides method");
        return m16502a;
    }

    @Override // p000.f70
    public InterfaceC3404wn get() {
        return m16656b();
    }
}
