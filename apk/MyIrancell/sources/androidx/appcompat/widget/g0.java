package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.R$styleable;
import defpackage.q2;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class g0 implements androidx.appcompat.view.menu.s {
    private static Method G;
    private static Method H;
    private static Method I;
    private final c A;
    final Handler B;
    private final Rect C;
    private Rect D;
    private boolean E;
    PopupWindow F;
    private Context b;
    private ListAdapter c;
    c0 d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private boolean n;
    private boolean o;
    int p;
    private View q;
    private int r;
    private DataSetObserver s;
    private View t;
    private Drawable u;
    private AdapterView.OnItemClickListener v;
    private AdapterView.OnItemSelectedListener w;
    final g x;
    private final f y;
    private final e z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View e = g0.this.e();
            if (e == null || e.getWindowToken() == null) {
                return;
            }
            g0.this.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            c0 c0Var;
            if (i == -1 || (c0Var = g0.this.d) == null) {
                return;
            }
            c0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g0.this.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d extends DataSetObserver {
        d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (g0.this.d()) {
                g0.this.a();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            g0.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e implements AbsListView.OnScrollListener {
        e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i != 1 || g0.this.j() || g0.this.F.getContentView() == null) {
                return;
            }
            g0 g0Var = g0.this;
            g0Var.B.removeCallbacks(g0Var.x);
            g0.this.x.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class f implements View.OnTouchListener {
        f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = g0.this.F) != null && popupWindow.isShowing() && x >= 0 && x < g0.this.F.getWidth() && y >= 0 && y < g0.this.F.getHeight()) {
                g0 g0Var = g0.this;
                g0Var.B.postDelayed(g0Var.x, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            g0 g0Var2 = g0.this;
            g0Var2.B.removeCallbacks(g0Var2.x);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c0 c0Var = g0.this.d;
            if (c0Var == null || !q2.w(c0Var) || g0.this.d.getCount() <= g0.this.d.getChildCount()) {
                return;
            }
            int childCount = g0.this.d.getChildCount();
            g0 g0Var = g0.this;
            if (childCount <= g0Var.p) {
                g0Var.F.setInputMethodMode(2);
                g0.this.a();
            }
        }
    }

    static {
        try {
            G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
        }
        try {
            H = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
        } catch (NoSuchMethodException unused3) {
        }
    }

    public g0(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public g0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.e = -2;
        this.f = -2;
        this.i = 1002;
        this.m = 0;
        this.n = false;
        this.o = false;
        this.p = Integer.MAX_VALUE;
        this.r = 0;
        this.x = new g();
        this.y = new f();
        this.z = new e();
        this.A = new c();
        this.C = new Rect();
        this.b = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ListPopupWindow, i, i2);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(R$styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(R$styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.j = true;
        }
        obtainStyledAttributes.recycle();
        p pVar = new p(context, attributeSet, i, i2);
        this.F = pVar;
        pVar.setInputMethodMode(1);
    }

    private int a(View view, int i, boolean z) {
        Method method = H;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.F, view, Integer.valueOf(i), Boolean.valueOf(z))).intValue();
            } catch (Exception unused) {
            }
        }
        return this.F.getMaxAvailableHeight(view, i);
    }

    private void c(boolean z) {
        Method method = G;
        if (method != null) {
            try {
                method.invoke(this.F, Boolean.valueOf(z));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int l() {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.g0.l():int");
    }

    private void m() {
        View view = this.q;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.q);
            }
        }
    }

    c0 a(Context context, boolean z) {
        return new c0(context, z);
    }

    @Override // androidx.appcompat.view.menu.s
    public void a() {
        int l = l();
        boolean j = j();
        androidx.core.widget.h.a(this.F, this.i);
        if (this.F.isShowing()) {
            if (q2.w(e())) {
                int i = this.f;
                if (i == -1) {
                    i = -1;
                } else if (i == -2) {
                    i = e().getWidth();
                }
                int i2 = this.e;
                if (i2 == -1) {
                    if (!j) {
                        l = -1;
                    }
                    if (j) {
                        this.F.setWidth(this.f == -1 ? -1 : 0);
                        this.F.setHeight(0);
                    } else {
                        this.F.setWidth(this.f == -1 ? -1 : 0);
                        this.F.setHeight(-1);
                    }
                } else if (i2 != -2) {
                    l = i2;
                }
                this.F.setOutsideTouchable((this.o || this.n) ? false : true);
                this.F.update(e(), this.g, this.h, i < 0 ? -1 : i, l < 0 ? -1 : l);
                return;
            }
            return;
        }
        int i3 = this.f;
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = e().getWidth();
        }
        int i4 = this.e;
        if (i4 == -1) {
            l = -1;
        } else if (i4 != -2) {
            l = i4;
        }
        this.F.setWidth(i3);
        this.F.setHeight(l);
        c(true);
        this.F.setOutsideTouchable((this.o || this.n) ? false : true);
        this.F.setTouchInterceptor(this.y);
        if (this.l) {
            androidx.core.widget.h.a(this.F, this.k);
        }
        Method method = I;
        if (method != null) {
            try {
                method.invoke(this.F, this.D);
            } catch (Exception unused) {
            }
        }
        androidx.core.widget.h.a(this.F, e(), this.g, this.h, this.m);
        this.d.setSelection(-1);
        if (!this.E || this.d.isInTouchMode()) {
            c();
        }
        if (this.E) {
            return;
        }
        this.B.post(this.A);
    }

    public void a(int i) {
        this.F.setAnimationStyle(i);
    }

    public void a(Rect rect) {
        this.D = rect;
    }

    public void a(Drawable drawable) {
        this.F.setBackgroundDrawable(drawable);
    }

    public void a(View view) {
        this.t = view;
    }

    public void a(AdapterView.OnItemClickListener onItemClickListener) {
        this.v = onItemClickListener;
    }

    public void a(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.s;
        if (dataSetObserver == null) {
            this.s = new d();
        } else {
            ListAdapter listAdapter2 = this.c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.s);
        }
        c0 c0Var = this.d;
        if (c0Var != null) {
            c0Var.setAdapter(this.c);
        }
    }

    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.F.setOnDismissListener(onDismissListener);
    }

    public void a(boolean z) {
        this.E = z;
        this.F.setFocusable(z);
    }

    @Override // androidx.appcompat.view.menu.s
    public ListView b() {
        return this.d;
    }

    public void b(int i) {
        Drawable background = this.F.getBackground();
        if (background == null) {
            i(i);
            return;
        }
        background.getPadding(this.C);
        Rect rect = this.C;
        this.f = rect.left + rect.right + i;
    }

    public void b(boolean z) {
        this.l = true;
        this.k = z;
    }

    public void c() {
        c0 c0Var = this.d;
        if (c0Var != null) {
            c0Var.setListSelectionHidden(true);
            c0Var.requestLayout();
        }
    }

    public void c(int i) {
        this.m = i;
    }

    public void d(int i) {
        this.g = i;
    }

    @Override // androidx.appcompat.view.menu.s
    public boolean d() {
        return this.F.isShowing();
    }

    @Override // androidx.appcompat.view.menu.s
    public void dismiss() {
        this.F.dismiss();
        m();
        this.F.setContentView(null);
        this.d = null;
        this.B.removeCallbacks(this.x);
    }

    public View e() {
        return this.t;
    }

    public void e(int i) {
        this.F.setInputMethodMode(i);
    }

    public Drawable f() {
        return this.F.getBackground();
    }

    public void f(int i) {
        this.r = i;
    }

    public int g() {
        return this.g;
    }

    public void g(int i) {
        c0 c0Var = this.d;
        if (!d() || c0Var == null) {
            return;
        }
        c0Var.setListSelectionHidden(false);
        c0Var.setSelection(i);
        if (c0Var.getChoiceMode() != 0) {
            c0Var.setItemChecked(i, true);
        }
    }

    public int h() {
        if (this.j) {
            return this.h;
        }
        return 0;
    }

    public void h(int i) {
        this.h = i;
        this.j = true;
    }

    public int i() {
        return this.f;
    }

    public void i(int i) {
        this.f = i;
    }

    public boolean j() {
        return this.F.getInputMethodMode() == 2;
    }

    public boolean k() {
        return this.E;
    }
}
