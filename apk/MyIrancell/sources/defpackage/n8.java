package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import defpackage.k9;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class n8 {
    private static final k9.a a = k9.a.a("x", "y");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[k9.b.values().length];
            a = iArr;
            try {
                iArr[k9.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[k9.b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[k9.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(k9 k9Var) {
        k9Var.a();
        int j = (int) (k9Var.j() * 255.0d);
        int j2 = (int) (k9Var.j() * 255.0d);
        int j3 = (int) (k9Var.j() * 255.0d);
        while (k9Var.h()) {
            k9Var.o();
        }
        k9Var.d();
        return Color.argb(255, j, j2, j3);
    }

    private static PointF a(k9 k9Var, float f) {
        k9Var.a();
        float j = (float) k9Var.j();
        float j2 = (float) k9Var.j();
        while (k9Var.peek() != k9.b.END_ARRAY) {
            k9Var.o();
        }
        k9Var.d();
        return new PointF(j * f, j2 * f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float b(k9 k9Var) {
        k9.b peek = k9Var.peek();
        int i = a.a[peek.ordinal()];
        if (i == 1) {
            return (float) k9Var.j();
        }
        if (i != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + peek);
        }
        k9Var.a();
        float j = (float) k9Var.j();
        while (k9Var.h()) {
            k9Var.o();
        }
        k9Var.d();
        return j;
    }

    private static PointF b(k9 k9Var, float f) {
        float j = (float) k9Var.j();
        float j2 = (float) k9Var.j();
        while (k9Var.h()) {
            k9Var.o();
        }
        return new PointF(j * f, j2 * f);
    }

    private static PointF c(k9 k9Var, float f) {
        k9Var.c();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (k9Var.h()) {
            int a2 = k9Var.a(a);
            if (a2 == 0) {
                f2 = b(k9Var);
            } else if (a2 != 1) {
                k9Var.n();
                k9Var.o();
            } else {
                f3 = b(k9Var);
            }
        }
        k9Var.e();
        return new PointF(f2 * f, f3 * f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PointF d(k9 k9Var, float f) {
        int i = a.a[k9Var.peek().ordinal()];
        if (i == 1) {
            return b(k9Var, f);
        }
        if (i == 2) {
            return a(k9Var, f);
        }
        if (i == 3) {
            return c(k9Var, f);
        }
        throw new IllegalArgumentException("Unknown point starts with " + k9Var.peek());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<PointF> e(k9 k9Var, float f) {
        ArrayList arrayList = new ArrayList();
        k9Var.a();
        while (k9Var.peek() == k9.b.BEGIN_ARRAY) {
            k9Var.a();
            arrayList.add(d(k9Var, f));
            k9Var.d();
        }
        k9Var.d();
        return arrayList;
    }
}
