package defpackage;

/* loaded from: classes.dex */
public final class ez extends ly {
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;

    public ez(String str, String str2, String str3, boolean z) {
        super(my.WIFI);
        this.b = str2;
        this.c = str;
        this.d = str3;
        this.e = z;
    }

    @Override // defpackage.ly
    public String a() {
        StringBuilder sb = new StringBuilder(80);
        ly.a(this.b, sb);
        ly.a(this.c, sb);
        ly.a(this.d, sb);
        ly.a(Boolean.toString(this.e), sb);
        return sb.toString();
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public String e() {
        return this.b;
    }

    public boolean f() {
        return this.e;
    }
}
