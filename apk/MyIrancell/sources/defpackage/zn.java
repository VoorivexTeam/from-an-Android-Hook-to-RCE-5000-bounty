package defpackage;

/* loaded from: classes.dex */
public final class zn implements n30<wn> {
    private static final zn a = new zn();

    public static zn a() {
        return a;
    }

    public static wn b() {
        wn b = xn.b();
        p30.a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    @Override // defpackage.f70
    public wn get() {
        return b();
    }
}
