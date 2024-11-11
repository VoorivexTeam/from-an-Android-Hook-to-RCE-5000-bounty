package defpackage;

/* loaded from: classes.dex */
public final class um implements n30<rm> {
    private static final um a = new um();

    public static um a() {
        return a;
    }

    public static rm b() {
        rm b = sm.b();
        p30.a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    @Override // defpackage.f70
    public rm get() {
        return b();
    }
}
