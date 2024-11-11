package com.comviva.webaxn.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.AbsoluteLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.comviva.webaxn.utils.x1;
import defpackage.yj;

/* loaded from: classes.dex */
public class f0 extends n1 {
    private static int K;
    private static float L;
    private TextView A;
    private int B;
    private int C;
    private double D;
    private j0 E;
    private String[] F;
    private boolean G;
    private Drawable H;
    private View.OnClickListener I;
    private View.OnClickListener J;
    private ImageView x;
    private yj y;
    private LinearLayout z;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!TextUtils.isEmpty(f0.this.y.u1)) {
                f0 f0Var = f0.this;
                f0Var.a(f0Var.y.u1);
            }
            f0 f0Var2 = f0.this;
            f0Var2.g.b(f0Var2);
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f0 f0Var = f0.this;
            f0Var.g.b(f0Var.y);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f0(android.content.Context r12, defpackage.yj r13, com.comviva.webaxn.ui.j0 r14) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.f0.<init>(android.content.Context, yj, com.comviva.webaxn.ui.j0):void");
    }

    private void q() {
        if (TextUtils.isEmpty(this.y.V0)) {
            return;
        }
        try {
            AnimationDrawable a2 = j1.a(this.c).a(this.y.V);
            if (a2 == null || a2.getNumberOfFrames() != this.F.length) {
                j1.a(this.c).a(this.y.V0, this.y.V, this.F);
                a2 = j1.a(this.c).a(this.y.V);
            }
            if (a2 != null) {
                if (Build.VERSION.SDK_INT >= 16) {
                    this.x.setBackground(a2);
                } else {
                    this.x.setBackgroundDrawable(a2);
                }
                c(this.y.V);
            }
        } catch (Exception unused) {
        }
    }

    public int a(AbsoluteLayout.LayoutParams layoutParams, v0 v0Var) {
        int width = v0Var != null ? v0Var.c.width() - (this.y.g(v0Var.c.width()) + this.y.d(v0Var.c.width())) : 0;
        int i = layoutParams.width;
        if (i > 0) {
            this.B = i;
            int i2 = layoutParams.height;
            if (i2 > 0) {
                this.C = i2;
            } else {
                double d = i;
                double d2 = this.D;
                Double.isNaN(d);
                this.C = (int) (d * d2);
            }
        } else {
            int i3 = layoutParams.height;
            if (i3 > 0) {
                this.C = i3;
                double d3 = i3;
                double d4 = this.D;
                Double.isNaN(d3);
                this.B = (int) (d3 / d4);
            }
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.B, this.C);
        layoutParams2.gravity = 17;
        int i4 = this.y.c1;
        if (i4 == -1) {
            this.x.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            this.x.setScaleType(x1.b(i4));
        }
        this.x.setLayoutParams(layoutParams2);
        this.x.setAdjustViewBounds(false);
        if (v0Var != null && width < this.B) {
            this.B = width;
            double d5 = width;
            double d6 = this.D;
            Double.isNaN(d5);
            this.C = (int) (d5 * d6);
            ((LinearLayout.LayoutParams) this.x.getLayoutParams()).width = this.B;
            ((LinearLayout.LayoutParams) this.x.getLayoutParams()).height = this.C;
        }
        if (this.A != null && x1.a(this.y) == null) {
            this.A.getLayoutParams().width = this.B + K;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.z.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredWidth = this.z.getMeasuredWidth();
        this.l = measuredWidth;
        int i5 = layoutParams.width;
        if (i5 > 0 && measuredWidth > i5) {
            this.l = i5;
            if (this.A != null && x1.a(this.y) == null) {
                this.A.getLayoutParams().width = this.l;
            }
        }
        if (v0Var != null && width < this.l) {
            this.l = width;
        }
        this.k = this.z.getMeasuredHeight();
        if (layoutParams.height <= 0 && this.A == null) {
            double d7 = this.l;
            double d8 = this.D;
            Double.isNaN(d7);
            this.k = (int) (d7 * d8);
        }
        this.z.setLayoutParams(new AbsoluteLayout.LayoutParams(this.l, this.k, layoutParams.x, layoutParams.y));
        return this.k;
    }

    public void a(float f) {
        TextView textView = this.A;
        if (textView == null || Build.VERSION.SDK_INT < 21) {
            return;
        }
        textView.setLetterSpacing(f);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(int i) {
        super.a(i);
        this.z.setBackgroundColor(i);
        c(this.d);
    }

    public void a(Drawable drawable) {
        this.H = drawable;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(AbsoluteLayout.LayoutParams layoutParams) {
        ((AbsoluteLayout.LayoutParams) this.z.getLayoutParams()).x = layoutParams.x;
        ((AbsoluteLayout.LayoutParams) this.z.getLayoutParams()).y = layoutParams.y;
        if (layoutParams.width > 0) {
            ((AbsoluteLayout.LayoutParams) this.z.getLayoutParams()).width = layoutParams.width;
        }
        if (layoutParams.height > 0) {
            ((AbsoluteLayout.LayoutParams) this.z.getLayoutParams()).height = layoutParams.height;
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(p0 p0Var) {
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(yj yjVar) {
        if (TextUtils.isEmpty(this.y.V0)) {
            b(yjVar.t0);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            this.z.measure(makeMeasureSpec, makeMeasureSpec);
            this.l = this.z.getMeasuredWidth();
            this.k = this.z.getMeasuredHeight();
            a(yjVar.v0);
        }
    }

    public void a(boolean z) {
        this.G = z;
    }

    public void a(byte[] bArr) {
        if (TextUtils.isEmpty(this.y.V0)) {
            int identifier = !TextUtils.isEmpty(this.y.r0) ? this.c.getResources().getIdentifier(this.y.r0, "drawable", this.c.getPackageName()) : 0;
            try {
                if (identifier > 0) {
                    Bitmap a2 = com.comviva.webaxn.utils.e1.b(this.c).a(this.y.r0);
                    if (a2 == null && (a2 = BitmapFactory.decodeResource(this.c.getResources(), identifier)) != null) {
                        com.comviva.webaxn.utils.e1.b(this.c).a(this.y.r0, a2);
                    }
                    this.e = NinePatch.isNinePatchChunk(a2.getNinePatchChunk()) ? new NinePatchDrawable(a2, a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(a2);
                    this.z.setBackgroundDrawable(this.e);
                    return;
                }
                if (bArr != null) {
                    Bitmap a3 = com.comviva.webaxn.utils.e1.b(this.c).a(this.y.O);
                    if (a3 == null && (a3 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                        com.comviva.webaxn.utils.e1.b(this.c).a(this.y.O, a3);
                    }
                    this.e = NinePatch.isNinePatchChunk(a3.getNinePatchChunk()) ? new NinePatchDrawable(a3, a3.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(a3);
                    this.z.setBackgroundDrawable(this.e);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } catch (OutOfMemoryError e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b() {
        if (!TextUtils.isEmpty(this.y.V0)) {
            d(this.y.V);
        }
        this.b.removeView(this.z);
        this.z.removeAllViews();
        this.z.setBackgroundDrawable(null);
        this.z.removeAllViewsInLayout();
        this.z = null;
        this.e = null;
        this.x = null;
        this.y = null;
        this.A = null;
        this.E = null;
    }

    public void b(float f) {
        TextView textView = this.A;
        if (textView != null) {
            textView.setTextSize(f);
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b(int i) {
        super.b(i);
        TextView textView = this.A;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void b(String str) {
        LinearLayout.LayoutParams layoutParams;
        if (str != null) {
            if (this.A == null) {
                TextView textView = new TextView(this.c);
                this.A = textView;
                textView.setGravity(49);
                if (x1.a(this.y) == null) {
                    this.A.setLines(2);
                    this.A.setEllipsize(TextUtils.TruncateAt.END);
                    layoutParams = new LinearLayout.LayoutParams(this.B + K, -2);
                } else {
                    this.A.setLines(1);
                    layoutParams = new LinearLayout.LayoutParams(-2, -2);
                }
                TextView textView2 = this.A;
                layoutParams.gravity = 17;
                this.z.addView(textView2, layoutParams);
            }
            this.A.setText(str);
        }
    }

    public void b(yj yjVar) {
        this.y = yjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(byte[] r11) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.f0.b(byte[]):void");
    }

    @Override // com.comviva.webaxn.ui.n1
    public void c() {
        this.y.b = false;
        this.z.setOnTouchListener(null);
        this.z.setOnClickListener(null);
        this.z.setClickable(false);
        this.z.setFocusable(false);
        yj yjVar = this.y;
        if (yjVar.e1) {
            n1.a(this.z, yjVar.d1);
        }
        if (TextUtils.isEmpty(this.y.V0)) {
            return;
        }
        d(this.y.V);
    }

    public void c(String str) {
        j1.a(this.c).b(str);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void d() {
        String str;
        yj yjVar = this.y;
        yjVar.b = true;
        if (1 == 1 && (yjVar.i != null || yjVar.k != null || ((str = yjVar.m) != null && (str.equalsIgnoreCase("close") || this.y.m.equalsIgnoreCase("exit"))))) {
            this.z.setOnClickListener(this.I);
            this.z.setOnTouchListener(this.q);
            this.z.setClickable(true);
            this.z.setFocusable(true);
        }
        if (this.y.e1) {
            n1.a(this.z, n1.r);
            this.y.e1 = false;
        }
        if (TextUtils.isEmpty(this.y.V0)) {
            return;
        }
        c(this.y.V);
    }

    public void d(String str) {
        j1.a(this.c).c(str);
    }

    @Override // com.comviva.webaxn.ui.n1
    public ImageView e() {
        return this.x;
    }

    @Override // com.comviva.webaxn.ui.n1
    public yj f() {
        return this.y;
    }

    @Override // com.comviva.webaxn.ui.n1
    public View h() {
        return this.z;
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
    public boolean l() {
        x1.e(this.c, "msg.ImgEmpty");
        return false;
    }

    public Drawable m() {
        return this.H;
    }

    public boolean n() {
        yj yjVar = this.y.A0;
        return yjVar != null && yjVar.i0 == 4;
    }

    public boolean o() {
        return this.G;
    }

    public void p() {
        if (this.b != null) {
            int d = com.comviva.webaxn.utils.b.a(this.c).a().d() / 3;
            com.comviva.webaxn.utils.u uVar = this.y.p;
            if (uVar != null) {
                if (uVar.k()) {
                    b(n1.d(this.y.p.c()));
                }
                if (this.y.p.j()) {
                    a(n1.d(this.y.p.b()));
                }
            }
            this.b.addView(this.z);
            this.b.invalidate();
            q();
        }
    }
}
