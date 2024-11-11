package p000;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* renamed from: t9 */
/* loaded from: classes.dex */
public class C3243t9 {

    /* renamed from: a */
    private static PointF f13234a = new PointF();

    /* renamed from: a */
    public static double m15570a(double d, double d2, double d3) {
        return d + (d3 * (d2 - d));
    }

    /* renamed from: a */
    public static float m15571a(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m15572a(float f, float f2) {
        return m15579b((int) f, (int) f2);
    }

    /* renamed from: a */
    private static int m15573a(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    /* renamed from: a */
    public static int m15574a(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    /* renamed from: a */
    public static int m15575a(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    /* renamed from: a */
    public static PointF m15576a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: a */
    public static void m15577a(C2375d6 c2375d6, int i, List<C2375d6> list, C2375d6 c2375d62, InterfaceC3471y4 interfaceC3471y4) {
        if (c2375d6.m11284a(interfaceC3471y4.mo3318a(), i)) {
            list.add(c2375d62.m11282a(interfaceC3471y4.mo3318a()).m11281a(interfaceC3471y4));
        }
    }

    /* renamed from: a */
    public static void m15578a(C2540h7 c2540h7, Path path) {
        path.reset();
        PointF m12141b = c2540h7.m12141b();
        path.moveTo(m12141b.x, m12141b.y);
        f13234a.set(m12141b.x, m12141b.y);
        for (int i = 0; i < c2540h7.m12139a().size(); i++) {
            C3512z5 c3512z5 = c2540h7.m12139a().get(i);
            PointF m16770a = c3512z5.m16770a();
            PointF m16772b = c3512z5.m16772b();
            PointF m16774c = c3512z5.m16774c();
            if (m16770a.equals(f13234a) && m16772b.equals(m16774c)) {
                path.lineTo(m16774c.x, m16774c.y);
            } else {
                path.cubicTo(m16770a.x, m16770a.y, m16772b.x, m16772b.y, m16774c.x, m16774c.y);
            }
            f13234a.set(m16774c.x, m16774c.y);
        }
        if (c2540h7.m12142c()) {
            path.close();
        }
    }

    /* renamed from: b */
    private static int m15579b(int i, int i2) {
        return i - (i2 * m15573a(i, i2));
    }

    /* renamed from: b */
    public static boolean m15580b(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    /* renamed from: c */
    public static float m15581c(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }
}
