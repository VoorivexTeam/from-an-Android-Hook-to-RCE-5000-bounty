package com.comviva.webaxn.p002ui;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager.widget.ViewPager;
import com.comviva.webaxn.utils.C0687b;
import com.comviva.webaxn.utils.C0713j1;
import com.comviva.webaxn.utils.C0731p1;
import com.comviva.webaxn.utils.C0744u;
import com.comviva.webaxn.utils.C0755x1;
import com.comviva.webaxn.utils.TapsellSDKAdv;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.tabs.TabLayout;
import com.viewpagerindicator.InterfaceC2350c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import p000.C0023aj;
import p000.C0482bj;
import p000.C2391dj;
import p000.C2434ej;
import p000.C2475fj;
import p000.C2515gj;
import p000.C2555hj;
import p000.C2597ij;
import p000.C3107q2;
import p000.C3264tj;
import p000.C3361vj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.k0 */
/* loaded from: classes.dex */
public class C0642k0 extends AbstractC0652n1 {

    /* renamed from: W */
    private static int f3893W;

    /* renamed from: A */
    private C0661r0 f3894A;

    /* renamed from: B */
    private C3489yj f3895B;

    /* renamed from: C */
    private NestedScrollView f3896C;

    /* renamed from: D */
    private RelativeLayout f3897D;

    /* renamed from: E */
    private C0662s f3898E;

    /* renamed from: F */
    private boolean f3899F;

    /* renamed from: G */
    private C3489yj f3900G;

    /* renamed from: H */
    private C3489yj f3901H;

    /* renamed from: I */
    private C0655o1 f3902I;

    /* renamed from: J */
    private C0639j0 f3903J;

    /* renamed from: K */
    public C0669v0 f3904K;

    /* renamed from: L */
    public C0669v0 f3905L;

    /* renamed from: M */
    private int f3906M;

    /* renamed from: N */
    private int f3907N;

    /* renamed from: O */
    private int f3908O;

    /* renamed from: P */
    private TabLayout f3909P;

    /* renamed from: Q */
    private ViewPager f3910Q;

    /* renamed from: R */
    private ArrayList<View> f3911R;

    /* renamed from: S */
    private ArrayList<C0619c1> f3912S;

    /* renamed from: T */
    private InterfaceC2350c f3913T;

    /* renamed from: U */
    private int f3914U;

    /* renamed from: V */
    public View.OnClickListener f3915V;

    /* renamed from: x */
    private View f3916x;

    /* renamed from: y */
    private ShimmerFrameLayout f3917y;

