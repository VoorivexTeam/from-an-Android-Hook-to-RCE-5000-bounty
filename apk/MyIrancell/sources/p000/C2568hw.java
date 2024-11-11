package p000;

/* renamed from: hw */
/* loaded from: classes.dex */
public class C2568hw {

    /* renamed from: a */
    private final float f10514a;

    /* renamed from: b */
    private final float f10515b;

    public C2568hw(float f, float f2) {
        this.f10514a = f;
        this.f10515b = f2;
    }

    /* renamed from: a */
    public static float m12245a(C2568hw c2568hw, C2568hw c2568hw2) {
        return C3228sz.m15459a(c2568hw.f10514a, c2568hw.f10515b, c2568hw2.f10514a, c2568hw2.f10515b);
    }

    /* renamed from: a */
    private static float m12246a(C2568hw c2568hw, C2568hw c2568hw2, C2568hw c2568hw3) {
        float f = c2568hw2.f10514a;
        float f2 = c2568hw2.f10515b;
        return ((c2568hw3.f10514a - f) * (c2568hw.f10515b - f2)) - ((c2568hw3.f10515b - f2) * (c2568hw.f10514a - f));
    }

    /* renamed from: a */
    public static void m12247a(C2568hw[] c2568hwArr) {
        C2568hw c2568hw;
        C2568hw c2568hw2;
        C2568hw c2568hw3;
        float m12245a = m12245a(c2568hwArr[0], c2568hwArr[1]);
        float m12245a2 = m12245a(c2568hwArr[1], c2568hwArr[2]);
        float m12245a3 = m12245a(c2568hwArr[0], c2568hwArr[2]);
        if (m12245a2 >= m12245a && m12245a2 >= m12245a3) {
            c2568hw = c2568hwArr[0];
            c2568hw2 = c2568hwArr[1];
            c2568hw3 = c2568hwArr[2];
        } else if (m12245a3 < m12245a2 || m12245a3 < m12245a) {
            c2568hw = c2568hwArr[2];
            c2568hw2 = c2568hwArr[0];
            c2568hw3 = c2568hwArr[1];
        } else {
            c2568hw = c2568hwArr[1];
            c2568hw2 = c2568hwArr[0];
            c2568hw3 = c2568hwArr[2];
        }
        if (m12246a(c2568hw2, c2568hw, c2568hw3) < 0.0f) {
            C2568hw c2568hw4 = c2568hw3;
            c2568hw3 = c2568hw2;
            c2568hw2 = c2568hw4;
        }
        c2568hwArr[0] = c2568hw2;
        c2568hwArr[1] = c2568hw;
        c2568hwArr[2] = c2568hw3;
    }

    /* renamed from: a */
    public final float m12248a() {
        return this.f10514a;
    }

    /* renamed from: b */
    public final float m12249b() {
        return this.f10515b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2568hw)) {
            return false;
        }
        C2568hw c2568hw = (C2568hw) obj;
        return this.f10514a == c2568hw.f10514a && this.f10515b == c2568hw.f10515b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f10514a) * 31) + Float.floatToIntBits(this.f10515b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(25);
        sb.append('(');
        sb.append(this.f10514a);
        sb.append(',');
        sb.append(this.f10515b);
        sb.append(')');
        return sb.toString();
    }
}
