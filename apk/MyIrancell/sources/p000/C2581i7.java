package p000;

import android.graphics.Path;
import com.airbnb.lottie.C0540f;

/* renamed from: i7 */
/* loaded from: classes.dex */
public class C2581i7 implements InterfaceC3426x6 {

    /* renamed from: a */
    private final boolean f10569a;

    /* renamed from: b */
    private final Path.FillType f10570b;

    /* renamed from: c */
    private final String f10571c;

    /* renamed from: d */
    private final C2580i6 f10572d;

    /* renamed from: e */
    private final C2886l6 f10573e;

    /* renamed from: f */
    private final boolean f10574f;

    public C2581i7(String str, boolean z, Path.FillType fillType, C2580i6 c2580i6, C2886l6 c2886l6, boolean z2) {
        this.f10571c = str;
        this.f10569a = z;
        this.f10570b = fillType;
        this.f10572d = c2580i6;
        this.f10573e = c2886l6;
        this.f10574f = z2;
    }

    /* renamed from: a */
    public C2580i6 m12379a() {
        return this.f10572d;
    }

    @Override // p000.InterfaceC3426x6
    /* renamed from: a */
    public InterfaceC3109q4 mo75a(C0540f c0540f, AbstractC2976n7 abstractC2976n7) {
        return new C3286u4(c0540f, abstractC2976n7, this);
    }

    /* renamed from: b */
    public Path.FillType m12380b() {
        return this.f10570b;
    }

    /* renamed from: c */
    public String m12381c() {
        return this.f10571c;
    }

    /* renamed from: d */
    public C2886l6 m12382d() {
        return this.f10573e;
    }

    /* renamed from: e */
    public boolean m12383e() {
        return this.f10574f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f10569a + '}';
    }
}
