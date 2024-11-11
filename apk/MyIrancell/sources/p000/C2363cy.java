package p000;

/* renamed from: cy */
/* loaded from: classes.dex */
public final class C2363cy extends AbstractC2914ly {

    /* renamed from: b */
    private final String[] f9603b;

    /* renamed from: c */
    private final String[] f9604c;

    /* renamed from: d */
    private final String[] f9605d;

    /* renamed from: e */
    private final String f9606e;

    /* renamed from: f */
    private final String f9607f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2363cy(String str) {
        this(new String[]{str}, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2363cy(String[] strArr, String[] strArr2, String[] strArr3, String str, String str2) {
        super(EnumC2960my.EMAIL_ADDRESS);
        this.f9603b = strArr;
        this.f9604c = strArr2;
        this.f9605d = strArr3;
        this.f9606e = str;
        this.f9607f = str2;
    }

    @Override // p000.AbstractC2914ly
    /* renamed from: a */
    public String mo3459a() {
        StringBuilder sb = new StringBuilder(30);
        AbstractC2914ly.m13943a(this.f9603b, sb);
        AbstractC2914ly.m13943a(this.f9604c, sb);
        AbstractC2914ly.m13943a(this.f9605d, sb);
        AbstractC2914ly.m13942a(this.f9606e, sb);
        AbstractC2914ly.m13942a(this.f9607f, sb);
        return sb.toString();
    }

    /* renamed from: c */
    public String[] m11215c() {
        return this.f9605d;
    }

    /* renamed from: d */
    public String m11216d() {
        return this.f9607f;
    }

    /* renamed from: e */
    public String[] m11217e() {
        return this.f9604c;
    }

    /* renamed from: f */
    public String m11218f() {
        return this.f9606e;
    }

    /* renamed from: g */
    public String[] m11219g() {
        return this.f9603b;
    }
}
