package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R$styleable;
import defpackage.q2;

/* loaded from: classes.dex */
class d {
    private final View a;
    private r0 d;
    private r0 e;
    private r0 f;
    private int c = -1;
    private final i b = i.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(View view) {
        this.a = view;
    }

    private boolean b(Drawable drawable) {
        if (this.f == null) {
            this.f = new r0();
        }
        r0 r0Var = this.f;
        r0Var.a();
        ColorStateList c = q2.c(this.a);
        if (c != null) {
            r0Var.d = true;
            r0Var.a = c;
        }
        PorterDuff.Mode d = q2.d(this.a);
        if (d != null) {
            r0Var.c = true;
            r0Var.b = d;
        }
        if (!r0Var.d && !r0Var.c) {
            return false;
        }
        i.a(drawable, r0Var, this.a.getDrawableState());
        return true;
    }

    private boolean d() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.d != null : i == 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Drawable background = this.a.getBackground();
        if (background != null) {
            if (d() && b(background)) {
                return;
            }
            r0 r0Var = this.e;
            if (r0Var != null) {
                i.a(background, r0Var, this.a.getDrawableState());
                return;
            }
            r0 r0Var2 = this.d;
            if (r0Var2 != null) {
                i.a(background, r0Var2, this.a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        this.c = i;
        i iVar = this.b;
        a(iVar != null ? iVar.b(this.a.getContext(), i) : null);
        a();
    }

    void a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new r0();
            }
            r0 r0Var = this.d;
            r0Var.a = colorStateList;
            r0Var.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new r0();
        }
        r0 r0Var = this.e;
        r0Var.b = mode;
        r0Var.c = true;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Drawable drawable) {
        this.c = -1;
        a((ColorStateList) null);
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AttributeSet attributeSet, int i) {
        t0 a = t0.a(this.a.getContext(), attributeSet, R$styleable.ViewBackgroundHelper, i, 0);
        try {
            if (a.g(R$styleable.ViewBackgroundHelper_android_background)) {
                this.c = a.g(R$styleable.ViewBackgroundHelper_android_background, -1);
                ColorStateList b = this.b.b(this.a.getContext(), this.c);
                if (b != null) {
                    a(b);
                }
            }
            if (a.g(R$styleable.ViewBackgroundHelper_backgroundTint)) {
                q2.a(this.a, a.a(R$styleable.ViewBackgroundHelper_backgroundTint));
            }
            if (a.g(R$styleable.ViewBackgroundHelper_backgroundTintMode)) {
                q2.a(this.a, b0.a(a.d(R$styleable.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            a.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList b() {
        r0 r0Var = this.e;
        if (r0Var != null) {
            return r0Var.a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new r0();
        }
        r0 r0Var = this.e;
        r0Var.a = colorStateList;
        r0Var.d = true;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode c() {
        r0 r0Var = this.e;
        if (r0Var != null) {
            return r0Var.b;
        }
        return null;
    }
}
