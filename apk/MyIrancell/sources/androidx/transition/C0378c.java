package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import p000.C3107q2;

/* renamed from: androidx.transition.c */
/* loaded from: classes.dex */
public class C0378c extends AbstractC0396l {

    /* renamed from: N */
    private static final String[] f2376N = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: O */
    private static final Property<Drawable, PointF> f2377O = new b(PointF.class, "boundsOrigin");

    /* renamed from: P */
    private static final Property<k, PointF> f2378P = new c(PointF.class, "topLeft");

    /* renamed from: Q */
    private static final Property<k, PointF> f2379Q = new d(PointF.class, "bottomRight");

    /* renamed from: R */
    private static final Property<View, PointF> f2380R = new e(PointF.class, "bottomRight");

    /* renamed from: S */
    private static final Property<View, PointF> f2381S = new f(PointF.class, "topLeft");

    /* renamed from: T */
    private static final Property<View, PointF> f2382T = new g(PointF.class, "position");

    /* renamed from: U */
    private static C0392j f2383U = new C0392j();

    /* renamed from: K */
    private int[] f2384K = new int[2];

    /* renamed from: L */
    private boolean f2385L = false;

    /* renamed from: M */
    private boolean f2386M = false;

    /* renamed from: androidx.transition.c$a */
    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2387a;

        /* renamed from: b */
        final /* synthetic */ BitmapDrawable f2388b;

        /* renamed from: c */
        final /* synthetic */ View f2389c;

        /* renamed from: d */
        final /* synthetic */ float f2390d;

