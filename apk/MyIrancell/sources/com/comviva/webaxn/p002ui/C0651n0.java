package com.comviva.webaxn.p002ui;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;

/* renamed from: com.comviva.webaxn.ui.n0 */
/* loaded from: classes.dex */
public class C0651n0 extends WebView {
    public C0651n0(Context context) {
        super(context);
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }
}
