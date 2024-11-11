package defpackage;

/* loaded from: classes.dex */
public final class cy extends ly {
    private final String[] b;
    private final String[] c;
    private final String[] d;
    private final String e;
    private final String f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cy(String str) {
        this(new String[]{str}, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public cy(String[] strArr, String[] strArr2, String[] strArr3, String str, String str2) {
        super(my.EMAIL_ADDRESS);
        this.b = strArr;
        this.c = strArr2;
        this.d = strArr3;
        this.e = str;
        this.f = str2;
    }

    @Override // defpackage.ly
    public String a() {
        StringBuilder sb = new StringBuilder(30);
        ly.a(this.b, sb);
        ly.a(this.c, sb);
        ly.a(this.d, sb);
        ly.a(this.e, sb);
        ly.a(this.f, sb);
        return sb.toString();
    }

    public String[] c() {
        return this.d;
    }

    public String d() {
        return this.f;
    }

    public String[] e() {
        return this.c;
    }

    public String f() {
        return this.e;
    }

    public String[] g() {
        return this.b;
    }
}
