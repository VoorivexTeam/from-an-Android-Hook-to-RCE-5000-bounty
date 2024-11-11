package p000;

/* renamed from: hy */
/* loaded from: classes.dex */
public final class C2570hy extends AbstractC2914ly {

    /* renamed from: b */
    private final double f10526b;

    /* renamed from: c */
    private final double f10527c;

    /* renamed from: d */
    private final double f10528d;

    /* renamed from: e */
    private final String f10529e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2570hy(double d, double d2, double d3, String str) {
        super(EnumC2960my.GEO);
        this.f10526b = d;
        this.f10527c = d2;
        this.f10528d = d3;
        this.f10529e = str;
    }

    @Override // p000.AbstractC2914ly
    /* renamed from: a */
    public String mo3459a() {
        StringBuilder sb = new StringBuilder(20);
        sb.append(this.f10526b);
        sb.append(", ");
        sb.append(this.f10527c);
        if (this.f10528d > 0.0d) {
            sb.append(", ");
            sb.append(this.f10528d);
            sb.append('m');
        }
        if (this.f10529e != null) {
            sb.append(" (");
            sb.append(this.f10529e);
            sb.append(')');
        }
        return sb.toString();
    }

    /* renamed from: c */
    public String m12285c() {
        StringBuilder sb = new StringBuilder();
        sb.append("geo:");
        sb.append(this.f10526b);
        sb.append(',');
        sb.append(this.f10527c);
        if (this.f10528d > 0.0d) {
            sb.append(',');
            sb.append(this.f10528d);
        }
        if (this.f10529e != null) {
            sb.append('?');
            sb.append(this.f10529e);
        }
        return sb.toString();
    }

    /* renamed from: d */
    public double m12286d() {
        return this.f10526b;
    }

    /* renamed from: e */
    public double m12287e() {
        return this.f10527c;
    }
}
