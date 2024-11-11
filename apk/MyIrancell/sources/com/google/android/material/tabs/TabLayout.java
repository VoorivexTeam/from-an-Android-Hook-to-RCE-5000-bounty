package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0081a;
import androidx.appcompat.widget.C0202v0;
import androidx.core.graphics.drawable.C0239a;
import androidx.core.widget.C0257i;
import androidx.viewpager.widget.AbstractC0429a;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$layout;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.C2008g;
import com.google.android.material.internal.C2009h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p000.C0000a;
import p000.C2402du;
import p000.C2414e2;
import p000.C2445eu;
import p000.C2565ht;
import p000.C3011o2;
import p000.C3107q2;
import p000.C3327v1;
import p000.C3380w1;
import p000.InterfaceC3283u1;

@ViewPager.InterfaceC0420e
/* loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: P */
    private static final InterfaceC3283u1<C2024g> f8579P = new C3380w1(16);

    /* renamed from: A */
    int f8580A;

    /* renamed from: B */
    boolean f8581B;

    /* renamed from: C */
    boolean f8582C;

    /* renamed from: D */
    boolean f8583D;

    /* renamed from: E */
    private InterfaceC2020c f8584E;

    /* renamed from: F */
    private final ArrayList<InterfaceC2020c> f8585F;

    /* renamed from: G */
    private InterfaceC2020c f8586G;

    /* renamed from: H */
    private ValueAnimator f8587H;

    /* renamed from: I */
    ViewPager f8588I;

    /* renamed from: J */
    private AbstractC0429a f8589J;

    /* renamed from: K */
    private DataSetObserver f8590K;

    /* renamed from: L */
    private C2025h f8591L;

    /* renamed from: M */
    private C2019b f8592M;

    /* renamed from: N */
    private boolean f8593N;

    /* renamed from: O */
    private final InterfaceC3283u1<C2026i> f8594O;

    /* renamed from: b */
    private final ArrayList<C2024g> f8595b;

    /* renamed from: c */
    private C2024g f8596c;

    /* renamed from: d */
    private final RectF f8597d;

    /* renamed from: e */
    private final C2023f f8598e;

    /* renamed from: f */
    int f8599f;

    /* renamed from: g */
    int f8600g;

    /* renamed from: h */
    int f8601h;

    /* renamed from: i */
    int f8602i;

    /* renamed from: j */
    int f8603j;

    /* renamed from: k */
    ColorStateList f8604k;

    /* renamed from: l */
    ColorStateList f8605l;

    /* renamed from: m */
    ColorStateList f8606m;

    /* renamed from: n */
    Drawable f8607n;

    /* renamed from: o */
    PorterDuff.Mode f8608o;

    /* renamed from: p */
    float f8609p;

    /* renamed from: q */
    float f8610q;

    /* renamed from: r */
    final int f8611r;

    /* renamed from: s */
    int f8612s;

    /* renamed from: t */
    private final int f8613t;

    /* renamed from: u */
    private final int f8614u;

    /* renamed from: v */
    private final int f8615v;

    /* renamed from: w */
    private int f8616w;

    /* renamed from: x */
    int f8617x;

    /* renamed from: y */
    int f8618y;

    /* renamed from: z */
    int f8619z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.tabs.TabLayout$a */
    /* loaded from: classes.dex */
    public class C2018a implements ValueAnimator.AnimatorUpdateListener {
        C2018a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.tabs.TabLayout$b */
    /* loaded from: classes.dex */
    public class C2019b implements ViewPager.InterfaceC0424i {

        /* renamed from: a */
        private boolean f8621a;

        C2019b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0424i
        /* renamed from: a */
        public void mo3154a(ViewPager viewPager, AbstractC0429a abstractC0429a, AbstractC0429a abstractC0429a2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f8588I == viewPager) {
                tabLayout.m10317a(abstractC0429a2, this.f8621a);
            }
        }

        /* renamed from: a */
        void m10331a(boolean z) {
            this.f8621a = z;
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$c */
    /* loaded from: classes.dex */
    public interface InterfaceC2020c<T extends C2024g> {
        /* renamed from: a */
        void mo10332a(T t);

        /* renamed from: b */
        void mo10333b(T t);

        /* renamed from: c */
        void mo10334c(T t);
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$d */
    /* loaded from: classes.dex */
    public interface InterfaceC2021d extends InterfaceC2020c<C2024g> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.tabs.TabLayout$e */
    /* loaded from: classes.dex */
    public class C2022e extends DataSetObserver {
        C2022e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.m10328c();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.m10328c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.tabs.TabLayout$f */
    /* loaded from: classes.dex */
    public class C2023f extends LinearLayout {

        /* renamed from: b */
        private int f8624b;

        /* renamed from: c */
        private final Paint f8625c;

        /* renamed from: d */
        private final GradientDrawable f8626d;

        /* renamed from: e */
        int f8627e;

        /* renamed from: f */
        float f8628f;

        /* renamed from: g */
        private int f8629g;

        /* renamed from: h */
        private int f8630h;

        /* renamed from: i */
        private int f8631i;

        /* renamed from: j */
        private ValueAnimator f8632j;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.android.material.tabs.TabLayout$f$a */
        /* loaded from: classes.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ int f8634a;

            /* renamed from: b */
            final /* synthetic */ int f8635b;

            /* renamed from: c */
            final /* synthetic */ int f8636c;

            /* renamed from: d */
            final /* synthetic */ int f8637d;

            a(int i, int i2, int i3, int i4) {
                this.f8634a = i;
                this.f8635b = i2;
                this.f8636c = i3;
                this.f8637d = i4;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                C2023f.this.m10342b(C2565ht.m12244a(this.f8634a, this.f8635b, animatedFraction), C2565ht.m12244a(this.f8636c, this.f8637d, animatedFraction));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.android.material.tabs.TabLayout$f$b */
        /* loaded from: classes.dex */
        public class b extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ int f8639a;

            b(int i) {
                this.f8639a = i;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C2023f c2023f = C2023f.this;
                c2023f.f8627e = this.f8639a;
                c2023f.f8628f = 0.0f;
            }
        }

        C2023f(Context context) {
            super(context);
            this.f8627e = -1;
            this.f8629g = -1;
            this.f8630h = -1;
            this.f8631i = -1;
            setWillNotDraw(false);
            this.f8625c = new Paint();
            this.f8626d = new GradientDrawable();
        }

        /* renamed from: a */
        private void m10335a(C2026i c2026i, RectF rectF) {
            int m10367d = c2026i.m10367d();
            if (m10367d < TabLayout.this.m10312a(24)) {
                m10367d = TabLayout.this.m10312a(24);
            }
            int left = (c2026i.getLeft() + c2026i.getRight()) / 2;
            int i = m10367d / 2;
            rectF.set(left - i, 0.0f, left + i, 0.0f);
        }

        /* renamed from: b */
        private void m10336b() {
            int i;
            int i2;
            View childAt = getChildAt(this.f8627e);
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
                i2 = -1;
            } else {
                i = childAt.getLeft();
                i2 = childAt.getRight();
                TabLayout tabLayout = TabLayout.this;
                if (!tabLayout.f8582C && (childAt instanceof C2026i)) {
                    m10335a((C2026i) childAt, tabLayout.f8597d);
                    i = (int) TabLayout.this.f8597d.left;
                    i2 = (int) TabLayout.this.f8597d.right;
                }
                if (this.f8628f > 0.0f && this.f8627e < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f8627e + 1);
                    int left = childAt2.getLeft();
                    int right = childAt2.getRight();
                    TabLayout tabLayout2 = TabLayout.this;
                    if (!tabLayout2.f8582C && (childAt2 instanceof C2026i)) {
                        m10335a((C2026i) childAt2, tabLayout2.f8597d);
                        left = (int) TabLayout.this.f8597d.left;
                        right = (int) TabLayout.this.f8597d.right;
                    }
                    float f = this.f8628f;
                    i = (int) ((left * f) + ((1.0f - f) * i));
                    i2 = (int) ((right * f) + ((1.0f - f) * i2));
                }
            }
            m10342b(i, i2);
        }

        /* renamed from: a */
        void m10337a(int i) {
            if (this.f8625c.getColor() != i) {
                this.f8625c.setColor(i);
                C3107q2.m14877A(this);
            }
        }

        /* renamed from: a */
        void m10338a(int i, float f) {
            ValueAnimator valueAnimator = this.f8632j;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f8632j.cancel();
            }
            this.f8627e = i;
            this.f8628f = f;
            m10336b();
        }

        /* renamed from: a */
        void m10339a(int i, int i2) {
            ValueAnimator valueAnimator = this.f8632j;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f8632j.cancel();
            }
            View childAt = getChildAt(i);
            if (childAt == null) {
                m10336b();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            TabLayout tabLayout = TabLayout.this;
            if (!tabLayout.f8582C && (childAt instanceof C2026i)) {
                m10335a((C2026i) childAt, tabLayout.f8597d);
                left = (int) TabLayout.this.f8597d.left;
                right = (int) TabLayout.this.f8597d.right;
            }
            int i3 = left;
            int i4 = right;
            int i5 = this.f8630h;
            int i6 = this.f8631i;
            if (i5 == i3 && i6 == i4) {
                return;
            }
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f8632j = valueAnimator2;
            valueAnimator2.setInterpolator(C2565ht.f10510b);
            valueAnimator2.setDuration(i2);
            valueAnimator2.setFloatValues(0.0f, 1.0f);
            valueAnimator2.addUpdateListener(new a(i5, i3, i6, i4));
            valueAnimator2.addListener(new b(i));
            valueAnimator2.start();
        }

        /* renamed from: a */
        boolean m10340a() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        void m10341b(int i) {
            if (this.f8624b != i) {
                this.f8624b = i;
                C3107q2.m14877A(this);
            }
        }

        /* renamed from: b */
        void m10342b(int i, int i2) {
            if (i == this.f8630h && i2 == this.f8631i) {
                return;
            }
            this.f8630h = i;
            this.f8631i = i2;
            C3107q2.m14877A(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void draw(android.graphics.Canvas r6) {
            /*
                r5 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r0 = r0.f8607n
                r1 = 0
                if (r0 == 0) goto Lc
                int r0 = r0.getIntrinsicHeight()
                goto Ld
            Lc:
                r0 = 0
            Ld:
                int r2 = r5.f8624b
                if (r2 < 0) goto L12
                r0 = r2
            L12:
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                int r2 = r2.f8619z
                if (r2 == 0) goto L31
                r3 = 1
                r4 = 2
                if (r2 == r3) goto L23
                if (r2 == r4) goto L3a
                r0 = 3
                if (r2 == r0) goto L36
                r0 = 0
                goto L3a
            L23:
                int r1 = r5.getHeight()
                int r1 = r1 - r0
                int r1 = r1 / r4
                int r2 = r5.getHeight()
                int r2 = r2 + r0
                int r0 = r2 / 2
                goto L3a
            L31:
                int r1 = r5.getHeight()
                int r1 = r1 - r0
            L36:
                int r0 = r5.getHeight()
            L3a:
                int r2 = r5.f8630h
                if (r2 < 0) goto L70
                int r3 = r5.f8631i
                if (r3 <= r2) goto L70
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r2 = r2.f8607n
                if (r2 == 0) goto L49
                goto L4b
            L49:
                android.graphics.drawable.GradientDrawable r2 = r5.f8626d
            L4b:
                android.graphics.drawable.Drawable r2 = androidx.core.graphics.drawable.C0239a.m1495i(r2)
                int r3 = r5.f8630h
                int r4 = r5.f8631i
                r2.setBounds(r3, r1, r4, r0)
                android.graphics.Paint r0 = r5.f8625c
                if (r0 == 0) goto L6d
                int r1 = android.os.Build.VERSION.SDK_INT
                r3 = 21
                int r0 = r0.getColor()
                if (r1 != r3) goto L6a
                android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
                r2.setColorFilter(r0, r1)
                goto L6d
            L6a:
                androidx.core.graphics.drawable.C0239a.m1488b(r2, r0)
            L6d:
                r2.draw(r6)
            L70:
                super.draw(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.C2023f.draw(android.graphics.Canvas):void");
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f8632j;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m10336b();
                return;
            }
            this.f8632j.cancel();
            m10339a(this.f8627e, Math.round((1.0f - this.f8632j.getAnimatedFraction()) * ((float) this.f8632j.getDuration())));
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z = true;
            if (tabLayout.f8580A == 1 && tabLayout.f8617x == 1) {
                int childCount = getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        i3 = Math.max(i3, childAt.getMeasuredWidth());
                    }
                }
                if (i3 <= 0) {
                    return;
                }
                if (i3 * childCount <= getMeasuredWidth() - (TabLayout.this.m10312a(16) * 2)) {
                    boolean z2 = false;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                        if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i3;
                            layoutParams.weight = 0.0f;
                            z2 = true;
                        }
                    }
                    z = z2;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.f8617x = 0;
                    tabLayout2.m10322a(false);
                }
                if (z) {
                    super.onMeasure(i, i2);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT >= 23 || this.f8629g == i) {
                return;
            }
            requestLayout();
            this.f8629g = i;
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$g */
    /* loaded from: classes.dex */
    public static class C2024g {

        /* renamed from: a */
        private Drawable f8641a;

        /* renamed from: b */
        private CharSequence f8642b;

        /* renamed from: c */
        private CharSequence f8643c;

        /* renamed from: d */
        private int f8644d = -1;

        /* renamed from: e */
        private View f8645e;

        /* renamed from: f */
        public TabLayout f8646f;

        /* renamed from: g */
        public C2026i f8647g;

        /* renamed from: a */
        public View m10345a() {
            return this.f8645e;
        }

        /* renamed from: a */
        public C2024g m10346a(int i) {
            m10348a(LayoutInflater.from(this.f8647g.getContext()).inflate(i, (ViewGroup) this.f8647g, false));
            return this;
        }

        /* renamed from: a */
        public C2024g m10347a(Drawable drawable) {
            this.f8641a = drawable;
            m10358h();
            return this;
        }

        /* renamed from: a */
        public C2024g m10348a(View view) {
            this.f8645e = view;
            m10358h();
            return this;
        }

        /* renamed from: a */
        public C2024g m10349a(CharSequence charSequence) {
            this.f8643c = charSequence;
            m10358h();
            return this;
        }

        /* renamed from: b */
        public Drawable m10350b() {
            return this.f8641a;
        }

        /* renamed from: b */
        public C2024g m10351b(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f8643c) && !TextUtils.isEmpty(charSequence)) {
                this.f8647g.setContentDescription(charSequence);
            }
            this.f8642b = charSequence;
            m10358h();
            return this;
        }

        /* renamed from: b */
        void m10352b(int i) {
            this.f8644d = i;
        }

        /* renamed from: c */
        public int m10353c() {
            return this.f8644d;
        }

        /* renamed from: d */
        public CharSequence m10354d() {
            return this.f8642b;
        }

        /* renamed from: e */
        public boolean m10355e() {
            TabLayout tabLayout = this.f8646f;
            if (tabLayout != null) {
                return tabLayout.getSelectedTabPosition() == this.f8644d;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: f */
        void m10356f() {
            this.f8646f = null;
            this.f8647g = null;
            this.f8641a = null;
            this.f8642b = null;
            this.f8643c = null;
            this.f8644d = -1;
            this.f8645e = null;
        }

        /* renamed from: g */
        public void m10357g() {
            TabLayout tabLayout = this.f8646f;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.m10329c(this);
        }

        /* renamed from: h */
        void m10358h() {
            C2026i c2026i = this.f8647g;
            if (c2026i != null) {
                c2026i.m10370b();
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$h */
    /* loaded from: classes.dex */
    public static class C2025h implements ViewPager.InterfaceC0425j {

        /* renamed from: b */
        private final WeakReference<TabLayout> f8648b;

        /* renamed from: c */
        private int f8649c;

        /* renamed from: d */
        private int f8650d;

        public C2025h(TabLayout tabLayout) {
            this.f8648b = new WeakReference<>(tabLayout);
        }

        /* renamed from: a */
        void m10359a() {
            this.f8650d = 0;
            this.f8649c = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0425j
        /* renamed from: a */
        public void mo3155a(int i) {
            this.f8649c = this.f8650d;
            this.f8650d = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0425j
        /* renamed from: a */
        public void mo3156a(int i, float f, int i2) {
            TabLayout tabLayout = this.f8648b.get();
            if (tabLayout != null) {
                tabLayout.m10315a(i, f, this.f8650d != 2 || this.f8649c == 1, (this.f8650d == 2 && this.f8649c == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0425j
        /* renamed from: b */
        public void mo3157b(int i) {
            TabLayout tabLayout = this.f8648b.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.f8650d;
            tabLayout.m10326b(tabLayout.m10324b(i), i2 == 0 || (i2 == 2 && this.f8649c == 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.tabs.TabLayout$i */
    /* loaded from: classes.dex */
    public class C2026i extends LinearLayout {

        /* renamed from: b */
        private C2024g f8651b;

        /* renamed from: c */
        private TextView f8652c;

        /* renamed from: d */
        private ImageView f8653d;

        /* renamed from: e */
        private View f8654e;

        /* renamed from: f */
        private TextView f8655f;

        /* renamed from: g */
        private ImageView f8656g;

        /* renamed from: h */
        private Drawable f8657h;

        /* renamed from: i */
        private int f8658i;

        public C2026i(Context context) {
            super(context);
            this.f8658i = 2;
            m10362a(context);
            C3107q2.m14887a(this, TabLayout.this.f8599f, TabLayout.this.f8600g, TabLayout.this.f8601h, TabLayout.this.f8602i);
            setGravity(17);
            setOrientation(!TabLayout.this.f8581B ? 1 : 0);
            setClickable(true);
            C3107q2.m14896a(this, C3011o2.m14413a(getContext(), 1002));
        }

        /* renamed from: a */
        private float m10360a(Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARN: Type inference failed for: r2v3, types: [android.graphics.drawable.LayerDrawable] */
        /* renamed from: a */
        public void m10362a(Context context) {
            int i = TabLayout.this.f8611r;
            if (i != 0) {
                Drawable m4c = C0000a.m4c(context, i);
                this.f8657h = m4c;
                if (m4c != null && m4c.isStateful()) {
                    this.f8657h.setState(getDrawableState());
                }
            } else {
                this.f8657h = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (TabLayout.this.f8606m != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList m11636a = C2445eu.m11636a(TabLayout.this.f8606m);
                if (Build.VERSION.SDK_INT >= 21) {
                    if (TabLayout.this.f8583D) {
                        gradientDrawable = null;
                    }
                    gradientDrawable = new RippleDrawable(m11636a, gradientDrawable, TabLayout.this.f8583D ? null : gradientDrawable2);
                } else {
                    Drawable m1495i = C0239a.m1495i(gradientDrawable2);
                    C0239a.m1480a(m1495i, m11636a);
                    gradientDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, m1495i});
                }
            }
            C3107q2.m14891a(this, gradientDrawable);
            TabLayout.this.invalidate();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m10363a(Canvas canvas) {
            Drawable drawable = this.f8657h;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f8657h.draw(canvas);
            }
        }

        /* renamed from: a */
        private void m10364a(TextView textView, ImageView imageView) {
            C2024g c2024g = this.f8651b;
            Drawable mutate = (c2024g == null || c2024g.m10350b() == null) ? null : C0239a.m1495i(this.f8651b.m10350b()).mutate();
            C2024g c2024g2 = this.f8651b;
            CharSequence m10354d = c2024g2 != null ? c2024g2.m10354d() : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(m10354d);
            if (textView != null) {
                if (z) {
                    textView.setText(m10354d);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int m10312a = (z && imageView.getVisibility() == 0) ? TabLayout.this.m10312a(8) : 0;
                if (TabLayout.this.f8581B) {
                    if (m10312a != C2414e2.m11531a(marginLayoutParams)) {
                        C2414e2.m11532a(marginLayoutParams, m10312a);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (m10312a != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = m10312a;
                    C2414e2.m11532a(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            C2024g c2024g3 = this.f8651b;
            C0202v0.m1176a(this, z ? null : c2024g3 != null ? c2024g3.f8643c : null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public int m10367d() {
            View[] viewArr = {this.f8652c, this.f8653d, this.f8654e};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                    i = z ? Math.max(i, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i - i2;
        }

        /* renamed from: a */
        void m10368a() {
            m10369a((C2024g) null);
            setSelected(false);
        }

        /* renamed from: a */
        void m10369a(C2024g c2024g) {
            if (c2024g != this.f8651b) {
                this.f8651b = c2024g;
                m10370b();
            }
        }

        /* renamed from: b */
        final void m10370b() {
            TextView textView;
            ImageView imageView;
            C2024g c2024g = this.f8651b;
            Drawable drawable = null;
            View m10345a = c2024g != null ? c2024g.m10345a() : null;
            if (m10345a != null) {
                ViewParent parent = m10345a.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(m10345a);
                    }
                    addView(m10345a);
                }
                this.f8654e = m10345a;
                TextView textView2 = this.f8652c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                ImageView imageView2 = this.f8653d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f8653d.setImageDrawable(null);
                }
                TextView textView3 = (TextView) m10345a.findViewById(R.id.text1);
                this.f8655f = textView3;
                if (textView3 != null) {
                    this.f8658i = C0257i.m1602d(textView3);
                }
                this.f8656g = (ImageView) m10345a.findViewById(R.id.icon);
            } else {
                View view = this.f8654e;
                if (view != null) {
                    removeView(view);
                    this.f8654e = null;
                }
                this.f8655f = null;
                this.f8656g = null;
            }
            boolean z = false;
            if (this.f8654e != null) {
                if (this.f8655f != null || this.f8656g != null) {
                    textView = this.f8655f;
                    imageView = this.f8656g;
                }
                if (c2024g != null && !TextUtils.isEmpty(c2024g.f8643c)) {
                    setContentDescription(c2024g.f8643c);
                }
                if (c2024g != null && c2024g.m10355e()) {
                    z = true;
                }
                setSelected(z);
            }
            if (this.f8653d == null) {
                ImageView imageView3 = (ImageView) LayoutInflater.from(getContext()).inflate(R$layout.design_layout_tab_icon, (ViewGroup) this, false);
                addView(imageView3, 0);
                this.f8653d = imageView3;
            }
            if (c2024g != null && c2024g.m10350b() != null) {
                drawable = C0239a.m1495i(c2024g.m10350b()).mutate();
            }
            if (drawable != null) {
                C0239a.m1480a(drawable, TabLayout.this.f8605l);
                PorterDuff.Mode mode = TabLayout.this.f8608o;
                if (mode != null) {
                    C0239a.m1483a(drawable, mode);
                }
            }
            if (this.f8652c == null) {
                TextView textView4 = (TextView) LayoutInflater.from(getContext()).inflate(R$layout.design_layout_tab_text, (ViewGroup) this, false);
                addView(textView4);
                this.f8652c = textView4;
                this.f8658i = C0257i.m1602d(textView4);
            }
            C0257i.m1603d(this.f8652c, TabLayout.this.f8603j);
            ColorStateList colorStateList = TabLayout.this.f8604k;
            if (colorStateList != null) {
                this.f8652c.setTextColor(colorStateList);
            }
            textView = this.f8652c;
            imageView = this.f8653d;
            m10364a(textView, imageView);
            if (c2024g != null) {
                setContentDescription(c2024g.f8643c);
            }
            if (c2024g != null) {
                z = true;
            }
            setSelected(z);
        }

        /* renamed from: c */
        final void m10371c() {
            TextView textView;
            ImageView imageView;
            setOrientation(!TabLayout.this.f8581B ? 1 : 0);
            if (this.f8655f == null && this.f8656g == null) {
                textView = this.f8652c;
                imageView = this.f8653d;
            } else {
                textView = this.f8655f;
                imageView = this.f8656g;
            }
            m10364a(textView, imageView);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f8657h;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.f8657h.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(AbstractC0081a.c.class.getName());
        }

        @Override // android.view.View
        @TargetApi(14)
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(AbstractC0081a.c.class.getName());
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f8612s, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f8652c != null) {
                float f = TabLayout.this.f8609p;
                int i3 = this.f8658i;
                ImageView imageView = this.f8653d;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f8652c;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.f8610q;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.f8652c.getTextSize();
                int lineCount = this.f8652c.getLineCount();
                int m1602d = C0257i.m1602d(this.f8652c);
                if (f != textSize || (m1602d >= 0 && i3 != m1602d)) {
                    if (TabLayout.this.f8580A == 1 && f > textSize && lineCount == 1 && ((layout = this.f8652c.getLayout()) == null || m10360a(layout, 0, f) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        z = false;
                    }
                    if (z) {
                        this.f8652c.setTextSize(0, f);
                        this.f8652c.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f8651b == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f8651b.m10357g();
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z && Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            TextView textView = this.f8652c;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f8653d;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f8654e;
            if (view != null) {
                view.setSelected(z);
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$j */
    /* loaded from: classes.dex */
    public static class C2027j implements InterfaceC2021d {

        /* renamed from: a */
        private final ViewPager f8660a;

        public C2027j(ViewPager viewPager) {
            this.f8660a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC2020c
        /* renamed from: a */
        public void mo10332a(C2024g c2024g) {
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC2020c
        /* renamed from: b */
        public void mo10333b(C2024g c2024g) {
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC2020c
        /* renamed from: c */
        public void mo10334c(C2024g c2024g) {
            this.f8660a.setCurrentItem(c2024g.m10353c());
        }
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.tabStyle);
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8595b = new ArrayList<>();
        this.f8597d = new RectF();
        this.f8612s = Integer.MAX_VALUE;
        this.f8585F = new ArrayList<>();
        this.f8594O = new C3327v1(12);
        setHorizontalScrollBarEnabled(false);
        C2023f c2023f = new C2023f(context);
        this.f8598e = c2023f;
        super.addView(c2023f, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray m10273c = C2008g.m10273c(context, attributeSet, R$styleable.TabLayout, i, R$style.Widget_Design_TabLayout, R$styleable.TabLayout_tabTextAppearance);
        this.f8598e.m10341b(m10273c.getDimensionPixelSize(R$styleable.TabLayout_tabIndicatorHeight, -1));
        this.f8598e.m10337a(m10273c.getColor(R$styleable.TabLayout_tabIndicatorColor, 0));
        setSelectedTabIndicator(C2402du.m11485b(context, m10273c, R$styleable.TabLayout_tabIndicator));
        setSelectedTabIndicatorGravity(m10273c.getInt(R$styleable.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorFullWidth(m10273c.getBoolean(R$styleable.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = m10273c.getDimensionPixelSize(R$styleable.TabLayout_tabPadding, 0);
        this.f8602i = dimensionPixelSize;
        this.f8601h = dimensionPixelSize;
        this.f8600g = dimensionPixelSize;
        this.f8599f = dimensionPixelSize;
        this.f8599f = m10273c.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingStart, dimensionPixelSize);
        this.f8600g = m10273c.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingTop, this.f8600g);
        this.f8601h = m10273c.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingEnd, this.f8601h);
        this.f8602i = m10273c.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingBottom, this.f8602i);
        int resourceId = m10273c.getResourceId(R$styleable.TabLayout_tabTextAppearance, R$style.TextAppearance_Design_Tab);
        this.f8603j = resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId, androidx.appcompat.R$styleable.TextAppearance);
        try {
            this.f8609p = obtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R$styleable.TextAppearance_android_textSize, 0);
            this.f8604k = C2402du.m11484a(context, obtainStyledAttributes, androidx.appcompat.R$styleable.TextAppearance_android_textColor);
            obtainStyledAttributes.recycle();
            if (m10273c.hasValue(R$styleable.TabLayout_tabTextColor)) {
                this.f8604k = C2402du.m11484a(context, m10273c, R$styleable.TabLayout_tabTextColor);
            }
            if (m10273c.hasValue(R$styleable.TabLayout_tabSelectedTextColor)) {
                this.f8604k = m10294a(this.f8604k.getDefaultColor(), m10273c.getColor(R$styleable.TabLayout_tabSelectedTextColor, 0));
            }
            this.f8605l = C2402du.m11484a(context, m10273c, R$styleable.TabLayout_tabIconTint);
            this.f8608o = C2009h.m10275a(m10273c.getInt(R$styleable.TabLayout_tabIconTintMode, -1), null);
            this.f8606m = C2402du.m11484a(context, m10273c, R$styleable.TabLayout_tabRippleColor);
            this.f8618y = m10273c.getInt(R$styleable.TabLayout_tabIndicatorAnimationDuration, 300);
            this.f8613t = m10273c.getDimensionPixelSize(R$styleable.TabLayout_tabMinWidth, -1);
            this.f8614u = m10273c.getDimensionPixelSize(R$styleable.TabLayout_tabMaxWidth, -1);
            this.f8611r = m10273c.getResourceId(R$styleable.TabLayout_tabBackground, 0);
            this.f8616w = m10273c.getDimensionPixelSize(R$styleable.TabLayout_tabContentStart, 0);
            this.f8580A = m10273c.getInt(R$styleable.TabLayout_tabMode, 1);
            this.f8617x = m10273c.getInt(R$styleable.TabLayout_tabGravity, 0);
            this.f8581B = m10273c.getBoolean(R$styleable.TabLayout_tabInlineLabel, false);
            this.f8583D = m10273c.getBoolean(R$styleable.TabLayout_tabUnboundedRipple, false);
            m10273c.recycle();
            Resources resources = getResources();
            this.f8610q = resources.getDimensionPixelSize(R$dimen.design_tab_text_size_2line);
            this.f8615v = resources.getDimensionPixelSize(R$dimen.design_tab_scrollable_min_width);
            m10305e();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: a */
    private int m10293a(int i, float f) {
        if (this.f8580A != 0) {
            return 0;
        }
        View childAt = this.f8598e.getChildAt(i);
        int i2 = i + 1;
        View childAt2 = i2 < this.f8598e.getChildCount() ? this.f8598e.getChildAt(i2) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i3 = (int) ((width + width2) * 0.5f * f);
        return C3107q2.m14919k(this) == 0 ? left + i3 : left - i3;
    }

    /* renamed from: a */
    private static ColorStateList m10294a(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    /* renamed from: a */
    private void m10296a(View view) {
        if (!(view instanceof C2028a)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        m10300a((C2028a) view);
    }

    /* renamed from: a */
    private void m10297a(LinearLayout.LayoutParams layoutParams) {
        float f;
        if (this.f8580A == 1 && this.f8617x == 0) {
            layoutParams.width = 0;
            f = 1.0f;
        } else {
            layoutParams.width = -2;
            f = 0.0f;
        }
        layoutParams.weight = f;
    }

    /* renamed from: a */
    private void m10298a(ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.f8588I;
        if (viewPager2 != null) {
            C2025h c2025h = this.f8591L;
            if (c2025h != null) {
                viewPager2.m3144b(c2025h);
            }
            C2019b c2019b = this.f8592M;
            if (c2019b != null) {
                this.f8588I.m3143b(c2019b);
            }
        }
        InterfaceC2020c interfaceC2020c = this.f8586G;
        if (interfaceC2020c != null) {
            m10325b(interfaceC2020c);
            this.f8586G = null;
        }
        if (viewPager != null) {
            this.f8588I = viewPager;
            if (this.f8591L == null) {
                this.f8591L = new C2025h(this);
            }
            this.f8591L.m10359a();
            viewPager.m3134a(this.f8591L);
            C2027j c2027j = new C2027j(viewPager);
            this.f8586G = c2027j;
            m10318a(c2027j);
            AbstractC0429a adapter = viewPager.getAdapter();
            if (adapter != null) {
                m10317a(adapter, z);
            }
            if (this.f8592M == null) {
                this.f8592M = new C2019b();
            }
            this.f8592M.m10331a(z);
            viewPager.m3133a(this.f8592M);
            m10314a(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f8588I = null;
            m10317a((AbstractC0429a) null, false);
        }
        this.f8593N = z2;
    }

    /* renamed from: a */
    private void m10299a(C2024g c2024g, int i) {
        c2024g.m10352b(i);
        this.f8595b.add(i, c2024g);
        int size = this.f8595b.size();
        while (true) {
            i++;
            if (i >= size) {
                return;
            } else {
                this.f8595b.get(i).m10352b(i);
            }
        }
    }

    /* renamed from: a */
    private void m10300a(C2028a c2028a) {
        C2024g m10323b = m10323b();
        CharSequence charSequence = c2028a.f8661b;
        if (charSequence != null) {
            m10323b.m10351b(charSequence);
        }
        Drawable drawable = c2028a.f8662c;
        if (drawable != null) {
            m10323b.m10347a(drawable);
        }
        int i = c2028a.f8663d;
        if (i != 0) {
            m10323b.m10346a(i);
        }
        if (!TextUtils.isEmpty(c2028a.getContentDescription())) {
            m10323b.m10349a(c2028a.getContentDescription());
        }
        m10319a(m10323b);
    }

    /* renamed from: c */
    private void m10301c(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() == null || !C3107q2.m14932x(this) || this.f8598e.m10340a()) {
            m10314a(i, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int m10293a = m10293a(i, 0.0f);
        if (scrollX != m10293a) {
            m10308g();
            this.f8587H.setIntValues(scrollX, m10293a);
            this.f8587H.start();
        }
        this.f8598e.m10339a(i, this.f8618y);
    }

    /* renamed from: d */
    private void m10302d(int i) {
        C2026i c2026i = (C2026i) this.f8598e.getChildAt(i);
        this.f8598e.removeViewAt(i);
        if (c2026i != null) {
            c2026i.m10368a();
            this.f8594O.mo13875a(c2026i);
        }
        requestLayout();
    }

    /* renamed from: d */
    private void m10303d(C2024g c2024g) {
        this.f8598e.addView(c2024g.f8647g, c2024g.m10353c(), m10306f());
    }

    /* renamed from: e */
    private C2026i m10304e(C2024g c2024g) {
        InterfaceC3283u1<C2026i> interfaceC3283u1 = this.f8594O;
        C2026i mo13874a = interfaceC3283u1 != null ? interfaceC3283u1.mo13874a() : null;
        if (mo13874a == null) {
            mo13874a = new C2026i(getContext());
        }
        mo13874a.m10369a(c2024g);
        mo13874a.setFocusable(true);
        mo13874a.setMinimumWidth(getTabMinWidth());
        mo13874a.setContentDescription(TextUtils.isEmpty(c2024g.f8643c) ? c2024g.f8642b : c2024g.f8643c);
        return mo13874a;
    }

    /* renamed from: e */
    private void m10305e() {
        C3107q2.m14887a(this.f8598e, this.f8580A == 0 ? Math.max(0, this.f8616w - this.f8599f) : 0, 0, 0, 0);
        int i = this.f8580A;
        if (i == 0) {
            this.f8598e.setGravity(8388611);
        } else if (i == 1) {
            this.f8598e.setGravity(1);
        }
        m10322a(true);
    }

    /* renamed from: f */
    private LinearLayout.LayoutParams m10306f() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        m10297a(layoutParams);
        return layoutParams;
    }

    /* renamed from: f */
    private void m10307f(C2024g c2024g) {
        for (int size = this.f8585F.size() - 1; size >= 0; size--) {
            this.f8585F.get(size).mo10332a(c2024g);
        }
    }

    /* renamed from: g */
    private void m10308g() {
        if (this.f8587H == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f8587H = valueAnimator;
            valueAnimator.setInterpolator(C2565ht.f10510b);
            this.f8587H.setDuration(this.f8618y);
            this.f8587H.addUpdateListener(new C2018a());
        }
    }

    /* renamed from: g */
    private void m10309g(C2024g c2024g) {
        for (int size = this.f8585F.size() - 1; size >= 0; size--) {
            this.f8585F.get(size).mo10334c(c2024g);
        }
    }

    private int getDefaultHeight() {
        int size = this.f8595b.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                C2024g c2024g = this.f8595b.get(i);
                if (c2024g != null && c2024g.m10350b() != null && !TextUtils.isEmpty(c2024g.m10354d())) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return (!z || this.f8581B) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i = this.f8613t;
        if (i != -1) {
            return i;
        }
        if (this.f8580A == 0) {
            return this.f8615v;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f8598e.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: h */
    private void m10310h() {
        int size = this.f8595b.size();
        for (int i = 0; i < size; i++) {
            this.f8595b.get(i).m10358h();
        }
    }

    /* renamed from: h */
    private void m10311h(C2024g c2024g) {
        for (int size = this.f8585F.size() - 1; size >= 0; size--) {
            this.f8585F.get(size).mo10333b(c2024g);
        }
    }

    private void setSelectedTabView(int i) {
        int childCount = this.f8598e.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.f8598e.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    /* renamed from: a */
    int m10312a(int i) {
        return Math.round(getResources().getDisplayMetrics().density * i);
    }

    /* renamed from: a */
    protected C2024g m10313a() {
        C2024g mo13874a = f8579P.mo13874a();
        return mo13874a == null ? new C2024g() : mo13874a;
    }

    /* renamed from: a */
    public void m10314a(int i, float f, boolean z) {
        m10315a(i, f, z, true);
    }

    /* renamed from: a */
    void m10315a(int i, float f, boolean z, boolean z2) {
        int round = Math.round(i + f);
        if (round < 0 || round >= this.f8598e.getChildCount()) {
            return;
        }
        if (z2) {
            this.f8598e.m10338a(i, f);
        }
        ValueAnimator valueAnimator = this.f8587H;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f8587H.cancel();
        }
        scrollTo(m10293a(i, f), 0);
        if (z) {
            setSelectedTabView(round);
        }
    }

    /* renamed from: a */
    public void m10316a(ViewPager viewPager, boolean z) {
        m10298a(viewPager, z, false);
    }

    /* renamed from: a */
    void m10317a(AbstractC0429a abstractC0429a, boolean z) {
        DataSetObserver dataSetObserver;
        AbstractC0429a abstractC0429a2 = this.f8589J;
        if (abstractC0429a2 != null && (dataSetObserver = this.f8590K) != null) {
            abstractC0429a2.mo3177c(dataSetObserver);
        }
        this.f8589J = abstractC0429a;
        if (z && abstractC0429a != null) {
            if (this.f8590K == null) {
                this.f8590K = new C2022e();
            }
            abstractC0429a.mo3164a(this.f8590K);
        }
        m10328c();
    }

    /* renamed from: a */
    public void m10318a(InterfaceC2020c interfaceC2020c) {
        if (this.f8585F.contains(interfaceC2020c)) {
            return;
        }
        this.f8585F.add(interfaceC2020c);
    }

    /* renamed from: a */
    public void m10319a(C2024g c2024g) {
        m10321a(c2024g, this.f8595b.isEmpty());
    }

    /* renamed from: a */
    public void m10320a(C2024g c2024g, int i, boolean z) {
        if (c2024g.f8646f != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        m10299a(c2024g, i);
        m10303d(c2024g);
        if (z) {
            c2024g.m10357g();
        }
    }

    /* renamed from: a */
    public void m10321a(C2024g c2024g, boolean z) {
        m10320a(c2024g, this.f8595b.size(), z);
    }

    /* renamed from: a */
    void m10322a(boolean z) {
        for (int i = 0; i < this.f8598e.getChildCount(); i++) {
            View childAt = this.f8598e.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m10297a((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        m10296a(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        m10296a(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m10296a(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m10296a(view);
    }

    /* renamed from: b */
    public C2024g m10323b() {
        C2024g m10313a = m10313a();
        m10313a.f8646f = this;
        m10313a.f8647g = m10304e(m10313a);
        return m10313a;
    }

    /* renamed from: b */
    public C2024g m10324b(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.f8595b.get(i);
    }

    /* renamed from: b */
    public void m10325b(InterfaceC2020c interfaceC2020c) {
        this.f8585F.remove(interfaceC2020c);
    }

    /* renamed from: b */
    void m10326b(C2024g c2024g, boolean z) {
        C2024g c2024g2 = this.f8596c;
        if (c2024g2 == c2024g) {
            if (c2024g2 != null) {
                m10307f(c2024g);
                m10301c(c2024g.m10353c());
                return;
            }
            return;
        }
        int m10353c = c2024g != null ? c2024g.m10353c() : -1;
        if (z) {
            if ((c2024g2 == null || c2024g2.m10353c() == -1) && m10353c != -1) {
                m10314a(m10353c, 0.0f, true);
            } else {
                m10301c(m10353c);
            }
            if (m10353c != -1) {
                setSelectedTabView(m10353c);
            }
        }
        this.f8596c = c2024g;
        if (c2024g2 != null) {
            m10311h(c2024g2);
        }
        if (c2024g != null) {
            m10309g(c2024g);
        }
    }

    /* renamed from: b */
    protected boolean m10327b(C2024g c2024g) {
        return f8579P.mo13875a(c2024g);
    }

    /* renamed from: c */
    void m10328c() {
        int currentItem;
        m10330d();
        AbstractC0429a abstractC0429a = this.f8589J;
        if (abstractC0429a != null) {
            int mo3160a = abstractC0429a.mo3160a();
            for (int i = 0; i < mo3160a; i++) {
                C2024g m10323b = m10323b();
                m10323b.m10351b(this.f8589J.mo3162a(i));
                m10321a(m10323b, false);
            }
            ViewPager viewPager = this.f8588I;
            if (viewPager == null || mo3160a <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            m10329c(m10324b(currentItem));
        }
    }

    /* renamed from: c */
    void m10329c(C2024g c2024g) {
        m10326b(c2024g, true);
    }

    /* renamed from: d */
    public void m10330d() {
        for (int childCount = this.f8598e.getChildCount() - 1; childCount >= 0; childCount--) {
            m10302d(childCount);
        }
        Iterator<C2024g> it = this.f8595b.iterator();
        while (it.hasNext()) {
            C2024g next = it.next();
            it.remove();
            next.m10356f();
            m10327b(next);
        }
        this.f8596c = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        C2024g c2024g = this.f8596c;
        if (c2024g != null) {
            return c2024g.m10353c();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f8595b.size();
    }

    public int getTabGravity() {
        return this.f8617x;
    }

    public ColorStateList getTabIconTint() {
        return this.f8605l;
    }

    public int getTabIndicatorGravity() {
        return this.f8619z;
    }

    int getTabMaxWidth() {
        return this.f8612s;
    }

    public int getTabMode() {
        return this.f8580A;
    }

    public ColorStateList getTabRippleColor() {
        return this.f8606m;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f8607n;
    }

    public ColorStateList getTabTextColors() {
        return this.f8604k;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f8588I == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m10298a((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f8593N) {
            setupWithViewPager(null);
            this.f8593N = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        for (int i = 0; i < this.f8598e.getChildCount(); i++) {
            View childAt = this.f8598e.getChildAt(i);
            if (childAt instanceof C2026i) {
                ((C2026i) childAt).m10363a(canvas);
            }
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        if (r1.getMeasuredWidth() != getMeasuredWidth()) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        if (r1.getMeasuredWidth() < getMeasuredWidth()) goto L28;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.getDefaultHeight()
            int r0 = r5.m10312a(r0)
            int r1 = r5.getPaddingTop()
            int r0 = r0 + r1
            int r1 = r5.getPaddingBottom()
            int r0 = r0 + r1
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 == r2) goto L24
            if (r1 == 0) goto L1f
            goto L30
        L1f:
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L30
        L24:
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            int r7 = java.lang.Math.min(r0, r7)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r3)
        L30:
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            if (r1 == 0) goto L49
            int r1 = r5.f8614u
            if (r1 <= 0) goto L3f
            goto L47
        L3f:
            r1 = 56
            int r1 = r5.m10312a(r1)
            int r1 = r0 - r1
        L47:
            r5.f8612s = r1
        L49:
            super.onMeasure(r6, r7)
            int r6 = r5.getChildCount()
            r0 = 1
            if (r6 != r0) goto L97
            r6 = 0
            android.view.View r1 = r5.getChildAt(r6)
            int r2 = r5.f8580A
            if (r2 == 0) goto L6a
            if (r2 == r0) goto L5f
            goto L77
        L5f:
            int r2 = r1.getMeasuredWidth()
            int r4 = r5.getMeasuredWidth()
            if (r2 == r4) goto L75
            goto L76
        L6a:
            int r2 = r1.getMeasuredWidth()
            int r4 = r5.getMeasuredWidth()
            if (r2 >= r4) goto L75
            goto L76
        L75:
            r0 = 0
        L76:
            r6 = r0
        L77:
            if (r6 == 0) goto L97
            int r6 = r5.getPaddingTop()
            int r0 = r5.getPaddingBottom()
            int r6 = r6 + r0
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            int r0 = r0.height
            int r6 = android.widget.HorizontalScrollView.getChildMeasureSpec(r7, r6, r0)
            int r7 = r5.getMeasuredWidth()
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r3)
            r1.measure(r7, r6)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    public void setInlineLabel(boolean z) {
        if (this.f8581B != z) {
            this.f8581B = z;
            for (int i = 0; i < this.f8598e.getChildCount(); i++) {
                View childAt = this.f8598e.getChildAt(i);
                if (childAt instanceof C2026i) {
                    ((C2026i) childAt).m10371c();
                }
            }
            m10305e();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC2020c interfaceC2020c) {
        InterfaceC2020c interfaceC2020c2 = this.f8584E;
        if (interfaceC2020c2 != null) {
            m10325b(interfaceC2020c2);
        }
        this.f8584E = interfaceC2020c;
        if (interfaceC2020c != null) {
            m10318a(interfaceC2020c);
        }
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m10308g();
        this.f8587H.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(int i) {
        setSelectedTabIndicator(i != 0 ? C0000a.m4c(getContext(), i) : null);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f8607n != drawable) {
            this.f8607n = drawable;
            C3107q2.m14877A(this.f8598e);
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f8598e.m10337a(i);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f8619z != i) {
            this.f8619z = i;
            C3107q2.m14877A(this.f8598e);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f8598e.m10341b(i);
    }

    public void setTabGravity(int i) {
        if (this.f8617x != i) {
            this.f8617x = i;
            m10305e();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f8605l != colorStateList) {
            this.f8605l = colorStateList;
            m10310h();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C0000a.m3b(getContext(), i));
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f8582C = z;
        C3107q2.m14877A(this.f8598e);
    }

    public void setTabMode(int i) {
        if (i != this.f8580A) {
            this.f8580A = i;
            m10305e();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f8606m != colorStateList) {
            this.f8606m = colorStateList;
            for (int i = 0; i < this.f8598e.getChildCount(); i++) {
                View childAt = this.f8598e.getChildAt(i);
                if (childAt instanceof C2026i) {
                    ((C2026i) childAt).m10362a(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C0000a.m3b(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f8604k != colorStateList) {
            this.f8604k = colorStateList;
            m10310h();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(AbstractC0429a abstractC0429a) {
        m10317a(abstractC0429a, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f8583D != z) {
            this.f8583D = z;
            for (int i = 0; i < this.f8598e.getChildCount(); i++) {
                View childAt = this.f8598e.getChildAt(i);
                if (childAt instanceof C2026i) {
                    ((C2026i) childAt).m10362a(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        m10316a(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }
}
