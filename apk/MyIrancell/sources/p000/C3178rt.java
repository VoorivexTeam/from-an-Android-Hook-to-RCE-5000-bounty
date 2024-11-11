package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0167e;
import androidx.core.graphics.drawable.C0239a;
import androidx.core.widget.C0257i;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.C2008g;
import com.google.android.material.internal.C2009h;

/* renamed from: rt */
/* loaded from: classes.dex */
public class C3178rt extends C0167e {

    /* renamed from: d */
    private final C3274tt f12982d;

    /* renamed from: e */
    private int f12983e;

    /* renamed from: f */
    private PorterDuff.Mode f12984f;

    /* renamed from: g */
    private ColorStateList f12985g;

    /* renamed from: h */
    private Drawable f12986h;

    /* renamed from: i */
    private int f12987i;

    /* renamed from: j */
    private int f12988j;

    /* renamed from: k */
    private int f12989k;

    public C3178rt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.materialButtonStyle);
    }

    public C3178rt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray m10273c = C2008g.m10273c(context, attributeSet, R$styleable.MaterialButton, i, R$style.Widget_MaterialComponents_Button, new int[0]);
        this.f12983e = m10273c.getDimensionPixelSize(R$styleable.MaterialButton_iconPadding, 0);
        this.f12984f = C2009h.m10275a(m10273c.getInt(R$styleable.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f12985g = C2402du.m11484a(getContext(), m10273c, R$styleable.MaterialButton_iconTint);
        this.f12986h = C2402du.m11485b(getContext(), m10273c, R$styleable.MaterialButton_icon);
        this.f12989k = m10273c.getInteger(R$styleable.MaterialButton_iconGravity, 1);
        this.f12987i = m10273c.getDimensionPixelSize(R$styleable.MaterialButton_iconSize, 0);
        C3274tt c3274tt = new C3274tt(this);
        this.f12982d = c3274tt;
        c3274tt.m15677a(m10273c);
        m10273c.recycle();
        setCompoundDrawablePadding(this.f12983e);
        m15295c();
    }

    /* renamed from: a */
    private boolean m15293a() {
        return C3107q2.m14919k(this) == 1;
    }

    /* renamed from: b */
    private boolean m15294b() {
        C3274tt c3274tt = this.f12982d;
        return (c3274tt == null || c3274tt.m15689g()) ? false : true;
    }

    /* renamed from: c */
    private void m15295c() {
        Drawable drawable = this.f12986h;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f12986h = mutate;
            C0239a.m1480a(mutate, this.f12985g);
            PorterDuff.Mode mode = this.f12984f;
            if (mode != null) {
                C0239a.m1483a(this.f12986h, mode);
            }
            int i = this.f12987i;
            if (i == 0) {
                i = this.f12986h.getIntrinsicWidth();
            }
            int i2 = this.f12987i;
            if (i2 == 0) {
                i2 = this.f12986h.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f12986h;
            int i3 = this.f12988j;
            drawable2.setBounds(i3, 0, i + i3, i2);
        }
        C0257i.m1594a(this, this.f12986h, null, null, null);
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
        if (m15294b()) {
            return this.f12982d.m15673a();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f12986h;
    }

    public int getIconGravity() {
        return this.f12989k;
    }

    public int getIconPadding() {
        return this.f12983e;
    }

    public int getIconSize() {
        return this.f12987i;
    }

    public ColorStateList getIconTint() {
        return this.f12985g;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f12984f;
    }

    public ColorStateList getRippleColor() {
        if (m15294b()) {
            return this.f12982d.m15680b();
        }
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (m15294b()) {
            return this.f12982d.m15683c();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m15294b()) {
            return this.f12982d.m15686d();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.C0167e, p000.InterfaceC3068p2
    public ColorStateList getSupportBackgroundTintList() {
        return m15294b() ? this.f12982d.m15687e() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.C0167e, p000.InterfaceC3068p2
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m15294b() ? this.f12982d.m15688f() : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (Build.VERSION.SDK_INT >= 21 || !m15294b()) {
            return;
        }
        this.f12982d.m15678a(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0167e, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C3274tt c3274tt;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT != 21 || (c3274tt = this.f12982d) == null) {
            return;
        }
        c3274tt.m15675a(i4 - i2, i3 - i);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f12986h == null || this.f12989k != 2) {
            return;
        }
        int measureText = (int) getPaint().measureText(getText().toString());
        int i3 = this.f12987i;
        if (i3 == 0) {
            i3 = this.f12986h.getIntrinsicWidth();
        }
        int measuredWidth = (((((getMeasuredWidth() - measureText) - C3107q2.m14922n(this)) - i3) - this.f12983e) - C3107q2.m14923o(this)) / 2;
        if (m15293a()) {
            measuredWidth = -measuredWidth;
        }
        if (this.f12988j != measuredWidth) {
            this.f12988j = measuredWidth;
            m15295c();
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (m15294b()) {
            this.f12982d.m15674a(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // androidx.appcompat.widget.C0167e, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (m15294b()) {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            this.f12982d.m15690h();
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.C0167e, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C0000a.m4c(getContext(), i) : null);
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
        if (m15294b()) {
            this.f12982d.m15681b(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m15294b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f12986h != drawable) {
            this.f12986h = drawable;
            m15295c();
        }
    }

    public void setIconGravity(int i) {
        this.f12989k = i;
    }

    public void setIconPadding(int i) {
        if (this.f12983e != i) {
            this.f12983e = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? C0000a.m4c(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f12987i != i) {
            this.f12987i = i;
            m15295c();
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f12985g != colorStateList) {
            this.f12985g = colorStateList;
            m15295c();
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f12984f != mode) {
            this.f12984f = mode;
            m15295c();
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C0000a.m3b(getContext(), i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m15294b()) {
            this.f12982d.m15676a(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (m15294b()) {
            setRippleColor(C0000a.m3b(getContext(), i));
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m15294b()) {
            this.f12982d.m15682b(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (m15294b()) {
            setStrokeColor(C0000a.m3b(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m15294b()) {
            this.f12982d.m15684c(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m15294b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.C0167e, p000.InterfaceC3068p2
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m15294b()) {
            this.f12982d.m15685c(colorStateList);
        } else if (this.f12982d != null) {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.C0167e, p000.InterfaceC3068p2
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m15294b()) {
            this.f12982d.m15679a(mode);
        } else if (this.f12982d != null) {
            super.setSupportBackgroundTintMode(mode);
        }
    }
}
