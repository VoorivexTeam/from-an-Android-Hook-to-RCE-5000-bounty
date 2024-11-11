package p000;

import com.airbnb.lottie.C0540f;
import java.util.Arrays;
import java.util.List;

/* renamed from: j7 */
/* loaded from: classes.dex */
public class C2802j7 implements InterfaceC3426x6 {

    /* renamed from: a */
    private final String f11461a;

    /* renamed from: b */
    private final List<InterfaceC3426x6> f11462b;

    /* renamed from: c */
    private final boolean f11463c;

    public C2802j7(String str, List<InterfaceC3426x6> list, boolean z) {
        this.f11461a = str;
        this.f11462b = list;
        this.f11463c = z;
    }

    /* renamed from: a */
    public List<InterfaceC3426x6> m13404a() {
        return this.f11462b;
    }

    @Override // p000.InterfaceC3426x6
    /* renamed from: a */
    public InterfaceC3109q4 mo75a(C0540f c0540f, AbstractC2976n7 abstractC2976n7) {
        return new C3151r4(c0540f, abstractC2976n7, this);
    }

    /* renamed from: b */
    public String m13405b() {
        return this.f11461a;
    }

    /* renamed from: c */
    public boolean m13406c() {
        return this.f11463c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f11461a + "' Shapes: " + Arrays.toString(this.f11462b.toArray()) + '}';
    }
}
