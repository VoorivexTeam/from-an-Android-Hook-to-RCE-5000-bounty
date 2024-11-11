package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: k */
    private final C2012a f8558k = new C2012a(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* renamed from: a */
    public boolean mo10067a(View view) {
        return this.f8558k.m10281a(view);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
    /* renamed from: a */
    public boolean mo1308a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f8558k.m10280a(coordinatorLayout, view, motionEvent);
        return super.mo1308a(coordinatorLayout, (CoordinatorLayout) view, motionEvent);
    }
}
