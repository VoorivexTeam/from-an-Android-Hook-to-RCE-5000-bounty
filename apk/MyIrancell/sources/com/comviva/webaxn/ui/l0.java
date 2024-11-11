package com.comviva.webaxn.ui;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.comviva.webaxn.utils.p1;
import defpackage.aj;
import defpackage.dj;
import defpackage.ej;
import defpackage.q2;
import defpackage.tj;
import defpackage.vj;
import defpackage.yj;
import java.util.ArrayList;
import java.util.Vector;

/* loaded from: classes.dex */
public class l0 extends n1 {
    private static int H;
    private AbsoluteLayout A;
    private j0 B;
    public v0 C;
    private yj D;
    private o1 E;
    private int F;
    public View.OnClickListener G;
    private LinearLayout x;
    private b y;
    private ScrollView z;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!TextUtils.isEmpty(l0.this.D.u1)) {
                l0 l0Var = l0.this;
                l0Var.a(l0Var.D.u1);
            }
            l0 l0Var2 = l0.this;
            l0Var2.g.b(l0Var2);
        }
    }

    /* loaded from: classes.dex */
    public class b extends HorizontalScrollView {
        private float b;
        private float c;
        private float d;
        private float e;

        public b(l0 l0Var, Context context) {
            super(context);
            a(context);
        }

        void a(Context context) {
            setHorizontalFadingEdgeEnabled(false);
            setVerticalFadingEdgeEnabled(false);
            setHorizontalScrollBarEnabled(false);
        }

        @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.c = 0.0f;
                this.b = 0.0f;
                this.d = motionEvent.getX();
                this.e = motionEvent.getY();
            } else if (action == 1) {
                getParent().requestDisallowInterceptTouchEvent(false);
            } else if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.b += Math.abs(x - this.d);
                float abs = this.c + Math.abs(y - this.e);
                this.c = abs;
                this.d = x;
                this.e = y;
                if (abs > this.b) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
        
            if (r0 != 3) goto L18;
         */
        @Override // android.widget.HorizontalScrollView, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onTouchEvent(android.view.MotionEvent r7) {
            /*
                r6 = this;
                int r0 = r7.getAction()
                r1 = 1
                if (r0 == 0) goto L55
                r2 = 0
                if (r0 == r1) goto L4d
                r3 = 2
                if (r0 == r3) goto L11
                r1 = 3
                if (r0 == r1) goto L4d
                goto L6d
            L11:
                float r0 = r7.getX()
                float r3 = r7.getY()
                float r4 = r6.b
                float r5 = r6.d
                float r5 = r0 - r5
                float r5 = java.lang.Math.abs(r5)
                float r4 = r4 + r5
                r6.b = r4
                float r4 = r6.c
                float r5 = r6.e
                float r5 = r3 - r5
                float r5 = java.lang.Math.abs(r5)
                float r4 = r4 + r5
                r6.c = r4
                r6.d = r0
                r6.e = r3
                float r0 = r6.b
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r0 <= 0) goto L45
                android.view.ViewParent r7 = r6.getParent()
                r7.requestDisallowInterceptTouchEvent(r2)
                return r2
            L45:
                android.view.ViewParent r0 = r6.getParent()
                r0.requestDisallowInterceptTouchEvent(r1)
                goto L6d
            L4d:
                android.view.ViewParent r0 = r6.getParent()
                r0.requestDisallowInterceptTouchEvent(r2)
                goto L6d
            L55:
                android.view.ViewParent r0 = r6.getParent()
                r0.requestDisallowInterceptTouchEvent(r1)
                r0 = 0
                r6.c = r0
                r6.b = r0
                float r0 = r7.getX()
                r6.d = r0
                float r0 = r7.getY()
                r6.e = r0
            L6d:
                boolean r7 = super.onTouchEvent(r7)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.l0.b.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public l0(Context context, yj yjVar, o1 o1Var, j0 j0Var, v0 v0Var) {
        super(context);
        this.G = new a();
        this.D = yjVar;
        this.E = o1Var;
        H = 70;
        float f = yjVar.a;
        if (f > 0.0f) {
            H = (int) (f * 70.0f);
        }
        ej ejVar = this.D.O0;
        if (ejVar != null) {
            ejVar.a(j0Var.f);
        }
        this.x = new LinearLayout(this.c);
        if (!TextUtils.isEmpty(this.D.r1)) {
            this.x.setContentDescription(this.D.r1);
        }
        vj vjVar = this.D.q1;
        if (vjVar != null) {
            q2.a(this.x, vjVar.a());
        }
        this.x.setOrientation(0);
        this.A = new AbsoluteLayout(this.c);
        b bVar = new b(this, this.c);
        this.y = bVar;
        bVar.setSmoothScrollingEnabled(true);
        this.x.addView(this.A);
        j0 j0Var2 = new j0(context);
        this.B = j0Var2;
        j0Var2.l = j0Var;
        if (j0Var != null) {
            j0Var.o.add(j0Var2);
            v0Var.m = this.B;
        }
        b(this.B, v0Var);
        if (this.B.g > 0) {
            o0 o0Var = new o0(this.c);
            this.z = o0Var;
            o0Var.setVerticalScrollBarEnabled(false);
            this.z.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.z.setFillViewport(true);
            this.y.addView(this.z);
            this.z.addView(this.x);
        } else {
            this.y.addView(this.x);
        }
        this.h = n1.d(this.h);
    }

    private void a(yj yjVar, AbsoluteLayout absoluteLayout, j0 j0Var) {
        d dVar = new d(this.c, yjVar.n, yjVar, j0Var);
        dVar.a(this.A);
        yjVar.a0 = dVar;
        dVar.c(yjVar);
        dVar.b(yjVar.p.f());
        dVar.g(yjVar.p.g());
        dVar.a(yjVar.p.d());
        Vector<tj> vector = yjVar.L;
        dVar.a(j0Var.e <= 0 ? new AbsoluteLayout.LayoutParams(-2, j0Var.f, j0Var.c, j0Var.d) : new AbsoluteLayout.LayoutParams(j0Var.e, j0Var.f, j0Var.c, j0Var.d), this.C);
        dVar.a(this.g);
        dVar.b(yjVar);
        dVar.n();
        dVar.a(new p0(yjVar.e(j0Var.e), yjVar.j(j0Var.e), yjVar.h(j0Var.e), yjVar.b(j0Var.e), com.comviva.webaxn.utils.b.a(this.c).a().a()));
        j0Var.e = dVar.j();
        j0Var.f = dVar.i();
        j0Var.n = dVar;
        dVar.m();
    }

    private void b(yj yjVar) {
        if (yjVar.e == 3) {
            n1 n1Var = yjVar.a0;
            if (n1Var == null) {
                return;
            }
            if (((w) n1Var).p()) {
                if (yjVar.o1) {
                    yjVar.o1 = false;
                }
                this.E.a(yjVar);
                return;
            } else if (!yjVar.o1) {
                return;
            }
        } else if (!yjVar.o1) {
            return;
        }
        this.E.d(yjVar);
    }

    private void b(yj yjVar, AbsoluteLayout absoluteLayout, j0 j0Var) {
        g gVar = new g(this.c, yjVar, j0Var);
        gVar.a(this.A);
        yjVar.a0 = gVar;
        gVar.b(yjVar);
        gVar.a(new AbsoluteLayout.LayoutParams(j0Var.e, j0Var.f, j0Var.c, j0Var.d), this.C);
        gVar.a(this.g);
        gVar.m();
        gVar.a(new p0(yjVar.e(j0Var.e), yjVar.j(j0Var.e), yjVar.h(j0Var.e), yjVar.b(j0Var.e), com.comviva.webaxn.utils.b.a(this.c).a().a()));
        j0Var.e = gVar.j();
        j0Var.f = gVar.i();
        j0Var.n = gVar;
    }

    private void c(yj yjVar, AbsoluteLayout absoluteLayout, j0 j0Var) {
        int i = yjVar.R;
        if (i == 2) {
            i iVar = new i(this.c, null, yjVar, j0Var, this.C, this.E);
            iVar.a(this.g);
            iVar.a(this.A);
            yjVar.a0 = iVar;
            iVar.b(yjVar);
            j0Var.n = iVar;
            iVar.a(new p0(yjVar.e(j0Var.e), yjVar.j(j0Var.e), yjVar.h(j0Var.e), yjVar.b(j0Var.e), com.comviva.webaxn.utils.b.a(this.c).a().a()));
            if (j0Var.e <= 0) {
                iVar.c(new AbsoluteLayout.LayoutParams(-2, j0Var.f, j0Var.c, j0Var.d));
            } else {
                iVar.c(new AbsoluteLayout.LayoutParams(j0Var.e, j0Var.f, j0Var.c, j0Var.d));
            }
            iVar.t();
            iVar.a(yjVar.v0);
            j0Var.e = iVar.j();
            j0Var.f = iVar.i();
            iVar.r();
            return;
        }
        if (i == 4 || i == 3) {
            t0 t0Var = new t0(this.c, null, yjVar, j0Var);
            t0Var.a(this.g);
            t0Var.a(this.A);
            yjVar.a0 = t0Var;
            t0Var.b(yjVar);
            j0Var.n = t0Var;
            t0Var.a(new p0(yjVar.e(j0Var.e), yjVar.j(j0Var.e), yjVar.h(j0Var.e), yjVar.b(j0Var.e), com.comviva.webaxn.utils.b.a(this.c).a().a()));
            if (j0Var.e <= 0) {
                t0Var.c(new AbsoluteLayout.LayoutParams(this.C.c.width() - (yjVar.e(j0Var.e) + yjVar.h(j0Var.e)), j0Var.f, j0Var.c, j0Var.d));
            } else {
                t0Var.c(new AbsoluteLayout.LayoutParams(j0Var.e, j0Var.f, j0Var.c, j0Var.d));
            }
            t0Var.s();
            t0Var.a(yjVar.v0);
            j0Var.e = t0Var.j();
            j0Var.f = t0Var.i();
            t0Var.q();
            return;
        }
        if (i == 1) {
            l lVar = new l(this.c, yjVar, j0Var);
            lVar.a(this.g);
            lVar.a(this.A);
            for (int i2 = 0; i2 < yjVar.P.size(); i2++) {
                lVar.b(yjVar.P.elementAt(i2).a);
            }
            yjVar.a0 = lVar;
            lVar.b(yjVar);
            j0Var.n = lVar;
            lVar.a(new p0(yjVar.e(j0Var.e), yjVar.j(j0Var.e), yjVar.h(j0Var.e), yjVar.b(j0Var.e), com.comviva.webaxn.utils.b.a(this.c).a().a()));
            if (j0Var.e <= 0) {
                lVar.c(new AbsoluteLayout.LayoutParams(-2, j0Var.f, j0Var.c, j0Var.d));
            } else {
                lVar.c(new AbsoluteLayout.LayoutParams(j0Var.e, j0Var.f, j0Var.c, j0Var.d));
            }
            lVar.q();
            lVar.a(yjVar.v0);
            String h = aj.a(this.c).h(yjVar.V);
            if (!TextUtils.isEmpty(yjVar.Q)) {
                h = aj.a(this.c).h(yjVar.Q);
            }
            int[] iArr = yjVar.U;
            if (iArr != null && iArr.length > 0) {
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

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0067, code lost:
    
        if (r0 != null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(defpackage.yj r11, com.comviva.webaxn.ui.j0 r12) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.l0.c(yj, com.comviva.webaxn.ui.j0):void");
    }

    private void d(yj yjVar, AbsoluteLayout absoluteLayout, j0 j0Var) {
        q qVar = new q(this.c, null, yjVar, j0Var, this.E);
        qVar.a(this.A);
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

    private int e(j0 j0Var) {
        int size = j0Var.o.size();
        if (size > 0) {
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                int e = e(j0Var.o.elementAt(i2));
                if (-1 != e) {
                    if (i < e) {
                        i = e;
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

    private void e(yj yjVar, AbsoluteLayout absoluteLayout, j0 j0Var) {
        t tVar = new t(this.c, yjVar, j0Var);
        tVar.a(this.A);
        yjVar.a0 = tVar;
        tVar.a(this.g);
        tVar.a(p1.b);
        tVar.n();
        tVar.a(new p0(yjVar.e(j0Var.e), yjVar.j(j0Var.e), yjVar.h(j0Var.e), yjVar.b(j0Var.e), com.comviva.webaxn.utils.b.a(this.c).a().a()));
        j0Var.e = tVar.j();
        j0Var.f = tVar.i();
        j0Var.n = tVar;
    }

    private void f(yj yjVar, AbsoluteLayout absoluteLayout, j0 j0Var) {
        String str;
        w wVar = new w(this.c, j0Var, this.E);
        wVar.a(this.g);
        int a2 = wVar.a(yjVar.R, yjVar.K, yjVar.l);
        com.comviva.webaxn.utils.u uVar = yjVar.p;
        if (uVar != null) {
            if (uVar.k()) {
                wVar.b(yjVar.p.c());
            }
            wVar.b(yjVar.p.f());
            wVar.i(yjVar.p.g());
            wVar.a(yjVar.p.d());
        }
        if (yjVar.K0 != 0) {
            wVar.b(0);
            wVar.a(false);
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
            wVar.h(h);
        }
        if (true == j0Var.r) {
            wVar.n();
        }
        com.comviva.webaxn.utils.u uVar2 = yjVar.p;
        if (uVar2 != null) {
            if (uVar2.k()) {
                wVar.b(yjVar.p.c());
            }
            if (yjVar.p.j()) {
                wVar.a(yjVar.p.b());
            }
        }
        wVar.a(yjVar.r);
        wVar.a((ViewGroup) this.A);
        yjVar.a0 = wVar;
        j0Var.n = wVar;
        wVar.b(yjVar);
        wVar.c(j0Var.e <= 0 ? new AbsoluteLayout.LayoutParams(-2, j0Var.f, j0Var.c, j0Var.d) : new AbsoluteLayout.LayoutParams(j0Var.e, j0Var.f, j0Var.c, j0Var.d));
        wVar.v();
        wVar.a(new p0(yjVar.e(j0Var.e), yjVar.j(j0Var.e), yjVar.h(j0Var.e), yjVar.b(j0Var.e), com.comviva.webaxn.utils.b.a(this.c).a().a()));
        int i = yjVar.S;
        if (i > 0) {
            wVar.j(i);
        }
        wVar.a(yjVar.v0);
        j0Var.e = wVar.j();
        j0Var.f = wVar.i();
        wVar.r();
    }

    private void g(yj yjVar, AbsoluteLayout absoluteLayout, j0 j0Var) {
        AbsoluteLayout.LayoutParams layoutParams;
        v0 v0Var;
        f0 f0Var = new f0(this.c, yjVar, j0Var);
        f0Var.a(this.A);
        yjVar.a0 = f0Var;
        f0Var.b(yjVar);
        com.comviva.webaxn.utils.u uVar = yjVar.p;
        if (uVar != null) {
            f0Var.b(uVar.f());
            f0Var.a(yjVar.p.d());
        }
        if (j0Var.e <= 0) {
            layoutParams = new AbsoluteLayout.LayoutParams(-2, j0Var.f, j0Var.c, j0Var.d);
            v0Var = this.C;
        } else {
            layoutParams = new AbsoluteLayout.LayoutParams(j0Var.e, j0Var.f, j0Var.c, j0Var.d);
            v0Var = null;
        }
        f0Var.a(layoutParams, v0Var);
        f0Var.a(this.g);
        if (yjVar.v0 != null || yjVar.O != null || yjVar.r0 != null) {
            f0Var.a(yjVar.v0);
        }
        f0Var.p();
        j0Var.e = f0Var.j();
        j0Var.f = f0Var.i();
        j0Var.n = f0Var;
    }

    private int o() {
        int i = H;
        int i2 = this.B.e;
        int i3 = i2 / i;
        return i3 > 0 ? i2 / i3 : i;
    }

    private void p() {
        v0 v0Var = this.C;
        int g = g(this.B.e);
        int i = i(this.B.e);
        int i2 = this.B.e;
        v0Var.c = new Rect(g, i, i2 - h(i2), this.B.f);
        v0 v0Var2 = this.C;
        Rect rect = v0Var2.c;
        v0Var2.a = rect.left;
        v0Var2.b = rect.top;
        v0Var2.m = null;
        v0Var2.d = 0;
        v0Var2.h = 0;
        v0Var2.f = 0;
        v0Var2.e = 0;
        v0Var2.i = 0;
        v0Var2.l = null;
    }

    public void a(int i, int i2, int i3, int i4, int i5, int i6, j0 j0Var) {
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
        } else if ((yjVar.g.equalsIgnoreCase("R") || yjVar.g.equalsIgnoreCase("Right")) && i < i5) {
            i7 = j0Var.c;
            i8 = i5 - i;
            j0Var.c = i7 + i8;
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
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(AbsoluteLayout.LayoutParams layoutParams) {
        if (this.b instanceof AbsoluteLayout) {
            ((AbsoluteLayout.LayoutParams) this.y.getLayoutParams()).x = layoutParams.x;
            ((AbsoluteLayout.LayoutParams) this.y.getLayoutParams()).y = layoutParams.y;
            if (layoutParams.width > 0) {
                ((AbsoluteLayout.LayoutParams) this.y.getLayoutParams()).width = layoutParams.width;
            }
            if (layoutParams.height > 0) {
                ((AbsoluteLayout.LayoutParams) this.y.getLayoutParams()).height = layoutParams.height;
            }
        }
    }

    public void a(j0 j0Var) {
        int i = j0Var.e;
        int i2 = j0Var.f;
        int i3 = j0Var.i;
        int i4 = i2 > i3 ? i2 - i3 : 0;
        ArrayList<Integer> b2 = b(j0Var);
        int intValue = b2.get(0).intValue();
        int intValue2 = b2.get(1).intValue();
        int intValue3 = b2.get(2).intValue();
        int intValue4 = b2.get(3).intValue();
        for (int i5 = 0; i5 < j0Var.o.size(); i5++) {
            a(intValue, intValue2, i, i4, intValue3, intValue4, j0Var.o.get(i5));
        }
    }

    public void a(j0 j0Var, int i) {
        int i2;
        int size = j0Var.o.size();
        int a2 = j0Var.a();
        p0 p0Var = new p0(0, 0, 0, 0, com.comviva.webaxn.utils.b.a(this.c).a().a());
        if (size > 0) {
            int i3 = j0Var.o.elementAt(0).c;
            int i4 = i % a2;
            int i5 = (int) (i / a2);
            if (i5 > 0) {
                for (int i6 = 0; i6 < j0Var.o.size(); i6++) {
                    j0 elementAt = j0Var.o.elementAt(i6);
                    yj yjVar = elementAt.p;
                    if (yjVar != null && yjVar.f) {
                        if (elementAt.c <= i3) {
                            elementAt.c = i3;
                        }
                        if (i4 > 0) {
                            i2 = i5 + 1;
                            i4--;
                        } else {
                            i2 = i5;
                        }
                        int i7 = i2 % 2 == 0 ? i2 / 2 : (i2 / 2) + 1;
                        p0Var.c = i7;
                        int i8 = i2 / 2;
                        p0Var.a = i8;
                        int i9 = i7 + i8;
                        i -= i9;
                        if (!(elementAt.n instanceof k0)) {
                            p0Var.a = i8 + elementAt.p.e(j0Var.e);
                            p0Var.c += elementAt.p.h(j0Var.e);
                        }
                        elementAt.n.a(p0Var);
                        elementAt.e += i9;
                        if (i6 == j0Var.o.size() - 1) {
                            elementAt.e += i;
                        }
                        elementAt.n.a(new AbsoluteLayout.LayoutParams(elementAt.e, elementAt.f, elementAt.c, elementAt.d));
                        i3 = elementAt.c + elementAt.e + elementAt.p.g(j0Var.q.c.width());
                        j0Var.e = j0Var.p.h(j0Var.e) + i3;
                    }
                }
            }
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(j0 j0Var, v0 v0Var) {
        int i;
        c(this.B, v0Var);
        p();
        for (int i2 = 0; i2 < this.D.z0.size(); i2++) {
            yj elementAt = this.D.z0.elementAt(i2);
            String str = this.D.i;
            if (str != null && elementAt.i == null) {
                elementAt.i = str;
            }
            if (elementAt.a0 != null) {
                if (elementAt.f) {
                    elementAt.a0.h().setVisibility(0);
                } else {
                    for (int i3 = 0; i3 < elementAt.b0.size(); i3++) {
                        elementAt.a0.h().setVisibility(8);
                        j0 elementAt2 = elementAt.b0.elementAt(i3);
                        elementAt2.f = 0;
                        elementAt2.e = 0;
                        elementAt2.a = this.C.a;
                        elementAt2.b = this.C.b;
                        elementAt2.c = this.C.a;
                        elementAt2.d = this.C.b + elementAt.i(this.B.e);
                        elementAt2.h = this.C.c.right;
                    }
                }
            }
            Vector<yj> vector = elementAt.z0;
            if ((vector != null && vector.size() > 0) || (i = elementAt.e) == 33) {
                j0 elementAt3 = elementAt.b0.elementAt(0);
                this.C.m = elementAt3;
                n1 n1Var = elementAt3.n;
                if ((n1Var instanceof k0) || (n1Var instanceof l0)) {
                    String str2 = elementAt3.l.p.m0;
                    if (str2 != null && str2.equalsIgnoreCase("equal")) {
                        elementAt3.e = this.F;
                        elementAt3.m = true;
                    }
                    elementAt3.n.a(this.B, this.C);
                }
                this.C.a = elementAt3.c + elementAt3.e + elementAt3.p.g(elementAt3.q.c.width());
                if (this.C.d < elementAt3.e + elementAt3.p.g(elementAt3.q.c.width()) + elementAt3.p.d(elementAt3.q.c.width())) {
                    this.C.d = elementAt3.e + elementAt3.p.g(elementAt3.q.c.width()) + elementAt3.p.d(elementAt3.q.c.width());
                }
                if (this.C.h < elementAt3.f + elementAt3.p.i(elementAt3.q.c.width()) + elementAt3.p.a(elementAt3.q.c.width())) {
                    this.C.h = elementAt3.f + elementAt3.p.i(elementAt3.q.c.width()) + elementAt3.p.a(elementAt3.q.c.width());
                }
                elementAt3.n.a(new AbsoluteLayout.LayoutParams(elementAt3.e, elementAt3.f, elementAt3.c, elementAt3.d));
            } else if (i != 23 && i != 24 && i != 7 && i != 28) {
                j0 elementAt4 = elementAt.b0.elementAt(0);
                this.C.m = elementAt4;
                int i4 = elementAt.e;
                if (i4 == 22 || i4 == 2 || i4 == 27 || i4 == 13 || i4 == 26 || i4 == 9 || i4 == 1) {
                    elementAt4.n.b();
                }
                j0 j0Var2 = this.B;
                elementAt4.l = j0Var2;
                elementAt4.p = elementAt;
                int i5 = j0Var2.e;
                elementAt4.h = i5 - 1;
                v0 v0Var2 = this.C;
                int i6 = v0Var2.a;
                elementAt4.a = i6;
                elementAt4.b = v0Var2.b;
                v0Var2.a = i6 + elementAt.d(i5);
                v0 v0Var3 = this.C;
                elementAt4.c = v0Var3.a;
                elementAt4.d = v0Var3.b + elementAt.i(this.B.e);
                elementAt4.q = this.C;
                String str3 = elementAt4.l.p.m0;
                if (str3 == null || !str3.equalsIgnoreCase("equal")) {
                    elementAt4.e = elementAt.k(this.C.c.width());
                } else {
                    elementAt4.e = this.F;
                    elementAt4.m = true;
                }
                elementAt4.f = elementAt.c(com.comviva.webaxn.utils.b.a(this.c).a().b());
                b(elementAt, elementAt4);
                v0 v0Var4 = this.C;
                v0Var4.a = elementAt4.c + elementAt4.e + elementAt4.p.g(v0Var4.c.width());
                v0 v0Var5 = this.C;
                if (v0Var5.d < elementAt4.e + elementAt4.p.g(v0Var5.c.width()) + elementAt4.p.d(this.C.c.width())) {
                    v0 v0Var6 = this.C;
                    v0Var6.d = elementAt4.e + elementAt4.p.g(v0Var6.c.width()) + elementAt4.p.d(this.C.c.width());
                }
                v0 v0Var7 = this.C;
                if (v0Var7.h < elementAt4.f + elementAt4.p.i(v0Var7.c.width()) + elementAt4.p.a(this.C.c.width())) {
                    v0 v0Var8 = this.C;
                    v0Var8.h = elementAt4.f + elementAt4.p.i(v0Var8.c.width()) + elementAt4.p.a(this.C.c.width());
                }
                elementAt4.n.a(new AbsoluteLayout.LayoutParams(elementAt4.e, elementAt4.f, elementAt4.c, elementAt4.d));
            }
        }
        d(this.B);
        a(this.D);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(yj yjVar) {
        Drawable a2 = a(yjVar, yjVar.A0 == null ? this.B.q.c.width() : this.B.e, this.B.f, false);
        if (a2 != null) {
            this.y.setBackground(a2);
        }
        this.y.getLayoutParams().height = this.B.f;
    }

    public void a(yj yjVar, j0 j0Var) {
        int i = yjVar.e;
        if (i == 13 || i == 26) {
            g(yjVar, this.A, j0Var);
            return;
        }
        if (i == 10 || i == 11) {
            b(yjVar, this.A, j0Var);
            return;
        }
        if (i == 22 || i == 2 || i == 27) {
            c(yjVar, j0Var);
            return;
        }
        if (i == 1) {
            a(yjVar, this.A, j0Var);
            return;
        }
        if (i == 3) {
            f(yjVar, this.A, j0Var);
            return;
        }
        if (i == 4) {
            c(yjVar, this.A, j0Var);
        } else if (i == 9) {
            e(yjVar, this.A, j0Var);
        } else if (i == 6) {
            d(yjVar, this.A, j0Var);
        }
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

    public ArrayList<Integer> b(j0 j0Var) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < j0Var.o.size(); i4++) {
            j0 j0Var2 = j0Var.o.get(i4);
            yj yjVar = j0Var2.p;
            if (yjVar != null && yjVar.f) {
                int i5 = j0Var2.f;
                if (i2 < i5) {
                    i2 = i5;
                }
                int i6 = j0Var2.k;
                if (i3 < i6) {
                    i3 = i6;
                }
                i = j0Var2.c + j0Var2.e + j0Var2.p.g(j0Var2.q.c.width());
            }
        }
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        int i7 = j0Var.e;
        arrayList.add(Integer.valueOf(i7 - (j0Var.p.h(i7) + j0Var.p.e(j0Var.e))));
        arrayList.add(Integer.valueOf(i3));
        return arrayList;
    }

    public void b(j0 j0Var, v0 v0Var) {
        j0Var.q = v0Var;
        yj yjVar = this.D;
        j0Var.p = yjVar;
        yjVar.b0.add(j0Var);
        j0Var.e = v0Var.c.width() - (this.D.d(v0Var.c.width()) + this.D.g(v0Var.c.width()));
        int k = this.D.k(v0Var.c.width());
        int c = this.D.c(v0Var.c.height());
        int f = this.D.f(v0Var.c.height());
        if (c == -3 && k > 0) {
            c = k;
        }
        if (f == -3 && k > 0) {
            f = k;
        }
        if (k == -3 && c > 0) {
            k = c;
        }
        if (k <= 0) {
            k = v0Var.c.width() - (this.D.d(v0Var.c.width()) + this.D.g(v0Var.c.width()));
        }
        j0Var.e = k;
        if (c > 0) {
            j0Var.f = c;
        } else {
            j0Var.f = v0Var.c.height();
        }
        if (f > 0) {
            j0Var.g = f;
            j0Var.f = f;
        }
        j0Var.h = j0Var.e - 1;
        int i = v0Var.a;
        j0Var.a = i;
        j0Var.b = v0Var.b;
        j0Var.c = i + this.D.d(v0Var.c.width());
        j0Var.d = v0Var.b + this.D.i(v0Var.c.width());
        j0Var.n = this;
    }

    public void b(yj yjVar, j0 j0Var) {
        int i;
        n1 n1Var;
        AbsoluteLayout.LayoutParams layoutParams;
        int i2 = yjVar.e;
        if (i2 == 13 || i2 == 26) {
            g(yjVar, this.A, j0Var);
            return;
        }
        if (i2 == 10 || i2 == 11) {
            int i3 = j0Var.e;
            if (i3 <= 0) {
                i3 = -2;
            }
            int i4 = j0Var.f;
            j0Var.n.b(new AbsoluteLayout.LayoutParams(i3, i4 > 0 ? i4 : -2, j0Var.c, j0Var.d));
            j0Var.e = j0Var.n.j();
            j0Var.f = j0Var.n.i();
            return;
        }
        if (i2 == 22 || i2 == 2 || i2 == 27) {
            c(yjVar, j0Var);
            return;
        }
        if (i2 == 1) {
            a(yjVar, this.A, j0Var);
            return;
        }
        if (i2 == 3) {
            int i5 = j0Var.e;
            if (i5 <= 0) {
                int i6 = this.B.e;
                i5 = i6 - (g(i6) + h(this.B.e));
            }
            int i7 = j0Var.f;
            i = i7 > 0 ? i7 : -2;
            n1Var = j0Var.n;
            layoutParams = new AbsoluteLayout.LayoutParams(i5, i, j0Var.c, j0Var.d);
        } else if (i2 == 4) {
            int i8 = j0Var.e;
            if (i8 <= 0) {
                i8 = -2;
            }
            int i9 = j0Var.f;
            i = i9 > 0 ? i9 : -2;
            n1Var = j0Var.n;
            layoutParams = new AbsoluteLayout.LayoutParams(i8, i, j0Var.c, j0Var.d);
        } else {
            if (i2 == 9) {
                e(yjVar, this.A, j0Var);
                return;
            }
            if (i2 != 6) {
                return;
            }
            int i10 = j0Var.e;
            if (i10 <= 0) {
                i10 = -2;
            }
            int i11 = j0Var.f;
            i = i11 > 0 ? i11 : -2;
            n1Var = j0Var.n;
            layoutParams = new AbsoluteLayout.LayoutParams(i10, i, j0Var.c, j0Var.d);
        }
        n1Var.b(layoutParams);
        j0Var.e = j0Var.n.j();
        j0Var.f = j0Var.n.i();
        b(yjVar);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void c() {
        yj yjVar = this.D;
        yjVar.b = false;
        a(yjVar, false);
        this.x.setOnClickListener(null);
        this.x.setClickable(false);
        this.x.setFocusable(false);
        yj yjVar2 = this.D;
        if (yjVar2.e1) {
            n1.a(this.y, yjVar2.d1);
        }
    }

    public void c(AbsoluteLayout.LayoutParams layoutParams) {
        AbsoluteLayout.LayoutParams layoutParams2;
        if (!(this.b instanceof AbsoluteLayout) || (layoutParams2 = (AbsoluteLayout.LayoutParams) this.y.getLayoutParams()) == null) {
            return;
        }
        layoutParams2.width = layoutParams.width;
        layoutParams2.height = layoutParams.height;
        layoutParams2.x = layoutParams.x;
        layoutParams2.y = layoutParams.y;
    }

    public void c(j0 j0Var) {
        if (j0Var.o.size() > 0) {
            j0 elementAt = j0Var.o.elementAt(r0.size() - 1);
            int g = elementAt.c + elementAt.e + elementAt.p.g(elementAt.q.c.width());
            for (int i = 0; i < j0Var.o.size(); i++) {
                j0 elementAt2 = j0Var.o.elementAt(i);
                elementAt2.c = (g - elementAt2.c) - elementAt2.e;
                elementAt2.n.a(new AbsoluteLayout.LayoutParams(elementAt2.e, elementAt2.f, elementAt2.c, elementAt2.d));
            }
        }
    }

    public void c(j0 j0Var, v0 v0Var) {
        j0Var.q = v0Var;
        int k = this.D.k(v0Var.c.width());
        int c = this.D.c(v0Var.c.height());
        int f = this.D.f(v0Var.c.height());
        if (c == -3 && k > 0) {
            c = k;
        }
        if (f == -3 && k > 0) {
            f = k;
        }
        if (k == -3 && c > 0) {
            k = c;
        }
        if (j0Var.m) {
            k = j0Var.e;
        }
        if (k <= 0) {
            k = v0Var.c.width() - (this.D.d(v0Var.c.width()) + this.D.g(v0Var.c.width()));
        }
        j0Var.e = k;
        if (c > 0) {
            j0Var.f = c;
        } else {
            int height = v0Var.c.height() - (this.D.i(v0Var.c.width()) + this.D.a(v0Var.c.width()));
            j0Var.f = height;
            if (this.D.e == 39) {
                j0Var.f = height - v0Var.b;
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
        j0Var.c = i + this.D.d(rect.width());
        j0Var.d = v0Var.b + this.D.i(v0Var.c.width());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r4.D.m.equalsIgnoreCase("exit") == false) goto L23;
     */
    @Override // com.comviva.webaxn.ui.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            r4 = this;
            yj r0 = r4.D
            r1 = 1
            r0.b = r1
            r4.a(r0, r1)
            yj r0 = r4.D
            boolean r2 = r0.b
            if (r2 == 0) goto L55
            java.lang.String r2 = r0.i
            if (r2 == 0) goto L18
            int r0 = r0.e
            r2 = 25
            if (r0 != r2) goto L44
        L18:
            yj r0 = r4.D
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
            yj r0 = r4.D
            java.lang.String r0 = r0.m
            java.lang.String r2 = "exit"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L55
        L44:
            android.widget.LinearLayout r0 = r4.x
            android.view.View$OnClickListener r2 = r4.G
            r0.setOnClickListener(r2)
            android.widget.LinearLayout r0 = r4.x
            r0.setClickable(r1)
            android.widget.LinearLayout r0 = r4.x
            r0.setFocusable(r1)
        L55:
            yj r0 = r4.D
            boolean r0 = r0.e1
            if (r0 == 0) goto L67
            com.comviva.webaxn.ui.l0$b r0 = r4.y
            float r1 = com.comviva.webaxn.ui.n1.r
            com.comviva.webaxn.ui.n1.a(r0, r1)
            yj r0 = r4.D
            r1 = 0
            r0.e1 = r1
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.l0.d():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0042, code lost:
    
        if (r1 < r0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(com.comviva.webaxn.ui.j0 r6) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.l0.d(com.comviva.webaxn.ui.j0):void");
    }

    @Override // com.comviva.webaxn.ui.n1
    public yj f() {
        return this.D;
    }

    public int g(int i) {
        return this.D.e(i);
    }

    public int h(int i) {
        return this.D.h(i);
    }

    @Override // com.comviva.webaxn.ui.n1
    public View h() {
        return this.y;
    }

    public int i(int i) {
        return this.D.j(i);
    }

    public void m() {
        dj djVar = this.D.J0;
        if (djVar != null) {
            n1.a(djVar, h());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x03a2, code lost:
    
        if (r8.D.m.equalsIgnoreCase("exit") == false) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n() {
        /*
            Method dump skipped, instructions count: 967
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.l0.n():void");
    }
}
