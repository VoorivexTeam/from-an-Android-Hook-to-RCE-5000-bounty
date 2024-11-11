package com.comviva.webaxn.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import com.comviva.webaxn.utils.x1;
import defpackage.jj;
import defpackage.yj;
import defpackage.zj;
import java.util.Vector;

/* loaded from: classes.dex */
public class r extends View {
    private float A;
    private float B;
    private Paint C;
    private Paint D;
    yj E;
    float F;
    private double G;
    private String H;
    private float I;
    private float J;
    private int K;
    Runnable L;
    Runnable M;
    private double b;
    private int c;
    private int d;
    private float e;
    private float f;
    private yj g;
    private int h;
    private int i;
    private Handler j;
    private int k;
    private float l;
    private float m;
    private int n;
    private int o;
    private int p;
    private int q;
    private float r;
    private float s;
    private float t;
    private RectF u;
    private RectF v;
    private Paint w;
    private Paint x;
    private float y;
    private double z;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r rVar;
            float f;
            if (r.this.k == 1) {
                if (r.this.y < r.this.f) {
                    r.this.y += 5.0f;
                    r.this.z += r.this.b;
                    if (r.this.G > 0.0d && r.this.z > r.this.G) {
                        r rVar2 = r.this;
                        rVar2.z = rVar2.G;
                    }
                    if (r.this.y > r.this.f) {
                        r rVar3 = r.this;
                        rVar3.y = rVar3.f;
                        r rVar4 = r.this;
                        rVar4.z = rVar4.G;
                    }
                    r rVar5 = r.this;
                    rVar5.z = x1.a(rVar5.z);
                    r.this.invalidate();
                    r.this.j.postDelayed(r.this.L, 0L);
                }
                r.this.j.removeCallbacks(r.this.L);
                return;
            }
            if (r.this.q == 1) {
                if (r.this.B > 0.0f && r.this.A > r.this.J) {
                    r.this.A -= r.this.d;
                    if (r.this.A < r.this.J) {
                        rVar = r.this;
                        f = rVar.J;
                        rVar.A = f;
                    }
                }
                r.this.j.removeCallbacks(r.this.L);
                return;
            }
            if (r.this.B > 0.0f && r.this.A < r.this.B) {
                r.this.A += r.this.d;
                if (r.this.A > r.this.B) {
                    rVar = r.this;
                    f = rVar.B;
                    rVar.A = f;
                }
            }
            r.this.j.removeCallbacks(r.this.L);
            return;
            r.this.invalidate();
            r.this.j.postDelayed(r.this.L, 0L);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        boolean b = false;

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r rVar;
            float f;
            r rVar2;
            float f2;
            if (r.this.g.p1.get(r.this.K).i() == 1) {
                return;
            }
            if (r.this.g.p1.get(r.this.K).a() != 0) {
                if (this.b) {
                    this.b = false;
                } else {
                    r.f(r.this);
                }
                if (r.this.K < r.this.g.p1.size()) {
                    if (r.this.g.p1.get(r.this.K).g() == 0) {
                        rVar = r.this;
                        f = rVar.g.p1.get(r.this.K).p();
                    } else {
                        rVar = r.this;
                        f = rVar.g.p1.get(r.this.K).c().right;
                    }
                    rVar.A = f;
                }
                r rVar3 = r.this;
                rVar3.K = rVar3.g.p1.size() - 1;
                r.this.j.removeCallbacks(r.this.M);
                this.b = false;
                return;
            }
            this.b = true;
            if (r.this.g.p1.get(r.this.K).g() == 0) {
                if (r.this.g.p1.get(r.this.K).f() <= 0.0f || r.this.A >= r.this.g.p1.get(r.this.K).f()) {
                    r.f(r.this);
                    if (r.this.K < r.this.g.p1.size()) {
                        rVar2 = r.this;
                        f2 = rVar2.g.p1.get(r.this.K).p();
                        rVar2.A = f2;
                    }
                    r rVar32 = r.this;
                    rVar32.K = rVar32.g.p1.size() - 1;
                    r.this.j.removeCallbacks(r.this.M);
                    this.b = false;
                    return;
                }
                r.this.A += r.this.d;
                if (r.this.A > r.this.g.p1.get(r.this.K).f()) {
                    rVar = r.this;
                    f = rVar.g.p1.get(r.this.K).f();
                    rVar.A = f;
                }
            } else {
                if (r.this.g.p1.get(r.this.K).p() < 0.0f || r.this.A <= r.this.g.p1.get(r.this.K).p()) {
                    r.f(r.this);
                    if (r.this.K < r.this.g.p1.size()) {
                        rVar2 = r.this;
                        f2 = rVar2.g.p1.get(r.this.K).c().right;
                        rVar2.A = f2;
                    }
                    r rVar322 = r.this;
                    rVar322.K = rVar322.g.p1.size() - 1;
                    r.this.j.removeCallbacks(r.this.M);
                    this.b = false;
                    return;
                }
                r.this.A -= r.this.d;
                if (r.this.A < r.this.g.p1.get(r.this.K).p()) {
                    rVar = r.this;
                    f = rVar.g.p1.get(r.this.K).p();
                    rVar.A = f;
                }
            }
            r.this.j.postDelayed(r.this.M, 0L);
            r.this.invalidate();
            r.this.j.postDelayed(r.this.M, 0L);
        }
    }

    public r(Context context, yj yjVar, v0 v0Var, RelativeLayout relativeLayout, p0 p0Var, zj zjVar) {
        super(context);
        RectF rectF;
        this.b = 5.0d;
        this.c = 1;
        this.d = 20;
        this.e = 270.0f;
        this.j = new Handler();
        this.w = new Paint();
        this.x = new Paint();
        float f = 0.0f;
        this.A = 0.0f;
        this.C = new Paint();
        this.D = new Paint();
        this.F = 0.0f;
        this.K = 0;
        this.L = new a();
        this.M = new b();
        this.g = yjVar;
        if (!TextUtils.isEmpty(yjVar.S0)) {
            this.E = zjVar.a(this.g.S0, (Vector<yj>) null);
        }
        int k = this.g.k(v0Var.c.width());
        int c = this.g.c(v0Var.c.height());
        int f2 = this.g.f(v0Var.c.height());
        if (c == -3 && k > 0) {
            c = k;
        }
        if (f2 == -3 && k > 0) {
            f2 = k;
        }
        if (k == -3 && c > 0) {
            k = c;
        }
        k = k < 0 ? v0Var.c.width() - (this.g.d(v0Var.c.width()) + this.g.g(v0Var.c.width())) : k;
        yj yjVar2 = this.g;
        jj jjVar = yjVar2.M0;
        if (jjVar == null) {
            Vector<jj> vector = yjVar2.p1;
            if (vector == null || vector.size() <= 0) {
                return;
            }
            f2 = f2 <= 0 ? c < 0 ? this.g.p1.get(0).i() == 1 ? k : (int) this.g.p1.get(0).b(k) : c : f2;
            this.h = k;
            this.i = f2;
            relativeLayout.addView(this, new RelativeLayout.LayoutParams(k, f2));
            for (int i = 0; i < this.g.p1.size(); i++) {
                jj jjVar2 = this.g.p1.get(i);
                jjVar2.d(jjVar2.b(k));
                if (jjVar2.i() != 1) {
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    paint.setColor(jjVar2.n());
                    paint.setStyle(Paint.Style.FILL_AND_STROKE);
                    jjVar2.a(paint);
                    jjVar2.g((jjVar2.o() * this.h) / 100.0f);
                    jjVar2.c((jjVar2.e() * this.h) / 100.0f);
                    if (i == 0) {
                        f = (this.i - jjVar2.h()) / 2.0f;
                    } else if (i != 0) {
                        int i2 = i - 1;
                        if (this.g.p1.get(i2).h() > jjVar2.h()) {
                            f += (this.g.p1.get(i2).h() - jjVar2.h()) / 2.0f;
                        }
                    }
                    if (jjVar2.g() == 0) {
                        rectF = new RectF(jjVar2.p(), f, jjVar2.f(), jjVar2.h() + f);
                    } else {
                        float p = this.h - jjVar2.p();
                        if (i == 0) {
                            this.A = p;
                        }
                        jjVar2.g(((100.0f - jjVar2.e()) * this.h) / 100.0f);
                        rectF = new RectF(jjVar2.p(), f, p, jjVar2.h() + f);
                    }
                    jjVar2.a(rectF);
                }
            }
            this.j.removeCallbacks(this.M);
            this.j.postDelayed(this.M, 10L);
            return;
        }
        f2 = f2 <= 0 ? c < 0 ? jjVar.i() == 1 ? k : (int) (this.g.M0.b(k) > this.g.M0.a(k) ? this.g.M0.b(k) : this.g.M0.a(k)) : c : f2;
        this.h = k;
        this.i = f2;
        relativeLayout.addView(this, new RelativeLayout.LayoutParams(k, f2));
        if (this.g.M0.a() == 0) {
            this.j.removeCallbacks(this.L);
            this.j.postDelayed(this.L, 10L);
        }
        this.k = this.g.M0.i();
        this.l = this.g.M0.b(k);
        this.m = this.g.M0.a(k);
        this.n = this.g.M0.n();
        this.o = this.g.M0.l();
        this.p = this.g.M0.j();
        this.q = this.g.M0.g();
        this.r = this.g.M0.o();
        this.s = this.g.M0.e();
        float k2 = this.g.M0.k();
        this.t = k2;
        float f3 = (k2 * (this.s - this.r)) / 100.0f;
        this.f = f3;
        if (f3 > 0.0f && f3 < 0.014f) {
            this.f = 0.014f;
        }
        this.G = this.g.M0.m();
        float f4 = this.l;
        float f5 = this.m;
        f4 = f4 < f5 ? f5 : f4;
        this.I = Math.abs(this.s - this.r);
        int d = (int) ((this.g.M0.d() * (this.s - this.r)) / 100.0f);
        float f6 = this.f;
        float f7 = d;
        if (f6 > f7) {
            this.y = f7;
            double d2 = this.G;
            if (d2 > 0.0d && f6 > 0.0f) {
                double d3 = (f6 - f7) / 5.0f;
                Double.isNaN(d3);
                double d4 = d2 / d3;
                this.b = d4;
                this.b = x1.a(d4);
                if (x1.b(this.G)) {
                    this.b = Math.round(this.b);
                }
            }
        }
        if (this.k != 1) {
            this.B = (this.t * this.h) / 100.0f;
            this.C.setAntiAlias(true);
            this.C.setColor(this.n);
            this.C.setStyle(Paint.Style.FILL_AND_STROKE);
            this.D.setAntiAlias(true);
            this.D.setColor(this.o);
            this.D.setStyle(Paint.Style.FILL_AND_STROKE);
            if (this.l >= this.m) {
                this.u = new RectF(0.0f, 0.0f, this.h, this.l);
                float f8 = (this.l - this.m) / 2.0f;
                this.F = f8;
                this.A = f8;
                this.B -= f8;
            } else {
                float f9 = this.m;
                this.u = new RectF(0.0f, f9 / 2.0f, this.h, (f9 / 2.0f) + this.l);
            }
            if (this.q == 1) {
                int i3 = this.h;
                this.A = i3;
                this.J = ((100.0f - this.t) * i3) / 100.0f;
                return;
            }
            return;
        }
        if (this.q == 1) {
            float f10 = this.e;
            float f11 = (f10 - this.r) + f10;
            this.r = f11;
            this.r = f11 > 360.0f ? f11 % 360.0f : f11;
        }
        this.w.setAntiAlias(true);
        this.w.setColor(this.n);
        this.w.setStrokeWidth(this.l);
        this.w.setStyle(Paint.Style.STROKE);
        if (this.f > 0.0f) {
            this.x.setAntiAlias(true);
            this.x.setColor(this.o);
            this.x.setStrokeWidth(this.m);
            this.x.setStyle(Paint.Style.STROKE);
        }
        if (this.p == 0) {
            this.w.setStrokeCap(Paint.Cap.ROUND);
            this.x.setStrokeCap(Paint.Cap.ROUND);
        }
        float f12 = f4 / 2.0f;
        int i4 = this.c;
        int i5 = this.h;
        this.u = new RectF(i4 + f12, i4 + f12, i5 - (i4 + f12), i5 - (f12 + i4));
    }

    static /* synthetic */ int f(r rVar) {
        int i = rVar.K;
        rVar.K = i + 1;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        if (r9.p == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011a, code lost:
    
        r0 = r9.v;
        r1 = r9.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010c, code lost:
    
        r0 = r9.v;
        r1 = r9.m;
        r10.drawRoundRect(r0, r1 / 2.0f, r1 / 2.0f, r9.D);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010a, code lost:
    
        if (r9.p == 0) goto L57;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onDraw(android.graphics.Canvas r10) {
        /*
            Method dump skipped, instructions count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.r.onDraw(android.graphics.Canvas):void");
    }
}
