package defpackage;

/* loaded from: classes.dex */
public class b10 {
    private final int a;
    private final int b;

    public b10(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b10)) {
            return false;
        }
        b10 b10Var = (b10) obj;
        return this.a == b10Var.a && this.b == b10Var.b;
    }

    public final int hashCode() {
        return this.a ^ this.b;
    }

    public final String toString() {
        return this.a + "(" + this.b + ')';
    }
}
