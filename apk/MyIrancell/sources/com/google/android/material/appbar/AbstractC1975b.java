package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import p000.C0447b2;
import p000.C2370d1;
import p000.C3107q2;
import p000.C3460y2;

/* renamed from: com.google.android.material.appbar.b */
/* loaded from: classes.dex */
abstract class AbstractC1975b extends C1976c<View> {

    /* renamed from: d */
    final Rect f8318d;

    /* renamed from: e */
    final Rect f8319e;

    /* renamed from: f */
    private int f8320f;

    /* renamed from: g */
    private int f8321g;

    public AbstractC1975b() {
        this.f8318d = new Rect();
        this.f8319e = new Rect();
        this.f8320f = 0;
    }

    public AbstractC1975b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8318d = new Rect();
        this.f8319e = new Rect();
        this.f8320f = 0;
    }

    /* renamed from: c */
    private static int m10043c(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final int m10044a(View view) {
        if (this.f8321g == 0) {
            return 0;
        }
        float mo10033b = mo10033b(view);
        int i = this.f8321g;
        return C2370d1.m11244a((int) (mo10033b * i), 0, i);
    }

    /* renamed from: a */
    abstract View mo10032a(List<View> list);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
    /* renamed from: a */
    public boolean mo1305a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View mo10032a;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (mo10032a = mo10032a(coordinatorLayout.m1282b(view))) == null) {
            return false;
        }
        if (C3107q2.m14916h(mo10032a) && !C3107q2.m14916h(view)) {
            C3107q2.m14898a(view, true);
            if (C3107q2.m14916h(view)) {
                view.requestLayout();
                return true;
            }
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size == 0) {
            size = coordinatorLayout.getHeight();
        }
        coordinatorLayout.m1274a(view, i, i2, View.MeasureSpec.makeMeasureSpec((size - mo10032a.getMeasuredHeight()) + mo10034c(mo10032a), i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    /* renamed from: b */
    abstract float mo10033b(View view);

    /* renamed from: b */
    public final void m10045b(int i) {
        this.f8321g = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.appbar.C1976c
    /* renamed from: b */
    public void mo10046b(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        View mo10032a = mo10032a(coordinatorLayout.m1282b(view));
        if (mo10032a != null) {
            CoordinatorLayout.C0217f c0217f = (CoordinatorLayout.C0217f) view.getLayoutParams();
            Rect rect = this.f8318d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0217f).leftMargin, mo10032a.getBottom() + ((ViewGroup.MarginLayoutParams) c0217f).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0217f).rightMargin, ((coordinatorLayout.getHeight() + mo10032a.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0217f).bottomMargin);
            C3460y2 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C3107q2.m14916h(coordinatorLayout) && !C3107q2.m14916h(view)) {
                rect.left += lastWindowInsets.m16556b();
                rect.right -= lastWindowInsets.m16557c();
            }
            Rect rect2 = this.f8319e;
            C0447b2.m3271a(m10043c(c0217f.f1349c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int m10044a = m10044a(mo10032a);
            view.layout(rect2.left, rect2.top - m10044a, rect2.right, rect2.bottom - m10044a);
            i2 = rect2.top - mo10032a.getBottom();
        } else {
            super.mo10046b(coordinatorLayout, (CoordinatorLayout) view, i);
            i2 = 0;
        }
        this.f8320f = i2;
    }

    /* renamed from: c */
    public final int m10047c() {
        return this.f8321g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo10034c(View view) {
        return view.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final int m10048d() {
        return this.f8320f;
    }
}
