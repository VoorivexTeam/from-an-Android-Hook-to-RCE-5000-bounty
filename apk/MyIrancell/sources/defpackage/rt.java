package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.e;
import androidx.core.graphics.drawable.a;
import androidx.core.widget.i;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.g;
import com.google.android.material.internal.h;

/* loaded from: classes.dex */
public class rt extends e {
    private final tt d;
    private int e;
    private PorterDuff.Mode f;
    private ColorStateList g;
    private Drawable h;
    private int i;
    private int j;
    private int k;

    public rt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.materialButtonStyle);
    }

    public rt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray c = g.c(context, attributeSet, R$styleable.MaterialButton, i, R$style.Widget_MaterialComponents_Button, new int[0]);
        this.e = c.getDimensionPixelSize(R$styleable.MaterialButton_iconPadding, 0);
        this.f = h.a(c.getInt(R$styleable.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.g = du.a(getContext(), c, R$styleable.MaterialButton_iconTint);
        this.h = du.b(getContext(), c, R$styleable.MaterialButton_icon);
        this.k = c.getInteger(R$styleable.MaterialButton_iconGravity, 1);
        this.i = c.getDimensionPixelSize(R$styleable.MaterialButton_iconSize, 0);
        tt ttVar = new tt(this);
        this.d = ttVar;
        ttVar.a(c);
        c.recycle();
        setCompoundDrawablePadding(this.e);
        c();
    }

    private boolean a() {
        return q2.k(this) == 1;
    }

    private boolean b() {
        tt ttVar = this.d;
        return (ttVar == null || ttVar.g()) ? false : true;
    }

    private void c() {
        Drawable drawable = this.h;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.h = mutate;
            a.a(mutate, this.g);
            PorterDuff.Mode mode = this.f;
            if (mode != null) {
                a.a(this.h, mode);
            }
            int i = this.i;
            if (i == 0) {
                i = this.h.getIntrinsicWidth();
            }
            int i2 = this.i;
            if (i2 == 0) {
                i2 = this.h.getIntrinsicHeight();
            }
            Drawable drawable2 = this.h;
            int i3 = this.j;
            drawable2.setBounds(i3, 0, i + i3, i2);
        }
        i.a(this, this.h, null, null, null);
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (b()) {
            return this.d.a();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.h;
    }

    public int getIconGravity() {
        return this.k;
    }

    public int getIconPadding() {
        return this.e;
    }

    public int getIconSize() {
        return this.i;
    }

    public ColorStateList getIconTint() {
        return this.g;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.d.b();
        }
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.d.c();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.d.d();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.e, defpackage.p2
    public ColorStateList getSupportBackgroundTintList() {
        return b() ? this.d.e() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.e, defpackage.p2
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return b() ? this.d.f() : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (Build.VERSION.SDK_INT >= 21 || !b()) {
            return;
        }
        this.d.a(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.e, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        tt ttVar;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT != 21 || (ttVar = this.d) == null) {
            return;
        }
        ttVar.a(i4 - i2, i3 - i);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.h == null || this.k != 2) {
            return;
        }
        int measureText = (int) getPaint().measureText(getText().toString());
        int i3 = this.i;
        if (i3 == 0) {
            i3 = this.h.getIntrinsicWidth();
        }
        int measuredWidth = (((((getMeasuredWidth() - measureText) - q2.n(this)) - i3) - this.e) - q2.o(this)) / 2;
        if (a()) {
            measuredWidth = -measuredWidth;
        }
        if (this.j != measuredWidth) {
            this.j = measuredWidth;
            c();
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (b()) {
            this.d.a(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // androidx.appcompat.widget.e, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (b()) {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            this.d.h();
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.e, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? a.c(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCornerRadius(int i) {
        if (b()) {
            this.d.b(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.h != drawable) {
            this.h = drawable;
            c();
        }
    }

    public void setIconGravity(int i) {
        this.k = i;
    }

    public void setIconPadding(int i) {
        if (this.e != i) {
            this.e = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? a.c(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.i != i) {
            this.i = i;
            c();
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.g != colorStateList) {
            this.g = colorStateList;
            c();
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            c();
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(a.b(getContext(), i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            this.d.a(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (b()) {
            setRippleColor(a.b(getContext(), i));
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            this.d.b(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (b()) {
            setStrokeColor(a.b(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (b()) {
            this.d.c(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.e, defpackage.p2
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (b()) {
            this.d.c(colorStateList);
        } else if (this.d != null) {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.e, defpackage.p2
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (b()) {
            this.d.a(mode);
        } else if (this.d != null) {
            super.setSupportBackgroundTintMode(mode);
        }
    }
}
