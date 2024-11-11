package com.google.android.material.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: com.google.android.material.internal.c */
/* loaded from: classes.dex */
public class C2004c {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f8537a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f8538b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m10256a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m10258b(viewGroup, view, rect);
    }

    /* renamed from: a */
    private static void m10257a(ViewParent viewParent, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            m10257a(viewParent, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }

    /* renamed from: b */
    public static void m10258b(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = f8537a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f8537a.set(matrix);
        } else {
            matrix.reset();
        }
        m10257a(viewGroup, view, matrix);
        RectF rectF = f8538b.get();
        if (rectF == null) {
            rectF = new RectF();
            f8538b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
