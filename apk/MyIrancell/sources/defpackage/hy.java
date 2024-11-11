package defpackage;

/* loaded from: classes.dex */
public final class hy extends ly {
    private final double b;
    private final double c;
    private final double d;
    private final String e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public hy(double d, double d2, double d3, String str) {
        super(my.GEO);
        this.b = d;
        this.c = d2;
        this.d = d3;
        this.e = str;
    }

    @Override // defpackage.ly
    public String a() {
        StringBuilder sb = new StringBuilder(20);
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        if (this.d > 0.0d) {
            sb.append(", ");
            sb.append(this.d);
            sb.append('m');
        }
        if (this.e != null) {
            sb.append(" (");
            sb.append(this.e);
            sb.append(')');
        }
        return sb.toString();
    }

    public String c() {
        StringBuilder sb = new StringBuilder();
        sb.append("geo:");
        sb.append(this.b);
        sb.append(',');
        sb.append(this.c);
        if (this.d > 0.0d) {
            sb.append(',');
            sb.append(this.d);
        }
        if (this.e != null) {
            sb.append('?');
            sb.append(this.e);
        }
        return sb.toString();
    }

    public double d() {
        return this.b;
    }

    public double e() {
        return this.c;
    }
}
