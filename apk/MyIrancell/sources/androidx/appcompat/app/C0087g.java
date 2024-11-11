package androidx.appcompat.app;

/* renamed from: androidx.appcompat.app.g */
/* loaded from: classes.dex */
class C0087g {

    /* renamed from: d */
    private static C0087g f428d;

    /* renamed from: a */
    public long f429a;

    /* renamed from: b */
    public long f430b;

    /* renamed from: c */
    public int f431c;

    C0087g() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0087g m508a() {
        if (f428d == null) {
            f428d = new C0087g();
        }
        return f428d;
    }

    /* renamed from: a */
    public void m509a(long j, double d, double d2) {
        float f = ((float) (j - 946728000000L)) / 8.64E7f;
        double d3 = (0.01720197f * f) + 6.24006f;
        double sin = Math.sin(d3) * 0.03341960161924362d;
        Double.isNaN(d3);
        double sin2 = sin + d3 + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double d4 = (-d2) / 360.0d;
        double d5 = f - 9.0E-4f;
        Double.isNaN(d5);
        double round = ((float) Math.round(d5 - d4)) + 9.0E-4f;
        Double.isNaN(round);
        double sin3 = round + d4 + (Math.sin(d3) * 0.0053d) + (Math.sin(2.0d * sin2) * (-0.0069d));
        double asin = Math.asin(Math.sin(sin2) * Math.sin(0.4092797040939331d));
        double d6 = 0.01745329238474369d * d;
        double sin4 = (Math.sin(-0.10471975803375244d) - (Math.sin(d6) * Math.sin(asin))) / (Math.cos(d6) * Math.cos(asin));
        if (sin4 >= 1.0d) {
            this.f431c = 1;
        } else {
            if (sin4 > -1.0d) {
                double acos = (float) (Math.acos(sin4) / 6.283185307179586d);
                Double.isNaN(acos);
                this.f429a = Math.round((sin3 + acos) * 8.64E7d) + 946728000000L;
                Double.isNaN(acos);
                long round2 = Math.round((sin3 - acos) * 8.64E7d) + 946728000000L;
                this.f430b = round2;
                if (round2 >= j || this.f429a <= j) {
                    this.f431c = 1;
                    return;
                } else {
                    this.f431c = 0;
                    return;
                }
            }
            this.f431c = 0;
        }
        this.f429a = -1L;
        this.f430b = -1L;
    }
}
