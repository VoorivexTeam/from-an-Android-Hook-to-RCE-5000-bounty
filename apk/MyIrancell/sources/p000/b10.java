package p000;

/* loaded from: classes.dex */
public class b10 {

    /* renamed from: a */
    private final int f2702a;

    /* renamed from: b */
    private final int f2703b;

    public b10(int i, int i2) {
        this.f2702a = i;
        this.f2703b = i2;
    }

    /* renamed from: a */
    public final int m3268a() {
        return this.f2703b;
    }

    /* renamed from: b */
    public final int m3269b() {
        return this.f2702a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b10)) {
            return false;
        }
        b10 b10Var = (b10) obj;
        return this.f2702a == b10Var.f2702a && this.f2703b == b10Var.f2703b;
    }

    public final int hashCode() {
        return this.f2702a ^ this.f2703b;
    }

    public final String toString() {
        return this.f2702a + "(" + this.f2703b + ')';
    }
}
