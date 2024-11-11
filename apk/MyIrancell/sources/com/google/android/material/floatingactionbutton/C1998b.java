package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.internal.C2010i;
import java.util.ArrayList;
import p000.C2445eu;
import p000.C2486fu;
import p000.InterfaceC2526gu;

/* renamed from: com.google.android.material.floatingactionbutton.b */
/* loaded from: classes.dex */
class C1998b extends C1997a {

    /* renamed from: I */
    private InsetDrawable f8473I;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1998b(C2010i c2010i, InterfaceC2526gu interfaceC2526gu) {
        super(c2010i, interfaceC2526gu);
    }

    /* renamed from: a */
    private Animator m10210a(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f8452u, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f8452u, (Property<C2010i, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(C1997a.f8424B);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.C1997a
    /* renamed from: a */
    void mo10177a(float f, float f2, float f3) {
        if (Build.VERSION.SDK_INT == 21) {
            this.f8452u.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C1997a.f8425C, m10210a(f, f3));
            stateListAnimator.addState(C1997a.f8426D, m10210a(f, f2));
            stateListAnimator.addState(C1997a.f8427E, m10210a(f, f2));
            stateListAnimator.addState(C1997a.f8428F, m10210a(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f8452u, "elevation", f).setDuration(0L));
            int i = Build.VERSION.SDK_INT;
            if (i >= 22 && i <= 24) {
                C2010i c2010i = this.f8452u;
                arrayList.add(ObjectAnimator.ofFloat(c2010i, (Property<C2010i, Float>) View.TRANSLATION_Z, c2010i.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f8452u, (Property<C2010i, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(C1997a.f8424B);
            stateListAnimator.addState(C1997a.f8429G, animatorSet);
            stateListAnimator.addState(C1997a.f8430H, m10210a(0.0f, 0.0f));
            this.f8452u.setStateListAnimator(stateListAnimator);
        }
        if (this.f8453v.mo10165a()) {
            m10209p();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C1997a
    /* renamed from: a */
    void mo10181a(Rect rect) {
        if (!this.f8453v.mo10165a()) {
            rect.set(0, 0, 0, 0);
            return;
        }
        float mo10166b = this.f8453v.mo10166b();
        float mo10185b = mo10185b() + this.f8447p;
        int ceil = (int) Math.ceil(C2486fu.m11829a(mo10185b, mo10166b, false));
        int ceil2 = (int) Math.ceil(C2486fu.m11830b(mo10185b, mo10166b, false));
        rect.set(ceil, ceil2, ceil, ceil2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C1997a
    /* renamed from: a */
    public void mo10184a(int[] iArr) {
        C2010i c2010i;
        if (Build.VERSION.SDK_INT == 21) {
            float f = 0.0f;
            if (this.f8452u.isEnabled()) {
                this.f8452u.setElevation(this.f8445n);
                if (this.f8452u.isPressed()) {
                    c2010i = this.f8452u;
                    f = this.f8447p;
                } else if (this.f8452u.isFocused() || this.f8452u.isHovered()) {
                    c2010i = this.f8452u;
                    f = this.f8446o;
                }
                c2010i.setTranslationZ(f);
            }
            this.f8452u.setElevation(0.0f);
            c2010i = this.f8452u;
            c2010i.setTranslationZ(f);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C1997a
    /* renamed from: b */
    public float mo10185b() {
        return this.f8452u.getElevation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C1997a
    /* renamed from: b */
    public void mo10188b(ColorStateList colorStateList) {
        Drawable drawable = this.f8442k;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C2445eu.m11636a(colorStateList));
        } else {
            super.mo10188b(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C1997a
    /* renamed from: b */
    void mo10189b(Rect rect) {
        InterfaceC2526gu interfaceC2526gu;
        Drawable drawable;
        if (this.f8453v.mo10165a()) {
            InsetDrawable insetDrawable = new InsetDrawable(this.f8442k, rect.left, rect.top, rect.right, rect.bottom);
            this.f8473I = insetDrawable;
            drawable = insetDrawable;
            interfaceC2526gu = this.f8453v;
        } else {
            InterfaceC2526gu interfaceC2526gu2 = this.f8453v;
            drawable = this.f8442k;
            interfaceC2526gu = interfaceC2526gu2;
        }
        interfaceC2526gu.mo10164a(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C1997a
    /* renamed from: i */
    public void mo10202i() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C1997a
    /* renamed from: k */
    public void mo10204k() {
        m10209p();
    }

    @Override // com.google.android.material.floatingactionbutton.C1997a
    /* renamed from: n */
    boolean mo10207n() {
        return false;
    }
}
