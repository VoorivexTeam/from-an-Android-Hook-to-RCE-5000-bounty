package defpackage;

/* loaded from: classes.dex */
public abstract class t10 {
    private final gz a;
    private final c20 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t10(gz gzVar) {
        this.a = gzVar;
        this.b = new c20(gzVar);
    }

    public static t10 a(gz gzVar) {
        if (gzVar.a(1)) {
            return new q10(gzVar);
        }
        if (!gzVar.a(2)) {
            return new u10(gzVar);
        }
        int a = c20.a(gzVar, 1, 4);
        if (a == 4) {
            return new k10(gzVar);
        }
        if (a == 5) {
            return new l10(gzVar);
        }
        int a2 = c20.a(gzVar, 1, 5);
        if (a2 == 12) {
            return new m10(gzVar);
        }
        if (a2 == 13) {
            return new n10(gzVar);
        }
        switch (c20.a(gzVar, 1, 7)) {
            case 56:
                return new o10(gzVar, "310", "11");
            case 57:
                return new o10(gzVar, "320", "11");
            case 58:
                return new o10(gzVar, "310", "13");
            case 59:
                return new o10(gzVar, "320", "13");
            case 60:
                return new o10(gzVar, "310", "15");
            case 61:
                return new o10(gzVar, "320", "15");
            case 62:
                return new o10(gzVar, "310", "17");
            case 63:
                return new o10(gzVar, "320", "17");
            default:
                throw new IllegalStateException("unknown decoder: " + gzVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final c20 a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final gz b() {
        return this.a;
    }

    public abstract String c();
}
