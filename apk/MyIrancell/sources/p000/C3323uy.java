package p000;

/* renamed from: uy */
/* loaded from: classes.dex */
public final class C3323uy extends AbstractC2914ly {

    /* renamed from: b */
    private final String f13513b;

    /* renamed from: c */
    private final String f13514c;

    /* renamed from: d */
    private final String f13515d;

    public C3323uy(String str, String str2, String str3) {
        super(EnumC2960my.TEL);
        this.f13513b = str;
        this.f13514c = str2;
        this.f13515d = str3;
    }

    @Override // p000.AbstractC2914ly
    /* renamed from: a */
    public String mo3459a() {
        StringBuilder sb = new StringBuilder(20);
        AbstractC2914ly.m13942a(this.f13513b, sb);
        AbstractC2914ly.m13942a(this.f13515d, sb);
        return sb.toString();
    }

    /* renamed from: c */
    public String m15873c() {
        return this.f13513b;
    }

    /* renamed from: d */
    public String m15874d() {
        return this.f13514c;
    }
}
