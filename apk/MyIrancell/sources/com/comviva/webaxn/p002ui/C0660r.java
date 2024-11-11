package com.comviva.webaxn.p002ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import com.comviva.webaxn.utils.C0755x1;
import java.util.Vector;
import p000.C2817jj;
import p000.C3489yj;
import p000.C3531zj;

/* renamed from: com.comviva.webaxn.ui.r */
/* loaded from: classes.dex */
public class C0660r extends View {

    /* renamed from: A */
    private float f4261A;

    /* renamed from: B */
    private float f4262B;

    /* renamed from: C */
    private Paint f4263C;

    /* renamed from: D */
    private Paint f4264D;

    /* renamed from: E */
    C3489yj f4265E;

    /* renamed from: F */
    float f4266F;

    /* renamed from: G */
    private double f4267G;

    /* renamed from: H */
    private String f4268H;

    /* renamed from: I */
    private float f4269I;

    /* renamed from: J */
    private float f4270J;

    /* renamed from: K */
    private int f4271K;

    /* renamed from: L */
    Runnable f4272L;

    /* renamed from: M */
    Runnable f4273M;

    /* renamed from: b */
    private double f4274b;

    /* renamed from: c */
    private int f4275c;

    /* renamed from: d */
    private int f4276d;

    /* renamed from: e */
    private float f4277e;

    /* renamed from: f */
    private float f4278f;

    /* renamed from: g */
    private C3489yj f4279g;

    /* renamed from: h */
    private int f4280h;

    /* renamed from: i */
    private int f4281i;

    /* renamed from: j */
    private Handler f4282j;

    /* renamed from: k */
    private int f4283k;

    /* renamed from: l */
    private float f4284l;

    /* renamed from: m */
    private float f4285m;

    /* renamed from: n */
    private int f4286n;

    /* renamed from: o */
    private int f4287o;

    /* renamed from: p */
    private int f4288p;

    /* renamed from: q */
    private int f4289q;

    /* renamed from: r */
    private float f4290r;

    /* renamed from: s */
    private float f4291s;

    /* renamed from: t */
    private float f4292t;

    /* renamed from: u */
    private RectF f4293u;

    /* renamed from: v */
    private RectF f4294v;

    /* renamed from: w */
    private Paint f4295w;

    /* renamed from: x */
    private Paint f4296x;

    /* renamed from: y */
    private float f4297y;

    /* renamed from: z */
    private double f4298z;

