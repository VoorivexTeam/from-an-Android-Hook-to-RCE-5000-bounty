package p000;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import androidx.core.graphics.drawable.C0239a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c */
/* loaded from: classes.dex */
public class C0499c extends Drawable implements Drawable.Callback {

    /* renamed from: b */
    private c f2841b;

    /* renamed from: c */
    private Rect f2842c;

    /* renamed from: d */
    private Drawable f2843d;

    /* renamed from: e */
    private Drawable f2844e;

    /* renamed from: g */
    private boolean f2846g;

    /* renamed from: i */
    private boolean f2848i;

    /* renamed from: j */
    private Runnable f2849j;

    /* renamed from: k */
    private long f2850k;

    /* renamed from: l */
    private long f2851l;

    /* renamed from: m */
    private b f2852m;

    /* renamed from: f */
    private int f2845f = 255;

    /* renamed from: h */
    private int f2847h = -1;

    /* renamed from: c$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0499c.this.m3476a(true);
            C0499c.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c$b */
    /* loaded from: classes.dex */
    public static class b implements Drawable.Callback {

        /* renamed from: b */
        private Drawable.Callback f2854b;

        b() {
        }

        /* renamed from: a */
        public Drawable.Callback m3479a() {
            Drawable.Callback callback = this.f2854b;
            this.f2854b = null;
            return callback;
        }

        /* renamed from: a */
        public b m3480a(Drawable.Callback callback) {
            this.f2854b = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f2854b;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f2854b;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c$c */
    /* loaded from: classes.dex */
    public static abstract class c extends Drawable.ConstantState {

        /* renamed from: A */
        int f2855A;

        /* renamed from: B */
        int f2856B;

        /* renamed from: C */
        boolean f2857C;

        /* renamed from: D */
        ColorFilter f2858D;

        /* renamed from: E */
        boolean f2859E;

        /* renamed from: F */
        ColorStateList f2860F;

        /* renamed from: G */
        PorterDuff.Mode f2861G;

        /* renamed from: H */
        boolean f2862H;

        /* renamed from: I */
        boolean f2863I;

        /* renamed from: a */
        final C0499c f2864a;

        /* renamed from: b */
        Resources f2865b;

        /* renamed from: c */
        int f2866c;

        /* renamed from: d */
        int f2867d;

        /* renamed from: e */
        int f2868e;

        /* renamed from: f */
        SparseArray<Drawable.ConstantState> f2869f;

        /* renamed from: g */
        Drawable[] f2870g;

        /* renamed from: h */
        int f2871h;

        /* renamed from: i */
        boolean f2872i;

        /* renamed from: j */
        boolean f2873j;

        /* renamed from: k */
        Rect f2874k;

        /* renamed from: l */
        boolean f2875l;

        /* renamed from: m */
        boolean f2876m;

        /* renamed from: n */
        int f2877n;

        /* renamed from: o */
        int f2878o;

        /* renamed from: p */
        int f2879p;

        /* renamed from: q */
        int f2880q;

        /* renamed from: r */
        boolean f2881r;

        /* renamed from: s */
        int f2882s;

        /* renamed from: t */
        boolean f2883t;

        /* renamed from: u */
        boolean f2884u;

        /* renamed from: v */
        boolean f2885v;

        /* renamed from: w */
        boolean f2886w;

        /* renamed from: x */
        boolean f2887x;

        /* renamed from: y */
        boolean f2888y;

        /* renamed from: z */
        int f2889z;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(c cVar, C0499c c0499c, Resources resources) {
            this.f2866c = 160;
            this.f2872i = false;
            this.f2875l = false;
            this.f2887x = true;
            this.f2855A = 0;
            this.f2856B = 0;
            this.f2864a = c0499c;
            this.f2865b = resources != null ? resources : cVar != null ? cVar.f2865b : null;
            int m3472a = C0499c.m3472a(resources, cVar != null ? cVar.f2866c : 0);
            this.f2866c = m3472a;
            if (cVar == null) {
                this.f2870g = new Drawable[10];
                this.f2871h = 0;
                return;
            }
            this.f2867d = cVar.f2867d;
            this.f2868e = cVar.f2868e;
            this.f2885v = true;
            this.f2886w = true;
            this.f2872i = cVar.f2872i;
            this.f2875l = cVar.f2875l;
            this.f2887x = cVar.f2887x;
            this.f2888y = cVar.f2888y;
            this.f2889z = cVar.f2889z;
            this.f2855A = cVar.f2855A;
            this.f2856B = cVar.f2856B;
            this.f2857C = cVar.f2857C;
            this.f2858D = cVar.f2858D;
            this.f2859E = cVar.f2859E;
            this.f2860F = cVar.f2860F;
            this.f2861G = cVar.f2861G;
            this.f2862H = cVar.f2862H;
            this.f2863I = cVar.f2863I;
            if (cVar.f2866c == m3472a) {
                if (cVar.f2873j) {
                    this.f2874k = new Rect(cVar.f2874k);
                    this.f2873j = true;
                }
                if (cVar.f2876m) {
                    this.f2877n = cVar.f2877n;
                    this.f2878o = cVar.f2878o;
                    this.f2879p = cVar.f2879p;
                    this.f2880q = cVar.f2880q;
                    this.f2876m = true;
                }
            }
            if (cVar.f2881r) {
                this.f2882s = cVar.f2882s;
                this.f2881r = true;
            }
            if (cVar.f2883t) {
                this.f2884u = cVar.f2884u;
                this.f2883t = true;
            }
            Drawable[] drawableArr = cVar.f2870g;
            this.f2870g = new Drawable[drawableArr.length];
            this.f2871h = cVar.f2871h;
            SparseArray<Drawable.ConstantState> sparseArray = cVar.f2869f;
            this.f2869f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f2871h);
            int i = this.f2871h;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null) {
                    Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                    if (constantState != null) {
                        this.f2869f.put(i2, constantState);
                    } else {
                        this.f2870g[i2] = drawableArr[i2];
                    }
                }
            }
        }

