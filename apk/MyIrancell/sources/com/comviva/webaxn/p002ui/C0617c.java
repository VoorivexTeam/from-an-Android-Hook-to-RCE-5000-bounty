package com.comviva.webaxn.p002ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.comviva.webaxn.utils.C0687b;
import com.comviva.webaxn.utils.C0713j1;
import com.comviva.webaxn.utils.C0744u;
import p000.C2391dj;
import p000.C3107q2;
import p000.C3361vj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.c */
/* loaded from: classes.dex */
public class C0617c extends AbstractC0652n1 {

    /* renamed from: C */
    public static int f3533C;

    /* renamed from: A */
    private C0669v0 f3534A;

    /* renamed from: B */
    private View.OnClickListener f3535B;

    /* renamed from: x */
    private Button f3536x;

    /* renamed from: y */
    private C3489yj f3537y;

    /* renamed from: z */
    public int f3538z;

    /* renamed from: com.comviva.webaxn.ui.c$a */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!TextUtils.isEmpty(C0617c.this.f3537y.f14258u1)) {
                C0617c c0617c = C0617c.this;
                c0617c.m4707a(c0617c.f3537y.f14258u1);
            }
            C0617c c0617c2 = C0617c.this;
            c0617c2.f4049g.mo4849b(c0617c2);
        }
    }

    public C0617c(Context context, C3489yj c3489yj, C0669v0 c0669v0) {
        super(context);
        this.f3535B = new a();
        this.f3537y = c3489yj;
        this.f3534A = c0669v0;
        float f = c3489yj.f14196a;
        this.f3538z = (int) (40.0f * f);
        f3533C = (int) (f * 6.0f);
        Button button = new Button(context);
        this.f3536x = button;
        button.setText(c3489yj.f14235n);
        this.f3536x.setEllipsize(TextUtils.TruncateAt.END);
        this.f3536x.setSingleLine();
        C3361vj c3361vj = this.f3537y.f14246q1;
        if (c3361vj != null) {
            C3107q2.m14884a(this.f3536x, c3361vj.m16034a());
        }
        if (!TextUtils.isEmpty(this.f3537y.f14249r1)) {
            this.f3536x.setContentDescription(this.f3537y.f14249r1);
        }
        this.f4050h = AbstractC0652n1.m4701d(C0713j1.m5563a(this.f4045c).m5664f0());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r4.f4055m != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        r5.gravity = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        r5.gravity = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (r4.f4055m != false) goto L24;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m4172a(android.widget.LinearLayout.LayoutParams r5) {
        /*
            r4 = this;
            yj r0 = r4.f3537y
            java.lang.String r0 = r0.f14214g
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r1 = "C"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L5e
            yj r0 = r4.f3537y
            java.lang.String r0 = r0.f14214g
            java.lang.String r1 = "Center"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L1c
            goto L5e
        L1c:
            yj r0 = r4.f3537y
            java.lang.String r0 = r0.f14214g
            java.lang.String r1 = "L"
            boolean r0 = r0.equalsIgnoreCase(r1)
            r1 = 5
            r2 = 3
            if (r0 != 0) goto L54
            yj r0 = r4.f3537y
            java.lang.String r0 = r0.f14214g
            java.lang.String r3 = "Left"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L37
            goto L54
        L37:
            yj r0 = r4.f3537y
            java.lang.String r0 = r0.f14214g
            java.lang.String r3 = "R"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 != 0) goto L4f
            yj r0 = r4.f3537y
            java.lang.String r0 = r0.f14214g
            java.lang.String r3 = "Right"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L62
        L4f:
            boolean r0 = r4.f4055m
            if (r0 == 0) goto L58
            goto L5b
        L54:
            boolean r0 = r4.f4055m
            if (r0 == 0) goto L5b
        L58:
            r5.gravity = r1
            goto L62
        L5b:
            r5.gravity = r2
            goto L62
        L5e:
            r0 = 17
            r5.gravity = r0
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0617c.m4172a(android.widget.LinearLayout$LayoutParams):void");
    }

    /* renamed from: a */
    public void m4173a(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f3536x.setLetterSpacing(f);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4174a(C0639j0 c0639j0, C0669v0 c0669v0) {
        String str = this.f3537y.f14233m0;
        int m16645k = (str == null || str.equalsIgnoreCase("equal")) ? -2 : this.f3537y.m16645k(this.f3534A.f4397c.width());
        if (m16645k < 0) {
            m16645k = this.f3534A.f4397c.width() - (this.f3537y.m16638d(this.f3534A.f4397c.width()) + this.f3537y.m16641g(this.f3534A.f4397c.width()));
        }
        C3489yj c3489yj = this.f3537y;
        C0744u c0744u = c3489yj.f14241p;
        if (c0744u != null && ((c3489yj.f14172O != null || c0744u.m6071j()) && this.f3537y.f14241p.m6072k())) {
            mo4176b(AbstractC0652n1.m4701d(this.f3537y.f14241p.m6062c()));
        }
        C3489yj c3489yj2 = this.f3537y;
        int m16637c = c3489yj2.f14236n0 != null ? c3489yj2.m16637c(C0687b.m5342a(this.f4045c).m5343a().m5547b()) : -2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f3536x.measure(makeMeasureSpec, makeMeasureSpec);
        this.f4054l = this.f3536x.getMeasuredWidth() + f3533C;
        this.f4053k = this.f3536x.getMeasuredHeight();
        if (m16645k < 0) {
            m16645k = this.f4054l;
        }
        this.f4054l = m16645k;
        if (m16637c < 0) {
            m16637c = this.f4053k;
        }
        this.f4053k = m16637c;
        int i = this.f3538z;
        if (m16637c < i) {
            this.f3536x.setHeight(i);
            this.f3536x.measure(makeMeasureSpec, makeMeasureSpec);
            this.f4053k = this.f3536x.getMeasuredHeight();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f4054l, this.f4053k);
        layoutParams.setMargins(this.f3537y.m16638d(c0669v0.f4397c.width()), this.f3537y.m16643i(c0669v0.f4397c.width()), this.f3537y.m16641g(c0669v0.f4397c.width()), this.f3537y.m16632a(c0669v0.f4397c.width()));
        m4172a(layoutParams);
        this.f3536x.setLayoutParams(layoutParams);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
        if (c3489yj != null) {
            m4177b(c3489yj);
        }
    }

    /* renamed from: b */
    public void m4175b(float f) {
        this.f3536x.setTextSize(f);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4176b(int i) {
        super.mo4176b(i);
        this.f3536x.setTextColor(i);
    }

    /* renamed from: b */
    public void m4177b(C3489yj c3489yj) {
        Drawable m4705a = m4705a(c3489yj, 0, 0, false);
        if (m4705a != null) {
            this.f3536x.setBackground(m4705a);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: c */
    public void mo4146c() {
        this.f3537y.f14199b = false;
        this.f3536x.setClickable(false);
        this.f3536x.setOnClickListener(null);
        this.f3536x.setFocusable(false);
        C3489yj c3489yj = this.f3537y;
        if (c3489yj.f14210e1) {
            AbstractC0652n1.m4697a(this.f3536x, c3489yj.f14207d1);
        }
    }

    /* renamed from: c */
    public void m4178c(C3489yj c3489yj) {
        this.f3537y = c3489yj;
        if (c3489yj.f14199b) {
            this.f3536x.setOnClickListener(this.f3535B);
            return;
        }
        this.f3536x.setClickable(false);
        AbstractC0652n1.m4697a(this.f3536x, this.f3537y.f14207d1);
        this.f3537y.f14210e1 = true;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: d */
    public void mo4147d() {
        this.f3537y.f14199b = true;
        if (!this.f3536x.isClickable()) {
            this.f3536x.setClickable(true);
            this.f3536x.setOnClickListener(this.f3535B);
            this.f3536x.setFocusable(true);
        }
        if (this.f3537y.f14210e1) {
            AbstractC0652n1.m4697a(this.f3536x, AbstractC0652n1.f4038r);
            this.f3537y.f14210e1 = false;
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: f */
    public C3489yj mo4148f() {
        return this.f3537y;
    }

    /* renamed from: g */
    public void m4179g(int i) {
        this.f3536x.setTypeface(this.f3537y.f14241p.m6069h(), AbstractC0652n1.m4702e(i));
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: h */
    public View mo4150h() {
        return this.f3536x;
    }

    /* renamed from: m */
    public void m4180m() {
        C2391dj c2391dj = this.f3537y.f14163J0;
        if (c2391dj != null) {
            AbstractC0652n1.m4700a(c2391dj, mo4150h());
        }
    }

    /* renamed from: n */
    public void m4181n() {
        if (this.f4044b != null) {
            C0657p0 c0657p0 = this.f4048f;
            if (c0657p0 != null) {
                int i = c0657p0.f4218a;
                if (i == 0) {
                    i = this.f3536x.getPaddingLeft();
                }
                int i2 = this.f4048f.f4219b;
                if (i2 == 0) {
                    i2 = this.f3536x.getPaddingTop();
                }
                int i3 = this.f4048f.f4220c;
                if (i3 == 0) {
                    i3 = this.f3536x.getPaddingRight();
                }
                int i4 = this.f4048f.f4221d;
                if (i4 == 0) {
                    i4 = this.f3536x.getPaddingBottom();
                }
                this.f3536x.setPadding(i, i2, i3, i4);
            }
            String str = this.f3537y.f14233m0;
            int m16645k = (str == null || str.equalsIgnoreCase("equal")) ? -2 : this.f3537y.m16645k(this.f3534A.f4397c.width());
            if (m16645k < 0) {
                m16645k = this.f3534A.f4397c.width() - (this.f3537y.m16638d(this.f3534A.f4397c.width()) + this.f3537y.m16641g(this.f3534A.f4397c.width()));
            }
            C3489yj c3489yj = this.f3537y;
            C0744u c0744u = c3489yj.f14241p;
            if (c0744u != null && ((c3489yj.f14172O != null || c0744u.m6071j()) && this.f3537y.f14241p.m6072k())) {
                mo4176b(AbstractC0652n1.m4701d(this.f3537y.f14241p.m6062c()));
            }
            C3489yj c3489yj2 = this.f3537y;
            int m16637c = c3489yj2.f14236n0 != null ? c3489yj2.m16637c(C0687b.m5342a(this.f4045c).m5343a().m5547b()) : -2;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            this.f3536x.measure(makeMeasureSpec, makeMeasureSpec);
            this.f4054l = this.f3536x.getMeasuredWidth() + f3533C;
            this.f4053k = this.f3536x.getMeasuredHeight();
            if (m16645k < 0) {
                m16645k = this.f4054l;
            }
            this.f4054l = m16645k;
            if (m16637c < 0) {
                m16637c = this.f4053k;
            }
            this.f4053k = m16637c;
            int i5 = this.f3538z;
            if (m16637c < i5) {
                this.f3536x.setHeight(i5);
                this.f3536x.measure(makeMeasureSpec, makeMeasureSpec);
                this.f4053k = this.f3536x.getMeasuredHeight();
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f4054l, this.f4053k);
            layoutParams.setMargins(this.f3537y.m16638d(this.f3534A.f4397c.width()), this.f3537y.m16643i(this.f3534A.f4397c.width()), this.f3537y.m16641g(this.f3534A.f4397c.width()), this.f3537y.m16632a(this.f3534A.f4397c.width()));
            m4172a(layoutParams);
            this.f3536x.setLayoutParams(layoutParams);
            this.f4044b.addView(this.f3536x);
            this.f4044b.invalidate();
        }
    }
}