    /* renamed from: com.comviva.webaxn.ui.r$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0660r c0660r;
            float f;
            if (C0660r.this.f4283k == 1) {
                if (C0660r.this.f4297y < C0660r.this.f4278f) {
                    C0660r.this.f4297y += 5.0f;
                    C0660r.this.f4298z += C0660r.this.f4274b;
                    if (C0660r.this.f4267G > 0.0d && C0660r.this.f4298z > C0660r.this.f4267G) {
                        C0660r c0660r2 = C0660r.this;
                        c0660r2.f4298z = c0660r2.f4267G;
                    }
                    if (C0660r.this.f4297y > C0660r.this.f4278f) {
                        C0660r c0660r3 = C0660r.this;
                        c0660r3.f4297y = c0660r3.f4278f;
                        C0660r c0660r4 = C0660r.this;
                        c0660r4.f4298z = c0660r4.f4267G;
                    }
                    C0660r c0660r5 = C0660r.this;
                    c0660r5.f4298z = C0755x1.m6111a(c0660r5.f4298z);
                    C0660r.this.invalidate();
                    C0660r.this.f4282j.postDelayed(C0660r.this.f4272L, 0L);
                }
                C0660r.this.f4282j.removeCallbacks(C0660r.this.f4272L);
                return;
            }
            if (C0660r.this.f4289q == 1) {
                if (C0660r.this.f4262B > 0.0f && C0660r.this.f4261A > C0660r.this.f4270J) {
                    C0660r.this.f4261A -= C0660r.this.f4276d;
                    if (C0660r.this.f4261A < C0660r.this.f4270J) {
                        c0660r = C0660r.this;
                        f = c0660r.f4270J;
                        c0660r.f4261A = f;
                    }
                }
                C0660r.this.f4282j.removeCallbacks(C0660r.this.f4272L);
                return;
            }
            if (C0660r.this.f4262B > 0.0f && C0660r.this.f4261A < C0660r.this.f4262B) {
                C0660r.this.f4261A += C0660r.this.f4276d;
                if (C0660r.this.f4261A > C0660r.this.f4262B) {
                    c0660r = C0660r.this;
                    f = c0660r.f4262B;
                    c0660r.f4261A = f;
                }
            }
            C0660r.this.f4282j.removeCallbacks(C0660r.this.f4272L);
            return;
            C0660r.this.invalidate();
            C0660r.this.f4282j.postDelayed(C0660r.this.f4272L, 0L);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.r$b */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: b */
        boolean f4300b = false;

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0660r c0660r;
            float f;
            C0660r c0660r2;
            float f2;
            if (C0660r.this.f4279g.f14243p1.get(C0660r.this.f4271K).m13492i() == 1) {
                return;
            }
            if (C0660r.this.f4279g.f14243p1.get(C0660r.this.f4271K).m13465a() != 0) {
                if (this.f4300b) {
                    this.f4300b = false;
                } else {
                    C0660r.m4915f(C0660r.this);
                }
                if (C0660r.this.f4271K < C0660r.this.f4279g.f14243p1.size()) {
                    if (C0660r.this.f4279g.f14243p1.get(C0660r.this.f4271K).m13488g() == 0) {
                        c0660r = C0660r.this;
                        f = c0660r.f4279g.f14243p1.get(C0660r.this.f4271K).m13499p();
                    } else {
                        c0660r = C0660r.this;
                        f = c0660r.f4279g.f14243p1.get(C0660r.this.f4271K).m13476c().right;
                    }
                    c0660r.f4261A = f;
                }
                C0660r c0660r3 = C0660r.this;
                c0660r3.f4271K = c0660r3.f4279g.f14243p1.size() - 1;
                C0660r.this.f4282j.removeCallbacks(C0660r.this.f4273M);
                this.f4300b = false;
                return;
            }
            this.f4300b = true;
            if (C0660r.this.f4279g.f14243p1.get(C0660r.this.f4271K).m13488g() == 0) {
                if (C0660r.this.f4279g.f14243p1.get(C0660r.this.f4271K).m13485f() <= 0.0f || C0660r.this.f4261A >= C0660r.this.f4279g.f14243p1.get(C0660r.this.f4271K).m13485f()) {
                    C0660r.m4915f(C0660r.this);
                    if (C0660r.this.f4271K < C0660r.this.f4279g.f14243p1.size()) {
                        c0660r2 = C0660r.this;
                        f2 = c0660r2.f4279g.f14243p1.get(C0660r.this.f4271K).m13499p();
                        c0660r2.f4261A = f2;
                    }
                    C0660r c0660r32 = C0660r.this;
                    c0660r32.f4271K = c0660r32.f4279g.f14243p1.size() - 1;
                    C0660r.this.f4282j.removeCallbacks(C0660r.this.f4273M);
                    this.f4300b = false;
                    return;
                }
                C0660r.this.f4261A += C0660r.this.f4276d;
                if (C0660r.this.f4261A > C0660r.this.f4279g.f14243p1.get(C0660r.this.f4271K).m13485f()) {
                    c0660r = C0660r.this;
                    f = c0660r.f4279g.f14243p1.get(C0660r.this.f4271K).m13485f();
                    c0660r.f4261A = f;
                }
            } else {
                if (C0660r.this.f4279g.f14243p1.get(C0660r.this.f4271K).m13499p() < 0.0f || C0660r.this.f4261A <= C0660r.this.f4279g.f14243p1.get(C0660r.this.f4271K).m13499p()) {
                    C0660r.m4915f(C0660r.this);
                    if (C0660r.this.f4271K < C0660r.this.f4279g.f14243p1.size()) {
                        c0660r2 = C0660r.this;
                        f2 = c0660r2.f4279g.f14243p1.get(C0660r.this.f4271K).m13476c().right;
                        c0660r2.f4261A = f2;
                    }
                    C0660r c0660r322 = C0660r.this;
                    c0660r322.f4271K = c0660r322.f4279g.f14243p1.size() - 1;
                    C0660r.this.f4282j.removeCallbacks(C0660r.this.f4273M);
                    this.f4300b = false;
                    return;
                }
                C0660r.this.f4261A -= C0660r.this.f4276d;
                if (C0660r.this.f4261A < C0660r.this.f4279g.f14243p1.get(C0660r.this.f4271K).m13499p()) {
                    c0660r = C0660r.this;
                    f = c0660r.f4279g.f14243p1.get(C0660r.this.f4271K).m13499p();
                    c0660r.f4261A = f;
                }
            }
            C0660r.this.f4282j.postDelayed(C0660r.this.f4273M, 0L);
            C0660r.this.invalidate();
            C0660r.this.f4282j.postDelayed(C0660r.this.f4273M, 0L);
        }
    }

    public C0660r(Context context, C3489yj c3489yj, C0669v0 c0669v0, RelativeLayout relativeLayout, C0657p0 c0657p0, C3531zj c3531zj) {
        super(context);
        RectF rectF;
        this.f4274b = 5.0d;
        this.f4275c = 1;
        this.f4276d = 20;
        this.f4277e = 270.0f;
        this.f4282j = new Handler();
        this.f4295w = new Paint();
        this.f4296x = new Paint();
        float f = 0.0f;
        this.f4261A = 0.0f;
        this.f4263C = new Paint();
        this.f4264D = new Paint();
        this.f4266F = 0.0f;
        this.f4271K = 0;
        this.f4272L = new a();
        this.f4273M = new b();
        this.f4279g = c3489yj;
        if (!TextUtils.isEmpty(c3489yj.f14181S0)) {
            this.f4265E = c3531zj.m16930a(this.f4279g.f14181S0, (Vector<C3489yj>) null);
        }
        int m16645k = this.f4279g.m16645k(c0669v0.f4397c.width());
        int m16637c = this.f4279g.m16637c(c0669v0.f4397c.height());
        int m16640f = this.f4279g.m16640f(c0669v0.f4397c.height());
        if (m16637c == -3 && m16645k > 0) {
            m16637c = m16645k;
        }
        if (m16640f == -3 && m16645k > 0) {
            m16640f = m16645k;
        }
        if (m16645k == -3 && m16637c > 0) {
            m16645k = m16637c;
        }
        m16645k = m16645k < 0 ? c0669v0.f4397c.width() - (this.f4279g.m16638d(c0669v0.f4397c.width()) + this.f4279g.m16641g(c0669v0.f4397c.width())) : m16645k;
        C3489yj c3489yj2 = this.f4279g;
        C2817jj c2817jj = c3489yj2.f14169M0;
        if (c2817jj == null) {
            Vector<C2817jj> vector = c3489yj2.f14243p1;
            if (vector == null || vector.size() <= 0) {
                return;
            }
            m16640f = m16640f <= 0 ? m16637c < 0 ? this.f4279g.f14243p1.get(0).m13492i() == 1 ? m16645k : (int) this.f4279g.f14243p1.get(0).m13472b(m16645k) : m16637c : m16640f;
            this.f4280h = m16645k;
            this.f4281i = m16640f;
            relativeLayout.addView(this, new RelativeLayout.LayoutParams(m16645k, m16640f));
            for (int i = 0; i < this.f4279g.f14243p1.size(); i++) {
                C2817jj c2817jj2 = this.f4279g.f14243p1.get(i);
                c2817jj2.m13480d(c2817jj2.m13472b(m16645k));
                if (c2817jj2.m13492i() != 1) {
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    paint.setColor(c2817jj2.m13497n());
                    paint.setStyle(Paint.Style.FILL_AND_STROKE);
                    c2817jj2.m13469a(paint);
                    c2817jj2.m13489g((c2817jj2.m13498o() * this.f4280h) / 100.0f);
                    c2817jj2.m13477c((c2817jj2.m13482e() * this.f4280h) / 100.0f);
                    if (i == 0) {
                        f = (this.f4281i - c2817jj2.m13491h()) / 2.0f;
                    } else if (i != 0) {
                        int i2 = i - 1;
                        if (this.f4279g.f14243p1.get(i2).m13491h() > c2817jj2.m13491h()) {
                            f += (this.f4279g.f14243p1.get(i2).m13491h() - c2817jj2.m13491h()) / 2.0f;
                        }
                    }
                    if (c2817jj2.m13488g() == 0) {
                        rectF = new RectF(c2817jj2.m13499p(), f, c2817jj2.m13485f(), c2817jj2.m13491h() + f);
                    } else {
                        float m13499p = this.f4280h - c2817jj2.m13499p();
                        if (i == 0) {
                            this.f4261A = m13499p;
                        }
                        c2817jj2.m13489g(((100.0f - c2817jj2.m13482e()) * this.f4280h) / 100.0f);
                        rectF = new RectF(c2817jj2.m13499p(), f, m13499p, c2817jj2.m13491h() + f);
                    }
                    c2817jj2.m13470a(rectF);
                }
            }
            this.f4282j.removeCallbacks(this.f4273M);
            this.f4282j.postDelayed(this.f4273M, 10L);
            return;
        }
        m16640f = m16640f <= 0 ? m16637c < 0 ? c2817jj.m13492i() == 1 ? m16645k : (int) (this.f4279g.f14169M0.m13472b(m16645k) > this.f4279g.f14169M0.m13464a(m16645k) ? this.f4279g.f14169M0.m13472b(m16645k) : this.f4279g.f14169M0.m13464a(m16645k)) : m16637c : m16640f;
        this.f4280h = m16645k;
        this.f4281i = m16640f;
        relativeLayout.addView(this, new RelativeLayout.LayoutParams(m16645k, m16640f));
        if (this.f4279g.f14169M0.m13465a() == 0) {
            this.f4282j.removeCallbacks(this.f4272L);
            this.f4282j.postDelayed(this.f4272L, 10L);
        }
        this.f4283k = this.f4279g.f14169M0.m13492i();
        this.f4284l = this.f4279g.f14169M0.m13472b(m16645k);
        this.f4285m = this.f4279g.f14169M0.m13464a(m16645k);
        this.f4286n = this.f4279g.f14169M0.m13497n();
        this.f4287o = this.f4279g.f14169M0.m13495l();
        this.f4288p = this.f4279g.f14169M0.m13493j();
        this.f4289q = this.f4279g.f14169M0.m13488g();
        this.f4290r = this.f4279g.f14169M0.m13498o();
        this.f4291s = this.f4279g.f14169M0.m13482e();
        float m13494k = this.f4279g.f14169M0.m13494k();
        this.f4292t = m13494k;
        float f2 = (m13494k * (this.f4291s - this.f4290r)) / 100.0f;
        this.f4278f = f2;
        if (f2 > 0.0f && f2 < 0.014f) {
            this.f4278f = 0.014f;
        }
        this.f4267G = this.f4279g.f14169M0.m13496m();
        float f3 = this.f4284l;
        float f4 = this.f4285m;
        f3 = f3 < f4 ? f4 : f3;
        this.f4269I = Math.abs(this.f4291s - this.f4290r);
        int m13479d = (int) ((this.f4279g.f14169M0.m13479d() * (this.f4291s - this.f4290r)) / 100.0f);
        float f5 = this.f4278f;
        float f6 = m13479d;
        if (f5 > f6) {
            this.f4297y = f6;
            double d = this.f4267G;
            if (d > 0.0d && f5 > 0.0f) {
                double d2 = (f5 - f6) / 5.0f;
                Double.isNaN(d2);
                double d3 = d / d2;
                this.f4274b = d3;
                this.f4274b = C0755x1.m6111a(d3);
                if (C0755x1.m6173b(this.f4267G)) {
                    this.f4274b = Math.round(this.f4274b);
                }
            }
        }
        if (this.f4283k != 1) {
            this.f4262B = (this.f4292t * this.f4280h) / 100.0f;
            this.f4263C.setAntiAlias(true);
            this.f4263C.setColor(this.f4286n);
            this.f4263C.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f4264D.setAntiAlias(true);
            this.f4264D.setColor(this.f4287o);
            this.f4264D.setStyle(Paint.Style.FILL_AND_STROKE);
            if (this.f4284l >= this.f4285m) {
                this.f4293u = new RectF(0.0f, 0.0f, this.f4280h, this.f4284l);
                float f7 = (this.f4284l - this.f4285m) / 2.0f;
                this.f4266F = f7;
                this.f4261A = f7;
                this.f4262B -= f7;
            } else {
                float f8 = this.f4285m;
                this.f4293u = new RectF(0.0f, f8 / 2.0f, this.f4280h, (f8 / 2.0f) + this.f4284l);
            }
            if (this.f4289q == 1) {
                int i3 = this.f4280h;
                this.f4261A = i3;
                this.f4270J = ((100.0f - this.f4292t) * i3) / 100.0f;
                return;
            }
            return;
        }
        if (this.f4289q == 1) {
            float f9 = this.f4277e;
            float f10 = (f9 - this.f4290r) + f9;
            this.f4290r = f10;
            this.f4290r = f10 > 360.0f ? f10 % 360.0f : f10;
        }
        this.f4295w.setAntiAlias(true);
        this.f4295w.setColor(this.f4286n);
        this.f4295w.setStrokeWidth(this.f4284l);
        this.f4295w.setStyle(Paint.Style.STROKE);
        if (this.f4278f > 0.0f) {
            this.f4296x.setAntiAlias(true);
            this.f4296x.setColor(this.f4287o);
            this.f4296x.setStrokeWidth(this.f4285m);
            this.f4296x.setStyle(Paint.Style.STROKE);
        }
        if (this.f4288p == 0) {
            this.f4295w.setStrokeCap(Paint.Cap.ROUND);
            this.f4296x.setStrokeCap(Paint.Cap.ROUND);
        }
        float f11 = f3 / 2.0f;
        int i4 = this.f4275c;
        int i5 = this.f4280h;
        this.f4293u = new RectF(i4 + f11, i4 + f11, i5 - (i4 + f11), i5 - (f11 + i4));
    }

    /* renamed from: f */
    static /* synthetic */ int m4915f(C0660r c0660r) {
        int i = c0660r.f4271K;
        c0660r.f4271K = i + 1;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        if (r9.f4288p == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011a, code lost:
    
        r0 = r9.f4294v;
        r1 = r9.f4264D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010c, code lost:
    
        r0 = r9.f4294v;
        r1 = r9.f4285m;
        r10.drawRoundRect(r0, r1 / 2.0f, r1 / 2.0f, r9.f4264D);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010a, code lost:
    
        if (r9.f4288p == 0) goto L57;
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
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0660r.onDraw(android.graphics.Canvas):void");
    }
}