    /* renamed from: z */
    private AbsoluteLayout f3918z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.k0$a */
    /* loaded from: classes.dex */
    public class a implements ViewPager.InterfaceC0425j {
        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0425j
        /* renamed from: a */
        public void mo3155a(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0425j
        /* renamed from: a */
        public void mo3156a(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0425j
        /* renamed from: b */
        public void mo3157b(int i) {
            if (C0642k0.this.f3895B.f14184U != null) {
                C0642k0.this.f3895B.f14184U[0] = i;
            }
            if (C0642k0.this.f3902I.m4829w()) {
                C0642k0 c0642k0 = C0642k0.this;
                C0755x1.m6151a(c0642k0.f4045c, (C3489yj) null, c0642k0.f3902I.m4824r().getApplicationWindowToken());
            }
            C0642k0.this.m4546a(i, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.k0$b */
    /* loaded from: classes.dex */
    public class b implements ViewPager.InterfaceC0425j {
        b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0425j
        /* renamed from: a */
        public void mo3155a(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0425j
        /* renamed from: a */
        public void mo3156a(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0425j
        /* renamed from: b */
        public void mo3157b(int i) {
            if (C0642k0.this.f3895B.f14184U != null) {
                C0642k0.this.f3895B.f14184U[0] = i;
            }
            if (C0642k0.this.f3902I.m4829w()) {
                C0642k0 c0642k0 = C0642k0.this;
                C0755x1.m6151a(c0642k0.f4045c, (C3489yj) null, c0642k0.f3902I.m4824r().getApplicationWindowToken());
            }
            C0642k0.this.m4546a(i, false);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.k0$c */
    /* loaded from: classes.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!TextUtils.isEmpty(C0642k0.this.f3895B.f14258u1)) {
                C0642k0 c0642k0 = C0642k0.this;
                c0642k0.m4707a(c0642k0.f3895B.f14258u1);
            }
            C0642k0 c0642k02 = C0642k0.this;
            c0642k02.f4049g.mo4849b(c0642k02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.k0$d */
    /* loaded from: classes.dex */
    public class d extends ViewOnTouchListenerC0612a0 {
        d(Context context, boolean z) {
            super(context, z);
        }

        @Override // com.comviva.webaxn.p002ui.ViewOnTouchListenerC0612a0
        /* renamed from: a */
        public void mo4160a(boolean z) {
            super.mo4160a(z);
            if (z) {
                C0642k0 c0642k0 = C0642k0.this;
                c0642k0.f4049g.mo4849b(c0642k0.f3895B.f14197a0);
            }
        }

        @Override // com.comviva.webaxn.p002ui.ViewOnTouchListenerC0612a0
        /* renamed from: b */
        public void mo4161b(boolean z) {
            super.mo4161b(z);
        }

        @Override // com.comviva.webaxn.p002ui.ViewOnTouchListenerC0612a0
        /* renamed from: c */
        public void mo4162c(boolean z) {
            super.mo4162c(z);
        }

        @Override // com.comviva.webaxn.p002ui.ViewOnTouchListenerC0612a0
        /* renamed from: d */
        public void mo4163d(boolean z) {
            super.mo4163d(z);
        }

        @Override // com.comviva.webaxn.p002ui.ViewOnTouchListenerC0612a0
        /* renamed from: e */
        public void mo4164e(boolean z) {
            super.mo4164e(z);
            if (C0642k0.this.f3895B.f14175P0 == null || C0642k0.this.f3895B.f14175P0.get("leftswipe") == null) {
                return;
            }
            C0642k0 c0642k0 = C0642k0.this;
            c0642k0.f4049g.mo4844a(c0642k0.f3895B, C0642k0.this.f3895B.f14175P0.get("leftswipe"));
        }

        @Override // com.comviva.webaxn.p002ui.ViewOnTouchListenerC0612a0
        /* renamed from: f */
        public void mo4165f(boolean z) {
            super.mo4165f(z);
            if (C0642k0.this.f3895B.f14175P0 == null || C0642k0.this.f3895B.f14175P0.get("rightswipe") == null) {
                return;
            }
            C0642k0 c0642k0 = C0642k0.this;
            c0642k0.f4049g.mo4844a(c0642k0.f3895B, C0642k0.this.f3895B.f14175P0.get("rightswipe"));
        }

        @Override // com.comviva.webaxn.p002ui.ViewOnTouchListenerC0612a0
        /* renamed from: g */
        public void mo4166g(boolean z) {
            super.mo4166g(z);
        }
    }

    public C0642k0(Context context, C3489yj c3489yj, C0655o1 c0655o1, C0639j0 c0639j0, C0669v0 c0669v0, ViewGroup viewGroup) {
        super(context);
        int i;
        NestedScrollView nestedScrollView;
        View view;
        this.f3899F = false;
        this.f3909P = null;
        this.f3910Q = null;
        this.f3911R = null;
        this.f3912S = null;
        this.f3914U = 0;
        this.f3915V = new c();
        this.f3895B = c3489yj;
        this.f3902I = c0655o1;
        f3893W = 70;
        this.f3918z = new AbsoluteLayout(this.f4045c);
        float f = this.f3895B.f14196a;
        if (f > 0.0f) {
            f3893W = (int) (f * 70.0f);
        }
        this.f4050h = AbstractC0652n1.m4701d(C0713j1.m5563a(this.f4045c).m5664f0());
        C0639j0 c0639j02 = new C0639j0(context);
        this.f3903J = c0639j02;
        c0639j02.f3875l = c0639j0;
        if (c0639j0 != null) {
            c0639j0.f3878o.add(c0639j02);
            c0669v0.f4407m = this.f3903J;
        }
        m4556b(this.f3903J, c0669v0);
        C2434ej c2434ej = this.f3895B.f14173O0;
        if (c2434ej != null) {
            c2434ej.m11615a(this.f3903J.f3869f);
        }
        C0657p0 c0657p0 = new C0657p0(0, 0, 0, 0, 1.0f);
        AbsoluteLayout absoluteLayout = this.f3918z;
        this.f3916x = absoluteLayout;
        C3489yj c3489yj2 = this.f3895B;
        int i2 = c3489yj2.f14208e;
        if (i2 == 33) {
            this.f3897D = new RelativeLayout(this.f4045c);
            new C0660r(this.f4045c, this.f3895B, c0669v0, this.f3897D, c0657p0, this.f3902I.f4134b);
            this.f3897D.addView(this.f3918z);
            this.f3916x = this.f3897D;
        } else if (i2 == 36) {
            this.f3898E = new C0662s(this.f4045c, c3489yj2, c0669v0, absoluteLayout, c0657p0, this.f3902I.f4134b);
        } else if (i2 == 39) {
            m4591s();
        }
        if (this.f3903J.f3870g > 0 && (i = this.f3895B.f14208e) != 39 && i != 40) {
            NestedScrollView nestedScrollView2 = new NestedScrollView(this.f4045c);
            this.f3896C = nestedScrollView2;
            nestedScrollView2.setVerticalScrollBarEnabled(false);
            this.f3896C.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            if (this.f3895B.f14208e == 33) {
                nestedScrollView = this.f3896C;
                view = this.f3897D;
            } else {
                nestedScrollView = this.f3896C;
                view = this.f3918z;
            }
            nestedScrollView.addView(view);
            this.f3916x = this.f3896C;
        }
        HashMap<String, C2555hj> hashMap = this.f3895B.f14175P0;
        if (hashMap != null && hashMap.get("pulltorefresh") != null) {
            C0661r0 c0661r0 = new C0661r0(this.f4045c);
            this.f3894A = c0661r0;
            c0661r0.setRenderingEventCb(this.f4049g);
            this.f3894A.setPullToRefreshAction(this.f3895B.f14175P0.get("pulltorefresh").m12225b());
            this.f3894A.setAPM(this.f3895B.f14175P0.get("pulltorefresh").m12223a());
            NestedScrollView nestedScrollView3 = this.f3896C;
            if (nestedScrollView3 != null) {
                this.f3894A.setScrollView(nestedScrollView3);
            } else {
                this.f3894A.setIsPullAllowed(true);
            }
            this.f3894A.addView(this.f3916x);
            this.f3894A.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f3916x = this.f3894A;
        }
        C3489yj c3489yj3 = this.f3895B;
        if (c3489yj3.f14157G0 != null && c3489yj3.f14208e == 25) {
            ShimmerFrameLayout shimmerFrameLayout = new ShimmerFrameLayout(this.f4045c);
            this.f3917y = shimmerFrameLayout;
            shimmerFrameLayout.addView(this.f3916x);
            this.f3916x = this.f3917y;
        }
        C3489yj c3489yj4 = this.f3895B;
        if (c3489yj4.f14165K0 == 8 && c3489yj4.f14167L0 != null) {
            this.f3897D = new RelativeLayout(this.f4045c);
            new TapsellSDKAdv().m5307a(this.f4045c, this.f3897D, this.f3895B.f14167L0);
            this.f3916x = this.f3897D;
        }
        C3489yj c3489yj5 = this.f3895B;
        if (c3489yj5.f14165K0 == 9 && c3489yj5.f14167L0 != null) {
            this.f3897D = new RelativeLayout(this.f4045c);
            TapsellSDKAdv tapsellSDKAdv = new TapsellSDKAdv();
            tapsellSDKAdv.m5306a(this.f4045c, this.f3895B.f14167L0.m3399a(), this.f3895B.f14167L0.m3402b());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            this.f3897D.addView(tapsellSDKAdv.m5305a(), layoutParams);
            this.f3916x = this.f3897D;
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f3916x);
        }
        if (!TextUtils.isEmpty(this.f3895B.f14249r1)) {
            this.f3916x.setContentDescription(this.f3895B.f14249r1);
        }
        C3361vj c3361vj = this.f3895B.f14246q1;
        if (c3361vj != null) {
            C3107q2.m14884a(this.f3916x, c3361vj.m16034a());
        }
        this.f3908O = m4589q();
        this.f3904K = new C0669v0();
        C0669v0 c0669v02 = new C0669v0();
        this.f3905L = c0669v02;
        c0669v02.f4397c = new Rect();
        C3489yj c3489yj6 = this.f3895B;
        if (c3489yj6.f14208e == 36) {
            int m14607c = c3489yj6.f14171N0.m14607c(this.f3903J.f3868e, c3489yj6.f14196a);
            C3489yj c3489yj7 = this.f3895B;
            int m14596a = c3489yj7.f14171N0.m14596a(this.f3903J.f3868e, c3489yj7.f14196a);
            C3489yj c3489yj8 = this.f3895B;
            if (m14596a < c3489yj8.f14171N0.m14602b(this.f3903J.f3868e, c3489yj8.f14196a)) {
                C3489yj c3489yj9 = this.f3895B;
                m14596a = c3489yj9.f14171N0.m14602b(this.f3903J.f3868e, c3489yj9.f14196a);
            }
            int i3 = (this.f3903J.f3868e / 2) - (m14607c < m14596a ? m14596a : m14607c);
            double sqrt = Math.sqrt(2.0d);
            Double.isNaN(i3);
            String str = String.valueOf((int) ((this.f3903J.f3868e - ((int) (sqrt * r0))) / (this.f3895B.f14196a * 2.0f))) + "px";
            C3489yj c3489yj10 = this.f3895B;
            c3489yj10.f14154F = str;
            c3489yj10.f14156G = str;
            c3489yj10.f14158H = str;
            c3489yj10.f14160I = str;
        }
        C0669v0 c0669v03 = this.f3904K;
        int m16639e = this.f3895B.m16639e(this.f3903J.f3868e) + c0657p0.f4218a;
        int m16644j = this.f3895B.m16644j(this.f3903J.f3868e) + c0657p0.f4219b;
        int i4 = this.f3903J.f3868e;
        int m16642h = i4 - (this.f3895B.m16642h(i4) + c0657p0.f4220c);
        C0639j0 c0639j03 = this.f3903J;
        c0669v03.f4397c = new Rect(m16639e, m16644j, m16642h, c0639j03.f3869f - (this.f3895B.m16635b(c0639j03.f3868e) + c0657p0.f4221d));
        C0669v0 c0669v04 = this.f3904K;
        Rect rect = c0669v04.f4397c;
        c0669v04.f4395a = rect.left;
        c0669v04.f4396b = rect.top;
        if (this.f3895B.f14221i0 == 4) {
            c0669v04.f4405k = true;
        }
    }

    /* renamed from: a */
    private int m4540a(int i, int i2, int i3, int i4, int i5, int i6, C0639j0 c0639j0) {
        int i7;
        int i8;
        int i9;
        int i10;
        C3489yj c3489yj = c0639j0.f3879p;
        if (c3489yj.f14214g.equalsIgnoreCase("C") || c3489yj.f14214g.equalsIgnoreCase("Center")) {
            if (i5 > i) {
                i7 = c0639j0.f3866c;
                i8 = (i5 - i) / 2;
                c0639j0.f3866c = i7 + i8;
            }
            i5 = 0;
        } else {
            if ((c3489yj.f14214g.equalsIgnoreCase("R") || c3489yj.f14214g.equalsIgnoreCase("Right")) && i < i5) {
                i7 = c0639j0.f3866c;
                i8 = i5 - i;
                c0639j0.f3866c = i7 + i8;
            }
            i5 = 0;
        }
        if (i2 != 0) {
            int i11 = c0639j0.f3873j;
            if (c3489yj.f14217h.equalsIgnoreCase("B") || c3489yj.f14217h.equalsIgnoreCase("Bottom")) {
                if (i11 < i2) {
                    c0639j0.f3867d += i2 - i11;
                }
                int i12 = c0639j0.f3867d + i4;
                c0639j0.f3867d = i12;
                if (i6 > 0 && (i9 = c0639j0.f3874k) >= 0) {
                    i10 = i12 + (i9 - i6);
                    c0639j0.f3867d = i10;
                }
            } else if (c3489yj.f14217h.equalsIgnoreCase("M") || c3489yj.f14217h.equalsIgnoreCase("Middle")) {
                if (i11 < i2) {
                    c0639j0.f3867d += (i2 - i11) / 2;
                }
                i10 = c0639j0.f3867d + (i4 / 2);
                c0639j0.f3867d = i10;
            }
        }
        AbstractC0652n1 abstractC0652n1 = c0639j0.f3877n;
        if (abstractC0652n1 != null) {
            abstractC0652n1.mo4139a(new AbsoluteLayout.LayoutParams(c0639j0.f3868e, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d));
        }
        return i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fc  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.comviva.webaxn.p002ui.C0669v0 m4541a(com.comviva.webaxn.p002ui.C0669v0 r11, com.comviva.webaxn.p002ui.C0639j0 r12, p000.C3489yj r13, p000.C3489yj r14) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0642k0.m4541a(com.comviva.webaxn.ui.v0, com.comviva.webaxn.ui.j0, yj, yj):com.comviva.webaxn.ui.v0");
    }

    /* renamed from: a */
    private ArrayList<Integer> m4542a(C0639j0 c0639j0, int i) {
        Integer valueOf;
        int i2;
        int i3 = c0639j0.f3878o.get(i).f3865b;
        int i4 = c0639j0.f3878o.get(i).f3869f;
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i < c0639j0.f3878o.size()) {
            C0639j0 c0639j02 = c0639j0.f3878o.get(i);
            if (!m4553a(i3, i4, c0639j02.f3865b, c0639j02.f3869f)) {
                break;
            }
            i4 = c0639j02.f3869f;
            i3 = c0639j02.f3865b;
            if (i5 < i4) {
                i5 = i4;
            }
            int i9 = c0639j02.f3874k;
            if (i8 < i9) {
                i8 = i9;
            }
            if (!m4566c(c0639j0.f3879p) && i6 < (i2 = c0639j02.f3871h)) {
                i6 = i2;
            }
            int m16641g = c0639j02.f3866c + c0639j02.f3868e + c0639j02.f3879p.m16641g(c0639j02.f3880q.f4397c.width());
            if (i7 < m16641g) {
                i7 = m16641g;
            }
            i++;
        }
        arrayList.add(Integer.valueOf(i7));
        arrayList.add(Integer.valueOf(i5));
        if (m4566c(c0639j0.f3879p)) {
            int i10 = c0639j0.f3868e;
            valueOf = Integer.valueOf(i10 - (this.f3895B.m16639e(i10) + this.f3895B.m16642h(c0639j0.f3868e)));
        } else {
            valueOf = Integer.valueOf(i6);
        }
        arrayList.add(valueOf);
        arrayList.add(Integer.valueOf(i - 1));
        arrayList.add(Integer.valueOf(i8));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b3, code lost:
    
        if (r6 > 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003c, code lost:
    
        if (r6 > 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00b5, code lost:
    
        r4.setImageResource(r6);
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m4544a(int r3, android.widget.ImageView r4, boolean r5, boolean r6) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0642k0.m4544a(int, android.widget.ImageView, boolean, boolean):void");
    }

    /* renamed from: a */
    private void m4545a(int i, TextView textView, int i2, boolean z) {
        Typeface m6069h;
        C0744u c0744u;
        if (z && i2 == -1) {
            i2 = this.f3895B.f14219h1;
        }
        textView.setTextColor(i2);
        if (z) {
            m6069h = this.f3912S.get(i).m4195c().m6069h();
            c0744u = this.f3912S.get(i).m4195c();
        } else {
            m6069h = this.f3895B.f14241p.m6069h();
            c0744u = this.f3895B.f14241p;
        }
        textView.setTypeface(m6069h, c0744u.m6068g());
        if (z && this.f3912S.get(i).m4187a() != null && this.f3912S.get(i).m4187a().m11443h()) {
            this.f3912S.get(i).m4188a((View) textView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4546a(int i, boolean z) {
        if (z) {
            if (this.f3912S.get(i).m4196d() != null) {
                m4545a(i, this.f3912S.get(i).m4196d(), this.f3895B.f14222i1, z);
            }
            if (this.f3912S.get(i).m4194b() != null) {
                m4544a(i, this.f3912S.get(i).m4194b(), z, true);
                return;
            }
            return;
        }
        for (int i2 = 0; i2 < this.f3909P.getTabCount(); i2++) {
            TextView m4196d = this.f3912S.get(i2).m4196d();
            if (i2 == i) {
                if (m4196d != null) {
                    m4545a(i2, this.f3912S.get(i2).m4196d(), this.f3895B.f14222i1, true);
                }
                if (this.f3912S.get(i2).m4194b() != null) {
                    m4544a(i2, this.f3912S.get(i2).m4194b(), true, true);
                }
            } else {
                if (m4196d != null) {
                    m4545a(i2, this.f3912S.get(i2).m4196d(), this.f3895B.f14241p.m6062c(), false);
                }
                if (this.f3912S.get(i).m4194b() != null) {
                    m4544a(i2, this.f3912S.get(i2).m4194b(), false, true);
                }
            }
        }
    }

    /* renamed from: a */
    private void m4547a(C0639j0 c0639j0) {
        int i;
        AbstractC0652n1 abstractC0652n1;
        float f = (c0639j0.f3872i - c0639j0.f3870g) / this.f3904K.f4404j;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        for (int i4 = 0; i4 < c0639j0.f3878o.size(); i4++) {
            C0639j0 c0639j02 = c0639j0.f3878o.get(i4);
            int i5 = c0639j02.f3869f;
            if (i5 > 0) {
                if (m4553a(i2, i3, c0639j02.f3865b, i5)) {
                    z = false;
                } else {
                    i2 = c0639j02.f3867d;
                    i3 = c0639j02.f3869f;
                }
            }
            if (!z) {
                break;
            }
        }
        if (z) {
            int i6 = 0;
            for (int i7 = 0; i7 < c0639j0.f3878o.size(); i7++) {
                C0639j0 c0639j03 = c0639j0.f3878o.get(i7);
                if (i6 > 0 && (abstractC0652n1 = c0639j03.f3877n) != null && c0639j03.f3879p.f14211f) {
                    c0639j03.f3867d -= i6;
                    abstractC0652n1.mo4139a(new AbsoluteLayout.LayoutParams(c0639j03.f3868e, c0639j03.f3869f, c0639j03.f3866c, c0639j03.f3867d));
                }
                int i8 = c0639j03.f3870g;
                if (i8 > 0 && c0639j03.f3879p.f14211f && (i = i8 - (i6 = i6 + (((int) (i8 * f)) + 1))) > 0) {
                    c0639j03.f3870g = i;
                    c0639j03.f3869f = i;
                    AbstractC0652n1 abstractC0652n12 = c0639j03.f3877n;
                    if (abstractC0652n12 != null) {
                        abstractC0652n12.mo4597k();
                        c0639j03.f3877n.mo4139a(new AbsoluteLayout.LayoutParams(c0639j03.f3868e, c0639j03.f3869f, c0639j03.f3866c, c0639j03.f3867d));
                    }
                }
            }
            c0639j0.f3872i -= i6;
        }
    }

    /* renamed from: a */
    private void m4549a(String str, C3489yj c3489yj, int i, int i2, C0639j0 c0639j0, int i3) {
        String str2;
        C0636i0 c0636i0 = new C0636i0(this.f4045c, c3489yj, str, c0639j0);
        if (i3 > 0) {
            c0636i0.m4497h(i3);
        }
        c0636i0.m4706a(this.f3918z);
        c3489yj.f14197a0 = c0636i0;
        c0636i0.m4488b(c3489yj);
        c0636i0.m4492c(c3489yj.f14241p.m6067f());
        c0636i0.m4496g(c3489yj.f14241p.m6068g());
        boolean z = true;
        if (true != c3489yj.f14199b || (c3489yj.f14220i == null && c3489yj.f14226k == null && ((str2 = c3489yj.f14232m) == null || (!str2.equalsIgnoreCase("close") && !c3489yj.f14232m.equalsIgnoreCase("exit"))))) {
            z = false;
        }
        c0636i0.m4483a(z);
        if (c3489yj.f14254t0 != null || c3489yj.f14170N != null || c3489yj.f14242p0 != null) {
            c0636i0.m4490b(c3489yj.f14254t0);
        }
        C0657p0 c0657p0 = new C0657p0(c3489yj.m16639e(i), c3489yj.m16644j(i), c3489yj.m16642h(i), c3489yj.m16635b(i), C0687b.m5342a(this.f4045c).m5343a().m5544a());
        c0636i0.m4494c(c3489yj);
        c0636i0.m4491c(new AbsoluteLayout.LayoutParams(c0639j0.f3868e, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d));
        c0636i0.mo4595a(this.f4049g);
        c0636i0.m4504q();
        c0636i0.mo4201a(c0657p0);
        if (c3489yj.f14260v0 != null || c3489yj.f14172O != null || c3489yj.f14248r0 != null) {
            c0636i0.m4484a(c3489yj.f14260v0);
        }
        c0639j0.f3868e = c0636i0.mo4152j();
        c0639j0.f3869f = c0636i0.mo4151i();
        c0639j0.f3877n = c0636i0;
        c0636i0.m4503p();
    }

    /* renamed from: a */
    private void m4550a(C3489yj c3489yj, AbsoluteLayout absoluteLayout) {
        C0669v0 c0669v0 = this.f3904K;
        m4541a(c0669v0, (C0639j0) null, c3489yj, (C3489yj) null);
        this.f3904K = c0669v0;
    }

    /* renamed from: a */
    private void m4551a(C3489yj c3489yj, AbsoluteLayout absoluteLayout, C0639j0 c0639j0) {
        C0611a c0611a = new C0611a(this.f4045c, c3489yj, c0639j0);
        c0611a.m4145b(c3489yj);
        c0611a.m4706a(this.f3918z);
        c3489yj.f14197a0 = c0611a;
        c0611a.m4149g(c3489yj.f14241p.m6068g());
        c0611a.m4138a(new AbsoluteLayout.LayoutParams(c0639j0.f3868e, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d), this.f3904K);
        c0611a.mo4595a(this.f4049g);
        c0611a.m4155o();
        c0611a.m4141a(c3489yj.f14260v0);
        c0639j0.f3868e = c0611a.mo4152j();
        c0639j0.f3869f = c0611a.mo4151i();
        c0639j0.f3877n = c0611a;
        this.f4049g.mo4835a(c0611a);
    }

    /* renamed from: a */
    private void m4552a(C3489yj c3489yj, C0639j0 c0639j0) {
        int i = c3489yj.f14208e;
        if (i == 13 || i == 26) {
            m4584j(c3489yj, this.f3918z, c0639j0);
            return;
        }
        if (i == 10 || i == 11) {
            m4570d(c3489yj, this.f3918z, c0639j0);
            return;
        }
        if (i == 22 || i == 2 || i == 27) {
            m4559b(c3489yj, c0639j0);
            return;
        }
        if (i == 1) {
            m4564c(c3489yj, this.f3918z, c0639j0);
            return;
        }
        if (i == 3) {
            m4582h(c3489yj, this.f3918z, c0639j0);
            return;
        }
        if (i == 4) {
            m4573e(c3489yj, this.f3918z, c0639j0);
            return;
        }
        if (i == 6) {
            m4576f(c3489yj, this.f3918z, c0639j0);
            return;
        }
        if (i == 23) {
            m4550a(c3489yj, this.f3918z);
            return;
        }
        if (i == 24) {
            m4550a(c3489yj, this.f3918z);
            m4583i(c3489yj, this.f3918z, c0639j0);
            return;
        }
        if (i == 9) {
            m4579g(c3489yj, this.f3918z, c0639j0);
            return;
        }
        if (i == 30) {
            m4588n(c3489yj, this.f3918z, c0639j0);
            return;
        }
        if (i == 34) {
            m4586l(c3489yj, this.f3918z, c0639j0);
            return;
        }
        if (i == 35) {
            m4585k(c3489yj, this.f3918z, c0639j0);
            return;
        }
        if (i == 37) {
            m4551a(c3489yj, this.f3918z, c0639j0);
        } else if (i == 38) {
            m4558b(c3489yj, this.f3918z, c0639j0);
        } else if (i == 41) {
            m4587m(c3489yj, this.f3918z, c0639j0);
        }
    }

    /* renamed from: a */
    private boolean m4553a(int i, int i2, int i3, int i4) {
        return i == i3 || (i > i3 && i < i4 + i3) || (i3 > i && i3 < i + i2);
    }

    /* renamed from: b */
    private void m4555b(C0639j0 c0639j0) {
        int i = c0639j0.f3868e;
        int i2 = c0639j0.f3869f;
        int i3 = c0639j0.f3872i;
        int i4 = i2 > i3 ? i2 - i3 : 0;
        int i5 = -1;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < c0639j0.f3878o.size(); i12++) {
            C0639j0 c0639j02 = c0639j0.f3878o.get(i12);
            int i13 = c0639j02.f3869f;
            if (i13 != 0) {
                if (!m4553a(i5, i6, c0639j02.f3865b, i13)) {
                    this.f3904K.f4402h = 0;
                    int i14 = c0639j02.f3865b;
                    int i15 = c0639j02.f3869f;
                    ArrayList<Integer> m4542a = m4542a(c0639j0, i12);
                    i7 = m4542a.get(0).intValue();
                    i8 = m4542a.get(1).intValue();
                    i9 = m4542a.get(2).intValue();
                    int intValue = m4542a.get(3).intValue();
                    i10 = m4542a.get(4).intValue();
                    i5 = c0639j0.f3878o.elementAt(intValue).f3865b;
                    i6 = c0639j0.f3878o.elementAt(intValue).f3869f;
                }
                int i16 = i5;
                int i17 = i6;
                int i18 = i7;
                int i19 = i8;
                int i20 = i9;
                int i21 = i10;
                int m4540a = m4540a(i18, i19, i, i4, i20, i21, c0639j02);
                if (i11 < m4540a) {
                    i11 = m4540a;
                }
                i5 = i16;
                i6 = i17;
                i7 = i18;
                i8 = i19;
                i9 = i20;
                i10 = i21;
            }
        }
        if (i11 <= 0 || c0639j0.f3868e >= i11) {
            return;
        }
        c0639j0.f3868e = i11;
    }

    /* renamed from: b */
    private void m4556b(C0639j0 c0639j0, C0669v0 c0669v0) {
        c0639j0.f3880q = c0669v0;
        C3489yj c3489yj = this.f3895B;
        c0639j0.f3879p = c3489yj;
        c3489yj.f14200b0.add(c0639j0);
        c0639j0.f3868e = c0669v0.f4408n ? c0669v0.f4397c.width() : c0669v0.f4397c.width() - (this.f3895B.m16638d(c0669v0.f4397c.width()) + this.f3895B.m16641g(c0669v0.f4397c.width()));
        int m16645k = this.f3895B.m16645k(c0669v0.f4397c.width());
        int m16637c = this.f3895B.m16637c(c0669v0.f4397c.height());
        int m16640f = this.f3895B.m16640f(c0669v0.f4397c.height());
        if (m16637c == -3 && m16645k > 0) {
            m16637c = m16645k;
        }
        if (m16640f == -3 && m16645k > 0) {
            m16640f = m16645k;
        }
        if (m16645k == -3 && m16637c > 0) {
            m16645k = m16637c;
        }
        if (m16645k <= 0) {
            m16645k = c0669v0.f4408n ? c0669v0.f4397c.width() : c0669v0.f4397c.width() - (this.f3895B.m16638d(c0669v0.f4397c.width()) + this.f3895B.m16641g(c0669v0.f4397c.width()));
        }
        c0639j0.f3868e = m16645k;
        if (m16637c > 0) {
            c0639j0.f3869f = m16637c;
        } else {
            c0639j0.f3869f = c0669v0.f4408n ? c0669v0.f4397c.height() : c0669v0.f4397c.height() - (this.f3895B.m16643i(c0669v0.f4397c.width()) + this.f3895B.m16632a(c0669v0.f4397c.width()));
            if (this.f3895B.f14208e == 39) {
                c0639j0.f3869f -= c0669v0.f4396b;
            }
        }
        if (m16640f > 0) {
            c0639j0.f3870g = m16640f;
            c0639j0.f3869f = m16640f;
        }
        Rect rect = c0669v0.f4397c;
        c0639j0.f3871h = rect.right;
        int i = c0669v0.f4395a;
        c0639j0.f3864a = i;
        c0639j0.f3865b = c0669v0.f4396b;
        if (!c0669v0.f4408n) {
            i += this.f3895B.m16638d(rect.width());
        }
        c0639j0.f3866c = i;
        if (c0669v0.f4408n) {
            c0639j0.f3867d = c0669v0.f4396b;
        } else {
            c0639j0.f3867d = c0669v0.f4396b + this.f3895B.m16643i(c0669v0.f4397c.width());
        }
        c0639j0.f3877n = this;
    }

    /* renamed from: b */
    private void m4557b(C3489yj c3489yj) {
        int i;
        try {
            if (c3489yj.f14268z0 != null) {
                int i2 = 0;
                while (i2 < c3489yj.f14268z0.size()) {
                    C3489yj elementAt = c3489yj.f14268z0.elementAt(i2);
                    int i3 = i2 + 1;
                    if (i3 < c3489yj.f14268z0.size()) {
                        this.f3900G = c3489yj.f14268z0.elementAt(i3);
                    } else {
                        this.f3900G = null;
                    }
                    if (i2 <= 0 || i2 - 1 < 0) {
                        this.f3901H = null;
                    } else {
                        this.f3901H = c3489yj.f14268z0.elementAt(i);
                    }
                    if (elementAt.f14208e == 39) {
                        m4541a(this.f3904K, this.f3903J, elementAt, this.f3901H);
                    }
                    if ((elementAt.f14268z0 == null || elementAt.f14268z0.size() <= 0) && elementAt.f14208e != 33 && elementAt.f14208e != 36) {
                        m4575f(elementAt);
                        i2 = i3;
                    }
                    m4578g(elementAt);
                    i2 = i3;
                }
            }
            m4590r();
            m4580h(this.f3903J);
            mo4597k();
        } catch (OutOfMemoryError unused) {
        }
    }

    /* renamed from: b */
    private void m4558b(C3489yj c3489yj, AbsoluteLayout absoluteLayout, C0639j0 c0639j0) {
        C2391dj c2391dj;
        C0659q0 c0659q0 = new C0659q0(this.f4045c, c3489yj, c0639j0);
        c0659q0.mo4595a(this.f4049g);
        c0659q0.m4706a(this.f3918z);
        c3489yj.f14197a0 = c0659q0;
        c0659q0.m4903b(c3489yj);
        c0639j0.f3877n = c0659q0;
        c0659q0.mo4201a(new C0657p0(c3489yj.m16639e(c0639j0.f3868e), c3489yj.m16644j(c0639j0.f3868e), c3489yj.m16642h(c0639j0.f3868e), c3489yj.m16635b(c0639j0.f3868e), C0687b.m5342a(this.f4045c).m5343a().m5544a()));
        c0659q0.m4904c(c0639j0.f3868e <= 0 ? new AbsoluteLayout.LayoutParams(this.f3903J.f3868e - (((this.f3895B.m16639e(c0639j0.f3868e) + this.f3895B.m16642h(c0639j0.f3868e)) + c3489yj.m16638d(c0639j0.f3868e)) + c3489yj.m16641g(c0639j0.f3868e)), c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d) : new AbsoluteLayout.LayoutParams(c0639j0.f3868e, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d));
        c0659q0.m4905m();
        if (c3489yj.f14195Z0 > 1 && (c2391dj = c3489yj.f14163J0) != null) {
            c0659q0.m4901a(c2391dj.m11428a());
        }
        c0659q0.m4902a(c3489yj.f14260v0);
        c0639j0.f3868e = c0659q0.mo4152j();
        c0639j0.f3869f = c0659q0.mo4151i();
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x02ad A[Catch: Exception -> 0x0579, OutOfMemoryError -> 0x057d, TryCatch #0 {Exception -> 0x0579, blocks: (B:3:0x0006, B:5:0x000d, B:7:0x0013, B:9:0x0017, B:18:0x0041, B:19:0x0056, B:20:0x0074, B:21:0x0078, B:23:0x007c, B:24:0x007e, B:26:0x0083, B:29:0x0093, B:31:0x00c7, B:32:0x00d0, B:33:0x0110, B:36:0x0115, B:39:0x011f, B:41:0x012c, B:44:0x0395, B:46:0x039b, B:48:0x03bc, B:50:0x03c2, B:51:0x03c6, B:53:0x03ca, B:55:0x03ce, B:57:0x03d1, B:59:0x03d8, B:60:0x03f2, B:62:0x040d, B:65:0x0411, B:66:0x04ce, B:68:0x04d4, B:70:0x04f3, B:72:0x053a, B:73:0x0548, B:75:0x0553, B:77:0x0562, B:79:0x0568, B:80:0x056d, B:83:0x041a, B:85:0x041f, B:87:0x046e, B:88:0x047c, B:90:0x04bd, B:97:0x0144, B:99:0x0171, B:100:0x017f, B:102:0x01b7, B:103:0x01c8, B:105:0x01ce, B:107:0x01da, B:109:0x01e7, B:110:0x01f2, B:113:0x01ff, B:115:0x0206, B:116:0x0210, B:118:0x021a, B:120:0x0220, B:122:0x0241, B:124:0x0247, B:125:0x024b, B:127:0x024f, B:129:0x0253, B:131:0x0256, B:133:0x025f, B:134:0x0281, B:136:0x02ad, B:150:0x02b3, B:138:0x02bb, B:140:0x02c3, B:142:0x0312, B:143:0x0320, B:146:0x036a, B:158:0x01ec, B:168:0x005f), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02c3 A[Catch: Exception -> 0x0579, OutOfMemoryError -> 0x057d, TryCatch #0 {Exception -> 0x0579, blocks: (B:3:0x0006, B:5:0x000d, B:7:0x0013, B:9:0x0017, B:18:0x0041, B:19:0x0056, B:20:0x0074, B:21:0x0078, B:23:0x007c, B:24:0x007e, B:26:0x0083, B:29:0x0093, B:31:0x00c7, B:32:0x00d0, B:33:0x0110, B:36:0x0115, B:39:0x011f, B:41:0x012c, B:44:0x0395, B:46:0x039b, B:48:0x03bc, B:50:0x03c2, B:51:0x03c6, B:53:0x03ca, B:55:0x03ce, B:57:0x03d1, B:59:0x03d8, B:60:0x03f2, B:62:0x040d, B:65:0x0411, B:66:0x04ce, B:68:0x04d4, B:70:0x04f3, B:72:0x053a, B:73:0x0548, B:75:0x0553, B:77:0x0562, B:79:0x0568, B:80:0x056d, B:83:0x041a, B:85:0x041f, B:87:0x046e, B:88:0x047c, B:90:0x04bd, B:97:0x0144, B:99:0x0171, B:100:0x017f, B:102:0x01b7, B:103:0x01c8, B:105:0x01ce, B:107:0x01da, B:109:0x01e7, B:110:0x01f2, B:113:0x01ff, B:115:0x0206, B:116:0x0210, B:118:0x021a, B:120:0x0220, B:122:0x0241, B:124:0x0247, B:125:0x024b, B:127:0x024f, B:129:0x0253, B:131:0x0256, B:133:0x025f, B:134:0x0281, B:136:0x02ad, B:150:0x02b3, B:138:0x02bb, B:140:0x02c3, B:142:0x0312, B:143:0x0320, B:146:0x036a, B:158:0x01ec, B:168:0x005f), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0070  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m4559b(p000.C3489yj r27, com.comviva.webaxn.p002ui.C0639j0 r28) {
        /*
            Method dump skipped, instructions count: 1406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0642k0.m4559b(yj, com.comviva.webaxn.ui.j0):void");
    }

    /* renamed from: b */
    private boolean m4560b(String str) {
        return str != null && str.equalsIgnoreCase("\n");
    }

    /* renamed from: c */
    private int m4561c(C0639j0 c0639j0) {
        int size = c0639j0.f3878o.size();
        if (size > 0) {
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                int m4561c = m4561c(c0639j0.f3878o.elementAt(i2));
                if (-1 != m4561c) {
                    if (i < m4561c) {
                        i = m4561c;
                    }
                }
            }
            return i;
        }
        AbstractC0652n1 abstractC0652n1 = c0639j0.f3877n;
        if (!(abstractC0652n1 instanceof C0627f0)) {
            return 0;
        }
        if (c0639j0.f3879p.f14254t0 != null) {
            C0627f0 c0627f0 = (C0627f0) abstractC0652n1;
            if (c0627f0.mo4152j() > 0) {
                return c0627f0.mo4152j();
            }
            return 0;
        }
        return -1;
    }

    /* renamed from: c */
    private void m4562c(AbsoluteLayout.LayoutParams layoutParams) {
        if (this.f3895B.f14208e != 40 && (this.f4044b instanceof AbsoluteLayout)) {
            mo4150h().setLayoutParams(new AbsoluteLayout.LayoutParams(layoutParams.width, layoutParams.height, layoutParams.x, layoutParams.y));
        }
    }

    /* renamed from: c */
    private void m4563c(C0639j0 c0639j0, C0669v0 c0669v0) {
        c0639j0.f3880q = c0669v0;
        int m16645k = this.f3895B.m16645k(c0669v0.f4397c.width());
        int m16637c = this.f3895B.m16637c(c0669v0.f4397c.height());
        int m16640f = this.f3895B.m16640f(c0669v0.f4397c.height());
        if (m16637c == -3 && m16645k > 0) {
            m16637c = m16645k;
        }
        if (m16640f == -3 && m16645k > 0) {
            m16640f = m16645k;
        }
        if (m16645k == -3 && m16637c > 0) {
            m16645k = m16637c;
        }
        if (c0639j0.f3876m) {
            m16645k = c0639j0.f3868e;
        }
        if (m16645k <= 0) {
            m16645k = c0669v0.f4408n ? c0669v0.f4397c.width() : c0669v0.f4397c.width() - (this.f3895B.m16638d(c0669v0.f4397c.width()) + this.f3895B.m16641g(c0669v0.f4397c.width()));
        }
        c0639j0.f3868e = m16645k;
        if (m16637c > 0) {
            c0639j0.f3869f = m16637c;
        } else {
            c0639j0.f3869f = c0669v0.f4408n ? c0669v0.f4397c.height() : c0669v0.f4397c.height() - (this.f3895B.m16643i(c0669v0.f4397c.width()) + this.f3895B.m16632a(c0669v0.f4397c.width()));
            if (this.f3895B.f14208e == 39) {
                c0639j0.f3869f -= c0669v0.f4396b;
            }
        }
        if (m16640f > 0) {
            c0639j0.f3870g = m16640f;
            c0639j0.f3869f = m16640f;
        }
        Rect rect = c0669v0.f4397c;
        c0639j0.f3871h = rect.right;
        int i = c0669v0.f4395a;
        c0639j0.f3864a = i;
        c0639j0.f3865b = c0669v0.f4396b;
        if (!c0669v0.f4408n) {
            i += this.f3895B.m16638d(rect.width());
        }
        c0639j0.f3866c = i;
        if (c0669v0.f4408n) {
            c0639j0.f3867d = c0669v0.f4396b;
        } else {
            c0639j0.f3867d = c0669v0.f4396b + this.f3895B.m16643i(c0669v0.f4397c.width());
        }
    }

    /* renamed from: c */
    private void m4564c(C3489yj c3489yj, AbsoluteLayout absoluteLayout, C0639j0 c0639j0) {
        C0620d c0620d = new C0620d(this.f4045c, c3489yj.f14235n, c3489yj, c0639j0);
        c0620d.m4706a(this.f3918z);
        c3489yj.f14197a0 = c0620d;
        c0620d.m4204c(c3489yj);
        c0620d.m4202b(c3489yj.f14241p.m6067f());
        c0620d.m4205g(c3489yj.f14241p.m6068g());
        c0620d.m4200a(c3489yj.f14241p.m6064d());
        Vector<C3264tj> vector = c3489yj.f14166L;
        c0620d.mo4201a(new C0657p0(c3489yj.m16639e(c0639j0.f3868e), c3489yj.m16644j(c0639j0.f3868e), c3489yj.m16642h(c0639j0.f3868e), c3489yj.m16635b(c0639j0.f3868e), C0687b.m5342a(this.f4045c).m5343a().m5544a()));
        c0620d.m4199a(c0639j0.f3868e <= 0 ? new AbsoluteLayout.LayoutParams(-2, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d) : new AbsoluteLayout.LayoutParams(c0639j0.f3868e, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d), this.f3904K);
        c0620d.mo4595a(this.f4049g);
        c0620d.m4207n();
        c0620d.m4203b(c3489yj);
        c0639j0.f3868e = c0620d.mo4152j();
        c0639j0.f3869f = c0620d.mo4151i();
        c0639j0.f3877n = c0620d;
        c0620d.m4206m();
    }

    /* renamed from: c */
    private void m4565c(C3489yj c3489yj, C0639j0 c0639j0) {
        int i;
        AbstractC0652n1 abstractC0652n1;
        AbsoluteLayout.LayoutParams layoutParams;
        AbstractC0652n1 abstractC0652n12;
        AbsoluteLayout.LayoutParams layoutParams2;
        int i2 = c3489yj.f14208e;
        if (i2 == 13 || i2 == 26) {
            m4584j(c3489yj, this.f3918z, c0639j0);
            return;
        }
        if (i2 == 10 || i2 == 11) {
            m4570d(c3489yj, this.f3918z, c0639j0);
            return;
        }
        if (i2 == 9) {
            m4579g(c3489yj, this.f3918z, c0639j0);
            return;
        }
        if (i2 == 22 || i2 == 2 || i2 == 27) {
            m4559b(c3489yj, c0639j0);
            return;
        }
        if (i2 == 1) {
            m4564c(c3489yj, this.f3918z, c0639j0);
            return;
        }
        if (i2 == 3) {
            int i3 = c0639j0.f3868e;
            if (i3 <= 0) {
                int i4 = this.f3903J.f3868e;
                i3 = i4 - (this.f3895B.m16639e(i4) + this.f3895B.m16642h(this.f3903J.f3868e));
            }
            int i5 = c0639j0.f3869f;
            i = i5 > 0 ? i5 : -2;
            abstractC0652n12 = c0639j0.f3877n;
            layoutParams2 = new AbsoluteLayout.LayoutParams(i3, i, c0639j0.f3866c, c0639j0.f3867d);
        } else if (i2 == 4) {
            int i6 = c0639j0.f3868e;
            if (i6 <= 0) {
                int i7 = this.f3903J.f3868e;
                i6 = i7 - (this.f3895B.m16639e(i7) + this.f3895B.m16642h(this.f3903J.f3868e));
            }
            int i8 = c0639j0.f3869f;
            i = i8 > 0 ? i8 : -2;
            abstractC0652n12 = c0639j0.f3877n;
            layoutParams2 = new AbsoluteLayout.LayoutParams(i6, i, c0639j0.f3866c, c0639j0.f3867d);
        } else {
            if (i2 != 6) {
                if (i2 == 23) {
                    m4550a(c3489yj, this.f3918z);
                    return;
                }
                if (i2 == 24) {
                    m4550a(c3489yj, this.f3918z);
                    m4583i(c3489yj, this.f3918z, c0639j0);
                    return;
                }
                if (i2 == 30) {
                    int i9 = c0639j0.f3868e;
                    if (i9 <= 0) {
                        int i10 = this.f3903J.f3868e;
                        i9 = i10 - (this.f3895B.m16639e(i10) + this.f3895B.m16642h(this.f3903J.f3868e));
                    }
                    int i11 = c0639j0.f3869f;
                    i = i11 > 0 ? i11 : -2;
                    abstractC0652n1 = c0639j0.f3877n;
                    layoutParams = new AbsoluteLayout.LayoutParams(i9, i, c0639j0.f3866c, c0639j0.f3867d);
                } else if (i2 == 34) {
                    int i12 = c0639j0.f3868e;
                    if (i12 <= 0) {
                        int i13 = this.f3903J.f3868e;
                        i12 = i13 - (this.f3895B.m16639e(i13) + this.f3895B.m16642h(this.f3903J.f3868e));
                    }
                    int i14 = c0639j0.f3869f;
                    i = i14 > 0 ? i14 : -2;
                    abstractC0652n1 = c0639j0.f3877n;
                    layoutParams = new AbsoluteLayout.LayoutParams(i12, i, c0639j0.f3866c, c0639j0.f3867d);
                } else if (i2 == 35) {
                    int i15 = c0639j0.f3868e;
                    if (i15 <= 0) {
                        int i16 = this.f3903J.f3868e;
                        i15 = i16 - (this.f3895B.m16639e(i16) + this.f3895B.m16642h(this.f3903J.f3868e));
                    }
                    int i17 = c0639j0.f3869f;
                    i = i17 > 0 ? i17 : -2;
                    abstractC0652n1 = c0639j0.f3877n;
                    layoutParams = new AbsoluteLayout.LayoutParams(i15, i, c0639j0.f3866c, c0639j0.f3867d);
                } else if (i2 == 37) {
                    int i18 = c0639j0.f3868e;
                    if (i18 <= 0) {
                        int i19 = this.f3903J.f3868e;
                        i18 = i19 - (this.f3895B.m16639e(i19) + this.f3895B.m16642h(this.f3903J.f3868e));
                    }
                    int i20 = c0639j0.f3869f;
                    i = i20 > 0 ? i20 : -2;
                    abstractC0652n1 = c0639j0.f3877n;
                    layoutParams = new AbsoluteLayout.LayoutParams(i18, i, c0639j0.f3866c, c0639j0.f3867d);
                } else if (i2 == 38) {
                    int i21 = c0639j0.f3868e;
                    if (i21 <= 0) {
                        int i22 = this.f3903J.f3868e;
                        i21 = i22 - (this.f3895B.m16639e(i22) + this.f3895B.m16642h(this.f3903J.f3868e));
                    }
                    int i23 = c0639j0.f3869f;
                    i = i23 > 0 ? i23 : -2;
                    abstractC0652n1 = c0639j0.f3877n;
                    layoutParams = new AbsoluteLayout.LayoutParams(i21, i, c0639j0.f3866c, c0639j0.f3867d);
                } else {
                    if (i2 != 41) {
                        return;
                    }
                    int i24 = c0639j0.f3868e;
                    if (i24 <= 0) {
                        int i25 = this.f3903J.f3868e;
                        i24 = i25 - (this.f3895B.m16639e(i25) + this.f3895B.m16642h(this.f3903J.f3868e));
                    }
                    int i26 = c0639j0.f3869f;
                    i = i26 > 0 ? i26 : -2;
                    abstractC0652n1 = c0639j0.f3877n;
                    layoutParams = new AbsoluteLayout.LayoutParams(i24, i, c0639j0.f3866c, c0639j0.f3867d);
                }
                abstractC0652n1.mo4143b(layoutParams);
                c0639j0.f3868e = c0639j0.f3877n.mo4152j();
                c0639j0.f3869f = c0639j0.f3877n.mo4151i();
                return;
            }
            int i27 = c0639j0.f3868e;
            if (i27 <= 0) {
                i27 = -2;
            }
            int i28 = c0639j0.f3869f;
            i = i28 > 0 ? i28 : -2;
            abstractC0652n12 = c0639j0.f3877n;
            layoutParams2 = new AbsoluteLayout.LayoutParams(i27, i, c0639j0.f3866c, c0639j0.f3867d);
        }
        abstractC0652n12.mo4143b(layoutParams2);
        c0639j0.f3868e = c0639j0.f3877n.mo4152j();
        c0639j0.f3869f = c0639j0.f3877n.mo4151i();
        m4581h(c3489yj);
    }

    /* renamed from: c */
    private boolean m4566c(C3489yj c3489yj) {
        String str;
        while (c3489yj != null) {
            int i = c3489yj.f14221i0;
            if (i == 2 || i == 3 || i == 4 || ((str = c3489yj.f14233m0) != null && str.equalsIgnoreCase("equal"))) {
                return true;
            }
            c3489yj = c3489yj.f14145A0;
        }
        return false;
    }

    /* renamed from: d */
    private C0669v0 m4567d(C0639j0 c0639j0, C0669v0 c0669v0) {
        C3489yj c3489yj;
        int i;
        if (c0639j0 != null) {
            C3489yj c3489yj2 = c0639j0.f3879p;
            if (!c3489yj2.f14211f) {
                return c0669v0;
            }
            int m16641g = c0639j0.f3866c + c0639j0.f3868e + c3489yj2.m16641g(c0639j0.f3880q.f4397c.width());
            Rect rect = this.f3904K.f4397c;
            boolean z = m16641g > rect.right && c0639j0.f3866c > rect.left + c0639j0.f3879p.m16638d(c0639j0.f3880q.f4397c.width());
            if (!z) {
                int i2 = c0669v0.f4401g;
                int i3 = c0639j0.f3874k;
                if (i2 < i3) {
                    c0669v0.f4401g = i3;
                }
                if (this.f3904K.f4402h < c0639j0.f3869f + c0639j0.f3879p.m16632a(c0639j0.f3880q.f4397c.width()) + c0639j0.f3879p.m16643i(c0639j0.f3880q.f4397c.width())) {
                    this.f3904K.f4402h = c0639j0.f3869f + c0639j0.f3879p.m16632a(c0639j0.f3880q.f4397c.width()) + c0639j0.f3879p.m16643i(c0639j0.f3880q.f4397c.width());
                }
                if (this.f3904K.f4398d < c0639j0.f3868e + c0639j0.f3879p.m16641g(c0639j0.f3880q.f4397c.width()) + c0639j0.f3879p.m16638d(c0639j0.f3880q.f4397c.width())) {
                    this.f3904K.f4398d = c0639j0.f3868e + c0639j0.f3879p.m16641g(c0639j0.f3880q.f4397c.width()) + c0639j0.f3879p.m16638d(c0639j0.f3880q.f4397c.width());
                }
                if (this.f3904K.f4400f < c0639j0.f3869f + c0639j0.f3879p.m16632a(c0639j0.f3880q.f4397c.width()) + c0639j0.f3879p.m16643i(c0639j0.f3880q.f4397c.width())) {
                    this.f3904K.f4400f = c0639j0.f3869f + c0639j0.f3879p.m16632a(c0639j0.f3880q.f4397c.width()) + c0639j0.f3879p.m16643i(c0639j0.f3880q.f4397c.width());
                }
            }
            if (this.f3899F) {
                C3489yj c3489yj3 = c0639j0.f3879p;
                if (c3489yj3.f14224j0 != 1 && this.f3904K.f4399e < c0639j0.f3869f + c3489yj3.m16632a(c0639j0.f3880q.f4397c.width()) + c0639j0.f3879p.m16643i(c0639j0.f3880q.f4397c.width())) {
                    this.f3904K.f4399e = c0639j0.f3869f + c0639j0.f3879p.m16632a(c0639j0.f3880q.f4397c.width()) + c0639j0.f3879p.m16643i(c0639j0.f3880q.f4397c.width());
                }
            }
            if (m16641g > this.f3904K.f4397c.right || !((c3489yj = this.f3900G) == null || (i = c3489yj.f14208e) == 23 || i == 24 || (((!c3489yj.f14214g.equalsIgnoreCase("L") && !this.f3900G.f14214g.equalsIgnoreCase("Left")) || c0639j0.f3879p.f14214g.equalsIgnoreCase("L") || c0639j0.f3879p.f14214g.equalsIgnoreCase("Left")) && ((!this.f3900G.f14214g.equalsIgnoreCase("C") && !this.f3900G.f14214g.equalsIgnoreCase("Center")) || (!c0639j0.f3879p.f14214g.equalsIgnoreCase("R") && !c0639j0.f3879p.f14214g.equalsIgnoreCase("Right")))))) {
                C0669v0 c0669v02 = this.f3904K;
                m4541a(c0669v02, c0639j0, c0639j0.f3879p, this.f3901H);
                this.f3904K = c0669v02;
            } else {
                this.f3904K.f4395a = m16641g + (c0639j0.f3879p.f14148C == null ? AbstractC0652n1.f4042v : 0);
            }
            if (z) {
                m4577g(c0639j0);
            }
        }
        return c0669v0;
    }

    /* renamed from: d */
    private void m4568d(C0639j0 c0639j0) {
        int size = c0639j0.f3878o.size();
        C0657p0 c0657p0 = new C0657p0(0, 0, 0, 0, C0687b.m5342a(this.f4045c).m5343a().m5544a());
        int i = 0;
        int i2 = 0;
        while (size > 0) {
            ArrayList<Integer> m4542a = m4542a(c0639j0, i);
            int intValue = m4542a.get(i).intValue();
            int intValue2 = (m4542a.get(3).intValue() - i) + 1;
            int i3 = c0639j0.f3868e - intValue;
            if (i3 >= intValue2) {
                C0639j0 c0639j02 = null;
                int i4 = i3 / intValue2;
                int i5 = i4 / 2;
                c0657p0.f4220c = i5;
                c0657p0.f4218a = i5;
                int i6 = 0;
                int i7 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    if (i6 == intValue2) {
                        if (c0639j02 != null) {
                            i2 = c0639j02.f3867d + c0639j02.f3869f;
                        }
                        i6 = 0;
                        i7 = 0;
                    }
                    i6++;
                    c0639j02 = c0639j0.f3878o.elementAt(i8);
                    if (c0639j02.f3866c <= i7) {
                        c0639j02.f3866c = i7;
                    }
                    if (c0639j02.f3867d <= i2) {
                        c0639j02.f3867d = i2;
                    }
                    c0639j02.f3877n.mo4201a(c0657p0);
                    c0639j02.f3868e += i4;
                    c0639j02.f3869f = this.f3907N;
                    c0639j02.f3877n.mo4139a(new AbsoluteLayout.LayoutParams(c0639j02.f3868e, c0639j02.f3869f, c0639j02.f3866c, c0639j02.f3867d));
                    i7 = c0639j02.f3879p.m16641g(c0639j02.f3880q.f4397c.width()) + c0639j02.f3866c + c0639j02.f3868e;
                }
                if (c0639j02 != null) {
                    c0639j0.f3869f = c0639j02.f3867d + c0639j02.f3869f;
                }
            }
            size = 0;
            i = 0;
        }
    }

    /* renamed from: d */
    private void m4569d(C3489yj c3489yj) {
        int i;
        int i2;
        C0639j0 c0639j0;
        int i3;
        int i4;
        int i5;
        int i6 = c3489yj.f14208e;
        int i7 = 8;
        C0639j0 c0639j02 = null;
        if ((i6 != 7 && i6 != 28) || (i = this.f3895B.f14165K0) != 8 || i != 9) {
            if (c3489yj.f14208e == 22) {
                String str = c3489yj.f14235n;
                if (str == null) {
                    String m200h = !TextUtils.isEmpty(C0023aj.m160a(this.f4045c).m200h(c3489yj.f14186V)) ? C0023aj.m160a(this.f4045c).m200h(c3489yj.f14186V) : c3489yj.f14189W0;
                    if (TextUtils.isEmpty(m200h)) {
                        return;
                    } else {
                        c3489yj.f14235n = m200h;
                    }
                } else if (m4560b(str)) {
                    C0669v0 c0669v0 = this.f3904K;
                    m4541a(c0669v0, (C0639j0) null, c3489yj, this.f3901H);
                    this.f3904K = c0669v0;
                    return;
                }
            }
            int i8 = 0;
            if (c3489yj.f14208e != 23) {
                try {
                    if (c3489yj.f14197a0 != null) {
                        if (!c3489yj.f14211f) {
                            c0639j0 = null;
                            int i9 = 0;
                            while (i9 < c3489yj.f14200b0.size()) {
                                try {
                                    c3489yj.f14197a0.mo4150h().setVisibility(i7);
                                    C0639j0 elementAt = c3489yj.f14200b0.elementAt(i9);
                                    try {
                                        elementAt.f3869f = 0;
                                        elementAt.f3868e = 0;
                                        elementAt.f3864a = this.f3904K.f4395a;
                                        elementAt.f3865b = this.f3904K.f4396b;
                                        elementAt.f3866c = this.f3904K.f4395a;
                                        elementAt.f3867d = this.f3904K.f4396b + c3489yj.m16643i(this.f3903J.f3868e);
                                        elementAt.f3871h = this.f3904K.f4397c.right;
                                        i9++;
                                        c0639j0 = elementAt;
                                        i7 = 8;
                                    } catch (Exception unused) {
                                        c0639j0 = elementAt;
                                    }
                                } catch (Exception unused2) {
                                }
                            }
                            return;
                        }
                        c3489yj.f14197a0.mo4150h().setVisibility(0);
                    }
                } catch (Exception unused3) {
                }
                c0639j0 = null;
                if (this.f3899F) {
                    c3489yj.f14217h = "T";
                }
                if (1 == c3489yj.f14224j0) {
                    C0669v0 c0669v02 = this.f3904K;
                    m4541a(c0669v02, c0639j0, c3489yj, this.f3901H);
                    this.f3904K = c0669v02;
                }
                C0669v0 c0669v03 = this.f3904K;
                C0639j0 c0639j03 = c0669v03.f4406l;
                if (c0639j03 != null && c0669v03.f4396b > c0639j03.f3867d + c0639j03.f3869f) {
                    c0669v03.f4406l = null;
                    this.f3899F = false;
                }
                C0669v0 c0669v04 = this.f3904K;
                C0639j0 elementAt2 = c3489yj.f14200b0.elementAt(0);
                c0669v04.f4407m = elementAt2;
                int i10 = c3489yj.f14208e;
                if (i10 == 22 || i10 == 2 || i10 == 27) {
                    int indexOf = this.f3903J.f3878o.indexOf(c3489yj.f14200b0.elementAt(0));
                    for (int i11 = 0; i11 < c3489yj.f14200b0.size(); i11++) {
                        C0639j0 elementAt3 = c3489yj.f14200b0.elementAt(i11);
                        this.f3903J.f3878o.remove(elementAt3);
                        AbstractC0652n1 abstractC0652n1 = elementAt3.f3877n;
                        if (abstractC0652n1 != null) {
                            abstractC0652n1.mo4142b();
                        }
                    }
                    c3489yj.f14197a0 = null;
                    c3489yj.f14200b0.clear();
                    C0639j0 c0639j04 = new C0639j0(this.f4045c);
                    c3489yj.f14200b0.add(c0639j04);
                    if (-1 >= indexOf || indexOf >= this.f3903J.f3878o.size()) {
                        this.f3903J.f3878o.add(c0639j04);
                    } else {
                        this.f3903J.f3878o.insertElementAt(c0639j04, indexOf);
                    }
                    this.f3904K.f4407m = c0639j04;
                    c0639j02 = c0639j04;
                } else {
                    if (i10 == 13 || i10 == 26 || i10 == 9 || i10 == 1) {
                        elementAt2.f3877n.mo4142b();
                    } else if (i10 == 24) {
                        elementAt2.f3877n.mo4142b();
                        elementAt2.f3868e = this.f3903J.f3868e;
                    }
                    c0639j02 = elementAt2;
                }
                C0639j0 c0639j05 = this.f3903J;
                c0639j02.f3875l = c0639j05;
                c0639j02.f3879p = c3489yj;
                C0669v0 c0669v05 = this.f3904K;
                c0639j02.f3871h = c0669v05.f4397c.right;
                int i12 = c0669v05.f4395a;
                c0639j02.f3864a = i12;
                c0639j02.f3865b = c0669v05.f4396b;
                c0669v05.f4395a = i12 + c3489yj.m16638d(c0639j05.f3868e);
                C0669v0 c0669v06 = this.f3904K;
                c0639j02.f3866c = c0669v06.f4395a;
                c0639j02.f3867d = c0669v06.f4396b + c3489yj.m16643i(this.f3903J.f3868e);
                C0669v0 c0669v07 = this.f3904K;
                c0639j02.f3880q = c0669v07;
                if (c0669v07.f4405k) {
                    c0639j02.f3868e = this.f3908O;
                    c0639j02.f3869f = this.f3907N;
                } else {
                    String str2 = c0639j02.f3875l.f3879p.f14233m0;
                    if (str2 == null || !str2.equalsIgnoreCase("equal")) {
                        c0639j02.f3868e = c3489yj.m16645k(this.f3904K.f4397c.width());
                    } else {
                        c0639j02.f3868e = this.f3906M;
                        c0639j02.f3876m = true;
                    }
                }
                c0639j02.f3869f = c3489yj.m16637c(this.f3904K.f4397c.height());
                c0639j02.f3870g = c3489yj.m16640f(this.f3904K.f4397c.height());
                if (c0639j02.f3869f == -3 && (i5 = c0639j02.f3868e) > 0) {
                    c0639j02.f3869f = i5;
                }
                if (c0639j02.f3870g == -3 && (i4 = c0639j02.f3868e) > 0) {
                    c0639j02.f3870g = i4;
                }
                if (c0639j02.f3868e == -3 && (i3 = c0639j02.f3869f) > 0) {
                    c0639j02.f3868e = i3;
                }
            }
            m4565c(c3489yj, c0639j02);
            if (c0639j02 != null) {
                int i13 = c3489yj.f14208e;
                if (i13 == 22 || i13 == 2 || i13 == 27) {
                    int indexOf2 = this.f3903J.f3878o.indexOf(c0639j02);
                    if (indexOf2 != -1) {
                        this.f3903J.f3878o.elementAt(indexOf2).f3873j = this.f3903J.f3878o.elementAt(indexOf2).f3869f;
                        i8 = 1;
                    }
                    while (i8 < c3489yj.f14200b0.size()) {
                        c3489yj.f14200b0.elementAt(i8).f3873j = c3489yj.f14200b0.elementAt(i8).f3869f;
                        Vector<C0639j0> vector = this.f3903J.f3878o;
                        C0639j0 elementAt4 = c3489yj.f14200b0.elementAt(i8);
                        if (indexOf2 != -1) {
                            indexOf2++;
                            vector.insertElementAt(elementAt4, indexOf2);
                        } else {
                            vector.add(elementAt4);
                        }
                        i8++;
                    }
                    if (c3489yj.f14200b0.size() > 0) {
                        c3489yj.f14200b0.firstElement().f3873j += c3489yj.f14200b0.firstElement().f3879p.m16643i(this.f3904K.f4397c.width());
                        c3489yj.f14200b0.lastElement().f3873j += c3489yj.f14200b0.lastElement().f3879p.m16632a(this.f3904K.f4397c.width());
                        c0639j02 = c3489yj.f14200b0.lastElement();
                        this.f3904K.f4407m = c0639j02;
                    }
                } else {
                    c0639j02.f3873j = c0639j02.f3869f + c0639j02.f3879p.m16643i(this.f3904K.f4397c.width()) + c0639j02.f3879p.m16632a(this.f3904K.f4397c.width());
                }
            }
            if (c3489yj.f14208e != 23) {
                if (c0639j02 != null) {
                    C3489yj c3489yj2 = c0639j02.f3879p;
                    if (1 == c3489yj2.f14224j0) {
                        this.f3904K.f4406l = c0639j02;
                        c3489yj2.f14217h = "T";
                        this.f3899F = true;
                    }
                }
                C0669v0 c0669v08 = this.f3904K;
                m4567d(c0639j02, c0669v08);
                this.f3904K = c0669v08;
            }
        }
        if (c0639j02 == null || (i2 = c0639j02.f3870g) <= 0) {
            return;
        }
        this.f3904K.f4404j += i2;
    }

    /* renamed from: d */
    private void m4570d(C3489yj c3489yj, AbsoluteLayout absoluteLayout, C0639j0 c0639j0) {
        C0629g c0629g = new C0629g(this.f4045c, c3489yj, c0639j0);
        c0629g.m4706a(this.f3918z);
        c3489yj.f14197a0 = c0629g;
        c0629g.m4360b(c3489yj);
        c0629g.m4358a(new AbsoluteLayout.LayoutParams(c0639j0.f3868e, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d), this.f3904K);
        c0629g.mo4595a(this.f4049g);
        c0629g.m4361m();
        c0629g.mo4201a(new C0657p0(c3489yj.m16639e(c0639j0.f3868e), c3489yj.m16644j(c0639j0.f3868e), c3489yj.m16642h(c0639j0.f3868e), c3489yj.m16635b(c0639j0.f3868e), C0687b.m5342a(this.f4045c).m5343a().m5544a()));
        c0639j0.f3868e = c0629g.mo4152j();
        c0639j0.f3869f = c0629g.mo4151i();
        c0639j0.f3877n = c0629g;
    }

    /* renamed from: e */
    private void m4571e(C0639j0 c0639j0) {
        int i = c0639j0.f3868e;
        if (c0639j0.f3878o.size() > 0) {
            for (int i2 = 0; i2 < c0639j0.f3878o.size(); i2++) {
                C0639j0 elementAt = c0639j0.f3878o.elementAt(i2);
                elementAt.f3866c = (i - elementAt.f3866c) - elementAt.f3868e;
                AbstractC0652n1 abstractC0652n1 = elementAt.f3877n;
                if (abstractC0652n1 != null) {
                    abstractC0652n1.mo4139a(new AbsoluteLayout.LayoutParams(elementAt.f3868e, elementAt.f3869f, elementAt.f3866c, elementAt.f3867d));
                }
            }
        }
    }

    /* renamed from: e */
    private void m4572e(C3489yj c3489yj) {
        int i;
        try {
            if (c3489yj.f14197a0 != null) {
                if (!c3489yj.f14211f) {
                    c3489yj.f14197a0.mo4150h().setVisibility(8);
                    C0639j0 elementAt = c3489yj.f14200b0.elementAt(0);
                    elementAt.f3869f = 0;
                    elementAt.f3868e = 0;
                    elementAt.f3864a = this.f3904K.f4395a;
                    elementAt.f3865b = this.f3904K.f4396b;
                    elementAt.f3866c = this.f3904K.f4395a;
                    elementAt.f3867d = this.f3904K.f4396b + c3489yj.m16643i(this.f3903J.f3868e);
                    elementAt.f3871h = this.f3904K.f4397c.right;
                    return;
                }
                c3489yj.f14197a0.mo4150h().setVisibility(0);
            }
        } catch (Exception unused) {
        }
        if (this.f3899F) {
            c3489yj.f14217h = "T";
        }
        C0639j0 c0639j0 = null;
        if (1 == c3489yj.f14224j0) {
            C0669v0 c0669v0 = this.f3904K;
            m4541a(c0669v0, (C0639j0) null, c3489yj, this.f3901H);
            this.f3904K = c0669v0;
        }
        if (c3489yj.f14208e == 39) {
            m4541a(this.f3904K, this.f3903J, c3489yj, this.f3901H);
        }
        if (c3489yj.f14200b0.elementAt(0) != null) {
            C0669v0 c0669v02 = this.f3904K;
            c0639j0 = c3489yj.f14200b0.elementAt(0);
            c0669v02.f4407m = c0639j0;
            AbstractC0652n1 abstractC0652n1 = c0639j0.f3877n;
            if ((abstractC0652n1 instanceof C0642k0) || (abstractC0652n1 instanceof C0645l0)) {
                if (this.f3904K.f4405k) {
                    c0639j0.f3868e = this.f3908O;
                    c0639j0.f3869f = this.f3907N;
                } else {
                    String str = c0639j0.f3875l.f3879p.f14233m0;
                    if (str != null && str.equalsIgnoreCase("equal")) {
                        c0639j0.f3868e = this.f3906M;
                        c0639j0.f3876m = true;
                    }
                }
                if (c0639j0.f3879p.f14208e == 40) {
                    m4593u();
                }
                c0639j0.f3877n.mo4174a(c0639j0, this.f3904K);
                c0639j0.f3873j = c0639j0.f3869f + c0639j0.f3879p.m16643i(this.f3904K.f4397c.width()) + c0639j0.f3879p.m16632a(this.f3904K.f4397c.width());
            }
        }
        C0669v0 c0669v03 = this.f3904K;
        m4567d(c0639j0, c0669v03);
        this.f3904K = c0669v03;
        if (c0639j0 == null || (i = c0639j0.f3870g) <= 0) {
            return;
        }
        c0669v03.f4404j += i;
    }

    /* renamed from: e */
    private void m4573e(C3489yj c3489yj, AbsoluteLayout absoluteLayout, C0639j0 c0639j0) {
        int[] iArr;
        int i = c3489yj.f14178R;
        if (i == 2) {
            C0635i c0635i = new C0635i(this.f4045c, null, c3489yj, c0639j0, this.f3904K, this.f3902I);
            c0635i.mo4595a(this.f4049g);
            c0635i.m4706a(this.f3918z);
            c3489yj.f14197a0 = c0635i;
            c0635i.m4468b(c3489yj);
            c0639j0.f3877n = c0635i;
            c0635i.mo4201a(new C0657p0(c3489yj.m16639e(c0639j0.f3868e), c3489yj.m16644j(c0639j0.f3868e), c3489yj.m16642h(c0639j0.f3868e), c3489yj.m16635b(c0639j0.f3868e), C0687b.m5342a(this.f4045c).m5343a().m5544a()));
            c0635i.m4469c(c0639j0.f3868e <= 0 ? new AbsoluteLayout.LayoutParams(this.f3903J.f3868e - (((this.f3895B.m16639e(c0639j0.f3868e) + this.f3895B.m16642h(c0639j0.f3868e)) + c3489yj.m16638d(c0639j0.f3868e)) + c3489yj.m16641g(c0639j0.f3868e)), c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d) : new AbsoluteLayout.LayoutParams(c0639j0.f3868e, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d));
            c0635i.m4478t();
            c0639j0.f3868e = c0635i.mo4152j();
            c0639j0.f3869f = c0635i.mo4151i();
            c0635i.m4466a(c3489yj.f14260v0);
            c0635i.m4476r();
            return;
        }
        if (i == 4 || i == 3) {
            C0665t0 c0665t0 = new C0665t0(this.f4045c, null, c3489yj, c0639j0);
            c0665t0.mo4595a(this.f4049g);
            c0665t0.m4706a(this.f3918z);
            c3489yj.f14197a0 = c0665t0;
            c0665t0.m4975b(c3489yj);
            c0639j0.f3877n = c0665t0;
            c0665t0.mo4201a(new C0657p0(c3489yj.m16639e(c0639j0.f3868e), c3489yj.m16644j(c0639j0.f3868e), c3489yj.m16642h(c0639j0.f3868e), c3489yj.m16635b(c0639j0.f3868e), C0687b.m5342a(this.f4045c).m5343a().m5544a()));
            c0665t0.m4976c(c0639j0.f3868e <= 0 ? new AbsoluteLayout.LayoutParams(this.f3903J.f3868e - (((this.f3895B.m16639e(c0639j0.f3868e) + this.f3895B.m16642h(c0639j0.f3868e)) + c3489yj.m16638d(c0639j0.f3868e)) + c3489yj.m16641g(c0639j0.f3868e)), c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d) : new AbsoluteLayout.LayoutParams(c0639j0.f3868e, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d));
            c0665t0.m4986s();
            c0639j0.f3868e = c0665t0.mo4152j();
            c0639j0.f3869f = c0665t0.mo4151i();
            c0665t0.m4973a(c3489yj.f14260v0);
            c0665t0.m4984q();
            return;
        }
        if (i == 1) {
            C0644l c0644l = new C0644l(this.f4045c, c3489yj, c0639j0);
            c0644l.mo4595a(this.f4049g);
            c0644l.m4706a(this.f3918z);
            for (int i2 = 0; i2 < c3489yj.f14174P.size(); i2++) {
                c0644l.m4623b(c3489yj.f14174P.elementAt(i2).f11756a);
            }
            c3489yj.f14197a0 = c0644l;
            c0644l.m4624b(c3489yj);
            c0639j0.f3877n = c0644l;
            c0644l.mo4201a(new C0657p0(c3489yj.m16639e(c0639j0.f3868e), c3489yj.m16644j(c0639j0.f3868e), c3489yj.m16642h(c0639j0.f3868e), c3489yj.m16635b(c0639j0.f3868e), C0687b.m5342a(this.f4045c).m5343a().m5544a()));
            c0644l.m4625c(c0639j0.f3868e <= 0 ? new AbsoluteLayout.LayoutParams(this.f3903J.f3868e - (((this.f3895B.m16639e(c0639j0.f3868e) + this.f3895B.m16642h(c0639j0.f3868e)) + c3489yj.m16638d(c0639j0.f3868e)) + c3489yj.m16641g(c0639j0.f3868e)), c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d) : new AbsoluteLayout.LayoutParams(c0639j0.f3868e, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d));
            c0644l.m4635q();
            c0644l.m4622a(c3489yj.f14260v0);
            String m200h = C0023aj.m160a(this.f4045c).m200h(c3489yj.f14186V);
            if (!TextUtils.isEmpty(c3489yj.f14176Q)) {
                m200h = C0023aj.m160a(this.f4045c).m200h(c3489yj.f14176Q);
            }
            if (TextUtils.isEmpty(m200h) && (iArr = c3489yj.f14184U) != null && iArr.length > 0) {
                c0644l.m4630i(iArr[0]);
            } else if (!TextUtils.isEmpty(m200h)) {
                c0644l.m4626c(m200h);
            } else if (c0644l.f3961z.size() > 0) {
                c0644l.m4630i(0);
            }
            c0644l.m4634p();
            c0639j0.f3868e = c0644l.mo4152j();
            c0639j0.f3869f = c0644l.mo4151i();
            c0644l.m4633o();
        }
    }

    /* renamed from: f */
    private void m4574f(C0639j0 c0639j0) {
        int i;
        int size = c0639j0.f3878o.size();
        C0657p0 c0657p0 = new C0657p0(0, 0, 0, 0, C0687b.m5342a(this.f4045c).m5343a().m5544a());
        int i2 = 0;
        while (i2 < size) {
            ArrayList<Integer> m4542a = m4542a(c0639j0, i2);
            int intValue = m4542a.get(0).intValue();
            int intValue2 = m4542a.get(3).intValue() + 1;
            int i3 = c0639j0.f3868e;
            int m16642h = (i3 - this.f3895B.m16642h(i3)) - intValue;
            if (m16642h > 0) {
                int i4 = intValue2 - i2;
                int i5 = m16642h / i4;
                int i6 = m16642h % i4;
                int i7 = 0;
                while (i2 < intValue2) {
                    C0639j0 c0639j02 = c0639j0.f3878o.get(i2);
                    if (c0639j02.f3866c <= i7) {
                        c0639j02.f3866c = i7;
                    }
                    if (i6 > 0) {
                        i = i5 + 1;
                        i6--;
                    } else {
                        i = i5;
                    }
                    int i8 = i % 2 == 0 ? i / 2 : (i / 2) + 1;
                    c0657p0.f4220c = i8;
                    int i9 = i / 2;
                    c0657p0.f4218a = i9;
                    int i10 = i8 + i9;
                    if (!(c0639j02.f3877n instanceof C0642k0)) {
                        c0657p0.f4218a = i9 + c0639j02.f3879p.m16639e(c0639j02.f3868e);
                        c0657p0.f4220c += c0639j02.f3879p.m16642h(c0639j02.f3868e);
                    }
                    c0639j02.f3877n.mo4201a(c0657p0);
                    c0639j02.f3868e += i10;
                    c0639j02.f3877n.mo4139a(new AbsoluteLayout.LayoutParams(c0639j02.f3868e, c0639j02.f3869f, c0639j02.f3866c, c0639j02.f3867d));
                    i7 = c0639j02.f3866c + c0639j02.f3868e + c0639j02.f3879p.m16641g(c0639j02.f3880q.f4397c.width());
                    i2++;
                }
            }
            i2 = intValue2;
        }
    }

    /* renamed from: f */
    private void m4575f(C3489yj c3489yj) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C0639j0 c0639j0 = null;
        try {
            if (c3489yj.f14197a0 != null) {
                c3489yj.f14197a0.mo4142b();
                c3489yj.f14197a0 = null;
            }
            if (c3489yj.f14200b0 != null) {
                c3489yj.f14200b0.clear();
            }
        } catch (Exception unused) {
        }
        int i6 = c3489yj.f14208e;
        if ((i6 == 7 || i6 == 28) && (i = this.f3895B.f14165K0) == 8 && i == 9) {
            return;
        }
        if (c3489yj.f14208e == 22) {
            String str = c3489yj.f14235n;
            if (str == null) {
                String m200h = !TextUtils.isEmpty(C0023aj.m160a(this.f4045c).m200h(c3489yj.f14186V)) ? C0023aj.m160a(this.f4045c).m200h(c3489yj.f14186V) : c3489yj.f14189W0;
                if (TextUtils.isEmpty(m200h)) {
                    return;
                }
                c3489yj.f14235n = m200h;
                c3489yj.f14191X0 = true;
            } else if (m4560b(str)) {
                C0669v0 c0669v0 = this.f3904K;
                m4541a(c0669v0, (C0639j0) null, c3489yj, this.f3901H);
                this.f3904K = c0669v0;
                return;
            }
        }
        if (c3489yj.f14208e != 23) {
            if (this.f3899F) {
                c3489yj.f14217h = "T";
            }
            if (1 == c3489yj.f14224j0) {
                C0669v0 c0669v02 = this.f3904K;
                m4541a(c0669v02, (C0639j0) null, c3489yj, this.f3901H);
                this.f3904K = c0669v02;
            }
            C0669v0 c0669v03 = this.f3904K;
            C0639j0 c0639j02 = c0669v03.f4406l;
            if (c0639j02 != null && c0669v03.f4396b > c0639j02.f3867d + c0639j02.f3869f) {
                c0669v03.f4406l = null;
                this.f3899F = false;
            }
            c0639j0 = new C0639j0(this.f4045c);
            c0639j0.f3875l = this.f3903J;
            c0639j0.f3879p = c3489yj;
            c3489yj.f14200b0.add(c0639j0);
            c0639j0.f3871h = this.f3904K.f4397c.right;
            this.f3903J.f3878o.add(c0639j0);
            C0669v0 c0669v04 = this.f3904K;
            c0669v04.f4407m = c0639j0;
            c0639j0.f3865b = c0669v04.f4396b;
            c0669v04.f4395a += c3489yj.f14211f ? c3489yj.m16638d(this.f3903J.f3868e) : 0;
            C0669v0 c0669v05 = this.f3904K;
            c0639j0.f3866c = c0669v05.f4395a;
            c0639j0.f3867d = c0669v05.f4396b + c3489yj.m16643i(this.f3903J.f3868e);
            C0669v0 c0669v06 = this.f3904K;
            c0639j0.f3880q = c0669v06;
            c0639j0.f3868e = c3489yj.m16645k(c0669v06.f4397c.width());
            if (this.f3904K.f4405k) {
                c0639j0.f3868e = this.f3908O;
            }
            c0639j0.f3869f = c3489yj.m16637c(this.f3904K.f4397c.height());
            c0639j0.f3870g = c3489yj.m16640f(this.f3904K.f4397c.height());
            if (c0639j0.f3869f == -3 && (i5 = c0639j0.f3868e) > 0) {
                c0639j0.f3869f = i5;
            }
            if (c0639j0.f3870g == -3 && (i4 = c0639j0.f3868e) > 0) {
                c0639j0.f3870g = i4;
            }
            if (c0639j0.f3868e == -3 && (i3 = c0639j0.f3869f) > 0) {
                c0639j0.f3868e = i3;
            }
        }
        m4552a(c3489yj, c0639j0);
        if (c0639j0 != null) {
            int m16643i = c0639j0.f3869f + c0639j0.f3879p.m16643i(this.f3904K.f4397c.width());
            c0639j0.f3873j = m16643i;
            int i7 = c3489yj.f14208e;
            if (i7 == 22 || i7 == 2 || i7 == 27) {
                for (int i8 = 0; i8 < c3489yj.f14200b0.size(); i8++) {
                    c3489yj.f14200b0.elementAt(i8).f3873j = c3489yj.f14200b0.elementAt(i8).f3869f;
                    if (i8 != 0) {
                        this.f3903J.f3878o.add(c3489yj.f14200b0.elementAt(i8));
                    }
                    try {
                        C0639j0 elementAt = c3489yj.f14200b0.elementAt(i8);
                        if (c3489yj.f14211f) {
                            elementAt.f3877n.mo4150h().setVisibility(0);
                        } else {
                            elementAt.f3877n.mo4150h().setVisibility(8);
                            elementAt.f3869f = 0;
                            elementAt.f3868e = 0;
                            elementAt.f3873j = 0;
                            elementAt.f3871h = 0;
                            elementAt.f3872i = 0;
                            elementAt.f3870g = 0;
                        }
                    } catch (Exception unused2) {
                    }
                }
                if (c3489yj.f14200b0.size() > 0) {
                    c3489yj.f14200b0.firstElement().f3873j += c3489yj.f14200b0.firstElement().f3879p.m16643i(this.f3904K.f4397c.width());
                    c3489yj.f14200b0.lastElement().f3873j += c3489yj.f14200b0.lastElement().f3879p.m16632a(this.f3904K.f4397c.width());
                    c0639j0 = c3489yj.f14200b0.lastElement();
                    this.f3904K.f4407m = c0639j0;
                }
            } else {
                c0639j0.f3873j = m16643i + c0639j0.f3879p.m16632a(this.f3904K.f4397c.width());
                try {
                    if (c3489yj.f14211f) {
                        c3489yj.f14197a0.mo4150h().setVisibility(0);
                    } else {
                        c3489yj.f14197a0.mo4150h().setVisibility(8);
                        c0639j0.f3869f = 0;
                        c0639j0.f3868e = 0;
                        c0639j0.f3873j = 0;
                        c0639j0.f3872i = 0;
                        c0639j0.f3871h = 0;
                        c0639j0.f3870g = 0;
                    }
                } catch (Exception unused3) {
                }
            }
        }
        if (c3489yj.f14208e != 23) {
            C3489yj c3489yj2 = c0639j0.f3879p;
            if (1 == c3489yj2.f14224j0) {
                this.f3904K.f4406l = c0639j0;
                c3489yj2.f14217h = "T";
                this.f3899F = true;
            }
            C0669v0 c0669v07 = this.f3904K;
            m4567d(c0639j0, c0669v07);
            this.f3904K = c0669v07;
            if (c0639j0 == null || (i2 = c0639j0.f3870g) <= 0) {
                return;
            }
            c0669v07.f4404j += i2;
        }
    }

    /* renamed from: f */
    private void m4576f(C3489yj c3489yj, AbsoluteLayout absoluteLayout, C0639j0 c0639j0) {
        C0658q c0658q = new C0658q(this.f4045c, null, c3489yj, c0639j0, this.f3902I);
        c0658q.m4706a(this.f3918z);
        c3489yj.f14197a0 = c0658q;
        c0658q.m4888c(c3489yj);
        c0639j0.f3877n = c0658q;
        c0658q.mo4201a(new C0657p0(c3489yj.m16639e(c0639j0.f3868e), c3489yj.m16644j(c0639j0.f3868e), c3489yj.m16642h(c0639j0.f3868e), c3489yj.m16635b(c0639j0.f3868e), C0687b.m5342a(this.f4045c).m5343a().m5544a()));
        c0658q.m4887c(c0639j0.f3868e <= 0 ? new AbsoluteLayout.LayoutParams(-2, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d) : new AbsoluteLayout.LayoutParams(c0639j0.f3868e, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d));
        c0658q.m4895r();
        c0658q.m4883a(c3489yj.f14260v0);
        c0658q.mo4595a(this.f4049g);
        c0639j0.f3868e = c0658q.mo4152j();
        c0639j0.f3869f = c0658q.mo4151i();
        c0658q.m4893p();
    }

    /* renamed from: g */
    private void m4577g(C0639j0 c0639j0) {
        C0669v0 c0669v0 = this.f3904K;
        int i = c0669v0.f4395a;
        c0639j0.f3864a = i;
        c0639j0.f3865b = c0669v0.f4396b;
        c0639j0.f3866c = i + c0639j0.f3879p.m16638d(c0639j0.f3880q.f4397c.width());
        c0639j0.f3867d = this.f3904K.f4396b + c0639j0.f3879p.m16643i(c0639j0.f3880q.f4397c.width());
        AbstractC0652n1 abstractC0652n1 = c0639j0.f3877n;
        if (abstractC0652n1 != null) {
            boolean z = abstractC0652n1 instanceof C0642k0;
            abstractC0652n1.mo4139a(new AbsoluteLayout.LayoutParams(c0639j0.f3868e, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d));
        }
        this.f3904K = m4567d(c0639j0, this.f3904K);
    }

    /* renamed from: g */
    private void m4578g(C3489yj c3489yj) {
        C0639j0 c0639j0;
        int i;
        boolean z = this.f3904K.f4405k;
        if (this.f3899F) {
            c3489yj.f14217h = "T";
        }
        if (1 == c3489yj.f14224j0) {
            C0669v0 c0669v0 = this.f3904K;
            m4541a(c0669v0, (C0639j0) null, c3489yj, this.f3901H);
            this.f3904K = c0669v0;
        }
        if (this.f3904K.f4405k) {
            this.f3903J.f3868e = this.f3908O;
        }
        if (c3489yj.f14208e == 40) {
            if (this.f3912S != null) {
                C0619c1 c0619c1 = new C0619c1();
                if (!TextUtils.isEmpty(c3489yj.f14205d)) {
                    c0619c1.m4193a(c3489yj.f14205d);
                }
                c0619c1.m4192a(c3489yj.f14163J0);
                if (TextUtils.isEmpty(c3489yj.f14241p.m6070i())) {
                    c3489yj.f14241p.m6060b(this.f3895B.f14241p.m6070i());
                }
                c0619c1.m4191a(c3489yj.f14241p);
                this.f3912S.add(c0619c1);
            }
            AbsoluteLayout absoluteLayout = new AbsoluteLayout(this.f4045c);
            m4593u();
            this.f3902I.m4791a(c3489yj, absoluteLayout, this.f3903J, this.f3904K);
            c0639j0 = c3489yj.f14200b0.get(0);
            c0639j0.f3873j = c0639j0.f3869f + c0639j0.f3879p.m16643i(this.f3904K.f4397c.width()) + c0639j0.f3879p.m16632a(this.f3904K.f4397c.width());
            absoluteLayout.removeAllViews();
            NestedScrollView nestedScrollView = new NestedScrollView(this.f4045c);
            nestedScrollView.setVerticalScrollBarEnabled(false);
            nestedScrollView.addView(c3489yj.f14197a0.mo4150h());
            this.f3911R.add(nestedScrollView);
            nestedScrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            m4594a(nestedScrollView, c3489yj);
        } else {
            this.f3902I.m4791a(c3489yj, this.f3918z, this.f3903J, this.f3904K);
            c0639j0 = c3489yj.f14200b0.get(0);
            c0639j0.f3873j = c0639j0.f3869f + c0639j0.f3879p.m16643i(this.f3904K.f4397c.width()) + c0639j0.f3879p.m16632a(this.f3904K.f4397c.width());
        }
        try {
            if (c3489yj.f14211f) {
                c3489yj.f14197a0.mo4150h().setVisibility(0);
            } else {
                c3489yj.f14197a0.mo4150h().setVisibility(8);
                c0639j0.f3869f = 0;
                c0639j0.f3868e = 0;
                c0639j0.f3873j = 0;
                c0639j0.f3872i = 0;
                c0639j0.f3871h = 0;
                c0639j0.f3870g = 0;
            }
        } catch (Exception unused) {
        }
        C0669v0 c0669v02 = this.f3904K;
        m4567d(c0639j0, c0669v02);
        this.f3904K = c0669v02;
        if (c0639j0 == null || (i = c0639j0.f3870g) <= 0) {
            return;
        }
        c0669v02.f4404j += i;
    }

    /* renamed from: g */
    private void m4579g(C3489yj c3489yj, AbsoluteLayout absoluteLayout, C0639j0 c0639j0) {
        C0664t c0664t = new C0664t(this.f4045c, c3489yj, c0639j0);
        c0664t.m4706a(this.f3918z);
        c3489yj.f14197a0 = c0664t;
        c0664t.mo4595a(this.f4049g);
        c0664t.m4969a(C0731p1.f5073b);
        c0664t.m4971n();
        c0664t.mo4201a(new C0657p0(c3489yj.m16639e(c0639j0.f3868e), c3489yj.m16644j(c0639j0.f3868e), c3489yj.m16642h(c0639j0.f3868e), c3489yj.m16635b(c0639j0.f3868e), C0687b.m5342a(this.f4045c).m5343a().m5544a()));
        c0639j0.f3868e = c0664t.mo4152j();
        c0639j0.f3869f = c0664t.mo4151i();
        c0639j0.f3877n = c0664t;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01aa  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m4580h(com.comviva.webaxn.p002ui.C0639j0 r10) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0642k0.m4580h(com.comviva.webaxn.ui.j0):void");
    }

    /* renamed from: h */
    private void m4581h(C3489yj c3489yj) {
        if (c3489yj.f14208e == 3) {
            AbstractC0652n1 abstractC0652n1 = c3489yj.f14197a0;
            if (abstractC0652n1 == null) {
                return;
            }
            if (((C0670w) abstractC0652n1).m5100p()) {
                if (c3489yj.f14240o1) {
                    c3489yj.f14240o1 = false;
                }
                this.f3902I.m4790a(c3489yj);
                return;
            } else if (!c3489yj.f14240o1) {
                return;
            }
        } else if (!c3489yj.f14240o1) {
            return;
        }
        this.f3902I.m4810d(c3489yj);
    }

    /* renamed from: h */
    private void m4582h(C3489yj c3489yj, AbsoluteLayout absoluteLayout, C0639j0 c0639j0) {
        C0482bj c0482bj;
        String str;
        C0670w c0670w = new C0670w(this.f4045c, c0639j0, this.f3902I);
        c0670w.mo4595a(this.f4049g);
        int m5070a = c0670w.m5070a(c3489yj.f14178R, c3489yj.f14164K, c3489yj.f14229l);
        C0744u c0744u = c3489yj.f14241p;
        if (c0744u != null) {
            if (c0744u.m6072k()) {
                c0670w.mo4176b(c3489yj.f14241p.m6062c());
            }
            if (c3489yj.f14241p.m6071j()) {
                c0670w.mo4314a(c3489yj.f14241p.m6057b());
            }
            c0670w.m5083b(c3489yj.f14241p.m6067f());
            c0670w.m5094i(c3489yj.f14241p.m6068g());
            c0670w.m5071a(c3489yj.f14241p.m6064d());
        }
        String str2 = c3489yj.f14238o;
        if (str2 != null) {
            c0670w.m5088e(str2);
        }
        if (c3489yj.m16636b()) {
            c0670w.m5092h(c3489yj.m16631a());
        }
        if (m5070a != 3 && m5070a != 6) {
            String m200h = C0023aj.m160a(this.f4045c).m200h(c3489yj.f14186V);
            if (!TextUtils.isEmpty(c3489yj.f14176Q)) {
                m200h = C0023aj.m160a(this.f4045c).m200h(c3489yj.f14176Q);
            }
            if (TextUtils.isEmpty(m200h)) {
                m200h = C0023aj.m160a(this.f4045c).m197g(c3489yj.f14186V);
            }
            if (TextUtils.isEmpty(m200h) && (str = c3489yj.f14235n) != null) {
                m200h = str;
            }
            c0670w.m5087d(m200h);
        }
        if (true == c0639j0.f3881r) {
            c0670w.m5098n();
        }
        c0670w.m5078a(c3489yj.f14247r);
        c0670w.m4706a((ViewGroup) this.f3918z);
        c3489yj.f14197a0 = c0670w;
        c0639j0.f3877n = c0670w;
        c0670w.m5084b(c3489yj);
        int i = c0639j0.f3869f;
        int i2 = i > 0 ? i : -2;
        c0670w.mo4201a(new C0657p0(c3489yj.m16639e(c0639j0.f3868e), c3489yj.m16644j(c0639j0.f3868e), c3489yj.m16642h(c0639j0.f3868e), c3489yj.m16635b(c0639j0.f3868e), C0687b.m5342a(this.f4045c).m5343a().m5544a()));
        c0670w.m5085c(c0639j0.f3868e <= 0 ? new AbsoluteLayout.LayoutParams(this.f3903J.f3868e - (((this.f3895B.m16639e(c0639j0.f3868e) + this.f3895B.m16642h(c0639j0.f3868e)) + c3489yj.m16638d(c0639j0.f3868e)) + c3489yj.m16641g(c0639j0.f3868e)), i2, c0639j0.f3866c, c0639j0.f3867d) : new AbsoluteLayout.LayoutParams(c0639j0.f3868e, i2, c0639j0.f3866c, c0639j0.f3867d));
        if (c3489yj.f14165K0 == 1 && (c0482bj = c3489yj.f14167L0) != null && c0482bj.m3408d() != -1) {
            c0670w.m5092h(c3489yj.f14167L0.m3408d());
        }
        if (c3489yj.f14165K0 == 4) {
            c0670w.m5080a(false);
            c0670w.mo4176b(0);
        }
        int i3 = c3489yj.f14180S;
        if (i3 > 0) {
            c0670w.m5096j(i3);
        }
        c0670w.m5106v();
        c0670w.m5081a(c3489yj.f14260v0);
        c0639j0.f3868e = c0670w.mo4152j();
        c0639j0.f3869f = c0670w.mo4151i();
        c0670w.m5102r();
    }

    /* renamed from: i */
    private void m4583i(C3489yj c3489yj, AbsoluteLayout absoluteLayout, C0639j0 c0639j0) {
        C0618c0 c0618c0 = new C0618c0(this.f4045c, c3489yj, c0639j0);
        c0618c0.m4706a(this.f3918z);
        c3489yj.f14197a0 = c0618c0;
        c0618c0.m4183b(c3489yj);
        c0618c0.m4184c(c0639j0.f3868e <= 0 ? new AbsoluteLayout.LayoutParams(this.f3904K.f4397c.width() - (c3489yj.m16638d(this.f3904K.f4397c.width()) + c3489yj.m16641g(this.f3904K.f4397c.width())), c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d) : new AbsoluteLayout.LayoutParams(c0639j0.f3868e, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d));
        c0618c0.mo4595a(this.f4049g);
        c0618c0.m4186n();
        c0618c0.m4182a(c3489yj.f14260v0);
        c0639j0.f3868e = c0618c0.mo4152j();
        c0639j0.f3869f = c0618c0.mo4151i();
        c0639j0.f3877n = c0618c0;
        c0618c0.m4185m();
    }

    /* renamed from: j */
    private void m4584j(C3489yj c3489yj, AbsoluteLayout absoluteLayout, C0639j0 c0639j0) {
        AbsoluteLayout.LayoutParams layoutParams;
        C0627f0 c0627f0 = new C0627f0(this.f4045c, c3489yj, c0639j0);
        c0627f0.m4706a(this.f3918z);
        c3489yj.f14197a0 = c0627f0;
        c0639j0.f3877n = c0627f0;
        c0627f0.m4320b(c3489yj);
        C0744u c0744u = c3489yj.f14241p;
        if (c0744u != null) {
            c0627f0.m4318b(c0744u.m6067f());
            c0627f0.m4313a(c3489yj.f14241p.m6064d());
        }
        int i = c0639j0.f3868e;
        if (i <= 0) {
            layoutParams = new AbsoluteLayout.LayoutParams(-2, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d);
        } else {
            if (this.f3904K.f4405k) {
                c0639j0.f3869f = i;
            }
            layoutParams = new AbsoluteLayout.LayoutParams(c0639j0.f3868e, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d);
        }
        c0627f0.m4312a(layoutParams, this.f3904K);
        c0627f0.mo4595a(this.f4049g);
        if (c3489yj.f14260v0 != null || c3489yj.f14172O != null || c3489yj.f14248r0 != null) {
            c0627f0.m4317a(c3489yj.f14260v0);
        }
        c0627f0.m4327p();
        c0627f0.mo4201a(new C0657p0(c3489yj.m16639e(c0639j0.f3880q.f4397c.width()), c3489yj.m16644j(c0639j0.f3880q.f4397c.width()), c3489yj.m16642h(c0639j0.f3880q.f4397c.width()), c3489yj.m16635b(c0639j0.f3880q.f4397c.width()), C0687b.m5342a(this.f4045c).m5343a().m5544a()));
        if (c0639j0.f3876m) {
            return;
        }
        c0639j0.f3868e = c0627f0.mo4152j();
        c0639j0.f3869f = c0627f0.mo4151i();
    }

    /* renamed from: k */
    private void m4585k(C3489yj c3489yj, AbsoluteLayout absoluteLayout, C0639j0 c0639j0) {
        AbsoluteLayout.LayoutParams layoutParams;
        C0669v0 c0669v0;
        C0673x0 c0673x0 = new C0673x0(this.f4045c, c3489yj, c0639j0, this.f3902I);
        c0673x0.m4706a(this.f3918z);
        c3489yj.f14197a0 = c0673x0;
        c0673x0.m5145b(c3489yj);
        c0673x0.m5146g(c3489yj.f14241p.m6062c());
        c0673x0.m5148i(c3489yj.f14241p.m6062c());
        c0673x0.m5143b(c3489yj.f14241p.m6067f());
        c0673x0.m5147h(c3489yj.f14241p.m6068g());
        c0673x0.m5141a(c3489yj.f14241p.m6064d());
        if (c0639j0.f3868e <= 0) {
            layoutParams = new AbsoluteLayout.LayoutParams(-2, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d);
            c0669v0 = this.f3904K;
        } else {
            layoutParams = new AbsoluteLayout.LayoutParams(c0639j0.f3868e, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d);
            c0669v0 = null;
        }
        c0673x0.m5140a(layoutParams, c0669v0);
        c0673x0.mo4595a(this.f4049g);
        c0673x0.m5150n();
        c0673x0.m5142a(c3489yj.f14260v0);
        c0639j0.f3868e = c0673x0.mo4152j();
        c0639j0.f3869f = c0673x0.mo4151i();
        c0639j0.f3877n = c0673x0;
    }

    /* renamed from: l */
    private void m4586l(C3489yj c3489yj, AbsoluteLayout absoluteLayout, C0639j0 c0639j0) {
        C0677z0 c0677z0 = new C0677z0(this.f4045c, c3489yj, c0639j0, this.f3902I.f4134b);
        c0677z0.m4706a(this.f3918z);
        c3489yj.f14197a0 = c0677z0;
        c0677z0.m5184b(c3489yj);
        c0677z0.mo4595a(this.f4049g);
        c0677z0.m5183a(c3489yj.f14260v0);
        c0677z0.m5182a(new AbsoluteLayout.LayoutParams(c0639j0.f3868e, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d), this.f3904K);
        c0677z0.m5187o();
        c0639j0.f3868e = c0677z0.mo4152j();
        c0639j0.f3869f = c0677z0.mo4151i();
        c0639j0.f3877n = c0677z0;
        c0677z0.m5186n();
    }

    /* renamed from: m */
    private void m4587m(C3489yj c3489yj, AbsoluteLayout absoluteLayout, C0639j0 c0639j0) {
        SurfaceHolderCallbackC0634h1 surfaceHolderCallbackC0634h1 = new SurfaceHolderCallbackC0634h1(this.f4045c, c3489yj, c0639j0);
        surfaceHolderCallbackC0634h1.m4450b(c3489yj);
        surfaceHolderCallbackC0634h1.m4706a(this.f3918z);
        c3489yj.f14197a0 = surfaceHolderCallbackC0634h1;
        surfaceHolderCallbackC0634h1.m4451g(c3489yj.f14241p.m6068g());
        surfaceHolderCallbackC0634h1.m4449a(new AbsoluteLayout.LayoutParams(c0639j0.f3868e, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d), this.f3904K);
        surfaceHolderCallbackC0634h1.mo4595a(this.f4049g);
        surfaceHolderCallbackC0634h1.m4454o();
        c0639j0.f3868e = surfaceHolderCallbackC0634h1.mo4152j();
        c0639j0.f3869f = surfaceHolderCallbackC0634h1.mo4151i();
        c0639j0.f3877n = surfaceHolderCallbackC0634h1;
        this.f4049g.mo4835a(surfaceHolderCallbackC0634h1);
    }

    /* renamed from: n */
    private void m4588n(C3489yj c3489yj, AbsoluteLayout absoluteLayout, C0639j0 c0639j0) {
        AbsoluteLayout.LayoutParams layoutParams;
        C0669v0 c0669v0;
        C0649m1 c0649m1 = new C0649m1(this.f4045c, c3489yj, c0639j0);
        c0649m1.m4706a(this.f3918z);
        c3489yj.f14197a0 = c0649m1;
        c0649m1.m4694b(c3489yj);
        if (c0639j0.f3868e <= 0) {
            layoutParams = new AbsoluteLayout.LayoutParams(-2, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d);
            c0669v0 = this.f3904K;
        } else {
            layoutParams = new AbsoluteLayout.LayoutParams(c0639j0.f3868e, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d);
            c0669v0 = null;
        }
        c0649m1.m4693a(layoutParams, c0669v0);
        c0649m1.m4693a(new AbsoluteLayout.LayoutParams(c0639j0.f3868e, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d), this.f3904K);
        c0649m1.mo4595a(this.f4049g);
        c0649m1.m4695m();
        c0639j0.f3868e = c0649m1.mo4152j();
        c0639j0.f3869f = c0649m1.mo4151i();
        c0639j0.f3877n = c0649m1;
    }

    /* renamed from: q */
    private int m4589q() {
        int i = f3893W;
        int i2 = this.f3903J.f3868e;
        int i3 = i2 / i;
        return i3 > 0 ? i2 / i3 : i;
    }

    /* renamed from: r */
    private void m4590r() {
        ArrayList<View> arrayList;
        ArrayList<View> arrayList2;
        C0639j0 c0639j0 = this.f3903J;
        C3489yj c3489yj = c0639j0.f3879p;
        if (c3489yj.f14221i0 == 4) {
            this.f3907N = this.f3904K.f4400f;
        } else {
            String str = c3489yj.f14233m0;
            if (str == null || !str.equalsIgnoreCase("equal")) {
                if (this.f3909P != null) {
                    if (this.f3910Q == null || (arrayList2 = this.f3911R) == null) {
                        return;
                    }
                    this.f3910Q.setAdapter(new C0622d1(this.f4045c, arrayList2));
                    this.f3909P.setupWithViewPager(this.f3910Q);
                    m4592t();
                    return;
                }
                if (this.f3910Q == null || (arrayList = this.f3911R) == null) {
                    return;
                }
                this.f3910Q.setAdapter(new C0616b1(this.f4045c, arrayList));
                this.f3913T.setViewPager(this.f3910Q);
                int[] iArr = this.f3895B.f14184U;
                if (iArr == null || iArr.length <= 0) {
                    return;
                }
                if (iArr[0] < 0) {
                    iArr[0] = 0;
                } else if (iArr[0] >= this.f3911R.size()) {
                    this.f3895B.f14184U[0] = 0;
                }
                this.f3910Q.setCurrentItem(this.f3895B.f14184U[0]);
                return;
            }
            int i = this.f3904K.f4398d;
            this.f3906M = i;
            if (i > this.f3908O) {
                int m4561c = m4561c(this.f3903J);
                if (m4561c <= 0) {
                    m4561c = this.f3908O;
                }
                this.f3906M = m4561c;
            }
            c0639j0 = this.f3903J;
        }
        mo4174a(c0639j0.f3875l, c0639j0.f3880q);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m4591s() {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0642k0.m4591s():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 21) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00de, code lost:
    
        r4.setText(r8.f3912S.get(r1).m4197e());
        r8.f3912S.get(r1).m4190a(r4);
        m4544a(r1, r5, false, false);
        r8.f3912S.get(r1).m4189a(r5);
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d3, code lost:
    
        r4.setLetterSpacing(r8.f3895B.f14241p.m6064d());
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d1, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 21) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m4592t() {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0642k0.m4592t():void");
    }

    /* renamed from: u */
    private void m4593u() {
        C0669v0 c0669v0 = this.f3904K;
        int m16639e = this.f3895B.m16639e(this.f3903J.f3868e);
        int m16644j = this.f3895B.m16644j(this.f3903J.f3868e);
        int i = this.f3903J.f3868e;
        int m16642h = i - this.f3895B.m16642h(i);
        int i2 = this.f3903J.f3869f;
        c0669v0.f4397c = new Rect(m16639e, m16644j, m16642h, i2 - this.f3895B.m16635b(i2));
        C0669v0 c0669v02 = this.f3904K;
        Rect rect = c0669v02.f4397c;
        c0669v02.f4395a = rect.left;
        c0669v02.f4396b = rect.top;
        c0669v02.f4398d = 0;
        c0669v02.f4402h = 0;
        c0669v02.f4400f = 0;
        c0669v02.f4399e = 0;
        c0669v02.f4403i = 0;
        c0669v02.f4404j = 0;
        c0669v02.f4406l = null;
        this.f3899F = false;
        c0669v02.f4407m = null;
    }

    /* renamed from: a */
    public void m4594a(View view, C3489yj c3489yj) {
        Drawable m4705a = m4705a(c3489yj, c3489yj.f14145A0 == null ? this.f3903J.f3880q.f4397c.width() : this.f3903J.f3868e, this.f3903J.f3869f, true);
        if (m4705a != null) {
            view.setBackground(m4705a);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4139a(AbsoluteLayout.LayoutParams layoutParams) {
        int i = this.f3895B.f14208e;
        if (this.f3895B.f14208e == 40) {
            return;
        }
        View mo4150h = mo4150h();
        if (this.f4044b instanceof AbsoluteLayout) {
            ((AbsoluteLayout.LayoutParams) mo4150h.getLayoutParams()).x = layoutParams.x;
            ((AbsoluteLayout.LayoutParams) mo4150h.getLayoutParams()).y = layoutParams.y;
        }
        if (layoutParams.width > 0) {
            mo4150h.getLayoutParams().width = layoutParams.width;
        }
        if (layoutParams.height > 0) {
            mo4150h.getLayoutParams().height = layoutParams.height;
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4174a(C0639j0 c0639j0, C0669v0 c0669v0) {
        int i;
        C3489yj c3489yj = this.f3895B;
        C0639j0 c0639j02 = this.f3903J;
        c0639j02.f3880q = c0669v0;
        m4563c(c0639j02, c0669v0);
        m4593u();
        this.f3908O = m4589q();
        C2434ej c2434ej = this.f3895B.f14173O0;
        if (c2434ej != null) {
            c2434ej.m11615a(this.f3903J.f3869f);
        }
        if (this.f3895B.f14221i0 == 4) {
            this.f3904K.f4405k = true;
        }
        try {
            if (c3489yj.f14268z0 != null) {
                int i2 = 0;
                while (i2 < c3489yj.f14268z0.size()) {
                    C3489yj elementAt = c3489yj.f14268z0.elementAt(i2);
                    int i3 = i2 + 1;
                    if (i3 < c3489yj.f14268z0.size()) {
                        this.f3900G = c3489yj.f14268z0.elementAt(i3);
                    } else {
                        this.f3900G = null;
                    }
                    if (i2 <= 0 || i2 - 1 < 0) {
                        this.f3901H = null;
                    } else {
                        this.f3901H = c3489yj.f14268z0.elementAt(i);
                    }
                    if ((elementAt.f14268z0 == null || elementAt.f14268z0.size() <= 0) && elementAt.f14208e != 33 && elementAt.f14208e != 36) {
                        if (elementAt.f14208e == 23 || elementAt.f14200b0.size() != 0) {
                            m4569d(elementAt);
                        } else {
                            m4575f(elementAt);
                        }
                        i2 = i3;
                    }
                    if (elementAt.f14200b0.size() == 0) {
                        m4578g(elementAt);
                    } else {
                        m4572e(elementAt);
                    }
                    i2 = i3;
                }
            }
            m4580h(this.f3903J);
            mo4597k();
        } catch (OutOfMemoryError unused) {
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4201a(C0657p0 c0657p0) {
        this.f3918z.setPadding(c0657p0.f4218a, c0657p0.f4219b, c0657p0.f4220c, c0657p0.f4221d);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4595a(C0755x1.p pVar) {
        this.f4049g = pVar;
        C0661r0 c0661r0 = this.f3894A;
        if (c0661r0 != null) {
            c0661r0.setRenderingEventCb(pVar);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
        C2475fj c2475fj;
        C2515gj c2515gj;
        int i;
        C2597ij c2597ij = c3489yj.f14228k1;
        if ((c2597ij == null || !c2597ij.m12477i()) && (((c2475fj = c3489yj.f14231l1) == null || !c2475fj.m11787h()) && ((c2515gj = c3489yj.f14234m1) == null || !c2515gj.m12028i()))) {
            if (c3489yj.f14252s1) {
                C3489yj c3489yj2 = this.f3895B;
                if (c3489yj2.f14208e == 39) {
                    c3489yj2.f14252s1 = false;
                    m4601p();
                    return;
                }
                return;
            }
            View view = this.f3918z;
            C3489yj c3489yj3 = this.f3895B;
            int i2 = c3489yj3.f14208e;
            if (i2 == 33 || i2 == 39 || (i = c3489yj3.f14165K0) == 8 || i == 9) {
                view = this.f3897D;
            }
            m4594a(view, c3489yj);
            return;
        }
        C2597ij c2597ij2 = c3489yj.f14228k1;
        if (c2597ij2 == null || !c2597ij2.m12477i()) {
            C2475fj c2475fj2 = c3489yj.f14231l1;
            if (c2475fj2 == null || !c2475fj2.m11787h()) {
                C2515gj c2515gj2 = c3489yj.f14234m1;
                if (c2515gj2 == null || !c2515gj2.m12028i()) {
                    return;
                }
                this.f3895B.f14234m1.m12012a(c3489yj.f14234m1.m12013a());
                c3489yj.f14234m1.m12017b(false);
                return;
            }
            this.f3895B.f14231l1.m11772a(c3489yj.f14231l1.m11773a());
            c3489yj.f14231l1.m11777b(false);
            if (c3489yj.f14208e != 40) {
                return;
            }
        } else {
            this.f3895B.f14228k1.m12462a(c3489yj.f14228k1.m12463a());
            c3489yj.f14228k1.m12467b(false);
            if (c3489yj.f14208e != 40) {
                return;
            }
        }
        C3489yj c3489yj4 = c3489yj.f14145A0;
        c3489yj4.f14252s1 = true;
        c3489yj4.f14197a0.mo4140a(c3489yj4);
    }

    /* renamed from: a */
    public void m4596a(C3489yj c3489yj, boolean z) {
        int i = 0;
        while (true) {
            Vector<C3489yj> vector = c3489yj.f14268z0;
            if (vector == null || i >= vector.size()) {
                return;
            }
            AbstractC0652n1 abstractC0652n1 = c3489yj.f14268z0.elementAt(i).f14197a0;
            if (abstractC0652n1 != null) {
                if (z) {
                    abstractC0652n1.mo4147d();
                } else {
                    abstractC0652n1.mo4146c();
                }
            }
            i++;
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4142b() {
        if (this.f3895B.f14208e == 40) {
            return;
        }
        this.f4044b.removeView(mo4150h());
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: c */
    public void mo4146c() {
        C3489yj c3489yj = this.f3895B;
        c3489yj.f14199b = false;
        if (c3489yj.f14210e1) {
            AbstractC0652n1.m4697a(this.f3918z, c3489yj.f14207d1);
        }
        m4596a(this.f3895B, false);
        this.f3918z.setOnClickListener(null);
        this.f3918z.setClickable(false);
        this.f3918z.setFocusable(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r4.f3895B.f14232m.equalsIgnoreCase("exit") == false) goto L23;
     */
    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo4147d() {
        /*
            r4 = this;
            yj r0 = r4.f3895B
            r1 = 1
            r0.f14199b = r1
            r4.m4596a(r0, r1)
            yj r0 = r4.f3895B
            boolean r2 = r0.f14199b
            if (r2 == 0) goto L55
            java.lang.String r2 = r0.f14220i
            if (r2 == 0) goto L18
            int r0 = r0.f14208e
            r2 = 25
            if (r0 != r2) goto L44
        L18:
            yj r0 = r4.f3895B
            java.lang.String r2 = r0.f14226k
            if (r2 != 0) goto L44
            int r2 = r0.f14208e
            r3 = 18
            if (r2 == r3) goto L44
            r3 = 29
            if (r2 == r3) goto L44
            r3 = 32
            if (r2 == r3) goto L44
            java.lang.String r0 = r0.f14232m
            if (r0 == 0) goto L55
            java.lang.String r2 = "close"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L44
            yj r0 = r4.f3895B
            java.lang.String r0 = r0.f14232m
            java.lang.String r2 = "exit"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L55
        L44:
            android.widget.AbsoluteLayout r0 = r4.f3918z
            android.view.View$OnClickListener r2 = r4.f3915V
            r0.setOnClickListener(r2)
            android.widget.AbsoluteLayout r0 = r4.f3918z
            r0.setClickable(r1)
            android.widget.AbsoluteLayout r0 = r4.f3918z
            r0.setFocusable(r1)
        L55:
            yj r0 = r4.f3895B
            boolean r0 = r0.f14210e1
            if (r0 == 0) goto L67
            android.widget.AbsoluteLayout r0 = r4.f3918z
            float r1 = com.comviva.webaxn.p002ui.AbstractC0652n1.f4038r
            com.comviva.webaxn.p002ui.AbstractC0652n1.m4697a(r0, r1)
            yj r0 = r4.f3895B
            r1 = 0
            r0.f14210e1 = r1
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0642k0.mo4147d():void");
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: f */
    public C3489yj mo4148f() {
        return this.f3895B;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: h */
    public View mo4150h() {
        return this.f3916x;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: i */
    public int mo4151i() {
        return this.f4053k;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: j */
    public int mo4152j() {
        return this.f4054l;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: k */
    public void mo4597k() {
        C0639j0 c0639j0;
        int i;
        int i2 = this.f3895B.f14208e;
        if (i2 == 39 || i2 == 40 || (i = (c0639j0 = this.f3903J).f3870g) <= 0) {
            return;
        }
        if (i >= c0639j0.f3872i) {
            ViewGroup viewGroup = (ViewGroup) this.f3896C.getParent();
            ViewGroup viewGroup2 = (ViewGroup) this.f3896C.getChildAt(0);
            if (viewGroup != null) {
                int indexOfChild = viewGroup.indexOfChild(this.f3896C);
                this.f3896C.removeAllViews();
                viewGroup.removeView(this.f3896C);
                viewGroup.addView(viewGroup2, indexOfChild);
                this.f3916x = viewGroup2;
            }
            this.f3902I.f4134b.m16933a(false);
            return;
        }
        ViewGroup viewGroup3 = (ViewGroup) this.f3896C.getParent();
        View view = this.f3918z;
        if (viewGroup3 == null) {
            if (this.f3895B.f14208e == 33) {
                view = this.f3897D;
            }
            this.f4044b.addView(this.f3896C, this.f4044b.indexOfChild(view));
            this.f4044b.removeView(view);
            this.f3896C.addView(view);
            this.f3916x = this.f3896C;
        }
        this.f3902I.f4134b.m16933a(true);
    }

    /* renamed from: m */
    public C0662s m4598m() {
        return this.f3898E;
    }

    /* renamed from: n */
    public void m4599n() {
        C2391dj c2391dj;
        C3489yj c3489yj = this.f3895B;
        if (c3489yj.f14208e == 40 || (c2391dj = c3489yj.f14163J0) == null) {
            return;
        }
        AbstractC0652n1.m4700a(c2391dj, mo4150h());
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0041, code lost:
    
        if (r6.f3895B.f14232m.equalsIgnoreCase("exit") == false) goto L27;
     */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4600o() {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0642k0.m4600o():void");
    }

    /* renamed from: p */
    public void m4601p() {
        int i = this.f3914U - 1;
        this.f3914U = i;
        if (i == 0) {
            m4546a(this.f3895B.f14184U[0], false);
        } else if (i < 0) {
            this.f3914U = 0;
        }
    }
}
