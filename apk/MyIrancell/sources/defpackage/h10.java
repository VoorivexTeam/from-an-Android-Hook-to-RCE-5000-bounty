package defpackage;

/* loaded from: classes.dex */
final class h10 {
    private final b10 a;
    private final b10 b;
    private final c10 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h10(b10 b10Var, b10 b10Var2, c10 c10Var, boolean z) {
        this.a = b10Var;
        this.b = b10Var2;
        this.c = c10Var;
    }

    private static int a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c10 a() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b10 b() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b10 c() {
        return this.b;
    }

    public boolean d() {
        return this.b == null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h10)) {
            return false;
        }
        h10 h10Var = (h10) obj;
        return a(this.a, h10Var.a) && a(this.b, h10Var.b) && a(this.c, h10Var.c);
    }

    public int hashCode() {
        return (a(this.a) ^ a(this.b)) ^ a(this.c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        sb.append(this.a);
        sb.append(" , ");
        sb.append(this.b);
        sb.append(" : ");
        c10 c10Var = this.c;
        sb.append(c10Var == null ? "null" : Integer.valueOf(c10Var.c()));
        sb.append(" ]");
        return sb.toString();
    }
}
