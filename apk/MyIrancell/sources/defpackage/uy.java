package defpackage;

/* loaded from: classes.dex */
public final class uy extends ly {
    private final String b;
    private final String c;
    private final String d;

    public uy(String str, String str2, String str3) {
        super(my.TEL);
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // defpackage.ly
    public String a() {
        StringBuilder sb = new StringBuilder(20);
        ly.a(this.b, sb);
        ly.a(this.d, sb);
        return sb.toString();
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }
}
