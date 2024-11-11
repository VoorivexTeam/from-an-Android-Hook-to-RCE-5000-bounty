package defpackage;

/* loaded from: classes.dex */
public final class yx extends ly {
    private final String[] b;
    private final String[] c;
    private final String d;
    private final String[] e;
    private final String[] f;
    private final String[] g;
    private final String[] h;
    private final String i;
    private final String j;
    private final String[] k;
    private final String[] l;
    private final String m;
    private final String n;
    private final String o;
    private final String[] p;
    private final String[] q;

    public yx(String[] strArr, String[] strArr2, String str, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String str2, String str3, String[] strArr7, String[] strArr8, String str4, String str5, String str6, String[] strArr9, String[] strArr10) {
        super(my.ADDRESSBOOK);
        this.b = strArr;
        this.c = strArr2;
        this.d = str;
        this.e = strArr3;
        this.f = strArr4;
        this.g = strArr5;
        this.h = strArr6;
        this.i = str2;
        this.j = str3;
        this.k = strArr7;
        this.l = strArr8;
        this.m = str4;
        this.n = str5;
        this.o = str6;
        this.p = strArr9;
        this.q = strArr10;
    }

    @Override // defpackage.ly
    public String a() {
        StringBuilder sb = new StringBuilder(100);
        ly.a(this.b, sb);
        ly.a(this.c, sb);
        ly.a(this.d, sb);
        ly.a(this.o, sb);
        ly.a(this.m, sb);
        ly.a(this.k, sb);
        ly.a(this.e, sb);
        ly.a(this.g, sb);
        ly.a(this.i, sb);
        ly.a(this.p, sb);
        ly.a(this.n, sb);
        ly.a(this.q, sb);
        ly.a(this.j, sb);
        return sb.toString();
    }

    public String[] c() {
        return this.l;
    }

    public String[] d() {
        return this.k;
    }

    public String e() {
        return this.n;
    }

    public String[] f() {
        return this.h;
    }

    public String[] g() {
        return this.g;
    }

    public String[] h() {
        return this.q;
    }

    public String i() {
        return this.i;
    }

    public String[] j() {
        return this.b;
    }

    public String[] k() {
        return this.c;
    }

    public String l() {
        return this.j;
    }

    public String m() {
        return this.m;
    }

    public String[] n() {
        return this.e;
    }

    public String[] o() {
        return this.f;
    }

    public String p() {
        return this.d;
    }

    public String q() {
        return this.o;
    }

    public String[] r() {
        return this.p;
    }
}
