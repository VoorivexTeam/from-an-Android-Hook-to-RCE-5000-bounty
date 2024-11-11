package p000;

/* loaded from: classes.dex */
public abstract class t10 {

    /* renamed from: a */
    private final C2531gz f13169a;

    /* renamed from: b */
    private final c20 f13170b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t10(C2531gz c2531gz) {
        this.f13169a = c2531gz;
        this.f13170b = new c20(c2531gz);
    }

    /* renamed from: a */
    public static t10 m15480a(C2531gz c2531gz) {
        if (c2531gz.m12048a(1)) {
            return new q10(c2531gz);
        }
        if (!c2531gz.m12048a(2)) {
            return new u10(c2531gz);
        }
        int m3527a = c20.m3527a(c2531gz, 1, 4);
        if (m3527a == 4) {
            return new k10(c2531gz);
        }
        if (m3527a == 5) {
            return new l10(c2531gz);
        }
        int m3527a2 = c20.m3527a(c2531gz, 1, 5);
        if (m3527a2 == 12) {
            return new m10(c2531gz);
        }
        if (m3527a2 == 13) {
            return new n10(c2531gz);
        }
        switch (c20.m3527a(c2531gz, 1, 7)) {
            case 56:
                return new o10(c2531gz, "310", "11");
            case 57:
                return new o10(c2531gz, "320", "11");
            case 58:
                return new o10(c2531gz, "310", "13");
            case 59:
                return new o10(c2531gz, "320", "13");
            case 60:
                return new o10(c2531gz, "310", "15");
            case 61:
                return new o10(c2531gz, "320", "15");
            case 62:
                return new o10(c2531gz, "310", "17");
            case 63:
                return new o10(c2531gz, "320", "17");
            default:
                throw new IllegalStateException("unknown decoder: " + c2531gz);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final c20 m15481a() {
        return this.f13170b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final C2531gz m15482b() {
        return this.f13169a;
    }

    /* renamed from: c */
    public abstract String mo13993c();
}
