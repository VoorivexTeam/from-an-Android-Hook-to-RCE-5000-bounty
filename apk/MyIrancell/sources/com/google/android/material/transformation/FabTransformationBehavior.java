package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$id;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p000.C2359cu;
import p000.C2565ht;
import p000.C2787it;
import p000.C2827jt;
import p000.C2872kt;
import p000.C2909lt;
import p000.C3058ot;
import p000.C3097pt;
import p000.C3107q2;
import p000.C3139qt;
import p000.C3318ut;
import p000.C3410wt;
import p000.InterfaceC3450xt;

/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final Rect f8759c;

    /* renamed from: d */
    private final RectF f8760d;

    /* renamed from: e */
    private final RectF f8761e;

    /* renamed from: f */
    private final int[] f8762f;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    /* loaded from: classes.dex */
    class C2039a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f8763a;

        /* renamed from: b */
        final /* synthetic */ View f8764b;

        /* renamed from: c */
        final /* synthetic */ View f8765c;

        C2039a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.f8763a = z;
            this.f8764b = view;
            this.f8765c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f8763a) {
                return;
            }
            this.f8764b.setVisibility(4);
            this.f8765c.setAlpha(1.0f);
            this.f8765c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f8763a) {
                this.f8764b.setVisibility(0);
                this.f8765c.setAlpha(0.0f);
                this.f8765c.setVisibility(4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    /* loaded from: classes.dex */
    public class C2040b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f8766a;

        C2040b(FabTransformationBehavior fabTransformationBehavior, View view) {
            this.f8766a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f8766a.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    /* loaded from: classes.dex */
    public class C2041c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3450xt f8767a;

        /* renamed from: b */
        final /* synthetic */ Drawable f8768b;

        C2041c(FabTransformationBehavior fabTransformationBehavior, InterfaceC3450xt interfaceC3450xt, Drawable drawable) {
            this.f8767a = interfaceC3450xt;
            this.f8768b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f8767a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f8767a.setCircularRevealOverlayDrawable(this.f8768b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    /* loaded from: classes.dex */
    public class C2042d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3450xt f8769a;

        C2042d(FabTransformationBehavior fabTransformationBehavior, InterfaceC3450xt interfaceC3450xt) {
            this.f8769a = interfaceC3450xt;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            InterfaceC3450xt.e revealInfo = this.f8769a.getRevealInfo();
            revealInfo.f14072c = Float.MAX_VALUE;
            this.f8769a.setRevealInfo(revealInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$e */
    /* loaded from: classes.dex */
    public static class C2043e {

        /* renamed from: a */
        public C3058ot f8770a;

        /* renamed from: b */
        public C3139qt f8771b;
    }

    public FabTransformationBehavior() {
        this.f8759c = new Rect();
        this.f8760d = new RectF();
        this.f8761e = new RectF();
        this.f8762f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8759c = new Rect();
        this.f8760d = new RectF();
        this.f8761e = new RectF();
        this.f8762f = new int[2];
    }

    /* renamed from: a */
    private float m10460a(View view, View view2, C3139qt c3139qt) {
        RectF rectF = this.f8760d;
        RectF rectF2 = this.f8761e;
        m10465a(view, rectF);
        m10465a(view2, rectF2);
        rectF2.offset(-m10473c(view, view2, c3139qt), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: a */
    private float m10461a(C2043e c2043e, C3097pt c3097pt, float f, float f2) {
        long m14819a = c3097pt.m14819a();
        long m14821b = c3097pt.m14821b();
        C3097pt m14655a = c2043e.f8770a.m14655a("expansion");
        return C2565ht.m12243a(f, f2, c3097pt.m14822c().getInterpolation(((float) (((m14655a.m14819a() + m14655a.m14821b()) + 17) - m14819a)) / ((float) m14821b)));
    }

    /* renamed from: a */
    private ViewGroup m10462a(View view) {
        View findViewById = view.findViewById(R$id.mtrl_child_content_container);
        return findViewById != null ? m10474c(findViewById) : ((view instanceof C2046b) || (view instanceof C2045a)) ? m10474c(((ViewGroup) view).getChildAt(0)) : m10474c(view);
    }

    /* renamed from: a */
    private void m10463a(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT < 21 || j <= 0) {
            return;
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
        createCircularReveal.setStartDelay(0L);
        createCircularReveal.setDuration(j);
        list.add(createCircularReveal);
    }

    /* renamed from: a */
    private void m10464a(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j4 = j + j2;
            if (j4 < j3) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
                createCircularReveal.setStartDelay(j4);
                createCircularReveal.setDuration(j3 - j4);
                list.add(createCircularReveal);
            }
        }
    }

    /* renamed from: a */
    private void m10465a(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f8762f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private void m10466a(View view, View view2, boolean z, boolean z2, C2043e c2043e, float f, float f2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (view2 instanceof InterfaceC3450xt) {
            InterfaceC3450xt interfaceC3450xt = (InterfaceC3450xt) view2;
            float m10460a = m10460a(view, view2, c2043e.f8771b);
            float m10470b = m10470b(view, view2, c2043e.f8771b);
            ((FloatingActionButton) view).m10144a(this.f8759c);
            float width = this.f8759c.width() / 2.0f;
            C3097pt m14655a = c2043e.f8770a.m14655a("expansion");
            if (z) {
                if (!z2) {
                    interfaceC3450xt.setRevealInfo(new InterfaceC3450xt.e(m10460a, m10470b, width));
                }
                if (z2) {
                    width = interfaceC3450xt.getRevealInfo().f14072c;
                }
                animator = C3318ut.m15851a(interfaceC3450xt, m10460a, m10470b, C2359cu.m11213a(m10460a, m10470b, 0.0f, 0.0f, f, f2));
                animator.addListener(new C2042d(this, interfaceC3450xt));
                m10463a(view2, m14655a.m14819a(), (int) m10460a, (int) m10470b, width, list);
            } else {
                float f3 = interfaceC3450xt.getRevealInfo().f14072c;
                Animator m15851a = C3318ut.m15851a(interfaceC3450xt, m10460a, m10470b, width);
                int i = (int) m10460a;
                int i2 = (int) m10470b;
                m10463a(view2, m14655a.m14819a(), i, i2, f3, list);
                m10464a(view2, m14655a.m14819a(), m14655a.m14821b(), c2043e.f8770a.m14654a(), i, i2, width, list);
                animator = m15851a;
            }
            m14655a.m14820a(animator);
            list.add(animator);
            list2.add(C3318ut.m15850a(interfaceC3450xt));
        }
    }

    /* renamed from: a */
    private void m10467a(View view, View view2, boolean z, boolean z2, C2043e c2043e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup m10462a;
        ObjectAnimator ofFloat;
        if (view2 instanceof ViewGroup) {
            if (((view2 instanceof InterfaceC3450xt) && C3410wt.f13968a == 0) || (m10462a = m10462a(view2)) == null) {
                return;
            }
            if (z) {
                if (!z2) {
                    C2872kt.f11767a.set(m10462a, Float.valueOf(0.0f));
                }
                ofFloat = ObjectAnimator.ofFloat(m10462a, C2872kt.f11767a, 1.0f);
            } else {
                ofFloat = ObjectAnimator.ofFloat(m10462a, C2872kt.f11767a, 0.0f);
            }
            c2043e.f8770a.m14655a("contentFade").m14820a((Animator) ofFloat);
            list.add(ofFloat);
        }
    }

    /* renamed from: a */
    private void m10468a(View view, View view2, boolean z, boolean z2, C2043e c2043e, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        C3097pt m14655a;
        C3058ot c3058ot;
        String str;
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float m10473c = m10473c(view, view2, c2043e.f8771b);
        float m10476d = m10476d(view, view2, c2043e.f8771b);
        if (m10473c == 0.0f || m10476d == 0.0f) {
            m14655a = c2043e.f8770a.m14655a("translationXLinear");
            c3058ot = c2043e.f8770a;
            str = "translationYLinear";
        } else if ((!z || m10476d >= 0.0f) && (z || m10476d <= 0.0f)) {
            m14655a = c2043e.f8770a.m14655a("translationXCurveDownwards");
            c3058ot = c2043e.f8770a;
            str = "translationYCurveDownwards";
        } else {
            m14655a = c2043e.f8770a.m14655a("translationXCurveUpwards");
            c3058ot = c2043e.f8770a;
            str = "translationYCurveUpwards";
        }
        C3097pt m14655a2 = c3058ot.m14655a(str);
        C3097pt c3097pt = m14655a;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-m10473c);
                view2.setTranslationY(-m10476d);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            m10469a(view2, c2043e, c3097pt, m14655a2, -m10473c, -m10476d, 0.0f, 0.0f, rectF);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -m10473c);
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -m10476d);
        }
        c3097pt.m14820a((Animator) ofFloat);
        m14655a2.m14820a((Animator) ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    /* renamed from: a */
    private void m10469a(View view, C2043e c2043e, C3097pt c3097pt, C3097pt c3097pt2, float f, float f2, float f3, float f4, RectF rectF) {
        float m10461a = m10461a(c2043e, c3097pt, f, f3);
        float m10461a2 = m10461a(c2043e, c3097pt2, f2, f4);
        Rect rect = this.f8759c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f8760d;
        rectF2.set(rect);
        RectF rectF3 = this.f8761e;
        m10465a(view, rectF3);
        rectF3.offset(m10461a, m10461a2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: b */
    private float m10470b(View view, View view2, C3139qt c3139qt) {
        RectF rectF = this.f8760d;
        RectF rectF2 = this.f8761e;
        m10465a(view, rectF);
        m10465a(view2, rectF2);
        rectF2.offset(0.0f, -m10476d(view, view2, c3139qt));
        return rectF.centerY() - rectF2.top;
    }

    /* renamed from: b */
    private int m10471b(View view) {
        ColorStateList m14905c = C3107q2.m14905c(view);
        if (m14905c != null) {
            return m14905c.getColorForState(view.getDrawableState(), m14905c.getDefaultColor());
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private void m10472b(View view, View view2, boolean z, boolean z2, C2043e c2043e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if (view2 instanceof InterfaceC3450xt) {
            InterfaceC3450xt interfaceC3450xt = (InterfaceC3450xt) view2;
            int m10471b = m10471b(view);
            int i = 16777215 & m10471b;
            if (z) {
                if (!z2) {
                    interfaceC3450xt.setCircularRevealScrimColor(m10471b);
                }
                ofInt = ObjectAnimator.ofInt(interfaceC3450xt, InterfaceC3450xt.d.f14069a, i);
            } else {
                ofInt = ObjectAnimator.ofInt(interfaceC3450xt, InterfaceC3450xt.d.f14069a, m10471b);
            }
            ofInt.setEvaluator(C2827jt.m13515a());
            c2043e.f8770a.m14655a("color").m14820a((Animator) ofInt);
            list.add(ofInt);
        }
    }

    /* renamed from: c */
    private float m10473c(View view, View view2, C3139qt c3139qt) {
        float centerX;
        float centerX2;
        float f;
        RectF rectF = this.f8760d;
        RectF rectF2 = this.f8761e;
        m10465a(view, rectF);
        m10465a(view2, rectF2);
        int i = c3139qt.f12827a & 7;
        if (i == 1) {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        } else if (i == 3) {
            centerX = rectF2.left;
            centerX2 = rectF.left;
        } else {
            if (i != 5) {
                f = 0.0f;
                return f + c3139qt.f12828b;
            }
            centerX = rectF2.right;
            centerX2 = rectF.right;
        }
        f = centerX - centerX2;
        return f + c3139qt.f12828b;
    }

    /* renamed from: c */
    private ViewGroup m10474c(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @TargetApi(21)
    /* renamed from: c */
    private void m10475c(View view, View view2, boolean z, boolean z2, C2043e c2043e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        float m14913g = C3107q2.m14913g(view2) - C3107q2.m14913g(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-m14913g);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -m14913g);
        }
        c2043e.f8770a.m14655a("elevation").m14820a((Animator) ofFloat);
        list.add(ofFloat);
    }

    /* renamed from: d */
    private float m10476d(View view, View view2, C3139qt c3139qt) {
        float centerY;
        float centerY2;
        float f;
        RectF rectF = this.f8760d;
        RectF rectF2 = this.f8761e;
        m10465a(view, rectF);
        m10465a(view2, rectF2);
        int i = c3139qt.f12827a & 112;
        if (i == 16) {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        } else if (i == 48) {
            centerY = rectF2.top;
            centerY2 = rectF.top;
        } else {
            if (i != 80) {
                f = 0.0f;
                return f + c3139qt.f12829c;
            }
            centerY = rectF2.bottom;
            centerY2 = rectF.bottom;
        }
        f = centerY - centerY2;
        return f + c3139qt.f12829c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    private void m10477d(View view, View view2, boolean z, boolean z2, C2043e c2043e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if ((view2 instanceof InterfaceC3450xt) && (view instanceof ImageView)) {
            InterfaceC3450xt interfaceC3450xt = (InterfaceC3450xt) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z) {
                if (!z2) {
                    drawable.setAlpha(255);
                }
                ofInt = ObjectAnimator.ofInt(drawable, C2909lt.f11920b, 0);
            } else {
                ofInt = ObjectAnimator.ofInt(drawable, C2909lt.f11920b, 255);
            }
            ofInt.addUpdateListener(new C2040b(this, view2));
            c2043e.f8770a.m14655a("iconFade").m14820a((Animator) ofInt);
            list.add(ofInt);
            list2.add(new C2041c(this, interfaceC3450xt, drawable));
        }
    }

    /* renamed from: a */
    protected abstract C2043e mo10478a(Context context, boolean z);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
    /* renamed from: a */
    public void mo1294a(CoordinatorLayout.C0217f c0217f) {
        if (c0217f.f1354h == 0) {
            c0217f.f1354h = 80;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0214c
    /* renamed from: a */
    public boolean mo1309a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: b */
    protected AnimatorSet mo10459b(View view, View view2, boolean z, boolean z2) {
        C2043e mo10478a = mo10478a(view2.getContext(), z);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            m10475c(view, view2, z, z2, mo10478a, arrayList, arrayList2);
        }
        RectF rectF = this.f8760d;
        m10468a(view, view2, z, z2, mo10478a, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        m10477d(view, view2, z, z2, mo10478a, arrayList, arrayList2);
        m10466a(view, view2, z, z2, mo10478a, width, height, arrayList, arrayList2);
        m10472b(view, view2, z, z2, mo10478a, arrayList, arrayList2);
        m10467a(view, view2, z, z2, mo10478a, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        C2787it.m13264a(animatorSet, arrayList);
        animatorSet.addListener(new C2039a(this, z, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener(arrayList2.get(i));
        }
        return animatorSet;
    }
}
