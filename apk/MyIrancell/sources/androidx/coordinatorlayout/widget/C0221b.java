package androidx.coordinatorlayout.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: androidx.coordinatorlayout.widget.b */
/* loaded from: classes.dex */
public class C0221b {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f1369a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f1370b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m1353a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m1355b(viewGroup, view, rect);
    }

    /* renamed from: a */
    private static void m1354a(ViewParent viewParent, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            m1354a(viewParent, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }

    /* renamed from: b */
    static void m1355b(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = f1369a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f1369a.set(matrix);
        } else {
            matrix.reset();
        }
        m1354a(viewGroup, view, matrix);
        RectF rectF = f1370b.get();
        if (rectF == null) {
            rectF = new RectF();
            f1370b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