        /* renamed from: b */
        private Drawable m3481b(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f2889z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f2864a);
            return mutate;
        }

        /* renamed from: n */
        private void m3482n() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f2869f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f2870g[this.f2869f.keyAt(i)] = m3481b(this.f2869f.valueAt(i).newDrawable(this.f2865b));
                }
                this.f2869f = null;
            }
        }

        /* renamed from: a */
        public final int m3483a(Drawable drawable) {
            int i = this.f2871h;
            if (i >= this.f2870g.length) {
                mo3485a(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f2864a);
            this.f2870g[i] = drawable;
            this.f2871h++;
            this.f2868e = drawable.getChangingConfigurations() | this.f2868e;
            m3503k();
            this.f2874k = null;
            this.f2873j = false;
            this.f2876m = false;
            this.f2885v = false;
            return i;
        }

        /* renamed from: a */
        public final Drawable m3484a(int i) {
            int indexOfKey;
            Drawable drawable = this.f2870g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f2869f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable m3481b = m3481b(this.f2869f.valueAt(indexOfKey).newDrawable(this.f2865b));
            this.f2870g[i] = m3481b;
            this.f2869f.removeAt(indexOfKey);
            if (this.f2869f.size() == 0) {
                this.f2869f = null;
            }
            return m3481b;
        }

        /* renamed from: a */
        public void mo3485a(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            System.arraycopy(this.f2870g, 0, drawableArr, 0, i);
            this.f2870g = drawableArr;
        }

        /* renamed from: a */
        final void m3486a(Resources.Theme theme) {
            if (theme != null) {
                m3482n();
                int i = this.f2871h;
                Drawable[] drawableArr = this.f2870g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                        drawableArr[i2].applyTheme(theme);
                        this.f2868e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                m3487a(theme.getResources());
            }
        }

        /* renamed from: a */
        final void m3487a(Resources resources) {
            if (resources != null) {
                this.f2865b = resources;
                int m3472a = C0499c.m3472a(resources, this.f2866c);
                int i = this.f2866c;
                this.f2866c = m3472a;
                if (i != m3472a) {
                    this.f2876m = false;
                    this.f2873j = false;
                }
            }
        }

        /* renamed from: a */
        public final void m3488a(boolean z) {
            this.f2875l = z;
        }

        /* renamed from: a */
        public synchronized boolean m3489a() {
            if (this.f2885v) {
                return this.f2886w;
            }
            m3482n();
            this.f2885v = true;
            int i = this.f2871h;
            Drawable[] drawableArr = this.f2870g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f2886w = false;
                    return false;
                }
            }
            this.f2886w = true;
            return true;
        }

        /* renamed from: b */
        protected void m3490b() {
            this.f2876m = true;
            m3482n();
            int i = this.f2871h;
            Drawable[] drawableArr = this.f2870g;
            this.f2878o = -1;
            this.f2877n = -1;
            this.f2880q = 0;
            this.f2879p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f2877n) {
                    this.f2877n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f2878o) {
                    this.f2878o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f2879p) {
                    this.f2879p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f2880q) {
                    this.f2880q = minimumHeight;
                }
            }
        }

        /* renamed from: b */
        public final void m3491b(int i) {
            this.f2855A = i;
        }

        /* renamed from: b */
        public final void m3492b(boolean z) {
            this.f2872i = z;
        }

        /* renamed from: b */
        final boolean m3493b(int i, int i2) {
            int i3 = this.f2871h;
            Drawable[] drawableArr = this.f2870g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                    if (i4 == i2) {
                        z = layoutDirection;
                    }
                }
            }
            this.f2889z = i;
            return z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public final int m3494c() {
            return this.f2870g.length;
        }

        /* renamed from: c */
        public final void m3495c(int i) {
            this.f2856B = i;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i = this.f2871h;
            Drawable[] drawableArr = this.f2870g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f2869f.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final int m3496d() {
            return this.f2871h;
        }

        /* renamed from: e */
        public final int m3497e() {
            if (!this.f2876m) {
                m3490b();
            }
            return this.f2878o;
        }

        /* renamed from: f */
        public final int m3498f() {
            if (!this.f2876m) {
                m3490b();
            }
            return this.f2880q;
        }

        /* renamed from: g */
        public final int m3499g() {
            if (!this.f2876m) {
                m3490b();
            }
            return this.f2879p;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2867d | this.f2868e;
        }

        /* renamed from: h */
        public final Rect m3500h() {
            Rect rect = null;
            if (this.f2872i) {
                return null;
            }
            if (this.f2874k != null || this.f2873j) {
                return this.f2874k;
            }
            m3482n();
            Rect rect2 = new Rect();
            int i = this.f2871h;
            Drawable[] drawableArr = this.f2870g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect2)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect2.left;
                    if (i3 > rect.left) {
                        rect.left = i3;
                    }
                    int i4 = rect2.top;
                    if (i4 > rect.top) {
                        rect.top = i4;
                    }
                    int i5 = rect2.right;
                    if (i5 > rect.right) {
                        rect.right = i5;
                    }
                    int i6 = rect2.bottom;
                    if (i6 > rect.bottom) {
                        rect.bottom = i6;
                    }
                }
            }
            this.f2873j = true;
            this.f2874k = rect;
            return rect;
        }

        /* renamed from: i */
        public final int m3501i() {
            if (!this.f2876m) {
                m3490b();
            }
            return this.f2877n;
        }

        /* renamed from: j */
        public final int m3502j() {
            if (this.f2881r) {
                return this.f2882s;
            }
            m3482n();
            int i = this.f2871h;
            Drawable[] drawableArr = this.f2870g;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.f2882s = opacity;
            this.f2881r = true;
            return opacity;
        }

        /* renamed from: k */
        void m3503k() {
            this.f2881r = false;
            this.f2883t = false;
        }

        /* renamed from: l */
        public final boolean m3504l() {
            return this.f2875l;
        }

        /* renamed from: m */
        abstract void mo3233m();
    }

    /* renamed from: a */
    static int m3472a(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* renamed from: a */
    private void m3473a(Drawable drawable) {
        if (this.f2852m == null) {
            this.f2852m = new b();
        }
        b bVar = this.f2852m;
        bVar.m3480a(drawable.getCallback());
        drawable.setCallback(bVar);
        try {
            if (this.f2841b.f2855A <= 0 && this.f2846g) {
                drawable.setAlpha(this.f2845f);
            }
            if (this.f2841b.f2859E) {
                drawable.setColorFilter(this.f2841b.f2858D);
            } else {
                if (this.f2841b.f2862H) {
                    C0239a.m1480a(drawable, this.f2841b.f2860F);
                }
                if (this.f2841b.f2863I) {
                    C0239a.m1483a(drawable, this.f2841b.f2861G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f2841b.f2887x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (Build.VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.f2841b.f2857C);
            }
            Rect rect = this.f2842c;
            if (Build.VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f2852m.m3479a());
        }
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(23)
    /* renamed from: c */
    private boolean m3474c() {
        return isAutoMirrored() && getLayoutDirection() == 1;
    }

    /* renamed from: a */
    c mo3220a() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3475a(Resources resources) {
        this.f2841b.m3487a(resources);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3222a(c cVar) {
        this.f2841b = cVar;
        int i = this.f2847h;
        if (i >= 0) {
            Drawable m3484a = cVar.m3484a(i);
            this.f2843d = m3484a;
            if (m3484a != null) {
                m3473a(m3484a);
            }
        }
        this.f2844e = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m3476a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f2846g = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f2843d
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f2850k
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L20
            int r9 = r13.f2845f
            r3.setAlpha(r9)
            goto L36
        L20:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            c$c r9 = r13.f2841b
            int r9 = r9.f2855A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f2845f
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L39
        L36:
            r13.f2850k = r7
        L38:
            r3 = 0
        L39:
            android.graphics.drawable.Drawable r9 = r13.f2844e
            if (r9 == 0) goto L61
            long r10 = r13.f2851l
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L4e
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f2844e = r0
            goto L61
        L4e:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            c$c r4 = r13.f2841b
            int r4 = r4.f2856B
            int r3 = r3 / r4
            int r4 = r13.f2845f
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f2851l = r7
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            java.lang.Runnable r14 = r13.f2849j
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0499c.m3476a(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m3477a(int r10) {
        /*
            r9 = this;
            int r0 = r9.f2847h
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            c$c r0 = r9.f2841b
            int r0 = r0.f2856B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f2844e
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f2843d
            if (r0 == 0) goto L29
            r9.f2844e = r0
            c$c r0 = r9.f2841b
            int r0 = r0.f2856B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f2851l = r0
            goto L35
        L29:
            r9.f2844e = r4
            r9.f2851l = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f2843d
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            c$c r0 = r9.f2841b
            int r1 = r0.f2871h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.m3484a(r10)
            r9.f2843d = r0
            r9.f2847h = r10
            if (r0 == 0) goto L5a
            c$c r10 = r9.f2841b
            int r10 = r10.f2855A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f2850k = r2
        L51:
            r9.m3473a(r0)
            goto L5a
        L55:
            r9.f2843d = r4
            r10 = -1
            r9.f2847h = r10
        L5a:
            long r0 = r9.f2850k
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.f2851l
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L79
        L67:
            java.lang.Runnable r0 = r9.f2849j
            if (r0 != 0) goto L73
            c$a r0 = new c$a
            r0.<init>()
            r9.f2849j = r0
            goto L76
        L73:
            r9.unscheduleSelf(r0)
        L76:
            r9.m3476a(r10)
        L79:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0499c.m3477a(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f2841b.m3486a(theme);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m3478b() {
        return this.f2847h;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f2841b.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f2843d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f2844e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f2845f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f2841b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f2841b.m3489a()) {
            return null;
        }
        this.f2841b.f2867d = getChangingConfigurations();
        return this.f2841b;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f2843d;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f2842c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f2841b.m3504l()) {
            return this.f2841b.m3497e();
        }
        Drawable drawable = this.f2843d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f2841b.m3504l()) {
            return this.f2841b.m3501i();
        }
        Drawable drawable = this.f2843d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f2841b.m3504l()) {
            return this.f2841b.m3498f();
        }
        Drawable drawable = this.f2843d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f2841b.m3504l()) {
            return this.f2841b.m3499g();
        }
        Drawable drawable = this.f2843d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f2843d;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f2841b.m3502j();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f2843d;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect m3500h = this.f2841b.m3500h();
        if (m3500h != null) {
            rect.set(m3500h);
            padding = (m3500h.right | ((m3500h.left | m3500h.top) | m3500h.bottom)) != 0;
        } else {
            Drawable drawable = this.f2843d;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (m3474c()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        c cVar = this.f2841b;
        if (cVar != null) {
            cVar.m3503k();
        }
        if (drawable != this.f2843d || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f2841b.f2857C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f2844e;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f2844e = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f2843d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f2846g) {
                this.f2843d.setAlpha(this.f2845f);
            }
        }
        if (this.f2851l != 0) {
            this.f2851l = 0L;
            z = true;
        }
        if (this.f2850k != 0) {
            this.f2850k = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f2848i && super.mutate() == this) {
            c mo3220a = mo3220a();
            mo3220a.mo3233m();
            mo3222a(mo3220a);
            this.f2848i = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2844e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f2843d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return this.f2841b.m3493b(i, m3478b());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        Drawable drawable = this.f2844e;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f2843d;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f2844e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f2843d;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.f2843d || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f2846g && this.f2845f == i) {
            return;
        }
        this.f2846g = true;
        this.f2845f = i;
        Drawable drawable = this.f2843d;
        if (drawable != null) {
            if (this.f2850k == 0) {
                drawable.setAlpha(i);
            } else {
                m3476a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        c cVar = this.f2841b;
        if (cVar.f2857C != z) {
            cVar.f2857C = z;
            Drawable drawable = this.f2843d;
            if (drawable != null) {
                C0239a.m1484a(drawable, z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f2841b;
        cVar.f2859E = true;
        if (cVar.f2858D != colorFilter) {
            cVar.f2858D = colorFilter;
            Drawable drawable = this.f2843d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        c cVar = this.f2841b;
        if (cVar.f2887x != z) {
            cVar.f2887x = z;
            Drawable drawable = this.f2843d;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f2843d;
        if (drawable != null) {
            C0239a.m1478a(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f2842c;
        if (rect == null) {
            this.f2842c = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f2843d;
        if (drawable != null) {
            C0239a.m1479a(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        c cVar = this.f2841b;
        cVar.f2862H = true;
        if (cVar.f2860F != colorStateList) {
            cVar.f2860F = colorStateList;
            C0239a.m1480a(this.f2843d, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f2841b;
        cVar.f2863I = true;
        if (cVar.f2861G != mode) {
            cVar.f2861G = mode;
            C0239a.m1483a(this.f2843d, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f2844e;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f2843d;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f2843d || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
