package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class t9 {
    private static PointF a = new PointF();

    public static double a(double d, double d2, double d3) {
        return d + (d3 * (d2 - d));
    }

    public static float a(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(float f, float f2) {
        return b((int) f, (int) f2);
    }

    private static int a(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    public static int a(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    public static int a(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void a(d6 d6Var, int i, List<d6> list, d6 d6Var2, y4 y4Var) {
        if (d6Var.a(y4Var.a(), i)) {
            list.add(d6Var2.a(y4Var.a()).a(y4Var));
        }
    }

    public static void a(h7 h7Var, Path path) {
        path.reset();
        PointF b = h7Var.b();
        path.moveTo(b.x, b.y);
        a.set(b.x, b.y);
        for (int i = 0; i < h7Var.a().size(); i++) {
            z5 z5Var = h7Var.a().get(i);
            PointF a2 = z5Var.a();
            PointF b2 = z5Var.b();
            PointF c = z5Var.c();
            if (a2.equals(a) && b2.equals(c)) {
                path.lineTo(c.x, c.y);
            } else {
                path.cubicTo(a2.x, a2.y, b2.x, b2.y, c.x, c.y);
            }
            a.set(c.x, c.y);
        }
        if (h7Var.c()) {
            path.close();
        }
    }

    private static int b(int i, int i2) {
        return i - (i2 * a(i, i2));
    }

    public static boolean b(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    public static float c(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }
}
