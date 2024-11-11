package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.C2016e;

/* renamed from: com.google.android.material.snackbar.a */
/* loaded from: classes.dex */
public class C2012a {

    /* renamed from: a */
    private C2016e.b f8563a;

    public C2012a(SwipeDismissBehavior<?> swipeDismissBehavior) {
        swipeDismissBehavior.m10068b(0.1f);
        swipeDismissBehavior.m10065a(0.6f);
        swipeDismissBehavior.m10066a(0);
    }

    /* renamed from: a */
    public void m10280a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (coordinatorLayout.m1281a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                C2016e.m10284a().m10288a(this.f8563a);
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            C2016e.m10284a().m10290b(this.f8563a);
        }
    }

    /* renamed from: a */
    public boolean m10281a(View view) {
        return view instanceof C2015d;
    }
}
