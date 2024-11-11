package com.comviva.webaxn.ui;

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
import com.comviva.webaxn.utils.TapsellSDKAdv;
import com.comviva.webaxn.utils.p1;
import com.comviva.webaxn.utils.x1;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.tabs.TabLayout;
import defpackage.aj;
import defpackage.bj;
import defpackage.dj;
import defpackage.ej;
import defpackage.fj;
import defpackage.gj;
import defpackage.hj;
import defpackage.ij;
import defpackage.q2;
import defpackage.tj;
import defpackage.vj;
import defpackage.yj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

/* loaded from: classes.dex */
public class k0 extends n1 {
    private static int W;
    private r0 A;
    private yj B;
    private NestedScrollView C;
    private RelativeLayout D;
    private s E;
    private boolean F;
    private yj G;
    private yj H;
    private o1 I;
    private j0 J;
    public v0 K;
    public v0 L;
    private int M;
    private int N;
    private int O;
    private TabLayout P;
    private ViewPager Q;
    private ArrayList<View> R;
    private ArrayList<c1> S;
    private com.viewpagerindicator.c T;
    private int U;
    public View.OnClickListener V;
    private View x;
    private ShimmerFrameLayout y;
    private AbsoluteLayout z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements ViewPager.j {
        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i) {
            if (k0.this.B.U != null) {
                k0.this.B.U[0] = i;
            }
            if (k0.this.I.w()) {
                k0 k0Var = k0.this;
                x1.a(k0Var.c, (yj) null, k0Var.I.r().getApplicationWindowToken());
            }
            k0.this.a(i, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements ViewPager.j {
        b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i) {
            if (k0.this.B.U != null) {
                k0.this.B.U[0] = i;
            }
            if (k0.this.I.w()) {
                k0 k0Var = k0.this;
                x1.a(k0Var.c, (yj) null, k0Var.I.r().getApplicationWindowToken());
            }
            k0.this.a(i, false);
        }
    }

    /* loaded from: classes.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!TextUtils.isEmpty(k0.this.B.u1)) {
                k0 k0Var = k0.this;
                k0Var.a(k0Var.B.u1);
            }
            k0 k0Var2 = k0.this;
            k0Var2.g.b(k0Var2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends a0 {
        d(Context context, boolean z) {
            super(context, z);
        }

        @Override // com.comviva.webaxn.ui.a0
        public void a(boolean z) {
            super.a(z);
            if (z) {
                k0 k0Var = k0.this;
                k0Var.g.b(k0Var.B.a0);
            }
        }

        @Override // com.comviva.webaxn.ui.a0
        public void b(boolean z) {
            super.b(z);
        }

        @Override // com.comviva.webaxn.ui.a0
        public void c(boolean z) {
            super.c(z);
        }

        @Override // com.comviva.webaxn.ui.a0
        public void d(boolean z) {
            super.d(z);
        }

        @Override // com.comviva.webaxn.ui.a0
        public void e(boolean z) {
            super.e(z);
            if (k0.this.B.P0 == null || k0.this.B.P0.get("leftswipe") == null) {
                return;
            }
            k0 k0Var = k0.this;
            k0Var.g.a(k0Var.B, k0.this.B.P0.get("leftswipe"));
        }

        @Override // com.comviva.webaxn.ui.a0
        public void f(boolean z) {
            super.f(z);
            if (k0.this.B.P0 == null || k0.this.B.P0.get("rightswipe") == null) {
                return;
            }
            k0 k0Var = k0.this;
            k0Var.g.a(k0Var.B, k0.this.B.P0.get("rightswipe"));
        }

        @Override // com.comviva.webaxn.ui.a0
        public void g(boolean z) {
            super.g(z);
        }
    }

    public k0(Context context, yj yjVar, o1 o1Var, j0 j0Var, v0 v0Var, ViewGroup viewGroup) {
        super(context);
        int i;
        NestedScrollView nestedScrollView;
        View view;
        this.F = false;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = null;
        this.U = 0;
        this.V = new c();
        this.B = yjVar;
        this.I = o1Var;
        W = 70;
        this.z = new AbsoluteLayout(this.c);
        float f = this.B.a;
        if (f > 0.0f) {
            W = (int) (f * 70.0f);
        }
        this.h = n1.d(com.comviva.webaxn.utils.j1.a(this.c).f0());
        j0 j0Var2 = new j0(context);
        this.J = j0Var2;
        j0Var2.l = j0Var;
        if (j0Var != null) {
            j0Var.o.add(j0Var2);
            v0Var.m = this.J;
        }
        b(this.J, v0Var);
        ej ejVar = this.B.O0;
        if (ejVar != null) {
            ejVar.a(this.J.f);
        }
        p0 p0Var = new p0(0, 0, 0, 0, 1.0f);
        AbsoluteLayout absoluteLayout = this.z;
        this.x = absoluteLayout;
        yj yjVar2 = this.B;
        int i2 = yjVar2.e;
        if (i2 == 33) {
            this.D = new RelativeLayout(this.c);
            new r(this.c, this.B, v0Var, this.D, p0Var, this.I.b);
            this.D.addView(this.z);
            this.x = this.D;
        } else if (i2 == 36) {
            this.E = new s(this.c, yjVar2, v0Var, absoluteLayout, p0Var, this.I.b);
        } else if (i2 == 39) {
            s();
        }
        if (this.J.g > 0 && (i = this.B.e) != 39 && i != 40) {
            NestedScrollView nestedScrollView2 = new NestedScrollView(this.c);
            this.C = nestedScrollView2;
            nestedScrollView2.setVerticalScrollBarEnabled(false);
            this.C.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            if (this.B.e == 33) {
                nestedScrollView = this.C;
                view = this.D;
            } else {
                nestedScrollView = this.C;
                view = this.z;
            }
            nestedScrollView.addView(view);
            this.x = this.C;
        }
        HashMap<String, hj> hashMap = this.B.P0;
        if (hashMap != null && hashMap.get("pulltorefresh") != null) {
            r0 r0Var = new r0(this.c);
            this.A = r0Var;
            r0Var.setRenderingEventCb(this.g);
            this.A.setPullToRefreshAction(this.B.P0.get("pulltorefresh").b());
            this.A.setAPM(this.B.P0.get("pulltorefresh").a());
            NestedScrollView nestedScrollView3 = this.C;
            if (nestedScrollView3 != null) {
                this.A.setScrollView(nestedScrollView3);
            } else {
                this.A.setIsPullAllowed(true);
            }
            this.A.addView(this.x);
            this.A.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.x = this.A;
        }
        yj yjVar3 = this.B;
        if (yjVar3.G0 != null && yjVar3.e == 25) {
            ShimmerFrameLayout shimmerFrameLayout = new ShimmerFrameLayout(this.c);
            this.y = shimmerFrameLayout;
            shimmerFrameLayout.addView(this.x);
            this.x = this.y;
        }
        yj yjVar4 = this.B;
        if (yjVar4.K0 == 8 && yjVar4.L0 != null) {
            this.D = new RelativeLayout(this.c);
            new TapsellSDKAdv().a(this.c, this.D, this.B.L0);
            this.x = this.D;
        }
        yj yjVar5 = this.B;
        if (yjVar5.K0 == 9 && yjVar5.L0 != null) {
            this.D = new RelativeLayout(this.c);
            TapsellSDKAdv tapsellSDKAdv = new TapsellSDKAdv();
            tapsellSDKAdv.a(this.c, this.B.L0.a(), this.B.L0.b());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            this.D.addView(tapsellSDKAdv.a(), layoutParams);
            this.x = this.D;
        }
        if (viewGroup != null) {
            viewGroup.addView(this.x);
        }
        if (!TextUtils.isEmpty(this.B.r1)) {
            this.x.setContentDescription(this.B.r1);
        }
        vj vjVar = this.B.q1;
        if (vjVar != null) {
            q2.a(this.x, vjVar.a());
        }
        this.O = q();
        this.K = new v0();
        v0 v0Var2 = new v0();
        this.L = v0Var2;
        v0Var2.c = new Rect();
        yj yjVar6 = this.B;
        if (yjVar6.e == 36) {
            int c2 = yjVar6.N0.c(this.J.e, yjVar6.a);
            yj yjVar7 = this.B;
            int a2 = yjVar7.N0.a(this.J.e, yjVar7.a);
            yj yjVar8 = this.B;
            if (a2 < yjVar8.N0.b(this.J.e, yjVar8.a)) {
                yj yjVar9 = this.B;
                a2 = yjVar9.N0.b(this.J.e, yjVar9.a);
            }
            int i3 = (this.J.e / 2) - (c2 < a2 ? a2 : c2);
            double sqrt = Math.sqrt(2.0d);
            Double.isNaN(i3);
            String str = String.valueOf((int) ((this.J.e - ((int) (sqrt * r0))) / (this.B.a * 2.0f))) + "px";
            yj yjVar10 = this.B;
            yjVar10.F = str;
            yjVar10.G = str;
            yjVar10.H = str;
            yjVar10.I = str;
        }
        v0 v0Var3 = this.K;
        int e = this.B.e(this.J.e) + p0Var.a;
        int j = this.B.j(this.J.e) + p0Var.b;
        int i4 = this.J.e;
        int h = i4 - (this.B.h(i4) + p0Var.c);
        j0 j0Var3 = this.J;
        v0Var3.c = new Rect(e, j, h, j0Var3.f - (this.B.b(j0Var3.e) + p0Var.d));
        v0 v0Var4 = this.K;
        Rect rect = v0Var4.c;
        v0Var4.a = rect.left;
        v0Var4.b = rect.top;
        if (this.B.i0 == 4) {
            v0Var4.k = true;
        }
    }

    private int a(int i, int i2, int i3, int i4, int i5, int i6, j0 j0Var) {
        int i7;
        int i8;
        int i9;
        int i10;
        yj yjVar = j0Var.p;
        if (yjVar.g.equalsIgnoreCase("C") || yjVar.g.equalsIgnoreCase("Center")) {
            if (i5 > i) {
                i7 = j0Var.c;
                i8 = (i5 - i) / 2;
                j0Var.c = i7 + i8;
            }
            i5 = 0;
        } else {
            if ((yjVar.g.equalsIgnoreCase("R") || yjVar.g.equalsIgnoreCase("Right")) && i < i5) {
                i7 = j0Var.c;
                i8 = i5 - i;
                j0Var.c = i7 + i8;
            }
            i5 = 0;
        }
        if (i2 != 0) {
            int i11 = j0Var.j;
            if (yjVar.h.equalsIgnoreCase("B") || yjVar.h.equalsIgnoreCase("Bottom")) {
                if (i11 < i2) {
                    j0Var.d += i2 - i11;
                }
                int i12 = j0Var.d + i4;
                j0Var.d = i12;
                if (i6 > 0 && (i9 = j0Var.k) >= 0) {
                    i10 = i12 + (i9 - i6);
                    j0Var.d = i10;
                }
            } else if (yjVar.h.equalsIgnoreCase("M") || yjVar.h.equalsIgnoreCase("Middle")) {
                if (i11 < i2) {
                    j0Var.d += (i2 - i11) / 2;
                }
                i10 = j0Var.d + (i4 / 2);
                j0Var.d = i10;
            }
        }
        n1 n1Var = j0Var.n;
        if (n1Var != null) {
            n1Var.a(new AbsoluteLayout.LayoutParams(j0Var.e, j0Var.f, j0Var.c, j0Var.d));
        }
        return i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.comviva.webaxn.ui.v0 a(com.comviva.webaxn.ui.v0 r11, com.comviva.webaxn.ui.j0 r12, defpackage.yj r13, defpackage.yj r14) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.k0.a(com.comviva.webaxn.ui.v0, com.comviva.webaxn.ui.j0, yj, yj):com.comviva.webaxn.ui.v0");
    }

    private ArrayList<Integer> a(j0 j0Var, int i) {
        Integer valueOf;
        int i2;
        int i3 = j0Var.o.get(i).b;
        int i4 = j0Var.o.get(i).f;
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i < j0Var.o.size()) {
            j0 j0Var2 = j0Var.o.get(i);
            if (!a(i3, i4, j0Var2.b, j0Var2.f)) {
                break;
            }
            i4 = j0Var2.f;
            i3 = j0Var2.b;
            if (i5 < i4) {
                i5 = i4;
            }
            int i9 = j0Var2.k;
            if (i8 < i9) {
                i8 = i9;
            }
            if (!c(j0Var.p) && i6 < (i2 = j0Var2.h)) {
                i6 = i2;
            }
            int g = j0Var2.c + j0Var2.e + j0Var2.p.g(j0Var2.q.c.width());
            if (i7 < g) {
                i7 = g;
            }
            i++;
        }
        arrayList.add(Integer.valueOf(i7));
        arrayList.add(Integer.valueOf(i5));
        if (c(j0Var.p)) {
            int i10 = j0Var.e;
            valueOf = Integer.valueOf(i10 - (this.B.e(i10) + this.B.h(j0Var.e)));
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(int r3, android.widget.ImageView r4, boolean r5, boolean r6) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.k0.a(int, android.widget.ImageView, boolean, boolean):void");
    }

    private void a(int i, TextView textView, int i2, boolean z) {
        Typeface h;
        com.comviva.webaxn.utils.u uVar;
        if (z && i2 == -1) {
            i2 = this.B.h1;
        }
        textView.setTextColor(i2);
        if (z) {
            h = this.S.get(i).c().h();
            uVar = this.S.get(i).c();
        } else {
            h = this.B.p.h();
            uVar = this.B.p;
        }
        textView.setTypeface(h, uVar.g());
        if (z && this.S.get(i).a() != null && this.S.get(i).a().h()) {
            this.S.get(i).a((View) textView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, boolean z) {
        if (z) {
            if (this.S.get(i).d() != null) {
                a(i, this.S.get(i).d(), this.B.i1, z);
            }
            if (this.S.get(i).b() != null) {
                a(i, this.S.get(i).b(), z, true);
                return;
            }
            return;
        }
        for (int i2 = 0; i2 < this.P.getTabCount(); i2++) {
            TextView d2 = this.S.get(i2).d();
            if (i2 == i) {
                if (d2 != null) {
                    a(i2, this.S.get(i2).d(), this.B.i1, true);
                }
                if (this.S.get(i2).b() != null) {
                    a(i2, this.S.get(i2).b(), true, true);
                }
            } else {
                if (d2 != null) {
                    a(i2, this.S.get(i2).d(), this.B.p.c(), false);
                }
                if (this.S.get(i).b() != null) {
                    a(i2, this.S.get(i2).b(), false, true);
                }
            }
        }
    }

    private void a(j0 j0Var) {
        int i;
        n1 n1Var;
        float f = (j0Var.i - j0Var.g) / this.K.j;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        for (int i4 = 0; i4 < j0Var.o.size(); i4++) {
            j0 j0Var2 = j0Var.o.get(i4);
            int i5 = j0Var2.f;
            if (i5 > 0) {
                if (a(i2, i3, j0Var2.b, i5)) {
                    z = false;
                } else {
                    i2 = j0Var2.d;
                    i3 = j0Var2.f;
                }
            }
            if (!z) {
                break;
            }
        }
        if (z) {
            int i6 = 0;
            for (int i7 = 0; i7 < j0Var.o.size(); i7++) {
                j0 j0Var3 = j0Var.o.get(i7);
                if (i6 > 0 && (n1Var = j0Var3.n) != null && j0Var3.p.f) {
                    j0Var3.d -= i6;
                    n1Var.a(new AbsoluteLayout.LayoutParams(j0Var3.e, j0Var3.f, j0Var3.c, j0Var3.d));
                }
                int i8 = j0Var3.g;
                if (i8 > 0 && j0Var3.p.f && (i = i8 - (i6 = i6 + (((int) (i8 * f)) + 1))) > 0) {
                    j0Var3.g = i;
                    j0Var3.f = i;
                    n1 n1Var2 = j0Var3.n;
                    if (n1Var2 != null) {
                        n1Var2.k();
                        j0Var3.n.a(new AbsoluteLayout.LayoutParams(j0Var3.e, j0Var3.f, j0Var3.c, j0Var3.d));
                    }
                }
            }
            j0Var.i -= i6;
        }
    }

    private void a(String str, yj yjVar, int i, int i2, j0 j0Var, int i3) {
        String str2;
        i0 i0Var = new i0(this.c, yjVar, str, j0Var);
        if (i3 > 0) {
            i0Var.h(i3);
        }
        i0Var.a(this.z);
        yjVar.a0 = i0Var;
        i0Var.b(yjVar);
        i0Var.c(yjVar.p.f());
        i0Var.g(yjVar.p.g());
        boolean z = true;
        if (true != yjVar.b || (yjVar.i == null && yjVar.k == null && ((str2 = yjVar.m) == null || (!str2.equalsIgnoreCase("close") && !yjVar.m.equalsIgnoreCase("exit"))))) {
            z = false;
        }
        i0Var.a(z);
        if (yjVar.t0 != null || yjVar.N != null || yjVar.p0 != null) {
            i0Var.b(yjVar.t0);
        }
        p0 p0Var = new p0(yjVar.e(i), yjVar.j(i), yjVar.h(i), yjVar.b(i), com.comviva.webaxn.utils.b.a(this.c).a().a());
        i0Var.c(yjVar);
        i0Var.c(new AbsoluteLayout.LayoutParams(j0Var.e, j0Var.f, j0Var.c, j0Var.d));
        i0Var.a(this.g);
        i0Var.q();
        i0Var.a(p0Var);
        if (yjVar.v0 != null || yjVar.O != null || yjVar.r0 != null) {
            i0Var.a(yjVar.v0);
        }
        j0Var.e = i0Var.j();
        j0Var.f = i0Var.i();
        j0Var.n = i0Var;
        i0Var.p();
    }

    private void a(yj yjVar, AbsoluteLayout absoluteLayout) {
        v0 v0Var = this.K;
        a(v0Var, (j0) null, yjVar, (yj) null);
        this.K = v0Var;
    }

    private void a(yj yjVar, AbsoluteLayout absoluteLayout, j0 j0Var) {
        com.comviva.webaxn.ui.a aVar = new com.comviva.webaxn.ui.a(this.c, yjVar, j0Var);
        aVar.b(yjVar);
        aVar.a(this.z);
        yjVar.a0 = aVar;
        aVar.g(yjVar.p.g());
        aVar.a(new AbsoluteLayout.LayoutParams(j0Var.e, j0Var.f, j0Var.c, j0Var.d), this.K);
        aVar.a(this.g);
        aVar.o();
        aVar.a(yjVar.v0);
        j0Var.e = aVar.j();
        j0Var.f = aVar.i();
        j0Var.n = aVar;
        this.g.a(aVar);
    }

    private void a(yj yjVar, j0 j0Var) {
        int i = yjVar.e;
        if (i == 13 || i == 26) {
            j(yjVar, this.z, j0Var);
            return;
        }
        if (i == 10 || i == 11) {
            d(yjVar, this.z, j0Var);
            return;
        }
        if (i == 22 || i == 2 || i == 27) {
            b(yjVar, j0Var);
            return;
        }
        if (i == 1) {
            c(yjVar, this.z, j0Var);
            return;
        }
        if (i == 3) {
            h(yjVar, this.z, j0Var);
            return;
        }
        if (i == 4) {
            e(yjVar, this.z, j0Var);
            return;
        }
        if (i == 6) {
            f(yjVar, this.z, j0Var);
            return;
        }
        if (i == 23) {
            a(yjVar, this.z);
            return;
        }
        if (i == 24) {
            a(yjVar, this.z);
            i(yjVar, this.z, j0Var);
            return;
        }
        if (i == 9) {
            g(yjVar, this.z, j0Var);
            return;
        }
        if (i == 30) {
            n(yjVar, this.z, j0Var);
            return;
        }
        if (i == 34) {
            l(yjVar, this.z, j0Var);
            return;
        }
        if (i == 35) {
            k(yjVar, this.z, j0Var);
            return;
        }
        if (i == 37) {
            a(yjVar, this.z, j0Var);
        } else if (i == 38) {
            b(yjVar, this.z, j0Var);
        } else if (i == 41) {
            m(yjVar, this.z, j0Var);
        }
    }

    private boolean a(int i, int i2, int i3, int i4) {
        return i == i3 || (i > i3 && i < i4 + i3) || (i3 > i && i3 < i + i2);
    }

    private void b(j0 j0Var) {
        int i = j0Var.e;
        int i2 = j0Var.f;
        int i3 = j0Var.i;
        int i4 = i2 > i3 ? i2 - i3 : 0;
        int i5 = -1;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < j0Var.o.size(); i12++) {
            j0 j0Var2 = j0Var.o.get(i12);
            int i13 = j0Var2.f;
            if (i13 != 0) {
                if (!a(i5, i6, j0Var2.b, i13)) {
                    this.K.h = 0;
                    int i14 = j0Var2.b;
                    int i15 = j0Var2.f;
                    ArrayList<Integer> a2 = a(j0Var, i12);
                    i7 = a2.get(0).intValue();
                    i8 = a2.get(1).intValue();
                    i9 = a2.get(2).intValue();
                    int intValue = a2.get(3).intValue();
                    i10 = a2.get(4).intValue();
                    i5 = j0Var.o.elementAt(intValue).b;
                    i6 = j0Var.o.elementAt(intValue).f;
                }
                int i16 = i5;
                int i17 = i6;
                int i18 = i7;
                int i19 = i8;
                int i20 = i9;
                int i21 = i10;
                int a3 = a(i18, i19, i, i4, i20, i21, j0Var2);
                if (i11 < a3) {
                    i11 = a3;
                }
                i5 = i16;
                i6 = i17;
                i7 = i18;
                i8 = i19;
                i9 = i20;
                i10 = i21;
            }
        }
        if (i11 <= 0 || j0Var.e >= i11) {
            return;
        }
        j0Var.e = i11;
    }

    private void b(j0 j0Var, v0 v0Var) {
        j0Var.q = v0Var;
        yj yjVar = this.B;
        j0Var.p = yjVar;
        yjVar.b0.add(j0Var);
        j0Var.e = v0Var.n ? v0Var.c.width() : v0Var.c.width() - (this.B.d(v0Var.c.width()) + this.B.g(v0Var.c.width()));
        int k = this.B.k(v0Var.c.width());
        int c2 = this.B.c(v0Var.c.height());
        int f = this.B.f(v0Var.c.height());
        if (c2 == -3 && k > 0) {
            c2 = k;
        }
        if (f == -3 && k > 0) {
            f = k;
        }
        if (k == -3 && c2 > 0) {
            k = c2;
        }
        if (k <= 0) {
            k = v0Var.n ? v0Var.c.width() : v0Var.c.width() - (this.B.d(v0Var.c.width()) + this.B.g(v0Var.c.width()));
        }
        j0Var.e = k;
        if (c2 > 0) {
            j0Var.f = c2;
        } else {
            j0Var.f = v0Var.n ? v0Var.c.height() : v0Var.c.height() - (this.B.i(v0Var.c.width()) + this.B.a(v0Var.c.width()));
            if (this.B.e == 39) {
                j0Var.f -= v0Var.b;
            }
        }
        if (f > 0) {
            j0Var.g = f;
            j0Var.f = f;
        }
        Rect rect = v0Var.c;
        j0Var.h = rect.right;
        int i = v0Var.a;
        j0Var.a = i;
        j0Var.b = v0Var.b;
        if (!v0Var.n) {
            i += this.B.d(rect.width());
        }
        j0Var.c = i;
        if (v0Var.n) {
            j0Var.d = v0Var.b;
        } else {
            j0Var.d = v0Var.b + this.B.i(v0Var.c.width());
        }
        j0Var.n = this;
    }

    private void b(yj yjVar) {
        int i;
        try {
            if (yjVar.z0 != null) {
                int i2 = 0;
                while (i2 < yjVar.z0.size()) {
                    yj elementAt = yjVar.z0.elementAt(i2);
                    int i3 = i2 + 1;
                    if (i3 < yjVar.z0.size()) {
                        this.G = yjVar.z0.elementAt(i3);
                    } else {
                        this.G = null;
                    }
                    if (i2 <= 0 || i2 - 1 < 0) {
                        this.H = null;
                    } else {
                        this.H = yjVar.z0.elementAt(i);
                    }
                    if (elementAt.e == 39) {
                        a(this.K, this.J, elementAt, this.H);
                    }
                    if ((elementAt.z0 == null || elementAt.z0.size() <= 0) && elementAt.e != 33 && elementAt.e != 36) {
                        f(elementAt);
                        i2 = i3;
                    }
                    g(elementAt);
                    i2 = i3;
                }
            }
            r();
            h(this.J);
            k();
        } catch (OutOfMemoryError unused) {
        }
    }

    private void b(yj yjVar, AbsoluteLayout absoluteLayout, j0 j0Var) {
        dj djVar;
        q0 q0Var = new q0(this.c, yjVar, j0Var);
        q0Var.a(this.g);
        q0Var.a(this.z);
        yjVar.a0 = q0Var;
        q0Var.b(yjVar);
        j0Var.n = q0Var;
        q0Var.a(new p0(yjVar.e(j0Var.e), yjVar.j(j0Var.e), yjVar.h(j0Var.e), yjVar.b(j0Var.e), com.comviva.webaxn.utils.b.a(this.c).a().a()));
        q0Var.c(j0Var.e <= 0 ? new AbsoluteLayout.LayoutParams(this.J.e - (((this.B.e(j0Var.e) + this.B.h(j0Var.e)) + yjVar.d(j0Var.e)) + yjVar.g(j0Var.e)), j0Var.f, j0Var.c, j0Var.d) : new AbsoluteLayout.LayoutParams(j0Var.e, j0Var.f, j0Var.c, j0Var.d));
        q0Var.m();
        if (yjVar.Z0 > 1 && (djVar = yjVar.J0) != null) {
            q0Var.a(djVar.a());
        }
        q0Var.a(yjVar.v0);
        j0Var.e = q0Var.j();
        j0Var.f = q0Var.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x02ad A[Catch: Exception -> 0x0579, OutOfMemoryError -> 0x057d, TryCatch #0 {Exception -> 0x0579, blocks: (B:3:0x0006, B:5:0x000d, B:7:0x0013, B:9:0x0017, B:18:0x0041, B:19:0x0056, B:20:0x0074, B:21:0x0078, B:23:0x007c, B:24:0x007e, B:26:0x0083, B:29:0x0093, B:31:0x00c7, B:32:0x00d0, B:33:0x0110, B:36:0x0115, B:39:0x011f, B:41:0x012c, B:44:0x0395, B:46:0x039b, B:48:0x03bc, B:50:0x03c2, B:51:0x03c6, B:53:0x03ca, B:55:0x03ce, B:57:0x03d1, B:59:0x03d8, B:60:0x03f2, B:62:0x040d, B:65:0x0411, B:66:0x04ce, B:68:0x04d4, B:70:0x04f3, B:72:0x053a, B:73:0x0548, B:75:0x0553, B:77:0x0562, B:79:0x0568, B:80:0x056d, B:83:0x041a, B:85:0x041f, B:87:0x046e, B:88:0x047c, B:90:0x04bd, B:97:0x0144, B:99:0x0171, B:100:0x017f, B:102:0x01b7, B:103:0x01c8, B:105:0x01ce, B:107:0x01da, B:109:0x01e7, B:110:0x01f2, B:113:0x01ff, B:115:0x0206, B:116:0x0210, B:118:0x021a, B:120:0x0220, B:122:0x0241, B:124:0x0247, B:125:0x024b, B:127:0x024f, B:129:0x0253, B:131:0x0256, B:133:0x025f, B:134:0x0281, B:136:0x02ad, B:150:0x02b3, B:138:0x02bb, B:140:0x02c3, B:142:0x0312, B:143:0x0320, B:146:0x036a, B:158:0x01ec, B:168:0x005f), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02c3 A[Catch: Exception -> 0x0579, OutOfMemoryError -> 0x057d, TryCatch #0 {Exception -> 0x0579, blocks: (B:3:0x0006, B:5:0x000d, B:7:0x0013, B:9:0x0017, B:18:0x0041, B:19:0x0056, B:20:0x0074, B:21:0x0078, B:23:0x007c, B:24:0x007e, B:26:0x0083, B:29:0x0093, B:31:0x00c7, B:32:0x00d0, B:33:0x0110, B:36:0x0115, B:39:0x011f, B:41:0x012c, B:44:0x0395, B:46:0x039b, B:48:0x03bc, B:50:0x03c2, B:51:0x03c6, B:53:0x03ca, B:55:0x03ce, B:57:0x03d1, B:59:0x03d8, B:60:0x03f2, B:62:0x040d, B:65:0x0411, B:66:0x04ce, B:68:0x04d4, B:70:0x04f3, B:72:0x053a, B:73:0x0548, B:75:0x0553, B:77:0x0562, B:79:0x0568, B:80:0x056d, B:83:0x041a, B:85:0x041f, B:87:0x046e, B:88:0x047c, B:90:0x04bd, B:97:0x0144, B:99:0x0171, B:100:0x017f, B:102:0x01b7, B:103:0x01c8, B:105:0x01ce, B:107:0x01da, B:109:0x01e7, B:110:0x01f2, B:113:0x01ff, B:115:0x0206, B:116:0x0210, B:118:0x021a, B:120:0x0220, B:122:0x0241, B:124:0x0247, B:125:0x024b, B:127:0x024f, B:129:0x0253, B:131:0x0256, B:133:0x025f, B:134:0x0281, B:136:0x02ad, B:150:0x02b3, B:138:0x02bb, B:140:0x02c3, B:142:0x0312, B:143:0x0320, B:146:0x036a, B:158:0x01ec, B:168:0x005f), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(defpackage.yj r27, com.comviva.webaxn.ui.j0 r28) {
        /*
            Method dump skipped, instructions count: 1406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.k0.b(yj, com.comviva.webaxn.ui.j0):void");
    }

    private boolean b(String str) {
        return str != null && str.equalsIgnoreCase("\n");
    }

    private int c(j0 j0Var) {
        int size = j0Var.o.size();
        if (size > 0) {
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                int c2 = c(j0Var.o.elementAt(i2));
                if (-1 != c2) {
                    if (i < c2) {
                        i = c2;
                    }
                }
            }
            return i;
        }
        n1 n1Var = j0Var.n;
        if (!(n1Var instanceof f0)) {
            return 0;
        }
        if (j0Var.p.t0 != null) {
            f0 f0Var = (f0) n1Var;
            if (f0Var.j() > 0) {
                return f0Var.j();
            }
            return 0;
        }
        return -1;
    }

    private void c(AbsoluteLayout.LayoutParams layoutParams) {
        if (this.B.e != 40 && (this.b instanceof AbsoluteLayout)) {
            h().setLayoutParams(new AbsoluteLayout.LayoutParams(layoutParams.width, layoutParams.height, layoutParams.x, layoutParams.y));
        }
    }

    private void c(j0 j0Var, v0 v0Var) {
        j0Var.q = v0Var;
        int k = this.B.k(v0Var.c.width());
        int c2 = this.B.c(v0Var.c.height());
        int f = this.B.f(v0Var.c.height());
        if (c2 == -3 && k > 0) {
            c2 = k;
        }
        if (f == -3 && k > 0) {
            f = k;
        }
        if (k == -3 && c2 > 0) {
            k = c2;
        }
        if (j0Var.m) {
            k = j0Var.e;
        }
        if (k <= 0) {
            k = v0Var.n ? v0Var.c.width() : v0Var.c.width() - (this.B.d(v0Var.c.width()) + this.B.g(v0Var.c.width()));
        }
        j0Var.e = k;
        if (c2 > 0) {
            j0Var.f = c2;
        } else {
            j0Var.f = v0Var.n ? v0Var.c.height() : v0Var.c.height() - (this.B.i(v0Var.c.width()) + this.B.a(v0Var.c.width()));
            if (this.B.e == 39) {
                j0Var.f -= v0Var.b;
            }
        }
        if (f > 0) {
            j0Var.g = f;
            j0Var.f = f;
        }
        Rect rect = v0Var.c;
        j0Var.h = rect.right;
        int i = v0Var.a;
        j0Var.a = i;
        j0Var.b = v0Var.b;
        if (!v0Var.n) {
            i += this.B.d(rect.width());
        }
        j0Var.c = i;
        if (v0Var.n) {
            j0Var.d = v0Var.b;
        } else {
            j0Var.d = v0Var.b + this.B.i(v0Var.c.width());
        }
    }

    private void c(yj yjVar, AbsoluteLayout absoluteLayout, j0 j0Var) {
        com.comviva.webaxn.ui.d dVar = new com.comviva.webaxn.ui.d(this.c, yjVar.n, yjVar, j0Var);
        dVar.a(this.z);
        yjVar.a0 = dVar;
        dVar.c(yjVar);
        dVar.b(yjVar.p.f());
        dVar.g(yjVar.p.g());
        dVar.a(yjVar.p.d());
        Vector<tj> vector = yjVar.L;
        dVar.a(new p0(yjVar.e(j0Var.e), yjVar.j(j0Var.e), yjVar.h(j0Var.e), yjVar.b(j0Var.e), com.comviva.webaxn.utils.b.a(this.c).a().a()));
        dVar.a(j0Var.e <= 0 ? new AbsoluteLayout.LayoutParams(-2, j0Var.f, j0Var.c, j0Var.d) : new AbsoluteLayout.LayoutParams(j0Var.e, j0Var.f, j0Var.c, j0Var.d), this.K);
        dVar.a(this.g);
        dVar.n();
        dVar.b(yjVar);
        j0Var.e = dVar.j();
        j0Var.f = dVar.i();
        j0Var.n = dVar;
        dVar.m();
    }

    private void c(yj yjVar, j0 j0Var) {
        int i;
        n1 n1Var;
        AbsoluteLayout.LayoutParams layoutParams;
        n1 n1Var2;
        AbsoluteLayout.LayoutParams layoutParams2;
        int i2 = yjVar.e;
        if (i2 == 13 || i2 == 26) {
            j(yjVar, this.z, j0Var);
            return;
        }
        if (i2 == 10 || i2 == 11) {
            d(yjVar, this.z, j0Var);
            return;
        }
        if (i2 == 9) {
            g(yjVar, this.z, j0Var);
            return;
        }
        if (i2 == 22 || i2 == 2 || i2 == 27) {
            b(yjVar, j0Var);
            return;
        }
        if (i2 == 1) {
            c(yjVar, this.z, j0Var);
            return;
        }
        if (i2 == 3) {
            int i3 = j0Var.e;
            if (i3 <= 0) {
                int i4 = this.J.e;
                i3 = i4 - (this.B.e(i4) + this.B.h(this.J.e));
            }
            int i5 = j0Var.f;
            i = i5 > 0 ? i5 : -2;
            n1Var2 = j0Var.n;
            layoutParams2 = new AbsoluteLayout.LayoutParams(i3, i, j0Var.c, j0Var.d);
        } else if (i2 == 4) {
            int i6 = j0Var.e;
            if (i6 <= 0) {
                int i7 = this.J.e;
                i6 = i7 - (this.B.e(i7) + this.B.h(this.J.e));
            }
            int i8 = j0Var.f;
            i = i8 > 0 ? i8 : -2;
            n1Var2 = j0Var.n;
            layoutParams2 = new AbsoluteLayout.LayoutParams(i6, i, j0Var.c, j0Var.d);
        } else {
            if (i2 != 6) {
                if (i2 == 23) {
                    a(yjVar, this.z);
                    return;
                }
                if (i2 == 24) {
                    a(yjVar, this.z);
                    i(yjVar, this.z, j0Var);
                    return;
                }
                if (i2 == 30) {
                    int i9 = j0Var.e;
                    if (i9 <= 0) {
                        int i10 = this.J.e;
                        i9 = i10 - (this.B.e(i10) + this.B.h(this.J.e));
                    }
                    int i11 = j0Var.f;
                    i = i11 > 0 ? i11 : -2;
                    n1Var = j0Var.n;
                    layoutParams = new AbsoluteLayout.LayoutParams(i9, i, j0Var.c, j0Var.d);
                } else if (i2 == 34) {
                    int i12 = j0Var.e;
                    if (i12 <= 0) {
                        int i13 = this.J.e;
                        i12 = i13 - (this.B.e(i13) + this.B.h(this.J.e));
                    }
                    int i14 = j0Var.f;
                    i = i14 > 0 ? i14 : -2;
                    n1Var = j0Var.n;
                    layoutParams = new AbsoluteLayout.LayoutParams(i12, i, j0Var.c, j0Var.d);
                } else if (i2 == 35) {
                    int i15 = j0Var.e;
                    if (i15 <= 0) {
                        int i16 = this.J.e;
                        i15 = i16 - (this.B.e(i16) + this.B.h(this.J.e));
                    }
                    int i17 = j0Var.f;
                    i = i17 > 0 ? i17 : -2;
                    n1Var = j0Var.n;
                    layoutParams = new AbsoluteLayout.LayoutParams(i15, i, j0Var.c, j0Var.d);
                } else if (i2 == 37) {
                    int i18 = j0Var.e;
                    if (i18 <= 0) {
                        int i19 = this.J.e;
                        i18 = i19 - (this.B.e(i19) + this.B.h(this.J.e));
                    }
                    int i20 = j0Var.f;
                    i = i20 > 0 ? i20 : -2;
                    n1Var = j0Var.n;
                    layoutParams = new AbsoluteLayout.LayoutParams(i18, i, j0Var.c, j0Var.d);
                } else if (i2 == 38) {
                    int i21 = j0Var.e;
                    if (i21 <= 0) {
                        int i22 = this.J.e;
                        i21 = i22 - (this.B.e(i22) + this.B.h(this.J.e));
                    }
                    int i23 = j0Var.f;
                    i = i23 > 0 ? i23 : -2;
                    n1Var = j0Var.n;
                    layoutParams = new AbsoluteLayout.LayoutParams(i21, i, j0Var.c, j0Var.d);
                } else {
                    if (i2 != 41) {
                        return;
                    }
                    int i24 = j0Var.e;
                    if (i24 <= 0) {
                        int i25 = this.J.e;
                        i24 = i25 - (this.B.e(i25) + this.B.h(this.J.e));
                    }
                    int i26 = j0Var.f;
                    i = i26 > 0 ? i26 : -2;
                    n1Var = j0Var.n;
                    layoutParams = new AbsoluteLayout.LayoutParams(i24, i, j0Var.c, j0Var.d);
                }
                n1Var.b(layoutParams);
                j0Var.e = j0Var.n.j();
                j0Var.f = j0Var.n.i();
                return;
            }
            int i27 = j0Var.e;
            if (i27 <= 0) {
                i27 = -2;
            }
            int i28 = j0Var.f;
            i = i28 > 0 ? i28 : -2;
            n1Var2 = j0Var.n;
            layoutParams2 = new AbsoluteLayout.LayoutParams(i27, i, j0Var.c, j0Var.d);
        }
        n1Var2.b(layoutParams2);
        j0Var.e = j0Var.n.j();
        j0Var.f = j0Var.n.i();
        h(yjVar);
    }

    private boolean c(yj yjVar) {
        String str;
        while (yjVar != null) {
            int i = yjVar.i0;
            if (i == 2 || i == 3 || i == 4 || ((str = yjVar.m0) != null && str.equalsIgnoreCase("equal"))) {
                return true;
            }
            yjVar = yjVar.A0;
        }
        return false;
    }

    private v0 d(j0 j0Var, v0 v0Var) {
        yj yjVar;
        int i;
        if (j0Var != null) {
            yj yjVar2 = j0Var.p;
            if (!yjVar2.f) {
                return v0Var;
            }
            int g = j0Var.c + j0Var.e + yjVar2.g(j0Var.q.c.width());
            Rect rect = this.K.c;
            boolean z = g > rect.right && j0Var.c > rect.left + j0Var.p.d(j0Var.q.c.width());
            if (!z) {
                int i2 = v0Var.g;
                int i3 = j0Var.k;
                if (i2 < i3) {
                    v0Var.g = i3;
                }
                if (this.K.h < j0Var.f + j0Var.p.a(j0Var.q.c.width()) + j0Var.p.i(j0Var.q.c.width())) {
                    this.K.h = j0Var.f + j0Var.p.a(j0Var.q.c.width()) + j0Var.p.i(j0Var.q.c.width());
                }
                if (this.K.d < j0Var.e + j0Var.p.g(j0Var.q.c.width()) + j0Var.p.d(j0Var.q.c.width())) {
                    this.K.d = j0Var.e + j0Var.p.g(j0Var.q.c.width()) + j0Var.p.d(j0Var.q.c.width());
                }
                if (this.K.f < j0Var.f + j0Var.p.a(j0Var.q.c.width()) + j0Var.p.i(j0Var.q.c.width())) {
                    this.K.f = j0Var.f + j0Var.p.a(j0Var.q.c.width()) + j0Var.p.i(j0Var.q.c.width());
                }
            }
            if (this.F) {
                yj yjVar3 = j0Var.p;
                if (yjVar3.j0 != 1 && this.K.e < j0Var.f + yjVar3.a(j0Var.q.c.width()) + j0Var.p.i(j0Var.q.c.width())) {
                    this.K.e = j0Var.f + j0Var.p.a(j0Var.q.c.width()) + j0Var.p.i(j0Var.q.c.width());
                }
            }
            if (g > this.K.c.right || !((yjVar = this.G) == null || (i = yjVar.e) == 23 || i == 24 || (((!yjVar.g.equalsIgnoreCase("L") && !this.G.g.equalsIgnoreCase("Left")) || j0Var.p.g.equalsIgnoreCase("L") || j0Var.p.g.equalsIgnoreCase("Left")) && ((!this.G.g.equalsIgnoreCase("C") && !this.G.g.equalsIgnoreCase("Center")) || (!j0Var.p.g.equalsIgnoreCase("R") && !j0Var.p.g.equalsIgnoreCase("Right")))))) {
                v0 v0Var2 = this.K;
                a(v0Var2, j0Var, j0Var.p, this.H);
                this.K = v0Var2;
            } else {
                this.K.a = g + (j0Var.p.C == null ? n1.v : 0);
            }
            if (z) {
                g(j0Var);
            }
        }
        return v0Var;
    }

    private void d(j0 j0Var) {
        int size = j0Var.o.size();
        p0 p0Var = new p0(0, 0, 0, 0, com.comviva.webaxn.utils.b.a(this.c).a().a());
        int i = 0;
        int i2 = 0;
        while (size > 0) {
            ArrayList<Integer> a2 = a(j0Var, i);
            int intValue = a2.get(i).intValue();
            int intValue2 = (a2.get(3).intValue() - i) + 1;
            int i3 = j0Var.e - intValue;
            if (i3 >= intValue2) {
                j0 j0Var2 = null;
                int i4 = i3 / intValue2;
                int i5 = i4 / 2;
                p0Var.c = i5;
                p0Var.a = i5;
                int i6 = 0;
                int i7 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    if (i6 == intValue2) {
                        if (j0Var2 != null) {
                            i2 = j0Var2.d + j0Var2.f;
                        }
                        i6 = 0;
                        i7 = 0;
                    }
                    i6++;
                    j0Var2 = j0Var.o.elementAt(i8);
                    if (j0Var2.c <= i7) {
                        j0Var2.c = i7;
                    }
                    if (j0Var2.d <= i2) {
                        j0Var2.d = i2;
                    }
                    j0Var2.n.a(p0Var);
                    j0Var2.e += i4;
                    j0Var2.f = this.N;
                    j0Var2.n.a(new AbsoluteLayout.LayoutParams(j0Var2.e, j0Var2.f, j0Var2.c, j0Var2.d));
                    i7 = j0Var2.p.g(j0Var2.q.c.width()) + j0Var2.c + j0Var2.e;
                }
                if (j0Var2 != null) {
                    j0Var.f = j0Var2.d + j0Var2.f;
                }
            }
            size = 0;
            i = 0;
        }
    }

    private void d(yj yjVar) {
        int i;
        int i2;
        j0 j0Var;
        int i3;
        int i4;
        int i5;
        int i6 = yjVar.e;
        int i7 = 8;
        j0 j0Var2 = null;
        if ((i6 != 7 && i6 != 28) || (i = this.B.K0) != 8 || i != 9) {
            if (yjVar.e == 22) {
                String str = yjVar.n;
                if (str == null) {
                    String h = !TextUtils.isEmpty(aj.a(this.c).h(yjVar.V)) ? aj.a(this.c).h(yjVar.V) : yjVar.W0;
                    if (TextUtils.isEmpty(h)) {
                        return;
                    } else {
                        yjVar.n = h;
                    }
                } else if (b(str)) {
                    v0 v0Var = this.K;
                    a(v0Var, (j0) null, yjVar, this.H);
                    this.K = v0Var;
                    return;
                }
            }
            int i8 = 0;
            if (yjVar.e != 23) {
                try {
                    if (yjVar.a0 != null) {
                        if (!yjVar.f) {
                            j0Var = null;
                            int i9 = 0;
                            while (i9 < yjVar.b0.size()) {
                                try {
                                    yjVar.a0.h().setVisibility(i7);
                                    j0 elementAt = yjVar.b0.elementAt(i9);
                                    try {
                                        elementAt.f = 0;
                                        elementAt.e = 0;
                                        elementAt.a = this.K.a;
                                        elementAt.b = this.K.b;
                                        elementAt.c = this.K.a;
                                        elementAt.d = this.K.b + yjVar.i(this.J.e);
                                        elementAt.h = this.K.c.right;
                                        i9++;
                                        j0Var = elementAt;
                                        i7 = 8;
                                    } catch (Exception unused) {
                                        j0Var = elementAt;
                                    }
                                } catch (Exception unused2) {
                                }
                            }
                            return;
                        }
                        yjVar.a0.h().setVisibility(0);
                    }
                } catch (Exception unused3) {
                }
                j0Var = null;
                if (this.F) {
                    yjVar.h = "T";
                }
                if (1 == yjVar.j0) {
                    v0 v0Var2 = this.K;
                    a(v0Var2, j0Var, yjVar, this.H);
                    this.K = v0Var2;
                }
                v0 v0Var3 = this.K;
                j0 j0Var3 = v0Var3.l;
                if (j0Var3 != null && v0Var3.b > j0Var3.d + j0Var3.f) {
                    v0Var3.l = null;
                    this.F = false;
                }
                v0 v0Var4 = this.K;
                j0 elementAt2 = yjVar.b0.elementAt(0);
                v0Var4.m = elementAt2;
                int i10 = yjVar.e;
                if (i10 == 22 || i10 == 2 || i10 == 27) {
                    int indexOf = this.J.o.indexOf(yjVar.b0.elementAt(0));
                    for (int i11 = 0; i11 < yjVar.b0.size(); i11++) {
                        j0 elementAt3 = yjVar.b0.elementAt(i11);
                        this.J.o.remove(elementAt3);
                        n1 n1Var = elementAt3.n;
                        if (n1Var != null) {
                            n1Var.b();
                        }
                    }
                    yjVar.a0 = null;
                    yjVar.b0.clear();
                    j0 j0Var4 = new j0(this.c);
                    yjVar.b0.add(j0Var4);
                    if (-1 >= indexOf || indexOf >= this.J.o.size()) {
                        this.J.o.add(j0Var4);
                    } else {
                        this.J.o.insertElementAt(j0Var4, indexOf);
                    }
                    this.K.m = j0Var4;
                    j0Var2 = j0Var4;
                } else {
                    if (i10 == 13 || i10 == 26 || i10 == 9 || i10 == 1) {
                        elementAt2.n.b();
                    } else if (i10 == 24) {
                        elementAt2.n.b();
                        elementAt2.e = this.J.e;
                    }
                    j0Var2 = elementAt2;
                }
                j0 j0Var5 = this.J;
                j0Var2.l = j0Var5;
                j0Var2.p = yjVar;
                v0 v0Var5 = this.K;
                j0Var2.h = v0Var5.c.right;
                int i12 = v0Var5.a;
                j0Var2.a = i12;
                j0Var2.b = v0Var5.b;
                v0Var5.a = i12 + yjVar.d(j0Var5.e);
                v0 v0Var6 = this.K;
                j0Var2.c = v0Var6.a;
                j0Var2.d = v0Var6.b + yjVar.i(this.J.e);
                v0 v0Var7 = this.K;
                j0Var2.q = v0Var7;
                if (v0Var7.k) {
                    j0Var2.e = this.O;
                    j0Var2.f = this.N;
                } else {
                    String str2 = j0Var2.l.p.m0;
                    if (str2 == null || !str2.equalsIgnoreCase("equal")) {
                        j0Var2.e = yjVar.k(this.K.c.width());
                    } else {
                        j0Var2.e = this.M;
                        j0Var2.m = true;
                    }
                }
                j0Var2.f = yjVar.c(this.K.c.height());
                j0Var2.g = yjVar.f(this.K.c.height());
                if (j0Var2.f == -3 && (i5 = j0Var2.e) > 0) {
                    j0Var2.f = i5;
                }
                if (j0Var2.g == -3 && (i4 = j0Var2.e) > 0) {
                    j0Var2.g = i4;
                }
                if (j0Var2.e == -3 && (i3 = j0Var2.f) > 0) {
                    j0Var2.e = i3;
                }
            }
            c(yjVar, j0Var2);
            if (j0Var2 != null) {
                int i13 = yjVar.e;
                if (i13 == 22 || i13 == 2 || i13 == 27) {
                    int indexOf2 = this.J.o.indexOf(j0Var2);
                    if (indexOf2 != -1) {
                        this.J.o.elementAt(indexOf2).j = this.J.o.elementAt(indexOf2).f;
                        i8 = 1;
                    }
                    while (i8 < yjVar.b0.size()) {
                        yjVar.b0.elementAt(i8).j = yjVar.b0.elementAt(i8).f;
                        Vector<j0> vector = this.J.o;
                        j0 elementAt4 = yjVar.b0.elementAt(i8);
                        if (indexOf2 != -1) {
                            indexOf2++;
                            vector.insertElementAt(elementAt4, indexOf2);
                        } else {
                            vector.add(elementAt4);
                        }
                        i8++;
                    }
                    if (yjVar.b0.size() > 0) {
                        yjVar.b0.firstElement().j += yjVar.b0.firstElement().p.i(this.K.c.width());
                        yjVar.b0.lastElement().j += yjVar.b0.lastElement().p.a(this.K.c.width());
                        j0Var2 = yjVar.b0.lastElement();
                        this.K.m = j0Var2;
                    }
                } else {
                    j0Var2.j = j0Var2.f + j0Var2.p.i(this.K.c.width()) + j0Var2.p.a(this.K.c.width());
                }
            }
            if (yjVar.e != 23) {
                if (j0Var2 != null) {
                    yj yjVar2 = j0Var2.p;
                    if (1 == yjVar2.j0) {
                        this.K.l = j0Var2;
                        yjVar2.h = "T";
                        this.F = true;
                    }
                }
                v0 v0Var8 = this.K;
                d(j0Var2, v0Var8);
                this.K = v0Var8;
            }
        }
        if (j0Var2 == null || (i2 = j0Var2.g) <= 0) {
            return;
        }
        this.K.j += i2;
    }

    private void d(yj yjVar, AbsoluteLayout absoluteLayout, j0 j0Var) {
        g gVar = new g(this.c, yjVar, j0Var);
        gVar.a(this.z);
        yjVar.a0 = gVar;
        gVar.b(yjVar);
        gVar.a(new AbsoluteLayout.LayoutParams(j0Var.e, j0Var.f, j0Var.c, j0Var.d), this.K);
        gVar.a(this.g);
        gVar.m();
        gVar.a(new p0(yjVar.e(j0Var.e), yjVar.j(j0Var.e), yjVar.h(j0Var.e), yjVar.b(j0Var.e), com.comviva.webaxn.utils.b.a(this.c).a().a()));
        j0Var.e = gVar.j();
        j0Var.f = gVar.i();
        j0Var.n = gVar;
    }

    private void e(j0 j0Var) {
        int i = j0Var.e;
        if (j0Var.o.size() > 0) {
            for (int i2 = 0; i2 < j0Var.o.size(); i2++) {
                j0 elementAt = j0Var.o.elementAt(i2);
                elementAt.c = (i - elementAt.c) - elementAt.e;
                n1 n1Var = elementAt.n;
                if (n1Var != null) {
                    n1Var.a(new AbsoluteLayout.LayoutParams(elementAt.e, elementAt.f, elementAt.c, elementAt.d));
                }
            }
        }
    }

    private void e(yj yjVar) {
        int i;
        try {
            if (yjVar.a0 != null) {
                if (!yjVar.f) {
                    yjVar.a0.h().setVisibility(8);
                    j0 elementAt = yjVar.b0.elementAt(0);
                    elementAt.f = 0;
                    elementAt.e = 0;
                    elementAt.a = this.K.a;
                    elementAt.b = this.K.b;
                    elementAt.c = this.K.a;
                    elementAt.d = this.K.b + yjVar.i(this.J.e);
                    elementAt.h = this.K.c.right;
                    return;
                }
                yjVar.a0.h().setVisibility(0);
            }
        } catch (Exception unused) {
        }
        if (this.F) {
            yjVar.h = "T";
        }
        j0 j0Var = null;
        if (1 == yjVar.j0) {
            v0 v0Var = this.K;
            a(v0Var, (j0) null, yjVar, this.H);
            this.K = v0Var;
        }
        if (yjVar.e == 39) {
            a(this.K, this.J, yjVar, this.H);
        }
        if (yjVar.b0.elementAt(0) != null) {
            v0 v0Var2 = this.K;
            j0Var = yjVar.b0.elementAt(0);
            v0Var2.m = j0Var;
            n1 n1Var = j0Var.n;
            if ((n1Var instanceof k0) || (n1Var instanceof l0)) {
                if (this.K.k) {
                    j0Var.e = this.O;
                    j0Var.f = this.N;
                } else {
                    String str = j0Var.l.p.m0;
                    if (str != null && str.equalsIgnoreCase("equal")) {
                        j0Var.e = this.M;
                        j0Var.m = true;
                    }
                }
                if (j0Var.p.e == 40) {
                    u();
                }
                j0Var.n.a(j0Var, this.K);
                j0Var.j = j0Var.f + j0Var.p.i(this.K.c.width()) + j0Var.p.a(this.K.c.width());
            }
        }
        v0 v0Var3 = this.K;
        d(j0Var, v0Var3);
        this.K = v0Var3;
        if (j0Var == null || (i = j0Var.g) <= 0) {
            return;
        }
        v0Var3.j += i;
    }

    private void e(yj yjVar, AbsoluteLayout absoluteLayout, j0 j0Var) {
        int[] iArr;
        int i = yjVar.R;
        if (i == 2) {
            i iVar = new i(this.c, null, yjVar, j0Var, this.K, this.I);
            iVar.a(this.g);
            iVar.a(this.z);
            yjVar.a0 = iVar;
            iVar.b(yjVar);
            j0Var.n = iVar;
            iVar.a(new p0(yjVar.e(j0Var.e), yjVar.j(j0Var.e), yjVar.h(j0Var.e), yjVar.b(j0Var.e), com.comviva.webaxn.utils.b.a(this.c).a().a()));
            iVar.c(j0Var.e <= 0 ? new AbsoluteLayout.LayoutParams(this.J.e - (((this.B.e(j0Var.e) + this.B.h(j0Var.e)) + yjVar.d(j0Var.e)) + yjVar.g(j0Var.e)), j0Var.f, j0Var.c, j0Var.d) : new AbsoluteLayout.LayoutParams(j0Var.e, j0Var.f, j0Var.c, j0Var.d));
            iVar.t();
            j0Var.e = iVar.j();
            j0Var.f = iVar.i();
            iVar.a(yjVar.v0);
            iVar.r();
            return;
        }
        if (i == 4 || i == 3) {
            t0 t0Var = new t0(this.c, null, yjVar, j0Var);
            t0Var.a(this.g);
            t0Var.a(this.z);
            yjVar.a0 = t0Var;
            t0Var.b(yjVar);
            j0Var.n = t0Var;
            t0Var.a(new p0(yjVar.e(j0Var.e), yjVar.j(j0Var.e), yjVar.h(j0Var.e), yjVar.b(j0Var.e), com.comviva.webaxn.utils.b.a(this.c).a().a()));
            t0Var.c(j0Var.e <= 0 ? new AbsoluteLayout.LayoutParams(this.J.e - (((this.B.e(j0Var.e) + this.B.h(j0Var.e)) + yjVar.d(j0Var.e)) + yjVar.g(j0Var.e)), j0Var.f, j0Var.c, j0Var.d) : new AbsoluteLayout.LayoutParams(j0Var.e, j0Var.f, j0Var.c, j0Var.d));
            t0Var.s();
            j0Var.e = t0Var.j();
            j0Var.f = t0Var.i();
            t0Var.a(yjVar.v0);
            t0Var.q();
            return;
        }
        if (i == 1) {
            l lVar = new l(this.c, yjVar, j0Var);
            lVar.a(this.g);
            lVar.a(this.z);
            for (int i2 = 0; i2 < yjVar.P.size(); i2++) {
                lVar.b(yjVar.P.elementAt(i2).a);
            }
            yjVar.a0 = lVar;
            lVar.b(yjVar);
            j0Var.n = lVar;
            lVar.a(new p0(yjVar.e(j0Var.e), yjVar.j(j0Var.e), yjVar.h(j0Var.e), yjVar.b(j0Var.e), com.comviva.webaxn.utils.b.a(this.c).a().a()));
            lVar.c(j0Var.e <= 0 ? new AbsoluteLayout.LayoutParams(this.J.e - (((this.B.e(j0Var.e) + this.B.h(j0Var.e)) + yjVar.d(j0Var.e)) + yjVar.g(j0Var.e)), j0Var.f, j0Var.c, j0Var.d) : new AbsoluteLayout.LayoutParams(j0Var.e, j0Var.f, j0Var.c, j0Var.d));
            lVar.q();
            lVar.a(yjVar.v0);
            String h = aj.a(this.c).h(yjVar.V);
            if (!TextUtils.isEmpty(yjVar.Q)) {
                h = aj.a(this.c).h(yjVar.Q);
            }
            if (TextUtils.isEmpty(h) && (iArr = yjVar.U) != null && iArr.length > 0) {
                lVar.i(iArr[0]);
            } else if (!TextUtils.isEmpty(h)) {
                lVar.c(h);
            } else if (lVar.z.size() > 0) {
                lVar.i(0);
            }
            lVar.p();
            j0Var.e = lVar.j();
            j0Var.f = lVar.i();
            lVar.o();
        }
    }

    private void f(j0 j0Var) {
        int i;
        int size = j0Var.o.size();
        p0 p0Var = new p0(0, 0, 0, 0, com.comviva.webaxn.utils.b.a(this.c).a().a());
        int i2 = 0;
        while (i2 < size) {
            ArrayList<Integer> a2 = a(j0Var, i2);
            int intValue = a2.get(0).intValue();
            int intValue2 = a2.get(3).intValue() + 1;
            int i3 = j0Var.e;
            int h = (i3 - this.B.h(i3)) - intValue;
            if (h > 0) {
                int i4 = intValue2 - i2;
                int i5 = h / i4;
                int i6 = h % i4;
                int i7 = 0;
                while (i2 < intValue2) {
                    j0 j0Var2 = j0Var.o.get(i2);
                    if (j0Var2.c <= i7) {
                        j0Var2.c = i7;
                    }
                    if (i6 > 0) {
                        i = i5 + 1;
                        i6--;
                    } else {
                        i = i5;
                    }
                    int i8 = i % 2 == 0 ? i / 2 : (i / 2) + 1;
                    p0Var.c = i8;
                    int i9 = i / 2;
                    p0Var.a = i9;
                    int i10 = i8 + i9;
                    if (!(j0Var2.n instanceof k0)) {
                        p0Var.a = i9 + j0Var2.p.e(j0Var2.e);
                        p0Var.c += j0Var2.p.h(j0Var2.e);
                    }
                    j0Var2.n.a(p0Var);
                    j0Var2.e += i10;
                    j0Var2.n.a(new AbsoluteLayout.LayoutParams(j0Var2.e, j0Var2.f, j0Var2.c, j0Var2.d));
                    i7 = j0Var2.c + j0Var2.e + j0Var2.p.g(j0Var2.q.c.width());
                    i2++;
                }
            }
            i2 = intValue2;
        }
    }

    private void f(yj yjVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        j0 j0Var = null;
        try {
            if (yjVar.a0 != null) {
                yjVar.a0.b();
                yjVar.a0 = null;
            }
            if (yjVar.b0 != null) {
                yjVar.b0.clear();
            }
        } catch (Exception unused) {
        }
        int i6 = yjVar.e;
        if ((i6 == 7 || i6 == 28) && (i = this.B.K0) == 8 && i == 9) {
            return;
        }
        if (yjVar.e == 22) {
            String str = yjVar.n;
            if (str == null) {
                String h = !TextUtils.isEmpty(aj.a(this.c).h(yjVar.V)) ? aj.a(this.c).h(yjVar.V) : yjVar.W0;
                if (TextUtils.isEmpty(h)) {
                    return;
                }
                yjVar.n = h;
                yjVar.X0 = true;
            } else if (b(str)) {
                v0 v0Var = this.K;
                a(v0Var, (j0) null, yjVar, this.H);
                this.K = v0Var;
                return;
            }
        }
        if (yjVar.e != 23) {
            if (this.F) {
                yjVar.h = "T";
            }
            if (1 == yjVar.j0) {
                v0 v0Var2 = this.K;
                a(v0Var2, (j0) null, yjVar, this.H);
                this.K = v0Var2;
            }
            v0 v0Var3 = this.K;
            j0 j0Var2 = v0Var3.l;
            if (j0Var2 != null && v0Var3.b > j0Var2.d + j0Var2.f) {
                v0Var3.l = null;
                this.F = false;
            }
            j0Var = new j0(this.c);
            j0Var.l = this.J;
            j0Var.p = yjVar;
            yjVar.b0.add(j0Var);
            j0Var.h = this.K.c.right;
            this.J.o.add(j0Var);
            v0 v0Var4 = this.K;
            v0Var4.m = j0Var;
            j0Var.b = v0Var4.b;
            v0Var4.a += yjVar.f ? yjVar.d(this.J.e) : 0;
            v0 v0Var5 = this.K;
            j0Var.c = v0Var5.a;
            j0Var.d = v0Var5.b + yjVar.i(this.J.e);
            v0 v0Var6 = this.K;
            j0Var.q = v0Var6;
            j0Var.e = yjVar.k(v0Var6.c.width());
            if (this.K.k) {
                j0Var.e = this.O;
            }
            j0Var.f = yjVar.c(this.K.c.height());
            j0Var.g = yjVar.f(this.K.c.height());
            if (j0Var.f == -3 && (i5 = j0Var.e) > 0) {
                j0Var.f = i5;
            }
            if (j0Var.g == -3 && (i4 = j0Var.e) > 0) {
                j0Var.g = i4;
            }
            if (j0Var.e == -3 && (i3 = j0Var.f) > 0) {
                j0Var.e = i3;
            }
        }
        a(yjVar, j0Var);
        if (j0Var != null) {
            int i7 = j0Var.f + j0Var.p.i(this.K.c.width());
            j0Var.j = i7;
            int i8 = yjVar.e;
            if (i8 == 22 || i8 == 2 || i8 == 27) {
                for (int i9 = 0; i9 < yjVar.b0.size(); i9++) {
                    yjVar.b0.elementAt(i9).j = yjVar.b0.elementAt(i9).f;
                    if (i9 != 0) {
                        this.J.o.add(yjVar.b0.elementAt(i9));
                    }
                    try {
                        j0 elementAt = yjVar.b0.elementAt(i9);
                        if (yjVar.f) {
                            elementAt.n.h().setVisibility(0);
                        } else {
                            elementAt.n.h().setVisibility(8);
                            elementAt.f = 0;
                            elementAt.e = 0;
                            elementAt.j = 0;
                            elementAt.h = 0;
                            elementAt.i = 0;
                            elementAt.g = 0;
                        }
                    } catch (Exception unused2) {
                    }
                }
                if (yjVar.b0.size() > 0) {
                    yjVar.b0.firstElement().j += yjVar.b0.firstElement().p.i(this.K.c.width());
                    yjVar.b0.lastElement().j += yjVar.b0.lastElement().p.a(this.K.c.width());
                    j0Var = yjVar.b0.lastElement();
                    this.K.m = j0Var;
                }
            } else {
                j0Var.j = i7 + j0Var.p.a(this.K.c.width());
                try {
                    if (yjVar.f) {
                        yjVar.a0.h().setVisibility(0);
                    } else {
                        yjVar.a0.h().setVisibility(8);
                        j0Var.f = 0;
                        j0Var.e = 0;
                        j0Var.j = 0;
                        j0Var.i = 0;
                        j0Var.h = 0;
                        j0Var.g = 0;
                    }
                } catch (Exception unused3) {
                }
            }
        }
        if (yjVar.e != 23) {
            yj yjVar2 = j0Var.p;
            if (1 == yjVar2.j0) {
                this.K.l = j0Var;
                yjVar2.h = "T";
                this.F = true;
            }
            v0 v0Var7 = this.K;
            d(j0Var, v0Var7);
            this.K = v0Var7;
            if (j0Var == null || (i2 = j0Var.g) <= 0) {
                return;
            }
            v0Var7.j += i2;
        }
    }

    private void f(yj yjVar, AbsoluteLayout absoluteLayout, j0 j0Var) {
        q qVar = new q(this.c, null, yjVar, j0Var, this.I);
        qVar.a(this.z);
        yjVar.a0 = qVar;
        qVar.c(yjVar);
        j0Var.n = qVar;
        qVar.a(new p0(yjVar.e(j0Var.e), yjVar.j(j0Var.e), yjVar.h(j0Var.e), yjVar.b(j0Var.e), com.comviva.webaxn.utils.b.a(this.c).a().a()));
        qVar.c(j0Var.e <= 0 ? new AbsoluteLayout.LayoutParams(-2, j0Var.f, j0Var.c, j0Var.d) : new AbsoluteLayout.LayoutParams(j0Var.e, j0Var.f, j0Var.c, j0Var.d));
        qVar.r();
        qVar.a(yjVar.v0);
        qVar.a(this.g);
        j0Var.e = qVar.j();
        j0Var.f = qVar.i();
        qVar.p();
    }

    private void g(j0 j0Var) {
        v0 v0Var = this.K;
        int i = v0Var.a;
        j0Var.a = i;
        j0Var.b = v0Var.b;
        j0Var.c = i + j0Var.p.d(j0Var.q.c.width());
        j0Var.d = this.K.b + j0Var.p.i(j0Var.q.c.width());
        n1 n1Var = j0Var.n;
        if (n1Var != null) {
            boolean z = n1Var instanceof k0;
            n1Var.a(new AbsoluteLayout.LayoutParams(j0Var.e, j0Var.f, j0Var.c, j0Var.d));
        }
        this.K = d(j0Var, this.K);
    }

    private void g(yj yjVar) {
        j0 j0Var;
        int i;
        boolean z = this.K.k;
        if (this.F) {
            yjVar.h = "T";
        }
        if (1 == yjVar.j0) {
            v0 v0Var = this.K;
            a(v0Var, (j0) null, yjVar, this.H);
            this.K = v0Var;
        }
        if (this.K.k) {
            this.J.e = this.O;
        }
        if (yjVar.e == 40) {
            if (this.S != null) {
                c1 c1Var = new c1();
                if (!TextUtils.isEmpty(yjVar.d)) {
                    c1Var.a(yjVar.d);
                }
                c1Var.a(yjVar.J0);
                if (TextUtils.isEmpty(yjVar.p.i())) {
                    yjVar.p.b(this.B.p.i());
                }
                c1Var.a(yjVar.p);
                this.S.add(c1Var);
            }
            AbsoluteLayout absoluteLayout = new AbsoluteLayout(this.c);
            u();
            this.I.a(yjVar, absoluteLayout, this.J, this.K);
            j0Var = yjVar.b0.get(0);
            j0Var.j = j0Var.f + j0Var.p.i(this.K.c.width()) + j0Var.p.a(this.K.c.width());
            absoluteLayout.removeAllViews();
            NestedScrollView nestedScrollView = new NestedScrollView(this.c);
            nestedScrollView.setVerticalScrollBarEnabled(false);
            nestedScrollView.addView(yjVar.a0.h());
            this.R.add(nestedScrollView);
            nestedScrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            a(nestedScrollView, yjVar);
        } else {
            this.I.a(yjVar, this.z, this.J, this.K);
            j0Var = yjVar.b0.get(0);
            j0Var.j = j0Var.f + j0Var.p.i(this.K.c.width()) + j0Var.p.a(this.K.c.width());
        }
        try {
            if (yjVar.f) {
                yjVar.a0.h().setVisibility(0);
            } else {
                yjVar.a0.h().setVisibility(8);
                j0Var.f = 0;
                j0Var.e = 0;
                j0Var.j = 0;
                j0Var.i = 0;
                j0Var.h = 0;
                j0Var.g = 0;
            }
        } catch (Exception unused) {
        }
        v0 v0Var2 = this.K;
        d(j0Var, v0Var2);
        this.K = v0Var2;
        if (j0Var == null || (i = j0Var.g) <= 0) {
            return;
        }
        v0Var2.j += i;
    }

    private void g(yj yjVar, AbsoluteLayout absoluteLayout, j0 j0Var) {
        t tVar = new t(this.c, yjVar, j0Var);
        tVar.a(this.z);
        yjVar.a0 = tVar;
        tVar.a(this.g);
        tVar.a(p1.b);
        tVar.n();
        tVar.a(new p0(yjVar.e(j0Var.e), yjVar.j(j0Var.e), yjVar.h(j0Var.e), yjVar.b(j0Var.e), com.comviva.webaxn.utils.b.a(this.c).a().a()));
        j0Var.e = tVar.j();
        j0Var.f = tVar.i();
        j0Var.n = tVar;
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void h(com.comviva.webaxn.ui.j0 r10) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.k0.h(com.comviva.webaxn.ui.j0):void");
    }

    private void h(yj yjVar) {
        if (yjVar.e == 3) {
            n1 n1Var = yjVar.a0;
            if (n1Var == null) {
                return;
            }
            if (((w) n1Var).p()) {
                if (yjVar.o1) {
                    yjVar.o1 = false;
                }
                this.I.a(yjVar);
                return;
            } else if (!yjVar.o1) {
                return;
            }
        } else if (!yjVar.o1) {
            return;
        }
        this.I.d(yjVar);
    }

    private void h(yj yjVar, AbsoluteLayout absoluteLayout, j0 j0Var) {
        bj bjVar;
        String str;
        w wVar = new w(this.c, j0Var, this.I);
        wVar.a(this.g);
        int a2 = wVar.a(yjVar.R, yjVar.K, yjVar.l);
        com.comviva.webaxn.utils.u uVar = yjVar.p;
        if (uVar != null) {
            if (uVar.k()) {
                wVar.b(yjVar.p.c());
            }
            if (yjVar.p.j()) {
                wVar.a(yjVar.p.b());
            }
            wVar.b(yjVar.p.f());
            wVar.i(yjVar.p.g());
            wVar.a(yjVar.p.d());
        }
        String str2 = yjVar.o;
        if (str2 != null) {
            wVar.e(str2);
        }
        if (yjVar.b()) {
            wVar.h(yjVar.a());
        }
        if (a2 != 3 && a2 != 6) {
            String h = aj.a(this.c).h(yjVar.V);
            if (!TextUtils.isEmpty(yjVar.Q)) {
                h = aj.a(this.c).h(yjVar.Q);
            }
            if (TextUtils.isEmpty(h)) {
                h = aj.a(this.c).g(yjVar.V);
            }
            if (TextUtils.isEmpty(h) && (str = yjVar.n) != null) {
                h = str;
            }
            wVar.d(h);
        }
        if (true == j0Var.r) {
            wVar.n();
        }
        wVar.a(yjVar.r);
        wVar.a((ViewGroup) this.z);
        yjVar.a0 = wVar;
        j0Var.n = wVar;
        wVar.b(yjVar);
        int i = j0Var.f;
        int i2 = i > 0 ? i : -2;
        wVar.a(new p0(yjVar.e(j0Var.e), yjVar.j(j0Var.e), yjVar.h(j0Var.e), yjVar.b(j0Var.e), com.comviva.webaxn.utils.b.a(this.c).a().a()));
        wVar.c(j0Var.e <= 0 ? new AbsoluteLayout.LayoutParams(this.J.e - (((this.B.e(j0Var.e) + this.B.h(j0Var.e)) + yjVar.d(j0Var.e)) + yjVar.g(j0Var.e)), i2, j0Var.c, j0Var.d) : new AbsoluteLayout.LayoutParams(j0Var.e, i2, j0Var.c, j0Var.d));
        if (yjVar.K0 == 1 && (bjVar = yjVar.L0) != null && bjVar.d() != -1) {
            wVar.h(yjVar.L0.d());
        }
        if (yjVar.K0 == 4) {
            wVar.a(false);
            wVar.b(0);
        }
        int i3 = yjVar.S;
        if (i3 > 0) {
            wVar.j(i3);
        }
        wVar.v();
        wVar.a(yjVar.v0);
        j0Var.e = wVar.j();
        j0Var.f = wVar.i();
        wVar.r();
    }

    private void i(yj yjVar, AbsoluteLayout absoluteLayout, j0 j0Var) {
        c0 c0Var = new c0(this.c, yjVar, j0Var);
        c0Var.a(this.z);
        yjVar.a0 = c0Var;
        c0Var.b(yjVar);
        c0Var.c(j0Var.e <= 0 ? new AbsoluteLayout.LayoutParams(this.K.c.width() - (yjVar.d(this.K.c.width()) + yjVar.g(this.K.c.width())), j0Var.f, j0Var.c, j0Var.d) : new AbsoluteLayout.LayoutParams(j0Var.e, j0Var.f, j0Var.c, j0Var.d));
        c0Var.a(this.g);
        c0Var.n();
        c0Var.a(yjVar.v0);
        j0Var.e = c0Var.j();
        j0Var.f = c0Var.i();
        j0Var.n = c0Var;
        c0Var.m();
    }

    private void j(yj yjVar, AbsoluteLayout absoluteLayout, j0 j0Var) {
        AbsoluteLayout.LayoutParams layoutParams;
        f0 f0Var = new f0(this.c, yjVar, j0Var);
        f0Var.a(this.z);
        yjVar.a0 = f0Var;
        j0Var.n = f0Var;
        f0Var.b(yjVar);
        com.comviva.webaxn.utils.u uVar = yjVar.p;
        if (uVar != null) {
            f0Var.b(uVar.f());
            f0Var.a(yjVar.p.d());
        }
        int i = j0Var.e;
        if (i <= 0) {
            layoutParams = new AbsoluteLayout.LayoutParams(-2, j0Var.f, j0Var.c, j0Var.d);
        } else {
            if (this.K.k) {
                j0Var.f = i;
            }
            layoutParams = new AbsoluteLayout.LayoutParams(j0Var.e, j0Var.f, j0Var.c, j0Var.d);
        }
        f0Var.a(layoutParams, this.K);
        f0Var.a(this.g);
        if (yjVar.v0 != null || yjVar.O != null || yjVar.r0 != null) {
            f0Var.a(yjVar.v0);
        }
        f0Var.p();
        f0Var.a(new p0(yjVar.e(j0Var.q.c.width()), yjVar.j(j0Var.q.c.width()), yjVar.h(j0Var.q.c.width()), yjVar.b(j0Var.q.c.width()), com.comviva.webaxn.utils.b.a(this.c).a().a()));
        if (j0Var.m) {
            return;
        }
        j0Var.e = f0Var.j();
        j0Var.f = f0Var.i();
    }

    private void k(yj yjVar, AbsoluteLayout absoluteLayout, j0 j0Var) {
        AbsoluteLayout.LayoutParams layoutParams;
        v0 v0Var;
        x0 x0Var = new x0(this.c, yjVar, j0Var, this.I);
        x0Var.a(this.z);
        yjVar.a0 = x0Var;
        x0Var.b(yjVar);
        x0Var.g(yjVar.p.c());
        x0Var.i(yjVar.p.c());
        x0Var.b(yjVar.p.f());
        x0Var.h(yjVar.p.g());
        x0Var.a(yjVar.p.d());
        if (j0Var.e <= 0) {
            layoutParams = new AbsoluteLayout.LayoutParams(-2, j0Var.f, j0Var.c, j0Var.d);
            v0Var = this.K;
        } else {
            layoutParams = new AbsoluteLayout.LayoutParams(j0Var.e, j0Var.f, j0Var.c, j0Var.d);
            v0Var = null;
        }
        x0Var.a(layoutParams, v0Var);
        x0Var.a(this.g);
        x0Var.n();
        x0Var.a(yjVar.v0);
        j0Var.e = x0Var.j();
        j0Var.f = x0Var.i();
        j0Var.n = x0Var;
    }

    private void l(yj yjVar, AbsoluteLayout absoluteLayout, j0 j0Var) {
        z0 z0Var = new z0(this.c, yjVar, j0Var, this.I.b);
        z0Var.a(this.z);
        yjVar.a0 = z0Var;
        z0Var.b(yjVar);
        z0Var.a(this.g);
        z0Var.a(yjVar.v0);
        z0Var.a(new AbsoluteLayout.LayoutParams(j0Var.e, j0Var.f, j0Var.c, j0Var.d), this.K);
        z0Var.o();
        j0Var.e = z0Var.j();
        j0Var.f = z0Var.i();
        j0Var.n = z0Var;
        z0Var.n();
    }

    private void m(yj yjVar, AbsoluteLayout absoluteLayout, j0 j0Var) {
        h1 h1Var = new h1(this.c, yjVar, j0Var);
        h1Var.b(yjVar);
        h1Var.a(this.z);
        yjVar.a0 = h1Var;
        h1Var.g(yjVar.p.g());
        h1Var.a(new AbsoluteLayout.LayoutParams(j0Var.e, j0Var.f, j0Var.c, j0Var.d), this.K);
        h1Var.a(this.g);
        h1Var.o();
        j0Var.e = h1Var.j();
        j0Var.f = h1Var.i();
        j0Var.n = h1Var;
        this.g.a(h1Var);
    }

    private void n(yj yjVar, AbsoluteLayout absoluteLayout, j0 j0Var) {
        AbsoluteLayout.LayoutParams layoutParams;
        v0 v0Var;
        m1 m1Var = new m1(this.c, yjVar, j0Var);
        m1Var.a(this.z);
        yjVar.a0 = m1Var;
        m1Var.b(yjVar);
        if (j0Var.e <= 0) {
            layoutParams = new AbsoluteLayout.LayoutParams(-2, j0Var.f, j0Var.c, j0Var.d);
            v0Var = this.K;
        } else {
            layoutParams = new AbsoluteLayout.LayoutParams(j0Var.e, j0Var.f, j0Var.c, j0Var.d);
            v0Var = null;
        }
        m1Var.a(layoutParams, v0Var);
        m1Var.a(new AbsoluteLayout.LayoutParams(j0Var.e, j0Var.f, j0Var.c, j0Var.d), this.K);
        m1Var.a(this.g);
        m1Var.m();
        j0Var.e = m1Var.j();
        j0Var.f = m1Var.i();
        j0Var.n = m1Var;
    }

    private int q() {
        int i = W;
        int i2 = this.J.e;
        int i3 = i2 / i;
        return i3 > 0 ? i2 / i3 : i;
    }

    private void r() {
        ArrayList<View> arrayList;
        ArrayList<View> arrayList2;
        j0 j0Var = this.J;
        yj yjVar = j0Var.p;
        if (yjVar.i0 == 4) {
            this.N = this.K.f;
        } else {
            String str = yjVar.m0;
            if (str == null || !str.equalsIgnoreCase("equal")) {
                if (this.P != null) {
                    if (this.Q == null || (arrayList2 = this.R) == null) {
                        return;
                    }
                    this.Q.setAdapter(new d1(this.c, arrayList2));
                    this.P.setupWithViewPager(this.Q);
                    t();
                    return;
                }
                if (this.Q == null || (arrayList = this.R) == null) {
                    return;
                }
                this.Q.setAdapter(new b1(this.c, arrayList));
                this.T.setViewPager(this.Q);
                int[] iArr = this.B.U;
                if (iArr == null || iArr.length <= 0) {
                    return;
                }
                if (iArr[0] < 0) {
                    iArr[0] = 0;
                } else if (iArr[0] >= this.R.size()) {
                    this.B.U[0] = 0;
                }
                this.Q.setCurrentItem(this.B.U[0]);
                return;
            }
            int i = this.K.d;
            this.M = i;
            if (i > this.O) {
                int c2 = c(this.J);
                if (c2 <= 0) {
                    c2 = this.O;
                }
                this.M = c2;
            }
            j0Var = this.J;
        }
        a(j0Var.l, j0Var.q);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void s() {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.k0.s():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 21) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00de, code lost:
    
        r4.setText(r8.S.get(r1).e());
        r8.S.get(r1).a(r4);
        a(r1, r5, false, false);
        r8.S.get(r1).a(r5);
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d3, code lost:
    
        r4.setLetterSpacing(r8.B.p.d());
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d1, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 21) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void t() {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.k0.t():void");
    }

    private void u() {
        v0 v0Var = this.K;
        int e = this.B.e(this.J.e);
        int j = this.B.j(this.J.e);
        int i = this.J.e;
        int h = i - this.B.h(i);
        int i2 = this.J.f;
        v0Var.c = new Rect(e, j, h, i2 - this.B.b(i2));
        v0 v0Var2 = this.K;
        Rect rect = v0Var2.c;
        v0Var2.a = rect.left;
        v0Var2.b = rect.top;
        v0Var2.d = 0;
        v0Var2.h = 0;
        v0Var2.f = 0;
        v0Var2.e = 0;
        v0Var2.i = 0;
        v0Var2.j = 0;
        v0Var2.l = null;
        this.F = false;
        v0Var2.m = null;
    }

    public void a(View view, yj yjVar) {
        Drawable a2 = a(yjVar, yjVar.A0 == null ? this.J.q.c.width() : this.J.e, this.J.f, true);
        if (a2 != null) {
            view.setBackground(a2);
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(AbsoluteLayout.LayoutParams layoutParams) {
        int i = this.B.e;
        if (this.B.e == 40) {
            return;
        }
        View h = h();
        if (this.b instanceof AbsoluteLayout) {
            ((AbsoluteLayout.LayoutParams) h.getLayoutParams()).x = layoutParams.x;
            ((AbsoluteLayout.LayoutParams) h.getLayoutParams()).y = layoutParams.y;
        }
        if (layoutParams.width > 0) {
            h.getLayoutParams().width = layoutParams.width;
        }
        if (layoutParams.height > 0) {
            h.getLayoutParams().height = layoutParams.height;
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(j0 j0Var, v0 v0Var) {
        int i;
        yj yjVar = this.B;
        j0 j0Var2 = this.J;
        j0Var2.q = v0Var;
        c(j0Var2, v0Var);
        u();
        this.O = q();
        ej ejVar = this.B.O0;
        if (ejVar != null) {
            ejVar.a(this.J.f);
        }
        if (this.B.i0 == 4) {
            this.K.k = true;
        }
        try {
            if (yjVar.z0 != null) {
                int i2 = 0;
                while (i2 < yjVar.z0.size()) {
                    yj elementAt = yjVar.z0.elementAt(i2);
                    int i3 = i2 + 1;
                    if (i3 < yjVar.z0.size()) {
                        this.G = yjVar.z0.elementAt(i3);
                    } else {
                        this.G = null;
                    }
                    if (i2 <= 0 || i2 - 1 < 0) {
                        this.H = null;
                    } else {
                        this.H = yjVar.z0.elementAt(i);
                    }
                    if ((elementAt.z0 == null || elementAt.z0.size() <= 0) && elementAt.e != 33 && elementAt.e != 36) {
                        if (elementAt.e == 23 || elementAt.b0.size() != 0) {
                            d(elementAt);
                        } else {
                            f(elementAt);
                        }
                        i2 = i3;
                    }
                    if (elementAt.b0.size() == 0) {
                        g(elementAt);
                    } else {
                        e(elementAt);
                    }
                    i2 = i3;
                }
            }
            h(this.J);
            k();
        } catch (OutOfMemoryError unused) {
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(p0 p0Var) {
        this.z.setPadding(p0Var.a, p0Var.b, p0Var.c, p0Var.d);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(x1.p pVar) {
        this.g = pVar;
        r0 r0Var = this.A;
        if (r0Var != null) {
            r0Var.setRenderingEventCb(pVar);
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(yj yjVar) {
        fj fjVar;
        gj gjVar;
        int i;
        ij ijVar = yjVar.k1;
        if ((ijVar == null || !ijVar.i()) && (((fjVar = yjVar.l1) == null || !fjVar.h()) && ((gjVar = yjVar.m1) == null || !gjVar.i()))) {
            if (yjVar.s1) {
                yj yjVar2 = this.B;
                if (yjVar2.e == 39) {
                    yjVar2.s1 = false;
                    p();
                    return;
                }
                return;
            }
            View view = this.z;
            yj yjVar3 = this.B;
            int i2 = yjVar3.e;
            if (i2 == 33 || i2 == 39 || (i = yjVar3.K0) == 8 || i == 9) {
                view = this.D;
            }
            a(view, yjVar);
            return;
        }
        ij ijVar2 = yjVar.k1;
        if (ijVar2 == null || !ijVar2.i()) {
            fj fjVar2 = yjVar.l1;
            if (fjVar2 == null || !fjVar2.h()) {
                gj gjVar2 = yjVar.m1;
                if (gjVar2 == null || !gjVar2.i()) {
                    return;
                }
                this.B.m1.a(yjVar.m1.a());
                yjVar.m1.b(false);
                return;
            }
            this.B.l1.a(yjVar.l1.a());
            yjVar.l1.b(false);
            if (yjVar.e != 40) {
                return;
            }
        } else {
            this.B.k1.a(yjVar.k1.a());
            yjVar.k1.b(false);
            if (yjVar.e != 40) {
                return;
            }
        }
        yj yjVar4 = yjVar.A0;
        yjVar4.s1 = true;
        yjVar4.a0.a(yjVar4);
    }

    public void a(yj yjVar, boolean z) {
        int i = 0;
        while (true) {
            Vector<yj> vector = yjVar.z0;
            if (vector == null || i >= vector.size()) {
                return;
            }
            n1 n1Var = yjVar.z0.elementAt(i).a0;
            if (n1Var != null) {
                if (z) {
                    n1Var.d();
                } else {
                    n1Var.c();
                }
            }
            i++;
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b() {
        if (this.B.e == 40) {
            return;
        }
        this.b.removeView(h());
    }

    @Override // com.comviva.webaxn.ui.n1
    public void c() {
        yj yjVar = this.B;
        yjVar.b = false;
        if (yjVar.e1) {
            n1.a(this.z, yjVar.d1);
        }
        a(this.B, false);
        this.z.setOnClickListener(null);
        this.z.setClickable(false);
        this.z.setFocusable(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r4.B.m.equalsIgnoreCase("exit") == false) goto L23;
     */
    @Override // com.comviva.webaxn.ui.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            r4 = this;
            yj r0 = r4.B
            r1 = 1
            r0.b = r1
            r4.a(r0, r1)
            yj r0 = r4.B
            boolean r2 = r0.b
            if (r2 == 0) goto L55
            java.lang.String r2 = r0.i
            if (r2 == 0) goto L18
            int r0 = r0.e
            r2 = 25
            if (r0 != r2) goto L44
        L18:
            yj r0 = r4.B
            java.lang.String r2 = r0.k
            if (r2 != 0) goto L44
            int r2 = r0.e
            r3 = 18
            if (r2 == r3) goto L44
            r3 = 29
            if (r2 == r3) goto L44
            r3 = 32
            if (r2 == r3) goto L44
            java.lang.String r0 = r0.m
            if (r0 == 0) goto L55
            java.lang.String r2 = "close"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L44
            yj r0 = r4.B
            java.lang.String r0 = r0.m
            java.lang.String r2 = "exit"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L55
        L44:
            android.widget.AbsoluteLayout r0 = r4.z
            android.view.View$OnClickListener r2 = r4.V
            r0.setOnClickListener(r2)
            android.widget.AbsoluteLayout r0 = r4.z
            r0.setClickable(r1)
            android.widget.AbsoluteLayout r0 = r4.z
            r0.setFocusable(r1)
        L55:
            yj r0 = r4.B
            boolean r0 = r0.e1
            if (r0 == 0) goto L67
            android.widget.AbsoluteLayout r0 = r4.z
            float r1 = com.comviva.webaxn.ui.n1.r
            com.comviva.webaxn.ui.n1.a(r0, r1)
            yj r0 = r4.B
            r1 = 0
            r0.e1 = r1
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.k0.d():void");
    }

