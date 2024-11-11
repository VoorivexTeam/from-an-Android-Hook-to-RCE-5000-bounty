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
import androidx.appcompat.view.menu.InterfaceC0110s;
import androidx.core.widget.C0256h;
import java.lang.reflect.Method;
import p000.C3107q2;

/* renamed from: androidx.appcompat.widget.g0 */
/* loaded from: classes.dex */
public class C0172g0 implements InterfaceC0110s {

    /* renamed from: G */
    private static Method f1024G;

    /* renamed from: H */
    private static Method f1025H;

    /* renamed from: I */
    private static Method f1026I;

    /* renamed from: A */
    private final c f1027A;

    /* renamed from: B */
    final Handler f1028B;

    /* renamed from: C */
    private final Rect f1029C;

    /* renamed from: D */
    private Rect f1030D;

    /* renamed from: E */
    private boolean f1031E;

    /* renamed from: F */
    PopupWindow f1032F;

    /* renamed from: b */
    private Context f1033b;

    /* renamed from: c */
    private ListAdapter f1034c;

    /* renamed from: d */
    C0164c0 f1035d;

    /* renamed from: e */
    private int f1036e;

    /* renamed from: f */
    private int f1037f;

    /* renamed from: g */
    private int f1038g;

    /* renamed from: h */
    private int f1039h;

    /* renamed from: i */
    private int f1040i;

    /* renamed from: j */
    private boolean f1041j;

    /* renamed from: k */
    private boolean f1042k;

    /* renamed from: l */
    private boolean f1043l;

    /* renamed from: m */
    private int f1044m;

    /* renamed from: n */
    private boolean f1045n;

    /* renamed from: o */
    private boolean f1046o;

    /* renamed from: p */
    int f1047p;

    /* renamed from: q */
    private View f1048q;

    /* renamed from: r */
    private int f1049r;

    /* renamed from: s */
    private DataSetObserver f1050s;

    /* renamed from: t */
    private View f1051t;

    /* renamed from: u */
    private Drawable f1052u;

    /* renamed from: v */
    private AdapterView.OnItemClickListener f1053v;

    /* renamed from: w */
    private AdapterView.OnItemSelectedListener f1054w;

    /* renamed from: x */
    final g f1055x;

    /* renamed from: y */
    private final f f1056y;

