package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.e;

/* loaded from: classes.dex */
public class a {
    private e.b a;

    public a(SwipeDismissBehavior<?> swipeDismissBehavior) {
        swipeDismissBehavior.b(0.1f);
        swipeDismissBehavior.a(0.6f);
        swipeDismissBehavior.a(0);
    }

    public void a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (coordinatorLayout.a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                e.a().a(this.a);
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            e.a().b(this.a);
        }
    }

    public boolean a(View view) {
        return view instanceof d;
    }
}
