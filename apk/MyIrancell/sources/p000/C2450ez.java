package p000;

/* renamed from: ez */
/* loaded from: classes.dex */
public final class C2450ez extends AbstractC2914ly {

    /* renamed from: b */
    private final String f10046b;

    /* renamed from: c */
    private final String f10047c;

    /* renamed from: d */
    private final String f10048d;

    /* renamed from: e */
    private final boolean f10049e;

    public C2450ez(String str, String str2, String str3, boolean z) {
        super(EnumC2960my.WIFI);
        this.f10046b = str2;
        this.f10047c = str;
        this.f10048d = str3;
        this.f10049e = z;
    }

    @Override // p000.AbstractC2914ly
    /* renamed from: a */
    public String mo3459a() {
        StringBuilder sb = new StringBuilder(80);
        AbstractC2914ly.m13942a(this.f10046b, sb);
        AbstractC2914ly.m13942a(this.f10047c, sb);
        AbstractC2914ly.m13942a(this.f10048d, sb);
        AbstractC2914ly.m13942a(Boolean.toString(this.f10049e), sb);
        return sb.toString();
    }

    /* renamed from: c */
    public String m11641c() {
        return this.f10047c;
    }

    /* renamed from: d */
    public String m11642d() {
        return this.f10048d;
    }

    /* renamed from: e */
    public String m11643e() {
        return this.f10046b;
    }

    /* renamed from: f */
    public boolean m11644f() {
        return this.f10049e;
    }
}
