package p000;

import java.util.List;

/* renamed from: c6 */
/* loaded from: classes.dex */
public class C0506c6 {

    /* renamed from: a */
    private final List<C2802j7> f2954a;

    /* renamed from: b */
    private final char f2955b;

    /* renamed from: c */
    private final double f2956c;

    /* renamed from: d */
    private final String f2957d;

    /* renamed from: e */
    private final String f2958e;

    public C0506c6(List<C2802j7> list, char c, double d, double d2, String str, String str2) {
        this.f2954a = list;
        this.f2955b = c;
        this.f2956c = d2;
        this.f2957d = str;
        this.f2958e = str2;
    }

    /* renamed from: a */
    public static int m3595a(char c, String str, String str2) {
        return ((((0 + c) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    /* renamed from: a */
    public List<C2802j7> m3596a() {
        return this.f2954a;
    }

    /* renamed from: b */
    public double m3597b() {
        return this.f2956c;
    }

    public int hashCode() {
        return m3595a(this.f2955b, this.f2958e, this.f2957d);
    }
}
