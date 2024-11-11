package defpackage;

/* loaded from: classes.dex */
public final class yn implements n30<wn> {
    private static final yn a = new yn();

    public static yn a() {
        return a;
    }

    public static wn b() {
        wn a2 = xn.a();
        p30.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    @Override // defpackage.f70
    public wn get() {
        return b();
    }
}