    /* renamed from: z */
    private final e f1057z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.g0$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View m994e = C0172g0.this.m994e();
            if (m994e == null || m994e.getWindowToken() == null) {
                return;
            }
            C0172g0.this.mo604a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.g0$b */
    /* loaded from: classes.dex */
    public class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C0164c0 c0164c0;
            if (i == -1 || (c0164c0 = C0172g0.this.f1035d) == null) {
                return;
            }
            c0164c0.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.g0$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0172g0.this.m991c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.g0$d */
    /* loaded from: classes.dex */
    public class d extends DataSetObserver {
        d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (C0172g0.this.mo615d()) {
                C0172g0.this.mo604a();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            C0172g0.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.g0$e */
    /* loaded from: classes.dex */
    public class e implements AbsListView.OnScrollListener {
        e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i != 1 || C0172g0.this.m1004j() || C0172g0.this.f1032F.getContentView() == null) {
                return;
            }
            C0172g0 c0172g0 = C0172g0.this;
            c0172g0.f1028B.removeCallbacks(c0172g0.f1055x);
            C0172g0.this.f1055x.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.g0$f */
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
            if (action == 0 && (popupWindow = C0172g0.this.f1032F) != null && popupWindow.isShowing() && x >= 0 && x < C0172g0.this.f1032F.getWidth() && y >= 0 && y < C0172g0.this.f1032F.getHeight()) {
                C0172g0 c0172g0 = C0172g0.this;
                c0172g0.f1028B.postDelayed(c0172g0.f1055x, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            C0172g0 c0172g02 = C0172g0.this;
            c0172g02.f1028B.removeCallbacks(c0172g02.f1055x);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.g0$g */
    /* loaded from: classes.dex */
    public class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0164c0 c0164c0 = C0172g0.this.f1035d;
            if (c0164c0 == null || !C3107q2.m14931w(c0164c0) || C0172g0.this.f1035d.getCount() <= C0172g0.this.f1035d.getChildCount()) {
                return;
            }
            int childCount = C0172g0.this.f1035d.getChildCount();
            C0172g0 c0172g0 = C0172g0.this;
            if (childCount <= c0172g0.f1047p) {
                c0172g0.f1032F.setInputMethodMode(2);
                C0172g0.this.mo604a();
            }
        }
    }

    static {
        try {
            f1024G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
        }
        try {
            f1025H = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            f1026I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
        } catch (NoSuchMethodException unused3) {
        }
    }

    public C0172g0(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C0172g0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1036e = -2;
        this.f1037f = -2;
        this.f1040i = 1002;
        this.f1044m = 0;
        this.f1045n = false;
        this.f1046o = false;
        this.f1047p = Integer.MAX_VALUE;
        this.f1049r = 0;
        this.f1055x = new g();
        this.f1056y = new f();
        this.f1057z = new e();
        this.f1027A = new c();
        this.f1029C = new Rect();
        this.f1033b = context;
        this.f1028B = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ListPopupWindow, i, i2);
        this.f1038g = obtainStyledAttributes.getDimensionPixelOffset(R$styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(R$styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f1039h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1041j = true;
        }
        obtainStyledAttributes.recycle();
        C0189p c0189p = new C0189p(context, attributeSet, i, i2);
        this.f1032F = c0189p;
        c0189p.setInputMethodMode(1);
    }

    /* renamed from: a */
    private int m976a(View view, int i, boolean z) {
        Method method = f1025H;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f1032F, view, Integer.valueOf(i), Boolean.valueOf(z))).intValue();
            } catch (Exception unused) {
            }
        }
        return this.f1032F.getMaxAvailableHeight(view, i);
    }

    /* renamed from: c */
    private void m977c(boolean z) {
        Method method = f1024G;
        if (method != null) {
            try {
                method.invoke(this.f1032F, Boolean.valueOf(z));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0149  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m978l() {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0172g0.m978l():int");
    }

    /* renamed from: m */
    private void m979m() {
        View view = this.f1048q;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1048q);
            }
        }
    }

    /* renamed from: a */
    C0164c0 mo980a(Context context, boolean z) {
        return new C0164c0(context, z);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0110s
    /* renamed from: a */
    public void mo604a() {
        int m978l = m978l();
        boolean m1004j = m1004j();
        C0256h.m1586a(this.f1032F, this.f1040i);
        if (this.f1032F.isShowing()) {
            if (C3107q2.m14931w(m994e())) {
                int i = this.f1037f;
                if (i == -1) {
                    i = -1;
                } else if (i == -2) {
                    i = m994e().getWidth();
                }
                int i2 = this.f1036e;
                if (i2 == -1) {
                    if (!m1004j) {
                        m978l = -1;
                    }
                    if (m1004j) {
                        this.f1032F.setWidth(this.f1037f == -1 ? -1 : 0);
                        this.f1032F.setHeight(0);
                    } else {
                        this.f1032F.setWidth(this.f1037f == -1 ? -1 : 0);
                        this.f1032F.setHeight(-1);
                    }
                } else if (i2 != -2) {
                    m978l = i2;
                }
                this.f1032F.setOutsideTouchable((this.f1046o || this.f1045n) ? false : true);
                this.f1032F.update(m994e(), this.f1038g, this.f1039h, i < 0 ? -1 : i, m978l < 0 ? -1 : m978l);
                return;
            }
            return;
        }
        int i3 = this.f1037f;
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = m994e().getWidth();
        }
        int i4 = this.f1036e;
        if (i4 == -1) {
            m978l = -1;
        } else if (i4 != -2) {
            m978l = i4;
        }
        this.f1032F.setWidth(i3);
        this.f1032F.setHeight(m978l);
        m977c(true);
        this.f1032F.setOutsideTouchable((this.f1046o || this.f1045n) ? false : true);
        this.f1032F.setTouchInterceptor(this.f1056y);
        if (this.f1043l) {
            C0256h.m1588a(this.f1032F, this.f1042k);
        }
        Method method = f1026I;
        if (method != null) {
            try {
                method.invoke(this.f1032F, this.f1030D);
            } catch (Exception unused) {
            }
        }
        C0256h.m1587a(this.f1032F, m994e(), this.f1038g, this.f1039h, this.f1044m);
        this.f1035d.setSelection(-1);
        if (!this.f1031E || this.f1035d.isInTouchMode()) {
            m991c();
        }
        if (this.f1031E) {
            return;
        }
        this.f1028B.post(this.f1027A);
    }

    /* renamed from: a */
    public void m981a(int i) {
        this.f1032F.setAnimationStyle(i);
    }

    /* renamed from: a */
    public void m982a(Rect rect) {
        this.f1030D = rect;
    }

    /* renamed from: a */
    public void m983a(Drawable drawable) {
        this.f1032F.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public void m984a(View view) {
        this.f1051t = view;
    }

    /* renamed from: a */
    public void m985a(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1053v = onItemClickListener;
    }

    /* renamed from: a */
    public void mo986a(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1050s;
        if (dataSetObserver == null) {
            this.f1050s = new d();
        } else {
            ListAdapter listAdapter2 = this.f1034c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1034c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1050s);
        }
        C0164c0 c0164c0 = this.f1035d;
        if (c0164c0 != null) {
            c0164c0.setAdapter(this.f1034c);
        }
    }

    /* renamed from: a */
    public void m987a(PopupWindow.OnDismissListener onDismissListener) {
        this.f1032F.setOnDismissListener(onDismissListener);
    }

    /* renamed from: a */
    public void m988a(boolean z) {
        this.f1031E = z;
        this.f1032F.setFocusable(z);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0110s
    /* renamed from: b */
    public ListView mo609b() {
        return this.f1035d;
    }

    /* renamed from: b */
    public void m989b(int i) {
        Drawable background = this.f1032F.getBackground();
        if (background == null) {
            m1003i(i);
            return;
        }
        background.getPadding(this.f1029C);
        Rect rect = this.f1029C;
        this.f1037f = rect.left + rect.right + i;
    }

    /* renamed from: b */
    public void m990b(boolean z) {
        this.f1043l = true;
        this.f1042k = z;
    }

    /* renamed from: c */
    public void m991c() {
        C0164c0 c0164c0 = this.f1035d;
        if (c0164c0 != null) {
            c0164c0.setListSelectionHidden(true);
            c0164c0.requestLayout();
        }
    }

    /* renamed from: c */
    public void m992c(int i) {
        this.f1044m = i;
    }

    /* renamed from: d */
    public void m993d(int i) {
        this.f1038g = i;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0110s
    /* renamed from: d */
    public boolean mo615d() {
        return this.f1032F.isShowing();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0110s
    public void dismiss() {
        this.f1032F.dismiss();
        m979m();
        this.f1032F.setContentView(null);
        this.f1035d = null;
        this.f1028B.removeCallbacks(this.f1055x);
    }

    /* renamed from: e */
    public View m994e() {
        return this.f1051t;
    }

    /* renamed from: e */
    public void m995e(int i) {
        this.f1032F.setInputMethodMode(i);
    }

    /* renamed from: f */
    public Drawable m996f() {
        return this.f1032F.getBackground();
    }

    /* renamed from: f */
    public void m997f(int i) {
        this.f1049r = i;
    }

    /* renamed from: g */
    public int m998g() {
        return this.f1038g;
    }

    /* renamed from: g */
    public void m999g(int i) {
        C0164c0 c0164c0 = this.f1035d;
        if (!mo615d() || c0164c0 == null) {
            return;
        }
        c0164c0.setListSelectionHidden(false);
        c0164c0.setSelection(i);
        if (c0164c0.getChoiceMode() != 0) {
            c0164c0.setItemChecked(i, true);
        }
    }

    /* renamed from: h */
    public int m1000h() {
        if (this.f1041j) {
            return this.f1039h;
        }
        return 0;
    }

    /* renamed from: h */
    public void m1001h(int i) {
        this.f1039h = i;
        this.f1041j = true;
    }

    /* renamed from: i */
    public int m1002i() {
        return this.f1037f;
    }

    /* renamed from: i */
    public void m1003i(int i) {
        this.f1037f = i;
    }

    /* renamed from: j */
    public boolean m1004j() {
        return this.f1032F.getInputMethodMode() == 2;
    }

    /* renamed from: k */
    public boolean m1005k() {
        return this.f1031E;
    }
}
