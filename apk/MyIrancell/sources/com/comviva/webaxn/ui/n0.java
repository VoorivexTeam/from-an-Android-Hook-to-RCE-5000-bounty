package com.comviva.webaxn.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;

/* loaded from: classes.dex */
public class n0 extends WebView {
    public n0(Context context) {
        super(context);
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }
}
