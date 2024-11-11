package p000;

import com.airbnb.lottie.C0540f;

/* renamed from: k7 */
/* loaded from: classes.dex */
public class C2849k7 implements InterfaceC3426x6 {

    /* renamed from: a */
    private final String f11656a;

    /* renamed from: b */
    private final int f11657b;

    /* renamed from: c */
    private final C3072p6 f11658c;

    /* renamed from: d */
    private final boolean f11659d;

    public C2849k7(String str, int i, C3072p6 c3072p6, boolean z) {
        this.f11656a = str;
        this.f11657b = i;
        this.f11658c = c3072p6;
        this.f11659d = z;
    }

    /* renamed from: a */
    public String m13623a() {
        return this.f11656a;
    }

    @Override // p000.InterfaceC3426x6
    /* renamed from: a */
    public InterfaceC3109q4 mo75a(C0540f c0540f, AbstractC2976n7 abstractC2976n7) {
        return new C2417e5(c0540f, abstractC2976n7, this);
    }

    /* renamed from: b */
    public C3072p6 m13624b() {
        return this.f11658c;
    }

    /* renamed from: c */
    public boolean m13625c() {
        return this.f11659d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f11656a + ", index=" + this.f11657b + '}';
    }
}
