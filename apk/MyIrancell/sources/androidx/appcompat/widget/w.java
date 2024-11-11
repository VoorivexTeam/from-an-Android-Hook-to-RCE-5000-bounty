package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.R$styleable;
import defpackage.p0;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class w {
    private final TextView a;
    private r0 b;
    private r0 c;
    private r0 d;
    private r0 e;
    private r0 f;
    private r0 g;
    private final y h;
    private int i = 0;
    private Typeface j;
    private boolean k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends p0.a {
        final /* synthetic */ WeakReference a;

        a(WeakReference weakReference) {
            this.a = weakReference;
        }

        @Override // p0.a
        public void a(int i) {
        }

        @Override // p0.a
        public void a(Typeface typeface) {
            w.this.a(this.a, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(TextView textView) {
        this.a = textView;
        this.h = new y(this.a);
    }

    private static r0 a(Context context, i iVar, int i) {
        ColorStateList b = iVar.b(context, i);
        if (b == null) {
            return null;
        }
        r0 r0Var = new r0();
        r0Var.d = true;
        r0Var.a = b;
        return r0Var;
    }

    private void a(Context context, t0 t0Var) {
        String d;
        Typeface typeface;
        this.i = t0Var.d(R$styleable.TextAppearance_android_textStyle, this.i);
        if (t0Var.g(R$styleable.TextAppearance_android_fontFamily) || t0Var.g(R$styleable.TextAppearance_fontFamily)) {
            this.j = null;
            int i = t0Var.g(R$styleable.TextAppearance_fontFamily) ? R$styleable.TextAppearance_fontFamily : R$styleable.TextAppearance_android_fontFamily;
            if (!context.isRestricted()) {
                try {
                    Typeface a2 = t0Var.a(i, this.i, new a(new WeakReference(this.a)));
                    this.j = a2;
                    this.k = a2 == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.j != null || (d = t0Var.d(i)) == null) {
                return;
            }
            this.j = Typeface.create(d, this.i);
            return;
        }
        if (t0Var.g(R$styleable.TextAppearance_android_typeface)) {
            this.k = false;
            int d2 = t0Var.d(R$styleable.TextAppearance_android_typeface, 1);
            if (d2 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (d2 == 2) {
                typeface = Typeface.SERIF;
            } else if (d2 != 3) {
                return;
            } else {
                typeface = Typeface.MONOSPACE;
            }
            this.j = typeface;
        }
    }

    private void a(Drawable drawable, r0 r0Var) {
        if (drawable == null || r0Var == null) {
            return;
        }
        i.a(drawable, r0Var, this.a.getDrawableState());
    }

    private void b(int i, float f) {
        this.h.a(i, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (this.b != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.f == null && this.g == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f);
            a(compoundDrawablesRelative[2], this.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        this.h.a(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, float f) {
        if (androidx.core.widget.b.a || h()) {
            return;
        }
        b(i, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, int i2, int i3, int i4) {
        this.h.a(i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context, int i) {
        ColorStateList a2;
        t0 a3 = t0.a(context, i, R$styleable.TextAppearance);
        if (a3.g(R$styleable.TextAppearance_textAllCaps)) {
            a(a3.a(R$styleable.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && a3.g(R$styleable.TextAppearance_android_textColor) && (a2 = a3.a(R$styleable.TextAppearance_android_textColor)) != null) {
            this.a.setTextColor(a2);
        }
        if (a3.g(R$styleable.TextAppearance_android_textSize) && a3.c(R$styleable.TextAppearance_android_textSize, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        a(context, a3);
        a3.a();
        Typeface typeface = this.j;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    public void a(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        boolean z;
        boolean z2;
        Context context = this.a.getContext();
        i a2 = i.a();
        t0 a3 = t0.a(context, attributeSet, R$styleable.AppCompatTextHelper, i, 0);
        int g = a3.g(R$styleable.AppCompatTextHelper_android_textAppearance, -1);
        if (a3.g(R$styleable.AppCompatTextHelper_android_drawableLeft)) {
            this.b = a(context, a2, a3.g(R$styleable.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a3.g(R$styleable.AppCompatTextHelper_android_drawableTop)) {
            this.c = a(context, a2, a3.g(R$styleable.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a3.g(R$styleable.AppCompatTextHelper_android_drawableRight)) {
            this.d = a(context, a2, a3.g(R$styleable.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a3.g(R$styleable.AppCompatTextHelper_android_drawableBottom)) {
            this.e = a(context, a2, a3.g(R$styleable.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (a3.g(R$styleable.AppCompatTextHelper_android_drawableStart)) {
                this.f = a(context, a2, a3.g(R$styleable.AppCompatTextHelper_android_drawableStart, 0));
            }
            if (a3.g(R$styleable.AppCompatTextHelper_android_drawableEnd)) {
                this.g = a(context, a2, a3.g(R$styleable.AppCompatTextHelper_android_drawableEnd, 0));
            }
        }
        a3.a();
        boolean z3 = this.a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z4 = true;
        if (g != -1) {
            t0 a4 = t0.a(context, g, R$styleable.TextAppearance);
            if (z3 || !a4.g(R$styleable.TextAppearance_textAllCaps)) {
                z = false;
                z2 = false;
            } else {
                z = a4.a(R$styleable.TextAppearance_textAllCaps, false);
                z2 = true;
            }
            a(context, a4);
            if (Build.VERSION.SDK_INT < 23) {
                ColorStateList a5 = a4.g(R$styleable.TextAppearance_android_textColor) ? a4.a(R$styleable.TextAppearance_android_textColor) : null;
                colorStateList2 = a4.g(R$styleable.TextAppearance_android_textColorHint) ? a4.a(R$styleable.TextAppearance_android_textColorHint) : null;
                ColorStateList colorStateList3 = a5;
                colorStateList = a4.g(R$styleable.TextAppearance_android_textColorLink) ? a4.a(R$styleable.TextAppearance_android_textColorLink) : null;
                r10 = colorStateList3;
            } else {
                colorStateList = null;
                colorStateList2 = null;
            }
            a4.a();
        } else {
            colorStateList = null;
            colorStateList2 = null;
            z = false;
            z2 = false;
        }
        t0 a6 = t0.a(context, attributeSet, R$styleable.TextAppearance, i, 0);
        if (z3 || !a6.g(R$styleable.TextAppearance_textAllCaps)) {
            z4 = z2;
        } else {
            z = a6.a(R$styleable.TextAppearance_textAllCaps, false);
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (a6.g(R$styleable.TextAppearance_android_textColor)) {
                r10 = a6.a(R$styleable.TextAppearance_android_textColor);
            }
            if (a6.g(R$styleable.TextAppearance_android_textColorHint)) {
                colorStateList2 = a6.a(R$styleable.TextAppearance_android_textColorHint);
            }
            if (a6.g(R$styleable.TextAppearance_android_textColorLink)) {
                colorStateList = a6.a(R$styleable.TextAppearance_android_textColorLink);
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && a6.g(R$styleable.TextAppearance_android_textSize) && a6.c(R$styleable.TextAppearance_android_textSize, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        a(context, a6);
        a6.a();
        if (r10 != null) {
            this.a.setTextColor(r10);
        }
        if (colorStateList2 != null) {
            this.a.setHintTextColor(colorStateList2);
        }
        if (colorStateList != null) {
            this.a.setLinkTextColor(colorStateList);
        }
        if (!z3 && z4) {
            a(z);
        }
        Typeface typeface = this.j;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.i);
        }
        this.h.a(attributeSet, i);
        if (androidx.core.widget.b.a && this.h.f() != 0) {
            int[] e = this.h.e();
            if (e.length > 0) {
                if (this.a.getAutoSizeStepGranularity() != -1.0f) {
                    this.a.setAutoSizeTextTypeUniformWithConfiguration(this.h.c(), this.h.b(), this.h.d(), 0);
                } else {
                    this.a.setAutoSizeTextTypeUniformWithPresetSizes(e, 0);
                }
            }
        }
        t0 a7 = t0.a(context, attributeSet, R$styleable.AppCompatTextView);
        int c = a7.c(R$styleable.AppCompatTextView_firstBaselineToTopHeight, -1);
        int c2 = a7.c(R$styleable.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int c3 = a7.c(R$styleable.AppCompatTextView_lineHeight, -1);
        a7.a();
        if (c != -1) {
            androidx.core.widget.i.a(this.a, c);
        }
        if (c2 != -1) {
            androidx.core.widget.i.b(this.a, c2);
        }
        if (c3 != -1) {
            androidx.core.widget.i.c(this.a, c3);
        }
    }

    void a(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.k) {
            this.j = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        this.a.setAllCaps(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z, int i, int i2, int i3, int i4) {
        if (androidx.core.widget.b.a) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int[] iArr, int i) {
        this.h.a(iArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.h.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.h.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.h.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.h.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] f() {
        return this.h.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.h.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h() {
        return this.h.g();
    }
}
