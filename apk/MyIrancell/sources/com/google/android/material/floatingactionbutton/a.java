package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.R$animator;
import defpackage.eu;
import defpackage.fu;
import defpackage.gu;
import defpackage.ht;
import defpackage.it;
import defpackage.mt;
import defpackage.nt;
import defpackage.ot;
import defpackage.q2;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a {
    static final TimeInterpolator B = ht.c;
    static final int[] C = {R.attr.state_pressed, R.attr.state_enabled};
    static final int[] D = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    static final int[] E = {R.attr.state_focused, R.attr.state_enabled};
    static final int[] F = {R.attr.state_hovered, R.attr.state_enabled};
    static final int[] G = {R.attr.state_enabled};
    static final int[] H = new int[0];
    private ViewTreeObserver.OnPreDrawListener A;
    Animator b;
    ot c;
    ot d;
    private ot e;
    private ot f;
    private final com.google.android.material.internal.f g;
    fu h;
    private float i;
    Drawable j;
    Drawable k;
    com.google.android.material.internal.a l;
    Drawable m;
    float n;
    float o;
    float p;
    int q;
    private ArrayList<Animator.AnimatorListener> s;
    private ArrayList<Animator.AnimatorListener> t;
    final com.google.android.material.internal.i u;
    final gu v;
    int a = 0;
    float r = 1.0f;
    private final Rect w = new Rect();
    private final RectF x = new RectF();
    private final RectF y = new RectF();
    private final Matrix z = new Matrix();

    /* renamed from: com.google.android.material.floatingactionbutton.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0051a extends AnimatorListenerAdapter {
        private boolean a;
        final /* synthetic */ boolean b;
        final /* synthetic */ g c;

        C0051a(boolean z, g gVar) {
            this.b = z;
            this.c = gVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a aVar = a.this;
            aVar.a = 0;
            aVar.b = null;
            if (this.a) {
                return;
            }
            aVar.u.a(this.b ? 8 : 4, this.b);
            g gVar = this.c;
            if (gVar != null) {
                gVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.u.a(0, this.b);
            a aVar = a.this;
            aVar.a = 1;
            aVar.b = animator;
            this.a = false;
        }
    }

    /* loaded from: classes.dex */
    class b extends AnimatorListenerAdapter {
        final /* synthetic */ boolean a;
        final /* synthetic */ g b;

        b(boolean z, g gVar) {
            this.a = z;
            this.b = gVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a aVar = a.this;
            aVar.a = 0;
            aVar.b = null;
            g gVar = this.b;
            if (gVar != null) {
                gVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.u.a(0, this.a);
            a aVar = a.this;
            aVar.a = 2;
            aVar.b = animator;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements ViewTreeObserver.OnPreDrawListener {
        c() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a.this.m();
            return true;
        }
    }

    /* loaded from: classes.dex */
    private class d extends i {
        d(a aVar) {
            super(aVar, null);
        }
    }

    /* loaded from: classes.dex */
    private class e extends i {
        e() {
            super(a.this, null);
        }
    }

    /* loaded from: classes.dex */
    private class f extends i {
        f() {
            super(a.this, null);
        }
    }

    /* loaded from: classes.dex */
    interface g {
        void a();

        void b();
    }

    /* loaded from: classes.dex */
    private class h extends i {
        h() {
            super(a.this, null);
        }
    }

    /* loaded from: classes.dex */
    private abstract class i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private boolean a;
        private float b;
        private float c;

        private i() {
        }

        /* synthetic */ i(a aVar, C0051a c0051a) {
            this();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.h.b(this.c);
            throw null;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.a) {
                a.this.h.b();
                throw null;
            }
            fu fuVar = a.this.h;
            float f = this.b;
            fuVar.b(f + ((this.c - f) * valueAnimator.getAnimatedFraction()));
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(com.google.android.material.internal.i iVar, gu guVar) {
        this.u = iVar;
        this.v = guVar;
        com.google.android.material.internal.f fVar = new com.google.android.material.internal.f();
        this.g = fVar;
        fVar.a(C, a((i) new f()));
        this.g.a(D, a((i) new e()));
        this.g.a(E, a((i) new e()));
        this.g.a(F, a((i) new e()));
        this.g.a(G, a((i) new h()));
        this.g.a(H, a((i) new d(this)));
        this.i = this.u.getRotation();
    }

    private AnimatorSet a(ot otVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.u, (Property<com.google.android.material.internal.i, Float>) View.ALPHA, f2);
        otVar.a("opacity").a((Animator) ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.u, (Property<com.google.android.material.internal.i, Float>) View.SCALE_X, f3);
        otVar.a("scale").a((Animator) ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.u, (Property<com.google.android.material.internal.i, Float>) View.SCALE_Y, f3);
        otVar.a("scale").a((Animator) ofFloat3);
        arrayList.add(ofFloat3);
        a(f4, this.z);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.u, new mt(), new nt(), new Matrix(this.z));
        otVar.a("iconScale").a((Animator) ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        it.a(animatorSet, arrayList);
        return animatorSet;
    }

    private ValueAnimator a(i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(B);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private void a(float f2, Matrix matrix) {
        matrix.reset();
        if (this.u.getDrawable() == null || this.q == 0) {
            return;
        }
        RectF rectF = this.x;
        RectF rectF2 = this.y;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i2 = this.q;
        rectF2.set(0.0f, 0.0f, i2, i2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i3 = this.q;
        matrix.postScale(f2, f2, i3 / 2.0f, i3 / 2.0f);
    }

    private void q() {
        if (this.A == null) {
            this.A = new c();
        }
    }

    private ot r() {
        if (this.f == null) {
            this.f = ot.a(this.u.getContext(), R$animator.design_fab_hide_motion_spec);
        }
        return this.f;
    }

    private ot s() {
        if (this.e == null) {
            this.e = ot.a(this.u.getContext(), R$animator.design_fab_show_motion_spec);
        }
        return this.e;
    }

    private boolean t() {
        return q2.x(this.u) && !this.u.isInEditMode();
    }

    private void u() {
        com.google.android.material.internal.i iVar;
        int i2;
        if (Build.VERSION.SDK_INT == 19) {
            if (this.i % 90.0f != 0.0f) {
                i2 = 1;
                if (this.u.getLayerType() != 1) {
                    iVar = this.u;
                    iVar.setLayerType(i2, null);
                }
            } else if (this.u.getLayerType() != 0) {
                iVar = this.u;
                i2 = 0;
                iVar.setLayerType(i2, null);
            }
        }
        fu fuVar = this.h;
        if (fuVar != null) {
            fuVar.a(-this.i);
            throw null;
        }
        com.google.android.material.internal.a aVar = this.l;
        if (aVar == null) {
            return;
        }
        aVar.a(-this.i);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Drawable a() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(float f2) {
        if (this.n != f2) {
            this.n = f2;
            a(f2, this.o, this.p);
        }
    }

    void a(float f2, float f3, float f4) {
        fu fuVar = this.h;
        if (fuVar == null) {
            return;
        }
        fuVar.a(f2, this.p + f2);
        throw null;
    }

    public void a(Animator.AnimatorListener animatorListener) {
        if (this.t == null) {
            this.t = new ArrayList<>();
        }
        this.t.add(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        Drawable drawable = this.j;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, colorStateList);
        }
        com.google.android.material.internal.a aVar = this.l;
        if (aVar == null) {
            return;
        }
        aVar.a(colorStateList);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        Drawable drawable = this.j;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, mode);
        }
    }

    void a(Rect rect) {
        this.h.getPadding(rect);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(g gVar, boolean z) {
        if (g()) {
            return;
        }
        Animator animator = this.b;
        if (animator != null) {
            animator.cancel();
        }
        if (!t()) {
            this.u.a(z ? 8 : 4, z);
            if (gVar != null) {
                gVar.b();
                return;
            }
            return;
        }
        ot otVar = this.d;
        if (otVar == null) {
            otVar = r();
        }
        AnimatorSet a = a(otVar, 0.0f, 0.0f, 0.0f);
        a.addListener(new C0051a(z, gVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.t;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                a.addListener(it.next());
            }
        }
        a.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ot otVar) {
        this.d = otVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int[] iArr) {
        this.g.a(iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float b() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(float f2) {
        if (this.o != f2) {
            this.o = f2;
            a(this.n, f2, this.p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Animator.AnimatorListener animatorListener) {
        if (this.s == null) {
            this.s = new ArrayList<>();
        }
        this.s.add(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(ColorStateList colorStateList) {
        Drawable drawable = this.k;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, eu.a(colorStateList));
        }
    }

    void b(Rect rect) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(g gVar, boolean z) {
        if (h()) {
            return;
        }
        Animator animator = this.b;
        if (animator != null) {
            animator.cancel();
        }
        if (!t()) {
            this.u.a(0, z);
            this.u.setAlpha(1.0f);
            this.u.setScaleY(1.0f);
            this.u.setScaleX(1.0f);
            c(1.0f);
            if (gVar != null) {
                gVar.a();
                return;
            }
            return;
        }
        if (this.u.getVisibility() != 0) {
            this.u.setAlpha(0.0f);
            this.u.setScaleY(0.0f);
            this.u.setScaleX(0.0f);
            c(0.0f);
        }
        ot otVar = this.c;
        if (otVar == null) {
            otVar = s();
        }
        AnimatorSet a = a(otVar, 1.0f, 1.0f, 1.0f);
        a.addListener(new b(z, gVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.s;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                a.addListener(it.next());
            }
        }
        a.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ot otVar) {
        this.c = otVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ot c() {
        return this.d;
    }

    final void c(float f2) {
        this.r = f2;
        Matrix matrix = this.z;
        a(f2, matrix);
        this.u.setImageMatrix(matrix);
    }

    public void c(Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.t;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float d() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(float f2) {
        if (this.p != f2) {
            this.p = f2;
            a(this.n, this.o, f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.s;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float e() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ot f() {
        return this.c;
    }

    boolean g() {
        return this.u.getVisibility() == 0 ? this.a == 1 : this.a != 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h() {
        return this.u.getVisibility() != 0 ? this.a == 2 : this.a != 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        this.g.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        if (n()) {
            q();
            this.u.getViewTreeObserver().addOnPreDrawListener(this.A);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        if (this.A != null) {
            this.u.getViewTreeObserver().removeOnPreDrawListener(this.A);
            this.A = null;
        }
    }

    void m() {
        float rotation = this.u.getRotation();
        if (this.i != rotation) {
            this.i = rotation;
            u();
        }
    }

    boolean n() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o() {
        c(this.r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p() {
        Rect rect = this.w;
        a(rect);
        b(rect);
        this.v.a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
