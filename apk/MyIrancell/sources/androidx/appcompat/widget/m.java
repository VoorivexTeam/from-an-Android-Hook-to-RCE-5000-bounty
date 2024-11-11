package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.R$styleable;

/* loaded from: classes.dex */
public class m {
    private final ImageView a;
    private r0 b;
    private r0 c;
    private r0 d;

    public m(ImageView imageView) {
        this.a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.d == null) {
            this.d = new r0();
        }
        r0 r0Var = this.d;
        r0Var.a();
        ColorStateList a = androidx.core.widget.e.a(this.a);
        if (a != null) {
            r0Var.d = true;
            r0Var.a = a;
        }
        PorterDuff.Mode b = androidx.core.widget.e.b(this.a);
        if (b != null) {
            r0Var.c = true;
            r0Var.b = b;
        }
        if (!r0Var.d && !r0Var.c) {
            return false;
        }
        i.a(drawable, r0Var, this.a.getDrawableState());
        return true;
    }

    private boolean e() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.b != null : i == 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            b0.b(drawable);
        }
        if (drawable != null) {
            if (e() && a(drawable)) {
                return;
            }
            r0 r0Var = this.c;
            if (r0Var != null) {
                i.a(drawable, r0Var, this.a.getDrawableState());
                return;
            }
            r0 r0Var2 = this.b;
            if (r0Var2 != null) {
                i.a(drawable, r0Var2, this.a.getDrawableState());
            }
        }
    }

    public void a(int i) {
        if (i != 0) {
            Drawable c = defpackage.a.c(this.a.getContext(), i);
            if (c != null) {
                b0.b(c);
            }
            this.a.setImageDrawable(c);
        } else {
            this.a.setImageDrawable(null);
        }
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        if (this.c == null) {
            this.c = new r0();
        }
        r0 r0Var = this.c;
        r0Var.a = colorStateList;
        r0Var.d = true;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        if (this.c == null) {
            this.c = new r0();
        }
        r0 r0Var = this.c;
        r0Var.b = mode;
        r0Var.c = true;
        a();
    }

    public void a(AttributeSet attributeSet, int i) {
        int g;
        t0 a = t0.a(this.a.getContext(), attributeSet, R$styleable.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.a.getDrawable();
            if (drawable == null && (g = a.g(R$styleable.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = defpackage.a.c(this.a.getContext(), g)) != null) {
                this.a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                b0.b(drawable);
            }
            if (a.g(R$styleable.AppCompatImageView_tint)) {
                androidx.core.widget.e.a(this.a, a.a(R$styleable.AppCompatImageView_tint));
            }
            if (a.g(R$styleable.AppCompatImageView_tintMode)) {
                androidx.core.widget.e.a(this.a, b0.a(a.d(R$styleable.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            a.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList b() {
        r0 r0Var = this.c;
        if (r0Var != null) {
            return r0Var.a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode c() {
        r0 r0Var = this.c;
        if (r0Var != null) {
            return r0Var.b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return Build.VERSION.SDK_INT < 21 || !(this.a.getBackground() instanceof RippleDrawable);
    }
}
