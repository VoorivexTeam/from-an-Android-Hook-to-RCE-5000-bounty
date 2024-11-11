package com.comviva.webaxn.p002ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.LinearLayout;
import com.comviva.webaxn.utils.C0687b;
import com.comviva.webaxn.utils.C0713j1;
import com.comviva.webaxn.utils.C0744u;
import p000.C2391dj;
import p000.C2434ej;
import p000.C3107q2;
import p000.C3361vj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.d */
/* loaded from: classes.dex */
public class C0620d extends AbstractC0652n1 {

    /* renamed from: B */
    public static int f3547B;

    /* renamed from: A */
    private View.OnClickListener f3548A;

    /* renamed from: x */
    private Button f3549x;

    /* renamed from: y */
    private C3489yj f3550y;

    /* renamed from: z */
    public int f3551z;

    /* renamed from: com.comviva.webaxn.ui.d$a */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!TextUtils.isEmpty(C0620d.this.f3550y.f14258u1)) {
                C0620d c0620d = C0620d.this;
                c0620d.m4707a(c0620d.f3550y.f14258u1);
            }
            C0620d c0620d2 = C0620d.this;
            c0620d2.f4049g.mo4849b(c0620d2);
        }
    }

    public C0620d(Context context, String str, C3489yj c3489yj, C0639j0 c0639j0) {
        super(context);
        this.f3548A = new a();
        this.f3550y = c3489yj;
        float f = c3489yj.f14196a;
        this.f3551z = (int) (40.0f * f);
        f3547B = (int) (f * 6.0f);
        this.f3549x = new Button(context);
        C2434ej c2434ej = this.f3550y.f14173O0;
        if (c2434ej != null) {
            c2434ej.m11615a(c0639j0.f3869f);
        }
        C3361vj c3361vj = this.f3550y.f14246q1;
        if (c3361vj != null) {
            C3107q2.m14884a(this.f3549x, c3361vj.m16034a());
        }
        if (!TextUtils.isEmpty(this.f3550y.f14249r1)) {
            this.f3549x.setContentDescription(this.f3550y.f14249r1);
        }
        this.f3549x.setText(str);
        this.f3549x.setMaxLines(1);
        this.f3549x.setEllipsize(TextUtils.TruncateAt.END);
        this.f3549x.setGravity(17);
        this.f4050h = AbstractC0652n1.m4701d(C0713j1.m5563a(this.f4045c).m5664f0());
    }

    /* renamed from: a */
    public int m4199a(AbsoluteLayout.LayoutParams layoutParams, C0669v0 c0669v0) {
        int i = layoutParams.height;
        if (i <= 0) {
            i = -2;
        }
        int i2 = layoutParams.width;
        int i3 = i2 > 0 ? i2 : -2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f3549x.measure(makeMeasureSpec, makeMeasureSpec);
        this.f4054l = this.f3549x.getMeasuredWidth() + f3547B;
        this.f4053k = this.f3549x.getMeasuredHeight();
        if (i3 < 0) {
            i3 = this.f4054l;
        }
        this.f4054l = i3;
        if (i < 0) {
            i = this.f4053k;
        }
        this.f4053k = i;
        int i4 = this.f3551z;
        if (i < i4) {
            this.f3549x.setHeight(i4);
            this.f3549x.measure(makeMeasureSpec, makeMeasureSpec);
            this.f4053k = this.f3549x.getMeasuredHeight();
        }
        this.f3549x.setLayoutParams(new LinearLayout.LayoutParams(this.f4054l, this.f4053k));
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f3549x.measure(makeMeasureSpec2, makeMeasureSpec2);
        this.f4054l = this.f3549x.getMeasuredWidth();
        this.f4053k = this.f3549x.getMeasuredHeight();
        this.f3549x.setLayoutParams(new AbsoluteLayout.LayoutParams(this.f4054l, this.f4053k, layoutParams.x, layoutParams.y));
        return this.f4053k;
    }

    /* renamed from: a */
    public void m4200a(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f3549x.setLetterSpacing(f);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4139a(AbsoluteLayout.LayoutParams layoutParams) {
        ((AbsoluteLayout.LayoutParams) this.f3549x.getLayoutParams()).x = layoutParams.x;
        ((AbsoluteLayout.LayoutParams) this.f3549x.getLayoutParams()).y = layoutParams.y;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4201a(C0657p0 c0657p0) {
        if (c0657p0 != null) {
            int i = c0657p0.f4218a;
            if (i == 0) {
                i = this.f3549x.getPaddingLeft();
            }
            int i2 = c0657p0.f4219b;
            if (i2 == 0) {
                i2 = this.f3549x.getPaddingTop();
            }
            int i3 = c0657p0.f4220c;
            if (i3 == 0) {
                i3 = this.f3549x.getPaddingRight();
            }
            int i4 = c0657p0.f4221d;
            if (i4 == 0) {
                i4 = this.f3549x.getPaddingBottom();
            }
            this.f3549x.setPadding(i, i2, i3, i4);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
        m4203b(c3489yj);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4142b() {
        this.f4044b.removeView(this.f3549x);
    }

    /* renamed from: b */
    public void m4202b(float f) {
        this.f3549x.setTextSize(f);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4176b(int i) {
        super.mo4176b(i);
        this.f3549x.setTextColor(i);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4143b(AbsoluteLayout.LayoutParams layoutParams) {
        int i = layoutParams.height;
        if (i <= 0) {
            i = -2;
        }
        int i2 = layoutParams.width;
        int i3 = i2 > 0 ? i2 : -2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f3549x.measure(makeMeasureSpec, makeMeasureSpec);
        this.f4054l = this.f3549x.getMeasuredWidth() + f3547B;
        this.f4053k = this.f3549x.getMeasuredHeight();
        if (i3 < 0) {
            i3 = this.f4054l;
        }
        this.f4054l = i3;
        if (i < 0) {
            i = this.f4053k;
        }
        this.f4053k = i;
        int i4 = this.f3551z;
        if (i < i4) {
            this.f3549x.setHeight(i4);
            this.f3549x.measure(makeMeasureSpec, makeMeasureSpec);
            this.f4053k = this.f3549x.getMeasuredHeight();
        }
        this.f3549x.getLayoutParams().height = this.f4053k;
        this.f3549x.getLayoutParams().width = this.f4054l;
    }

    /* renamed from: b */
    public void m4203b(C3489yj c3489yj) {
        Drawable m4705a = m4705a(c3489yj, 0, 0, false);
        if (m4705a != null) {
            this.f3549x.setBackground(m4705a);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: c */
    public void mo4146c() {
        this.f3550y.f14199b = false;
        this.f3549x.setOnClickListener(null);
        this.f3549x.setClickable(false);
        this.f3549x.setFocusable(false);
        C3489yj c3489yj = this.f3550y;
        if (c3489yj.f14210e1) {
            AbstractC0652n1.m4697a(this.f3549x, c3489yj.f14207d1);
        }
    }

    /* renamed from: c */
    public void m4204c(C3489yj c3489yj) {
        this.f3550y = c3489yj;
        if (c3489yj.f14199b) {
            this.f3549x.setOnClickListener(this.f3548A);
            return;
        }
        this.f3549x.setClickable(false);
        AbstractC0652n1.m4697a(this.f3549x, this.f3550y.f14207d1);
        this.f3550y.f14210e1 = true;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: d */
    public void mo4147d() {
        this.f3550y.f14199b = true;
        if (!this.f3549x.isClickable()) {
            this.f3549x.setOnClickListener(this.f3548A);
            this.f3549x.setClickable(true);
            this.f3549x.setFocusable(true);
        }
        if (this.f3550y.f14210e1) {
            AbstractC0652n1.m4697a(this.f3549x, AbstractC0652n1.f4038r);
            this.f3550y.f14210e1 = false;
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: f */
    public C3489yj mo4148f() {
        return this.f3550y;
    }

    /* renamed from: g */
    public void m4205g(int i) {
        this.f3549x.setTypeface(this.f3550y.f14241p.m6069h(), AbstractC0652n1.m4702e(i));
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: h */
    public View mo4150h() {
        return this.f3549x;
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

    /* renamed from: m */
    public void m4206m() {
        C2391dj c2391dj = this.f3550y.f14163J0;
        if (c2391dj != null) {
            AbstractC0652n1.m4700a(c2391dj, mo4150h());
        }
    }

    /* renamed from: n */
    public void m4207n() {
        if (this.f4044b != null) {
            int m5552d = C0687b.m5342a(this.f4045c).m5343a().m5552d() / 3;
            C3489yj c3489yj = this.f3550y;
            C0744u c0744u = c3489yj.f14241p;
            if (c0744u != null && ((c3489yj.f14172O != null || c0744u.m6071j()) && this.f3550y.f14241p.m6072k())) {
                mo4176b(AbstractC0652n1.m4701d(this.f3550y.f14241p.m6062c()));
            }
            this.f4044b.addView(this.f3549x);
            this.f4044b.invalidate();
        }
    }
}
