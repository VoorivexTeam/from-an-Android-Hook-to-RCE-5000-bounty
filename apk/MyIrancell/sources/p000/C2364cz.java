package p000;

/* renamed from: cz */
/* loaded from: classes.dex */
public final class C2364cz extends AbstractC2914ly {

    /* renamed from: b */
    private final String f9608b;

    /* renamed from: c */
    private final String f9609c;

    /* renamed from: d */
    private final String f9610d;

    /* renamed from: e */
    private final String f9611e;

    /* renamed from: f */
    private final int f9612f;

    /* renamed from: g */
    private final char f9613g;

    /* renamed from: h */
    private final String f9614h;

    public C2364cz(String str, String str2, String str3, String str4, String str5, String str6, int i, char c, String str7) {
        super(EnumC2960my.VIN);
        this.f9608b = str2;
        this.f9609c = str3;
        this.f9610d = str4;
        this.f9611e = str5;
        this.f9612f = i;
        this.f9613g = c;
        this.f9614h = str7;
    }

    @Override // p000.AbstractC2914ly
    /* renamed from: a */
    public String mo3459a() {
        StringBuilder sb = new StringBuilder(50);
        sb.append(this.f9608b);
        sb.append(' ');
        sb.append(this.f9609c);
        sb.append(' ');
        sb.append(this.f9610d);
        sb.append('\n');
        String str = this.f9611e;
        if (str != null) {
            sb.append(str);
            sb.append(' ');
        }
        sb.append(this.f9612f);
        sb.append(' ');
        sb.append(this.f9613g);
        sb.append(' ');
        sb.append(this.f9614h);
        sb.append('\n');
        return sb.toString();
    }
}
