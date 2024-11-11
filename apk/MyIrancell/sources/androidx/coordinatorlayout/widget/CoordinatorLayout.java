package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.R$attr;
import androidx.coordinatorlayout.R$style;
import androidx.coordinatorlayout.R$styleable;
import androidx.core.content.C0237b;
import androidx.core.graphics.drawable.C0239a;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.C0447b2;
import p000.C2919m2;
import p000.C3107q2;
import p000.C3187s1;
import p000.C3380w1;
import p000.C3460y2;
import p000.InterfaceC2837k2;
import p000.InterfaceC2965n2;
import p000.InterfaceC3283u1;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC2837k2 {

    /* renamed from: u */
    static final String f1320u;

    /* renamed from: v */
    static final Class<?>[] f1321v;

    /* renamed from: w */
    static final ThreadLocal<Map<String, Constructor<AbstractC0214c>>> f1322w;

    /* renamed from: x */
    static final Comparator<View> f1323x;

    /* renamed from: y */
    private static final InterfaceC3283u1<Rect> f1324y;

    /* renamed from: b */
    private final List<View> f1325b;

    /* renamed from: c */
    private final C0220a<View> f1326c;

    /* renamed from: d */
    private final List<View> f1327d;

    /* renamed from: e */
    private final List<View> f1328e;

    /* renamed from: f */
    private final int[] f1329f;

    /* renamed from: g */
    private Paint f1330g;

    /* renamed from: h */
    private boolean f1331h;

    /* renamed from: i */
    private boolean f1332i;

    /* renamed from: j */
    private int[] f1333j;

    /* renamed from: k */
    private View f1334k;

    /* renamed from: l */
    private View f1335l;

    /* renamed from: m */
    private ViewTreeObserverOnPreDrawListenerC0218g f1336m;

    /* renamed from: n */
    private boolean f1337n;

    /* renamed from: o */
    private C3460y2 f1338o;

    /* renamed from: p */
    private boolean f1339p;

    /* renamed from: q */
    private Drawable f1340q;

    /* renamed from: r */
    ViewGroup.OnHierarchyChangeListener f1341r;

    /* renamed from: s */
    private InterfaceC2965n2 f1342s;

    /* renamed from: t */
    private final C2919m2 f1343t;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0211a();

        /* renamed from: d */
        SparseArray<Parcelable> f1344d;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$a */
        /* loaded from: classes.dex */
        static class C0211a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0211a() {
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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f1344d = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f1344d.append(iArr[i], readParcelableArray[i]);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f1344d;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f1344d.keyAt(i2);
                parcelableArr[i2] = this.f1344d.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    /* loaded from: classes.dex */
    public class C0212a implements InterfaceC2965n2 {
        C0212a() {
        }

        @Override // p000.InterfaceC2965n2
        /* renamed from: a */
        public C3460y2 mo445a(View view, C3460y2 c3460y2) {
            CoordinatorLayout.this.m1269a(c3460y2);
            return c3460y2;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0213b {
        AbstractC0214c getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0214c<V extends View> {
        public AbstractC0214c() {
        }

        public AbstractC0214c(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: a */
        public C3460y2 m1292a(CoordinatorLayout coordinatorLayout, V v, C3460y2 c3460y2) {
            return c3460y2;
        }

        /* renamed from: a */
        public void m1293a() {
        }

        /* renamed from: a */
        public void mo1294a(C0217f c0217f) {
        }

        /* renamed from: a */
        public void mo1295a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* renamed from: a */
        public void mo1296a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                m1320d(coordinatorLayout, v, view);
            }
        }

        @Deprecated
        /* renamed from: a */
        public void mo1297a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        /* renamed from: a */
        public void mo1298a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                mo1297a(coordinatorLayout, (CoordinatorLayout) v, view, i, i2, i3, i4);
            }
        }

        @Deprecated
        /* renamed from: a */
        public void m1299a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        /* renamed from: a */
        public void mo1300a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                m1299a(coordinatorLayout, (CoordinatorLayout) v, view, i, i2, iArr);
            }
        }

        @Deprecated
        /* renamed from: a */
        public void m1301a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        /* renamed from: a */
        public void m1302a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                m1301a(coordinatorLayout, (CoordinatorLayout) v, view, view2, i);
            }
        }

        /* renamed from: a */
        public boolean m1303a(CoordinatorLayout coordinatorLayout, V v) {
            return m1317c(coordinatorLayout, v) > 0.0f;
        }

        /* renamed from: a */
        public boolean mo1304a(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1305a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1306a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1307a(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1308a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1309a(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1310a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        /* renamed from: a */
        public boolean m1311a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        /* renamed from: b */
        public int m1312b(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        /* renamed from: b */
        public boolean mo1313b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: b */
        public boolean mo1314b(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        @Deprecated
        /* renamed from: b */
        public boolean mo1315b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        /* renamed from: b */
        public boolean mo1316b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return mo1315b(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        /* renamed from: c */
        public float m1317c(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        /* renamed from: c */
        public void m1318c(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: d */
        public Parcelable mo1319d(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* renamed from: d */
        public void m1320d(CoordinatorLayout coordinatorLayout, V v, View view) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    /* loaded from: classes.dex */
    public @interface InterfaceC0215d {
        Class<? extends AbstractC0214c> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    /* loaded from: classes.dex */
    private class ViewGroupOnHierarchyChangeListenerC0216e implements ViewGroup.OnHierarchyChangeListener {
        ViewGroupOnHierarchyChangeListenerC0216e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1341r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.m1271a(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1341r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    /* loaded from: classes.dex */
    public static class C0217f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        AbstractC0214c f1347a;

        /* renamed from: b */
        boolean f1348b;

        /* renamed from: c */
        public int f1349c;

        /* renamed from: d */
        public int f1350d;

        /* renamed from: e */
        public int f1351e;

        /* renamed from: f */
        int f1352f;

        /* renamed from: g */
        public int f1353g;

        /* renamed from: h */
        public int f1354h;

        /* renamed from: i */
        int f1355i;

        /* renamed from: j */
        int f1356j;

        /* renamed from: k */
        View f1357k;

        /* renamed from: l */
        View f1358l;

        /* renamed from: m */
        private boolean f1359m;

        /* renamed from: n */
        private boolean f1360n;

        /* renamed from: o */
        private boolean f1361o;

        /* renamed from: p */
        private boolean f1362p;

        /* renamed from: q */
        final Rect f1363q;

        public C0217f(int i, int i2) {
            super(i, i2);
            this.f1348b = false;
            this.f1349c = 0;
            this.f1350d = 0;
            this.f1351e = -1;
            this.f1352f = -1;
            this.f1353g = 0;
            this.f1354h = 0;
            this.f1363q = new Rect();
        }

        C0217f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1348b = false;
            this.f1349c = 0;
            this.f1350d = 0;
            this.f1351e = -1;
            this.f1352f = -1;
            this.f1353g = 0;
            this.f1354h = 0;
            this.f1363q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CoordinatorLayout_Layout);
            this.f1349c = obtainStyledAttributes.getInteger(R$styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f1352f = obtainStyledAttributes.getResourceId(R$styleable.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f1350d = obtainStyledAttributes.getInteger(R$styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f1351e = obtainStyledAttributes.getInteger(R$styleable.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f1353g = obtainStyledAttributes.getInt(R$styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f1354h = obtainStyledAttributes.getInt(R$styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(R$styleable.CoordinatorLayout_Layout_layout_behavior);
            this.f1348b = hasValue;
            if (hasValue) {
                this.f1347a = CoordinatorLayout.m1247a(context, attributeSet, obtainStyledAttributes.getString(R$styleable.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            AbstractC0214c abstractC0214c = this.f1347a;
            if (abstractC0214c != null) {
                abstractC0214c.mo1294a(this);
            }
        }

        public C0217f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1348b = false;
            this.f1349c = 0;
            this.f1350d = 0;
            this.f1351e = -1;
            this.f1352f = -1;
            this.f1353g = 0;
            this.f1354h = 0;
            this.f1363q = new Rect();
        }

        public C0217f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1348b = false;
            this.f1349c = 0;
            this.f1350d = 0;
            this.f1351e = -1;
            this.f1352f = -1;
            this.f1353g = 0;
            this.f1354h = 0;
            this.f1363q = new Rect();
        }

        public C0217f(C0217f c0217f) {
            super((ViewGroup.MarginLayoutParams) c0217f);
            this.f1348b = false;
            this.f1349c = 0;
            this.f1350d = 0;
            this.f1351e = -1;
            this.f1352f = -1;
            this.f1353g = 0;
            this.f1354h = 0;
            this.f1363q = new Rect();
        }

        /* renamed from: a */
        private void m1321a(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f1352f);
            this.f1357k = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                findViewById = parent;
                            }
                        } else if (!coordinatorLayout.isInEditMode()) {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f1358l = findViewById;
                    return;
                }
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (!coordinatorLayout.isInEditMode()) {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f1352f) + " to anchor view " + view);
            }
            this.f1358l = null;
            this.f1357k = null;
        }

        /* renamed from: a */
        private boolean m1322a(View view, int i) {
            int m3270a = C0447b2.m3270a(((C0217f) view.getLayoutParams()).f1353g, i);
            return m3270a != 0 && (C0447b2.m3270a(this.f1354h, i) & m3270a) == m3270a;
        }

        /* renamed from: b */
        private boolean m1323b(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f1357k.getId() != this.f1352f) {
                return false;
            }
            View view2 = this.f1357k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f1358l = null;
                    this.f1357k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f1358l = view2;
            return true;
        }

        /* renamed from: a */
        View m1324a(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f1352f == -1) {
                this.f1358l = null;
                this.f1357k = null;
                return null;
            }
            if (this.f1357k == null || !m1323b(view, coordinatorLayout)) {
                m1321a(view, coordinatorLayout);
            }
            return this.f1357k;
        }

        /* renamed from: a */
        void m1325a(int i, boolean z) {
            if (i == 0) {
                this.f1360n = z;
            } else {
                if (i != 1) {
                    return;
                }
                this.f1361o = z;
            }
        }

        /* renamed from: a */
        void m1326a(Rect rect) {
            this.f1363q.set(rect);
        }

        /* renamed from: a */
        public void m1327a(AbstractC0214c abstractC0214c) {
            AbstractC0214c abstractC0214c2 = this.f1347a;
            if (abstractC0214c2 != abstractC0214c) {
                if (abstractC0214c2 != null) {
                    abstractC0214c2.m1293a();
                }
                this.f1347a = abstractC0214c;
                this.f1348b = true;
                if (abstractC0214c != null) {
                    abstractC0214c.mo1294a(this);
                }
            }
        }

        /* renamed from: a */
        void m1328a(boolean z) {
            this.f1362p = z;
        }

        /* renamed from: a */
        boolean m1329a() {
            return this.f1357k == null && this.f1352f != -1;
        }

        /* renamed from: a */
        boolean m1330a(int i) {
            if (i == 0) {
                return this.f1360n;
            }
            if (i != 1) {
                return false;
            }
            return this.f1361o;
        }

        /* renamed from: a */
        boolean m1331a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            AbstractC0214c abstractC0214c;
            return view2 == this.f1358l || m1322a(view2, C3107q2.m14919k(coordinatorLayout)) || ((abstractC0214c = this.f1347a) != null && abstractC0214c.mo1309a(coordinatorLayout, (CoordinatorLayout) view, view2));
        }

        /* renamed from: b */
        void m1332b(int i) {
            m1325a(i, false);
        }

        /* renamed from: b */
        boolean m1333b() {
            if (this.f1347a == null) {
                this.f1359m = false;
            }
            return this.f1359m;
        }

        /* renamed from: b */
        boolean m1334b(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f1359m;
            if (z) {
                return true;
            }
            AbstractC0214c abstractC0214c = this.f1347a;
            boolean m1303a = (abstractC0214c != null ? abstractC0214c.m1303a(coordinatorLayout, view) : false) | z;
            this.f1359m = m1303a;
            return m1303a;
        }

        /* renamed from: c */
        public int m1335c() {
            return this.f1352f;
        }

        /* renamed from: d */
        public AbstractC0214c m1336d() {
            return this.f1347a;
        }

        /* renamed from: e */
        boolean m1337e() {
            return this.f1362p;
        }

        /* renamed from: f */
        Rect m1338f() {
            return this.f1363q;
        }

        /* renamed from: g */
        void m1339g() {
            this.f1362p = false;
        }

        /* renamed from: h */
        void m1340h() {
            this.f1359m = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    /* loaded from: classes.dex */
    public class ViewTreeObserverOnPreDrawListenerC0218g implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserverOnPreDrawListenerC0218g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.m1271a(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    /* loaded from: classes.dex */
    static class C0219h implements Comparator<View> {
        C0219h() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float m14926r = C3107q2.m14926r(view);
            float m14926r2 = C3107q2.m14926r(view2);
            if (m14926r > m14926r2) {
                return -1;
            }
            return m14926r < m14926r2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f1320u = r0 != null ? r0.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            f1323x = new C0219h();
        } else {
            f1323x = null;
        }
        f1321v = new Class[]{Context.class, AttributeSet.class};
        f1322w = new ThreadLocal<>();
        f1324y = new C3380w1(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1325b = new ArrayList();
        this.f1326c = new C0220a<>();
        this.f1327d = new ArrayList();
        this.f1328e = new ArrayList();
        this.f1329f = new int[2];
        this.f1343t = new C2919m2(this);
        TypedArray obtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, R$styleable.CoordinatorLayout, 0, R$style.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, R$styleable.CoordinatorLayout, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f1333j = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f1333j.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f1333j[i2] = (int) (r1[i2] * f);
            }
        }
        this.f1340q = obtainStyledAttributes.getDrawable(R$styleable.CoordinatorLayout_statusBarBackground);
        obtainStyledAttributes.recycle();
        m1267f();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC0216e());
    }

    /* renamed from: a */
    private static int m1246a(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    static AbstractC0214c m1247a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f1320u)) {
            str = f1320u + '.' + str;
        }
        try {
            Map map = f1322w.get();
            if (map == null) {
                map = new HashMap();
                f1322w.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str).getConstructor(f1321v);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (AbstractC0214c) constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    /* renamed from: a */
    private static void m1248a(Rect rect) {
        rect.setEmpty();
        f1324y.mo13875a(rect);
    }

    /* renamed from: a */
    private void m1249a(View view, int i, Rect rect, Rect rect2, C0217f c0217f, int i2, int i3) {
        int m3270a = C0447b2.m3270a(m1259c(c0217f.f1349c), i);
        int m3270a2 = C0447b2.m3270a(m1260d(c0217f.f1350d), i);
        int i4 = m3270a & 7;
        int i5 = m3270a & 112;
        int i6 = m3270a2 & 7;
        int i7 = m3270a2 & 112;
        int width = i6 != 1 ? i6 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i7 != 16 ? i7 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i4 == 1) {
            width -= i2 / 2;
        } else if (i4 != 5) {
            width -= i2;
        }
        if (i5 == 16) {
            height -= i3 / 2;
        } else if (i5 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    /* renamed from: a */
    private void m1250a(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (C3107q2.m14932x(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C0217f c0217f = (C0217f) view.getLayoutParams();
            AbstractC0214c m1336d = c0217f.m1336d();
            Rect m1261d = m1261d();
            Rect m1261d2 = m1261d();
            m1261d2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (m1336d == null || !m1336d.mo1306a(this, (CoordinatorLayout) view, m1261d)) {
                m1261d.set(m1261d2);
            } else if (!m1261d2.contains(m1261d)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + m1261d.toShortString() + " | Bounds:" + m1261d2.toShortString());
            }
            m1248a(m1261d2);
            if (m1261d.isEmpty()) {
                m1248a(m1261d);
                return;
            }
            int m3270a = C0447b2.m3270a(c0217f.f1354h, i);
            boolean z3 = true;
            if ((m3270a & 48) != 48 || (i6 = (m1261d.top - ((ViewGroup.MarginLayoutParams) c0217f).topMargin) - c0217f.f1356j) >= (i7 = rect.top)) {
                z = false;
            } else {
                m1268f(view, i7 - i6);
                z = true;
            }
            if ((m3270a & 80) == 80 && (height = ((getHeight() - m1261d.bottom) - ((ViewGroup.MarginLayoutParams) c0217f).bottomMargin) + c0217f.f1356j) < (i5 = rect.bottom)) {
                m1268f(view, height - i5);
                z = true;
            }
            if (!z) {
                m1268f(view, 0);
            }
            if ((m3270a & 3) != 3 || (i3 = (m1261d.left - ((ViewGroup.MarginLayoutParams) c0217f).leftMargin) - c0217f.f1355i) >= (i4 = rect.left)) {
                z2 = false;
            } else {
                m1265e(view, i4 - i3);
                z2 = true;
            }
            if ((m3270a & 5) != 5 || (width = ((getWidth() - m1261d.right) - ((ViewGroup.MarginLayoutParams) c0217f).rightMargin) + c0217f.f1355i) >= (i2 = rect.right)) {
                z3 = z2;
            } else {
                m1265e(view, width - i2);
            }
            if (!z3) {
                m1265e(view, 0);
            }
            m1248a(m1261d);
        }
    }

    /* renamed from: a */
    private void m1251a(View view, View view2, int i) {
        Rect m1261d = m1261d();
        Rect m1261d2 = m1261d();
        try {
            m1278a(view2, m1261d);
            m1277a(view, i, m1261d, m1261d2);
            view.layout(m1261d2.left, m1261d2.top, m1261d2.right, m1261d2.bottom);
        } finally {
            m1248a(m1261d);
            m1248a(m1261d2);
        }
    }

    /* renamed from: a */
    private void m1252a(C0217f c0217f, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0217f).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c0217f).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0217f).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c0217f).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: a */
    private void m1253a(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator<View> comparator = f1323x;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: a */
    private void m1254a(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC0214c m1336d = ((C0217f) childAt.getLayoutParams()).m1336d();
            if (m1336d != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    m1336d.mo1308a(this, (CoordinatorLayout) childAt, obtain);
                } else {
                    m1336d.mo1313b(this, (CoordinatorLayout) childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0217f) getChildAt(i2).getLayoutParams()).m1340h();
        }
        this.f1334k = null;
        this.f1331h = false;
    }

    /* renamed from: a */
    private boolean m1255a(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f1327d;
        m1253a(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = list.get(i2);
            C0217f c0217f = (C0217f) view.getLayoutParams();
            AbstractC0214c m1336d = c0217f.m1336d();
            if (!(z || z2) || actionMasked == 0) {
                if (!z && m1336d != null) {
                    if (i == 0) {
                        z = m1336d.mo1308a(this, (CoordinatorLayout) view, motionEvent);
                    } else if (i == 1) {
                        z = m1336d.mo1313b(this, (CoordinatorLayout) view, motionEvent);
                    }
                    if (z) {
                        this.f1334k = view;
                    }
                }
                boolean m1333b = c0217f.m1333b();
                boolean m1334b = c0217f.m1334b(this, view);
                z2 = m1334b && !m1333b;
                if (m1334b && !z2) {
                    break;
                }
            } else if (m1336d != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    m1336d.mo1308a(this, (CoordinatorLayout) view, motionEvent2);
                } else if (i == 1) {
                    m1336d.mo1313b(this, (CoordinatorLayout) view, motionEvent2);
                }
            }
        }
        list.clear();
        return z;
    }

    /* renamed from: b */
    private int m1256b(int i) {
        StringBuilder sb;
        int[] iArr = this.f1333j;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
        } else {
            if (i >= 0 && i < iArr.length) {
                return iArr[i];
            }
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i);
            sb.append(" out of range for ");
            sb.append(this);
        }
        sb.toString();
        return 0;
    }

    /* renamed from: b */
    private C3460y2 m1257b(C3460y2 c3460y2) {
        AbstractC0214c m1336d;
        if (c3460y2.m16559e()) {
            return c3460y2;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (C3107q2.m14916h(childAt) && (m1336d = ((C0217f) childAt.getLayoutParams()).m1336d()) != null) {
                m1336d.m1292a(this, (CoordinatorLayout) childAt, c3460y2);
                if (c3460y2.m16559e()) {
                    break;
                }
            }
        }
        return c3460y2;
    }

    /* renamed from: b */
    private void m1258b(View view, int i, int i2) {
        C0217f c0217f = (C0217f) view.getLayoutParams();
        int m3270a = C0447b2.m3270a(m1263e(c0217f.f1349c), i2);
        int i3 = m3270a & 7;
        int i4 = m3270a & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int m1256b = m1256b(i) - measuredWidth;
        int i5 = 0;
        if (i3 == 1) {
            m1256b += measuredWidth / 2;
        } else if (i3 == 5) {
            m1256b += measuredWidth;
        }
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0217f).leftMargin, Math.min(m1256b, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) c0217f).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0217f).topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0217f).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* renamed from: c */
    private static int m1259c(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* renamed from: d */
    private static int m1260d(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: d */
    private static Rect m1261d() {
        Rect mo13874a = f1324y.mo13874a();
        return mo13874a == null ? new Rect() : mo13874a;
    }

    /* renamed from: d */
    private void m1262d(View view, int i) {
        C0217f c0217f = (C0217f) view.getLayoutParams();
        Rect m1261d = m1261d();
        m1261d.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0217f).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0217f).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0217f).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0217f).bottomMargin);
        if (this.f1338o != null && C3107q2.m14916h(this) && !C3107q2.m14916h(view)) {
            m1261d.left += this.f1338o.m16556b();
            m1261d.top += this.f1338o.m16558d();
            m1261d.right -= this.f1338o.m16557c();
            m1261d.bottom -= this.f1338o.m16554a();
        }
        Rect m1261d2 = m1261d();
        C0447b2.m3271a(m1260d(c0217f.f1349c), view.getMeasuredWidth(), view.getMeasuredHeight(), m1261d, m1261d2, i);
        view.layout(m1261d2.left, m1261d2.top, m1261d2.right, m1261d2.bottom);
        m1248a(m1261d);
        m1248a(m1261d2);
    }

    /* renamed from: e */
    private static int m1263e(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: e */
    private void m1264e() {
        this.f1325b.clear();
        this.f1326c.m1345a();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0217f m1291d = m1291d(childAt);
            m1291d.m1324a(this, childAt);
            this.f1326c.m1346a((C0220a<View>) childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (m1291d.m1331a(this, childAt, childAt2)) {
                        if (!this.f1326c.m1349b(childAt2)) {
                            this.f1326c.m1346a((C0220a<View>) childAt2);
                        }
                        this.f1326c.m1347a(childAt2, childAt);
                    }
                }
            }
        }
        this.f1325b.addAll(this.f1326c.m1348b());
        Collections.reverse(this.f1325b);
    }

    /* renamed from: e */
    private void m1265e(View view, int i) {
        C0217f c0217f = (C0217f) view.getLayoutParams();
        int i2 = c0217f.f1355i;
        if (i2 != i) {
            C3107q2.m14906c(view, i - i2);
            c0217f.f1355i = i;
        }
    }

    /* renamed from: e */
    private boolean m1266e(View view) {
        return this.f1326c.m1352e(view);
    }

    /* renamed from: f */
    private void m1267f() {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (!C3107q2.m14916h(this)) {
            C3107q2.m14895a(this, (InterfaceC2965n2) null);
            return;
        }
        if (this.f1342s == null) {
            this.f1342s = new C0212a();
        }
        C3107q2.m14895a(this, this.f1342s);
        setSystemUiVisibility(1280);
    }

    /* renamed from: f */
    private void m1268f(View view, int i) {
        C0217f c0217f = (C0217f) view.getLayoutParams();
        int i2 = c0217f.f1356j;
        if (i2 != i) {
            C3107q2.m14908d(view, i - i2);
            c0217f.f1356j = i;
        }
    }

    /* renamed from: a */
    final C3460y2 m1269a(C3460y2 c3460y2) {
        if (!C3187s1.m15319a(this.f1338o, c3460y2)) {
            this.f1338o = c3460y2;
            boolean z = c3460y2 != null && c3460y2.m16558d() > 0;
            this.f1339p = z;
            setWillNotDraw(!z && getBackground() == null);
            m1257b(c3460y2);
            requestLayout();
        }
        return c3460y2;
    }

    /* renamed from: a */
    void m1270a() {
        if (this.f1332i) {
            if (this.f1336m == null) {
                this.f1336m = new ViewTreeObserverOnPreDrawListenerC0218g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1336m);
        }
        this.f1337n = true;
    }

    /* renamed from: a */
    final void m1271a(int i) {
        boolean z;
        int m14919k = C3107q2.m14919k(this);
        int size = this.f1325b.size();
        Rect m1261d = m1261d();
        Rect m1261d2 = m1261d();
        Rect m1261d3 = m1261d();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f1325b.get(i2);
            C0217f c0217f = (C0217f) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (c0217f.f1358l == this.f1325b.get(i3)) {
                        m1284b(view, m14919k);
                    }
                }
                m1280a(view, true, m1261d2);
                if (c0217f.f1353g != 0 && !m1261d2.isEmpty()) {
                    int m3270a = C0447b2.m3270a(c0217f.f1353g, m14919k);
                    int i4 = m3270a & 112;
                    if (i4 == 48) {
                        m1261d.top = Math.max(m1261d.top, m1261d2.bottom);
                    } else if (i4 == 80) {
                        m1261d.bottom = Math.max(m1261d.bottom, getHeight() - m1261d2.top);
                    }
                    int i5 = m3270a & 7;
                    if (i5 == 3) {
                        m1261d.left = Math.max(m1261d.left, m1261d2.right);
                    } else if (i5 == 5) {
                        m1261d.right = Math.max(m1261d.right, getWidth() - m1261d2.left);
                    }
                }
                if (c0217f.f1354h != 0 && view.getVisibility() == 0) {
                    m1250a(view, m1261d, m14919k);
                }
                if (i != 2) {
                    m1285b(view, m1261d3);
                    if (!m1261d3.equals(m1261d2)) {
                        m1290c(view, m1261d2);
                    }
                }
                for (int i6 = i2 + 1; i6 < size; i6++) {
                    View view2 = this.f1325b.get(i6);
                    C0217f c0217f2 = (C0217f) view2.getLayoutParams();
                    AbstractC0214c m1336d = c0217f2.m1336d();
                    if (m1336d != null && m1336d.mo1309a(this, (CoordinatorLayout) view2, view)) {
                        if (i == 0 && c0217f2.m1337e()) {
                            c0217f2.m1339g();
                        } else {
                            if (i != 2) {
                                z = m1336d.mo1314b(this, (CoordinatorLayout) view2, view);
                            } else {
                                m1336d.m1318c(this, view2, view);
                                z = true;
                            }
                            if (i == 1) {
                                c0217f2.m1328a(z);
                            }
                        }
                    }
                }
            }
        }
        m1248a(m1261d);
        m1248a(m1261d2);
        m1248a(m1261d3);
    }

    /* renamed from: a */
    public void m1272a(View view) {
        List m1350c = this.f1326c.m1350c(view);
        if (m1350c == null || m1350c.isEmpty()) {
            return;
        }
        for (int i = 0; i < m1350c.size(); i++) {
            View view2 = (View) m1350c.get(i);
            AbstractC0214c m1336d = ((C0217f) view2.getLayoutParams()).m1336d();
            if (m1336d != null) {
                m1336d.mo1314b(this, (CoordinatorLayout) view2, view);
            }
        }
    }

    @Override // p000.InterfaceC2837k2
    /* renamed from: a */
    public void mo1273a(View view, int i) {
        this.f1343t.m13996a(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0217f c0217f = (C0217f) childAt.getLayoutParams();
            if (c0217f.m1330a(i)) {
                AbstractC0214c m1336d = c0217f.m1336d();
                if (m1336d != null) {
                    m1336d.mo1296a(this, (CoordinatorLayout) childAt, view, i);
                }
                c0217f.m1332b(i);
                c0217f.m1339g();
            }
        }
        this.f1335l = null;
    }

    /* renamed from: a */
    public void m1274a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override // p000.InterfaceC2837k2
    /* renamed from: a */
    public void mo1275a(View view, int i, int i2, int i3, int i4, int i5) {
        AbstractC0214c m1336d;
        int childCount = getChildCount();
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0217f c0217f = (C0217f) childAt.getLayoutParams();
                if (c0217f.m1330a(i5) && (m1336d = c0217f.m1336d()) != null) {
                    m1336d.mo1298a(this, childAt, view, i, i2, i3, i4, i5);
                    z = true;
                }
            }
        }
        if (z) {
            m1271a(1);
        }
    }

    @Override // p000.InterfaceC2837k2
    /* renamed from: a */
    public void mo1276a(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC0214c m1336d;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0217f c0217f = (C0217f) childAt.getLayoutParams();
                if (c0217f.m1330a(i3) && (m1336d = c0217f.m1336d()) != null) {
                    int[] iArr2 = this.f1329f;
                    iArr2[1] = 0;
                    iArr2[0] = 0;
                    m1336d.mo1300a(this, (CoordinatorLayout) childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f1329f;
                    i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    int[] iArr4 = this.f1329f;
                    i5 = i2 > 0 ? Math.max(i5, iArr4[1]) : Math.min(i5, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            m1271a(1);
        }
    }

    /* renamed from: a */
    void m1277a(View view, int i, Rect rect, Rect rect2) {
        C0217f c0217f = (C0217f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m1249a(view, i, rect, rect2, c0217f, measuredWidth, measuredHeight);
        m1252a(c0217f, rect2, measuredWidth, measuredHeight);
    }

    /* renamed from: a */
    void m1278a(View view, Rect rect) {
        C0221b.m1353a(this, view, rect);
    }

    @Override // p000.InterfaceC2837k2
    /* renamed from: a */
    public void mo1279a(View view, View view2, int i, int i2) {
        AbstractC0214c m1336d;
        this.f1343t.m13998a(view, view2, i, i2);
        this.f1335l = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0217f c0217f = (C0217f) childAt.getLayoutParams();
            if (c0217f.m1330a(i2) && (m1336d = c0217f.m1336d()) != null) {
                m1336d.m1302a(this, (CoordinatorLayout) childAt, view, view2, i, i2);
            }
        }
    }

    /* renamed from: a */
    void m1280a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m1278a(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: a */
    public boolean m1281a(View view, int i, int i2) {
        Rect m1261d = m1261d();
        m1278a(view, m1261d);
        try {
            return m1261d.contains(i, i2);
        } finally {
            m1248a(m1261d);
        }
    }

    /* renamed from: b */
    public List<View> m1282b(View view) {
        List<View> m1351d = this.f1326c.m1351d(view);
        this.f1328e.clear();
        if (m1351d != null) {
            this.f1328e.addAll(m1351d);
        }
        return this.f1328e;
    }

    /* renamed from: b */
    void m1283b() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            if (m1266e(getChildAt(i))) {
                z = true;
                break;
            }
            i++;
        }
        if (z != this.f1337n) {
            if (z) {
                m1270a();
            } else {
                m1288c();
            }
        }
    }

    /* renamed from: b */
    void m1284b(View view, int i) {
        AbstractC0214c m1336d;
        C0217f c0217f = (C0217f) view.getLayoutParams();
        if (c0217f.f1357k != null) {
            Rect m1261d = m1261d();
            Rect m1261d2 = m1261d();
            Rect m1261d3 = m1261d();
            m1278a(c0217f.f1357k, m1261d);
            m1280a(view, false, m1261d2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            m1249a(view, i, m1261d, m1261d3, c0217f, measuredWidth, measuredHeight);
            boolean z = (m1261d3.left == m1261d2.left && m1261d3.top == m1261d2.top) ? false : true;
            m1252a(c0217f, m1261d3, measuredWidth, measuredHeight);
            int i2 = m1261d3.left - m1261d2.left;
            int i3 = m1261d3.top - m1261d2.top;
            if (i2 != 0) {
                C3107q2.m14906c(view, i2);
            }
            if (i3 != 0) {
                C3107q2.m14908d(view, i3);
            }
            if (z && (m1336d = c0217f.m1336d()) != null) {
                m1336d.mo1314b(this, (CoordinatorLayout) view, c0217f.f1357k);
            }
            m1248a(m1261d);
            m1248a(m1261d2);
            m1248a(m1261d3);
        }
    }

    /* renamed from: b */
    void m1285b(View view, Rect rect) {
        rect.set(((C0217f) view.getLayoutParams()).m1338f());
    }

    @Override // p000.InterfaceC2837k2
    /* renamed from: b */
    public boolean mo1286b(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0217f c0217f = (C0217f) childAt.getLayoutParams();
                AbstractC0214c m1336d = c0217f.m1336d();
                if (m1336d != null) {
                    boolean mo1316b = m1336d.mo1316b(this, childAt, view, view2, i, i2);
                    z |= mo1316b;
                    c0217f.m1325a(i2, mo1316b);
                } else {
                    c0217f.m1325a(i2, false);
                }
            }
        }
        return z;
    }

    /* renamed from: c */
    public List<View> m1287c(View view) {
        List m1350c = this.f1326c.m1350c(view);
        this.f1328e.clear();
        if (m1350c != null) {
            this.f1328e.addAll(m1350c);
        }
        return this.f1328e;
    }

    /* renamed from: c */
    void m1288c() {
        if (this.f1332i && this.f1336m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1336m);
        }
        this.f1337n = false;
    }

    /* renamed from: c */
    public void m1289c(View view, int i) {
        C0217f c0217f = (C0217f) view.getLayoutParams();
        if (c0217f.m1329a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = c0217f.f1357k;
        if (view2 != null) {
            m1251a(view, view2, i);
            return;
        }
        int i2 = c0217f.f1351e;
        if (i2 >= 0) {
            m1258b(view, i2, i);
        } else {
            m1262d(view, i);
        }
    }

    /* renamed from: c */
    void m1290c(View view, Rect rect) {
        ((C0217f) view.getLayoutParams()).m1326a(rect);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0217f) && super.checkLayoutParams(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    C0217f m1291d(View view) {
        C0217f c0217f = (C0217f) view.getLayoutParams();
        if (!c0217f.f1348b) {
            if (view instanceof InterfaceC0213b) {
                c0217f.m1327a(((InterfaceC0213b) view).getBehavior());
            } else {
                InterfaceC0215d interfaceC0215d = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    interfaceC0215d = (InterfaceC0215d) cls.getAnnotation(InterfaceC0215d.class);
                    if (interfaceC0215d != null) {
                        break;
                    }
                }
                if (interfaceC0215d != null) {
                    try {
                        c0217f.m1327a(interfaceC0215d.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception unused) {
                        String str = "Default behavior class " + interfaceC0215d.value().getName() + " could not be instantiated. Did you forget a default constructor?";
                    }
                }
            }
            c0217f.f1348b = true;
        }
        return c0217f;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        C0217f c0217f = (C0217f) view.getLayoutParams();
        AbstractC0214c abstractC0214c = c0217f.f1347a;
        if (abstractC0214c != null) {
            float m1317c = abstractC0214c.m1317c(this, view);
            if (m1317c > 0.0f) {
                if (this.f1330g == null) {
                    this.f1330g = new Paint();
                }
                this.f1330g.setColor(c0217f.f1347a.m1312b(this, view));
                this.f1330g.setAlpha(m1246a(Math.round(m1317c * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f1330g);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1340q;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public C0217f generateDefaultLayoutParams() {
        return new C0217f(-2, -2);
    }

    @Override // android.view.ViewGroup
    public C0217f generateLayoutParams(AttributeSet attributeSet) {
        return new C0217f(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public C0217f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0217f ? new C0217f((C0217f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0217f((ViewGroup.MarginLayoutParams) layoutParams) : new C0217f(layoutParams);
    }

    final List<View> getDependencySortedChildren() {
        m1264e();
        return Collections.unmodifiableList(this.f1325b);
    }

    public final C3460y2 getLastWindowInsets() {
        return this.f1338o;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1343t.m13994a();
    }

    public Drawable getStatusBarBackground() {
        return this.f1340q;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1254a(false);
        if (this.f1337n) {
            if (this.f1336m == null) {
                this.f1336m = new ViewTreeObserverOnPreDrawListenerC0218g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1336m);
        }
        if (this.f1338o == null && C3107q2.m14916h(this)) {
            C3107q2.m14878B(this);
        }
        this.f1332i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1254a(false);
        if (this.f1337n && this.f1336m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1336m);
        }
        View view = this.f1335l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f1332i = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f1339p || this.f1340q == null) {
            return;
        }
        C3460y2 c3460y2 = this.f1338o;
        int m16558d = c3460y2 != null ? c3460y2.m16558d() : 0;
        if (m16558d > 0) {
            this.f1340q.setBounds(0, 0, getWidth(), m16558d);
            this.f1340q.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m1254a(true);
        }
        boolean m1255a = m1255a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m1254a(true);
        }
        return m1255a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC0214c m1336d;
        int m14919k = C3107q2.m14919k(this);
        int size = this.f1325b.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f1325b.get(i5);
            if (view.getVisibility() != 8 && ((m1336d = ((C0217f) view.getLayoutParams()).m1336d()) == null || !m1336d.mo1304a(this, (CoordinatorLayout) view, m14919k))) {
                m1289c(view, m14919k);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x011a, code lost:
    
        if (r0.mo1305a(r30, (androidx.coordinatorlayout.widget.CoordinatorLayout) r20, r11, r21, r23, 0) == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.InterfaceC2882l2
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        AbstractC0214c m1336d;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0217f c0217f = (C0217f) childAt.getLayoutParams();
                if (c0217f.m1330a(0) && (m1336d = c0217f.m1336d()) != null) {
                    z2 |= m1336d.m1311a(this, (CoordinatorLayout) childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            m1271a(1);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.InterfaceC2882l2
    public boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC0214c m1336d;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0217f c0217f = (C0217f) childAt.getLayoutParams();
                if (c0217f.m1330a(0) && (m1336d = c0217f.m1336d()) != null) {
                    z |= m1336d.mo1310a(this, (CoordinatorLayout) childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.InterfaceC2882l2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1276a(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.InterfaceC2882l2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo1275a(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.InterfaceC2882l2
    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo1279a(view, view2, i, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m1612a());
        SparseArray<Parcelable> sparseArray = savedState.f1344d;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0214c m1336d = m1291d(childAt).m1336d();
            if (id != -1 && m1336d != null && (parcelable2 = sparseArray.get(id)) != null) {
                m1336d.mo1295a(this, (CoordinatorLayout) childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable mo1319d;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0214c m1336d = ((C0217f) childAt.getLayoutParams()).m1336d();
            if (id != -1 && m1336d != null && (mo1319d = m1336d.mo1319d(this, childAt)) != null) {
                sparseArray.append(id, mo1319d);
            }
        }
        savedState.f1344d = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.InterfaceC2882l2
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1286b(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000.InterfaceC2882l2
    public void onStopNestedScroll(View view) {
        mo1273a(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f1334k
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.m1255a(r1, r4)
            if (r3 == 0) goto L2b
            goto L16
        L15:
            r3 = 0
        L16:
            android.view.View r6 = r0.f1334k
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0217f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.m1336d()
            if (r6 == 0) goto L2b
            android.view.View r7 = r0.f1334k
            boolean r6 = r6.mo1313b(r0, r7, r1)
            goto L2c
        L2b:
            r6 = 0
        L2c:
            android.view.View r7 = r0.f1334k
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.m1254a(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC0214c m1336d = ((C0217f) view.getLayoutParams()).m1336d();
        if (m1336d == null || !m1336d.mo1307a(this, (CoordinatorLayout) view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f1331h) {
            return;
        }
        m1254a(false);
        this.f1331h = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m1267f();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1341r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f1340q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f1340q = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f1340q.setState(getDrawableState());
                }
                C0239a.m1486a(this.f1340q, C3107q2.m14919k(this));
                this.f1340q.setVisible(getVisibility() == 0, false);
                this.f1340q.setCallback(this);
            }
            C3107q2.m14877A(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C0237b.m1466c(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f1340q;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f1340q.setVisible(z, false);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1340q;
    }
}
