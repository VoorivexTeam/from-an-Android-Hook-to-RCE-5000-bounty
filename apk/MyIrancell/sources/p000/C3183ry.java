package p000;

/* renamed from: ry */
/* loaded from: classes.dex */
public final class C3183ry extends AbstractC2914ly {

    /* renamed from: b */
    private final String[] f12993b;

    /* renamed from: c */
    private final String f12994c;

    /* renamed from: d */
    private final String f12995d;

    public C3183ry(String str, String str2, String str3, String str4) {
        super(EnumC2960my.SMS);
        this.f12993b = new String[]{str};
        this.f12994c = str3;
        this.f12995d = str4;
    }

    public C3183ry(String[] strArr, String[] strArr2, String str, String str2) {
        super(EnumC2960my.SMS);
        this.f12993b = strArr;
        this.f12994c = str;
        this.f12995d = str2;
    }

    @Override // p000.AbstractC2914ly
    /* renamed from: a */
    public String mo3459a() {
        StringBuilder sb = new StringBuilder(100);
        AbstractC2914ly.m13943a(this.f12993b, sb);
        AbstractC2914ly.m13942a(this.f12994c, sb);
        AbstractC2914ly.m13942a(this.f12995d, sb);
        return sb.toString();
    }

    /* renamed from: c */
    public String m15296c() {
        return this.f12995d;
    }

    /* renamed from: d */
    public String[] m15297d() {
        return this.f12993b;
    }

    /* renamed from: e */
    public String m15298e() {
        return this.f12994c;
    }
}
