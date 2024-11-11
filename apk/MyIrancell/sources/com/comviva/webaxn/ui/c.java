package com.comviva.webaxn.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import defpackage.dj;
import defpackage.q2;
import defpackage.vj;
import defpackage.yj;

/* loaded from: classes.dex */
public class c extends n1 {
    public static int C;
    private v0 A;
    private View.OnClickListener B;
    private Button x;
    private yj y;
    public int z;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!TextUtils.isEmpty(c.this.y.u1)) {
                c cVar = c.this;
                cVar.a(cVar.y.u1);
            }
            c cVar2 = c.this;
            cVar2.g.b(cVar2);
        }
    }

    public c(Context context, yj yjVar, v0 v0Var) {
        super(context);
        this.B = new a();
        this.y = yjVar;
        this.A = v0Var;
        float f = yjVar.a;
        this.z = (int) (40.0f * f);
        C = (int) (f * 6.0f);
        Button button = new Button(context);
        this.x = button;
        button.setText(yjVar.n);
        this.x.setEllipsize(TextUtils.TruncateAt.END);
        this.x.setSingleLine();
        vj vjVar = this.y.q1;
        if (vjVar != null) {
            q2.a(this.x, vjVar.a());
        }
        if (!TextUtils.isEmpty(this.y.r1)) {
            this.x.setContentDescription(this.y.r1);
        }
        this.h = n1.d(com.comviva.webaxn.utils.j1.a(this.c).f0());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r4.m != false) goto L25;
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
    
        if (r4.m != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(android.widget.LinearLayout.LayoutParams r5) {
        /*
            r4 = this;
            yj r0 = r4.y
            java.lang.String r0 = r0.g
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r1 = "C"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L5e
            yj r0 = r4.y
            java.lang.String r0 = r0.g
            java.lang.String r1 = "Center"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L1c
            goto L5e
        L1c:
            yj r0 = r4.y
            java.lang.String r0 = r0.g
            java.lang.String r1 = "L"
            boolean r0 = r0.equalsIgnoreCase(r1)
            r1 = 5
            r2 = 3
            if (r0 != 0) goto L54
            yj r0 = r4.y
            java.lang.String r0 = r0.g
            java.lang.String r3 = "Left"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L37
            goto L54
        L37:
            yj r0 = r4.y
            java.lang.String r0 = r0.g
            java.lang.String r3 = "R"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 != 0) goto L4f
            yj r0 = r4.y
            java.lang.String r0 = r0.g
            java.lang.String r3 = "Right"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L62
        L4f:
            boolean r0 = r4.m
            if (r0 == 0) goto L58
            goto L5b
        L54:
            boolean r0 = r4.m
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
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.c.a(android.widget.LinearLayout$LayoutParams):void");
    }

    public void a(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.x.setLetterSpacing(f);
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(j0 j0Var, v0 v0Var) {
        String str = this.y.m0;
        int k = (str == null || str.equalsIgnoreCase("equal")) ? -2 : this.y.k(this.A.c.width());
        if (k < 0) {
            k = this.A.c.width() - (this.y.d(this.A.c.width()) + this.y.g(this.A.c.width()));
        }
        yj yjVar = this.y;
        com.comviva.webaxn.utils.u uVar = yjVar.p;
        if (uVar != null && ((yjVar.O != null || uVar.j()) && this.y.p.k())) {
            b(n1.d(this.y.p.c()));
        }
        yj yjVar2 = this.y;
        int c = yjVar2.n0 != null ? yjVar2.c(com.comviva.webaxn.utils.b.a(this.c).a().b()) : -2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.x.measure(makeMeasureSpec, makeMeasureSpec);
        this.l = this.x.getMeasuredWidth() + C;
        this.k = this.x.getMeasuredHeight();
        if (k < 0) {
            k = this.l;
        }
        this.l = k;
        if (c < 0) {
            c = this.k;
        }
        this.k = c;
        int i = this.z;
        if (c < i) {
            this.x.setHeight(i);
            this.x.measure(makeMeasureSpec, makeMeasureSpec);
            this.k = this.x.getMeasuredHeight();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.l, this.k);
        layoutParams.setMargins(this.y.d(v0Var.c.width()), this.y.i(v0Var.c.width()), this.y.g(v0Var.c.width()), this.y.a(v0Var.c.width()));
        a(layoutParams);
        this.x.setLayoutParams(layoutParams);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(yj yjVar) {
        if (yjVar != null) {
            b(yjVar);
        }
    }

    public void b(float f) {
        this.x.setTextSize(f);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b(int i) {
        super.b(i);
        this.x.setTextColor(i);
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
        this.x.setClickable(false);
        this.x.setOnClickListener(null);
        this.x.setFocusable(false);
        yj yjVar = this.y;
        if (yjVar.e1) {
            n1.a(this.x, yjVar.d1);
        }
    }

    public void c(yj yjVar) {
        this.y = yjVar;
        if (yjVar.b) {
            this.x.setOnClickListener(this.B);
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
            this.x.setClickable(true);
            this.x.setOnClickListener(this.B);
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

    public void m() {
        dj djVar = this.y.J0;
        if (djVar != null) {
            n1.a(djVar, h());
        }
    }

    public void n() {
        if (this.b != null) {
            p0 p0Var = this.f;
            if (p0Var != null) {
                int i = p0Var.a;
                if (i == 0) {
                    i = this.x.getPaddingLeft();
                }
                int i2 = this.f.b;
                if (i2 == 0) {
                    i2 = this.x.getPaddingTop();
                }
                int i3 = this.f.c;
                if (i3 == 0) {
                    i3 = this.x.getPaddingRight();
                }
                int i4 = this.f.d;
                if (i4 == 0) {
                    i4 = this.x.getPaddingBottom();
                }
                this.x.setPadding(i, i2, i3, i4);
            }
            String str = this.y.m0;
            int k = (str == null || str.equalsIgnoreCase("equal")) ? -2 : this.y.k(this.A.c.width());
            if (k < 0) {
                k = this.A.c.width() - (this.y.d(this.A.c.width()) + this.y.g(this.A.c.width()));
            }
            yj yjVar = this.y;
            com.comviva.webaxn.utils.u uVar = yjVar.p;
            if (uVar != null && ((yjVar.O != null || uVar.j()) && this.y.p.k())) {
                b(n1.d(this.y.p.c()));
            }
            yj yjVar2 = this.y;
            int c = yjVar2.n0 != null ? yjVar2.c(com.comviva.webaxn.utils.b.a(this.c).a().b()) : -2;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            this.x.measure(makeMeasureSpec, makeMeasureSpec);
            this.l = this.x.getMeasuredWidth() + C;
            this.k = this.x.getMeasuredHeight();
            if (k < 0) {
                k = this.l;
            }
            this.l = k;
            if (c < 0) {
                c = this.k;
            }
            this.k = c;
            int i5 = this.z;
            if (c < i5) {
                this.x.setHeight(i5);
                this.x.measure(makeMeasureSpec, makeMeasureSpec);
                this.k = this.x.getMeasuredHeight();
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.l, this.k);
            layoutParams.setMargins(this.y.d(this.A.c.width()), this.y.i(this.A.c.width()), this.y.g(this.A.c.width()), this.y.a(this.A.c.width()));
            a(layoutParams);
            this.x.setLayoutParams(layoutParams);
            this.b.addView(this.x);
            this.b.invalidate();
        }
    }
}
