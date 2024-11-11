package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.content.C0237b;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p000.C0448b3;
import p000.C3107q2;
import p000.C3460y2;
import p000.C3508z1;
import p000.InterfaceC2965n2;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* renamed from: h0 */
    static final int[] f2552h0 = {R.attr.layout_gravity};

    /* renamed from: i0 */
    private static final Comparator<C0421f> f2553i0 = new C0416a();

    /* renamed from: j0 */
    private static final Interpolator f2554j0 = new InterpolatorC0417b();

    /* renamed from: k0 */
    private static final C0428m f2555k0 = new C0428m();

    /* renamed from: A */
    private int f2556A;

    /* renamed from: B */
    private int f2557B;

    /* renamed from: C */
    private int f2558C;

    /* renamed from: D */
    private float f2559D;

    /* renamed from: E */
    private float f2560E;

    /* renamed from: F */
    private float f2561F;

    /* renamed from: G */
    private float f2562G;

    /* renamed from: H */
    private int f2563H;

    /* renamed from: I */
    private VelocityTracker f2564I;

    /* renamed from: J */
    private int f2565J;

    /* renamed from: K */
    private int f2566K;

    /* renamed from: L */
    private int f2567L;

    /* renamed from: M */
    private int f2568M;

    /* renamed from: N */
    private boolean f2569N;

    /* renamed from: O */
    private long f2570O;

    /* renamed from: P */
    private EdgeEffect f2571P;

    /* renamed from: Q */
    private EdgeEffect f2572Q;

    /* renamed from: R */
    private boolean f2573R;

    /* renamed from: S */
    private boolean f2574S;

    /* renamed from: T */
    private int f2575T;

    /* renamed from: U */
    private List<InterfaceC0425j> f2576U;

    /* renamed from: V */
    private InterfaceC0425j f2577V;

    /* renamed from: W */
    private InterfaceC0425j f2578W;

    /* renamed from: a0 */
    private List<InterfaceC0424i> f2579a0;

    /* renamed from: b */
    private int f2580b;

    /* renamed from: b0 */
    private InterfaceC0426k f2581b0;

    /* renamed from: c */
    private final ArrayList<C0421f> f2582c;

    /* renamed from: c0 */
    private int f2583c0;

    /* renamed from: d */
    private final C0421f f2584d;

    /* renamed from: d0 */
    private int f2585d0;

    /* renamed from: e */
    private final Rect f2586e;

    /* renamed from: e0 */
    private ArrayList<View> f2587e0;

    /* renamed from: f */
    AbstractC0429a f2588f;

    /* renamed from: f0 */
    private final Runnable f2589f0;

    /* renamed from: g */
    int f2590g;

    /* renamed from: g0 */
    private int f2591g0;

    /* renamed from: h */
    private int f2592h;

    /* renamed from: i */
    private Parcelable f2593i;

    /* renamed from: j */
    private ClassLoader f2594j;

    /* renamed from: k */
    private Scroller f2595k;

    /* renamed from: l */
    private boolean f2596l;

    /* renamed from: m */
    private C0427l f2597m;

    /* renamed from: n */
    private int f2598n;

    /* renamed from: o */
    private Drawable f2599o;

    /* renamed from: p */
    private int f2600p;

    /* renamed from: q */
    private int f2601q;

    /* renamed from: r */
    private float f2602r;

    /* renamed from: s */
    private float f2603s;

    /* renamed from: t */
    private int f2604t;

    /* renamed from: u */
    private boolean f2605u;

    /* renamed from: v */
    private boolean f2606v;

    /* renamed from: w */
    private boolean f2607w;

    /* renamed from: x */
    private int f2608x;

    /* renamed from: y */
    private boolean f2609y;

    /* renamed from: z */
    private boolean f2610z;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0415a();

        /* renamed from: d */
        int f2611d;

        /* renamed from: e */
        Parcelable f2612e;

        /* renamed from: f */
        ClassLoader f2613f;

        /* renamed from: androidx.viewpager.widget.ViewPager$SavedState$a */
        /* loaded from: classes.dex */
        static class C0415a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0415a() {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? SavedState.class.getClassLoader() : classLoader;
            this.f2611d = parcel.readInt();
            this.f2612e = parcel.readParcelable(classLoader);
            this.f2613f = classLoader;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f2611d + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2611d);
            parcel.writeParcelable(this.f2612e, i);
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$a */
    /* loaded from: classes.dex */
    static class C0416a implements Comparator<C0421f> {
        C0416a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C0421f c0421f, C0421f c0421f2) {
            return c0421f.f2618b - c0421f2.f2618b;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$b */
    /* loaded from: classes.dex */
    static class InterpolatorC0417b implements Interpolator {
        InterpolatorC0417b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$c */
    /* loaded from: classes.dex */
    class RunnableC0418c implements Runnable {
        RunnableC0418c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.m3151h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager.widget.ViewPager$d */
    /* loaded from: classes.dex */
    public class C0419d implements InterfaceC2965n2 {

        /* renamed from: a */
        private final Rect f2615a = new Rect();

        C0419d() {
        }

        @Override // p000.InterfaceC2965n2
        /* renamed from: a */
        public C3460y2 mo445a(View view, C3460y2 c3460y2) {
            C3460y2 m14901b = C3107q2.m14901b(view, c3460y2);
            if (m14901b.m16559e()) {
                return m14901b;
            }
            Rect rect = this.f2615a;
            rect.left = m14901b.m16556b();
            rect.top = m14901b.m16558d();
            rect.right = m14901b.m16557c();
            rect.bottom = m14901b.m16554a();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C3460y2 m14883a = C3107q2.m14883a(ViewPager.this.getChildAt(i), m14901b);
                rect.left = Math.min(m14883a.m16556b(), rect.left);
                rect.top = Math.min(m14883a.m16558d(), rect.top);
                rect.right = Math.min(m14883a.m16557c(), rect.right);
                rect.bottom = Math.min(m14883a.m16554a(), rect.bottom);
            }
            return m14901b.m16555a(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.viewpager.widget.ViewPager$e */
    /* loaded from: classes.dex */
    public @interface InterfaceC0420e {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager.widget.ViewPager$f */
    /* loaded from: classes.dex */
    public static class C0421f {

        /* renamed from: a */
        Object f2617a;

        /* renamed from: b */
        int f2618b;

        /* renamed from: c */
        boolean f2619c;

        /* renamed from: d */
        float f2620d;

        /* renamed from: e */
        float f2621e;

        C0421f() {
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$g */
    /* loaded from: classes.dex */
    public static class C0422g extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f2622a;

        /* renamed from: b */
        public int f2623b;

        /* renamed from: c */
        float f2624c;

        /* renamed from: d */
        boolean f2625d;

        /* renamed from: e */
        int f2626e;

        /* renamed from: f */
        int f2627f;

        public C0422g() {
            super(-1, -1);
            this.f2624c = 0.0f;
        }

        public C0422g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2624c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f2552h0);
            this.f2623b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager.widget.ViewPager$h */
    /* loaded from: classes.dex */
    public class C0423h extends C3508z1 {
        C0423h() {
        }

        /* renamed from: b */
        private boolean m3153b() {
            AbstractC0429a abstractC0429a = ViewPager.this.f2588f;
            return abstractC0429a != null && abstractC0429a.mo3160a() > 1;
        }

        @Override // p000.C3508z1
        /* renamed from: a */
        public void mo1538a(View view, C0448b3 c0448b3) {
            super.mo1538a(view, c0448b3);
            c0448b3.m3281a((CharSequence) ViewPager.class.getName());
            c0448b3.m3294d(m3153b());
            if (ViewPager.this.canScrollHorizontally(1)) {
                c0448b3.m3279a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                c0448b3.m3279a(8192);
            }
        }

        @Override // p000.C3508z1
        /* renamed from: a */
        public boolean mo1539a(View view, int i, Bundle bundle) {
            ViewPager viewPager;
            int i2;
            if (super.mo1539a(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i2 = viewPager.f2590g - 1;
            } else {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i2 = viewPager.f2590g + 1;
            }
            viewPager.setCurrentItem(i2);
            return true;
        }

        @Override // p000.C3508z1
        /* renamed from: b */
        public void mo1540b(View view, AccessibilityEvent accessibilityEvent) {
            AbstractC0429a abstractC0429a;
            super.mo1540b(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(m3153b());
            if (accessibilityEvent.getEventType() != 4096 || (abstractC0429a = ViewPager.this.f2588f) == null) {
                return;
            }
            accessibilityEvent.setItemCount(abstractC0429a.mo3160a());
            accessibilityEvent.setFromIndex(ViewPager.this.f2590g);
            accessibilityEvent.setToIndex(ViewPager.this.f2590g);
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$i */
    /* loaded from: classes.dex */
    public interface InterfaceC0424i {
        /* renamed from: a */
        void mo3154a(ViewPager viewPager, AbstractC0429a abstractC0429a, AbstractC0429a abstractC0429a2);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$j */
    /* loaded from: classes.dex */
    public interface InterfaceC0425j {
        /* renamed from: a */
        void mo3155a(int i);

        /* renamed from: a */
        void mo3156a(int i, float f, int i2);

        /* renamed from: b */
        void mo3157b(int i);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$k */
    /* loaded from: classes.dex */
    public interface InterfaceC0426k {
        /* renamed from: a */
        void m3158a(View view, float f);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$l */
    /* loaded from: classes.dex */
    private class C0427l extends DataSetObserver {
        C0427l() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.m3141b();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.m3141b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager.widget.ViewPager$m */
    /* loaded from: classes.dex */
    public static class C0428m implements Comparator<View> {
        C0428m() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            C0422g c0422g = (C0422g) view.getLayoutParams();
            C0422g c0422g2 = (C0422g) view2.getLayoutParams();
            boolean z = c0422g.f2622a;
            return z != c0422g2.f2622a ? z ? 1 : -1 : c0422g.f2626e - c0422g2.f2626e;
        }
    }

    public ViewPager(Context context) {
        super(context);
        this.f2582c = new ArrayList<>();
        this.f2584d = new C0421f();
        this.f2586e = new Rect();
        this.f2592h = -1;
        this.f2593i = null;
        this.f2594j = null;
        this.f2602r = -3.4028235E38f;
        this.f2603s = Float.MAX_VALUE;
        this.f2608x = 1;
        this.f2563H = -1;
        this.f2573R = true;
        this.f2589f0 = new RunnableC0418c();
        this.f2591g0 = 0;
        m3147d();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2582c = new ArrayList<>();
        this.f2584d = new C0421f();
        this.f2586e = new Rect();
        this.f2592h = -1;
        this.f2593i = null;
        this.f2594j = null;
        this.f2602r = -3.4028235E38f;
        this.f2603s = Float.MAX_VALUE;
        this.f2608x = 1;
        this.f2563H = -1;
        this.f2573R = true;
        this.f2589f0 = new RunnableC0418c();
        this.f2591g0 = 0;
        m3147d();
    }

    /* renamed from: a */
    private int m3104a(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.f2567L || Math.abs(i2) <= this.f2565J) {
            i += (int) (f + (i >= this.f2590g ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f2582c.size() <= 0) {
            return i;
        }
        return Math.max(this.f2582c.get(0).f2618b, Math.min(i, this.f2582c.get(r4.size() - 1).f2618b));
    }

    /* renamed from: a */
    private Rect m3105a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* renamed from: a */
    private void m3106a(int i, int i2, int i3, int i4) {
        int min;
        if (i2 <= 0 || this.f2582c.isEmpty()) {
            C0421f m3139b = m3139b(this.f2590g);
            min = (int) ((m3139b != null ? Math.min(m3139b.f2621e, this.f2603s) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
            if (min == getScrollX()) {
                return;
            } else {
                m3110a(false);
            }
        } else if (!this.f2595k.isFinished()) {
            this.f2595k.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            min = (int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3));
        }
        scrollTo(min, getScrollY());
    }

    /* renamed from: a */
    private void m3107a(int i, boolean z, int i2, boolean z2) {
        C0421f m3139b = m3139b(i);
        int clientWidth = m3139b != null ? (int) (getClientWidth() * Math.max(this.f2602r, Math.min(m3139b.f2621e, this.f2603s))) : 0;
        if (z) {
            m3129a(clientWidth, 0, i2);
            if (z2) {
                m3117d(i);
                return;
            }
            return;
        }
        if (z2) {
            m3117d(i);
        }
        m3110a(false);
        scrollTo(clientWidth, 0);
        m3119f(clientWidth);
    }

    /* renamed from: a */
    private void m3108a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2563H) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f2559D = motionEvent.getX(i);
            this.f2563H = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f2564I;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: a */
    private void m3109a(C0421f c0421f, int i, C0421f c0421f2) {
        int i2;
        int i3;
        C0421f c0421f3;
        C0421f c0421f4;
        int mo3160a = this.f2588f.mo3160a();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? this.f2598n / clientWidth : 0.0f;
        if (c0421f2 != null) {
            int i4 = c0421f2.f2618b;
            int i5 = c0421f.f2618b;
            if (i4 < i5) {
                int i6 = 0;
                float f2 = c0421f2.f2621e + c0421f2.f2620d + f;
                while (true) {
                    i4++;
                    if (i4 > c0421f.f2618b || i6 >= this.f2582c.size()) {
                        break;
                    }
                    while (true) {
                        c0421f4 = this.f2582c.get(i6);
                        if (i4 <= c0421f4.f2618b || i6 >= this.f2582c.size() - 1) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    while (i4 < c0421f4.f2618b) {
                        f2 += this.f2588f.mo3171b(i4) + f;
                        i4++;
                    }
                    c0421f4.f2621e = f2;
                    f2 += c0421f4.f2620d + f;
                }
            } else if (i4 > i5) {
                int size = this.f2582c.size() - 1;
                float f3 = c0421f2.f2621e;
                while (true) {
                    i4--;
                    if (i4 < c0421f.f2618b || size < 0) {
                        break;
                    }
                    while (true) {
                        c0421f3 = this.f2582c.get(size);
                        if (i4 >= c0421f3.f2618b || size <= 0) {
                            break;
                        } else {
                            size--;
                        }
                    }
                    while (i4 > c0421f3.f2618b) {
                        f3 -= this.f2588f.mo3171b(i4) + f;
                        i4--;
                    }
                    f3 -= c0421f3.f2620d + f;
                    c0421f3.f2621e = f3;
                }
            }
        }
        int size2 = this.f2582c.size();
        float f4 = c0421f.f2621e;
        int i7 = c0421f.f2618b;
        int i8 = i7 - 1;
        this.f2602r = i7 == 0 ? f4 : -3.4028235E38f;
        int i9 = mo3160a - 1;
        this.f2603s = c0421f.f2618b == i9 ? (c0421f.f2621e + c0421f.f2620d) - 1.0f : Float.MAX_VALUE;
        int i10 = i - 1;
        while (i10 >= 0) {
            C0421f c0421f5 = this.f2582c.get(i10);
            while (true) {
                i3 = c0421f5.f2618b;
                if (i8 <= i3) {
                    break;
                }
                f4 -= this.f2588f.mo3171b(i8) + f;
                i8--;
            }
            f4 -= c0421f5.f2620d + f;
            c0421f5.f2621e = f4;
            if (i3 == 0) {
                this.f2602r = f4;
            }
            i10--;
            i8--;
        }
        float f5 = c0421f.f2621e + c0421f.f2620d + f;
        int i11 = c0421f.f2618b + 1;
        int i12 = i + 1;
        while (i12 < size2) {
            C0421f c0421f6 = this.f2582c.get(i12);
            while (true) {
                i2 = c0421f6.f2618b;
                if (i11 >= i2) {
                    break;
                }
                f5 += this.f2588f.mo3171b(i11) + f;
                i11++;
            }
            if (i2 == i9) {
                this.f2603s = (c0421f6.f2620d + f5) - 1.0f;
            }
            c0421f6.f2621e = f5;
            f5 += c0421f6.f2620d + f;
            i12++;
            i11++;
        }
    }

    /* renamed from: a */
    private void m3110a(boolean z) {
        boolean z2 = this.f2591g0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f2595k.isFinished()) {
                this.f2595k.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f2595k.getCurrX();
                int currY = this.f2595k.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m3119f(currX);
                    }
                }
            }
        }
        this.f2607w = false;
        for (int i = 0; i < this.f2582c.size(); i++) {
            C0421f c0421f = this.f2582c.get(i);
            if (c0421f.f2619c) {
                c0421f.f2619c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                C3107q2.m14892a(this, this.f2589f0);
            } else {
                this.f2589f0.run();
            }
        }
    }

    /* renamed from: a */
    private boolean m3111a(float f, float f2) {
        return (f < ((float) this.f2557B) && f2 > 0.0f) || (f > ((float) (getWidth() - this.f2557B)) && f2 < 0.0f);
    }

    /* renamed from: b */
    private void m3112b(int i, float f, int i2) {
        InterfaceC0425j interfaceC0425j = this.f2577V;
        if (interfaceC0425j != null) {
            interfaceC0425j.mo3156a(i, f, i2);
        }
        List<InterfaceC0425j> list = this.f2576U;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                InterfaceC0425j interfaceC0425j2 = this.f2576U.get(i3);
                if (interfaceC0425j2 != null) {
                    interfaceC0425j2.mo3156a(i, f, i2);
                }
            }
        }
        InterfaceC0425j interfaceC0425j3 = this.f2578W;
        if (interfaceC0425j3 != null) {
            interfaceC0425j3.mo3156a(i, f, i2);
        }
    }

    /* renamed from: b */
    private void m3113b(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.f2583c0 : 0, null);
        }
    }

    /* renamed from: c */
    private void m3114c(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: c */
    private boolean m3115c(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f2559D - f;
        this.f2559D = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.f2602r * clientWidth;
        float f4 = this.f2603s * clientWidth;
        boolean z3 = false;
        C0421f c0421f = this.f2582c.get(0);
        ArrayList<C0421f> arrayList = this.f2582c;
        C0421f c0421f2 = arrayList.get(arrayList.size() - 1);
        if (c0421f.f2618b != 0) {
            f3 = c0421f.f2621e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (c0421f2.f2618b != this.f2588f.mo3160a() - 1) {
            f4 = c0421f2.f2621e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f2571P.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f2572Q.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f2559D += scrollX - i;
        scrollTo(i, getScrollY());
        m3119f(i);
        return z3;
    }

    /* renamed from: c */
    private static boolean m3116c(View view) {
        return view.getClass().getAnnotation(InterfaceC0420e.class) != null;
    }

    /* renamed from: d */
    private void m3117d(int i) {
        InterfaceC0425j interfaceC0425j = this.f2577V;
        if (interfaceC0425j != null) {
            interfaceC0425j.mo3157b(i);
        }
        List<InterfaceC0425j> list = this.f2576U;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC0425j interfaceC0425j2 = this.f2576U.get(i2);
                if (interfaceC0425j2 != null) {
                    interfaceC0425j2.mo3157b(i);
                }
            }
        }
        InterfaceC0425j interfaceC0425j3 = this.f2578W;
        if (interfaceC0425j3 != null) {
            interfaceC0425j3.mo3157b(i);
        }
    }

    /* renamed from: e */
    private void m3118e(int i) {
        InterfaceC0425j interfaceC0425j = this.f2577V;
        if (interfaceC0425j != null) {
            interfaceC0425j.mo3155a(i);
        }
        List<InterfaceC0425j> list = this.f2576U;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC0425j interfaceC0425j2 = this.f2576U.get(i2);
                if (interfaceC0425j2 != null) {
                    interfaceC0425j2.mo3155a(i);
                }
            }
        }
        InterfaceC0425j interfaceC0425j3 = this.f2578W;
        if (interfaceC0425j3 != null) {
            interfaceC0425j3.mo3155a(i);
        }
    }

    /* renamed from: f */
    private boolean m3119f(int i) {
        if (this.f2582c.size() == 0) {
            if (this.f2573R) {
                return false;
            }
            this.f2574S = false;
            m3128a(0, 0.0f, 0);
            if (this.f2574S) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C0421f m3121j = m3121j();
        int clientWidth = getClientWidth();
        int i2 = this.f2598n;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = m3121j.f2618b;
        float f2 = ((i / f) - m3121j.f2621e) / (m3121j.f2620d + (i2 / f));
        this.f2574S = false;
        m3128a(i4, f2, (int) (i3 * f2));
        if (this.f2574S) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: i */
    private void m3120i() {
        this.f2609y = false;
        this.f2610z = false;
        VelocityTracker velocityTracker = this.f2564I;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2564I = null;
        }
    }

    /* renamed from: j */
    private C0421f m3121j() {
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.f2598n / clientWidth : 0.0f;
        C0421f c0421f = null;
        float f3 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.f2582c.size()) {
            C0421f c0421f2 = this.f2582c.get(i3);
            if (!z && c0421f2.f2618b != (i = i2 + 1)) {
                c0421f2 = this.f2584d;
                c0421f2.f2621e = f + f3 + f2;
                c0421f2.f2618b = i;
                c0421f2.f2620d = this.f2588f.mo3171b(i);
                i3--;
            }
            f = c0421f2.f2621e;
            float f4 = c0421f2.f2620d + f + f2;
            if (!z && scrollX < f) {
                return c0421f;
            }
            if (scrollX < f4 || i3 == this.f2582c.size() - 1) {
                return c0421f2;
            }
            i2 = c0421f2.f2618b;
            f3 = c0421f2.f2620d;
            i3++;
            c0421f = c0421f2;
            z = false;
        }
        return c0421f;
    }

    /* renamed from: k */
    private void m3122k() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((C0422g) getChildAt(i).getLayoutParams()).f2622a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    /* renamed from: l */
    private boolean m3123l() {
        this.f2563H = -1;
        m3120i();
        this.f2571P.onRelease();
        this.f2572Q.onRelease();
        return this.f2571P.isFinished() || this.f2572Q.isFinished();
    }

    /* renamed from: m */
    private void m3124m() {
        if (this.f2585d0 != 0) {
            ArrayList<View> arrayList = this.f2587e0;
            if (arrayList == null) {
                this.f2587e0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f2587e0.add(getChildAt(i));
            }
            Collections.sort(this.f2587e0, f2555k0);
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f2606v != z) {
            this.f2606v = z;
        }
    }

    /* renamed from: a */
    float m3125a(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    /* renamed from: a */
    C0421f m3126a(int i, int i2) {
        C0421f c0421f = new C0421f();
        c0421f.f2618b = i;
        c0421f.f2617a = this.f2588f.mo3163a(this, i);
        c0421f.f2620d = this.f2588f.mo3171b(i);
        if (i2 < 0 || i2 >= this.f2582c.size()) {
            this.f2582c.add(c0421f);
        } else {
            this.f2582c.add(i2, c0421f);
        }
        return c0421f;
    }

    /* renamed from: a */
    C0421f m3127a(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return m3140b(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void m3128a(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f2575T
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r9 = (androidx.viewpager.widget.ViewPager.C0422g) r9
            boolean r10 = r9.f2622a
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.f2623b
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            r12.m3112b(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$k r13 = r12.f2581b0
            if (r13 == 0) goto L9f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7a:
            if (r1 >= r14) goto L9f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r0 = (androidx.viewpager.widget.ViewPager.C0422g) r0
            boolean r0 = r0.f2622a
            if (r0 == 0) goto L8b
            goto L9c
        L8b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$k r3 = r12.f2581b0
            r3.m3158a(r15, r0)
        L9c:
            int r1 = r1 + 1
            goto L7a
        L9f:
            r12.f2574S = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.m3128a(int, float, int):void");
    }

    /* renamed from: a */
    void m3129a(int i, int i2, int i3) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f2595k;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.f2596l ? this.f2595k.getCurrX() : this.f2595k.getStartX();
            this.f2595k.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i4 = scrollX;
        int scrollY = getScrollY();
        int i5 = i - i4;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            m3110a(false);
            m3151h();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i7 = clientWidth / 2;
        float f = clientWidth;
        float f2 = i7;
        float m3125a = f2 + (m3125a(Math.min(1.0f, (Math.abs(i5) * 1.0f) / f)) * f2);
        int abs = Math.abs(i3);
        int min = Math.min(abs > 0 ? Math.round(Math.abs(m3125a / abs) * 1000.0f) * 4 : (int) (((Math.abs(i5) / ((f * this.f2588f.mo3171b(this.f2590g)) + this.f2598n)) + 1.0f) * 100.0f), 600);
        this.f2596l = false;
        this.f2595k.startScroll(i4, scrollY, i5, i6, min);
        C3107q2.m14877A(this);
    }

    /* renamed from: a */
    public void mo3130a(int i, boolean z) {
        this.f2607w = false;
        m3131a(i, z, false);
    }

    /* renamed from: a */
    void m3131a(int i, boolean z, boolean z2) {
        m3132a(i, z, z2, 0);
    }

    /* renamed from: a */
    void m3132a(int i, boolean z, boolean z2, int i2) {
        AbstractC0429a abstractC0429a = this.f2588f;
        if (abstractC0429a == null || abstractC0429a.mo3160a() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.f2590g == i && this.f2582c.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.f2588f.mo3160a()) {
            i = this.f2588f.mo3160a() - 1;
        }
        int i3 = this.f2608x;
        int i4 = this.f2590g;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < this.f2582c.size(); i5++) {
                this.f2582c.get(i5).f2619c = true;
            }
        }
        boolean z3 = this.f2590g != i;
        if (!this.f2573R) {
            m3146c(i);
            m3107a(i, z, i2, z3);
        } else {
            this.f2590g = i;
            if (z3) {
                m3117d(i);
            }
            requestLayout();
        }
    }

    /* renamed from: a */
    public void m3133a(InterfaceC0424i interfaceC0424i) {
        if (this.f2579a0 == null) {
            this.f2579a0 = new ArrayList();
        }
        this.f2579a0.add(interfaceC0424i);
    }

    /* renamed from: a */
    public void m3134a(InterfaceC0425j interfaceC0425j) {
        if (this.f2576U == null) {
            this.f2576U = new ArrayList();
        }
        this.f2576U.add(interfaceC0425j);
    }

    /* renamed from: a */
    public boolean m3135a() {
        if (this.f2609y) {
            return false;
        }
        this.f2569N = true;
        setScrollState(1);
        this.f2559D = 0.0f;
        this.f2561F = 0.0f;
        VelocityTracker velocityTracker = this.f2564I;
        if (velocityTracker == null) {
            this.f2564I = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.f2564I.addMovement(obtain);
        obtain.recycle();
        this.f2570O = uptimeMillis;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c4  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m3136a(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto Lb
        L9:
            r0 = r3
            goto L63
        Lb:
            if (r0 == 0) goto L63
            android.view.ViewParent r4 = r0.getParent()
        L11:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L1e
            if (r4 != r6) goto L19
            r4 = 1
            goto L1f
        L19:
            android.view.ViewParent r4 = r4.getParent()
            goto L11
        L1e:
            r4 = 0
        L1f:
            if (r4 != 0) goto L63
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L35:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L4e
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L35
        L4e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r5)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            r0.toString()
            goto L9
        L63:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto Laf
            if (r3 == r0) goto Laf
            if (r7 != r5) goto L94
            android.graphics.Rect r1 = r6.f2586e
            android.graphics.Rect r1 = r6.m3105a(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f2586e
            android.graphics.Rect r2 = r6.m3105a(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L8e
            if (r1 < r2) goto L8e
            boolean r0 = r6.m3149f()
            goto L92
        L8e:
            boolean r0 = r3.requestFocus()
        L92:
            r2 = r0
            goto Lc2
        L94:
            if (r7 != r4) goto Lc2
            android.graphics.Rect r1 = r6.f2586e
            android.graphics.Rect r1 = r6.m3105a(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f2586e
            android.graphics.Rect r2 = r6.m3105a(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L8e
            if (r1 > r2) goto L8e
            boolean r0 = r6.m3150g()
            goto L92
        Laf:
            if (r7 == r5) goto Lbe
            if (r7 != r1) goto Lb4
            goto Lbe
        Lb4:
            if (r7 == r4) goto Lb9
            r0 = 2
            if (r7 != r0) goto Lc2
        Lb9:
            boolean r2 = r6.m3150g()
            goto Lc2
        Lbe:
            boolean r2 = r6.m3149f()
        Lc2:
            if (r2 == 0) goto Lcb
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        Lcb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.m3136a(int):boolean");
    }

    /* renamed from: a */
    public boolean m3137a(KeyEvent keyEvent) {
        int i;
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return m3136a(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return m3136a(1);
                        }
                    }
                } else {
                    if (keyEvent.hasModifiers(2)) {
                        return m3150g();
                    }
                    i = 66;
                }
            } else {
                if (keyEvent.hasModifiers(2)) {
                    return m3149f();
                }
                i = 17;
            }
            return m3136a(i);
        }
        return false;
    }

    /* renamed from: a */
    protected boolean m3138a(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && m3138a(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C0421f m3140b;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (m3140b = m3140b(childAt)) != null && m3140b.f2618b == this.f2590g) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if (((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        C0421f m3140b;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (m3140b = m3140b(childAt)) != null && m3140b.f2618b == this.f2590g) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0422g c0422g = (C0422g) layoutParams;
        boolean m3116c = c0422g.f2622a | m3116c(view);
        c0422g.f2622a = m3116c;
        if (!this.f2605u) {
            super.addView(view, i, layoutParams);
        } else {
            if (c0422g != null && m3116c) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c0422g.f2625d = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    /* renamed from: b */
    C0421f m3139b(int i) {
        for (int i2 = 0; i2 < this.f2582c.size(); i2++) {
            C0421f c0421f = this.f2582c.get(i2);
            if (c0421f.f2618b == i) {
                return c0421f;
            }
        }
        return null;
    }

    /* renamed from: b */
    C0421f m3140b(View view) {
        for (int i = 0; i < this.f2582c.size(); i++) {
            C0421f c0421f = this.f2582c.get(i);
            if (this.f2588f.mo3170a(view, c0421f.f2617a)) {
                return c0421f;
            }
        }
        return null;
    }

    /* renamed from: b */
    void m3141b() {
        int mo3160a = this.f2588f.mo3160a();
        this.f2580b = mo3160a;
        boolean z = this.f2582c.size() < (this.f2608x * 2) + 1 && this.f2582c.size() < mo3160a;
        int i = this.f2590g;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f2582c.size()) {
            C0421f c0421f = this.f2582c.get(i2);
            int mo3161a = this.f2588f.mo3161a(c0421f.f2617a);
            if (mo3161a != -1) {
                if (mo3161a == -2) {
                    this.f2582c.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f2588f.mo3175b((ViewGroup) this);
                        z2 = true;
                    }
                    this.f2588f.mo3169a((ViewGroup) this, c0421f.f2618b, c0421f.f2617a);
                    int i3 = this.f2590g;
                    if (i3 == c0421f.f2618b) {
                        i = Math.max(0, Math.min(i3, mo3160a - 1));
                    }
                } else {
                    int i4 = c0421f.f2618b;
                    if (i4 != mo3161a) {
                        if (i4 == this.f2590g) {
                            i = mo3161a;
                        }
                        c0421f.f2618b = mo3161a;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f2588f.mo3168a((ViewGroup) this);
        }
        Collections.sort(this.f2582c, f2553i0);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                C0422g c0422g = (C0422g) getChildAt(i5).getLayoutParams();
                if (!c0422g.f2622a) {
                    c0422g.f2624c = 0.0f;
                }
            }
            m3131a(i, false, true);
            requestLayout();
        }
    }

    /* renamed from: b */
    public void m3142b(float f) {
        if (!this.f2569N) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f2588f == null) {
            return;
        }
        this.f2559D += f;
        float scrollX = getScrollX() - f;
        float clientWidth = getClientWidth();
        float f2 = this.f2602r * clientWidth;
        float f3 = this.f2603s * clientWidth;
        C0421f c0421f = this.f2582c.get(0);
        C0421f c0421f2 = this.f2582c.get(r4.size() - 1);
        if (c0421f.f2618b != 0) {
            f2 = c0421f.f2621e * clientWidth;
        }
        if (c0421f2.f2618b != this.f2588f.mo3160a() - 1) {
            f3 = c0421f2.f2621e * clientWidth;
        }
        if (scrollX < f2) {
            scrollX = f2;
        } else if (scrollX > f3) {
            scrollX = f3;
        }
        int i = (int) scrollX;
        this.f2559D += scrollX - i;
        scrollTo(i, getScrollY());
        m3119f(i);
        MotionEvent obtain = MotionEvent.obtain(this.f2570O, SystemClock.uptimeMillis(), 2, this.f2559D, 0.0f, 0);
        this.f2564I.addMovement(obtain);
        obtain.recycle();
    }

    /* renamed from: b */
    public void m3143b(InterfaceC0424i interfaceC0424i) {
        List<InterfaceC0424i> list = this.f2579a0;
        if (list != null) {
            list.remove(interfaceC0424i);
        }
    }

    /* renamed from: b */
    public void m3144b(InterfaceC0425j interfaceC0425j) {
        List<InterfaceC0425j> list = this.f2576U;
        if (list != null) {
            list.remove(interfaceC0425j);
        }
    }

    /* renamed from: c */
    public void m3145c() {
        if (!this.f2569N) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f2588f != null) {
            VelocityTracker velocityTracker = this.f2564I;
            velocityTracker.computeCurrentVelocity(1000, this.f2566K);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f2563H);
            this.f2607w = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C0421f m3121j = m3121j();
            m3132a(m3104a(m3121j.f2618b, ((scrollX / clientWidth) - m3121j.f2621e) / m3121j.f2620d, xVelocity, (int) (this.f2559D - this.f2561F)), true, true, xVelocity);
        }
        m3120i();
        this.f2569N = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x00ce, code lost:
    
        if (r10 >= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00dc, code lost:
    
        if (r10 >= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (r9 == r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c0, code lost:
    
        if (r10 >= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e7, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00de, code lost:
    
        r5 = r17.f2582c.get(r10);
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m3146c(int r18) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.m3146c(int):void");
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.f2588f == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.f2602r)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.f2603s));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0422g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f2596l = true;
        if (this.f2595k.isFinished() || !this.f2595k.computeScrollOffset()) {
            m3110a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f2595k.getCurrX();
        int currY = this.f2595k.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!m3119f(currX)) {
                this.f2595k.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C3107q2.m14877A(this);
    }

    /* renamed from: d */
    void m3147d() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f2595k = new Scroller(context, f2554j0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f2558C = viewConfiguration.getScaledPagingTouchSlop();
        this.f2565J = (int) (400.0f * f);
        this.f2566K = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2571P = new EdgeEffect(context);
        this.f2572Q = new EdgeEffect(context);
        this.f2567L = (int) (25.0f * f);
        this.f2568M = (int) (2.0f * f);
        this.f2556A = (int) (f * 16.0f);
        C3107q2.m14897a(this, new C0423h());
        if (C3107q2.m14917i(this) == 0) {
            C3107q2.m14912f(this, 1);
        }
        C3107q2.m14895a(this, new C0419d());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m3137a(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C0421f m3140b;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (m3140b = m3140b(childAt)) != null && m3140b.f2618b == this.f2590g && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC0429a abstractC0429a;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (abstractC0429a = this.f2588f) != null && abstractC0429a.mo3160a() > 1)) {
            if (!this.f2571P.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f2602r * width);
                this.f2571P.setSize(height, width);
                z = false | this.f2571P.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f2572Q.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f2603s + 1.0f)) * width2);
                this.f2572Q.setSize(height2, width2);
                z |= this.f2572Q.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f2571P.finish();
            this.f2572Q.finish();
        }
        if (z) {
            C3107q2.m14877A(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2599o;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    /* renamed from: e */
    public boolean m3148e() {
        return this.f2569N;
    }

    /* renamed from: f */
    boolean m3149f() {
        int i = this.f2590g;
        if (i <= 0) {
            return false;
        }
        mo3130a(i - 1, true);
        return true;
    }

    /* renamed from: g */
    boolean m3150g() {
        AbstractC0429a abstractC0429a = this.f2588f;
        if (abstractC0429a == null || this.f2590g >= abstractC0429a.mo3160a() - 1) {
            return false;
        }
        mo3130a(this.f2590g + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0422g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0422g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC0429a getAdapter() {
        return this.f2588f;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        if (this.f2585d0 == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C0422g) this.f2587e0.get(i2).getLayoutParams()).f2627f;
    }

    public int getCurrentItem() {
        return this.f2590g;
    }

    public int getOffscreenPageLimit() {
        return this.f2608x;
    }

    public int getPageMargin() {
        return this.f2598n;
    }

    /* renamed from: h */
    void m3151h() {
        m3146c(this.f2590g);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2573R = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f2589f0);
        Scroller scroller = this.f2595k;
        if (scroller != null && !scroller.isFinished()) {
            this.f2595k.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.f2598n <= 0 || this.f2599o == null || this.f2582c.size() <= 0 || this.f2588f == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f3 = this.f2598n / width;
        int i = 0;
        C0421f c0421f = this.f2582c.get(0);
        float f4 = c0421f.f2621e;
        int size = this.f2582c.size();
        int i2 = c0421f.f2618b;
        int i3 = this.f2582c.get(size - 1).f2618b;
        while (i2 < i3) {
            while (i2 > c0421f.f2618b && i < size) {
                i++;
                c0421f = this.f2582c.get(i);
            }
            if (i2 == c0421f.f2618b) {
                float f5 = c0421f.f2621e;
                float f6 = c0421f.f2620d;
                f = (f5 + f6) * width;
                f4 = f5 + f6 + f3;
            } else {
                float mo3171b = this.f2588f.mo3171b(i2);
                f = (f4 + mo3171b) * width;
                f4 += mo3171b + f3;
            }
            if (this.f2598n + f > scrollX) {
                f2 = f3;
                this.f2599o.setBounds(Math.round(f), this.f2600p, Math.round(this.f2598n + f), this.f2601q);
                this.f2599o.draw(canvas);
            } else {
                f2 = f3;
            }
            if (f > scrollX + r2) {
                return;
            }
            i2++;
            f3 = f2;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m3123l();
            return false;
        }
        if (action != 0) {
            if (this.f2609y) {
                return true;
            }
            if (this.f2610z) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f2561F = x;
            this.f2559D = x;
            float y = motionEvent.getY();
            this.f2562G = y;
            this.f2560E = y;
            this.f2563H = motionEvent.getPointerId(0);
            this.f2610z = false;
            this.f2596l = true;
            this.f2595k.computeScrollOffset();
            if (this.f2591g0 != 2 || Math.abs(this.f2595k.getFinalX() - this.f2595k.getCurrX()) <= this.f2568M) {
                m3110a(false);
                this.f2609y = false;
            } else {
                this.f2595k.abortAnimation();
                this.f2607w = false;
                m3151h();
                this.f2609y = true;
                m3114c(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f2563H;
            if (i != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(findPointerIndex);
                float f = x2 - this.f2559D;
                float abs = Math.abs(f);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.f2562G);
                if (f != 0.0f && !m3111a(this.f2559D, f) && m3138a(this, false, (int) f, (int) x2, (int) y2)) {
                    this.f2559D = x2;
                    this.f2560E = y2;
                    this.f2610z = true;
                    return false;
                }
                if (abs > this.f2558C && abs * 0.5f > abs2) {
                    this.f2609y = true;
                    m3114c(true);
                    setScrollState(1);
                    this.f2559D = f > 0.0f ? this.f2561F + this.f2558C : this.f2561F - this.f2558C;
                    this.f2560E = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > this.f2558C) {
                    this.f2610z = true;
                }
                if (this.f2609y && m3115c(x2)) {
                    C3107q2.m14877A(this);
                }
            }
        } else if (action == 6) {
            m3108a(motionEvent);
        }
        if (this.f2564I == null) {
            this.f2564I = VelocityTracker.obtain();
        }
        this.f2564I.addMovement(motionEvent);
        return this.f2609y;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0089  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C0421f m3140b;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
        }
        while (i2 != i4) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (m3140b = m3140b(childAt)) != null && m3140b.f2618b == this.f2590g && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m1612a());
        AbstractC0429a abstractC0429a = this.f2588f;
        if (abstractC0429a != null) {
            abstractC0429a.mo3165a(savedState.f2612e, savedState.f2613f);
            m3131a(savedState.f2611d, false, true);
        } else {
            this.f2592h = savedState.f2611d;
            this.f2593i = savedState.f2612e;
            this.f2594j = savedState.f2613f;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2611d = this.f2590g;
        AbstractC0429a abstractC0429a = this.f2588f;
        if (abstractC0429a != null) {
            savedState.f2612e = abstractC0429a.mo3172b();
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f2598n;
            m3106a(i, i3, i5, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0151  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f2605u) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(AbstractC0429a abstractC0429a) {
        AbstractC0429a abstractC0429a2 = this.f2588f;
        if (abstractC0429a2 != null) {
            abstractC0429a2.m3173b((DataSetObserver) null);
            this.f2588f.mo3175b((ViewGroup) this);
            for (int i = 0; i < this.f2582c.size(); i++) {
                C0421f c0421f = this.f2582c.get(i);
                this.f2588f.mo3169a((ViewGroup) this, c0421f.f2618b, c0421f.f2617a);
            }
            this.f2588f.mo3168a((ViewGroup) this);
            this.f2582c.clear();
            m3122k();
            this.f2590g = 0;
            scrollTo(0, 0);
        }
        AbstractC0429a abstractC0429a3 = this.f2588f;
        this.f2588f = abstractC0429a;
        this.f2580b = 0;
        if (abstractC0429a != null) {
            if (this.f2597m == null) {
                this.f2597m = new C0427l();
            }
            this.f2588f.m3173b(this.f2597m);
            this.f2607w = false;
            boolean z = this.f2573R;
            this.f2573R = true;
            this.f2580b = this.f2588f.mo3160a();
            if (this.f2592h >= 0) {
                this.f2588f.mo3165a(this.f2593i, this.f2594j);
                m3131a(this.f2592h, false, true);
                this.f2592h = -1;
                this.f2593i = null;
                this.f2594j = null;
            } else if (z) {
                requestLayout();
            } else {
                m3151h();
            }
        }
        List<InterfaceC0424i> list = this.f2579a0;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f2579a0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f2579a0.get(i2).mo3154a(this, abstractC0429a3, abstractC0429a);
        }
    }

    public void setCurrentItem(int i) {
        this.f2607w = false;
        m3131a(i, !this.f2573R, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            String str = "Requested offscreen page limit " + i + " too small; defaulting to 1";
            i = 1;
        }
        if (i != this.f2608x) {
            this.f2608x = i;
            m3151h();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC0425j interfaceC0425j) {
        this.f2577V = interfaceC0425j;
    }

    public void setPageMargin(int i) {
        int i2 = this.f2598n;
        this.f2598n = i;
        int width = getWidth();
        m3106a(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C0237b.m1466c(getContext(), i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f2599o = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    void setScrollState(int i) {
        if (this.f2591g0 == i) {
            return;
        }
        this.f2591g0 = i;
        if (this.f2581b0 != null) {
            m3113b(i != 0);
        }
        m3118e(i);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2599o;
    }
}
