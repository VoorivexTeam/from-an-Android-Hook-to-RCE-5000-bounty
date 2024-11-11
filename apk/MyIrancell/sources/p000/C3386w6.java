package p000;

import android.graphics.PointF;
import com.airbnb.lottie.C0540f;

/* renamed from: w6 */
/* loaded from: classes.dex */
public class C3386w6 implements InterfaceC3426x6 {

    /* renamed from: a */
    private final String f13770a;

    /* renamed from: b */
    private final InterfaceC3289u6<PointF, PointF> f13771b;

    /* renamed from: c */
    private final C2971n6 f13772c;

    /* renamed from: d */
    private final boolean f13773d;

    /* renamed from: e */
    private final boolean f13774e;

    public C3386w6(String str, InterfaceC3289u6<PointF, PointF> interfaceC3289u6, C2971n6 c2971n6, boolean z, boolean z2) {
        this.f13770a = str;
        this.f13771b = interfaceC3289u6;
        this.f13772c = c2971n6;
        this.f13773d = z;
        this.f13774e = z2;
    }

    /* renamed from: a */
    public String m16136a() {
        return this.f13770a;
    }

    @Override // p000.InterfaceC3426x6
    /* renamed from: a */
    public InterfaceC3109q4 mo75a(C0540f c0540f, AbstractC2976n7 abstractC2976n7) {
        return new C3234t4(c0540f, abstractC2976n7, this);
    }

    /* renamed from: b */
    public InterfaceC3289u6<PointF, PointF> m16137b() {
        return this.f13771b;
    }

    /* renamed from: c */
    public C2971n6 m16138c() {
        return this.f13772c;
    }

    /* renamed from: d */
    public boolean m16139d() {
        return this.f13774e;
    }

    /* renamed from: e */
    public boolean m16140e() {
        return this.f13773d;
    }
}
