package defpackage;

/* loaded from: classes.dex */
public final class ry extends ly {
    private final String[] b;
    private final String c;
    private final String d;

    public ry(String str, String str2, String str3, String str4) {
        super(my.SMS);
        this.b = new String[]{str};
        this.c = str3;
        this.d = str4;
    }

    public ry(String[] strArr, String[] strArr2, String str, String str2) {
        super(my.SMS);
        this.b = strArr;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.ly
    public String a() {
        StringBuilder sb = new StringBuilder(100);
        ly.a(this.b, sb);
        ly.a(this.c, sb);
        ly.a(this.d, sb);
        return sb.toString();
    }

    public String c() {
        return this.d;
    }

    public String[] d() {
        return this.b;
    }

    public String e() {
        return this.c;
    }
}