    @Override // com.comviva.webaxn.ui.n1
    public yj f() {
        return this.B;
    }

    @Override // com.comviva.webaxn.ui.n1
    public View h() {
        return this.x;
    }

    @Override // com.comviva.webaxn.ui.n1
    public int i() {
        return this.k;
    }

    @Override // com.comviva.webaxn.ui.n1
    public int j() {
        return this.l;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void k() {
        j0 j0Var;
        int i;
        int i2 = this.B.e;
        if (i2 == 39 || i2 == 40 || (i = (j0Var = this.J).g) <= 0) {
            return;
        }
        if (i >= j0Var.i) {
            ViewGroup viewGroup = (ViewGroup) this.C.getParent();
            ViewGroup viewGroup2 = (ViewGroup) this.C.getChildAt(0);
            if (viewGroup != null) {
                int indexOfChild = viewGroup.indexOfChild(this.C);
                this.C.removeAllViews();
                viewGroup.removeView(this.C);
                viewGroup.addView(viewGroup2, indexOfChild);
                this.x = viewGroup2;
            }
            this.I.b.a(false);
            return;
        }
        ViewGroup viewGroup3 = (ViewGroup) this.C.getParent();
        View view = this.z;
        if (viewGroup3 == null) {
            if (this.B.e == 33) {
                view = this.D;
            }
            this.b.addView(this.C, this.b.indexOfChild(view));
            this.b.removeView(view);
            this.C.addView(view);
            this.x = this.C;
        }
        this.I.b.a(true);
    }

    public s m() {
        return this.E;
    }

    public void n() {
        dj djVar;
        yj yjVar = this.B;
        if (yjVar.e == 40 || (djVar = yjVar.J0) == null) {
            return;
        }
        n1.a(djVar, h());
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0041, code lost:
    
        if (r6.B.m.equalsIgnoreCase("exit") == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o() {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.k0.o():void");
    }

    public void p() {
        int i = this.U - 1;
        this.U = i;
        if (i == 0) {
            a(this.B.U[0], false);
        } else if (i < 0) {
            this.U = 0;
        }
    }
}
