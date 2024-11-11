package com.comviva.webaxn.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.comviva.webaxn.utils.x1;
import defpackage.ej;
import defpackage.yj;

/* loaded from: classes.dex */
public class g0 extends n1 {
    public int A;
    public float B;
    private boolean C;
    public boolean D;
    public boolean E;
    private LinearLayout F;
    private boolean G;
    private String H;
    public View.OnClickListener I;
    protected String x;
    protected TextView y;
    public yj z;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g0 g0Var = g0.this;
            g0Var.g.b(g0Var);
        }
    }

    public g0(Context context) {
        super(context);
        this.D = false;
        this.E = false;
        this.G = false;
        this.I = new a();
        this.F = new LinearLayout(this.c);
        this.y = new TextView(context);
        this.A = -1;
        this.B = -1.0f;
        this.C = false;
    }

    public g0(Context context, String str) {
        super(context);
        this.D = false;
        this.E = false;
        this.G = false;
        this.I = new a();
        this.F = new LinearLayout(this.c);
        this.x = str;
        this.B = -1.0f;
        this.y = new TextView(context);
        this.A = -1;
        this.C = false;
    }

    public void a(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.y.setLetterSpacing(f);
        }
    }

    public void a(Spanned spanned) {
        this.x = spanned.toString();
        this.y.setText(spanned);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(j0 j0Var, v0 v0Var) {
        int k = this.z.k(v0Var.c.width());
        if (k < 0) {
            k = v0Var.c.width() - (this.z.d(v0Var.c.width()) + this.z.g(v0Var.c.width()));
        }
        int c = this.z.c(v0Var.c.height());
        ((LinearLayout.LayoutParams) this.y.getLayoutParams()).width = k;
        ((LinearLayout.LayoutParams) this.y.getLayoutParams()).height = c;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.F.measure(makeMeasureSpec, makeMeasureSpec);
        this.l = this.F.getMeasuredWidth();
        this.k = this.F.getMeasuredHeight();
    }

    public void a(v0 v0Var) {
        com.comviva.webaxn.utils.u uVar;
        if (this.b == null || this.x == null) {
            return;
        }
        yj yjVar = this.z;
        if (yjVar == null || (uVar = yjVar.p) == null || uVar.g() != 4) {
            this.y.setText(this.x);
        } else {
            this.y.setText(Html.fromHtml("<u>".concat(this.x).concat("</u>")));
        }
        this.y.setHorizontallyScrolling(false);
        if (this.C) {
            this.y.setOnClickListener(this.I);
            this.y.setOnTouchListener(this.q);
            this.y.setMinimumHeight(n1.u);
        } else {
            n1.a(this.F, this.z.d1);
            this.z.e1 = true;
        }
        p0 p0Var = this.f;
        if (p0Var != null) {
            this.y.setPadding(p0Var.a, p0Var.b, p0Var.c, p0Var.d);
        } else {
            this.y.setPadding(1, 0, 1, 0);
        }
        q();
        int k = this.z.k(v0Var.c.width());
        if (k < 0) {
            k = v0Var.c.width() - (this.z.d(v0Var.c.width()) + this.z.g(v0Var.c.width()));
        }
        this.F.addView(this.y, new LinearLayout.LayoutParams(k, this.z.c(v0Var.c.height())));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.F.measure(makeMeasureSpec, makeMeasureSpec);
        this.l = this.F.getMeasuredWidth();
        this.k = this.F.getMeasuredHeight();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.k);
        layoutParams.setMargins(this.z.d(v0Var.c.width()), this.z.i(v0Var.c.width()), this.z.g(v0Var.c.width()), this.z.a(v0Var.c.width()));
        this.b.addView(this.F, layoutParams);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(yj yjVar) {
        a(yjVar.v0);
    }

    public void a(boolean z) {
        this.C = z;
    }

    public void a(byte[] bArr) {
        int identifier = !TextUtils.isEmpty(this.z.r0) ? this.c.getResources().getIdentifier(this.z.r0, "drawable", this.c.getPackageName()) : 0;
        try {
            if (identifier > 0) {
                Bitmap a2 = com.comviva.webaxn.utils.e1.b(this.c).a(this.z.r0);
                if (a2 == null && (a2 = BitmapFactory.decodeResource(this.c.getResources(), identifier)) != null) {
                    com.comviva.webaxn.utils.e1.b(this.c).a(this.z.r0, a2);
                }
                this.e = NinePatch.isNinePatchChunk(a2.getNinePatchChunk()) ? new NinePatchDrawable(a2, a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(a2);
                this.F.setBackgroundDrawable(this.e);
                return;
            }
            if (bArr != null) {
                Bitmap a3 = com.comviva.webaxn.utils.e1.b(this.c).a(this.z.O);
                if (a3 == null && (a3 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                    com.comviva.webaxn.utils.e1.b(this.c).a(this.z.O, a3);
                }
                this.e = NinePatch.isNinePatchChunk(a3.getNinePatchChunk()) ? new NinePatchDrawable(a3, a3.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(a3);
                this.F.setBackgroundDrawable(this.e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
    }

    public void b(float f) {
        this.y.setLineSpacing(f, Build.VERSION.SDK_INT >= 16 ? this.y.getLineSpacingMultiplier() : 1.0f);
    }

    public void b(String str) {
        this.x = str;
        this.y.setText(str);
    }

    public void b(yj yjVar) {
        this.z = yjVar;
        int i = yjVar.S;
        if (i > 0) {
            this.y.setLines(i);
            this.y.setEllipsize(TextUtils.TruncateAt.END);
        }
        if (TextUtils.isEmpty(this.z.r1)) {
            return;
        }
        this.F.setContentDescription(this.z.r1);
    }

    public void b(boolean z) {
        this.G = z;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void c() {
        this.z.b = false;
        this.y.setOnClickListener(null);
        this.y.setOnTouchListener(null);
        this.y.setClickable(false);
        this.y.setFocusable(false);
        yj yjVar = this.z;
        if (yjVar.e1) {
            n1.a(this.F, yjVar.d1);
        }
    }

    public void c(float f) {
        this.B = f;
        this.y.setTextSize(f);
    }

    public void c(String str) {
        this.H = str;
    }

    public void c(yj yjVar) {
        com.comviva.webaxn.utils.u uVar = yjVar.p;
        if (uVar != null) {
            i(n1.d(uVar.c()));
            h(n1.d(yjVar.p.b()));
            c(yjVar.p.f());
            g(yjVar.p.g());
            a(yjVar.p.d());
            b(yjVar.p.e());
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void d() {
        this.z.b = true;
        if (this.C) {
            this.y.setOnClickListener(this.I);
            this.y.setOnTouchListener(this.q);
            this.y.setClickable(true);
            this.y.setFocusable(true);
        }
        if (this.z.e1) {
            n1.a(this.F, n1.r);
            this.z.e1 = false;
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public yj f() {
        return this.z;
    }

    public void g(int i) {
        this.y.setTypeface(this.z.p.h(), n1.e(i));
    }

    @Override // com.comviva.webaxn.ui.n1
    public View h() {
        return this.F;
    }

    public void h(int i) {
        this.D = true;
        this.d = i;
        yj yjVar = this.z;
        ej ejVar = yjVar.O0;
        if (ejVar == null) {
            if (yjVar.p.j()) {
                this.F.setBackgroundColor(i);
            }
        } else {
            ejVar.a(this.k);
            Drawable a2 = x1.a(this.z.O0, this.d);
            this.e = a2;
            this.F.setBackgroundDrawable(a2);
        }
    }

    public void i(int i) {
        this.E = true;
        this.A = i;
        this.y.setTextColor(i);
    }

    public String m() {
        return this.x;
    }

    public TextView n() {
        return this.y;
    }

    public String o() {
        return this.H;
    }

    public boolean p() {
        return this.G;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0051, code lost:
    
        if (r4.m != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0058, code lost:
    
        r0 = r4.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x005b, code lost:
    
        r4.y.setGravity(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0056, code lost:
    
        if (r4.m != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q() {
        /*
            r4 = this;
            yj r0 = r4.z
            java.lang.String r0 = r0.g
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r1 = "C"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L61
            yj r0 = r4.z
            java.lang.String r0 = r0.g
            java.lang.String r1 = "Center"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L1c
            goto L61
        L1c:
            yj r0 = r4.z
            java.lang.String r0 = r0.g
            java.lang.String r1 = "L"
            boolean r0 = r0.equalsIgnoreCase(r1)
            r1 = 5
            r2 = 3
            if (r0 != 0) goto L54
            yj r0 = r4.z
            java.lang.String r0 = r0.g
            java.lang.String r3 = "Left"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L37
            goto L54
        L37:
            yj r0 = r4.z
            java.lang.String r0 = r0.g
            java.lang.String r3 = "R"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 != 0) goto L4f
            yj r0 = r4.z
            java.lang.String r0 = r0.g
            java.lang.String r3 = "Right"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L68
        L4f:
            boolean r0 = r4.m
            if (r0 == 0) goto L58
            goto L5b
        L54:
            boolean r0 = r4.m
            if (r0 == 0) goto L5b
        L58:
            android.widget.TextView r0 = r4.y
            goto L65
        L5b:
            android.widget.TextView r0 = r4.y
            r0.setGravity(r2)
            goto L68
        L61:
            android.widget.TextView r0 = r4.y
            r1 = 17
        L65:
            r0.setGravity(r1)
        L68:
            yj r0 = r4.z
            java.lang.String r1 = r0.h
            if (r1 != 0) goto L6f
            return
        L6f:
            java.lang.String r0 = r0.g
            java.lang.String r1 = "M"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto Lc1
            yj r0 = r4.z
            java.lang.String r0 = r0.g
            java.lang.String r1 = "Middle"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L86
            goto Lc1
        L86:
            yj r0 = r4.z
            java.lang.String r0 = r0.g
            java.lang.String r1 = "B"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto Lbc
            yj r0 = r4.z
            java.lang.String r0 = r0.g
            java.lang.String r1 = "Bottom"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L9f
            goto Lbc
        L9f:
            yj r0 = r4.z
            java.lang.String r0 = r0.g
            java.lang.String r1 = "T"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto Lb7
            yj r0 = r4.z
            java.lang.String r0 = r0.g
            java.lang.String r1 = "Top"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto Lc8
        Lb7:
            android.widget.TextView r0 = r4.y
            r1 = 48
            goto Lc5
        Lbc:
            android.widget.TextView r0 = r4.y
            r1 = 80
            goto Lc5
        Lc1:
            android.widget.TextView r0 = r4.y
            r1 = 16
        Lc5:
            r0.setGravity(r1)
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.g0.q():void");
    }
}
