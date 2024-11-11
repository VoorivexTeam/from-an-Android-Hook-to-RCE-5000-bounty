package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.R$styleable;
import androidx.core.widget.C0253e;
import p000.C0000a;

/* renamed from: androidx.appcompat.widget.m */
/* loaded from: classes.dex */
public class C0183m {

    /* renamed from: a */
    private final ImageView f1124a;

    /* renamed from: b */
    private C0194r0 f1125b;

    /* renamed from: c */
    private C0194r0 f1126c;

    /* renamed from: d */
    private C0194r0 f1127d;

    public C0183m(ImageView imageView) {
        this.f1124a = imageView;
    }

    /* renamed from: a */
    private boolean m1069a(Drawable drawable) {
        if (this.f1127d == null) {
            this.f1127d = new C0194r0();
        }
        C0194r0 c0194r0 = this.f1127d;
        c0194r0.m1130a();
        ColorStateList m1580a = C0253e.m1580a(this.f1124a);
        if (m1580a != null) {
            c0194r0.f1213d = true;
            c0194r0.f1210a = m1580a;
        }
        PorterDuff.Mode m1583b = C0253e.m1583b(this.f1124a);
        if (m1583b != null) {
            c0194r0.f1212c = true;
            c0194r0.f1211b = m1583b;
        }
        if (!c0194r0.f1213d && !c0194r0.f1212c) {
            return false;
        }
        C0175i.m1023a(drawable, c0194r0, this.f1124a.getDrawableState());
        return true;
    }

    /* renamed from: e */
    private boolean m1070e() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f1125b != null : i == 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1071a() {
        Drawable drawable = this.f1124a.getDrawable();
        if (drawable != null) {
            C0162b0.m923b(drawable);
        }
        if (drawable != null) {
            if (m1070e() && m1069a(drawable)) {
                return;
            }
            C0194r0 c0194r0 = this.f1126c;
            if (c0194r0 != null) {
                C0175i.m1023a(drawable, c0194r0, this.f1124a.getDrawableState());
                return;
            }
            C0194r0 c0194r02 = this.f1125b;
            if (c0194r02 != null) {
                C0175i.m1023a(drawable, c0194r02, this.f1124a.getDrawableState());
            }
        }
    }

    /* renamed from: a */
    public void m1072a(int i) {
        if (i != 0) {
            Drawable m4c = C0000a.m4c(this.f1124a.getContext(), i);
            if (m4c != null) {
                C0162b0.m923b(m4c);
            }
            this.f1124a.setImageDrawable(m4c);
        } else {
            this.f1124a.setImageDrawable(null);
        }
        m1071a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1073a(ColorStateList colorStateList) {
        if (this.f1126c == null) {
            this.f1126c = new C0194r0();
        }
        C0194r0 c0194r0 = this.f1126c;
        c0194r0.f1210a = colorStateList;
        c0194r0.f1213d = true;
        m1071a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1074a(PorterDuff.Mode mode) {
        if (this.f1126c == null) {
            this.f1126c = new C0194r0();
        }
        C0194r0 c0194r0 = this.f1126c;
        c0194r0.f1211b = mode;
        c0194r0.f1212c = true;
        m1071a();
    }

    /* renamed from: a */
    public void m1075a(AttributeSet attributeSet, int i) {
        int m1151g;
        C0198t0 m1133a = C0198t0.m1133a(this.f1124a.getContext(), attributeSet, R$styleable.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.f1124a.getDrawable();
            if (drawable == null && (m1151g = m1133a.m1151g(R$styleable.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = C0000a.m4c(this.f1124a.getContext(), m1151g)) != null) {
                this.f1124a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0162b0.m923b(drawable);
            }
            if (m1133a.m1152g(R$styleable.AppCompatImageView_tint)) {
                C0253e.m1581a(this.f1124a, m1133a.m1136a(R$styleable.AppCompatImageView_tint));
            }
            if (m1133a.m1152g(R$styleable.AppCompatImageView_tintMode)) {
                C0253e.m1582a(this.f1124a, C0162b0.m921a(m1133a.m1145d(R$styleable.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            m1133a.m1138a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList m1076b() {
        C0194r0 c0194r0 = this.f1126c;
        if (c0194r0 != null) {
            return c0194r0.f1210a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public PorterDuff.Mode m1077c() {
        C0194r0 c0194r0 = this.f1126c;
        if (c0194r0 != null) {
            return c0194r0.f1211b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m1078d() {
        return Build.VERSION.SDK_INT < 21 || !(this.f1124a.getBackground() instanceof RippleDrawable);
    }
}
