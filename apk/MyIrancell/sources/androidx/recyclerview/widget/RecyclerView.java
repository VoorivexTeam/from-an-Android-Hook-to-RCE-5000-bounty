package androidx.recyclerview.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.R$dimen;
import androidx.recyclerview.R$styleable;
import androidx.recyclerview.widget.C0360a;
import androidx.recyclerview.widget.C0361b;
import androidx.recyclerview.widget.C0371l;
import androidx.recyclerview.widget.C0372m;
import androidx.recyclerview.widget.RunnableC0364e;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.C0448b3;
import p000.C2494g1;
import p000.C2495g2;
import p000.C2797j2;
import p000.C3107q2;
import p000.C3149r2;
import p000.C3419x1;
import p000.C3508z1;
import p000.C3509z2;
import p000.InterfaceC2535h2;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC2535h2 {

    /* renamed from: B0 */
    static final boolean f1984B0;

    /* renamed from: C0 */
    static final boolean f1985C0;

    /* renamed from: D0 */
    static final boolean f1986D0;

    /* renamed from: E0 */
    private static final boolean f1987E0;

    /* renamed from: F0 */
    private static final boolean f1988F0;

    /* renamed from: G0 */
    private static final Class<?>[] f1989G0;

    /* renamed from: H0 */
    static final Interpolator f1990H0;

    /* renamed from: A */
    boolean f1992A;

    /* renamed from: B */
    private final AccessibilityManager f1993B;

    /* renamed from: C */
    private List<InterfaceC0344q> f1994C;

    /* renamed from: D */
    boolean f1995D;

    /* renamed from: E */
    boolean f1996E;

    /* renamed from: F */
    private int f1997F;

    /* renamed from: G */
    private int f1998G;

    /* renamed from: H */
    private C0338k f1999H;

    /* renamed from: I */
    private EdgeEffect f2000I;

    /* renamed from: J */
    private EdgeEffect f2001J;

    /* renamed from: K */
    private EdgeEffect f2002K;

    /* renamed from: L */
    private EdgeEffect f2003L;

    /* renamed from: M */
    AbstractC0339l f2004M;

    /* renamed from: N */
    private int f2005N;

    /* renamed from: O */
    private int f2006O;

    /* renamed from: P */
    private VelocityTracker f2007P;

    /* renamed from: Q */
    private int f2008Q;

    /* renamed from: R */
    private int f2009R;

    /* renamed from: S */
    private int f2010S;

    /* renamed from: T */
    private int f2011T;

    /* renamed from: U */
    private int f2012U;

    /* renamed from: V */
    private AbstractC0345r f2013V;

    /* renamed from: W */
    private final int f2014W;

    /* renamed from: a0 */
    private final int f2015a0;

    /* renamed from: b */
    private final C0351x f2016b;

    /* renamed from: b0 */
    private float f2017b0;

    /* renamed from: c */
    final C0349v f2018c;

    /* renamed from: c0 */
    private float f2019c0;

    /* renamed from: d */
    private SavedState f2020d;

    /* renamed from: d0 */
    private boolean f2021d0;

    /* renamed from: e */
    C0360a f2022e;

    /* renamed from: e0 */
    final RunnableC0328b0 f2023e0;

    /* renamed from: f */
    C0361b f2024f;

    /* renamed from: f0 */
    RunnableC0364e f2025f0;

    /* renamed from: g */
    final C0372m f2026g;

    /* renamed from: g0 */
    RunnableC0364e.b f2027g0;

    /* renamed from: h */
    boolean f2028h;

    /* renamed from: h0 */
    final C0353z f2029h0;

    /* renamed from: i */
    final Rect f2030i;

    /* renamed from: i0 */
    private AbstractC0347t f2031i0;

    /* renamed from: j */
    private final Rect f2032j;

    /* renamed from: j0 */
    private List<AbstractC0347t> f2033j0;

    /* renamed from: k */
    final RectF f2034k;

    /* renamed from: k0 */
    boolean f2035k0;

    /* renamed from: l */
    AbstractC0334g f2036l;

    /* renamed from: l0 */
    boolean f2037l0;

    /* renamed from: m */
    AbstractC0342o f2038m;

    /* renamed from: m0 */
    private AbstractC0339l.b f2039m0;

    /* renamed from: n */
    InterfaceC0350w f2040n;

    /* renamed from: n0 */
    boolean f2041n0;

    /* renamed from: o */
    final ArrayList<AbstractC0341n> f2042o;

    /* renamed from: o0 */
    C0368i f2043o0;

    /* renamed from: p */
    private final ArrayList<InterfaceC0346s> f2044p;

    /* renamed from: p0 */
    private InterfaceC0337j f2045p0;

    /* renamed from: q */
    private InterfaceC0346s f2046q;

    /* renamed from: q0 */
    private final int[] f2047q0;

    /* renamed from: r */
    boolean f2048r;

    /* renamed from: r0 */
    private C2797j2 f2049r0;

    /* renamed from: s */
    boolean f2050s;

    /* renamed from: s0 */
    private final int[] f2051s0;

    /* renamed from: t */
    boolean f2052t;

    /* renamed from: t0 */
    final int[] f2053t0;

    /* renamed from: u */
    boolean f2054u;

    /* renamed from: u0 */
    private final int[] f2055u0;

    /* renamed from: v */
    private int f2056v;

    /* renamed from: v0 */
    final int[] f2057v0;

    /* renamed from: w */
    boolean f2058w;

    /* renamed from: w0 */
    final List<AbstractC0330c0> f2059w0;

    /* renamed from: x */
    boolean f2060x;

    /* renamed from: x0 */
    private Runnable f2061x0;

    /* renamed from: y */
    private boolean f2062y;

    /* renamed from: y0 */
    private final C0372m.b f2063y0;

    /* renamed from: z */
    private int f2064z;

    /* renamed from: z0 */
    private static final int[] f1991z0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: A0 */
    private static final int[] f1983A0 = {R.attr.clipToPadding};

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0324a();

        /* renamed from: d */
        Parcelable f2065d;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$SavedState$a */
        /* loaded from: classes.dex */
        static class C0324a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0324a() {
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
            this.f2065d = parcel.readParcelable(classLoader == null ? AbstractC0342o.class.getClassLoader() : classLoader);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: a */
        void m2325a(SavedState savedState) {
            this.f2065d = savedState.f2065d;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f2065d, 0);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    /* loaded from: classes.dex */
    class RunnableC0325a implements Runnable {
        RunnableC0325a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f2054u || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f2048r) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f2060x) {
                recyclerView2.f2058w = true;
            } else {
                recyclerView2.m2272b();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0326a0 {
        /* renamed from: a */
        public abstract View m2326a(C0349v c0349v, int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    /* loaded from: classes.dex */
    class RunnableC0327b implements Runnable {
        RunnableC0327b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0339l abstractC0339l = RecyclerView.this.f2004M;
            if (abstractC0339l != null) {
                abstractC0339l.mo2440i();
            }
            RecyclerView.this.f2041n0 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    /* loaded from: classes.dex */
    public class RunnableC0328b0 implements Runnable {

        /* renamed from: b */
        private int f2068b;

        /* renamed from: c */
        private int f2069c;

        /* renamed from: d */
        OverScroller f2070d;

        /* renamed from: e */
        Interpolator f2071e = RecyclerView.f1990H0;

        /* renamed from: f */
        private boolean f2072f = false;

        /* renamed from: g */
        private boolean f2073g = false;

        RunnableC0328b0() {
            this.f2070d = new OverScroller(RecyclerView.this.getContext(), RecyclerView.f1990H0);
        }

        /* renamed from: a */
        private float m2327a(float f) {
            return (float) Math.sin((f - 0.5f) * 0.47123894f);
        }

        /* renamed from: a */
        private int m2328a(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((i3 * i3) + (i4 * i4));
            int sqrt2 = (int) Math.sqrt((i * i) + (i2 * i2));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i6 = width / 2;
            float f = width;
            float f2 = i6;
            float m2327a = f2 + (m2327a(Math.min(1.0f, (sqrt2 * 1.0f) / f)) * f2);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(m2327a / sqrt) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((abs / f) + 1.0f) * 300.0f);
            }
            return Math.min(i5, 2000);
        }

        /* renamed from: c */
        private void m2329c() {
            this.f2073g = false;
            this.f2072f = true;
        }

        /* renamed from: d */
        private void m2330d() {
            this.f2072f = false;
            if (this.f2073g) {
                m2331a();
            }
        }

        /* renamed from: a */
        void m2331a() {
            if (this.f2072f) {
                this.f2073g = true;
            } else {
                RecyclerView.this.removeCallbacks(this);
                C3107q2.m14892a(RecyclerView.this, this);
            }
        }

        /* renamed from: a */
        public void m2332a(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f2069c = 0;
            this.f2068b = 0;
            this.f2070d.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            m2331a();
        }

        /* renamed from: a */
        public void m2333a(int i, int i2, int i3, Interpolator interpolator) {
            if (this.f2071e != interpolator) {
                this.f2071e = interpolator;
                this.f2070d = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            RecyclerView.this.setScrollState(2);
            this.f2069c = 0;
            this.f2068b = 0;
            this.f2070d.startScroll(0, 0, i, i2, i3);
            if (Build.VERSION.SDK_INT < 23) {
                this.f2070d.computeScrollOffset();
            }
            m2331a();
        }

        /* renamed from: a */
        public void m2334a(int i, int i2, Interpolator interpolator) {
            int m2328a = m2328a(i, i2, 0, 0);
            if (interpolator == null) {
                interpolator = RecyclerView.f1990H0;
            }
            m2333a(i, i2, m2328a, interpolator);
        }

        /* renamed from: b */
        public void m2335b() {
            RecyclerView.this.removeCallbacks(this);
            this.f2070d.abortAnimation();
        }

        /* JADX WARN: Code restructure failed: missing block: B:55:0x00e3, code lost:
        
            if (r8 > 0) goto L50;
         */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00f6 A[ADDED_TO_REGION] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 410
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.RunnableC0328b0.run():void");
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    /* loaded from: classes.dex */
    static class InterpolatorC0329c implements Interpolator {
        InterpolatorC0329c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c0 */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0330c0 {

        /* renamed from: s */
        private static final List<Object> f2075s = Collections.emptyList();

        /* renamed from: a */
        public final View f2076a;

        /* renamed from: b */
        WeakReference<RecyclerView> f2077b;

        /* renamed from: j */
        int f2085j;

        /* renamed from: r */
        RecyclerView f2093r;

        /* renamed from: c */
        int f2078c = -1;

        /* renamed from: d */
        int f2079d = -1;

        /* renamed from: e */
        long f2080e = -1;

        /* renamed from: f */
        int f2081f = -1;

        /* renamed from: g */
        int f2082g = -1;

        /* renamed from: h */
        AbstractC0330c0 f2083h = null;

        /* renamed from: i */
        AbstractC0330c0 f2084i = null;

        /* renamed from: k */
        List<Object> f2086k = null;

        /* renamed from: l */
        List<Object> f2087l = null;

        /* renamed from: m */
        private int f2088m = 0;

        /* renamed from: n */
        C0349v f2089n = null;

        /* renamed from: o */
        boolean f2090o = false;

        /* renamed from: p */
        private int f2091p = 0;

        /* renamed from: q */
        int f2092q = -1;

        public AbstractC0330c0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f2076a = view;
        }

        /* renamed from: A */
        private void m2336A() {
            if (this.f2086k == null) {
                ArrayList arrayList = new ArrayList();
                this.f2086k = arrayList;
                this.f2087l = Collections.unmodifiableList(arrayList);
            }
        }

        /* renamed from: a */
        void m2337a() {
            this.f2079d = -1;
            this.f2082g = -1;
        }

        /* renamed from: a */
        void m2338a(int i) {
            this.f2085j = i | this.f2085j;
        }

        /* renamed from: a */
        void m2339a(int i, int i2) {
            this.f2085j = (i & i2) | (this.f2085j & (i2 ^ (-1)));
        }

        /* renamed from: a */
        void m2340a(int i, int i2, boolean z) {
            m2338a(8);
            m2341a(i2, z);
            this.f2078c = i;
        }

        /* renamed from: a */
        void m2341a(int i, boolean z) {
            if (this.f2079d == -1) {
                this.f2079d = this.f2078c;
            }
            if (this.f2082g == -1) {
                this.f2082g = this.f2078c;
            }
            if (z) {
                this.f2082g += i;
            }
            this.f2078c += i;
            if (this.f2076a.getLayoutParams() != null) {
                ((C0343p) this.f2076a.getLayoutParams()).f2134c = true;
            }
        }

        /* renamed from: a */
        void m2342a(C0349v c0349v, boolean z) {
            this.f2089n = c0349v;
            this.f2090o = z;
        }

        /* renamed from: a */
        void m2343a(RecyclerView recyclerView) {
            int i = this.f2092q;
            if (i == -1) {
                i = C3107q2.m14917i(this.f2076a);
            }
            this.f2091p = i;
            recyclerView.m2270a(this, 4);
        }

        /* renamed from: a */
        void m2344a(Object obj) {
            if (obj == null) {
                m2338a(1024);
            } else if ((1024 & this.f2085j) == 0) {
                m2336A();
                this.f2086k.add(obj);
            }
        }

        /* renamed from: a */
        public final void m2345a(boolean z) {
            int i;
            int i2 = this.f2088m;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.f2088m = i3;
            if (i3 < 0) {
                this.f2088m = 0;
                String str = "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this;
                return;
            }
            if (!z && i3 == 1) {
                i = this.f2085j | 16;
            } else if (!z || this.f2088m != 0) {
                return;
            } else {
                i = this.f2085j & (-17);
            }
            this.f2085j = i;
        }

        /* renamed from: b */
        void m2346b() {
            List<Object> list = this.f2086k;
            if (list != null) {
                list.clear();
            }
            this.f2085j &= -1025;
        }

        /* renamed from: b */
        void m2347b(RecyclerView recyclerView) {
            recyclerView.m2270a(this, this.f2091p);
            this.f2091p = 0;
        }

        /* renamed from: b */
        boolean m2348b(int i) {
            return (i & this.f2085j) != 0;
        }

        /* renamed from: c */
        void m2349c() {
            this.f2085j &= -33;
        }

        /* renamed from: d */
        void m2350d() {
            this.f2085j &= -257;
        }

        /* renamed from: e */
        boolean m2351e() {
            return (this.f2085j & 16) == 0 && C3107q2.m14930v(this.f2076a);
        }

        /* renamed from: f */
        public final int m2352f() {
            RecyclerView recyclerView = this.f2093r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.m2271b(this);
        }

        /* renamed from: g */
        public final long m2353g() {
            return this.f2080e;
        }

        /* renamed from: h */
        public final int m2354h() {
            return this.f2081f;
        }

        /* renamed from: i */
        public final int m2355i() {
            int i = this.f2082g;
            return i == -1 ? this.f2078c : i;
        }

        /* renamed from: j */
        public final int m2356j() {
            return this.f2079d;
        }

        /* renamed from: k */
        List<Object> m2357k() {
            if ((this.f2085j & 1024) != 0) {
                return f2075s;
            }
            List<Object> list = this.f2086k;
            return (list == null || list.size() == 0) ? f2075s : this.f2087l;
        }

        /* renamed from: l */
        boolean m2358l() {
            return (this.f2085j & 512) != 0 || m2360n();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: m */
        public boolean m2359m() {
            return (this.f2085j & 1) != 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean m2360n() {
            return (this.f2085j & 4) != 0;
        }

        /* renamed from: o */
        public final boolean m2361o() {
            return (this.f2085j & 16) == 0 && !C3107q2.m14930v(this.f2076a);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: p */
        public boolean m2362p() {
            return (this.f2085j & 8) != 0;
        }

        /* renamed from: q */
        boolean m2363q() {
            return this.f2089n != null;
        }

        /* renamed from: r */
        boolean m2364r() {
            return (this.f2085j & 256) != 0;
        }

        /* renamed from: s */
        boolean m2365s() {
            return (this.f2085j & 2) != 0;
        }

        /* renamed from: t */
        boolean m2366t() {
            return (this.f2085j & 2) != 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f2078c + " id=" + this.f2080e + ", oldPos=" + this.f2079d + ", pLpos:" + this.f2082g);
            if (m2363q()) {
                sb.append(" scrap ");
                sb.append(this.f2090o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (m2360n()) {
                sb.append(" invalid");
            }
            if (!m2359m()) {
                sb.append(" unbound");
            }
            if (m2366t()) {
                sb.append(" update");
            }
            if (m2362p()) {
                sb.append(" removed");
            }
            if (m2370x()) {
                sb.append(" ignored");
            }
            if (m2364r()) {
                sb.append(" tmpDetached");
            }
            if (!m2361o()) {
                sb.append(" not recyclable(" + this.f2088m + ")");
            }
            if (m2358l()) {
                sb.append(" undefined adapter position");
            }
            if (this.f2076a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* renamed from: u */
        void m2367u() {
            this.f2085j = 0;
            this.f2078c = -1;
            this.f2079d = -1;
            this.f2080e = -1L;
            this.f2082g = -1;
            this.f2088m = 0;
            this.f2083h = null;
            this.f2084i = null;
            m2346b();
            this.f2091p = 0;
            this.f2092q = -1;
            RecyclerView.m2239e(this);
        }

        /* renamed from: v */
        void m2368v() {
            if (this.f2079d == -1) {
                this.f2079d = this.f2078c;
            }
        }

        /* renamed from: w */
        boolean m2369w() {
            return (this.f2085j & 16) != 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x */
        public boolean m2370x() {
            return (this.f2085j & 128) != 0;
        }

        /* renamed from: y */
        void m2371y() {
            this.f2089n.m2607c(this);
        }

        /* renamed from: z */
        boolean m2372z() {
            return (this.f2085j & 32) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    /* loaded from: classes.dex */
    class C0331d implements C0372m.b {
        C0331d() {
        }

        @Override // androidx.recyclerview.widget.C0372m.b
        /* renamed from: a */
        public void mo2373a(AbstractC0330c0 abstractC0330c0) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f2038m.m2470a(abstractC0330c0.f2076a, recyclerView.f2018c);
        }

        @Override // androidx.recyclerview.widget.C0372m.b
        /* renamed from: a */
        public void mo2374a(AbstractC0330c0 abstractC0330c0, AbstractC0339l.c cVar, AbstractC0339l.c cVar2) {
            RecyclerView.this.m2257a(abstractC0330c0, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.C0372m.b
        /* renamed from: b */
        public void mo2375b(AbstractC0330c0 abstractC0330c0, AbstractC0339l.c cVar, AbstractC0339l.c cVar2) {
            RecyclerView.this.f2018c.m2607c(abstractC0330c0);
            RecyclerView.this.m2276b(abstractC0330c0, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.C0372m.b
        /* renamed from: c */
        public void mo2376c(AbstractC0330c0 abstractC0330c0, AbstractC0339l.c cVar, AbstractC0339l.c cVar2) {
            abstractC0330c0.m2345a(false);
            RecyclerView recyclerView = RecyclerView.this;
            boolean z = recyclerView.f1995D;
            AbstractC0339l abstractC0339l = recyclerView.f2004M;
            if (z) {
                if (!abstractC0339l.mo2425a(abstractC0330c0, abstractC0330c0, cVar, cVar2)) {
                    return;
                }
            } else if (!abstractC0339l.mo2433c(abstractC0330c0, cVar, cVar2)) {
                return;
            }
            RecyclerView.this.m2319s();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    /* loaded from: classes.dex */
    public class C0332e implements C0361b.b {
        C0332e() {
        }

        @Override // androidx.recyclerview.widget.C0361b.b
        /* renamed from: a */
        public int mo2377a() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.C0361b.b
        /* renamed from: a */
        public View mo2378a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        @Override // androidx.recyclerview.widget.C0361b.b
        /* renamed from: a */
        public void mo2379a(View view) {
            AbstractC0330c0 m2241k = RecyclerView.m2241k(view);
            if (m2241k != null) {
                m2241k.m2343a(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C0361b.b
        /* renamed from: a */
        public void mo2380a(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.m2255a(view);
        }

        @Override // androidx.recyclerview.widget.C0361b.b
        /* renamed from: a */
        public void mo2381a(View view, int i, ViewGroup.LayoutParams layoutParams) {
            AbstractC0330c0 m2241k = RecyclerView.m2241k(view);
            if (m2241k != null) {
                if (!m2241k.m2364r() && !m2241k.m2370x()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + m2241k + RecyclerView.this.m2306i());
                }
                m2241k.m2350d();
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }

        @Override // androidx.recyclerview.widget.C0361b.b
        /* renamed from: b */
        public AbstractC0330c0 mo2382b(View view) {
            return RecyclerView.m2241k(view);
        }

        @Override // androidx.recyclerview.widget.C0361b.b
        /* renamed from: b */
        public void mo2383b() {
            int mo2377a = mo2377a();
            for (int i = 0; i < mo2377a; i++) {
                View mo2378a = mo2378a(i);
                RecyclerView.this.m2275b(mo2378a);
                mo2378a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.C0361b.b
        /* renamed from: b */
        public void mo2384b(int i) {
            AbstractC0330c0 m2241k;
            View mo2378a = mo2378a(i);
            if (mo2378a != null && (m2241k = RecyclerView.m2241k(mo2378a)) != null) {
                if (m2241k.m2364r() && !m2241k.m2370x()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + m2241k + RecyclerView.this.m2306i());
                }
                m2241k.m2338a(256);
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        @Override // androidx.recyclerview.widget.C0361b.b
        /* renamed from: c */
        public void mo2385c(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.m2275b(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        @Override // androidx.recyclerview.widget.C0361b.b
        /* renamed from: c */
        public void mo2386c(View view) {
            AbstractC0330c0 m2241k = RecyclerView.m2241k(view);
            if (m2241k != null) {
                m2241k.m2347b(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C0361b.b
        /* renamed from: d */
        public int mo2387d(View view) {
            return RecyclerView.this.indexOfChild(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    /* loaded from: classes.dex */
    public class C0333f implements C0360a.a {
        C0333f() {
        }

        @Override // androidx.recyclerview.widget.C0360a.a
        /* renamed from: a */
        public AbstractC0330c0 mo2388a(int i) {
            AbstractC0330c0 m2246a = RecyclerView.this.m2246a(i, true);
            if (m2246a == null || RecyclerView.this.f2024f.m2774c(m2246a.f2076a)) {
                return null;
            }
            return m2246a;
        }

        @Override // androidx.recyclerview.widget.C0360a.a
        /* renamed from: a */
        public void mo2389a(int i, int i2) {
            RecyclerView.this.m2301g(i, i2);
            RecyclerView.this.f2035k0 = true;
        }

        @Override // androidx.recyclerview.widget.C0360a.a
        /* renamed from: a */
        public void mo2390a(int i, int i2, Object obj) {
            RecyclerView.this.m2251a(i, i2, obj);
            RecyclerView.this.f2037l0 = true;
        }

        @Override // androidx.recyclerview.widget.C0360a.a
        /* renamed from: a */
        public void mo2391a(C0360a.b bVar) {
            m2395c(bVar);
        }

        @Override // androidx.recyclerview.widget.C0360a.a
        /* renamed from: b */
        public void mo2392b(int i, int i2) {
            RecyclerView.this.m2252a(i, i2, false);
            RecyclerView.this.f2035k0 = true;
        }

        @Override // androidx.recyclerview.widget.C0360a.a
        /* renamed from: b */
        public void mo2393b(C0360a.b bVar) {
            m2395c(bVar);
        }

        @Override // androidx.recyclerview.widget.C0360a.a
        /* renamed from: c */
        public void mo2394c(int i, int i2) {
            RecyclerView.this.m2298f(i, i2);
            RecyclerView.this.f2035k0 = true;
        }

        /* renamed from: c */
        void m2395c(C0360a.b bVar) {
            int i = bVar.f2233a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f2038m.mo2107a(recyclerView, bVar.f2234b, bVar.f2236d);
                return;
            }
            if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f2038m.mo2113b(recyclerView2, bVar.f2234b, bVar.f2236d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f2038m.mo2109a(recyclerView3, bVar.f2234b, bVar.f2236d, bVar.f2235c);
            } else {
                if (i != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f2038m.mo2108a(recyclerView4, bVar.f2234b, bVar.f2236d, 1);
            }
        }

        @Override // androidx.recyclerview.widget.C0360a.a
        /* renamed from: d */
        public void mo2396d(int i, int i2) {
            RecyclerView.this.m2252a(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f2035k0 = true;
            recyclerView.f2029h0.f2155d += i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0334g<VH extends AbstractC0330c0> {

        /* renamed from: b */
        private final C0335h f2097b = new C0335h();

        /* renamed from: c */
        private boolean f2098c = false;

        /* renamed from: a */
        public abstract int mo2397a();

        /* renamed from: a */
        public long m2398a(int i) {
            return -1L;
        }

        /* renamed from: a */
        public final VH m2399a(ViewGroup viewGroup, int i) {
            try {
                C2494g1.m11864a("RV CreateView");
                VH mo2406b = mo2406b(viewGroup, i);
                if (mo2406b.f2076a.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                mo2406b.f2081f = i;
                return mo2406b;
            } finally {
                C2494g1.m11863a();
            }
        }

        /* renamed from: a */
        public final void m2400a(VH vh, int i) {
            vh.f2078c = i;
            if (m2411b()) {
                vh.f2080e = m2398a(i);
            }
            vh.m2339a(1, 519);
            C2494g1.m11864a("RV OnBindView");
            m2401a(vh, i, vh.m2357k());
            vh.m2346b();
            ViewGroup.LayoutParams layoutParams = vh.f2076a.getLayoutParams();
            if (layoutParams instanceof C0343p) {
                ((C0343p) layoutParams).f2134c = true;
            }
            C2494g1.m11863a();
        }

        /* renamed from: a */
        public void m2401a(VH vh, int i, List<Object> list) {
            mo2408b((AbstractC0334g<VH>) vh, i);
        }

        /* renamed from: a */
        public void m2402a(AbstractC0336i abstractC0336i) {
            this.f2097b.registerObserver(abstractC0336i);
        }

        /* renamed from: a */
        public void m2403a(RecyclerView recyclerView) {
        }

        /* renamed from: a */
        public boolean m2404a(VH vh) {
            return false;
        }

        /* renamed from: b */
        public int m2405b(int i) {
            return 0;
        }

        /* renamed from: b */
        public abstract VH mo2406b(ViewGroup viewGroup, int i);

        /* renamed from: b */
        public void m2407b(VH vh) {
        }

        /* renamed from: b */
        public abstract void mo2408b(VH vh, int i);

        /* renamed from: b */
        public void m2409b(AbstractC0336i abstractC0336i) {
            this.f2097b.unregisterObserver(abstractC0336i);
        }

        /* renamed from: b */
        public void m2410b(RecyclerView recyclerView) {
        }

        /* renamed from: b */
        public final boolean m2411b() {
            return this.f2098c;
        }

        /* renamed from: c */
        public final void m2412c() {
            this.f2097b.m2415a();
        }

        /* renamed from: c */
        public void m2413c(VH vh) {
        }

        /* renamed from: d */
        public void m2414d(VH vh) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    /* loaded from: classes.dex */
    public static class C0335h extends Observable<AbstractC0336i> {
        C0335h() {
        }

        /* renamed from: a */
        public void m2415a() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0336i) ((Observable) this).mObservers.get(size)).mo2416a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0336i {
        /* renamed from: a */
        public void mo2416a() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    /* loaded from: classes.dex */
    public interface InterfaceC0337j {
        /* renamed from: a */
        int m2417a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    /* loaded from: classes.dex */
    public static class C0338k {
        /* renamed from: a */
        protected EdgeEffect m2418a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0339l {

        /* renamed from: a */
        private b f2099a = null;

        /* renamed from: b */
        private ArrayList<a> f2100b = new ArrayList<>();

        /* renamed from: c */
        private long f2101c = 120;

        /* renamed from: d */
        private long f2102d = 120;

        /* renamed from: e */
        private long f2103e = 250;

        /* renamed from: f */
        private long f2104f = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$a */
        /* loaded from: classes.dex */
        public interface a {
            /* renamed from: a */
            void m2441a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$b */
        /* loaded from: classes.dex */
        public interface b {
            /* renamed from: a */
            void mo2442a(AbstractC0330c0 abstractC0330c0);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$c */
        /* loaded from: classes.dex */
        public static class c {

            /* renamed from: a */
            public int f2105a;

            /* renamed from: b */
            public int f2106b;

            /* renamed from: a */
            public c m2443a(AbstractC0330c0 abstractC0330c0) {
                m2444a(abstractC0330c0, 0);
                return this;
            }

            /* renamed from: a */
            public c m2444a(AbstractC0330c0 abstractC0330c0, int i) {
                View view = abstractC0330c0.f2076a;
                this.f2105a = view.getLeft();
                this.f2106b = view.getTop();
                view.getRight();
                view.getBottom();
                return this;
            }
        }

        /* renamed from: e */
        static int m2419e(AbstractC0330c0 abstractC0330c0) {
            int i = abstractC0330c0.f2085j & 14;
            if (abstractC0330c0.m2360n()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int m2356j = abstractC0330c0.m2356j();
            int m2352f = abstractC0330c0.m2352f();
            return (m2356j == -1 || m2352f == -1 || m2356j == m2352f) ? i : i | 2048;
        }

        /* renamed from: a */
        public c m2420a(C0353z c0353z, AbstractC0330c0 abstractC0330c0) {
            c m2439h = m2439h();
            m2439h.m2443a(abstractC0330c0);
            return m2439h;
        }

        /* renamed from: a */
        public c m2421a(C0353z c0353z, AbstractC0330c0 abstractC0330c0, int i, List<Object> list) {
            c m2439h = m2439h();
            m2439h.m2443a(abstractC0330c0);
            return m2439h;
        }

        /* renamed from: a */
        public final void m2422a() {
            int size = this.f2100b.size();
            for (int i = 0; i < size; i++) {
                this.f2100b.get(i).m2441a();
            }
            this.f2100b.clear();
        }

        /* renamed from: a */
        void m2423a(b bVar) {
            this.f2099a = bVar;
        }

        /* renamed from: a */
        public abstract boolean mo2424a(AbstractC0330c0 abstractC0330c0);

        /* renamed from: a */
        public abstract boolean mo2425a(AbstractC0330c0 abstractC0330c0, AbstractC0330c0 abstractC0330c02, c cVar, c cVar2);

        /* renamed from: a */
        public abstract boolean mo2426a(AbstractC0330c0 abstractC0330c0, c cVar, c cVar2);

        /* renamed from: a */
        public boolean mo2427a(AbstractC0330c0 abstractC0330c0, List<Object> list) {
            return mo2424a(abstractC0330c0);
        }

        /* renamed from: b */
        public abstract void mo2428b();

        /* renamed from: b */
        public final void m2429b(AbstractC0330c0 abstractC0330c0) {
            m2435d(abstractC0330c0);
            b bVar = this.f2099a;
            if (bVar != null) {
                bVar.mo2442a(abstractC0330c0);
            }
        }

        /* renamed from: b */
        public abstract boolean mo2430b(AbstractC0330c0 abstractC0330c0, c cVar, c cVar2);

        /* renamed from: c */
        public long m2431c() {
            return this.f2101c;
        }

        /* renamed from: c */
        public abstract void mo2432c(AbstractC0330c0 abstractC0330c0);

        /* renamed from: c */
        public abstract boolean mo2433c(AbstractC0330c0 abstractC0330c0, c cVar, c cVar2);

        /* renamed from: d */
        public long m2434d() {
            return this.f2104f;
        }

        /* renamed from: d */
        public void m2435d(AbstractC0330c0 abstractC0330c0) {
        }

        /* renamed from: e */
        public long m2436e() {
            return this.f2103e;
        }

        /* renamed from: f */
        public long m2437f() {
            return this.f2102d;
        }

        /* renamed from: g */
        public abstract boolean mo2438g();

        /* renamed from: h */
        public c m2439h() {
            return new c();
        }

        /* renamed from: i */
        public abstract void mo2440i();
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    /* loaded from: classes.dex */
    private class C0340m implements AbstractC0339l.b {
        C0340m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0339l.b
        /* renamed from: a */
        public void mo2442a(AbstractC0330c0 abstractC0330c0) {
            abstractC0330c0.m2345a(true);
            if (abstractC0330c0.f2083h != null && abstractC0330c0.f2084i == null) {
                abstractC0330c0.f2083h = null;
            }
            abstractC0330c0.f2084i = null;
            if (abstractC0330c0.m2369w() || RecyclerView.this.m2308i(abstractC0330c0.f2076a) || !abstractC0330c0.m2364r()) {
                return;
            }
            RecyclerView.this.removeDetachedView(abstractC0330c0.f2076a, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0341n {
        @Deprecated
        /* renamed from: a */
        public void m2445a(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: a */
        public void m2446a(Canvas canvas, RecyclerView recyclerView, C0353z c0353z) {
            m2445a(canvas, recyclerView);
        }

        @Deprecated
        /* renamed from: a */
        public void m2447a(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: a */
        public void m2448a(Rect rect, View view, RecyclerView recyclerView, C0353z c0353z) {
            m2447a(rect, ((C0343p) view.getLayoutParams()).m2556a(), recyclerView);
        }

        @Deprecated
        /* renamed from: b */
        public void m2449b(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: b */
        public void mo2450b(Canvas canvas, RecyclerView recyclerView, C0353z c0353z) {
            m2449b(canvas, recyclerView);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0342o {

        /* renamed from: a */
        C0361b f2108a;

        /* renamed from: b */
        RecyclerView f2109b;

        /* renamed from: g */
        AbstractC0352y f2114g;

        /* renamed from: m */
        int f2120m;

        /* renamed from: n */
        boolean f2121n;

        /* renamed from: o */
        private int f2122o;

        /* renamed from: p */
        private int f2123p;

        /* renamed from: q */
        private int f2124q;

        /* renamed from: r */
        private int f2125r;

        /* renamed from: c */
        private final C0371l.b f2110c = new a();

        /* renamed from: d */
        private final C0371l.b f2111d = new b();

        /* renamed from: e */
        C0371l f2112e = new C0371l(this.f2110c);

        /* renamed from: f */
        C0371l f2113f = new C0371l(this.f2111d);

        /* renamed from: h */
        boolean f2115h = false;

        /* renamed from: i */
        boolean f2116i = false;

        /* renamed from: j */
        boolean f2117j = false;

        /* renamed from: k */
        private boolean f2118k = true;

        /* renamed from: l */
        private boolean f2119l = true;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$a */
        /* loaded from: classes.dex */
        class a implements C0371l.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.C0371l.b
            /* renamed from: a */
            public int mo2550a() {
                return AbstractC0342o.this.m2542q() - AbstractC0342o.this.m2539o();
            }

            @Override // androidx.recyclerview.widget.C0371l.b
            /* renamed from: a */
            public int mo2551a(View view) {
                return AbstractC0342o.this.m2518f(view) - ((ViewGroup.MarginLayoutParams) ((C0343p) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.C0371l.b
            /* renamed from: a */
            public View mo2552a(int i) {
                return AbstractC0342o.this.m2501c(i);
            }

            @Override // androidx.recyclerview.widget.C0371l.b
            /* renamed from: b */
            public int mo2553b() {
                return AbstractC0342o.this.m2537n();
            }

            @Override // androidx.recyclerview.widget.C0371l.b
            /* renamed from: b */
            public int mo2554b(View view) {
                return AbstractC0342o.this.m2528i(view) + ((ViewGroup.MarginLayoutParams) ((C0343p) view.getLayoutParams())).rightMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$b */
        /* loaded from: classes.dex */
        class b implements C0371l.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.C0371l.b
            /* renamed from: a */
            public int mo2550a() {
                return AbstractC0342o.this.m2525h() - AbstractC0342o.this.m2535m();
            }

            @Override // androidx.recyclerview.widget.C0371l.b
            /* renamed from: a */
            public int mo2551a(View view) {
                return AbstractC0342o.this.m2530j(view) - ((ViewGroup.MarginLayoutParams) ((C0343p) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.C0371l.b
            /* renamed from: a */
            public View mo2552a(int i) {
                return AbstractC0342o.this.m2501c(i);
            }

            @Override // androidx.recyclerview.widget.C0371l.b
            /* renamed from: b */
            public int mo2553b() {
                return AbstractC0342o.this.m2541p();
            }

            @Override // androidx.recyclerview.widget.C0371l.b
            /* renamed from: b */
            public int mo2554b(View view) {
                return AbstractC0342o.this.m2515e(view) + ((ViewGroup.MarginLayoutParams) ((C0343p) view.getLayoutParams())).bottomMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$c */
        /* loaded from: classes.dex */
        public interface c {
            /* renamed from: a */
            void mo2555a(int i, int i2);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$d */
        /* loaded from: classes.dex */
        public static class d {

            /* renamed from: a */
            public int f2128a;

            /* renamed from: b */
            public int f2129b;

            /* renamed from: c */
            public boolean f2130c;

            /* renamed from: d */
            public boolean f2131d;
        }

        /* renamed from: a */
        public static int m2451a(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
        
            if (r5 == 1073741824) goto L14;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int m2452a(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L21
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L21
                goto L2f
            L1a:
                if (r7 < 0) goto L1f
            L1c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L31
            L1f:
                if (r7 != r1) goto L23
            L21:
                r7 = r4
                goto L31
            L23:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L2a
                goto L2c
            L2a:
                r5 = 0
                goto L21
            L2c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L21
            L2f:
                r5 = 0
                r7 = 0
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.AbstractC0342o.m2452a(int, int, int, int, boolean):int");
        }

        /* renamed from: a */
        public static d m2453a(Context context, AttributeSet attributeSet, int i, int i2) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RecyclerView, i, i2);
            dVar.f2128a = obtainStyledAttributes.getInt(R$styleable.RecyclerView_android_orientation, 1);
            dVar.f2129b = obtainStyledAttributes.getInt(R$styleable.RecyclerView_spanCount, 1);
            dVar.f2130c = obtainStyledAttributes.getBoolean(R$styleable.RecyclerView_reverseLayout, false);
            dVar.f2131d = obtainStyledAttributes.getBoolean(R$styleable.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        /* renamed from: a */
        private void m2454a(int i, View view) {
            this.f2108a.m2764a(i);
        }

        /* renamed from: a */
        private void m2455a(View view, int i, boolean z) {
            AbstractC0330c0 m2241k = RecyclerView.m2241k(view);
            if (z || m2241k.m2362p()) {
                this.f2109b.f2026g.m2897a(m2241k);
            } else {
                this.f2109b.f2026g.m2908g(m2241k);
            }
            C0343p c0343p = (C0343p) view.getLayoutParams();
            if (m2241k.m2372z() || m2241k.m2363q()) {
                if (m2241k.m2363q()) {
                    m2241k.m2371y();
                } else {
                    m2241k.m2349c();
                }
                this.f2108a.m2766a(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f2109b) {
                int m2770b = this.f2108a.m2770b(view);
                if (i == -1) {
                    i = this.f2108a.m2763a();
                }
                if (m2770b == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f2109b.indexOfChild(view) + this.f2109b.m2306i());
                }
                if (m2770b != i) {
                    this.f2109b.f2038m.m2462a(m2770b, i);
                }
            } else {
                this.f2108a.m2767a(view, i, false);
                c0343p.f2134c = true;
                AbstractC0352y abstractC0352y = this.f2114g;
                if (abstractC0352y != null && abstractC0352y.m2625c()) {
                    this.f2114g.m2623a(view);
                }
            }
            if (c0343p.f2135d) {
                m2241k.f2076a.invalidate();
                c0343p.f2135d = false;
            }
        }

        /* renamed from: a */
        private void m2456a(C0349v c0349v, int i, View view) {
            AbstractC0330c0 m2241k = RecyclerView.m2241k(view);
            if (m2241k.m2370x()) {
                return;
            }
            if (m2241k.m2360n() && !m2241k.m2362p() && !this.f2109b.f2036l.m2411b()) {
                m2524g(i);
                c0349v.m2602b(m2241k);
            } else {
                m2461a(i);
                c0349v.m2606c(view);
                this.f2109b.f2026g.m2905d(m2241k);
            }
        }

        /* renamed from: b */
        private static boolean m2457b(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        /* renamed from: b */
        private int[] m2458b(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            int[] iArr = new int[2];
            int m2537n = m2537n();
            int m2541p = m2541p();
            int m2542q = m2542q() - m2539o();
            int m2525h = m2525h() - m2535m();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - m2537n;
            int min = Math.min(0, i);
            int i2 = top - m2541p;
            int min2 = Math.min(0, i2);
            int i3 = width - m2542q;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - m2525h);
            if (m2529j() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: d */
        private boolean m2459d(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int m2537n = m2537n();
            int m2541p = m2541p();
            int m2542q = m2542q() - m2539o();
            int m2525h = m2525h() - m2535m();
            Rect rect = this.f2109b.f2030i;
            m2496b(focusedChild, rect);
            return rect.left - i < m2542q && rect.right - i > m2537n && rect.top - i2 < m2525h && rect.bottom - i2 > m2541p;
        }

        /* renamed from: A */
        boolean mo2159A() {
            return false;
        }

        /* renamed from: B */
        void m2460B() {
            AbstractC0352y abstractC0352y = this.f2114g;
            if (abstractC0352y != null) {
                abstractC0352y.m2626d();
            }
        }

        /* renamed from: C */
        public boolean mo2095C() {
            return false;
        }

        /* renamed from: a */
        public int mo2096a(int i, C0349v c0349v, C0353z c0353z) {
            return 0;
        }

        /* renamed from: a */
        public int mo2097a(C0349v c0349v, C0353z c0353z) {
            RecyclerView recyclerView = this.f2109b;
            if (recyclerView == null || recyclerView.f2036l == null || !mo2176a()) {
                return 1;
            }
            return this.f2109b.f2036l.mo2397a();
        }

        /* renamed from: a */
        public int mo2168a(C0353z c0353z) {
            return 0;
        }

        /* renamed from: a */
        public View mo2098a(View view, int i, C0349v c0349v, C0353z c0353z) {
            return null;
        }

        /* renamed from: a */
        public C0343p mo2100a(Context context, AttributeSet attributeSet) {
            return new C0343p(context, attributeSet);
        }

        /* renamed from: a */
        public C0343p mo2101a(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof C0343p ? new C0343p((C0343p) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0343p((ViewGroup.MarginLayoutParams) layoutParams) : new C0343p(layoutParams);
        }

        /* renamed from: a */
        public void m2461a(int i) {
            m2454a(i, m2501c(i));
        }

        /* renamed from: a */
        public void m2462a(int i, int i2) {
            View m2501c = m2501c(i);
            if (m2501c != null) {
                m2461a(i);
                m2504c(m2501c, i2);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f2109b.toString());
            }
        }

        /* renamed from: a */
        public void mo2170a(int i, int i2, C0353z c0353z, c cVar) {
        }

        /* renamed from: a */
        public void mo2171a(int i, c cVar) {
        }

        /* renamed from: a */
        public void m2463a(int i, C0349v c0349v) {
            View m2501c = m2501c(i);
            m2524g(i);
            c0349v.m2601b(m2501c);
        }

        /* renamed from: a */
        public void mo2102a(Rect rect, int i, int i2) {
            m2503c(m2451a(i, rect.width() + m2537n() + m2539o(), m2533l()), m2451a(i2, rect.height() + m2541p() + m2535m(), m2531k()));
        }

        /* renamed from: a */
        public void mo2172a(Parcelable parcelable) {
        }

        /* renamed from: a */
        public void m2464a(View view) {
            m2465a(view, -1);
        }

        /* renamed from: a */
        public void m2465a(View view, int i) {
            m2455a(view, i, true);
        }

        /* renamed from: a */
        public void m2466a(View view, int i, int i2) {
            C0343p c0343p = (C0343p) view.getLayoutParams();
            Rect m2295f = this.f2109b.m2295f(view);
            int i3 = i + m2295f.left + m2295f.right;
            int i4 = i2 + m2295f.top + m2295f.bottom;
            int m2452a = m2452a(m2542q(), m2543r(), m2537n() + m2539o() + ((ViewGroup.MarginLayoutParams) c0343p).leftMargin + ((ViewGroup.MarginLayoutParams) c0343p).rightMargin + i3, ((ViewGroup.MarginLayoutParams) c0343p).width, mo2176a());
            int m2452a2 = m2452a(m2525h(), m2527i(), m2541p() + m2535m() + ((ViewGroup.MarginLayoutParams) c0343p).topMargin + ((ViewGroup.MarginLayoutParams) c0343p).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) c0343p).height, mo2180b());
            if (m2482a(view, m2452a, m2452a2, c0343p)) {
                view.measure(m2452a, m2452a2);
            }
        }

        /* renamed from: a */
        public void m2467a(View view, int i, int i2, int i3, int i4) {
            C0343p c0343p = (C0343p) view.getLayoutParams();
            Rect rect = c0343p.f2133b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c0343p).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c0343p).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c0343p).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0343p).bottomMargin);
        }

        /* renamed from: a */
        public void m2468a(View view, int i, C0343p c0343p) {
            AbstractC0330c0 m2241k = RecyclerView.m2241k(view);
            if (m2241k.m2362p()) {
                this.f2109b.f2026g.m2897a(m2241k);
            } else {
                this.f2109b.f2026g.m2908g(m2241k);
            }
            this.f2108a.m2766a(view, i, c0343p, m2241k.m2362p());
        }

        /* renamed from: a */
        public void m2469a(View view, Rect rect) {
            RecyclerView recyclerView = this.f2109b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.m2295f(view));
            }
        }

        /* renamed from: a */
        public void m2470a(View view, C0349v c0349v) {
            m2540o(view);
            c0349v.m2601b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m2471a(View view, C0448b3 c0448b3) {
            AbstractC0330c0 m2241k = RecyclerView.m2241k(view);
            if (m2241k == null || m2241k.m2362p() || this.f2108a.m2774c(m2241k.f2076a)) {
                return;
            }
            RecyclerView recyclerView = this.f2109b;
            mo2103a(recyclerView.f2018c, recyclerView.f2029h0, view, c0448b3);
        }

        /* renamed from: a */
        public void m2472a(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((C0343p) view.getLayoutParams()).f2133b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f2109b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f2109b.f2034k;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: a */
        public void mo2173a(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f2109b;
            m2476a(recyclerView.f2018c, recyclerView.f2029h0, accessibilityEvent);
        }

        /* renamed from: a */
        public void m2473a(AbstractC0334g abstractC0334g, AbstractC0334g abstractC0334g2) {
        }

        /* renamed from: a */
        public void m2474a(C0349v c0349v) {
            for (int m2514e = m2514e() - 1; m2514e >= 0; m2514e--) {
                m2456a(c0349v, m2514e, m2501c(m2514e));
            }
        }

        /* renamed from: a */
        public void m2475a(C0349v c0349v, C0353z c0353z, int i, int i2) {
            this.f2109b.m2285c(i, i2);
        }

        /* renamed from: a */
        public void mo2103a(C0349v c0349v, C0353z c0353z, View view, C0448b3 c0448b3) {
            c0448b3.m3287b(C0448b3.b.m3311a(mo2180b() ? m2534l(view) : 0, 1, mo2176a() ? m2534l(view) : 0, 1, false, false));
        }

        /* renamed from: a */
        public void m2476a(C0349v c0349v, C0353z c0353z, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f2109b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.f2109b.canScrollVertically(-1) && !this.f2109b.canScrollHorizontally(-1) && !this.f2109b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            AbstractC0334g abstractC0334g = this.f2109b.f2036l;
            if (abstractC0334g != null) {
                accessibilityEvent.setItemCount(abstractC0334g.mo2397a());
            }
        }

        /* renamed from: a */
        public void m2477a(C0349v c0349v, C0353z c0353z, C0448b3 c0448b3) {
            if (this.f2109b.canScrollVertically(-1) || this.f2109b.canScrollHorizontally(-1)) {
                c0448b3.m3279a(8192);
                c0448b3.m3294d(true);
            }
            if (this.f2109b.canScrollVertically(1) || this.f2109b.canScrollHorizontally(1)) {
                c0448b3.m3279a(4096);
                c0448b3.m3294d(true);
            }
            c0448b3.m3282a(C0448b3.a.m3310a(mo2112b(c0349v, c0353z), mo2097a(c0349v, c0353z), m2513d(c0349v, c0353z), m2500c(c0349v, c0353z)));
        }

        /* renamed from: a */
        void m2478a(RecyclerView recyclerView) {
            this.f2116i = true;
            m2498b(recyclerView);
        }

        /* renamed from: a */
        public void mo2107a(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: a */
        public void mo2108a(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: a */
        public void mo2109a(RecyclerView recyclerView, int i, int i2, Object obj) {
            m2507c(recyclerView, i, i2);
        }

        /* renamed from: a */
        void m2479a(RecyclerView recyclerView, C0349v c0349v) {
            this.f2116i = false;
            mo2179b(recyclerView, c0349v);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m2480a(C0448b3 c0448b3) {
            RecyclerView recyclerView = this.f2109b;
            m2477a(recyclerView.f2018c, recyclerView.f2029h0, c0448b3);
        }

        /* renamed from: a */
        public void mo2174a(String str) {
            RecyclerView recyclerView = this.f2109b;
            if (recyclerView != null) {
                recyclerView.m2263a(str);
            }
        }

        /* renamed from: a */
        public boolean mo2176a() {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean m2481a(int i, Bundle bundle) {
            RecyclerView recyclerView = this.f2109b;
            return m2485a(recyclerView.f2018c, recyclerView.f2029h0, i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean m2482a(View view, int i, int i2, C0343p c0343p) {
            return (!view.isLayoutRequested() && this.f2118k && m2457b(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c0343p).width) && m2457b(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c0343p).height)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean m2483a(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.f2109b;
            return m2486a(recyclerView.f2018c, recyclerView.f2029h0, view, i, bundle);
        }

        /* renamed from: a */
        public boolean m2484a(View view, boolean z, boolean z2) {
            boolean z3 = this.f2112e.m2887a(view, 24579) && this.f2113f.m2887a(view, 24579);
            return z ? z3 : !z3;
        }

        /* renamed from: a */
        public boolean mo2110a(C0343p c0343p) {
            return c0343p != null;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0070 A[ADDED_TO_REGION] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean m2485a(androidx.recyclerview.widget.RecyclerView.C0349v r2, androidx.recyclerview.widget.RecyclerView.C0353z r3, int r4, android.os.Bundle r5) {
            /*
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r2 = r1.f2109b
                r3 = 0
                if (r2 != 0) goto L6
                return r3
            L6:
                r5 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r4 == r5) goto L42
                r5 = 8192(0x2000, float:1.148E-41)
                if (r4 == r5) goto L12
                r2 = 0
            L10:
                r4 = 0
                goto L6e
            L12:
                r4 = -1
                boolean r2 = r2.canScrollVertically(r4)
                if (r2 == 0) goto L29
                int r2 = r1.m2525h()
                int r5 = r1.m2541p()
                int r2 = r2 - r5
                int r5 = r1.m2535m()
                int r2 = r2 - r5
                int r2 = -r2
                goto L2a
            L29:
                r2 = 0
            L2a:
                androidx.recyclerview.widget.RecyclerView r5 = r1.f2109b
                boolean r4 = r5.canScrollHorizontally(r4)
                if (r4 == 0) goto L10
                int r4 = r1.m2542q()
                int r5 = r1.m2537n()
                int r4 = r4 - r5
                int r5 = r1.m2539o()
                int r4 = r4 - r5
                int r4 = -r4
                goto L6e
            L42:
                boolean r2 = r2.canScrollVertically(r0)
                if (r2 == 0) goto L57
                int r2 = r1.m2525h()
                int r4 = r1.m2541p()
                int r2 = r2 - r4
                int r4 = r1.m2535m()
                int r2 = r2 - r4
                goto L58
            L57:
                r2 = 0
            L58:
                androidx.recyclerview.widget.RecyclerView r4 = r1.f2109b
                boolean r4 = r4.canScrollHorizontally(r0)
                if (r4 == 0) goto L10
                int r4 = r1.m2542q()
                int r5 = r1.m2537n()
                int r4 = r4 - r5
                int r5 = r1.m2539o()
                int r4 = r4 - r5
            L6e:
                if (r2 != 0) goto L73
                if (r4 != 0) goto L73
                return r3
            L73:
                androidx.recyclerview.widget.RecyclerView r3 = r1.f2109b
                r3.m2307i(r4, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.AbstractC0342o.m2485a(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z, int, android.os.Bundle):boolean");
        }

        /* renamed from: a */
        public boolean m2486a(C0349v c0349v, C0353z c0353z, View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: a */
        public boolean m2487a(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return m2488a(recyclerView, view, rect, z, false);
        }

        /* renamed from: a */
        public boolean m2488a(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] m2458b = m2458b(recyclerView, view, rect, z);
            int i = m2458b[0];
            int i2 = m2458b[1];
            if ((z2 && !m2459d(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.m2307i(i, i2);
            }
            return true;
        }

        @Deprecated
        /* renamed from: a */
        public boolean m2489a(RecyclerView recyclerView, View view, View view2) {
            return m2547w() || recyclerView.m2314n();
        }

        /* renamed from: a */
        public boolean m2490a(RecyclerView recyclerView, C0353z c0353z, View view, View view2) {
            return m2489a(recyclerView, view, view2);
        }

        /* renamed from: a */
        public boolean m2491a(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* renamed from: a */
        public boolean m2492a(Runnable runnable) {
            RecyclerView recyclerView = this.f2109b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: b */
        public int mo2111b(int i, C0349v c0349v, C0353z c0353z) {
            return 0;
        }

        /* renamed from: b */
        public int mo2112b(C0349v c0349v, C0353z c0353z) {
            RecyclerView recyclerView = this.f2109b;
            if (recyclerView == null || recyclerView.f2036l == null || !mo2180b()) {
                return 1;
            }
            return this.f2109b.f2036l.mo2397a();
        }

        /* renamed from: b */
        public int mo2177b(C0353z c0353z) {
            return 0;
        }

        /* renamed from: b */
        public View mo2178b(int i) {
            int m2514e = m2514e();
            for (int i2 = 0; i2 < m2514e; i2++) {
                View m2501c = m2501c(i2);
                AbstractC0330c0 m2241k = RecyclerView.m2241k(m2501c);
                if (m2241k != null && m2241k.m2355i() == i && !m2241k.m2370x() && (this.f2109b.f2029h0.m2632d() || !m2241k.m2362p())) {
                    return m2501c;
                }
            }
            return null;
        }

        /* renamed from: b */
        void m2493b(int i, int i2) {
            this.f2124q = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f2122o = mode;
            if (mode == 0 && !RecyclerView.f1985C0) {
                this.f2124q = 0;
            }
            this.f2125r = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f2123p = mode2;
            if (mode2 != 0 || RecyclerView.f1985C0) {
                return;
            }
            this.f2125r = 0;
        }

        /* renamed from: b */
        public void m2494b(View view) {
            m2495b(view, -1);
        }

        /* renamed from: b */
        public void m2495b(View view, int i) {
            m2455a(view, i, false);
        }

        /* renamed from: b */
        public void m2496b(View view, Rect rect) {
            RecyclerView.m2225a(view, rect);
        }

        /* renamed from: b */
        public void m2497b(C0349v c0349v) {
            for (int m2514e = m2514e() - 1; m2514e >= 0; m2514e--) {
                if (!RecyclerView.m2241k(m2501c(m2514e)).m2370x()) {
                    m2463a(m2514e, c0349v);
                }
            }
        }

        /* renamed from: b */
        public void m2498b(RecyclerView recyclerView) {
        }

        /* renamed from: b */
        public void mo2113b(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: b */
        public void mo2179b(RecyclerView recyclerView, C0349v c0349v) {
            m2506c(recyclerView);
        }

        /* renamed from: b */
        public boolean mo2180b() {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean m2499b(View view, int i, int i2, C0343p c0343p) {
            return (this.f2118k && m2457b(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c0343p).width) && m2457b(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c0343p).height)) ? false : true;
        }

        /* renamed from: c */
        public int m2500c(C0349v c0349v, C0353z c0353z) {
            return 0;
        }

        /* renamed from: c */
        public int mo2182c(C0353z c0353z) {
            return 0;
        }

        /* renamed from: c */
        public View m2501c(int i) {
            C0361b c0361b = this.f2108a;
            if (c0361b != null) {
                return c0361b.m2772c(i);
            }
            return null;
        }

        /* renamed from: c */
        public View m2502c(View view) {
            View m2282c;
            RecyclerView recyclerView = this.f2109b;
            if (recyclerView == null || (m2282c = recyclerView.m2282c(view)) == null || this.f2108a.m2774c(m2282c)) {
                return null;
            }
            return m2282c;
        }

        /* renamed from: c */
        public abstract C0343p mo2115c();

        /* renamed from: c */
        public void m2503c(int i, int i2) {
            this.f2109b.setMeasuredDimension(i, i2);
        }

        /* renamed from: c */
        public void m2504c(View view, int i) {
            m2468a(view, i, (C0343p) view.getLayoutParams());
        }

        /* renamed from: c */
        void m2505c(C0349v c0349v) {
            int m2611e = c0349v.m2611e();
            for (int i = m2611e - 1; i >= 0; i--) {
                View m2603c = c0349v.m2603c(i);
                AbstractC0330c0 m2241k = RecyclerView.m2241k(m2603c);
                if (!m2241k.m2370x()) {
                    m2241k.m2345a(false);
                    if (m2241k.m2364r()) {
                        this.f2109b.removeDetachedView(m2603c, false);
                    }
                    AbstractC0339l abstractC0339l = this.f2109b.f2004M;
                    if (abstractC0339l != null) {
                        abstractC0339l.mo2432c(m2241k);
                    }
                    m2241k.m2345a(true);
                    c0349v.m2591a(m2603c);
                }
            }
            c0349v.m2604c();
            if (m2611e > 0) {
                this.f2109b.invalidate();
            }
        }

        @Deprecated
        /* renamed from: c */
        public void m2506c(RecyclerView recyclerView) {
        }

        /* renamed from: c */
        public void m2507c(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: d */
        public int m2508d() {
            return -1;
        }

        /* renamed from: d */
        public int m2509d(View view) {
            return ((C0343p) view.getLayoutParams()).f2133b.bottom;
        }

        /* renamed from: d */
        public int mo2183d(C0353z c0353z) {
            return 0;
        }

        /* renamed from: d */
        public View m2510d(View view, int i) {
            return null;
        }

        /* renamed from: d */
        public void mo2511d(int i) {
            RecyclerView recyclerView = this.f2109b;
            if (recyclerView != null) {
                recyclerView.m2293e(i);
            }
        }

        /* renamed from: d */
        void m2512d(int i, int i2) {
            int m2514e = m2514e();
            if (m2514e == 0) {
                this.f2109b.m2285c(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < m2514e; i7++) {
                View m2501c = m2501c(i7);
                Rect rect = this.f2109b.f2030i;
                m2496b(m2501c, rect);
                int i8 = rect.left;
                if (i8 < i5) {
                    i5 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i6) {
                    i6 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i4) {
                    i4 = i11;
                }
            }
            this.f2109b.f2030i.set(i5, i6, i3, i4);
            mo2102a(this.f2109b.f2030i, i, i2);
        }

        /* renamed from: d */
        public void mo2116d(RecyclerView recyclerView) {
        }

        /* renamed from: d */
        public boolean m2513d(C0349v c0349v, C0353z c0353z) {
            return false;
        }

        /* renamed from: e */
        public int m2514e() {
            C0361b c0361b = this.f2108a;
            if (c0361b != null) {
                return c0361b.m2763a();
            }
            return 0;
        }

        /* renamed from: e */
        public int m2515e(View view) {
            return view.getBottom() + m2509d(view);
        }

        /* renamed from: e */
        public int mo2184e(C0353z c0353z) {
            return 0;
        }

        /* renamed from: e */
        public void mo2516e(int i) {
            RecyclerView recyclerView = this.f2109b;
            if (recyclerView != null) {
                recyclerView.m2297f(i);
            }
        }

        /* renamed from: e */
        public void mo2117e(C0349v c0349v, C0353z c0353z) {
        }

        /* renamed from: e */
        void m2517e(RecyclerView recyclerView) {
            m2493b(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: f */
        public int m2518f(View view) {
            return view.getLeft() - m2532k(view);
        }

        /* renamed from: f */
        public int mo2186f(C0353z c0353z) {
            return 0;
        }

        /* renamed from: f */
        public void mo2519f(int i) {
        }

        /* renamed from: f */
        void m2520f(RecyclerView recyclerView) {
            int height;
            if (recyclerView == null) {
                this.f2109b = null;
                this.f2108a = null;
                height = 0;
                this.f2124q = 0;
            } else {
                this.f2109b = recyclerView;
                this.f2108a = recyclerView.f2024f;
                this.f2124q = recyclerView.getWidth();
                height = recyclerView.getHeight();
            }
            this.f2125r = height;
            this.f2122o = 1073741824;
            this.f2123p = 1073741824;
        }

        /* renamed from: f */
        public boolean m2521f() {
            RecyclerView recyclerView = this.f2109b;
            return recyclerView != null && recyclerView.f2028h;
        }

        /* renamed from: g */
        public int m2522g(View view) {
            Rect rect = ((C0343p) view.getLayoutParams()).f2133b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: g */
        public View m2523g() {
            View focusedChild;
            RecyclerView recyclerView = this.f2109b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f2108a.m2774c(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: g */
        public void m2524g(int i) {
            if (m2501c(i) != null) {
                this.f2108a.m2777e(i);
            }
        }

        /* renamed from: g */
        public void mo2119g(C0353z c0353z) {
        }

        /* renamed from: h */
        public int m2525h() {
            return this.f2125r;
        }

        /* renamed from: h */
        public int m2526h(View view) {
            Rect rect = ((C0343p) view.getLayoutParams()).f2133b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: i */
        public int m2527i() {
            return this.f2123p;
        }

        /* renamed from: i */
        public int m2528i(View view) {
            return view.getRight() + m2536m(view);
        }

        /* renamed from: j */
        public int m2529j() {
            return C3107q2.m14919k(this.f2109b);
        }

        /* renamed from: j */
        public int m2530j(View view) {
            return view.getTop() - m2538n(view);
        }

        /* renamed from: k */
        public int m2531k() {
            return C3107q2.m14920l(this.f2109b);
        }

        /* renamed from: k */
        public int m2532k(View view) {
            return ((C0343p) view.getLayoutParams()).f2133b.left;
        }

        /* renamed from: l */
        public int m2533l() {
            return C3107q2.m14921m(this.f2109b);
        }

        /* renamed from: l */
        public int m2534l(View view) {
            return ((C0343p) view.getLayoutParams()).m2556a();
        }

        /* renamed from: m */
        public int m2535m() {
            RecyclerView recyclerView = this.f2109b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: m */
        public int m2536m(View view) {
            return ((C0343p) view.getLayoutParams()).f2133b.right;
        }

        /* renamed from: n */
        public int m2537n() {
            RecyclerView recyclerView = this.f2109b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: n */
        public int m2538n(View view) {
            return ((C0343p) view.getLayoutParams()).f2133b.top;
        }

        /* renamed from: o */
        public int m2539o() {
            RecyclerView recyclerView = this.f2109b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* renamed from: o */
        public void m2540o(View view) {
            this.f2108a.m2776d(view);
        }

        /* renamed from: p */
        public int m2541p() {
            RecyclerView recyclerView = this.f2109b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: q */
        public int m2542q() {
            return this.f2124q;
        }

        /* renamed from: r */
        public int m2543r() {
            return this.f2122o;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: s */
        public boolean m2544s() {
            int m2514e = m2514e();
            for (int i = 0; i < m2514e; i++) {
                ViewGroup.LayoutParams layoutParams = m2501c(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: t */
        public boolean m2545t() {
            return this.f2116i;
        }

        /* renamed from: u */
        public boolean mo2190u() {
            return this.f2117j;
        }

        /* renamed from: v */
        public final boolean m2546v() {
            return this.f2119l;
        }

        /* renamed from: w */
        public boolean m2547w() {
            AbstractC0352y abstractC0352y = this.f2114g;
            return abstractC0352y != null && abstractC0352y.m2625c();
        }

        /* renamed from: x */
        public Parcelable mo2191x() {
            return null;
        }

        /* renamed from: y */
        public void m2548y() {
            RecyclerView recyclerView = this.f2109b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: z */
        public void m2549z() {
            this.f2115h = true;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    /* loaded from: classes.dex */
    public static class C0343p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        AbstractC0330c0 f2132a;

        /* renamed from: b */
        final Rect f2133b;

        /* renamed from: c */
        boolean f2134c;

        /* renamed from: d */
        boolean f2135d;

        public C0343p(int i, int i2) {
            super(i, i2);
            this.f2133b = new Rect();
            this.f2134c = true;
            this.f2135d = false;
        }

        public C0343p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2133b = new Rect();
            this.f2134c = true;
            this.f2135d = false;
        }

        public C0343p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2133b = new Rect();
            this.f2134c = true;
            this.f2135d = false;
        }

        public C0343p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2133b = new Rect();
            this.f2134c = true;
            this.f2135d = false;
        }

        public C0343p(C0343p c0343p) {
            super((ViewGroup.LayoutParams) c0343p);
            this.f2133b = new Rect();
            this.f2134c = true;
            this.f2135d = false;
        }

        /* renamed from: a */
        public int m2556a() {
            return this.f2132a.m2355i();
        }

        /* renamed from: b */
        public boolean m2557b() {
            return this.f2132a.m2365s();
        }

        /* renamed from: c */
        public boolean m2558c() {
            return this.f2132a.m2362p();
        }

        /* renamed from: d */
        public boolean m2559d() {
            return this.f2132a.m2360n();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    /* loaded from: classes.dex */
    public interface InterfaceC0344q {
        /* renamed from: a */
        void m2560a(View view);

        /* renamed from: b */
        void m2561b(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0345r {
        /* renamed from: a */
        public abstract boolean m2562a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    /* loaded from: classes.dex */
    public interface InterfaceC0346s {
        /* renamed from: a */
        void mo2563a(boolean z);

        /* renamed from: a */
        boolean mo2564a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: b */
        void mo2565b(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0347t {
        /* renamed from: a */
        public void m2566a(RecyclerView recyclerView, int i) {
        }

        /* renamed from: a */
        public void mo2567a(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    /* loaded from: classes.dex */
    public static class C0348u {

        /* renamed from: a */
        SparseArray<a> f2136a = new SparseArray<>();

        /* renamed from: b */
        private int f2137b = 0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.recyclerview.widget.RecyclerView$u$a */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            final ArrayList<AbstractC0330c0> f2138a = new ArrayList<>();

            /* renamed from: b */
            int f2139b = 5;

            /* renamed from: c */
            long f2140c = 0;

            /* renamed from: d */
            long f2141d = 0;

            a() {
            }
        }

        /* renamed from: b */
        private a m2568b(int i) {
            a aVar = this.f2136a.get(i);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f2136a.put(i, aVar2);
            return aVar2;
        }

        /* renamed from: a */
        long m2569a(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* renamed from: a */
        public AbstractC0330c0 m2570a(int i) {
            a aVar = this.f2136a.get(i);
            if (aVar == null || aVar.f2138a.isEmpty()) {
                return null;
            }
            return aVar.f2138a.remove(r2.size() - 1);
        }

        /* renamed from: a */
        void m2571a() {
            this.f2137b++;
        }

        /* renamed from: a */
        void m2572a(int i, long j) {
            a m2568b = m2568b(i);
            m2568b.f2141d = m2569a(m2568b.f2141d, j);
        }

        /* renamed from: a */
        public void m2573a(AbstractC0330c0 abstractC0330c0) {
            int m2354h = abstractC0330c0.m2354h();
            ArrayList<AbstractC0330c0> arrayList = m2568b(m2354h).f2138a;
            if (this.f2136a.get(m2354h).f2139b <= arrayList.size()) {
                return;
            }
            abstractC0330c0.m2367u();
            arrayList.add(abstractC0330c0);
        }

        /* renamed from: a */
        void m2574a(AbstractC0334g abstractC0334g, AbstractC0334g abstractC0334g2, boolean z) {
            if (abstractC0334g != null) {
                m2579c();
            }
            if (!z && this.f2137b == 0) {
                m2576b();
            }
            if (abstractC0334g2 != null) {
                m2571a();
            }
        }

        /* renamed from: a */
        boolean m2575a(int i, long j, long j2) {
            long j3 = m2568b(i).f2141d;
            return j3 == 0 || j + j3 < j2;
        }

        /* renamed from: b */
        public void m2576b() {
            for (int i = 0; i < this.f2136a.size(); i++) {
                this.f2136a.valueAt(i).f2138a.clear();
            }
        }

        /* renamed from: b */
        void m2577b(int i, long j) {
            a m2568b = m2568b(i);
            m2568b.f2140c = m2569a(m2568b.f2140c, j);
        }

        /* renamed from: b */
        boolean m2578b(int i, long j, long j2) {
            long j3 = m2568b(i).f2140c;
            return j3 == 0 || j + j3 < j2;
        }

        /* renamed from: c */
        void m2579c() {
            this.f2137b--;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    /* loaded from: classes.dex */
    public final class C0349v {

        /* renamed from: a */
        final ArrayList<AbstractC0330c0> f2142a = new ArrayList<>();

        /* renamed from: b */
        ArrayList<AbstractC0330c0> f2143b = null;

        /* renamed from: c */
        final ArrayList<AbstractC0330c0> f2144c = new ArrayList<>();

        /* renamed from: d */
        private final List<AbstractC0330c0> f2145d = Collections.unmodifiableList(this.f2142a);

        /* renamed from: e */
        private int f2146e = 2;

        /* renamed from: f */
        int f2147f = 2;

        /* renamed from: g */
        C0348u f2148g;

        /* renamed from: h */
        private AbstractC0326a0 f2149h;

        public C0349v() {
        }

        /* renamed from: a */
        private void m2580a(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m2580a((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        /* renamed from: a */
        private boolean m2581a(AbstractC0330c0 abstractC0330c0, int i, int i2, long j) {
            abstractC0330c0.f2093r = RecyclerView.this;
            int m2354h = abstractC0330c0.m2354h();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.f2148g.m2575a(m2354h, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.f2036l.m2400a((AbstractC0334g) abstractC0330c0, i);
            this.f2148g.m2572a(abstractC0330c0.m2354h(), RecyclerView.this.getNanoTime() - nanoTime);
            m2582e(abstractC0330c0);
            if (!RecyclerView.this.f2029h0.m2632d()) {
                return true;
            }
            abstractC0330c0.f2082g = i2;
            return true;
        }

        /* renamed from: e */
        private void m2582e(AbstractC0330c0 abstractC0330c0) {
            if (RecyclerView.this.m2313m()) {
                View view = abstractC0330c0.f2076a;
                if (C3107q2.m14917i(view) == 0) {
                    C3107q2.m14912f(view, 1);
                }
                if (C3107q2.m14927s(view)) {
                    return;
                }
                abstractC0330c0.m2338a(16384);
                C3107q2.m14897a(view, RecyclerView.this.f2043o0.m2865b());
            }
        }

        /* renamed from: f */
        private void m2583f(AbstractC0330c0 abstractC0330c0) {
            View view = abstractC0330c0.f2076a;
            if (view instanceof ViewGroup) {
                m2580a((ViewGroup) view, false);
            }
        }

        /* renamed from: a */
        public int m2584a(int i) {
            if (i >= 0 && i < RecyclerView.this.f2029h0.m2627a()) {
                return !RecyclerView.this.f2029h0.m2632d() ? i : RecyclerView.this.f2022e.m2752b(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.f2029h0.m2627a() + RecyclerView.this.m2306i());
        }

        /* renamed from: a */
        AbstractC0330c0 m2585a(int i, boolean z) {
            View m2771b;
            int size = this.f2142a.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC0330c0 abstractC0330c0 = this.f2142a.get(i2);
                if (!abstractC0330c0.m2372z() && abstractC0330c0.m2355i() == i && !abstractC0330c0.m2360n() && (RecyclerView.this.f2029h0.f2159h || !abstractC0330c0.m2362p())) {
                    abstractC0330c0.m2338a(32);
                    return abstractC0330c0;
                }
            }
            if (z || (m2771b = RecyclerView.this.f2024f.m2771b(i)) == null) {
                int size2 = this.f2144c.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    AbstractC0330c0 abstractC0330c02 = this.f2144c.get(i3);
                    if (!abstractC0330c02.m2360n() && abstractC0330c02.m2355i() == i) {
                        if (!z) {
                            this.f2144c.remove(i3);
                        }
                        return abstractC0330c02;
                    }
                }
                return null;
            }
            AbstractC0330c0 m2241k = RecyclerView.m2241k(m2771b);
            RecyclerView.this.f2024f.m2779f(m2771b);
            int m2770b = RecyclerView.this.f2024f.m2770b(m2771b);
            if (m2770b != -1) {
                RecyclerView.this.f2024f.m2764a(m2770b);
                m2606c(m2771b);
                m2241k.m2338a(8224);
                return m2241k;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + m2241k + RecyclerView.this.m2306i());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x018a  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x01a7  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x01ca  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0203  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0226 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0211  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x01d9  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.recyclerview.widget.RecyclerView.AbstractC0330c0 m2586a(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 615
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0349v.m2586a(int, boolean, long):androidx.recyclerview.widget.RecyclerView$c0");
        }

        /* renamed from: a */
        AbstractC0330c0 m2587a(long j, int i, boolean z) {
            for (int size = this.f2142a.size() - 1; size >= 0; size--) {
                AbstractC0330c0 abstractC0330c0 = this.f2142a.get(size);
                if (abstractC0330c0.m2353g() == j && !abstractC0330c0.m2372z()) {
                    if (i == abstractC0330c0.m2354h()) {
                        abstractC0330c0.m2338a(32);
                        if (abstractC0330c0.m2362p() && !RecyclerView.this.f2029h0.m2632d()) {
                            abstractC0330c0.m2339a(2, 14);
                        }
                        return abstractC0330c0;
                    }
                    if (!z) {
                        this.f2142a.remove(size);
                        RecyclerView.this.removeDetachedView(abstractC0330c0.f2076a, false);
                        m2591a(abstractC0330c0.f2076a);
                    }
                }
            }
            int size2 = this.f2144c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                AbstractC0330c0 abstractC0330c02 = this.f2144c.get(size2);
                if (abstractC0330c02.m2353g() == j) {
                    if (i == abstractC0330c02.m2354h()) {
                        if (!z) {
                            this.f2144c.remove(size2);
                        }
                        return abstractC0330c02;
                    }
                    if (!z) {
                        m2612e(size2);
                        return null;
                    }
                }
            }
        }

        /* renamed from: a */
        public void m2588a() {
            this.f2142a.clear();
            m2617i();
        }

        /* renamed from: a */
        void m2589a(int i, int i2) {
            int size = this.f2144c.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC0330c0 abstractC0330c0 = this.f2144c.get(i3);
                if (abstractC0330c0 != null && abstractC0330c0.f2078c >= i) {
                    abstractC0330c0.m2341a(i2, true);
                }
            }
        }

        /* renamed from: a */
        void m2590a(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f2144c.size() - 1; size >= 0; size--) {
                AbstractC0330c0 abstractC0330c0 = this.f2144c.get(size);
                if (abstractC0330c0 != null) {
                    int i4 = abstractC0330c0.f2078c;
                    if (i4 >= i3) {
                        abstractC0330c0.m2341a(-i2, z);
                    } else if (i4 >= i) {
                        abstractC0330c0.m2338a(8);
                        m2612e(size);
                    }
                }
            }
        }

        /* renamed from: a */
        void m2591a(View view) {
            AbstractC0330c0 m2241k = RecyclerView.m2241k(view);
            m2241k.f2089n = null;
            m2241k.f2090o = false;
            m2241k.m2349c();
            m2602b(m2241k);
        }

        /* renamed from: a */
        void m2592a(AbstractC0326a0 abstractC0326a0) {
            this.f2149h = abstractC0326a0;
        }

        /* renamed from: a */
        void m2593a(AbstractC0330c0 abstractC0330c0) {
            InterfaceC0350w interfaceC0350w = RecyclerView.this.f2040n;
            if (interfaceC0350w != null) {
                interfaceC0350w.m2619a(abstractC0330c0);
            }
            AbstractC0334g abstractC0334g = RecyclerView.this.f2036l;
            if (abstractC0334g != null) {
                abstractC0334g.m2414d(abstractC0330c0);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f2029h0 != null) {
                recyclerView.f2026g.m2909h(abstractC0330c0);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m2594a(AbstractC0330c0 abstractC0330c0, boolean z) {
            RecyclerView.m2239e(abstractC0330c0);
            if (abstractC0330c0.m2348b(16384)) {
                abstractC0330c0.m2339a(0, 16384);
                C3107q2.m14897a(abstractC0330c0.f2076a, (C3508z1) null);
            }
            if (z) {
                m2593a(abstractC0330c0);
            }
            abstractC0330c0.f2093r = null;
            m2609d().m2573a(abstractC0330c0);
        }

        /* renamed from: a */
        void m2595a(AbstractC0334g abstractC0334g, AbstractC0334g abstractC0334g2, boolean z) {
            m2588a();
            m2609d().m2574a(abstractC0334g, abstractC0334g2, z);
        }

        /* renamed from: a */
        void m2596a(C0348u c0348u) {
            C0348u c0348u2 = this.f2148g;
            if (c0348u2 != null) {
                c0348u2.m2579c();
            }
            this.f2148g = c0348u;
            if (c0348u == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f2148g.m2571a();
        }

        /* renamed from: b */
        View m2597b(int i, boolean z) {
            return m2586a(i, z, Long.MAX_VALUE).f2076a;
        }

        /* renamed from: b */
        AbstractC0330c0 m2598b(int i) {
            int size;
            int m2752b;
            ArrayList<AbstractC0330c0> arrayList = this.f2143b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    AbstractC0330c0 abstractC0330c0 = this.f2143b.get(i2);
                    if (!abstractC0330c0.m2372z() && abstractC0330c0.m2355i() == i) {
                        abstractC0330c0.m2338a(32);
                        return abstractC0330c0;
                    }
                }
                if (RecyclerView.this.f2036l.m2411b() && (m2752b = RecyclerView.this.f2022e.m2752b(i)) > 0 && m2752b < RecyclerView.this.f2036l.mo2397a()) {
                    long m2398a = RecyclerView.this.f2036l.m2398a(m2752b);
                    for (int i3 = 0; i3 < size; i3++) {
                        AbstractC0330c0 abstractC0330c02 = this.f2143b.get(i3);
                        if (!abstractC0330c02.m2372z() && abstractC0330c02.m2353g() == m2398a) {
                            abstractC0330c02.m2338a(32);
                            return abstractC0330c02;
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: b */
        void m2599b() {
            int size = this.f2144c.size();
            for (int i = 0; i < size; i++) {
                this.f2144c.get(i).m2337a();
            }
            int size2 = this.f2142a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f2142a.get(i2).m2337a();
            }
            ArrayList<AbstractC0330c0> arrayList = this.f2143b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f2143b.get(i3).m2337a();
                }
            }
        }

        /* renamed from: b */
        void m2600b(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i3 = -1;
                i5 = i;
                i4 = i2;
            } else {
                i3 = 1;
                i4 = i;
                i5 = i2;
            }
            int size = this.f2144c.size();
            for (int i7 = 0; i7 < size; i7++) {
                AbstractC0330c0 abstractC0330c0 = this.f2144c.get(i7);
                if (abstractC0330c0 != null && (i6 = abstractC0330c0.f2078c) >= i5 && i6 <= i4) {
                    if (i6 == i) {
                        abstractC0330c0.m2341a(i2 - i, false);
                    } else {
                        abstractC0330c0.m2341a(i3, false);
                    }
                }
            }
        }

        /* renamed from: b */
        public void m2601b(View view) {
            AbstractC0330c0 m2241k = RecyclerView.m2241k(view);
            if (m2241k.m2364r()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (m2241k.m2363q()) {
                m2241k.m2371y();
            } else if (m2241k.m2372z()) {
                m2241k.m2349c();
            }
            m2602b(m2241k);
        }

        /* renamed from: b */
        void m2602b(AbstractC0330c0 abstractC0330c0) {
            boolean z;
            boolean z2 = true;
            if (abstractC0330c0.m2363q() || abstractC0330c0.f2076a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(abstractC0330c0.m2363q());
                sb.append(" isAttached:");
                sb.append(abstractC0330c0.f2076a.getParent() != null);
                sb.append(RecyclerView.this.m2306i());
                throw new IllegalArgumentException(sb.toString());
            }
            if (abstractC0330c0.m2364r()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + abstractC0330c0 + RecyclerView.this.m2306i());
            }
            if (abstractC0330c0.m2370x()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.m2306i());
            }
            boolean m2351e = abstractC0330c0.m2351e();
            AbstractC0334g abstractC0334g = RecyclerView.this.f2036l;
            if ((abstractC0334g != null && m2351e && abstractC0334g.m2404a((AbstractC0334g) abstractC0330c0)) || abstractC0330c0.m2361o()) {
                if (this.f2147f <= 0 || abstractC0330c0.m2348b(526)) {
                    z = false;
                } else {
                    int size = this.f2144c.size();
                    if (size >= this.f2147f && size > 0) {
                        m2612e(0);
                        size--;
                    }
                    if (RecyclerView.f1986D0 && size > 0 && !RecyclerView.this.f2027g0.m2835a(abstractC0330c0.f2078c)) {
                        int i = size - 1;
                        while (i >= 0) {
                            if (!RecyclerView.this.f2027g0.m2835a(this.f2144c.get(i).f2078c)) {
                                break;
                            } else {
                                i--;
                            }
                        }
                        size = i + 1;
                    }
                    this.f2144c.add(size, abstractC0330c0);
                    z = true;
                }
                if (!z) {
                    m2594a(abstractC0330c0, true);
                    r1 = z;
                    RecyclerView.this.f2026g.m2909h(abstractC0330c0);
                    if (r1 && !z2 && m2351e) {
                        abstractC0330c0.f2093r = null;
                        return;
                    }
                    return;
                }
                r1 = z;
            }
            z2 = false;
            RecyclerView.this.f2026g.m2909h(abstractC0330c0);
            if (r1) {
            }
        }

        /* renamed from: c */
        View m2603c(int i) {
            return this.f2142a.get(i).f2076a;
        }

        /* renamed from: c */
        void m2604c() {
            this.f2142a.clear();
            ArrayList<AbstractC0330c0> arrayList = this.f2143b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* renamed from: c */
        void m2605c(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f2144c.size() - 1; size >= 0; size--) {
                AbstractC0330c0 abstractC0330c0 = this.f2144c.get(size);
                if (abstractC0330c0 != null && (i3 = abstractC0330c0.f2078c) >= i && i3 < i4) {
                    abstractC0330c0.m2338a(2);
                    m2612e(size);
                }
            }
        }

        /* renamed from: c */
        void m2606c(View view) {
            ArrayList<AbstractC0330c0> arrayList;
            AbstractC0330c0 m2241k = RecyclerView.m2241k(view);
            if (!m2241k.m2348b(12) && m2241k.m2365s() && !RecyclerView.this.m2269a(m2241k)) {
                if (this.f2143b == null) {
                    this.f2143b = new ArrayList<>();
                }
                m2241k.m2342a(this, true);
                arrayList = this.f2143b;
            } else {
                if (m2241k.m2360n() && !m2241k.m2362p() && !RecyclerView.this.f2036l.m2411b()) {
                    throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.m2306i());
                }
                m2241k.m2342a(this, false);
                arrayList = this.f2142a;
            }
            arrayList.add(m2241k);
        }

        /* renamed from: c */
        void m2607c(AbstractC0330c0 abstractC0330c0) {
            (abstractC0330c0.f2090o ? this.f2143b : this.f2142a).remove(abstractC0330c0);
            abstractC0330c0.f2089n = null;
            abstractC0330c0.f2090o = false;
            abstractC0330c0.m2349c();
        }

        /* renamed from: d */
        public View m2608d(int i) {
            return m2597b(i, false);
        }

        /* renamed from: d */
        C0348u m2609d() {
            if (this.f2148g == null) {
                this.f2148g = new C0348u();
            }
            return this.f2148g;
        }

        /* renamed from: d */
        boolean m2610d(AbstractC0330c0 abstractC0330c0) {
            if (abstractC0330c0.m2362p()) {
                return RecyclerView.this.f2029h0.m2632d();
            }
            int i = abstractC0330c0.f2078c;
            if (i >= 0 && i < RecyclerView.this.f2036l.mo2397a()) {
                if (RecyclerView.this.f2029h0.m2632d() || RecyclerView.this.f2036l.m2405b(abstractC0330c0.f2078c) == abstractC0330c0.m2354h()) {
                    return !RecyclerView.this.f2036l.m2411b() || abstractC0330c0.m2353g() == RecyclerView.this.f2036l.m2398a(abstractC0330c0.f2078c);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC0330c0 + RecyclerView.this.m2306i());
        }

        /* renamed from: e */
        int m2611e() {
            return this.f2142a.size();
        }

        /* renamed from: e */
        void m2612e(int i) {
            m2594a(this.f2144c.get(i), true);
            this.f2144c.remove(i);
        }

        /* renamed from: f */
        public List<AbstractC0330c0> m2613f() {
            return this.f2145d;
        }

        /* renamed from: f */
        public void m2614f(int i) {
            this.f2146e = i;
            m2618j();
        }

        /* renamed from: g */
        void m2615g() {
            int size = this.f2144c.size();
            for (int i = 0; i < size; i++) {
                C0343p c0343p = (C0343p) this.f2144c.get(i).f2076a.getLayoutParams();
                if (c0343p != null) {
                    c0343p.f2134c = true;
                }
            }
        }

        /* renamed from: h */
        void m2616h() {
            int size = this.f2144c.size();
            for (int i = 0; i < size; i++) {
                AbstractC0330c0 abstractC0330c0 = this.f2144c.get(i);
                if (abstractC0330c0 != null) {
                    abstractC0330c0.m2338a(6);
                    abstractC0330c0.m2344a((Object) null);
                }
            }
            AbstractC0334g abstractC0334g = RecyclerView.this.f2036l;
            if (abstractC0334g == null || !abstractC0334g.m2411b()) {
                m2617i();
            }
        }

        /* renamed from: i */
        void m2617i() {
            for (int size = this.f2144c.size() - 1; size >= 0; size--) {
                m2612e(size);
            }
            this.f2144c.clear();
            if (RecyclerView.f1986D0) {
                RecyclerView.this.f2027g0.m2833a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: j */
        public void m2618j() {
            AbstractC0342o abstractC0342o = RecyclerView.this.f2038m;
            this.f2147f = this.f2146e + (abstractC0342o != null ? abstractC0342o.f2120m : 0);
            for (int size = this.f2144c.size() - 1; size >= 0 && this.f2144c.size() > this.f2147f; size--) {
                m2612e(size);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    /* loaded from: classes.dex */
    public interface InterfaceC0350w {
        /* renamed from: a */
        void m2619a(AbstractC0330c0 abstractC0330c0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    /* loaded from: classes.dex */
    public class C0351x extends AbstractC0336i {
        C0351x() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0336i
        /* renamed from: a */
        public void mo2416a() {
            RecyclerView.this.m2263a((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f2029h0.f2158g = true;
            recyclerView.m2280b(true);
            if (RecyclerView.this.f2022e.m2754c()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0352y {
        /* renamed from: a */
        public abstract int m2620a();

        /* renamed from: a */
        public abstract void m2621a(int i);

        /* renamed from: a */
        abstract void m2622a(int i, int i2);

        /* renamed from: a */
        protected abstract void m2623a(View view);

        /* renamed from: b */
        public abstract boolean m2624b();

        /* renamed from: c */
        public abstract boolean m2625c();

        /* renamed from: d */
        protected final void m2626d() {
            throw null;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    /* loaded from: classes.dex */
    public static class C0353z {

        /* renamed from: b */
        private SparseArray<Object> f2153b;

        /* renamed from: m */
        int f2164m;

        /* renamed from: n */
        long f2165n;

        /* renamed from: o */
        int f2166o;

        /* renamed from: p */
        int f2167p;

        /* renamed from: q */
        int f2168q;

        /* renamed from: a */
        int f2152a = -1;

        /* renamed from: c */
        int f2154c = 0;

        /* renamed from: d */
        int f2155d = 0;

        /* renamed from: e */
        int f2156e = 1;

        /* renamed from: f */
        int f2157f = 0;

        /* renamed from: g */
        boolean f2158g = false;

        /* renamed from: h */
        boolean f2159h = false;

        /* renamed from: i */
        boolean f2160i = false;

        /* renamed from: j */
        boolean f2161j = false;

        /* renamed from: k */
        boolean f2162k = false;

        /* renamed from: l */
        boolean f2163l = false;

        /* renamed from: a */
        public int m2627a() {
            return this.f2159h ? this.f2154c - this.f2155d : this.f2157f;
        }

        /* renamed from: a */
        void m2628a(int i) {
            if ((this.f2156e & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f2156e));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m2629a(AbstractC0334g abstractC0334g) {
            this.f2156e = 1;
            this.f2157f = abstractC0334g.mo2397a();
            this.f2159h = false;
            this.f2160i = false;
            this.f2161j = false;
        }

        /* renamed from: b */
        public int m2630b() {
            return this.f2152a;
        }

        /* renamed from: c */
        public boolean m2631c() {
            return this.f2152a != -1;
        }

        /* renamed from: d */
        public boolean m2632d() {
            return this.f2159h;
        }

        /* renamed from: e */
        public boolean m2633e() {
            return this.f2163l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f2152a + ", mData=" + this.f2153b + ", mItemCount=" + this.f2157f + ", mIsMeasuring=" + this.f2161j + ", mPreviousLayoutItemCount=" + this.f2154c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2155d + ", mStructureChanged=" + this.f2158g + ", mInPreLayout=" + this.f2159h + ", mRunSimpleAnimations=" + this.f2162k + ", mRunPredictiveAnimations=" + this.f2163l + '}';
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f1984B0 = i == 18 || i == 19 || i == 20;
        f1985C0 = Build.VERSION.SDK_INT >= 23;
        int i2 = Build.VERSION.SDK_INT;
        f1986D0 = Build.VERSION.SDK_INT >= 21;
        f1987E0 = Build.VERSION.SDK_INT <= 15;
        f1988F0 = Build.VERSION.SDK_INT <= 15;
        Class<?> cls = Integer.TYPE;
        f1989G0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f1990H0 = new InterpolatorC0329c();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2016b = new C0351x();
        this.f2018c = new C0349v();
        this.f2026g = new C0372m();
        new RunnableC0325a();
        this.f2030i = new Rect();
        this.f2032j = new Rect();
        this.f2034k = new RectF();
        this.f2042o = new ArrayList<>();
        this.f2044p = new ArrayList<>();
        this.f2056v = 0;
        this.f1995D = false;
        this.f1996E = false;
        this.f1997F = 0;
        this.f1998G = 0;
        this.f1999H = new C0338k();
        this.f2004M = new C0362c();
        this.f2005N = 0;
        this.f2006O = -1;
        this.f2017b0 = Float.MIN_VALUE;
        this.f2019c0 = Float.MIN_VALUE;
        boolean z = true;
        this.f2021d0 = true;
        this.f2023e0 = new RunnableC0328b0();
        this.f2027g0 = f1986D0 ? new RunnableC0364e.b() : null;
        this.f2029h0 = new C0353z();
        this.f2035k0 = false;
        this.f2037l0 = false;
        this.f2039m0 = new C0340m();
        this.f2041n0 = false;
        this.f2047q0 = new int[2];
        this.f2051s0 = new int[2];
        this.f2053t0 = new int[2];
        this.f2055u0 = new int[2];
        this.f2057v0 = new int[2];
        this.f2059w0 = new ArrayList();
        this.f2061x0 = new RunnableC0327b();
        this.f2063y0 = new C0331d();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1983A0, i, 0);
            this.f2028h = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f2028h = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2012U = viewConfiguration.getScaledTouchSlop();
        this.f2017b0 = C3149r2.m15170b(viewConfiguration, context);
        this.f2019c0 = C3149r2.m15172c(viewConfiguration, context);
        this.f2014W = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2015a0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f2004M.m2423a(this.f2039m0);
        m2311k();
        m2212G();
        m2211F();
        if (C3107q2.m14917i(this) == 0) {
            C3107q2.m14912f(this, 1);
        }
        this.f1993B = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0368i(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.RecyclerView, i, 0);
            String string = obtainStyledAttributes2.getString(R$styleable.RecyclerView_layoutManager);
            if (obtainStyledAttributes2.getInt(R$styleable.RecyclerView_android_descendantFocusability, -1) == -1) {
                setDescendantFocusability(262144);
            }
            boolean z2 = obtainStyledAttributes2.getBoolean(R$styleable.RecyclerView_fastScrollEnabled, false);
            this.f2052t = z2;
            if (z2) {
                m2254a((StateListDrawable) obtainStyledAttributes2.getDrawable(R$styleable.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes2.getDrawable(R$styleable.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes2.getDrawable(R$styleable.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes2.getDrawable(R$styleable.RecyclerView_fastScrollHorizontalTrackDrawable));
            }
            obtainStyledAttributes2.recycle();
            m2224a(context, string, attributeSet, i, 0);
            if (Build.VERSION.SDK_INT >= 21) {
                TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f1991z0, i, 0);
                boolean z3 = obtainStyledAttributes3.getBoolean(0, true);
                obtainStyledAttributes3.recycle();
                z = z3;
            }
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z);
    }

    /* renamed from: A */
    private void m2206A() {
        this.f2029h0.m2628a(1);
        m2262a(this.f2029h0);
        this.f2029h0.f2161j = false;
        m2323w();
        this.f2026g.m2895a();
        m2317q();
        m2214I();
        m2219N();
        C0353z c0353z = this.f2029h0;
        c0353z.f2160i = c0353z.f2162k && this.f2037l0;
        this.f2037l0 = false;
        this.f2035k0 = false;
        C0353z c0353z2 = this.f2029h0;
        c0353z2.f2159h = c0353z2.f2163l;
        c0353z2.f2157f = this.f2036l.mo2397a();
        m2232a(this.f2047q0);
        if (this.f2029h0.f2162k) {
            int m2763a = this.f2024f.m2763a();
            for (int i = 0; i < m2763a; i++) {
                AbstractC0330c0 m2241k = m2241k(this.f2024f.m2772c(i));
                if (!m2241k.m2370x() && (!m2241k.m2360n() || this.f2036l.m2411b())) {
                    this.f2026g.m2903c(m2241k, this.f2004M.m2421a(this.f2029h0, m2241k, AbstractC0339l.m2419e(m2241k), m2241k.m2357k()));
                    if (this.f2029h0.f2160i && m2241k.m2365s() && !m2241k.m2362p() && !m2241k.m2370x() && !m2241k.m2360n()) {
                        this.f2026g.m2896a(m2281c(m2241k), m2241k);
                    }
                }
            }
        }
        if (this.f2029h0.f2163l) {
            m2322v();
            C0353z c0353z3 = this.f2029h0;
            boolean z = c0353z3.f2158g;
            c0353z3.f2158g = false;
            this.f2038m.mo2117e(this.f2018c, c0353z3);
            this.f2029h0.f2158g = z;
            for (int i2 = 0; i2 < this.f2024f.m2763a(); i2++) {
                AbstractC0330c0 m2241k2 = m2241k(this.f2024f.m2772c(i2));
                if (!m2241k2.m2370x() && !this.f2026g.m2904c(m2241k2)) {
                    int m2419e = AbstractC0339l.m2419e(m2241k2);
                    boolean m2348b = m2241k2.m2348b(8192);
                    if (!m2348b) {
                        m2419e |= 4096;
                    }
                    AbstractC0339l.c m2421a = this.f2004M.m2421a(this.f2029h0, m2241k2, m2419e, m2241k2.m2357k());
                    if (m2348b) {
                        m2256a(m2241k2, m2421a);
                    } else {
                        this.f2026g.m2898a(m2241k2, m2421a);
                    }
                }
            }
        }
        m2248a();
        m2318r();
        m2286c(false);
        this.f2029h0.f2156e = 2;
    }

    /* renamed from: B */
    private void m2207B() {
        m2323w();
        m2317q();
        this.f2029h0.m2628a(6);
        this.f2022e.m2753b();
        this.f2029h0.f2157f = this.f2036l.mo2397a();
        C0353z c0353z = this.f2029h0;
        c0353z.f2155d = 0;
        c0353z.f2159h = false;
        this.f2038m.mo2117e(this.f2018c, c0353z);
        C0353z c0353z2 = this.f2029h0;
        c0353z2.f2158g = false;
        this.f2020d = null;
        c0353z2.f2162k = c0353z2.f2162k && this.f2004M != null;
        this.f2029h0.f2156e = 4;
        m2318r();
        m2286c(false);
    }

    /* renamed from: C */
    private void m2208C() {
        this.f2029h0.m2628a(4);
        m2323w();
        m2317q();
        C0353z c0353z = this.f2029h0;
        c0353z.f2156e = 1;
        if (c0353z.f2162k) {
            for (int m2763a = this.f2024f.m2763a() - 1; m2763a >= 0; m2763a--) {
                AbstractC0330c0 m2241k = m2241k(this.f2024f.m2772c(m2763a));
                if (!m2241k.m2370x()) {
                    long m2281c = m2281c(m2241k);
                    AbstractC0339l.c m2420a = this.f2004M.m2420a(this.f2029h0, m2241k);
                    AbstractC0330c0 m2894a = this.f2026g.m2894a(m2281c);
                    if (m2894a != null && !m2894a.m2370x()) {
                        boolean m2902b = this.f2026g.m2902b(m2894a);
                        boolean m2902b2 = this.f2026g.m2902b(m2241k);
                        if (!m2902b || m2894a != m2241k) {
                            AbstractC0339l.c m2907f = this.f2026g.m2907f(m2894a);
                            this.f2026g.m2901b(m2241k, m2420a);
                            AbstractC0339l.c m2906e = this.f2026g.m2906e(m2241k);
                            if (m2907f == null) {
                                m2223a(m2281c, m2241k, m2894a);
                            } else {
                                m2227a(m2894a, m2241k, m2907f, m2906e, m2902b, m2902b2);
                            }
                        }
                    }
                    this.f2026g.m2901b(m2241k, m2420a);
                }
            }
            this.f2026g.m2899a(this.f2063y0);
        }
        this.f2038m.m2505c(this.f2018c);
        C0353z c0353z2 = this.f2029h0;
        c0353z2.f2154c = c0353z2.f2157f;
        this.f1995D = false;
        this.f1996E = false;
        c0353z2.f2162k = false;
        c0353z2.f2163l = false;
        this.f2038m.f2115h = false;
        ArrayList<AbstractC0330c0> arrayList = this.f2018c.f2143b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC0342o abstractC0342o = this.f2038m;
        if (abstractC0342o.f2121n) {
            abstractC0342o.f2120m = 0;
            abstractC0342o.f2121n = false;
            this.f2018c.m2618j();
        }
        this.f2038m.mo2119g(this.f2029h0);
        m2318r();
        m2286c(false);
        this.f2026g.m2895a();
        int[] iArr = this.f2047q0;
        if (m2242k(iArr[0], iArr[1])) {
            m2289d(0, 0);
        }
        m2215J();
        m2217L();
    }

    /* renamed from: D */
    private View m2209D() {
        AbstractC0330c0 m2283c;
        int i = this.f2029h0.f2164m;
        if (i == -1) {
            i = 0;
        }
        int m2627a = this.f2029h0.m2627a();
        for (int i2 = i; i2 < m2627a; i2++) {
            AbstractC0330c0 m2283c2 = m2283c(i2);
            if (m2283c2 == null) {
                break;
            }
            if (m2283c2.f2076a.hasFocusable()) {
                return m2283c2.f2076a;
            }
        }
        int min = Math.min(m2627a, i);
        do {
            min--;
            if (min < 0 || (m2283c = m2283c(min)) == null) {
                return null;
            }
        } while (!m2283c.f2076a.hasFocusable());
        return m2283c.f2076a;
    }

    /* renamed from: E */
    private boolean m2210E() {
        int m2763a = this.f2024f.m2763a();
        for (int i = 0; i < m2763a; i++) {
            AbstractC0330c0 m2241k = m2241k(this.f2024f.m2772c(i));
            if (m2241k != null && !m2241k.m2370x() && m2241k.m2365s()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: F */
    private void m2211F() {
        if (C3107q2.m14918j(this) == 0) {
            C3107q2.m14914g(this, 8);
        }
    }

    /* renamed from: G */
    private void m2212G() {
        this.f2024f = new C0361b(new C0332e());
    }

    /* renamed from: H */
    private boolean m2213H() {
        return this.f2004M != null && this.f2038m.mo2095C();
    }

    /* renamed from: I */
    private void m2214I() {
        if (this.f1995D) {
            this.f2022e.m2758f();
            if (this.f1996E) {
                this.f2038m.mo2116d(this);
            }
        }
        if (m2213H()) {
            this.f2022e.m2757e();
        } else {
            this.f2022e.m2753b();
        }
        boolean z = false;
        boolean z2 = this.f2035k0 || this.f2037l0;
        this.f2029h0.f2162k = this.f2054u && this.f2004M != null && (this.f1995D || z2 || this.f2038m.f2115h) && (!this.f1995D || this.f2036l.m2411b());
        C0353z c0353z = this.f2029h0;
        if (c0353z.f2162k && z2 && !this.f1995D && m2213H()) {
            z = true;
        }
        c0353z.f2163l = z;
    }

    /* renamed from: J */
    private void m2215J() {
        View findViewById;
        if (!this.f2021d0 || this.f2036l == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!f1988F0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f2024f.m2774c(focusedChild)) {
                    return;
                }
            } else if (this.f2024f.m2763a() == 0) {
                requestFocus();
                return;
            }
        }
        View view = null;
        AbstractC0330c0 m2247a = (this.f2029h0.f2165n == -1 || !this.f2036l.m2411b()) ? null : m2247a(this.f2029h0.f2165n);
        if (m2247a != null && !this.f2024f.m2774c(m2247a.f2076a) && m2247a.f2076a.hasFocusable()) {
            view = m2247a.f2076a;
        } else if (this.f2024f.m2763a() > 0) {
            view = m2209D();
        }
        if (view != null) {
            int i = this.f2029h0.f2166o;
            if (i != -1 && (findViewById = view.findViewById(i)) != null && findViewById.isFocusable()) {
                view = findViewById;
            }
            view.requestFocus();
        }
    }

    /* renamed from: K */
    private void m2216K() {
        boolean z;
        EdgeEffect edgeEffect = this.f2000I;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f2000I.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f2001J;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f2001J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2002K;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f2002K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2003L;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f2003L.isFinished();
        }
        if (z) {
            C3107q2.m14877A(this);
        }
    }

    /* renamed from: L */
    private void m2217L() {
        C0353z c0353z = this.f2029h0;
        c0353z.f2165n = -1L;
        c0353z.f2164m = -1;
        c0353z.f2166o = -1;
    }

    /* renamed from: M */
    private void m2218M() {
        VelocityTracker velocityTracker = this.f2007P;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        mo1525a(0);
        m2216K();
    }

    /* renamed from: N */
    private void m2219N() {
        View focusedChild = (this.f2021d0 && hasFocus() && this.f2036l != null) ? getFocusedChild() : null;
        AbstractC0330c0 m2287d = focusedChild != null ? m2287d(focusedChild) : null;
        if (m2287d == null) {
            m2217L();
            return;
        }
        this.f2029h0.f2165n = this.f2036l.m2411b() ? m2287d.m2353g() : -1L;
        this.f2029h0.f2164m = this.f1995D ? -1 : m2287d.m2362p() ? m2287d.f2079d : m2287d.m2352f();
        this.f2029h0.f2166o = m2243l(m2287d.f2076a);
    }

    /* renamed from: O */
    private void m2220O() {
        this.f2023e0.m2335b();
        AbstractC0342o abstractC0342o = this.f2038m;
        if (abstractC0342o != null) {
            abstractC0342o.m2460B();
        }
    }

    /* renamed from: a */
    private String m2221a(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m2222a(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L21
            r6.m2296f()
            android.widget.EdgeEffect r3 = r6.f2000I
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
        L1c:
            androidx.core.widget.C0252d.m1579a(r3, r4, r9)
            r9 = 1
            goto L39
        L21:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L38
            r6.m2299g()
            android.widget.EdgeEffect r3 = r6.f2002K
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            goto L1c
        L38:
            r9 = 0
        L39:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L53
            r6.m2303h()
            android.widget.EdgeEffect r9 = r6.f2001J
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.C0252d.m1579a(r9, r0, r7)
            goto L6f
        L53:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L6e
            r6.m2292e()
            android.widget.EdgeEffect r9 = r6.f2003L
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.C0252d.m1579a(r9, r3, r0)
            goto L6f
        L6e:
            r1 = r9
        L6f:
            if (r1 != 0) goto L79
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L79
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L7c
        L79:
            p000.C3107q2.m14877A(r6)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m2222a(float, float, float, float):void");
    }

    /* renamed from: a */
    private void m2223a(long j, AbstractC0330c0 abstractC0330c0, AbstractC0330c0 abstractC0330c02) {
        int m2763a = this.f2024f.m2763a();
        for (int i = 0; i < m2763a; i++) {
            AbstractC0330c0 m2241k = m2241k(this.f2024f.m2772c(i));
            if (m2241k != abstractC0330c0 && m2281c(m2241k) == j) {
                AbstractC0334g abstractC0334g = this.f2036l;
                if (abstractC0334g == null || !abstractC0334g.m2411b()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + m2241k + " \n View Holder 2:" + abstractC0330c0 + m2306i());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + m2241k + " \n View Holder 2:" + abstractC0330c0 + m2306i());
            }
        }
        String str = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC0330c02 + " cannot be found but it is necessary for " + abstractC0330c0 + m2306i();
    }

    /* renamed from: a */
    private void m2224a(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String m2221a = m2221a(context, trim);
            try {
                Class<? extends U> asSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(m2221a).asSubclass(AbstractC0342o.class);
                Object[] objArr = null;
                try {
                    constructor = asSubclass.getConstructor(f1989G0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                } catch (NoSuchMethodException e) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + m2221a, e2);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((AbstractC0342o) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + m2221a, e3);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + m2221a, e4);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + m2221a, e5);
            } catch (InstantiationException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + m2221a, e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + m2221a, e7);
            }
        }
    }

    /* renamed from: a */
    static void m2225a(View view, Rect rect) {
        C0343p c0343p = (C0343p) view.getLayoutParams();
        Rect rect2 = c0343p.f2133b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0343p).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0343p).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0343p).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0343p).bottomMargin);
    }

    /* renamed from: a */
    private void m2226a(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f2030i.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0343p) {
            C0343p c0343p = (C0343p) layoutParams;
            if (!c0343p.f2134c) {
                Rect rect = c0343p.f2133b;
                Rect rect2 = this.f2030i;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f2030i);
            offsetRectIntoDescendantCoords(view, this.f2030i);
        }
        this.f2038m.m2488a(this, view, this.f2030i, !this.f2054u, view2 == null);
    }

    /* renamed from: a */
    private void m2227a(AbstractC0330c0 abstractC0330c0, AbstractC0330c0 abstractC0330c02, AbstractC0339l.c cVar, AbstractC0339l.c cVar2, boolean z, boolean z2) {
        abstractC0330c0.m2345a(false);
        if (z) {
            m2238d(abstractC0330c0);
        }
        if (abstractC0330c0 != abstractC0330c02) {
            if (z2) {
                m2238d(abstractC0330c02);
            }
            abstractC0330c0.f2083h = abstractC0330c02;
            m2238d(abstractC0330c0);
            this.f2018c.m2607c(abstractC0330c0);
            abstractC0330c02.m2345a(false);
            abstractC0330c02.f2084i = abstractC0330c0;
        }
        if (this.f2004M.mo2425a(abstractC0330c0, abstractC0330c02, cVar, cVar2)) {
            m2319s();
        }
    }

    /* renamed from: a */
    private void m2228a(AbstractC0334g abstractC0334g, boolean z, boolean z2) {
        AbstractC0334g abstractC0334g2 = this.f2036l;
        if (abstractC0334g2 != null) {
            abstractC0334g2.m2409b(this.f2016b);
            this.f2036l.m2410b(this);
        }
        if (!z || z2) {
            m2320t();
        }
        this.f2022e.m2758f();
        AbstractC0334g abstractC0334g3 = this.f2036l;
        this.f2036l = abstractC0334g;
        if (abstractC0334g != null) {
            abstractC0334g.m2402a(this.f2016b);
            abstractC0334g.m2403a(this);
        }
        AbstractC0342o abstractC0342o = this.f2038m;
        if (abstractC0342o != null) {
            abstractC0342o.m2473a(abstractC0334g3, this.f2036l);
        }
        this.f2018c.m2595a(abstractC0334g3, this.f2036l, z);
        this.f2029h0.f2158g = true;
    }

    /* renamed from: a */
    private void m2232a(int[] iArr) {
        int m2763a = this.f2024f.m2763a();
        if (m2763a == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < m2763a; i3++) {
            AbstractC0330c0 m2241k = m2241k(this.f2024f.m2772c(i3));
            if (!m2241k.m2370x()) {
                int m2355i = m2241k.m2355i();
                if (m2355i < i) {
                    i = m2355i;
                }
                if (m2355i > i2) {
                    i2 = m2355i;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: a */
    private boolean m2233a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        InterfaceC0346s interfaceC0346s = this.f2046q;
        if (interfaceC0346s != null) {
            if (action != 0) {
                interfaceC0346s.mo2565b(this, motionEvent);
                if (action == 3 || action == 1) {
                    this.f2046q = null;
                }
                return true;
            }
            this.f2046q = null;
        }
        if (action != 0) {
            int size = this.f2044p.size();
            for (int i = 0; i < size; i++) {
                InterfaceC0346s interfaceC0346s2 = this.f2044p.get(i);
                if (interfaceC0346s2.mo2564a(this, motionEvent)) {
                    this.f2046q = interfaceC0346s2;
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m2234a(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || m2282c(view2) == null) {
            return false;
        }
        if (view == null || m2282c(view) == null) {
            return true;
        }
        this.f2030i.set(0, 0, view.getWidth(), view.getHeight());
        this.f2032j.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f2030i);
        offsetDescendantRectToMyCoords(view2, this.f2032j);
        char c = 65535;
        int i3 = this.f2038m.m2529j() == 1 ? -1 : 1;
        Rect rect = this.f2030i;
        int i4 = rect.left;
        int i5 = this.f2032j.left;
        if ((i4 < i5 || rect.right <= i5) && this.f2030i.right < this.f2032j.right) {
            i2 = 1;
        } else {
            Rect rect2 = this.f2030i;
            int i6 = rect2.right;
            int i7 = this.f2032j.right;
            i2 = ((i6 > i7 || rect2.left >= i7) && this.f2030i.left > this.f2032j.left) ? -1 : 0;
        }
        Rect rect3 = this.f2030i;
        int i8 = rect3.top;
        int i9 = this.f2032j.top;
        if ((i8 < i9 || rect3.bottom <= i9) && this.f2030i.bottom < this.f2032j.bottom) {
            c = 1;
        } else {
            Rect rect4 = this.f2030i;
            int i10 = rect4.bottom;
            int i11 = this.f2032j.bottom;
            if ((i10 <= i11 && rect4.top < i11) || this.f2030i.top <= this.f2032j.top) {
                c = 0;
            }
        }
        if (i == 1) {
            return c < 0 || (c == 0 && i2 * i3 <= 0);
        }
        if (i == 2) {
            return c > 0 || (c == 0 && i2 * i3 >= 0);
        }
        if (i == 17) {
            return i2 < 0;
        }
        if (i == 33) {
            return c < 0;
        }
        if (i == 66) {
            return i2 > 0;
        }
        if (i == 130) {
            return c > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i + m2306i());
    }

    /* renamed from: b */
    private boolean m2236b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f2046q = null;
        }
        int size = this.f2044p.size();
        for (int i = 0; i < size; i++) {
            InterfaceC0346s interfaceC0346s = this.f2044p.get(i);
            if (interfaceC0346s.mo2564a(this, motionEvent) && action != 3) {
                this.f2046q = interfaceC0346s;
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m2237c(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2006O) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f2006O = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f2010S = x;
            this.f2008Q = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f2011T = y;
            this.f2009R = y;
        }
    }

    /* renamed from: d */
    private void m2238d(AbstractC0330c0 abstractC0330c0) {
        View view = abstractC0330c0.f2076a;
        boolean z = view.getParent() == this;
        this.f2018c.m2607c(m2291e(view));
        if (abstractC0330c0.m2364r()) {
            this.f2024f.m2766a(view, -1, view.getLayoutParams(), true);
            return;
        }
        C0361b c0361b = this.f2024f;
        if (z) {
            c0361b.m2765a(view);
        } else {
            c0361b.m2768a(view, true);
        }
    }

    /* renamed from: e */
    static void m2239e(AbstractC0330c0 abstractC0330c0) {
        WeakReference<RecyclerView> weakReference = abstractC0330c0.f2077b;
        if (weakReference != null) {
            Object obj = weakReference.get();
            while (true) {
                for (View view = (View) obj; view != null; view = null) {
                    if (view == abstractC0330c0.f2076a) {
                        return;
                    }
                    obj = view.getParent();
                    if (obj instanceof View) {
                        break;
                    }
                }
                abstractC0330c0.f2077b = null;
                return;
            }
        }
    }

    private C2797j2 getScrollingChildHelper() {
        if (this.f2049r0 == null) {
            this.f2049r0 = new C2797j2(this);
        }
        return this.f2049r0;
    }

    /* renamed from: j */
    static RecyclerView m2240j(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView m2240j = m2240j(viewGroup.getChildAt(i));
            if (m2240j != null) {
                return m2240j;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static AbstractC0330c0 m2241k(View view) {
        if (view == null) {
            return null;
        }
        return ((C0343p) view.getLayoutParams()).f2132a;
    }

    /* renamed from: k */
    private boolean m2242k(int i, int i2) {
        m2232a(this.f2047q0);
        int[] iArr = this.f2047q0;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    /* renamed from: l */
    private int m2243l(View view) {
        int id;
        loop0: while (true) {
            id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    break;
                }
            }
        }
        return id;
    }

    /* renamed from: y */
    private void m2244y() {
        m2218M();
        setScrollState(0);
    }

    /* renamed from: z */
    private void m2245z() {
        int i = this.f2064z;
        this.f2064z = 0;
        if (i == 0 || !m2313m()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        C3509z2.m16709a(obtain, i);
        sendAccessibilityEventUnchecked(obtain);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.recyclerview.widget.RecyclerView.AbstractC0330c0 m2246a(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.f2024f
            int r0 = r0.m2769b()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.b r3 = r5.f2024f
            android.view.View r3 = r3.m2775d(r2)
            androidx.recyclerview.widget.RecyclerView$c0 r3 = m2241k(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.m2362p()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.f2078c
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.m2355i()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.b r1 = r5.f2024f
            android.view.View r4 = r3.f2076a
            boolean r1 = r1.m2774c(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m2246a(int, boolean):androidx.recyclerview.widget.RecyclerView$c0");
    }

    /* renamed from: a */
    public AbstractC0330c0 m2247a(long j) {
        AbstractC0334g abstractC0334g = this.f2036l;
        AbstractC0330c0 abstractC0330c0 = null;
        if (abstractC0334g != null && abstractC0334g.m2411b()) {
            int m2769b = this.f2024f.m2769b();
            for (int i = 0; i < m2769b; i++) {
                AbstractC0330c0 m2241k = m2241k(this.f2024f.m2775d(i));
                if (m2241k != null && !m2241k.m2362p() && m2241k.m2353g() == j) {
                    if (!this.f2024f.m2774c(m2241k.f2076a)) {
                        return m2241k;
                    }
                    abstractC0330c0 = m2241k;
                }
            }
        }
        return abstractC0330c0;
    }

    /* renamed from: a */
    void m2248a() {
        int m2769b = this.f2024f.m2769b();
        for (int i = 0; i < m2769b; i++) {
            AbstractC0330c0 m2241k = m2241k(this.f2024f.m2775d(i));
            if (!m2241k.m2370x()) {
                m2241k.m2337a();
            }
        }
        this.f2018c.m2599b();
    }

    @Override // p000.InterfaceC2535h2
    /* renamed from: a */
    public void mo1525a(int i) {
        getScrollingChildHelper().m13344c(i);
    }

    /* renamed from: a */
    void m2249a(int i, int i2) {
        if (i < 0) {
            m2296f();
            this.f2000I.onAbsorb(-i);
        } else if (i > 0) {
            m2299g();
            this.f2002K.onAbsorb(i);
        }
        if (i2 < 0) {
            m2303h();
            this.f2001J.onAbsorb(-i2);
        } else if (i2 > 0) {
            m2292e();
            this.f2003L.onAbsorb(i2);
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        C3107q2.m14877A(this);
    }

    /* renamed from: a */
    public void m2250a(int i, int i2, Interpolator interpolator) {
        AbstractC0342o abstractC0342o = this.f2038m;
        if (abstractC0342o == null || this.f2060x) {
            return;
        }
        if (!abstractC0342o.mo2176a()) {
            i = 0;
        }
        if (!this.f2038m.mo2180b()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f2023e0.m2334a(i, i2, interpolator);
    }

    /* renamed from: a */
    void m2251a(int i, int i2, Object obj) {
        int i3;
        int m2769b = this.f2024f.m2769b();
        int i4 = i + i2;
        for (int i5 = 0; i5 < m2769b; i5++) {
            View m2775d = this.f2024f.m2775d(i5);
            AbstractC0330c0 m2241k = m2241k(m2775d);
            if (m2241k != null && !m2241k.m2370x() && (i3 = m2241k.f2078c) >= i && i3 < i4) {
                m2241k.m2338a(2);
                m2241k.m2344a(obj);
                ((C0343p) m2775d.getLayoutParams()).f2134c = true;
            }
        }
        this.f2018c.m2605c(i, i2);
    }

    /* renamed from: a */
    void m2252a(int i, int i2, boolean z) {
        int i3 = i + i2;
        int m2769b = this.f2024f.m2769b();
        for (int i4 = 0; i4 < m2769b; i4++) {
            AbstractC0330c0 m2241k = m2241k(this.f2024f.m2775d(i4));
            if (m2241k != null && !m2241k.m2370x()) {
                int i5 = m2241k.f2078c;
                if (i5 >= i3) {
                    m2241k.m2341a(-i2, z);
                } else if (i5 >= i) {
                    m2241k.m2340a(i - 1, -i2, z);
                }
                this.f2029h0.f2158g = true;
            }
        }
        this.f2018c.m2590a(i, i2, z);
        requestLayout();
    }

    /* renamed from: a */
    void m2253a(int i, int i2, int[] iArr) {
        m2323w();
        m2317q();
        C2494g1.m11864a("RV Scroll");
        m2262a(this.f2029h0);
        int mo2096a = i != 0 ? this.f2038m.mo2096a(i, this.f2018c, this.f2029h0) : 0;
        int mo2111b = i2 != 0 ? this.f2038m.mo2111b(i2, this.f2018c, this.f2029h0) : 0;
        C2494g1.m11863a();
        m2321u();
        m2318r();
        m2286c(false);
        if (iArr != null) {
            iArr[0] = mo2096a;
            iArr[1] = mo2111b;
        }
    }

    /* renamed from: a */
    void m2254a(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new C0363d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R$dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R$dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R$dimen.fastscroll_margin));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + m2306i());
        }
    }

    /* renamed from: a */
    void m2255a(View view) {
        AbstractC0330c0 m2241k = m2241k(view);
        m2302g(view);
        AbstractC0334g abstractC0334g = this.f2036l;
        if (abstractC0334g != null && m2241k != null) {
            abstractC0334g.m2407b((AbstractC0334g) m2241k);
        }
        List<InterfaceC0344q> list = this.f1994C;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f1994C.get(size).m2560a(view);
            }
        }
    }

    /* renamed from: a */
    void m2256a(AbstractC0330c0 abstractC0330c0, AbstractC0339l.c cVar) {
        abstractC0330c0.m2339a(0, 8192);
        if (this.f2029h0.f2160i && abstractC0330c0.m2365s() && !abstractC0330c0.m2362p() && !abstractC0330c0.m2370x()) {
            this.f2026g.m2896a(m2281c(abstractC0330c0), abstractC0330c0);
        }
        this.f2026g.m2903c(abstractC0330c0, cVar);
    }

    /* renamed from: a */
    void m2257a(AbstractC0330c0 abstractC0330c0, AbstractC0339l.c cVar, AbstractC0339l.c cVar2) {
        abstractC0330c0.m2345a(false);
        if (this.f2004M.mo2426a(abstractC0330c0, cVar, cVar2)) {
            m2319s();
        }
    }

    /* renamed from: a */
    public void m2258a(AbstractC0341n abstractC0341n) {
        m2259a(abstractC0341n, -1);
    }

    /* renamed from: a */
    public void m2259a(AbstractC0341n abstractC0341n, int i) {
        AbstractC0342o abstractC0342o = this.f2038m;
        if (abstractC0342o != null) {
            abstractC0342o.mo2174a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f2042o.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.f2042o.add(abstractC0341n);
        } else {
            this.f2042o.add(i, abstractC0341n);
        }
        m2315o();
        requestLayout();
    }

    /* renamed from: a */
    public void m2260a(InterfaceC0346s interfaceC0346s) {
        this.f2044p.add(interfaceC0346s);
    }

    /* renamed from: a */
    public void m2261a(AbstractC0347t abstractC0347t) {
        if (this.f2033j0 == null) {
            this.f2033j0 = new ArrayList();
        }
        this.f2033j0.add(abstractC0347t);
    }

    /* renamed from: a */
    final void m2262a(C0353z c0353z) {
        if (getScrollState() != 2) {
            c0353z.f2167p = 0;
            c0353z.f2168q = 0;
        } else {
            OverScroller overScroller = this.f2023e0.f2070d;
            c0353z.f2167p = overScroller.getFinalX() - overScroller.getCurrX();
            c0353z.f2168q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    /* renamed from: a */
    void m2263a(String str) {
        if (m2314n()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m2306i());
        }
        if (this.f1998G > 0) {
            new IllegalStateException("" + m2306i());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2264a(boolean z) {
        int i = this.f1997F - 1;
        this.f1997F = i;
        if (i < 1) {
            this.f1997F = 0;
            if (z) {
                m2245z();
                m2288d();
            }
        }
    }

    /* renamed from: a */
    public boolean m2265a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().m13338a(i, i2, i3, i4, iArr, i5);
    }

    /* renamed from: a */
    boolean m2266a(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        m2272b();
        if (this.f2036l != null) {
            m2253a(i, i2, this.f2057v0);
            int[] iArr = this.f2057v0;
            int i7 = iArr[0];
            int i8 = iArr[1];
            i4 = i8;
            i5 = i7;
            i6 = i - i7;
            i3 = i2 - i8;
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (!this.f2042o.isEmpty()) {
            invalidate();
        }
        int i9 = i3;
        if (m2265a(i5, i4, i6, i3, this.f2051s0, 0)) {
            int i10 = this.f2010S;
            int[] iArr2 = this.f2051s0;
            this.f2010S = i10 - iArr2[0];
            this.f2011T -= iArr2[1];
            if (motionEvent != null) {
                motionEvent.offsetLocation(iArr2[0], iArr2[1]);
            }
            int[] iArr3 = this.f2055u0;
            int i11 = iArr3[0];
            int[] iArr4 = this.f2051s0;
            iArr3[0] = i11 + iArr4[0];
            iArr3[1] = iArr3[1] + iArr4[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && !C2495g2.m11870d(motionEvent, 8194)) {
                m2222a(motionEvent.getX(), i6, motionEvent.getY(), i9);
            }
            m2274b(i, i2);
        }
        if (i5 != 0 || i4 != 0) {
            m2289d(i5, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (i5 == 0 && i4 == 0) ? false : true;
    }

    /* renamed from: a */
    public boolean m2267a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().m13340a(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: a */
    boolean m2268a(AccessibilityEvent accessibilityEvent) {
        if (!m2314n()) {
            return false;
        }
        int m16708a = accessibilityEvent != null ? C3509z2.m16708a(accessibilityEvent) : 0;
        this.f2064z |= m16708a != 0 ? m16708a : 0;
        return true;
    }

    /* renamed from: a */
    boolean m2269a(AbstractC0330c0 abstractC0330c0) {
        AbstractC0339l abstractC0339l = this.f2004M;
        return abstractC0339l == null || abstractC0339l.mo2427a(abstractC0330c0, abstractC0330c0.m2357k());
    }

    /* renamed from: a */
    boolean m2270a(AbstractC0330c0 abstractC0330c0, int i) {
        if (!m2314n()) {
            C3107q2.m14912f(abstractC0330c0.f2076a, i);
            return true;
        }
        abstractC0330c0.f2092q = i;
        this.f2059w0.add(abstractC0330c0);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        AbstractC0342o abstractC0342o = this.f2038m;
        if (abstractC0342o == null || !abstractC0342o.m2491a(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* renamed from: b */
    int m2271b(AbstractC0330c0 abstractC0330c0) {
        if (abstractC0330c0.m2348b(524) || !abstractC0330c0.m2359m()) {
            return -1;
        }
        return this.f2022e.m2745a(abstractC0330c0.f2078c);
    }

    /* renamed from: b */
    void m2272b() {
        if (!this.f2054u || this.f1995D) {
            C2494g1.m11864a("RV FullInvalidate");
            m2284c();
            C2494g1.m11863a();
            return;
        }
        if (this.f2022e.m2754c()) {
            if (this.f2022e.m2755c(4) && !this.f2022e.m2755c(11)) {
                C2494g1.m11864a("RV PartialInvalidate");
                m2323w();
                m2317q();
                this.f2022e.m2757e();
                if (!this.f2058w) {
                    if (m2210E()) {
                        m2284c();
                    } else {
                        this.f2022e.m2748a();
                    }
                }
                m2286c(true);
                m2318r();
            } else {
                if (!this.f2022e.m2754c()) {
                    return;
                }
                C2494g1.m11864a("RV FullInvalidate");
                m2284c();
            }
            C2494g1.m11863a();
        }
    }

    /* renamed from: b */
    void m2273b(int i) {
        AbstractC0342o abstractC0342o = this.f2038m;
        if (abstractC0342o != null) {
            abstractC0342o.mo2519f(i);
        }
        m2300g(i);
        AbstractC0347t abstractC0347t = this.f2031i0;
        if (abstractC0347t != null) {
            abstractC0347t.m2566a(this, i);
        }
        List<AbstractC0347t> list = this.f2033j0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f2033j0.get(size).m2566a(this, i);
            }
        }
    }

    /* renamed from: b */
    void m2274b(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f2000I;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f2000I.onRelease();
            z = this.f2000I.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2002K;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f2002K.onRelease();
            z |= this.f2002K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2001J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f2001J.onRelease();
            z |= this.f2001J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2003L;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f2003L.onRelease();
            z |= this.f2003L.isFinished();
        }
        if (z) {
            C3107q2.m14877A(this);
        }
    }

    /* renamed from: b */
    void m2275b(View view) {
        AbstractC0330c0 m2241k = m2241k(view);
        m2305h(view);
        AbstractC0334g abstractC0334g = this.f2036l;
        if (abstractC0334g != null && m2241k != null) {
            abstractC0334g.m2413c(m2241k);
        }
        List<InterfaceC0344q> list = this.f1994C;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f1994C.get(size).m2561b(view);
            }
        }
    }

    /* renamed from: b */
    void m2276b(AbstractC0330c0 abstractC0330c0, AbstractC0339l.c cVar, AbstractC0339l.c cVar2) {
        m2238d(abstractC0330c0);
        abstractC0330c0.m2345a(false);
        if (this.f2004M.mo2430b(abstractC0330c0, cVar, cVar2)) {
            m2319s();
        }
    }

    /* renamed from: b */
    public void m2277b(AbstractC0341n abstractC0341n) {
        AbstractC0342o abstractC0342o = this.f2038m;
        if (abstractC0342o != null) {
            abstractC0342o.mo2174a("Cannot remove item decoration during a scroll  or layout");
        }
        this.f2042o.remove(abstractC0341n);
        if (this.f2042o.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        m2315o();
        requestLayout();
    }

    /* renamed from: b */
    public void m2278b(InterfaceC0346s interfaceC0346s) {
        this.f2044p.remove(interfaceC0346s);
        if (this.f2046q == interfaceC0346s) {
            this.f2046q = null;
        }
    }

    /* renamed from: b */
    public void m2279b(AbstractC0347t abstractC0347t) {
        List<AbstractC0347t> list = this.f2033j0;
        if (list != null) {
            list.remove(abstractC0347t);
        }
    }

    /* renamed from: b */
    void m2280b(boolean z) {
        this.f1996E = z | this.f1996E;
        this.f1995D = true;
        m2316p();
    }

    /* renamed from: c */
    long m2281c(AbstractC0330c0 abstractC0330c0) {
        return this.f2036l.m2411b() ? abstractC0330c0.m2353g() : abstractC0330c0.f2078c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View m2282c(android.view.View r3) {
        /*
            r2 = this;
        L0:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L10
            if (r0 == r2) goto L10
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L10
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L0
        L10:
            if (r0 != r2) goto L13
            goto L14
        L13:
            r3 = 0
        L14:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m2282c(android.view.View):android.view.View");
    }

    /* renamed from: c */
    public AbstractC0330c0 m2283c(int i) {
        AbstractC0330c0 abstractC0330c0 = null;
        if (this.f1995D) {
            return null;
        }
        int m2769b = this.f2024f.m2769b();
        for (int i2 = 0; i2 < m2769b; i2++) {
            AbstractC0330c0 m2241k = m2241k(this.f2024f.m2775d(i2));
            if (m2241k != null && !m2241k.m2362p() && m2271b(m2241k) == i) {
                if (!this.f2024f.m2774c(m2241k.f2076a)) {
                    return m2241k;
                }
                abstractC0330c0 = m2241k;
            }
        }
        return abstractC0330c0;
    }

    /* renamed from: c */
    void m2284c() {
        if (this.f2036l == null || this.f2038m == null) {
            return;
        }
        C0353z c0353z = this.f2029h0;
        c0353z.f2161j = false;
        if (c0353z.f2156e == 1) {
            m2206A();
        } else if (!this.f2022e.m2756d() && this.f2038m.m2542q() == getWidth() && this.f2038m.m2525h() == getHeight()) {
            this.f2038m.m2517e(this);
            m2208C();
        }
        this.f2038m.m2517e(this);
        m2207B();
        m2208C();
    }

    /* renamed from: c */
    void m2285c(int i, int i2) {
        setMeasuredDimension(AbstractC0342o.m2451a(i, getPaddingLeft() + getPaddingRight(), C3107q2.m14921m(this)), AbstractC0342o.m2451a(i2, getPaddingTop() + getPaddingBottom(), C3107q2.m14920l(this)));
    }

    /* renamed from: c */
    void m2286c(boolean z) {
        if (this.f2056v < 1) {
            this.f2056v = 1;
        }
        if (!z && !this.f2060x) {
            this.f2058w = false;
        }
        if (this.f2056v == 1) {
            if (z && this.f2058w && !this.f2060x && this.f2038m != null && this.f2036l != null) {
                m2284c();
            }
            if (!this.f2060x) {
                this.f2058w = false;
            }
        }
        this.f2056v--;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0343p) && this.f2038m.mo2110a((C0343p) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        AbstractC0342o abstractC0342o = this.f2038m;
        if (abstractC0342o != null && abstractC0342o.mo2176a()) {
            return this.f2038m.mo2168a(this.f2029h0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        AbstractC0342o abstractC0342o = this.f2038m;
        if (abstractC0342o != null && abstractC0342o.mo2176a()) {
            return this.f2038m.mo2177b(this.f2029h0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        AbstractC0342o abstractC0342o = this.f2038m;
        if (abstractC0342o != null && abstractC0342o.mo2176a()) {
            return this.f2038m.mo2182c(this.f2029h0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        AbstractC0342o abstractC0342o = this.f2038m;
        if (abstractC0342o != null && abstractC0342o.mo2180b()) {
            return this.f2038m.mo2183d(this.f2029h0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        AbstractC0342o abstractC0342o = this.f2038m;
        if (abstractC0342o != null && abstractC0342o.mo2180b()) {
            return this.f2038m.mo2184e(this.f2029h0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        AbstractC0342o abstractC0342o = this.f2038m;
        if (abstractC0342o != null && abstractC0342o.mo2180b()) {
            return this.f2038m.mo2186f(this.f2029h0);
        }
        return 0;
    }

    /* renamed from: d */
    public AbstractC0330c0 m2287d(View view) {
        View m2282c = m2282c(view);
        if (m2282c == null) {
            return null;
        }
        return m2291e(m2282c);
    }

    /* renamed from: d */
    void m2288d() {
        int i;
        for (int size = this.f2059w0.size() - 1; size >= 0; size--) {
            AbstractC0330c0 abstractC0330c0 = this.f2059w0.get(size);
            if (abstractC0330c0.f2076a.getParent() == this && !abstractC0330c0.m2370x() && (i = abstractC0330c0.f2092q) != -1) {
                C3107q2.m14912f(abstractC0330c0.f2076a, i);
                abstractC0330c0.f2092q = -1;
            }
        }
        this.f2059w0.clear();
    }

    /* renamed from: d */
    void m2289d(int i, int i2) {
        this.f1998G++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        m2304h(i, i2);
        AbstractC0347t abstractC0347t = this.f2031i0;
        if (abstractC0347t != null) {
            abstractC0347t.mo2567a(this, i, i2);
        }
        List<AbstractC0347t> list = this.f2033j0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f2033j0.get(size).mo2567a(this, i, i2);
            }
        }
        this.f1998G--;
    }

    /* renamed from: d */
    public boolean m2290d(int i) {
        return getScrollingChildHelper().m13335a(i);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m13334a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m13333a(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m13339a(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m13337a(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        float f;
        int i;
        super.draw(canvas);
        int size = this.f2042o.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.f2042o.get(i2).mo2450b(canvas, this, this.f2029h0);
        }
        EdgeEffect edgeEffect = this.f2000I;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f2028h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f2000I;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f2001J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f2028h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f2001J;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f2002K;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f2028h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f2002K;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f2003L;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f2028h) {
                f = (-getWidth()) + getPaddingRight();
                i = (-getHeight()) + getPaddingBottom();
            } else {
                f = -getWidth();
                i = -getHeight();
            }
            canvas.translate(f, i);
            EdgeEffect edgeEffect8 = this.f2003L;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if ((z || this.f2004M == null || this.f2042o.size() <= 0 || !this.f2004M.mo2438g()) ? z : true) {
            C3107q2.m14877A(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: e */
    public AbstractC0330c0 m2291e(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m2241k(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* renamed from: e */
    void m2292e() {
        int measuredWidth;
        int measuredHeight;
        if (this.f2003L != null) {
            return;
        }
        EdgeEffect m2418a = this.f1999H.m2418a(this, 3);
        this.f2003L = m2418a;
        if (this.f2028h) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        m2418a.setSize(measuredWidth, measuredHeight);
    }

    /* renamed from: e */
    public void m2293e(int i) {
        int m2763a = this.f2024f.m2763a();
        for (int i2 = 0; i2 < m2763a; i2++) {
            this.f2024f.m2772c(i2).offsetLeftAndRight(i);
        }
    }

    /* renamed from: e */
    public boolean m2294e(int i, int i2) {
        AbstractC0342o abstractC0342o = this.f2038m;
        if (abstractC0342o == null || this.f2060x) {
            return false;
        }
        boolean mo2176a = abstractC0342o.mo2176a();
        boolean mo2180b = this.f2038m.mo2180b();
        if (!mo2176a || Math.abs(i) < this.f2014W) {
            i = 0;
        }
        if (!mo2180b || Math.abs(i2) < this.f2014W) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        float f = i;
        float f2 = i2;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z = mo2176a || mo2180b;
            dispatchNestedFling(f, f2, z);
            AbstractC0345r abstractC0345r = this.f2013V;
            if (abstractC0345r != null && abstractC0345r.m2562a(i, i2)) {
                return true;
            }
            if (z) {
                int i3 = mo2176a ? 1 : 0;
                if (mo2180b) {
                    i3 |= 2;
                }
                m2310j(i3, 1);
                int i4 = this.f2015a0;
                int max = Math.max(-i4, Math.min(i, i4));
                int i5 = this.f2015a0;
                this.f2023e0.m2332a(max, Math.max(-i5, Math.min(i2, i5)));
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    Rect m2295f(View view) {
        C0343p c0343p = (C0343p) view.getLayoutParams();
        if (!c0343p.f2134c) {
            return c0343p.f2133b;
        }
        if (this.f2029h0.m2632d() && (c0343p.m2557b() || c0343p.m2559d())) {
            return c0343p.f2133b;
        }
        Rect rect = c0343p.f2133b;
        rect.set(0, 0, 0, 0);
        int size = this.f2042o.size();
        for (int i = 0; i < size; i++) {
            this.f2030i.set(0, 0, 0, 0);
            this.f2042o.get(i).m2448a(this.f2030i, view, this, this.f2029h0);
            int i2 = rect.left;
            Rect rect2 = this.f2030i;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c0343p.f2134c = false;
        return rect;
    }

    /* renamed from: f */
    void m2296f() {
        int measuredHeight;
        int measuredWidth;
        if (this.f2000I != null) {
            return;
        }
        EdgeEffect m2418a = this.f1999H.m2418a(this, 0);
        this.f2000I = m2418a;
        if (this.f2028h) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        m2418a.setSize(measuredHeight, measuredWidth);
    }

    /* renamed from: f */
    public void m2297f(int i) {
        int m2763a = this.f2024f.m2763a();
        for (int i2 = 0; i2 < m2763a; i2++) {
            this.f2024f.m2772c(i2).offsetTopAndBottom(i);
        }
    }

    /* renamed from: f */
    void m2298f(int i, int i2) {
        int m2769b = this.f2024f.m2769b();
        for (int i3 = 0; i3 < m2769b; i3++) {
            AbstractC0330c0 m2241k = m2241k(this.f2024f.m2775d(i3));
            if (m2241k != null && !m2241k.m2370x() && m2241k.f2078c >= i) {
                m2241k.m2341a(i2, false);
                this.f2029h0.f2158g = true;
            }
        }
        this.f2018c.m2589a(i, i2);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        View m2510d = this.f2038m.m2510d(view, i);
        if (m2510d != null) {
            return m2510d;
        }
        boolean z2 = (this.f2036l == null || this.f2038m == null || m2314n() || this.f2060x) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z2 && (i == 2 || i == 1)) {
            if (this.f2038m.mo2180b()) {
                int i2 = i == 2 ? 130 : 33;
                z = focusFinder.findNextFocus(this, view, i2) == null;
                if (f1987E0) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.f2038m.mo2176a()) {
                int i3 = (this.f2038m.m2529j() == 1) ^ (i == 2) ? 66 : 17;
                boolean z3 = focusFinder.findNextFocus(this, view, i3) == null;
                if (f1987E0) {
                    i = i3;
                }
                z = z3;
            }
            if (z) {
                m2272b();
                if (m2282c(view) == null) {
                    return null;
                }
                m2323w();
                this.f2038m.mo2098a(view, i, this.f2018c, this.f2029h0);
                m2286c(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i);
            if (findNextFocus == null && z2) {
                m2272b();
                if (m2282c(view) == null) {
                    return null;
                }
                m2323w();
                view2 = this.f2038m.mo2098a(view, i, this.f2018c, this.f2029h0);
                m2286c(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return m2234a(view, view2, i) ? view2 : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        m2226a(view2, (View) null);
        return view;
    }

    /* renamed from: g */
    void m2299g() {
        int measuredHeight;
        int measuredWidth;
        if (this.f2002K != null) {
            return;
        }
        EdgeEffect m2418a = this.f1999H.m2418a(this, 2);
        this.f2002K = m2418a;
        if (this.f2028h) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        m2418a.setSize(measuredHeight, measuredWidth);
    }

    /* renamed from: g */
    public void m2300g(int i) {
    }

    /* renamed from: g */
    void m2301g(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int m2769b = this.f2024f.m2769b();
        if (i < i2) {
            i5 = -1;
            i4 = i;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i7 = 0; i7 < m2769b; i7++) {
            AbstractC0330c0 m2241k = m2241k(this.f2024f.m2775d(i7));
            if (m2241k != null && (i6 = m2241k.f2078c) >= i4 && i6 <= i3) {
                if (i6 == i) {
                    m2241k.m2341a(i2 - i, false);
                } else {
                    m2241k.m2341a(i5, false);
                }
                this.f2029h0.f2158g = true;
            }
        }
        this.f2018c.m2600b(i, i2);
        requestLayout();
    }

    /* renamed from: g */
    public void m2302g(View view) {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0342o abstractC0342o = this.f2038m;
        if (abstractC0342o != null) {
            return abstractC0342o.mo2115c();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m2306i());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0342o abstractC0342o = this.f2038m;
        if (abstractC0342o != null) {
            return abstractC0342o.mo2100a(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m2306i());
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0342o abstractC0342o = this.f2038m;
        if (abstractC0342o != null) {
            return abstractC0342o.mo2101a(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m2306i());
    }

    public AbstractC0334g getAdapter() {
        return this.f2036l;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0342o abstractC0342o = this.f2038m;
        return abstractC0342o != null ? abstractC0342o.m2508d() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        InterfaceC0337j interfaceC0337j = this.f2045p0;
        return interfaceC0337j == null ? super.getChildDrawingOrder(i, i2) : interfaceC0337j.m2417a(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f2028h;
    }

    public C0368i getCompatAccessibilityDelegate() {
        return this.f2043o0;
    }

    public C0338k getEdgeEffectFactory() {
        return this.f1999H;
    }

    public AbstractC0339l getItemAnimator() {
        return this.f2004M;
    }

    public int getItemDecorationCount() {
        return this.f2042o.size();
    }

    public AbstractC0342o getLayoutManager() {
        return this.f2038m;
    }

    public int getMaxFlingVelocity() {
        return this.f2015a0;
    }

    public int getMinFlingVelocity() {
        return this.f2014W;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNanoTime() {
        if (f1986D0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC0345r getOnFlingListener() {
        return this.f2013V;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2021d0;
    }

    public C0348u getRecycledViewPool() {
        return this.f2018c.m2609d();
    }

    public int getScrollState() {
        return this.f2005N;
    }

    /* renamed from: h */
    void m2303h() {
        int measuredWidth;
        int measuredHeight;
        if (this.f2001J != null) {
            return;
        }
        EdgeEffect m2418a = this.f1999H.m2418a(this, 1);
        this.f2001J = m2418a;
        if (this.f2028h) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        m2418a.setSize(measuredWidth, measuredHeight);
    }

    /* renamed from: h */
    public void m2304h(int i, int i2) {
    }

    /* renamed from: h */
    public void m2305h(View view) {
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m13332a();
    }

    /* renamed from: i */
    String m2306i() {
        return " " + super.toString() + ", adapter:" + this.f2036l + ", layout:" + this.f2038m + ", context:" + getContext();
    }

    /* renamed from: i */
    public void m2307i(int i, int i2) {
        m2250a(i, i2, (Interpolator) null);
    }

    /* renamed from: i */
    boolean m2308i(View view) {
        m2323w();
        boolean m2778e = this.f2024f.m2778e(view);
        if (m2778e) {
            AbstractC0330c0 m2241k = m2241k(view);
            this.f2018c.m2607c(m2241k);
            this.f2018c.m2602b(m2241k);
        }
        m2286c(!m2778e);
        return m2778e;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f2048r;
    }

    @Override // android.view.View, p000.InterfaceC2575i2
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m13341b();
    }

    /* renamed from: j */
    public boolean m2309j() {
        return !this.f2054u || this.f1995D || this.f2022e.m2754c();
    }

    /* renamed from: j */
    public boolean m2310j(int i, int i2) {
        return getScrollingChildHelper().m13336a(i, i2);
    }

    /* renamed from: k */
    void m2311k() {
        this.f2022e = new C0360a(new C0333f());
    }

    /* renamed from: l */
    void m2312l() {
        this.f2003L = null;
        this.f2001J = null;
        this.f2002K = null;
        this.f2000I = null;
    }

    /* renamed from: m */
    boolean m2313m() {
        AccessibilityManager accessibilityManager = this.f1993B;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* renamed from: n */
    public boolean m2314n() {
        return this.f1997F > 0;
    }

    /* renamed from: o */
    void m2315o() {
        int m2769b = this.f2024f.m2769b();
        for (int i = 0; i < m2769b; i++) {
            ((C0343p) this.f2024f.m2775d(i).getLayoutParams()).f2134c = true;
        }
        this.f2018c.m2615g();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1997F = 0;
        this.f2048r = true;
        this.f2054u = this.f2054u && !isLayoutRequested();
        AbstractC0342o abstractC0342o = this.f2038m;
        if (abstractC0342o != null) {
            abstractC0342o.m2478a(this);
        }
        this.f2041n0 = false;
        if (f1986D0) {
            RunnableC0364e runnableC0364e = RunnableC0364e.f2329f.get();
            this.f2025f0 = runnableC0364e;
            if (runnableC0364e == null) {
                this.f2025f0 = new RunnableC0364e();
                Display m14911f = C3107q2.m14911f(this);
                float f = 60.0f;
                if (!isInEditMode() && m14911f != null) {
                    float refreshRate = m14911f.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                RunnableC0364e runnableC0364e2 = this.f2025f0;
                runnableC0364e2.f2333d = 1.0E9f / f;
                RunnableC0364e.f2329f.set(runnableC0364e2);
            }
            this.f2025f0.m2829a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        RunnableC0364e runnableC0364e;
        super.onDetachedFromWindow();
        AbstractC0339l abstractC0339l = this.f2004M;
        if (abstractC0339l != null) {
            abstractC0339l.mo2428b();
        }
        m2324x();
        this.f2048r = false;
        AbstractC0342o abstractC0342o = this.f2038m;
        if (abstractC0342o != null) {
            abstractC0342o.m2479a(this, this.f2018c);
        }
        this.f2059w0.clear();
        removeCallbacks(this.f2061x0);
        this.f2026g.m2900b();
        if (!f1986D0 || (runnableC0364e = this.f2025f0) == null) {
            return;
        }
        runnableC0364e.m2831b(this);
        this.f2025f0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f2042o.size();
        for (int i = 0; i < size; i++) {
            this.f2042o.get(i).m2446a(canvas, this, this.f2029h0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.f2038m
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f2060x
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3c
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.f2038m
            boolean r0 = r0.mo2180b()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.f2038m
            boolean r3 = r3.mo2176a()
            if (r3 == 0) goto L61
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L62
        L3c:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L60
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.f2038m
            boolean r3 = r3.mo2180b()
            if (r3 == 0) goto L55
            float r0 = -r0
            goto L61
        L55:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.f2038m
            boolean r3 = r3.mo2176a()
            if (r3 == 0) goto L60
            r3 = r0
            r0 = 0
            goto L62
        L60:
            r0 = 0
        L61:
            r3 = 0
        L62:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6a
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6a:
            float r2 = r5.f2017b0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f2019c0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.m2266a(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f2060x) {
            return false;
        }
        if (m2236b(motionEvent)) {
            m2244y();
            return true;
        }
        AbstractC0342o abstractC0342o = this.f2038m;
        if (abstractC0342o == null) {
            return false;
        }
        boolean mo2176a = abstractC0342o.mo2176a();
        boolean mo2180b = this.f2038m.mo2180b();
        if (this.f2007P == null) {
            this.f2007P = VelocityTracker.obtain();
        }
        this.f2007P.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f2062y) {
                this.f2062y = false;
            }
            this.f2006O = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f2010S = x;
            this.f2008Q = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f2011T = y;
            this.f2009R = y;
            if (this.f2005N == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.f2055u0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = mo2176a ? 1 : 0;
            if (mo2180b) {
                i |= 2;
            }
            m2310j(i, 0);
        } else if (actionMasked == 1) {
            this.f2007P.clear();
            mo1525a(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f2006O);
            if (findPointerIndex < 0) {
                String str = "Error processing scroll; pointer index for id " + this.f2006O + " not found. Did any MotionEvents get skipped?";
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f2005N != 1) {
                int i2 = x2 - this.f2008Q;
                int i3 = y2 - this.f2009R;
                if (!mo2176a || Math.abs(i2) <= this.f2012U) {
                    z = false;
                } else {
                    this.f2010S = x2;
                    z = true;
                }
                if (mo2180b && Math.abs(i3) > this.f2012U) {
                    this.f2011T = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m2244y();
        } else if (actionMasked == 5) {
            this.f2006O = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f2010S = x3;
            this.f2008Q = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f2011T = y3;
            this.f2009R = y3;
        } else if (actionMasked == 6) {
            m2237c(motionEvent);
        }
        return this.f2005N == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C2494g1.m11864a("RV OnLayout");
        m2284c();
        C2494g1.m11863a();
        this.f2054u = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        AbstractC0342o abstractC0342o = this.f2038m;
        if (abstractC0342o == null) {
            m2285c(i, i2);
            return;
        }
        boolean z = false;
        if (abstractC0342o.mo2190u()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f2038m.m2475a(this.f2018c, this.f2029h0, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (z || this.f2036l == null) {
                return;
            }
            if (this.f2029h0.f2156e == 1) {
                m2206A();
            }
            this.f2038m.m2493b(i, i2);
            this.f2029h0.f2161j = true;
            m2207B();
            this.f2038m.m2512d(i, i2);
            if (this.f2038m.mo2159A()) {
                this.f2038m.m2493b(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f2029h0.f2161j = true;
                m2207B();
                this.f2038m.m2512d(i, i2);
                return;
            }
            return;
        }
        if (this.f2050s) {
            this.f2038m.m2475a(this.f2018c, this.f2029h0, i, i2);
            return;
        }
        if (this.f1992A) {
            m2323w();
            m2317q();
            m2214I();
            m2318r();
            C0353z c0353z = this.f2029h0;
            if (c0353z.f2163l) {
                c0353z.f2159h = true;
            } else {
                this.f2022e.m2753b();
                this.f2029h0.f2159h = false;
            }
            this.f1992A = false;
            m2286c(false);
        } else if (this.f2029h0.f2163l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC0334g abstractC0334g = this.f2036l;
        if (abstractC0334g != null) {
            this.f2029h0.f2157f = abstractC0334g.mo2397a();
        } else {
            this.f2029h0.f2157f = 0;
        }
        m2323w();
        this.f2038m.m2475a(this.f2018c, this.f2029h0, i, i2);
        m2286c(false);
        this.f2029h0.f2159h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (m2314n()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f2020d = savedState;
        super.onRestoreInstanceState(savedState.m1612a());
        AbstractC0342o abstractC0342o = this.f2038m;
        if (abstractC0342o == null || (parcelable2 = this.f2020d.f2065d) == null) {
            return;
        }
        abstractC0342o.mo2172a(parcelable2);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f2020d;
        if (savedState2 != null) {
            savedState.m2325a(savedState2);
        } else {
            AbstractC0342o abstractC0342o = this.f2038m;
            savedState.f2065d = abstractC0342o != null ? abstractC0342o.mo2191x() : null;
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        m2312l();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0116  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    void m2316p() {
        int m2769b = this.f2024f.m2769b();
        for (int i = 0; i < m2769b; i++) {
            AbstractC0330c0 m2241k = m2241k(this.f2024f.m2775d(i));
            if (m2241k != null && !m2241k.m2370x()) {
                m2241k.m2338a(6);
            }
        }
        m2315o();
        this.f2018c.m2616h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m2317q() {
        this.f1997F++;
    }

    /* renamed from: r */
    void m2318r() {
        m2264a(true);
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z) {
        AbstractC0330c0 m2241k = m2241k(view);
        if (m2241k != null) {
            if (m2241k.m2364r()) {
                m2241k.m2350d();
            } else if (!m2241k.m2370x()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + m2241k + m2306i());
            }
        }
        view.clearAnimation();
        m2275b(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f2038m.m2490a(this, this.f2029h0, view, view2) && view2 != null) {
            m2226a(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f2038m.m2487a(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f2044p.size();
        for (int i = 0; i < size; i++) {
            this.f2044p.get(i).mo2563a(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f2056v != 0 || this.f2060x) {
            this.f2058w = true;
        } else {
            super.requestLayout();
        }
    }

    /* renamed from: s */
    void m2319s() {
        if (this.f2041n0 || !this.f2048r) {
            return;
        }
        C3107q2.m14892a(this, this.f2061x0);
        this.f2041n0 = true;
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        AbstractC0342o abstractC0342o = this.f2038m;
        if (abstractC0342o == null || this.f2060x) {
            return;
        }
        boolean mo2176a = abstractC0342o.mo2176a();
        boolean mo2180b = this.f2038m.mo2180b();
        if (mo2176a || mo2180b) {
            if (!mo2176a) {
                i = 0;
            }
            if (!mo2180b) {
                i2 = 0;
            }
            m2266a(i, i2, (MotionEvent) null);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (m2268a(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C0368i c0368i) {
        this.f2043o0 = c0368i;
        C3107q2.m14897a(this, c0368i);
    }

    public void setAdapter(AbstractC0334g abstractC0334g) {
        setLayoutFrozen(false);
        m2228a(abstractC0334g, false, true);
        m2280b(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0337j interfaceC0337j) {
        if (interfaceC0337j == this.f2045p0) {
            return;
        }
        this.f2045p0 = interfaceC0337j;
        setChildrenDrawingOrderEnabled(interfaceC0337j != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f2028h) {
            m2312l();
        }
        this.f2028h = z;
        super.setClipToPadding(z);
        if (this.f2054u) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0338k c0338k) {
        C3419x1.m16410a(c0338k);
        this.f1999H = c0338k;
        m2312l();
    }

    public void setHasFixedSize(boolean z) {
        this.f2050s = z;
    }

    public void setItemAnimator(AbstractC0339l abstractC0339l) {
        AbstractC0339l abstractC0339l2 = this.f2004M;
        if (abstractC0339l2 != null) {
            abstractC0339l2.mo2428b();
            this.f2004M.m2423a((AbstractC0339l.b) null);
        }
        this.f2004M = abstractC0339l;
        if (abstractC0339l != null) {
            abstractC0339l.m2423a(this.f2039m0);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.f2018c.m2614f(i);
    }

    public void setLayoutFrozen(boolean z) {
        if (z != this.f2060x) {
            m2263a("Do not setLayoutFrozen in layout or scroll");
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f2060x = true;
                this.f2062y = true;
                m2324x();
                return;
            }
            this.f2060x = false;
            if (this.f2058w && this.f2038m != null && this.f2036l != null) {
                requestLayout();
            }
            this.f2058w = false;
        }
    }

    public void setLayoutManager(AbstractC0342o abstractC0342o) {
        if (abstractC0342o == this.f2038m) {
            return;
        }
        m2324x();
        if (this.f2038m != null) {
            AbstractC0339l abstractC0339l = this.f2004M;
            if (abstractC0339l != null) {
                abstractC0339l.mo2428b();
            }
            this.f2038m.m2497b(this.f2018c);
            this.f2038m.m2505c(this.f2018c);
            this.f2018c.m2588a();
            if (this.f2048r) {
                this.f2038m.m2479a(this, this.f2018c);
            }
            this.f2038m.m2520f((RecyclerView) null);
            this.f2038m = null;
        } else {
            this.f2018c.m2588a();
        }
        this.f2024f.m2773c();
        this.f2038m = abstractC0342o;
        if (abstractC0342o != null) {
            if (abstractC0342o.f2109b != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC0342o + " is already attached to a RecyclerView:" + abstractC0342o.f2109b.m2306i());
            }
            abstractC0342o.m2520f(this);
            if (this.f2048r) {
                this.f2038m.m2478a(this);
            }
        }
        this.f2018c.m2618j();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().m13331a(z);
    }

    public void setOnFlingListener(AbstractC0345r abstractC0345r) {
        this.f2013V = abstractC0345r;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0347t abstractC0347t) {
        this.f2031i0 = abstractC0347t;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f2021d0 = z;
    }

    public void setRecycledViewPool(C0348u c0348u) {
        this.f2018c.m2596a(c0348u);
    }

    public void setRecyclerListener(InterfaceC0350w interfaceC0350w) {
        this.f2040n = interfaceC0350w;
    }

    void setScrollState(int i) {
        if (i == this.f2005N) {
            return;
        }
        this.f2005N = i;
        if (i != 2) {
            m2220O();
        }
        m2273b(i);
    }

    public void setScrollingTouchSlop(int i) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                this.f2012U = scaledTouchSlop;
            } else {
                String str = "setScrollingTouchSlop(): bad argument constant " + i + "; using default value";
            }
        }
        scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.f2012U = scaledTouchSlop;
    }

    public void setViewCacheExtension(AbstractC0326a0 abstractC0326a0) {
        this.f2018c.m2592a(abstractC0326a0);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m13342b(i);
    }

    @Override // android.view.View, p000.InterfaceC2575i2
    public void stopNestedScroll() {
        getScrollingChildHelper().m13343c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m2320t() {
        AbstractC0339l abstractC0339l = this.f2004M;
        if (abstractC0339l != null) {
            abstractC0339l.mo2428b();
        }
        AbstractC0342o abstractC0342o = this.f2038m;
        if (abstractC0342o != null) {
            abstractC0342o.m2497b(this.f2018c);
            this.f2038m.m2505c(this.f2018c);
        }
        this.f2018c.m2588a();
    }

    /* renamed from: u */
    void m2321u() {
        AbstractC0330c0 abstractC0330c0;
        int m2763a = this.f2024f.m2763a();
        for (int i = 0; i < m2763a; i++) {
            View m2772c = this.f2024f.m2772c(i);
            AbstractC0330c0 m2291e = m2291e(m2772c);
            if (m2291e != null && (abstractC0330c0 = m2291e.f2084i) != null) {
                View view = abstractC0330c0.f2076a;
                int left = m2772c.getLeft();
                int top = m2772c.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* renamed from: v */
    void m2322v() {
        int m2769b = this.f2024f.m2769b();
        for (int i = 0; i < m2769b; i++) {
            AbstractC0330c0 m2241k = m2241k(this.f2024f.m2775d(i));
            if (!m2241k.m2370x()) {
                m2241k.m2368v();
            }
        }
    }

    /* renamed from: w */
    void m2323w() {
        int i = this.f2056v + 1;
        this.f2056v = i;
        if (i != 1 || this.f2060x) {
            return;
        }
        this.f2058w = false;
    }

    /* renamed from: x */
    public void m2324x() {
        setScrollState(0);
        m2220O();
    }
}
