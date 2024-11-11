package p000;

import android.graphics.PointF;
import com.airbnb.lottie.C0540f;

/* renamed from: e7 */
/* loaded from: classes.dex */
public class C2419e7 implements InterfaceC3426x6 {

    /* renamed from: a */
    private final String f9936a;

    /* renamed from: b */
    private final a f9937b;

    /* renamed from: c */
    private final C2801j6 f9938c;

    /* renamed from: d */
    private final InterfaceC3289u6<PointF, PointF> f9939d;

    /* renamed from: e */
    private final C2801j6 f9940e;

    /* renamed from: f */
    private final C2801j6 f9941f;

    /* renamed from: g */
    private final C2801j6 f9942g;

    /* renamed from: h */
    private final C2801j6 f9943h;

    /* renamed from: i */
    private final C2801j6 f9944i;

    /* renamed from: j */
    private final boolean f9945j;

    /* renamed from: e7$a */
    /* loaded from: classes.dex */
    public enum a {
        STAR(1),
        POLYGON(2);

        private final int value;

        a(int i) {
            this.value = i;
        }

        public static a forValue(int i) {
            for (a aVar : values()) {
                if (aVar.value == i) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public C2419e7(String str, a aVar, C2801j6 c2801j6, InterfaceC3289u6<PointF, PointF> interfaceC3289u6, C2801j6 c2801j62, C2801j6 c2801j63, C2801j6 c2801j64, C2801j6 c2801j65, C2801j6 c2801j66, boolean z) {
        this.f9936a = str;
        this.f9937b = aVar;
        this.f9938c = c2801j6;
        this.f9939d = interfaceC3289u6;
        this.f9940e = c2801j62;
        this.f9941f = c2801j63;
        this.f9942g = c2801j64;
        this.f9943h = c2801j65;
        this.f9944i = c2801j66;
        this.f9945j = z;
    }

    /* renamed from: a */
    public C2801j6 m11554a() {
        return this.f9941f;
    }

    @Override // p000.InterfaceC3426x6
    /* renamed from: a */
    public InterfaceC3109q4 mo75a(C0540f c0540f, AbstractC2976n7 abstractC2976n7) {
        return new C0450b5(c0540f, abstractC2976n7, this);
    }

    /* renamed from: b */
    public C2801j6 m11555b() {
        return this.f9943h;
    }

    /* renamed from: c */
    public String m11556c() {
        return this.f9936a;
    }

    /* renamed from: d */
    public C2801j6 m11557d() {
        return this.f9942g;
    }

    /* renamed from: e */
    public C2801j6 m11558e() {
        return this.f9944i;
    }

    /* renamed from: f */
    public C2801j6 m11559f() {
        return this.f9938c;
    }

    /* renamed from: g */
    public InterfaceC3289u6<PointF, PointF> m11560g() {
        return this.f9939d;
    }

    /* renamed from: h */
    public C2801j6 m11561h() {
        return this.f9940e;
    }

    /* renamed from: i */
    public a m11562i() {
        return this.f9937b;
    }

    /* renamed from: j */
    public boolean m11563j() {
        return this.f9945j;
    }
}