        a(C0378c c0378c, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f2387a = viewGroup;
            this.f2388b = bitmapDrawable;
            this.f2389c = view;
            this.f2390d = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0379c0.m2949b(this.f2387a).mo2917b(this.f2388b);
            C0379c0.m2945a(this.f2389c, this.f2390d);
        }
    }

    /* renamed from: androidx.transition.c$b */
    /* loaded from: classes.dex */
    static class b extends Property<Drawable, PointF> {

        /* renamed from: a */
        private Rect f2391a;

        b(Class cls, String str) {
            super(cls, str);
            this.f2391a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f2391a);
            Rect rect = this.f2391a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f2391a);
            this.f2391a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f2391a);
        }
    }

    /* renamed from: androidx.transition.c$c */
    /* loaded from: classes.dex */
    static class c extends Property<k, PointF> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.m2942b(pointF);
        }
    }

    /* renamed from: androidx.transition.c$d */
    /* loaded from: classes.dex */
    static class d extends Property<k, PointF> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.m2941a(pointF);
        }
    }

    /* renamed from: androidx.transition.c$e */
    /* loaded from: classes.dex */
    static class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            C0379c0.m2947a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: androidx.transition.c$f */
    /* loaded from: classes.dex */
    static class f extends Property<View, PointF> {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            C0379c0.m2947a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: androidx.transition.c$g */
    /* loaded from: classes.dex */
    static class g extends Property<View, PointF> {
        g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C0379c0.m2947a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: androidx.transition.c$h */
    /* loaded from: classes.dex */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ k f2392a;
        private k mViewBounds;

        h(C0378c c0378c, k kVar) {
            this.f2392a = kVar;
            this.mViewBounds = this.f2392a;
        }
    }

    /* renamed from: androidx.transition.c$i */
    /* loaded from: classes.dex */
    class i extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f2393a;

        /* renamed from: b */
        final /* synthetic */ View f2394b;

        /* renamed from: c */
        final /* synthetic */ Rect f2395c;

        /* renamed from: d */
        final /* synthetic */ int f2396d;

        /* renamed from: e */
        final /* synthetic */ int f2397e;

        /* renamed from: f */
        final /* synthetic */ int f2398f;

        /* renamed from: g */
        final /* synthetic */ int f2399g;

        i(C0378c c0378c, View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f2394b = view;
            this.f2395c = rect;
            this.f2396d = i;
            this.f2397e = i2;
            this.f2398f = i3;
            this.f2399g = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2393a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f2393a) {
                return;
            }
            C3107q2.m14890a(this.f2394b, this.f2395c);
            C0379c0.m2947a(this.f2394b, this.f2396d, this.f2397e, this.f2398f, this.f2399g);
        }
    }

    /* renamed from: androidx.transition.c$j */
    /* loaded from: classes.dex */
    class j extends C0397m {

        /* renamed from: a */
        boolean f2400a = false;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f2401b;

        j(C0378c c0378c, ViewGroup viewGroup) {
            this.f2401b = viewGroup;
        }

        @Override // androidx.transition.C0397m, androidx.transition.AbstractC0396l.f
        /* renamed from: b */
        public void mo2937b(AbstractC0396l abstractC0396l) {
            C0407w.m3059a(this.f2401b, false);
        }

        @Override // androidx.transition.C0397m, androidx.transition.AbstractC0396l.f
        /* renamed from: c */
        public void mo2938c(AbstractC0396l abstractC0396l) {
            C0407w.m3059a(this.f2401b, true);
        }

        @Override // androidx.transition.AbstractC0396l.f
        /* renamed from: d */
        public void mo2939d(AbstractC0396l abstractC0396l) {
            if (!this.f2400a) {
                C0407w.m3059a(this.f2401b, false);
            }
            abstractC0396l.mo3020b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.c$k */
    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: a */
        private int f2402a;

        /* renamed from: b */
        private int f2403b;

        /* renamed from: c */
        private int f2404c;

        /* renamed from: d */
        private int f2405d;

        /* renamed from: e */
        private View f2406e;

        /* renamed from: f */
        private int f2407f;

        /* renamed from: g */
        private int f2408g;

        k(View view) {
            this.f2406e = view;
        }

        /* renamed from: a */
        private void m2940a() {
            C0379c0.m2947a(this.f2406e, this.f2402a, this.f2403b, this.f2404c, this.f2405d);
            this.f2407f = 0;
            this.f2408g = 0;
        }

        /* renamed from: a */
        void m2941a(PointF pointF) {
            this.f2404c = Math.round(pointF.x);
            this.f2405d = Math.round(pointF.y);
            int i = this.f2408g + 1;
            this.f2408g = i;
            if (this.f2407f == i) {
                m2940a();
            }
        }

        /* renamed from: b */
        void m2942b(PointF pointF) {
            this.f2402a = Math.round(pointF.x);
            this.f2403b = Math.round(pointF.y);
            int i = this.f2407f + 1;
            this.f2407f = i;
            if (i == this.f2408g) {
                m2940a();
            }
        }
    }

    /* renamed from: a */
    private boolean m2919a(View view, View view2) {
        if (!this.f2386M) {
            return true;
        }
        C0402r m3007a = m3007a(view, true);
        if (m3007a == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == m3007a.f2525b) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m2920d(C0402r c0402r) {
        View view = c0402r.f2525b;
        if (!C3107q2.m14932x(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        c0402r.f2524a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        c0402r.f2524a.put("android:changeBounds:parent", c0402r.f2525b.getParent());
        if (this.f2386M) {
            c0402r.f2525b.getLocationInWindow(this.f2384K);
            c0402r.f2524a.put("android:changeBounds:windowX", Integer.valueOf(this.f2384K[0]));
            c0402r.f2524a.put("android:changeBounds:windowY", Integer.valueOf(this.f2384K[1]));
        }
        if (this.f2385L) {
            c0402r.f2524a.put("android:changeBounds:clip", C3107q2.m14909e(view));
        }
    }

    @Override // androidx.transition.AbstractC0396l
    /* renamed from: a */
    public Animator mo2921a(ViewGroup viewGroup, C0402r c0402r, C0402r c0402r2) {
        int i2;
        View view;
        int i3;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator m3052a;
        Path mo2977a;
        Property<View, PointF> property;
        if (c0402r == null || c0402r2 == null) {
            return null;
        }
        Map<String, Object> map = c0402r.f2524a;
        Map<String, Object> map2 = c0402r2.f2524a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = c0402r2.f2525b;
        if (!m2919a(viewGroup2, viewGroup3)) {
            int intValue = ((Integer) c0402r.f2524a.get("android:changeBounds:windowX")).intValue();
            int intValue2 = ((Integer) c0402r.f2524a.get("android:changeBounds:windowY")).intValue();
            int intValue3 = ((Integer) c0402r2.f2524a.get("android:changeBounds:windowX")).intValue();
            int intValue4 = ((Integer) c0402r2.f2524a.get("android:changeBounds:windowY")).intValue();
            if (intValue == intValue3 && intValue2 == intValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.f2384K);
            Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(createBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
            float m2951c = C0379c0.m2951c(view2);
            C0379c0.m2945a(view2, 0.0f);
            C0379c0.m2949b(viewGroup).mo2916a(bitmapDrawable);
            AbstractC0386g m3030j = m3030j();
            int[] iArr = this.f2384K;
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, C0390i.m2987a(f2377O, m3030j.mo2977a(intValue - iArr[0], intValue2 - iArr[1], intValue3 - iArr[0], intValue4 - iArr[1])));
            ofPropertyValuesHolder.addListener(new a(this, viewGroup, bitmapDrawable, view2, m2951c));
            return ofPropertyValuesHolder;
        }
        Rect rect2 = (Rect) c0402r.f2524a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) c0402r2.f2524a.get("android:changeBounds:bounds");
        int i4 = rect2.left;
        int i5 = rect3.left;
        int i6 = rect2.top;
        int i7 = rect3.top;
        int i8 = rect2.right;
        int i9 = rect3.right;
        int i10 = rect2.bottom;
        int i11 = rect3.bottom;
        int i12 = i8 - i4;
        int i13 = i10 - i6;
        int i14 = i9 - i5;
        int i15 = i11 - i7;
        Rect rect4 = (Rect) c0402r.f2524a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) c0402r2.f2524a.get("android:changeBounds:clip");
        if ((i12 == 0 || i13 == 0) && (i14 == 0 || i15 == 0)) {
            i2 = 0;
        } else {
            i2 = (i4 == i5 && i6 == i7) ? 0 : 1;
            if (i8 != i9 || i10 != i11) {
                i2++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i2++;
        }
        if (i2 <= 0) {
            return null;
        }
        if (this.f2385L) {
            view = view2;
            C0379c0.m2947a(view, i4, i6, Math.max(i12, i14) + i4, Math.max(i13, i15) + i6);
            ObjectAnimator m2974a = (i4 == i5 && i6 == i7) ? null : C0384f.m2974a(view, f2382T, m3030j().mo2977a(i4, i6, i5, i7));
            if (rect4 == null) {
                i3 = 0;
                rect = new Rect(0, 0, i12, i13);
            } else {
                i3 = 0;
                rect = rect4;
            }
            Rect rect6 = rect5 == null ? new Rect(i3, i3, i14, i15) : rect5;
            if (rect.equals(rect6)) {
                objectAnimator = null;
            } else {
                C3107q2.m14890a(view, rect);
                C0392j c0392j = f2383U;
                Object[] objArr = new Object[2];
                objArr[i3] = rect;
                objArr[1] = rect6;
                ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", c0392j, objArr);
                ofObject.addListener(new i(this, view, rect5, i5, i7, i9, i11));
                objectAnimator = ofObject;
            }
            m3052a = C0401q.m3052a(m2974a, objectAnimator);
        } else {
            view = view2;
            C0379c0.m2947a(view, i4, i6, i8, i10);
            if (i2 == 2) {
                if (i12 == i14 && i13 == i15) {
                    mo2977a = m3030j().mo2977a(i4, i6, i5, i7);
                    property = f2382T;
                } else {
                    k kVar = new k(view);
                    ObjectAnimator m2974a2 = C0384f.m2974a(kVar, f2378P, m3030j().mo2977a(i4, i6, i5, i7));
                    ObjectAnimator m2974a3 = C0384f.m2974a(kVar, f2379Q, m3030j().mo2977a(i8, i10, i9, i11));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(m2974a2, m2974a3);
                    animatorSet.addListener(new h(this, kVar));
                    m3052a = animatorSet;
                }
            } else if (i4 == i5 && i6 == i7) {
                mo2977a = m3030j().mo2977a(i8, i10, i9, i11);
                property = f2380R;
            } else {
                mo2977a = m3030j().mo2977a(i4, i6, i5, i7);
                property = f2381S;
            }
            m3052a = C0384f.m2974a(view, property, mo2977a);
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            C0407w.m3059a(viewGroup4, true);
            mo3006a(new j(this, viewGroup4));
        }
        return m3052a;
    }

    @Override // androidx.transition.AbstractC0396l
    /* renamed from: a */
    public void mo2922a(C0402r c0402r) {
        m2920d(c0402r);
    }

    @Override // androidx.transition.AbstractC0396l
    /* renamed from: c */
    public void mo2923c(C0402r c0402r) {
        m2920d(c0402r);
    }

    @Override // androidx.transition.AbstractC0396l
    /* renamed from: q */
    public String[] mo2924q() {
        return f2376N;
    }
}
