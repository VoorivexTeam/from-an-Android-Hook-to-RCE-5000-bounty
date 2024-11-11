package p000;

/* loaded from: classes.dex */
public final class c10 {

    /* renamed from: a */
    private final int f2893a;

    /* renamed from: b */
    private final int[] f2894b;

    /* renamed from: c */
    private final C2568hw[] f2895c;

    public c10(int i, int[] iArr, int i2, int i3, int i4) {
        this.f2893a = i;
        this.f2894b = iArr;
        float f = i4;
        this.f2895c = new C2568hw[]{new C2568hw(i2, f), new C2568hw(i3, f)};
    }

    /* renamed from: a */
    public C2568hw[] m3518a() {
        return this.f2895c;
    }

    /* renamed from: b */
    public int[] m3519b() {
        return this.f2894b;
    }

    /* renamed from: c */
    public int m3520c() {
        return this.f2893a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c10) && this.f2893a == ((c10) obj).f2893a;
    }

    public int hashCode() {
        return this.f2893a;
    }
}
