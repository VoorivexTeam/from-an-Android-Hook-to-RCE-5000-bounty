package p000;

import android.graphics.PointF;
import com.airbnb.lottie.C0540f;

/* renamed from: f7 */
/* loaded from: classes.dex */
public class C2461f7 implements InterfaceC3426x6 {

    /* renamed from: a */
    private final String f10089a;

    /* renamed from: b */
    private final InterfaceC3289u6<PointF, PointF> f10090b;

    /* renamed from: c */
    private final C2971n6 f10091c;

    /* renamed from: d */
    private final C2801j6 f10092d;

    /* renamed from: e */
    private final boolean f10093e;

    public C2461f7(String str, InterfaceC3289u6<PointF, PointF> interfaceC3289u6, C2971n6 c2971n6, C2801j6 c2801j6, boolean z) {
        this.f10089a = str;
        this.f10090b = interfaceC3289u6;
        this.f10091c = c2971n6;
        this.f10092d = c2801j6;
        this.f10093e = z;
    }

    /* renamed from: a */
    public C2801j6 m11693a() {
        return this.f10092d;
    }

    @Override // p000.InterfaceC3426x6
    /* renamed from: a */
    public InterfaceC3109q4 mo75a(C0540f c0540f, AbstractC2976n7 abstractC2976n7) {
        return new C0505c5(c0540f, abstractC2976n7, this);
    }

    /* renamed from: b */
    public String m11694b() {
        return this.f10089a;
    }

    /* renamed from: c */
    public InterfaceC3289u6<PointF, PointF> m11695c() {
        return this.f10090b;
    }

    /* renamed from: d */
    public C2971n6 m11696d() {
        return this.f10091c;
    }

    /* renamed from: e */
    public boolean m11697e() {
        return this.f10093e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f10090b + ", size=" + this.f10091c + '}';
    }
}
