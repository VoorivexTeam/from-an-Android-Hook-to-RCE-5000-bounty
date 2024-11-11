package com.comviva.webaxn.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ScrollView;

/* loaded from: classes.dex */
public class o0 extends ScrollView {
    public int b;
    Context c;
    public View.OnTouchListener d;

    /* loaded from: classes.dex */
    class a implements View.OnTouchListener {
        a(o0 o0Var) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            try {
                int action = motionEvent.getAction();
                if (action == 0) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                } else if (action == 1 || action == 3) {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
            } catch (Exception unused) {
            }
            return false;
        }
    }

    public o0(Context context) {
        super(context);
        this.d = new a(this);
        this.c = context;
        ViewConfiguration.get(context).getScaledTouchSlop();
        this.b = (int) (com.comviva.webaxn.utils.b.a(this.c).a().a() * 40.0f);
        setOnTouchListener(this.d);
    }

    @Override // android.view.View
    @TargetApi(9)
    protected boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        return Build.VERSION.SDK_INT < 21 ? super.overScrollBy(i, i2, i3, i4, i5, i6, i7, this.b, z) : super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }
}
