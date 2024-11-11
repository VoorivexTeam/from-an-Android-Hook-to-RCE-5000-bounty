package com.comviva.webaxn.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.LinearLayout;
import defpackage.dj;
import defpackage.ej;
import defpackage.q2;
import defpackage.vj;
import defpackage.yj;

/* loaded from: classes.dex */
public class d extends n1 {
    public static int B;
    private View.OnClickListener A;
    private Button x;
    private yj y;
    public int z;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!TextUtils.isEmpty(d.this.y.u1)) {
                d dVar = d.this;
                dVar.a(dVar.y.u1);
            }
            d dVar2 = d.this;
            dVar2.g.b(dVar2);
        }
    }

    public d(Context context, String str, yj yjVar, j0 j0Var) {
        super(context);
        this.A = new a();
        this.y = yjVar;
        float f = yjVar.a;
        this.z = (int) (40.0f * f);
        B = (int) (f * 6.0f);
        this.x = new Button(context);
        ej ejVar = this.y.O0;
        if (ejVar != null) {
            ejVar.a(j0Var.f);
        }
        vj vjVar = this.y.q1;
        if (vjVar != null) {
            q2.a(this.x, vjVar.a());
        }
        if (!TextUtils.isEmpty(this.y.r1)) {
            this.x.setContentDescription(this.y.r1);
        }
        this.x.setText(str);
        this.x.setMaxLines(1);
        this.x.setEllipsize(TextUtils.TruncateAt.END);
        this.x.setGravity(17);
        this.h = n1.d(com.comviva.webaxn.utils.j1.a(this.c).f0());
    }

    public int a(AbsoluteLayout.LayoutParams layoutParams, v0 v0Var) {
        int i = layoutParams.height;
        if (i <= 0) {
            i = -2;
        }
        int i2 = layoutParams.width;
        int i3 = i2 > 0 ? i2 : -2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.x.measure(makeMeasureSpec, makeMeasureSpec);
        this.l = this.x.getMeasuredWidth() + B;
        this.k = this.x.getMeasuredHeight();
        if (i3 < 0) {
            i3 = this.l;
        }
        this.l = i3;
        if (i < 0) {
            i = this.k;
        }
        this.k = i;
        int i4 = this.z;
        if (i < i4) {
            this.x.setHeight(i4);
            this.x.measure(makeMeasureSpec, makeMeasureSpec);
            this.k = this.x.getMeasuredHeight();
        }
        this.x.setLayoutParams(new LinearLayout.LayoutParams(this.l, this.k));
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.x.measure(makeMeasureSpec2, makeMeasureSpec2);
        this.l = this.x.getMeasuredWidth();
        this.k = this.x.getMeasuredHeight();
        this.x.setLayoutParams(new AbsoluteLayout.LayoutParams(this.l, this.k, layoutParams.x, layoutParams.y));
        return this.k;
    }

    public void a(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.x.setLetterSpacing(f);
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(AbsoluteLayout.LayoutParams layoutParams) {
        ((AbsoluteLayout.LayoutParams) this.x.getLayoutParams()).x = layoutParams.x;
        ((AbsoluteLayout.LayoutParams) this.x.getLayoutParams()).y = layoutParams.y;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(p0 p0Var) {
        if (p0Var != null) {
            int i = p0Var.a;
            if (i == 0) {
                i = this.x.getPaddingLeft();
            }
            int i2 = p0Var.b;
            if (i2 == 0) {
                i2 = this.x.getPaddingTop();
            }
            int i3 = p0Var.c;
            if (i3 == 0) {
                i3 = this.x.getPaddingRight();
            }
            int i4 = p0Var.d;
            if (i4 == 0) {
                i4 = this.x.getPaddingBottom();
            }
            this.x.setPadding(i, i2, i3, i4);
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(yj yjVar) {
        b(yjVar);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b() {
        this.b.removeView(this.x);
    }

    public void b(float f) {
        this.x.setTextSize(f);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b(int i) {
        super.b(i);
        this.x.setTextColor(i);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b(AbsoluteLayout.LayoutParams layoutParams) {
        int i = layoutParams.height;
        if (i <= 0) {
            i = -2;
        }
        int i2 = layoutParams.width;
        int i3 = i2 > 0 ? i2 : -2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.x.measure(makeMeasureSpec, makeMeasureSpec);
        this.l = this.x.getMeasuredWidth() + B;
        this.k = this.x.getMeasuredHeight();
        if (i3 < 0) {
            i3 = this.l;
        }
        this.l = i3;
        if (i < 0) {
            i = this.k;
        }
        this.k = i;
        int i4 = this.z;
        if (i < i4) {
            this.x.setHeight(i4);
            this.x.measure(makeMeasureSpec, makeMeasureSpec);
            this.k = this.x.getMeasuredHeight();
        }
        this.x.getLayoutParams().height = this.k;
        this.x.getLayoutParams().width = this.l;
    }

    public void b(yj yjVar) {
        Drawable a2 = a(yjVar, 0, 0, false);
        if (a2 != null) {
            this.x.setBackground(a2);
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void c() {
        this.y.b = false;
        this.x.setOnClickListener(null);
        this.x.setClickable(false);
        this.x.setFocusable(false);
        yj yjVar = this.y;
        if (yjVar.e1) {
            n1.a(this.x, yjVar.d1);
        }
    }

    public void c(yj yjVar) {
        this.y = yjVar;
        if (yjVar.b) {
            this.x.setOnClickListener(this.A);
            return;
        }
        this.x.setClickable(false);
        n1.a(this.x, this.y.d1);
        this.y.e1 = true;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void d() {
        this.y.b = true;
        if (!this.x.isClickable()) {
            this.x.setOnClickListener(this.A);
            this.x.setClickable(true);
            this.x.setFocusable(true);
        }
        if (this.y.e1) {
            n1.a(this.x, n1.r);
            this.y.e1 = false;
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public yj f() {
        return this.y;
    }

    public void g(int i) {
        this.x.setTypeface(this.y.p.h(), n1.e(i));
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

    public void m() {
        dj djVar = this.y.J0;
        if (djVar != null) {
            n1.a(djVar, h());
        }
    }

    public void n() {
        if (this.b != null) {
            int d = com.comviva.webaxn.utils.b.a(this.c).a().d() / 3;
            yj yjVar = this.y;
            com.comviva.webaxn.utils.u uVar = yjVar.p;
            if (uVar != null && ((yjVar.O != null || uVar.j()) && this.y.p.k())) {
                b(n1.d(this.y.p.c()));
            }
            this.b.addView(this.x);
            this.b.invalidate();
        }
    }
}
