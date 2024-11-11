package p000;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.airbnb.lottie.C0538d;
import java.lang.ref.WeakReference;
import p000.AbstractC2852k9;

/* renamed from: o8 */
/* loaded from: classes.dex */
class C3018o8 {

    /* renamed from: b */
    private static C2795j0<WeakReference<Interpolator>> f12425b;

    /* renamed from: a */
    private static final Interpolator f12424a = new LinearInterpolator();

    /* renamed from: c */
    static AbstractC2852k9.a f12426c = AbstractC2852k9.a.m13650a("t", "s", "e", "o", "i", "h", "to", "ti");

    C3018o8() {
    }

    /* renamed from: a */
    private static C2795j0<WeakReference<Interpolator>> m14433a() {
        if (f12425b == null) {
            f12425b = new C2795j0<>();
        }
        return f12425b;
    }

    /* renamed from: a */
    private static WeakReference<Interpolator> m14434a(int i) {
        WeakReference<Interpolator> m13281b;
        synchronized (C3018o8.class) {
            m13281b = m14433a().m13281b(i);
        }
        return m13281b;
    }

    /* renamed from: a */
    private static <T> C3346v9<T> m14435a(C0538d c0538d, AbstractC2852k9 abstractC2852k9, float f, InterfaceC2545h9<T> interfaceC2545h9) {
        Interpolator interpolator;
        abstractC2852k9.mo13638c();
        PointF pointF = null;
        PointF pointF2 = null;
        T t = null;
        T t2 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        boolean z = false;
        float f2 = 0.0f;
        while (abstractC2852k9.mo13642h()) {
            switch (abstractC2852k9.mo13634a(f12426c)) {
                case 0:
                    f2 = (float) abstractC2852k9.mo13644j();
                    break;
                case 1:
                    t = interfaceC2545h9.mo101a(abstractC2852k9, f);
                    break;
                case 2:
                    t2 = interfaceC2545h9.mo101a(abstractC2852k9, f);
                    break;
                case 3:
                    pointF = C2978n8.m14298d(abstractC2852k9, f);
                    break;
                case 4:
                    pointF2 = C2978n8.m14298d(abstractC2852k9, f);
                    break;
                case 5:
                    if (abstractC2852k9.mo13645k() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 6:
                    pointF3 = C2978n8.m14298d(abstractC2852k9, f);
                    break;
                case 7:
                    pointF4 = C2978n8.m14298d(abstractC2852k9, f);
                    break;
                default:
                    abstractC2852k9.mo13649o();
                    break;
            }
        }
        abstractC2852k9.mo13640e();
        if (z) {
            interpolator = f12424a;
            t2 = t;
        } else if (pointF == null || pointF2 == null) {
            interpolator = f12424a;
        } else {
            float f3 = -f;
            pointF.x = C3243t9.m15571a(pointF.x, f3, f);
            pointF.y = C3243t9.m15571a(pointF.y, -100.0f, 100.0f);
            pointF2.x = C3243t9.m15571a(pointF2.x, f3, f);
            float m15571a = C3243t9.m15571a(pointF2.y, -100.0f, 100.0f);
            pointF2.y = m15571a;
            int m15756a = C3295u9.m15756a(pointF.x, pointF.y, pointF2.x, m15571a);
            WeakReference<Interpolator> m14434a = m14434a(m15756a);
            Interpolator interpolator2 = m14434a != null ? m14434a.get() : null;
            if (m14434a == null || interpolator2 == null) {
                interpolator2 = C2455f3.m11672a(pointF.x / f, pointF.y / f, pointF2.x / f, pointF2.y / f);
                try {
                    m14438a(m15756a, new WeakReference(interpolator2));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
            interpolator = interpolator2;
        }
        C3346v9<T> c3346v9 = new C3346v9<>(c0538d, t, t2, interpolator, f2, null);
        c3346v9.f13642m = pointF3;
        c3346v9.f13643n = pointF4;
        return c3346v9;
    }

    /* renamed from: a */
    private static <T> C3346v9<T> m14436a(AbstractC2852k9 abstractC2852k9, float f, InterfaceC2545h9<T> interfaceC2545h9) {
        return new C3346v9<>(interfaceC2545h9.mo101a(abstractC2852k9, f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> C3346v9<T> m14437a(AbstractC2852k9 abstractC2852k9, C0538d c0538d, float f, InterfaceC2545h9<T> interfaceC2545h9, boolean z) {
        return z ? m14435a(c0538d, abstractC2852k9, f, interfaceC2545h9) : m14436a(abstractC2852k9, f, interfaceC2545h9);
    }

    /* renamed from: a */
    private static void m14438a(int i, WeakReference<Interpolator> weakReference) {
        synchronized (C3018o8.class) {
            f12425b.m13284c(i, weakReference);
        }
    }
}
