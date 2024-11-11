package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.appcompat.R$attr;
import androidx.core.widget.InterfaceC0258j;
import p000.C0000a;

/* renamed from: androidx.appcompat.widget.r */
/* loaded from: classes.dex */
public class C0193r extends RadioButton implements InterfaceC0258j {

    /* renamed from: b */
    private final C0173h f1208b;

    /* renamed from: c */
    private final C0203w f1209c;

    public C0193r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.radioButtonStyle);
    }

    public C0193r(Context context, AttributeSet attributeSet, int i) {
        super(C0192q0.m1129b(context), attributeSet, i);
        C0173h c0173h = new C0173h(this);
        this.f1208b = c0173h;
        c0173h.m1010a(attributeSet, i);
        C0203w c0203w = new C0203w(this);
        this.f1209c = c0203w;
        c0203w.m1186a(attributeSet, i);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0173h c0173h = this.f1208b;
        return c0173h != null ? c0173h.m1006a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        C0173h c0173h = this.f1208b;
        if (c0173h != null) {
            return c0173h.m1011b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0173h c0173h = this.f1208b;
        if (c0173h != null) {
            return c0173h.m1012c();
        }
        return null;
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C0000a.m4c(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0173h c0173h = this.f1208b;
        if (c0173h != null) {
            c0173h.m1013d();
        }
    }

    @Override // androidx.core.widget.InterfaceC0258j
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0173h c0173h = this.f1208b;
        if (c0173h != null) {
            c0173h.m1008a(colorStateList);
        }
    }

    @Override // androidx.core.widget.InterfaceC0258j
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0173h c0173h = this.f1208b;
        if (c0173h != null) {
            c0173h.m1009a(mode);
        }
    }
}
