package p000;

/* renamed from: zn */
/* loaded from: classes.dex */
public final class C3535zn implements n30<InterfaceC3404wn> {

    /* renamed from: a */
    private static final C3535zn f14529a = new C3535zn();

    /* renamed from: a */
    public static C3535zn m16952a() {
        return f14529a;
    }

    /* renamed from: b */
    public static InterfaceC3404wn m16953b() {
        InterfaceC3404wn m16503b = AbstractC3444xn.m16503b();
        p30.m14711a(m16503b, "Cannot return null from a non-@Nullable @Provides method");
        return m16503b;
    }

    @Override // p000.f70
    public InterfaceC3404wn get() {
        return m16953b();
    }
}
