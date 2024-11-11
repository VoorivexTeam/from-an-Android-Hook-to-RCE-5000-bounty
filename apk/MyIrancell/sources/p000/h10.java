package p000;

/* loaded from: classes.dex */
final class h10 {

    /* renamed from: a */
    private final b10 f10367a;

    /* renamed from: b */
    private final b10 f10368b;

    /* renamed from: c */
    private final c10 f10369c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h10(b10 b10Var, b10 b10Var2, c10 c10Var, boolean z) {
        this.f10367a = b10Var;
        this.f10368b = b10Var2;
        this.f10369c = c10Var;
    }

    /* renamed from: a */
    private static int m12079a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: a */
    private static boolean m12080a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public c10 m12081a() {
        return this.f10369c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public b10 m12082b() {
        return this.f10367a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public b10 m12083c() {
        return this.f10368b;
    }

    /* renamed from: d */
    public boolean m12084d() {
        return this.f10368b == null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h10)) {
            return false;
        }
        h10 h10Var = (h10) obj;
        return m12080a(this.f10367a, h10Var.f10367a) && m12080a(this.f10368b, h10Var.f10368b) && m12080a(this.f10369c, h10Var.f10369c);
    }

    public int hashCode() {
        return (m12079a(this.f10367a) ^ m12079a(this.f10368b)) ^ m12079a(this.f10369c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        sb.append(this.f10367a);
        sb.append(" , ");
        sb.append(this.f10368b);
        sb.append(" : ");
        c10 c10Var = this.f10369c;
        sb.append(c10Var == null ? "null" : Integer.valueOf(c10Var.m3520c()));
        sb.append(" ]");
        return sb.toString();
    }
}
