package p000;

/* renamed from: um */
/* loaded from: classes.dex */
public final class C3311um implements n30<AbstractC3171rm> {

    /* renamed from: a */
    private static final C3311um f13499a = new C3311um();

    /* renamed from: a */
    public static C3311um m15844a() {
        return f13499a;
    }

    /* renamed from: b */
    public static AbstractC3171rm m15845b() {
        AbstractC3171rm m15446b = AbstractC3215sm.m15446b();
        p30.m14711a(m15446b, "Cannot return null from a non-@Nullable @Provides method");
        return m15446b;
    }

    @Override // p000.f70
    public AbstractC3171rm get() {
        return m15845b();
    }
}
