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
import androidx.core.graphics.drawable.C0239a;
import com.google.android.material.R$animator;
import com.google.android.material.internal.C2002a;
import com.google.android.material.internal.C2007f;
import com.google.android.material.internal.C2010i;
import java.util.ArrayList;
import java.util.Iterator;
import p000.C2445eu;
import p000.C2486fu;
import p000.C2565ht;
import p000.C2787it;
import p000.C2955mt;
import p000.C3001nt;
import p000.C3058ot;
import p000.C3107q2;
import p000.InterfaceC2526gu;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.floatingactionbutton.a */
/* loaded from: classes.dex */
public class C1997a {

    /* renamed from: B */
    static final TimeInterpolator f8424B = C2565ht.f10511c;

    /* renamed from: C */
    static final int[] f8425C = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: D */
    static final int[] f8426D = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: E */
    static final int[] f8427E = {R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: F */
    static final int[] f8428F = {R.attr.state_hovered, R.attr.state_enabled};

    /* renamed from: G */
    static final int[] f8429G = {R.attr.state_enabled};

    /* renamed from: H */
    static final int[] f8430H = new int[0];

    /* renamed from: A */
    private ViewTreeObserver.OnPreDrawListener f8431A;

    /* renamed from: b */
    Animator f8433b;

    /* renamed from: c */
    C3058ot f8434c;

    /* renamed from: d */
    C3058ot f8435d;

    /* renamed from: e */
    private C3058ot f8436e;

    /* renamed from: f */
    private C3058ot f8437f;

    /* renamed from: g */
    private final C2007f f8438g;

    /* renamed from: h */
    C2486fu f8439h;

    /* renamed from: i */
    private float f8440i;

    /* renamed from: j */
    Drawable f8441j;

    /* renamed from: k */
    Drawable f8442k;

    /* renamed from: l */
    C2002a f8443l;

    /* renamed from: m */
    Drawable f8444m;

    /* renamed from: n */
    float f8445n;

    /* renamed from: o */
    float f8446o;

    /* renamed from: p */
    float f8447p;

    /* renamed from: q */
    int f8448q;

    /* renamed from: s */
    private ArrayList<Animator.AnimatorListener> f8450s;

    /* renamed from: t */
    private ArrayList<Animator.AnimatorListener> f8451t;

    /* renamed from: u */
    final C2010i f8452u;

    /* renamed from: v */
    final InterfaceC2526gu f8453v;

    /* renamed from: a */
    int f8432a = 0;

    /* renamed from: r */
    float f8449r = 1.0f;

    /* renamed from: w */
    private final Rect f8454w = new Rect();

    /* renamed from: x */
    private final RectF f8455x = new RectF();

    /* renamed from: y */
    private final RectF f8456y = new RectF();

    /* renamed from: z */
    private final Matrix f8457z = new Matrix();

    /* renamed from: com.google.android.material.floatingactionbutton.a$a */
    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f8458a;

        /* renamed from: b */
        final /* synthetic */ boolean f8459b;

        /* renamed from: c */
        final /* synthetic */ g f8460c;

        a(boolean z, g gVar) {
            this.f8459b = z;
            this.f8460c = gVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f8458a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1997a c1997a = C1997a.this;
            c1997a.f8432a = 0;
            c1997a.f8433b = null;
            if (this.f8458a) {
                return;
            }
            c1997a.f8452u.m10277a(this.f8459b ? 8 : 4, this.f8459b);
            g gVar = this.f8460c;
            if (gVar != null) {
                gVar.mo10160b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1997a.this.f8452u.m10277a(0, this.f8459b);
            C1997a c1997a = C1997a.this;
            c1997a.f8432a = 1;
            c1997a.f8433b = animator;
            this.f8458a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$b */
    /* loaded from: classes.dex */
    class b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f8462a;

        /* renamed from: b */
        final /* synthetic */ g f8463b;

        b(boolean z, g gVar) {
            this.f8462a = z;
            this.f8463b = gVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1997a c1997a = C1997a.this;
            c1997a.f8432a = 0;
            c1997a.f8433b = null;
            g gVar = this.f8463b;
            if (gVar != null) {
                gVar.mo10159a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1997a.this.f8452u.m10277a(0, this.f8462a);
            C1997a c1997a = C1997a.this;
            c1997a.f8432a = 2;
            c1997a.f8433b = animator;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.a$c */
    /* loaded from: classes.dex */
    public class c implements ViewTreeObserver.OnPreDrawListener {
        c() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            C1997a.this.m10206m();
            return true;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$d */
    /* loaded from: classes.dex */
    private class d extends i {
        d(C1997a c1997a) {
            super(c1997a, null);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$e */
    /* loaded from: classes.dex */
    private class e extends i {
        e() {
            super(C1997a.this, null);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$f */
    /* loaded from: classes.dex */
    private class f extends i {
        f() {
            super(C1997a.this, null);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$g */
    /* loaded from: classes.dex */
    interface g {
        /* renamed from: a */
        void mo10159a();

        /* renamed from: b */
        void mo10160b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$h */
    /* loaded from: classes.dex */
    private class h extends i {
        h() {
            super(C1997a.this, null);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$i */
    /* loaded from: classes.dex */
    private abstract class i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f8469a;

        /* renamed from: b */
        private float f8470b;

        /* renamed from: c */
        private float f8471c;

        private i() {
        }

        /* synthetic */ i(C1997a c1997a, a aVar) {
            this();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1997a.this.f8439h.m11834b(this.f8471c);
            throw null;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f8469a) {
                C1997a.this.f8439h.m11833b();
                throw null;
            }
            C2486fu c2486fu = C1997a.this.f8439h;
            float f = this.f8470b;
            c2486fu.m11834b(f + ((this.f8471c - f) * valueAnimator.getAnimatedFraction()));
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1997a(C2010i c2010i, InterfaceC2526gu interfaceC2526gu) {
        this.f8452u = c2010i;
        this.f8453v = interfaceC2526gu;
        C2007f c2007f = new C2007f();
        this.f8438g = c2007f;
        c2007f.m10265a(f8425C, m10168a((i) new f()));
        this.f8438g.m10265a(f8426D, m10168a((i) new e()));
        this.f8438g.m10265a(f8427E, m10168a((i) new e()));
        this.f8438g.m10265a(f8428F, m10168a((i) new e()));
        this.f8438g.m10265a(f8429G, m10168a((i) new h()));
        this.f8438g.m10265a(f8430H, m10168a((i) new d(this)));
        this.f8440i = this.f8452u.getRotation();
    }

    /* renamed from: a */
    private AnimatorSet m10167a(C3058ot c3058ot, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f8452u, (Property<C2010i, Float>) View.ALPHA, f2);
        c3058ot.m14655a("opacity").m14820a((Animator) ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f8452u, (Property<C2010i, Float>) View.SCALE_X, f3);
        c3058ot.m14655a("scale").m14820a((Animator) ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f8452u, (Property<C2010i, Float>) View.SCALE_Y, f3);
        c3058ot.m14655a("scale").m14820a((Animator) ofFloat3);
        arrayList.add(ofFloat3);
        m10169a(f4, this.f8457z);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f8452u, new C2955mt(), new C3001nt(), new Matrix(this.f8457z));
        c3058ot.m14655a("iconScale").m14820a((Animator) ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C2787it.m13264a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: a */
    private ValueAnimator m10168a(i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f8424B);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* renamed from: a */
    private void m10169a(float f2, Matrix matrix) {
        matrix.reset();
        if (this.f8452u.getDrawable() == null || this.f8448q == 0) {
            return;
        }
        RectF rectF = this.f8455x;
        RectF rectF2 = this.f8456y;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i2 = this.f8448q;
        rectF2.set(0.0f, 0.0f, i2, i2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i3 = this.f8448q;
        matrix.postScale(f2, f2, i3 / 2.0f, i3 / 2.0f);
    }

    /* renamed from: q */
    private void m10170q() {
        if (this.f8431A == null) {
            this.f8431A = new c();
        }
    }

    /* renamed from: r */
    private C3058ot m10171r() {
        if (this.f8437f == null) {
            this.f8437f = C3058ot.m14651a(this.f8452u.getContext(), R$animator.design_fab_hide_motion_spec);
        }
        return this.f8437f;
    }

    /* renamed from: s */
    private C3058ot m10172s() {
        if (this.f8436e == null) {
            this.f8436e = C3058ot.m14651a(this.f8452u.getContext(), R$animator.design_fab_show_motion_spec);
        }
        return this.f8436e;
    }

    /* renamed from: t */
    private boolean m10173t() {
        return C3107q2.m14932x(this.f8452u) && !this.f8452u.isInEditMode();
    }

    /* renamed from: u */
    private void m10174u() {
        C2010i c2010i;
        int i2;
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f8440i % 90.0f != 0.0f) {
                i2 = 1;
                if (this.f8452u.getLayerType() != 1) {
                    c2010i = this.f8452u;
                    c2010i.setLayerType(i2, null);
                }
            } else if (this.f8452u.getLayerType() != 0) {
                c2010i = this.f8452u;
                i2 = 0;
                c2010i.setLayerType(i2, null);
            }
        }
        C2486fu c2486fu = this.f8439h;
        if (c2486fu != null) {
            c2486fu.m11831a(-this.f8440i);
            throw null;
        }
        C2002a c2002a = this.f8443l;
        if (c2002a == null) {
            return;
        }
        c2002a.m10214a(-this.f8440i);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final Drawable m10175a() {
        return this.f8444m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m10176a(float f2) {
        if (this.f8445n != f2) {
            this.f8445n = f2;
            mo10177a(f2, this.f8446o, this.f8447p);
        }
    }

    /* renamed from: a */
    void mo10177a(float f2, float f3, float f4) {
        C2486fu c2486fu = this.f8439h;
        if (c2486fu == null) {
            return;
        }
        c2486fu.m11832a(f2, this.f8447p + f2);
        throw null;
    }

    /* renamed from: a */
    public void m10178a(Animator.AnimatorListener animatorListener) {
        if (this.f8451t == null) {
            this.f8451t = new ArrayList<>();
        }
        this.f8451t.add(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m10179a(ColorStateList colorStateList) {
        Drawable drawable = this.f8441j;
        if (drawable != null) {
            C0239a.m1480a(drawable, colorStateList);
        }
        C2002a c2002a = this.f8443l;
        if (c2002a == null) {
            return;
        }
        c2002a.m10215a(colorStateList);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m10180a(PorterDuff.Mode mode) {
        Drawable drawable = this.f8441j;
        if (drawable != null) {
            C0239a.m1483a(drawable, mode);
        }
    }

    /* renamed from: a */
    void mo10181a(Rect rect) {
        this.f8439h.getPadding(rect);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m10182a(g gVar, boolean z) {
        if (m10200g()) {
            return;
        }
        Animator animator = this.f8433b;
        if (animator != null) {
            animator.cancel();
        }
        if (!m10173t()) {
            this.f8452u.m10277a(z ? 8 : 4, z);
            if (gVar != null) {
                gVar.mo10160b();
                return;
            }
            return;
        }
        C3058ot c3058ot = this.f8435d;
        if (c3058ot == null) {
            c3058ot = m10171r();
        }
        AnimatorSet m10167a = m10167a(c3058ot, 0.0f, 0.0f, 0.0f);
        m10167a.addListener(new a(z, gVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.f8451t;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                m10167a.addListener(it.next());
            }
        }
        m10167a.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m10183a(C3058ot c3058ot) {
        this.f8435d = c3058ot;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10184a(int[] iArr) {
        this.f8438g.m10264a(iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo10185b() {
        return this.f8445n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m10186b(float f2) {
        if (this.f8446o != f2) {
            this.f8446o = f2;
            mo10177a(this.f8445n, f2, this.f8447p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m10187b(Animator.AnimatorListener animatorListener) {
        if (this.f8450s == null) {
            this.f8450s = new ArrayList<>();
        }
        this.f8450s.add(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10188b(ColorStateList colorStateList) {
        Drawable drawable = this.f8442k;
        if (drawable != null) {
            C0239a.m1480a(drawable, C2445eu.m11636a(colorStateList));
        }
    }

    /* renamed from: b */
    void mo10189b(Rect rect) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m10190b(g gVar, boolean z) {
        if (m10201h()) {
            return;
        }
        Animator animator = this.f8433b;
        if (animator != null) {
            animator.cancel();
        }
        if (!m10173t()) {
            this.f8452u.m10277a(0, z);
            this.f8452u.setAlpha(1.0f);
            this.f8452u.setScaleY(1.0f);
            this.f8452u.setScaleX(1.0f);
            m10193c(1.0f);
            if (gVar != null) {
                gVar.mo10159a();
                return;
            }
            return;
        }
        if (this.f8452u.getVisibility() != 0) {
            this.f8452u.setAlpha(0.0f);
            this.f8452u.setScaleY(0.0f);
            this.f8452u.setScaleX(0.0f);
            m10193c(0.0f);
        }
        C3058ot c3058ot = this.f8434c;
        if (c3058ot == null) {
            c3058ot = m10172s();
        }
        AnimatorSet m10167a = m10167a(c3058ot, 1.0f, 1.0f, 1.0f);
        m10167a.addListener(new b(z, gVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.f8450s;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                m10167a.addListener(it.next());
            }
        }
        m10167a.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m10191b(C3058ot c3058ot) {
        this.f8434c = c3058ot;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final C3058ot m10192c() {
        return this.f8435d;
    }

    /* renamed from: c */
    final void m10193c(float f2) {
        this.f8449r = f2;
        Matrix matrix = this.f8457z;
        m10169a(f2, matrix);
        this.f8452u.setImageMatrix(matrix);
    }

    /* renamed from: c */
    public void m10194c(Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f8451t;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public float m10195d() {
        return this.f8446o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m10196d(float f2) {
        if (this.f8447p != f2) {
            this.f8447p = f2;
            mo10177a(this.f8445n, this.f8446o, f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m10197d(Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f8450s;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public float m10198e() {
        return this.f8447p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final C3058ot m10199f() {
        return this.f8434c;
    }

    /* renamed from: g */
    boolean m10200g() {
        return this.f8452u.getVisibility() == 0 ? this.f8432a == 1 : this.f8432a != 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m10201h() {
        return this.f8452u.getVisibility() != 0 ? this.f8432a == 2 : this.f8432a != 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo10202i() {
        this.f8438g.m10263a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m10203j() {
        if (mo10207n()) {
            m10170q();
            this.f8452u.getViewTreeObserver().addOnPreDrawListener(this.f8431A);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo10204k() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m10205l() {
        if (this.f8431A != null) {
            this.f8452u.getViewTreeObserver().removeOnPreDrawListener(this.f8431A);
            this.f8431A = null;
        }
    }

    /* renamed from: m */
    void m10206m() {
        float rotation = this.f8452u.getRotation();
        if (this.f8440i != rotation) {
            this.f8440i = rotation;
            m10174u();
        }
    }

    /* renamed from: n */
    boolean mo10207n() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public final void m10208o() {
        m10193c(this.f8449r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final void m10209p() {
        Rect rect = this.f8454w;
        mo10181a(rect);
        mo10189b(rect);
        this.f8453v.mo10163a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
