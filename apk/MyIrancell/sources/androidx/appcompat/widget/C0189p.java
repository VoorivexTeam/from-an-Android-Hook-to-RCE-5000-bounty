package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.R$styleable;
import androidx.core.widget.C0256h;

/* renamed from: androidx.appcompat.widget.p */
/* loaded from: classes.dex */
class C0189p extends PopupWindow {

    /* renamed from: b */
    private static final boolean f1199b;

    /* renamed from: a */
    private boolean f1200a;

    static {
        f1199b = Build.VERSION.SDK_INT < 21;
    }

    public C0189p(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m1121a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m1121a(Context context, AttributeSet attributeSet, int i, int i2) {
        C0198t0 m1133a = C0198t0.m1133a(context, attributeSet, R$styleable.PopupWindow, i, i2);
        if (m1133a.m1152g(R$styleable.PopupWindow_overlapAnchor)) {
            m1122a(m1133a.m1139a(R$styleable.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(m1133a.m1142b(R$styleable.PopupWindow_android_popupBackground));
        m1133a.m1138a();
    }

    /* renamed from: a */
    private void m1122a(boolean z) {
        if (f1199b) {
            this.f1200a = z;
        } else {
            C0256h.m1588a(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (f1199b && this.f1200a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f1199b && this.f1200a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (f1199b && this.f1200a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
