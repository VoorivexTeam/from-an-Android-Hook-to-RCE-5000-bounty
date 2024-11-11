package com.comviva.webaxn.p002ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ScrollView;
import com.comviva.webaxn.utils.C0687b;

/* renamed from: com.comviva.webaxn.ui.o0 */
/* loaded from: classes.dex */
public class C0654o0 extends ScrollView {

    /* renamed from: b */
    public int f4107b;

    /* renamed from: c */
    Context f4108c;

    /* renamed from: d */
    public View.OnTouchListener f4109d;

    /* renamed from: com.comviva.webaxn.ui.o0$a */
    /* loaded from: classes.dex */
    class a implements View.OnTouchListener {
        a(C0654o0 c0654o0) {
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

    public C0654o0(Context context) {
        super(context);
        this.f4109d = new a(this);
        this.f4108c = context;
        ViewConfiguration.get(context).getScaledTouchSlop();
        this.f4107b = (int) (C0687b.m5342a(this.f4108c).m5343a().m5544a() * 40.0f);
        setOnTouchListener(this.f4109d);
    }

    @Override // android.view.View
    @TargetApi(9)
    protected boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        return Build.VERSION.SDK_INT < 21 ? super.overScrollBy(i, i2, i3, i4, i5, i6, i7, this.f4107b, z) : super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }
}
