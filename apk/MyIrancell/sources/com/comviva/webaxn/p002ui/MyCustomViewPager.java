package com.comviva.webaxn.p002ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes.dex */
public class MyCustomViewPager extends ViewPager {

    /* renamed from: l0 */
    private boolean f3347l0;

    public MyCustomViewPager(Context context) {
        super(context);
    }

    public MyCustomViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean canScrollHorizontally(int i) {
        return !this.f3347l0 && super.canScrollHorizontally(i);
    }

    public boolean getSwipeLocked() {
        return this.f3347l0;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.f3347l0 && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.f3347l0 && super.onTouchEvent(motionEvent);
    }

    public void setSwipeLocked(boolean z) {
        this.f3347l0 = z;
    }
}
