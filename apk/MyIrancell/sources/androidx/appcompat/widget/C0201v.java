package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.R$attr;
import androidx.appcompat.view.menu.InterfaceC0110s;
import p000.C0000a;
import p000.C3107q2;
import p000.InterfaceC3068p2;

/* renamed from: androidx.appcompat.widget.v */
/* loaded from: classes.dex */
public class C0201v extends Spinner implements InterfaceC3068p2 {

    /* renamed from: j */
    private static final int[] f1248j = {R.attr.spinnerMode};

    /* renamed from: b */
    private final C0165d f1249b;

    /* renamed from: c */
    private final Context f1250c;

    /* renamed from: d */
    private AbstractViewOnTouchListenerC0168e0 f1251d;

    /* renamed from: e */
    private SpinnerAdapter f1252e;

    /* renamed from: f */
    private final boolean f1253f;

    /* renamed from: g */
    c f1254g;

    /* renamed from: h */
    int f1255h;

    /* renamed from: i */
    final Rect f1256i;

    /* renamed from: androidx.appcompat.widget.v$a */
    /* loaded from: classes.dex */
    class a extends AbstractViewOnTouchListenerC0168e0 {

        /* renamed from: k */
        final /* synthetic */ c f1257k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, c cVar) {
            super(view);
            this.f1257k = cVar;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0168e0
        /* renamed from: a */
        public InterfaceC0110s mo562a() {
            return this.f1257k;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0168e0
        /* renamed from: b */
        public boolean mo563b() {
            if (C0201v.this.f1254g.mo615d()) {
                return true;
            }
            C0201v.this.f1254g.mo604a();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.v$b */
    /* loaded from: classes.dex */
    public static class b implements ListAdapter, SpinnerAdapter {

        /* renamed from: b */
        private SpinnerAdapter f1259b;

        /* renamed from: c */
        private ListAdapter f1260c;

        public b(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1259b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1260c = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                        return;
                    }
                    return;
                }
                if (spinnerAdapter instanceof InterfaceC0190p0) {
                    InterfaceC0190p0 interfaceC0190p0 = (InterfaceC0190p0) spinnerAdapter;
                    if (interfaceC0190p0.getDropDownViewTheme() == null) {
                        interfaceC0190p0.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1260c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1259b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1259b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f1259b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f1259b;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1259b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1260c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1259b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1259b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.v$c */
    /* loaded from: classes.dex */
    public class c extends C0172g0 {

        /* renamed from: J */
        private CharSequence f1261J;

        /* renamed from: K */
        ListAdapter f1262K;

        /* renamed from: L */
        private final Rect f1263L;

        /* renamed from: androidx.appcompat.widget.v$c$a */
        /* loaded from: classes.dex */
        class a implements AdapterView.OnItemClickListener {
            a(C0201v c0201v) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0201v.this.setSelection(i);
                if (C0201v.this.getOnItemClickListener() != null) {
                    c cVar = c.this;
                    C0201v.this.performItemClick(view, i, cVar.f1262K.getItemId(i));
                }
                c.this.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.widget.v$c$b */
        /* loaded from: classes.dex */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                c cVar = c.this;
                if (!cVar.m1173b(C0201v.this)) {
                    c.this.dismiss();
                } else {
                    c.this.m1174l();
                    c.super.mo604a();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.widget.v$c$c, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C3551c implements PopupWindow.OnDismissListener {

            /* renamed from: b */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1267b;

            C3551c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1267b = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C0201v.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1267b);
                }
            }
        }

        public c(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f1263L = new Rect();
            m984a(C0201v.this);
            m988a(true);
            m997f(0);
            m985a(new a(C0201v.this));
        }

        @Override // androidx.appcompat.widget.C0172g0, androidx.appcompat.view.menu.InterfaceC0110s
        /* renamed from: a */
        public void mo604a() {
            ViewTreeObserver viewTreeObserver;
            boolean mo615d = mo615d();
            m1174l();
            m995e(2);
            super.mo604a();
            mo609b().setChoiceMode(1);
            m999g(C0201v.this.getSelectedItemPosition());
            if (mo615d || (viewTreeObserver = C0201v.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            m987a(new C3551c(bVar));
        }

        @Override // androidx.appcompat.widget.C0172g0
        /* renamed from: a */
        public void mo986a(ListAdapter listAdapter) {
            super.mo986a(listAdapter);
            this.f1262K = listAdapter;
        }

        /* renamed from: a */
        public void m1172a(CharSequence charSequence) {
            this.f1261J = charSequence;
        }

        /* renamed from: b */
        boolean m1173b(View view) {
            return C3107q2.m14931w(view) && view.getGlobalVisibleRect(this.f1263L);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
        /* renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void m1174l() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.m996f()
                r1 = 0
                if (r0 == 0) goto L26
                androidx.appcompat.widget.v r1 = androidx.appcompat.widget.C0201v.this
                android.graphics.Rect r1 = r1.f1256i
                r0.getPadding(r1)
                androidx.appcompat.widget.v r0 = androidx.appcompat.widget.C0201v.this
                boolean r0 = androidx.appcompat.widget.C0210z0.m1244a(r0)
                if (r0 == 0) goto L1d
                androidx.appcompat.widget.v r0 = androidx.appcompat.widget.C0201v.this
                android.graphics.Rect r0 = r0.f1256i
                int r0 = r0.right
                goto L24
            L1d:
                androidx.appcompat.widget.v r0 = androidx.appcompat.widget.C0201v.this
                android.graphics.Rect r0 = r0.f1256i
                int r0 = r0.left
                int r0 = -r0
            L24:
                r1 = r0
                goto L2e
            L26:
                androidx.appcompat.widget.v r0 = androidx.appcompat.widget.C0201v.this
                android.graphics.Rect r0 = r0.f1256i
                r0.right = r1
                r0.left = r1
            L2e:
                androidx.appcompat.widget.v r0 = androidx.appcompat.widget.C0201v.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.v r2 = androidx.appcompat.widget.C0201v.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.v r3 = androidx.appcompat.widget.C0201v.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.v r4 = androidx.appcompat.widget.C0201v.this
                int r5 = r4.f1255h
                r6 = -2
                if (r5 != r6) goto L78
                android.widget.ListAdapter r5 = r8.f1262K
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.m996f()
                int r4 = r4.m1170a(r5, r6)
                androidx.appcompat.widget.v r5 = androidx.appcompat.widget.C0201v.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.v r6 = androidx.appcompat.widget.C0201v.this
                android.graphics.Rect r6 = r6.f1256i
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L70
                r4 = r5
            L70:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L7e
            L78:
                r4 = -1
                if (r5 != r4) goto L82
                int r4 = r3 - r0
                int r4 = r4 - r2
            L7e:
                r8.m989b(r4)
                goto L85
            L82:
                r8.m989b(r5)
            L85:
                androidx.appcompat.widget.v r4 = androidx.appcompat.widget.C0201v.this
                boolean r4 = androidx.appcompat.widget.C0210z0.m1244a(r4)
                if (r4 == 0) goto L95
                int r3 = r3 - r2
                int r0 = r8.m1002i()
                int r3 = r3 - r0
                int r1 = r1 + r3
                goto L96
            L95:
                int r1 = r1 + r0
            L96:
                r8.m993d(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0201v.c.m1174l():void");
        }

        /* renamed from: m */
        public CharSequence m1175m() {
            return this.f1261J;
        }
    }

    public C0201v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.spinnerStyle);
    }

    public C0201v(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public C0201v(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r10 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        r10.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (r10 == null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0201v(android.content.Context r6, android.util.AttributeSet r7, int r8, int r9, android.content.res.Resources.Theme r10) {
        /*
            r5 = this;
            r5.<init>(r6, r7, r8)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.f1256i = r0
            int[] r0 = androidx.appcompat.R$styleable.Spinner
            r1 = 0
            androidx.appcompat.widget.t0 r0 = androidx.appcompat.widget.C0198t0.m1133a(r6, r7, r0, r8, r1)
            androidx.appcompat.widget.d r2 = new androidx.appcompat.widget.d
            r2.<init>(r5)
            r5.f1249b = r2
            r2 = 0
            if (r10 == 0) goto L23
            j r3 = new j
            r3.<init>(r6, r10)
        L20:
            r5.f1250c = r3
            goto L3c
        L23:
            int r10 = androidx.appcompat.R$styleable.Spinner_popupTheme
            int r10 = r0.m1151g(r10, r1)
            if (r10 == 0) goto L31
            j r3 = new j
            r3.<init>(r6, r10)
            goto L20
        L31:
            int r10 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r10 >= r3) goto L39
            r10 = r6
            goto L3a
        L39:
            r10 = r2
        L3a:
            r5.f1250c = r10
        L3c:
            android.content.Context r10 = r5.f1250c
            r3 = 1
            if (r10 == 0) goto La0
            r10 = -1
            if (r9 != r10) goto L68
            int[] r10 = androidx.appcompat.widget.C0201v.f1248j     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L64
            android.content.res.TypedArray r10 = r6.obtainStyledAttributes(r7, r10, r8, r1)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L64
            boolean r4 = r10.hasValue(r1)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L65
            if (r4 == 0) goto L54
            int r9 = r10.getInt(r1, r1)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L65
        L54:
            if (r10 == 0) goto L68
        L56:
            r10.recycle()
            goto L68
        L5a:
            r6 = move-exception
            r2 = r10
            goto L5e
        L5d:
            r6 = move-exception
        L5e:
            if (r2 == 0) goto L63
            r2.recycle()
        L63:
            throw r6
        L64:
            r10 = r2
        L65:
            if (r10 == 0) goto L68
            goto L56
        L68:
            if (r9 != r3) goto La0
            androidx.appcompat.widget.v$c r9 = new androidx.appcompat.widget.v$c
            android.content.Context r10 = r5.f1250c
            r9.<init>(r10, r7, r8)
            android.content.Context r10 = r5.f1250c
            int[] r4 = androidx.appcompat.R$styleable.Spinner
            androidx.appcompat.widget.t0 r10 = androidx.appcompat.widget.C0198t0.m1133a(r10, r7, r4, r8, r1)
            int r1 = androidx.appcompat.R$styleable.Spinner_android_dropDownWidth
            r4 = -2
            int r1 = r10.m1149f(r1, r4)
            r5.f1255h = r1
            int r1 = androidx.appcompat.R$styleable.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r1 = r10.m1142b(r1)
            r9.m983a(r1)
            int r1 = androidx.appcompat.R$styleable.Spinner_android_prompt
            java.lang.String r1 = r0.m1146d(r1)
            r9.m1172a(r1)
            r10.m1138a()
            r5.f1254g = r9
            androidx.appcompat.widget.v$a r10 = new androidx.appcompat.widget.v$a
            r10.<init>(r5, r9)
            r5.f1251d = r10
        La0:
            int r9 = androidx.appcompat.R$styleable.Spinner_android_entries
            java.lang.CharSequence[] r9 = r0.m1150f(r9)
            if (r9 == 0) goto Lb8
            android.widget.ArrayAdapter r10 = new android.widget.ArrayAdapter
            r1 = 17367048(0x1090008, float:2.5162948E-38)
            r10.<init>(r6, r1, r9)
            int r6 = androidx.appcompat.R$layout.support_simple_spinner_dropdown_item
            r10.setDropDownViewResource(r6)
            r5.setAdapter(r10)
        Lb8:
            r0.m1138a()
            r5.f1253f = r3
            android.widget.SpinnerAdapter r6 = r5.f1252e
            if (r6 == 0) goto Lc6
            r5.setAdapter(r6)
            r5.f1252e = r2
        Lc6:
            androidx.appcompat.widget.d r6 = r5.f1249b
            r6.m947a(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0201v.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* renamed from: a */
    int m1170a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f1256i);
        Rect rect = this.f1256i;
        return i2 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0165d c0165d = this.f1249b;
        if (c0165d != null) {
            c0165d.m942a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        c cVar = this.f1254g;
        if (cVar != null) {
            return cVar.m998g();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        c cVar = this.f1254g;
        if (cVar != null) {
            return cVar.m1000h();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f1254g != null) {
            return this.f1255h;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        c cVar = this.f1254g;
        if (cVar != null) {
            return cVar.m996f();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        if (this.f1254g != null) {
            return this.f1250c;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        c cVar = this.f1254g;
        return cVar != null ? cVar.m1175m() : super.getPrompt();
    }

    @Override // p000.InterfaceC3068p2
    public ColorStateList getSupportBackgroundTintList() {
        C0165d c0165d = this.f1249b;
        if (c0165d != null) {
            return c0165d.m948b();
        }
        return null;
    }

    @Override // p000.InterfaceC3068p2
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0165d c0165d = this.f1249b;
        if (c0165d != null) {
            return c0165d.m950c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f1254g;
        if (cVar == null || !cVar.mo615d()) {
            return;
        }
        this.f1254g.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1254g == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m1170a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC0168e0 abstractViewOnTouchListenerC0168e0 = this.f1251d;
        if (abstractViewOnTouchListenerC0168e0 == null || !abstractViewOnTouchListenerC0168e0.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        c cVar = this.f1254g;
        if (cVar == null) {
            return super.performClick();
        }
        if (cVar.mo615d()) {
            return true;
        }
        this.f1254g.mo604a();
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1253f) {
            this.f1252e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1254g != null) {
            Context context = this.f1250c;
            if (context == null) {
                context = getContext();
            }
            this.f1254g.mo986a(new b(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0165d c0165d = this.f1249b;
        if (c0165d != null) {
            c0165d.m946a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0165d c0165d = this.f1249b;
        if (c0165d != null) {
            c0165d.m943a(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        c cVar = this.f1254g;
        if (cVar != null) {
            cVar.m993d(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        c cVar = this.f1254g;
        if (cVar != null) {
            cVar.m1001h(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f1254g != null) {
            this.f1255h = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        c cVar = this.f1254g;
        if (cVar != null) {
            cVar.m983a(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0000a.m4c(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        c cVar = this.f1254g;
        if (cVar != null) {
            cVar.m1172a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // p000.InterfaceC3068p2
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0165d c0165d = this.f1249b;
        if (c0165d != null) {
            c0165d.m949b(colorStateList);
        }
    }

    @Override // p000.InterfaceC3068p2
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0165d c0165d = this.f1249b;
        if (c0165d != null) {
            c0165d.m945a(mode);
        }
    }
}
