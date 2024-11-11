package com.comviva.webaxn.p002ui;

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
import com.comviva.webaxn.utils.C0687b;
import com.comviva.webaxn.utils.C0731p1;
import com.comviva.webaxn.utils.C0744u;
import java.util.ArrayList;
import java.util.Vector;
import p000.C0023aj;
import p000.C2391dj;
import p000.C2434ej;
import p000.C3107q2;
import p000.C3264tj;
import p000.C3361vj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.l0 */
/* loaded from: classes.dex */
public class C0645l0 extends AbstractC0652n1 {

    /* renamed from: H */
    private static int f3967H;

    /* renamed from: A */
    private AbsoluteLayout f3968A;

    /* renamed from: B */
    private C0639j0 f3969B;

    /* renamed from: C */
    public C0669v0 f3970C;

    /* renamed from: D */
    private C3489yj f3971D;

    /* renamed from: E */
    private C0655o1 f3972E;

    /* renamed from: F */
    private int f3973F;

    /* renamed from: G */
    public View.OnClickListener f3974G;

    /* renamed from: x */
    private LinearLayout f3975x;

    /* renamed from: y */
    private b f3976y;

    /* renamed from: z */
    private ScrollView f3977z;

    /* renamed from: com.comviva.webaxn.ui.l0$a */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!TextUtils.isEmpty(C0645l0.this.f3971D.f14258u1)) {
                C0645l0 c0645l0 = C0645l0.this;
                c0645l0.m4707a(c0645l0.f3971D.f14258u1);
            }
            C0645l0 c0645l02 = C0645l0.this;
            c0645l02.f4049g.mo4849b(c0645l02);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.l0$b */
    /* loaded from: classes.dex */
    public class b extends HorizontalScrollView {

        /* renamed from: b */
        private float f3979b;

        /* renamed from: c */
        private float f3980c;

        /* renamed from: d */
        private float f3981d;

        /* renamed from: e */
        private float f3982e;

        public b(C0645l0 c0645l0, Context context) {
            super(context);
            m4666a(context);
        }

        /* renamed from: a */
        void m4666a(Context context) {
            setHorizontalFadingEdgeEnabled(false);
            setVerticalFadingEdgeEnabled(false);
            setHorizontalScrollBarEnabled(false);
        }

        @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.f3980c = 0.0f;
                this.f3979b = 0.0f;
                this.f3981d = motionEvent.getX();
                this.f3982e = motionEvent.getY();
            } else if (action == 1) {
                getParent().requestDisallowInterceptTouchEvent(false);
            } else if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f3979b += Math.abs(x - this.f3981d);
                float abs = this.f3980c + Math.abs(y - this.f3982e);
                this.f3980c = abs;
                this.f3981d = x;
                this.f3982e = y;
                if (abs > this.f3979b) {
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
                float r4 = r6.f3979b
                float r5 = r6.f3981d
                float r5 = r0 - r5
                float r5 = java.lang.Math.abs(r5)
                float r4 = r4 + r5
                r6.f3979b = r4
                float r4 = r6.f3980c
                float r5 = r6.f3982e
                float r5 = r3 - r5
                float r5 = java.lang.Math.abs(r5)
                float r4 = r4 + r5
                r6.f3980c = r4
                r6.f3981d = r0
                r6.f3982e = r3
                float r0 = r6.f3979b
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
                r6.f3980c = r0
                r6.f3979b = r0
                float r0 = r7.getX()
                r6.f3981d = r0
                float r0 = r7.getY()
                r6.f3982e = r0
            L6d:
                boolean r7 = super.onTouchEvent(r7)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0645l0.b.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public C0645l0(Context context, C3489yj c3489yj, C0655o1 c0655o1, C0639j0 c0639j0, C0669v0 c0669v0) {
        super(context);
        this.f3974G = new a();
        this.f3971D = c3489yj;
        this.f3972E = c0655o1;
        f3967H = 70;
        float f = c3489yj.f14196a;
        if (f > 0.0f) {
            f3967H = (int) (f * 70.0f);
        }
        C2434ej c2434ej = this.f3971D.f14173O0;
        if (c2434ej != null) {
            c2434ej.m11615a(c0639j0.f3869f);
        }
        this.f3975x = new LinearLayout(this.f4045c);
        if (!TextUtils.isEmpty(this.f3971D.f14249r1)) {
            this.f3975x.setContentDescription(this.f3971D.f14249r1);
        }
        C3361vj c3361vj = this.f3971D.f14246q1;
        if (c3361vj != null) {
            C3107q2.m14884a(this.f3975x, c3361vj.m16034a());
        }
        this.f3975x.setOrientation(0);
        this.f3968A = new AbsoluteLayout(this.f4045c);
        b bVar = new b(this, this.f4045c);
        this.f3976y = bVar;
        bVar.setSmoothScrollingEnabled(true);
        this.f3975x.addView(this.f3968A);
        C0639j0 c0639j02 = new C0639j0(context);
        this.f3969B = c0639j02;
        c0639j02.f3875l = c0639j0;
        if (c0639j0 != null) {
            c0639j0.f3878o.add(c0639j02);
            c0669v0.f4407m = this.f3969B;
        }
        m4655b(this.f3969B, c0669v0);
        if (this.f3969B.f3870g > 0) {
            C0654o0 c0654o0 = new C0654o0(this.f4045c);
            this.f3977z = c0654o0;
            c0654o0.setVerticalScrollBarEnabled(false);
            this.f3977z.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f3977z.setFillViewport(true);
            this.f3976y.addView(this.f3977z);
            this.f3977z.addView(this.f3975x);
        } else {
            this.f3976y.addView(this.f3975x);
        }
        this.f4050h = AbstractC0652n1.m4701d(this.f4050h);
    }

    /* renamed from: a */
    private void m4637a(C3489yj c3489yj, AbsoluteLayout absoluteLayout, C0639j0 c0639j0) {
        C0620d c0620d = new C0620d(this.f4045c, c3489yj.f14235n, c3489yj, c0639j0);
        c0620d.m4706a(this.f3968A);
        c3489yj.f14197a0 = c0620d;
        c0620d.m4204c(c3489yj);
        c0620d.m4202b(c3489yj.f14241p.m6067f());
        c0620d.m4205g(c3489yj.f14241p.m6068g());
        c0620d.m4200a(c3489yj.f14241p.m6064d());
        Vector<C3264tj> vector = c3489yj.f14166L;
        c0620d.m4199a(c0639j0.f3868e <= 0 ? new AbsoluteLayout.LayoutParams(-2, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d) : new AbsoluteLayout.LayoutParams(c0639j0.f3868e, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d), this.f3970C);
        c0620d.mo4595a(this.f4049g);
        c0620d.m4203b(c3489yj);
        c0620d.m4207n();
        c0620d.mo4201a(new C0657p0(c3489yj.m16639e(c0639j0.f3868e), c3489yj.m16644j(c0639j0.f3868e), c3489yj.m16642h(c0639j0.f3868e), c3489yj.m16635b(c0639j0.f3868e), C0687b.m5342a(this.f4045c).m5343a().m5544a()));
        c0639j0.f3868e = c0620d.mo4152j();
        c0639j0.f3869f = c0620d.mo4151i();
        c0639j0.f3877n = c0620d;
        c0620d.m4206m();
    }

    /* renamed from: b */
    private void m4638b(C3489yj c3489yj) {
        if (c3489yj.f14208e == 3) {
            AbstractC0652n1 abstractC0652n1 = c3489yj.f14197a0;
            if (abstractC0652n1 == null) {
                return;
            }
            if (((C0670w) abstractC0652n1).m5100p()) {
                if (c3489yj.f14240o1) {
                    c3489yj.f14240o1 = false;
                }
                this.f3972E.m4790a(c3489yj);
                return;
            } else if (!c3489yj.f14240o1) {
                return;
            }
        } else if (!c3489yj.f14240o1) {
            return;
        }
        this.f3972E.m4810d(c3489yj);
    }

    /* renamed from: b */
    private void m4639b(C3489yj c3489yj, AbsoluteLayout absoluteLayout, C0639j0 c0639j0) {
        C0629g c0629g = new C0629g(this.f4045c, c3489yj, c0639j0);
        c0629g.m4706a(this.f3968A);
        c3489yj.f14197a0 = c0629g;
        c0629g.m4360b(c3489yj);
        c0629g.m4358a(new AbsoluteLayout.LayoutParams(c0639j0.f3868e, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d), this.f3970C);
        c0629g.mo4595a(this.f4049g);
        c0629g.m4361m();
        c0629g.mo4201a(new C0657p0(c3489yj.m16639e(c0639j0.f3868e), c3489yj.m16644j(c0639j0.f3868e), c3489yj.m16642h(c0639j0.f3868e), c3489yj.m16635b(c0639j0.f3868e), C0687b.m5342a(this.f4045c).m5343a().m5544a()));
        c0639j0.f3868e = c0629g.mo4152j();
        c0639j0.f3869f = c0629g.mo4151i();
        c0639j0.f3877n = c0629g;
    }

    /* renamed from: c */
    private void m4640c(C3489yj c3489yj, AbsoluteLayout absoluteLayout, C0639j0 c0639j0) {
        int i = c3489yj.f14178R;
        if (i == 2) {
            C0635i c0635i = new C0635i(this.f4045c, null, c3489yj, c0639j0, this.f3970C, this.f3972E);
            c0635i.mo4595a(this.f4049g);
            c0635i.m4706a(this.f3968A);
            c3489yj.f14197a0 = c0635i;
            c0635i.m4468b(c3489yj);
            c0639j0.f3877n = c0635i;
            c0635i.mo4201a(new C0657p0(c3489yj.m16639e(c0639j0.f3868e), c3489yj.m16644j(c0639j0.f3868e), c3489yj.m16642h(c0639j0.f3868e), c3489yj.m16635b(c0639j0.f3868e), C0687b.m5342a(this.f4045c).m5343a().m5544a()));
            if (c0639j0.f3868e <= 0) {
                c0635i.m4469c(new AbsoluteLayout.LayoutParams(-2, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d));
            } else {
                c0635i.m4469c(new AbsoluteLayout.LayoutParams(c0639j0.f3868e, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d));
            }
            c0635i.m4478t();
            c0635i.m4466a(c3489yj.f14260v0);
            c0639j0.f3868e = c0635i.mo4152j();
            c0639j0.f3869f = c0635i.mo4151i();
            c0635i.m4476r();
            return;
        }
        if (i == 4 || i == 3) {
            C0665t0 c0665t0 = new C0665t0(this.f4045c, null, c3489yj, c0639j0);
            c0665t0.mo4595a(this.f4049g);
            c0665t0.m4706a(this.f3968A);
            c3489yj.f14197a0 = c0665t0;
            c0665t0.m4975b(c3489yj);
            c0639j0.f3877n = c0665t0;
            c0665t0.mo4201a(new C0657p0(c3489yj.m16639e(c0639j0.f3868e), c3489yj.m16644j(c0639j0.f3868e), c3489yj.m16642h(c0639j0.f3868e), c3489yj.m16635b(c0639j0.f3868e), C0687b.m5342a(this.f4045c).m5343a().m5544a()));
            if (c0639j0.f3868e <= 0) {
                c0665t0.m4976c(new AbsoluteLayout.LayoutParams(this.f3970C.f4397c.width() - (c3489yj.m16639e(c0639j0.f3868e) + c3489yj.m16642h(c0639j0.f3868e)), c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d));
            } else {
                c0665t0.m4976c(new AbsoluteLayout.LayoutParams(c0639j0.f3868e, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d));
            }
            c0665t0.m4986s();
            c0665t0.m4973a(c3489yj.f14260v0);
            c0639j0.f3868e = c0665t0.mo4152j();
            c0639j0.f3869f = c0665t0.mo4151i();
            c0665t0.m4984q();
            return;
        }
        if (i == 1) {
            C0644l c0644l = new C0644l(this.f4045c, c3489yj, c0639j0);
            c0644l.mo4595a(this.f4049g);
            c0644l.m4706a(this.f3968A);
            for (int i2 = 0; i2 < c3489yj.f14174P.size(); i2++) {
                c0644l.m4623b(c3489yj.f14174P.elementAt(i2).f11756a);
            }
            c3489yj.f14197a0 = c0644l;
            c0644l.m4624b(c3489yj);
            c0639j0.f3877n = c0644l;
            c0644l.mo4201a(new C0657p0(c3489yj.m16639e(c0639j0.f3868e), c3489yj.m16644j(c0639j0.f3868e), c3489yj.m16642h(c0639j0.f3868e), c3489yj.m16635b(c0639j0.f3868e), C0687b.m5342a(this.f4045c).m5343a().m5544a()));
            if (c0639j0.f3868e <= 0) {
                c0644l.m4625c(new AbsoluteLayout.LayoutParams(-2, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d));
            } else {
                c0644l.m4625c(new AbsoluteLayout.LayoutParams(c0639j0.f3868e, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d));
            }
            c0644l.m4635q();
            c0644l.m4622a(c3489yj.f14260v0);
            String m200h = C0023aj.m160a(this.f4045c).m200h(c3489yj.f14186V);
            if (!TextUtils.isEmpty(c3489yj.f14176Q)) {
                m200h = C0023aj.m160a(this.f4045c).m200h(c3489yj.f14176Q);
            }
            int[] iArr = c3489yj.f14184U;
            if (iArr != null && iArr.length > 0) {
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

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0067, code lost:
    
        if (r0 != null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0067  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m4641c(p000.C3489yj r11, com.comviva.webaxn.p002ui.C0639j0 r12) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0645l0.m4641c(yj, com.comviva.webaxn.ui.j0):void");
    }

    /* renamed from: d */
    private void m4642d(C3489yj c3489yj, AbsoluteLayout absoluteLayout, C0639j0 c0639j0) {
        C0658q c0658q = new C0658q(this.f4045c, null, c3489yj, c0639j0, this.f3972E);
        c0658q.m4706a(this.f3968A);
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

    /* renamed from: e */
    private int m4643e(C0639j0 c0639j0) {
        int size = c0639j0.f3878o.size();
        if (size > 0) {
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                int m4643e = m4643e(c0639j0.f3878o.elementAt(i2));
                if (-1 != m4643e) {
                    if (i < m4643e) {
                        i = m4643e;
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

    /* renamed from: e */
    private void m4644e(C3489yj c3489yj, AbsoluteLayout absoluteLayout, C0639j0 c0639j0) {
        C0664t c0664t = new C0664t(this.f4045c, c3489yj, c0639j0);
        c0664t.m4706a(this.f3968A);
        c3489yj.f14197a0 = c0664t;
        c0664t.mo4595a(this.f4049g);
        c0664t.m4969a(C0731p1.f5073b);
        c0664t.m4971n();
        c0664t.mo4201a(new C0657p0(c3489yj.m16639e(c0639j0.f3868e), c3489yj.m16644j(c0639j0.f3868e), c3489yj.m16642h(c0639j0.f3868e), c3489yj.m16635b(c0639j0.f3868e), C0687b.m5342a(this.f4045c).m5343a().m5544a()));
        c0639j0.f3868e = c0664t.mo4152j();
        c0639j0.f3869f = c0664t.mo4151i();
        c0639j0.f3877n = c0664t;
    }

    /* renamed from: f */
    private void m4645f(C3489yj c3489yj, AbsoluteLayout absoluteLayout, C0639j0 c0639j0) {
        String str;
        C0670w c0670w = new C0670w(this.f4045c, c0639j0, this.f3972E);
        c0670w.mo4595a(this.f4049g);
        int m5070a = c0670w.m5070a(c3489yj.f14178R, c3489yj.f14164K, c3489yj.f14229l);
        C0744u c0744u = c3489yj.f14241p;
        if (c0744u != null) {
            if (c0744u.m6072k()) {
                c0670w.mo4176b(c3489yj.f14241p.m6062c());
            }
            c0670w.m5083b(c3489yj.f14241p.m6067f());
            c0670w.m5094i(c3489yj.f14241p.m6068g());
            c0670w.m5071a(c3489yj.f14241p.m6064d());
        }
        if (c3489yj.f14165K0 != 0) {
            c0670w.mo4176b(0);
            c0670w.m5080a(false);
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
            c0670w.m5093h(m200h);
        }
        if (true == c0639j0.f3881r) {
            c0670w.m5098n();
        }
        C0744u c0744u2 = c3489yj.f14241p;
        if (c0744u2 != null) {
            if (c0744u2.m6072k()) {
                c0670w.mo4176b(c3489yj.f14241p.m6062c());
            }
            if (c3489yj.f14241p.m6071j()) {
                c0670w.mo4314a(c3489yj.f14241p.m6057b());
            }
        }
        c0670w.m5078a(c3489yj.f14247r);
        c0670w.m4706a((ViewGroup) this.f3968A);
        c3489yj.f14197a0 = c0670w;
        c0639j0.f3877n = c0670w;
        c0670w.m5084b(c3489yj);
        c0670w.m5085c(c0639j0.f3868e <= 0 ? new AbsoluteLayout.LayoutParams(-2, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d) : new AbsoluteLayout.LayoutParams(c0639j0.f3868e, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d));
        c0670w.m5106v();
        c0670w.mo4201a(new C0657p0(c3489yj.m16639e(c0639j0.f3868e), c3489yj.m16644j(c0639j0.f3868e), c3489yj.m16642h(c0639j0.f3868e), c3489yj.m16635b(c0639j0.f3868e), C0687b.m5342a(this.f4045c).m5343a().m5544a()));
        int i = c3489yj.f14180S;
        if (i > 0) {
            c0670w.m5096j(i);
        }
        c0670w.m5081a(c3489yj.f14260v0);
        c0639j0.f3868e = c0670w.mo4152j();
        c0639j0.f3869f = c0670w.mo4151i();
        c0670w.m5102r();
    }

    /* renamed from: g */
    private void m4646g(C3489yj c3489yj, AbsoluteLayout absoluteLayout, C0639j0 c0639j0) {
        AbsoluteLayout.LayoutParams layoutParams;
        C0669v0 c0669v0;
        C0627f0 c0627f0 = new C0627f0(this.f4045c, c3489yj, c0639j0);
        c0627f0.m4706a(this.f3968A);
        c3489yj.f14197a0 = c0627f0;
        c0627f0.m4320b(c3489yj);
        C0744u c0744u = c3489yj.f14241p;
        if (c0744u != null) {
            c0627f0.m4318b(c0744u.m6067f());
            c0627f0.m4313a(c3489yj.f14241p.m6064d());
        }
        if (c0639j0.f3868e <= 0) {
            layoutParams = new AbsoluteLayout.LayoutParams(-2, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d);
            c0669v0 = this.f3970C;
        } else {
            layoutParams = new AbsoluteLayout.LayoutParams(c0639j0.f3868e, c0639j0.f3869f, c0639j0.f3866c, c0639j0.f3867d);
            c0669v0 = null;
        }
        c0627f0.m4312a(layoutParams, c0669v0);
        c0627f0.mo4595a(this.f4049g);
        if (c3489yj.f14260v0 != null || c3489yj.f14172O != null || c3489yj.f14248r0 != null) {
            c0627f0.m4317a(c3489yj.f14260v0);
        }
        c0627f0.m4327p();
        c0639j0.f3868e = c0627f0.mo4152j();
        c0639j0.f3869f = c0627f0.mo4151i();
        c0639j0.f3877n = c0627f0;
    }

    /* renamed from: o */
    private int m4647o() {
        int i = f3967H;
        int i2 = this.f3969B.f3868e;
        int i3 = i2 / i;
        return i3 > 0 ? i2 / i3 : i;
    }

    /* renamed from: p */
    private void m4648p() {
        C0669v0 c0669v0 = this.f3970C;
        int m4661g = m4661g(this.f3969B.f3868e);
        int m4663i = m4663i(this.f3969B.f3868e);
        int i = this.f3969B.f3868e;
        c0669v0.f4397c = new Rect(m4661g, m4663i, i - m4662h(i), this.f3969B.f3869f);
        C0669v0 c0669v02 = this.f3970C;
        Rect rect = c0669v02.f4397c;
        c0669v02.f4395a = rect.left;
        c0669v02.f4396b = rect.top;
        c0669v02.f4407m = null;
        c0669v02.f4398d = 0;
        c0669v02.f4402h = 0;
        c0669v02.f4400f = 0;
        c0669v02.f4399e = 0;
        c0669v02.f4403i = 0;
        c0669v02.f4406l = null;
    }

    /* renamed from: a */
    public void m4649a(int i, int i2, int i3, int i4, int i5, int i6, C0639j0 c0639j0) {
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
        } else if ((c3489yj.f14214g.equalsIgnoreCase("R") || c3489yj.f14214g.equalsIgnoreCase("Right")) && i < i5) {
            i7 = c0639j0.f3866c;
            i8 = i5 - i;
            c0639j0.f3866c = i7 + i8;
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
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4139a(AbsoluteLayout.LayoutParams layoutParams) {
        if (this.f4044b instanceof AbsoluteLayout) {
            ((AbsoluteLayout.LayoutParams) this.f3976y.getLayoutParams()).x = layoutParams.x;
            ((AbsoluteLayout.LayoutParams) this.f3976y.getLayoutParams()).y = layoutParams.y;
            if (layoutParams.width > 0) {
                ((AbsoluteLayout.LayoutParams) this.f3976y.getLayoutParams()).width = layoutParams.width;
            }
            if (layoutParams.height > 0) {
                ((AbsoluteLayout.LayoutParams) this.f3976y.getLayoutParams()).height = layoutParams.height;
            }
        }
    }

    /* renamed from: a */
    public void m4650a(C0639j0 c0639j0) {
        int i = c0639j0.f3868e;
        int i2 = c0639j0.f3869f;
        int i3 = c0639j0.f3872i;
        int i4 = i2 > i3 ? i2 - i3 : 0;
        ArrayList<Integer> m4654b = m4654b(c0639j0);
        int intValue = m4654b.get(0).intValue();
        int intValue2 = m4654b.get(1).intValue();
        int intValue3 = m4654b.get(2).intValue();
        int intValue4 = m4654b.get(3).intValue();
        for (int i5 = 0; i5 < c0639j0.f3878o.size(); i5++) {
            m4649a(intValue, intValue2, i, i4, intValue3, intValue4, c0639j0.f3878o.get(i5));
        }
    }

    /* renamed from: a */
    public void m4651a(C0639j0 c0639j0, int i) {
        int i2;
        int size = c0639j0.f3878o.size();
        int m4519a = c0639j0.m4519a();
        C0657p0 c0657p0 = new C0657p0(0, 0, 0, 0, C0687b.m5342a(this.f4045c).m5343a().m5544a());
        if (size > 0) {
            int i3 = c0639j0.f3878o.elementAt(0).f3866c;
            int i4 = i % m4519a;
            int i5 = (int) (i / m4519a);
            if (i5 > 0) {
                for (int i6 = 0; i6 < c0639j0.f3878o.size(); i6++) {
                    C0639j0 elementAt = c0639j0.f3878o.elementAt(i6);
                    C3489yj c3489yj = elementAt.f3879p;
                    if (c3489yj != null && c3489yj.f14211f) {
                        if (elementAt.f3866c <= i3) {
                            elementAt.f3866c = i3;
                        }
                        if (i4 > 0) {
                            i2 = i5 + 1;
                            i4--;
                        } else {
                            i2 = i5;
                        }
                        int i7 = i2 % 2 == 0 ? i2 / 2 : (i2 / 2) + 1;
                        c0657p0.f4220c = i7;
                        int i8 = i2 / 2;
                        c0657p0.f4218a = i8;
                        int i9 = i7 + i8;
                        i -= i9;
                        if (!(elementAt.f3877n instanceof C0642k0)) {
                            c0657p0.f4218a = i8 + elementAt.f3879p.m16639e(c0639j0.f3868e);
                            c0657p0.f4220c += elementAt.f3879p.m16642h(c0639j0.f3868e);
                        }
                        elementAt.f3877n.mo4201a(c0657p0);
                        elementAt.f3868e += i9;
                        if (i6 == c0639j0.f3878o.size() - 1) {
                            elementAt.f3868e += i;
                        }
                        elementAt.f3877n.mo4139a(new AbsoluteLayout.LayoutParams(elementAt.f3868e, elementAt.f3869f, elementAt.f3866c, elementAt.f3867d));
                        i3 = elementAt.f3866c + elementAt.f3868e + elementAt.f3879p.m16641g(c0639j0.f3880q.f4397c.width());
                        c0639j0.f3868e = c0639j0.f3879p.m16642h(c0639j0.f3868e) + i3;
                    }
                }
            }
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4174a(C0639j0 c0639j0, C0669v0 c0669v0) {
        int i;
        m4659c(this.f3969B, c0669v0);
        m4648p();
        for (int i2 = 0; i2 < this.f3971D.f14268z0.size(); i2++) {
            C3489yj elementAt = this.f3971D.f14268z0.elementAt(i2);
            String str = this.f3971D.f14220i;
            if (str != null && elementAt.f14220i == null) {
                elementAt.f14220i = str;
            }
            if (elementAt.f14197a0 != null) {
                if (elementAt.f14211f) {
                    elementAt.f14197a0.mo4150h().setVisibility(0);
                } else {
                    for (int i3 = 0; i3 < elementAt.f14200b0.size(); i3++) {
                        elementAt.f14197a0.mo4150h().setVisibility(8);
                        C0639j0 elementAt2 = elementAt.f14200b0.elementAt(i3);
                        elementAt2.f3869f = 0;
                        elementAt2.f3868e = 0;
                        elementAt2.f3864a = this.f3970C.f4395a;
                        elementAt2.f3865b = this.f3970C.f4396b;
                        elementAt2.f3866c = this.f3970C.f4395a;
                        elementAt2.f3867d = this.f3970C.f4396b + elementAt.m16643i(this.f3969B.f3868e);
                        elementAt2.f3871h = this.f3970C.f4397c.right;
                    }
                }
            }
            Vector<C3489yj> vector = elementAt.f14268z0;
            if ((vector != null && vector.size() > 0) || (i = elementAt.f14208e) == 33) {
                C0639j0 elementAt3 = elementAt.f14200b0.elementAt(0);
                this.f3970C.f4407m = elementAt3;
                AbstractC0652n1 abstractC0652n1 = elementAt3.f3877n;
                if ((abstractC0652n1 instanceof C0642k0) || (abstractC0652n1 instanceof C0645l0)) {
                    String str2 = elementAt3.f3875l.f3879p.f14233m0;
                    if (str2 != null && str2.equalsIgnoreCase("equal")) {
                        elementAt3.f3868e = this.f3973F;
                        elementAt3.f3876m = true;
                    }
                    elementAt3.f3877n.mo4174a(this.f3969B, this.f3970C);
                }
                this.f3970C.f4395a = elementAt3.f3866c + elementAt3.f3868e + elementAt3.f3879p.m16641g(elementAt3.f3880q.f4397c.width());
                if (this.f3970C.f4398d < elementAt3.f3868e + elementAt3.f3879p.m16641g(elementAt3.f3880q.f4397c.width()) + elementAt3.f3879p.m16638d(elementAt3.f3880q.f4397c.width())) {
                    this.f3970C.f4398d = elementAt3.f3868e + elementAt3.f3879p.m16641g(elementAt3.f3880q.f4397c.width()) + elementAt3.f3879p.m16638d(elementAt3.f3880q.f4397c.width());
                }
                if (this.f3970C.f4402h < elementAt3.f3869f + elementAt3.f3879p.m16643i(elementAt3.f3880q.f4397c.width()) + elementAt3.f3879p.m16632a(elementAt3.f3880q.f4397c.width())) {
                    this.f3970C.f4402h = elementAt3.f3869f + elementAt3.f3879p.m16643i(elementAt3.f3880q.f4397c.width()) + elementAt3.f3879p.m16632a(elementAt3.f3880q.f4397c.width());
                }
                elementAt3.f3877n.mo4139a(new AbsoluteLayout.LayoutParams(elementAt3.f3868e, elementAt3.f3869f, elementAt3.f3866c, elementAt3.f3867d));
            } else if (i != 23 && i != 24 && i != 7 && i != 28) {
                C0639j0 elementAt4 = elementAt.f14200b0.elementAt(0);
                this.f3970C.f4407m = elementAt4;
                int i4 = elementAt.f14208e;
                if (i4 == 22 || i4 == 2 || i4 == 27 || i4 == 13 || i4 == 26 || i4 == 9 || i4 == 1) {
                    elementAt4.f3877n.mo4142b();
                }
                C0639j0 c0639j02 = this.f3969B;
                elementAt4.f3875l = c0639j02;
                elementAt4.f3879p = elementAt;
                int i5 = c0639j02.f3868e;
                elementAt4.f3871h = i5 - 1;
                C0669v0 c0669v02 = this.f3970C;
                int i6 = c0669v02.f4395a;
                elementAt4.f3864a = i6;
                elementAt4.f3865b = c0669v02.f4396b;
                c0669v02.f4395a = i6 + elementAt.m16638d(i5);
                C0669v0 c0669v03 = this.f3970C;
                elementAt4.f3866c = c0669v03.f4395a;
                elementAt4.f3867d = c0669v03.f4396b + elementAt.m16643i(this.f3969B.f3868e);
                elementAt4.f3880q = this.f3970C;
                String str3 = elementAt4.f3875l.f3879p.f14233m0;
                if (str3 == null || !str3.equalsIgnoreCase("equal")) {
                    elementAt4.f3868e = elementAt.m16645k(this.f3970C.f4397c.width());
                } else {
                    elementAt4.f3868e = this.f3973F;
                    elementAt4.f3876m = true;
                }
                elementAt4.f3869f = elementAt.m16637c(C0687b.m5342a(this.f4045c).m5343a().m5547b());
                m4656b(elementAt, elementAt4);
                C0669v0 c0669v04 = this.f3970C;
                c0669v04.f4395a = elementAt4.f3866c + elementAt4.f3868e + elementAt4.f3879p.m16641g(c0669v04.f4397c.width());
                C0669v0 c0669v05 = this.f3970C;
                if (c0669v05.f4398d < elementAt4.f3868e + elementAt4.f3879p.m16641g(c0669v05.f4397c.width()) + elementAt4.f3879p.m16638d(this.f3970C.f4397c.width())) {
                    C0669v0 c0669v06 = this.f3970C;
                    c0669v06.f4398d = elementAt4.f3868e + elementAt4.f3879p.m16641g(c0669v06.f4397c.width()) + elementAt4.f3879p.m16638d(this.f3970C.f4397c.width());
                }
                C0669v0 c0669v07 = this.f3970C;
                if (c0669v07.f4402h < elementAt4.f3869f + elementAt4.f3879p.m16643i(c0669v07.f4397c.width()) + elementAt4.f3879p.m16632a(this.f3970C.f4397c.width())) {
                    C0669v0 c0669v08 = this.f3970C;
                    c0669v08.f4402h = elementAt4.f3869f + elementAt4.f3879p.m16643i(c0669v08.f4397c.width()) + elementAt4.f3879p.m16632a(this.f3970C.f4397c.width());
                }
                elementAt4.f3877n.mo4139a(new AbsoluteLayout.LayoutParams(elementAt4.f3868e, elementAt4.f3869f, elementAt4.f3866c, elementAt4.f3867d));
            }
        }
        m4660d(this.f3969B);
        mo4140a(this.f3971D);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
        Drawable m4705a = m4705a(c3489yj, c3489yj.f14145A0 == null ? this.f3969B.f3880q.f4397c.width() : this.f3969B.f3868e, this.f3969B.f3869f, false);
        if (m4705a != null) {
            this.f3976y.setBackground(m4705a);
        }
        this.f3976y.getLayoutParams().height = this.f3969B.f3869f;
    }

    /* renamed from: a */
    public void m4652a(C3489yj c3489yj, C0639j0 c0639j0) {
        int i = c3489yj.f14208e;
        if (i == 13 || i == 26) {
            m4646g(c3489yj, this.f3968A, c0639j0);
            return;
        }
        if (i == 10 || i == 11) {
            m4639b(c3489yj, this.f3968A, c0639j0);
            return;
        }
        if (i == 22 || i == 2 || i == 27) {
            m4641c(c3489yj, c0639j0);
            return;
        }
        if (i == 1) {
            m4637a(c3489yj, this.f3968A, c0639j0);
            return;
        }
        if (i == 3) {
            m4645f(c3489yj, this.f3968A, c0639j0);
            return;
        }
        if (i == 4) {
            m4640c(c3489yj, this.f3968A, c0639j0);
        } else if (i == 9) {
            m4644e(c3489yj, this.f3968A, c0639j0);
        } else if (i == 6) {
            m4642d(c3489yj, this.f3968A, c0639j0);
        }
    }

    /* renamed from: a */
    public void m4653a(C3489yj c3489yj, boolean z) {
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

    /* renamed from: b */
    public ArrayList<Integer> m4654b(C0639j0 c0639j0) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < c0639j0.f3878o.size(); i4++) {
            C0639j0 c0639j02 = c0639j0.f3878o.get(i4);
            C3489yj c3489yj = c0639j02.f3879p;
            if (c3489yj != null && c3489yj.f14211f) {
                int i5 = c0639j02.f3869f;
                if (i2 < i5) {
                    i2 = i5;
                }
                int i6 = c0639j02.f3874k;
                if (i3 < i6) {
                    i3 = i6;
                }
                i = c0639j02.f3866c + c0639j02.f3868e + c0639j02.f3879p.m16641g(c0639j02.f3880q.f4397c.width());
            }
        }
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        int i7 = c0639j0.f3868e;
        arrayList.add(Integer.valueOf(i7 - (c0639j0.f3879p.m16642h(i7) + c0639j0.f3879p.m16639e(c0639j0.f3868e))));
        arrayList.add(Integer.valueOf(i3));
        return arrayList;
    }

    /* renamed from: b */
    public void m4655b(C0639j0 c0639j0, C0669v0 c0669v0) {
        c0639j0.f3880q = c0669v0;
        C3489yj c3489yj = this.f3971D;
        c0639j0.f3879p = c3489yj;
        c3489yj.f14200b0.add(c0639j0);
        c0639j0.f3868e = c0669v0.f4397c.width() - (this.f3971D.m16638d(c0669v0.f4397c.width()) + this.f3971D.m16641g(c0669v0.f4397c.width()));
        int m16645k = this.f3971D.m16645k(c0669v0.f4397c.width());
        int m16637c = this.f3971D.m16637c(c0669v0.f4397c.height());
        int m16640f = this.f3971D.m16640f(c0669v0.f4397c.height());
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
            m16645k = c0669v0.f4397c.width() - (this.f3971D.m16638d(c0669v0.f4397c.width()) + this.f3971D.m16641g(c0669v0.f4397c.width()));
        }
        c0639j0.f3868e = m16645k;
        if (m16637c > 0) {
            c0639j0.f3869f = m16637c;
        } else {
            c0639j0.f3869f = c0669v0.f4397c.height();
        }
        if (m16640f > 0) {
            c0639j0.f3870g = m16640f;
            c0639j0.f3869f = m16640f;
        }
        c0639j0.f3871h = c0639j0.f3868e - 1;
        int i = c0669v0.f4395a;
        c0639j0.f3864a = i;
        c0639j0.f3865b = c0669v0.f4396b;
        c0639j0.f3866c = i + this.f3971D.m16638d(c0669v0.f4397c.width());
        c0639j0.f3867d = c0669v0.f4396b + this.f3971D.m16643i(c0669v0.f4397c.width());
        c0639j0.f3877n = this;
    }

    /* renamed from: b */
    public void m4656b(C3489yj c3489yj, C0639j0 c0639j0) {
        int i;
        AbstractC0652n1 abstractC0652n1;
        AbsoluteLayout.LayoutParams layoutParams;
        int i2 = c3489yj.f14208e;
        if (i2 == 13 || i2 == 26) {
            m4646g(c3489yj, this.f3968A, c0639j0);
            return;
        }
        if (i2 == 10 || i2 == 11) {
            int i3 = c0639j0.f3868e;
            if (i3 <= 0) {
                i3 = -2;
            }
            int i4 = c0639j0.f3869f;
            c0639j0.f3877n.mo4143b(new AbsoluteLayout.LayoutParams(i3, i4 > 0 ? i4 : -2, c0639j0.f3866c, c0639j0.f3867d));
            c0639j0.f3868e = c0639j0.f3877n.mo4152j();
            c0639j0.f3869f = c0639j0.f3877n.mo4151i();
            return;
        }
        if (i2 == 22 || i2 == 2 || i2 == 27) {
            m4641c(c3489yj, c0639j0);
            return;
        }
        if (i2 == 1) {
            m4637a(c3489yj, this.f3968A, c0639j0);
            return;
        }
        if (i2 == 3) {
            int i5 = c0639j0.f3868e;
            if (i5 <= 0) {
                int i6 = this.f3969B.f3868e;
                i5 = i6 - (m4661g(i6) + m4662h(this.f3969B.f3868e));
            }
            int i7 = c0639j0.f3869f;
            i = i7 > 0 ? i7 : -2;
            abstractC0652n1 = c0639j0.f3877n;
            layoutParams = new AbsoluteLayout.LayoutParams(i5, i, c0639j0.f3866c, c0639j0.f3867d);
        } else if (i2 == 4) {
            int i8 = c0639j0.f3868e;
            if (i8 <= 0) {
                i8 = -2;
            }
            int i9 = c0639j0.f3869f;
            i = i9 > 0 ? i9 : -2;
            abstractC0652n1 = c0639j0.f3877n;
            layoutParams = new AbsoluteLayout.LayoutParams(i8, i, c0639j0.f3866c, c0639j0.f3867d);
        } else {
            if (i2 == 9) {
                m4644e(c3489yj, this.f3968A, c0639j0);
                return;
            }
            if (i2 != 6) {
                return;
            }
            int i10 = c0639j0.f3868e;
            if (i10 <= 0) {
                i10 = -2;
            }
            int i11 = c0639j0.f3869f;
            i = i11 > 0 ? i11 : -2;
            abstractC0652n1 = c0639j0.f3877n;
            layoutParams = new AbsoluteLayout.LayoutParams(i10, i, c0639j0.f3866c, c0639j0.f3867d);
        }
        abstractC0652n1.mo4143b(layoutParams);
        c0639j0.f3868e = c0639j0.f3877n.mo4152j();
        c0639j0.f3869f = c0639j0.f3877n.mo4151i();
        m4638b(c3489yj);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: c */
    public void mo4146c() {
        C3489yj c3489yj = this.f3971D;
        c3489yj.f14199b = false;
        m4653a(c3489yj, false);
        this.f3975x.setOnClickListener(null);
        this.f3975x.setClickable(false);
        this.f3975x.setFocusable(false);
        C3489yj c3489yj2 = this.f3971D;
        if (c3489yj2.f14210e1) {
            AbstractC0652n1.m4697a(this.f3976y, c3489yj2.f14207d1);
        }
    }

    /* renamed from: c */
    public void m4657c(AbsoluteLayout.LayoutParams layoutParams) {
        AbsoluteLayout.LayoutParams layoutParams2;
        if (!(this.f4044b instanceof AbsoluteLayout) || (layoutParams2 = (AbsoluteLayout.LayoutParams) this.f3976y.getLayoutParams()) == null) {
            return;
        }
        layoutParams2.width = layoutParams.width;
        layoutParams2.height = layoutParams.height;
        layoutParams2.x = layoutParams.x;
        layoutParams2.y = layoutParams.y;
    }

    /* renamed from: c */
    public void m4658c(C0639j0 c0639j0) {
        if (c0639j0.f3878o.size() > 0) {
            C0639j0 elementAt = c0639j0.f3878o.elementAt(r0.size() - 1);
            int m16641g = elementAt.f3866c + elementAt.f3868e + elementAt.f3879p.m16641g(elementAt.f3880q.f4397c.width());
            for (int i = 0; i < c0639j0.f3878o.size(); i++) {
                C0639j0 elementAt2 = c0639j0.f3878o.elementAt(i);
                elementAt2.f3866c = (m16641g - elementAt2.f3866c) - elementAt2.f3868e;
                elementAt2.f3877n.mo4139a(new AbsoluteLayout.LayoutParams(elementAt2.f3868e, elementAt2.f3869f, elementAt2.f3866c, elementAt2.f3867d));
            }
        }
    }

    /* renamed from: c */
    public void m4659c(C0639j0 c0639j0, C0669v0 c0669v0) {
        c0639j0.f3880q = c0669v0;
        int m16645k = this.f3971D.m16645k(c0669v0.f4397c.width());
        int m16637c = this.f3971D.m16637c(c0669v0.f4397c.height());
        int m16640f = this.f3971D.m16640f(c0669v0.f4397c.height());
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
            m16645k = c0669v0.f4397c.width() - (this.f3971D.m16638d(c0669v0.f4397c.width()) + this.f3971D.m16641g(c0669v0.f4397c.width()));
        }
        c0639j0.f3868e = m16645k;
        if (m16637c > 0) {
            c0639j0.f3869f = m16637c;
        } else {
            int height = c0669v0.f4397c.height() - (this.f3971D.m16643i(c0669v0.f4397c.width()) + this.f3971D.m16632a(c0669v0.f4397c.width()));
            c0639j0.f3869f = height;
            if (this.f3971D.f14208e == 39) {
                c0639j0.f3869f = height - c0669v0.f4396b;
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
        c0639j0.f3866c = i + this.f3971D.m16638d(rect.width());
        c0639j0.f3867d = c0669v0.f4396b + this.f3971D.m16643i(c0669v0.f4397c.width());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r4.f3971D.f14232m.equalsIgnoreCase("exit") == false) goto L23;
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
            yj r0 = r4.f3971D
            r1 = 1
            r0.f14199b = r1
            r4.m4653a(r0, r1)
            yj r0 = r4.f3971D
            boolean r2 = r0.f14199b
            if (r2 == 0) goto L55
            java.lang.String r2 = r0.f14220i
            if (r2 == 0) goto L18
            int r0 = r0.f14208e
            r2 = 25
            if (r0 != r2) goto L44
        L18:
            yj r0 = r4.f3971D
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
            yj r0 = r4.f3971D
            java.lang.String r0 = r0.f14232m
            java.lang.String r2 = "exit"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L55
        L44:
            android.widget.LinearLayout r0 = r4.f3975x
            android.view.View$OnClickListener r2 = r4.f3974G
            r0.setOnClickListener(r2)
            android.widget.LinearLayout r0 = r4.f3975x
            r0.setClickable(r1)
            android.widget.LinearLayout r0 = r4.f3975x
            r0.setFocusable(r1)
        L55:
            yj r0 = r4.f3971D
            boolean r0 = r0.f14210e1
            if (r0 == 0) goto L67
            com.comviva.webaxn.ui.l0$b r0 = r4.f3976y
            float r1 = com.comviva.webaxn.p002ui.AbstractC0652n1.f4038r
            com.comviva.webaxn.p002ui.AbstractC0652n1.m4697a(r0, r1)
            yj r0 = r4.f3971D
            r1 = 0
            r0.f14210e1 = r1
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0645l0.mo4147d():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0042, code lost:
    
        if (r1 < r0) goto L18;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4660d(com.comviva.webaxn.p002ui.C0639j0 r6) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0645l0.m4660d(com.comviva.webaxn.ui.j0):void");
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: f */
    public C3489yj mo4148f() {
        return this.f3971D;
    }

    /* renamed from: g */
    public int m4661g(int i) {
        return this.f3971D.m16639e(i);
    }

    /* renamed from: h */
    public int m4662h(int i) {
        return this.f3971D.m16642h(i);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: h */
    public View mo4150h() {
        return this.f3976y;
    }

    /* renamed from: i */
    public int m4663i(int i) {
        return this.f3971D.m16644j(i);
    }

    /* renamed from: m */
    public void m4664m() {
        C2391dj c2391dj = this.f3971D.f14163J0;
        if (c2391dj != null) {
            AbstractC0652n1.m4700a(c2391dj, mo4150h());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x03a2, code lost:
    
        if (r8.f3971D.f14232m.equalsIgnoreCase("exit") == false) goto L101;
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4665n() {
        /*
            Method dump skipped, instructions count: 967
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0645l0.m4665n():void");
    }
}
