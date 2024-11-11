package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R$styleable;
import p000.C3107q2;

/* renamed from: androidx.appcompat.widget.d */
/* loaded from: classes.dex */
class C0165d {

    /* renamed from: a */
    private final View f985a;

    /* renamed from: d */
    private C0194r0 f988d;

    /* renamed from: e */
    private C0194r0 f989e;

    /* renamed from: f */
    private C0194r0 f990f;

    /* renamed from: c */
    private int f987c = -1;

    /* renamed from: b */
    private final C0175i f986b = C0175i.m1020a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0165d(View view) {
        this.f985a = view;
    }

    /* renamed from: b */
    private boolean m940b(Drawable drawable) {
        if (this.f990f == null) {
            this.f990f = new C0194r0();
        }
        C0194r0 c0194r0 = this.f990f;
        c0194r0.m1130a();
        ColorStateList m14905c = C3107q2.m14905c(this.f985a);
        if (m14905c != null) {
            c0194r0.f1213d = true;
            c0194r0.f1210a = m14905c;
        }
        PorterDuff.Mode m14907d = C3107q2.m14907d(this.f985a);
        if (m14907d != null) {
            c0194r0.f1212c = true;
            c0194r0.f1211b = m14907d;
        }
        if (!c0194r0.f1213d && !c0194r0.f1212c) {
            return false;
        }
        C0175i.m1023a(drawable, c0194r0, this.f985a.getDrawableState());
        return true;
    }

    /* renamed from: d */
    private boolean m941d() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f988d != null : i == 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m942a() {
        Drawable background = this.f985a.getBackground();
        if (background != null) {
            if (m941d() && m940b(background)) {
                return;
            }
            C0194r0 c0194r0 = this.f989e;
            if (c0194r0 != null) {
                C0175i.m1023a(background, c0194r0, this.f985a.getDrawableState());
                return;
            }
            C0194r0 c0194r02 = this.f988d;
            if (c0194r02 != null) {
                C0175i.m1023a(background, c0194r02, this.f985a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m943a(int i) {
        this.f987c = i;
        C0175i c0175i = this.f986b;
        m944a(c0175i != null ? c0175i.m1043b(this.f985a.getContext(), i) : null);
        m942a();
    }

    /* renamed from: a */
    void m944a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f988d == null) {
                this.f988d = new C0194r0();
            }
            C0194r0 c0194r0 = this.f988d;
            c0194r0.f1210a = colorStateList;
            c0194r0.f1213d = true;
        } else {
            this.f988d = null;
        }
        m942a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m945a(PorterDuff.Mode mode) {
        if (this.f989e == null) {
            this.f989e = new C0194r0();
        }
        C0194r0 c0194r0 = this.f989e;
        c0194r0.f1211b = mode;
        c0194r0.f1212c = true;
        m942a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m946a(Drawable drawable) {
        this.f987c = -1;
        m944a((ColorStateList) null);
        m942a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m947a(AttributeSet attributeSet, int i) {
        C0198t0 m1133a = C0198t0.m1133a(this.f985a.getContext(), attributeSet, R$styleable.ViewBackgroundHelper, i, 0);
        try {
            if (m1133a.m1152g(R$styleable.ViewBackgroundHelper_android_background)) {
                this.f987c = m1133a.m1151g(R$styleable.ViewBackgroundHelper_android_background, -1);
                ColorStateList m1043b = this.f986b.m1043b(this.f985a.getContext(), this.f987c);
                if (m1043b != null) {
                    m944a(m1043b);
                }
            }
            if (m1133a.m1152g(R$styleable.ViewBackgroundHelper_backgroundTint)) {
                C3107q2.m14888a(this.f985a, m1133a.m1136a(R$styleable.ViewBackgroundHelper_backgroundTint));
            }
            if (m1133a.m1152g(R$styleable.ViewBackgroundHelper_backgroundTintMode)) {
                C3107q2.m14889a(this.f985a, C0162b0.m921a(m1133a.m1145d(R$styleable.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            m1133a.m1138a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList m948b() {
        C0194r0 c0194r0 = this.f989e;
        if (c0194r0 != null) {
            return c0194r0.f1210a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m949b(ColorStateList colorStateList) {
        if (this.f989e == null) {
            this.f989e = new C0194r0();
        }
        C0194r0 c0194r0 = this.f989e;
        c0194r0.f1210a = colorStateList;
        c0194r0.f1213d = true;
        m942a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public PorterDuff.Mode m950c() {
        C0194r0 c0194r0 = this.f989e;
        if (c0194r0 != null) {
            return c0194r0.f1211b;
        }
        return null;
    }
}
