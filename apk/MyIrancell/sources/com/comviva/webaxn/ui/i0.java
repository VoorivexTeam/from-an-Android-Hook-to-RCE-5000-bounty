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
import android.widget.AbsoluteLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.comviva.webaxn.utils.x1;
import defpackage.dj;
import defpackage.ej;
import defpackage.q2;
import defpackage.vj;
import defpackage.yj;

/* loaded from: classes.dex */
public class i0 extends n1 {
    private static float N;
    private Context A;
    private yj B;
    private LinearLayout C;
    private String D;
    private int E;
    public boolean F;
    public int G;
    private int H;
    private j0 I;
    private boolean J;
    private String K;
    private View.OnClickListener L;
    private View.OnClickListener M;
    private boolean x;
    private ImageView y;
    private TextView z;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i0 i0Var = i0.this;
            i0Var.g.b(i0Var);
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i0 i0Var = i0.this;
            i0Var.g.b(i0Var.B);
        }
    }

    public i0(Context context, yj yjVar, String str, j0 j0Var) {
        super(context);
        com.comviva.webaxn.utils.u uVar;
        this.y = null;
        this.z = null;
        this.E = 0;
        this.F = false;
        this.H = 30;
        this.J = false;
        this.L = new a();
        this.M = new b();
        this.A = context;
        this.I = j0Var;
        this.B = yjVar;
        float a2 = com.comviva.webaxn.utils.b.a(context).a().a();
        N = a2;
        this.H = (int) (this.H * a2);
        ej ejVar = this.B.O0;
        if (ejVar != null) {
            ejVar.a(j0Var.f);
        }
        if (yjVar.e == 27 && str != null && str.endsWith("\n")) {
            str = str.substring(0, str.indexOf("\n"));
        }
        this.D = str;
        this.z = new TextView(context);
        if (yjVar == null || (uVar = yjVar.p) == null || uVar.g() != 4) {
            this.z.setText(this.D);
        } else {
            this.z.setText(Html.fromHtml("<u>".concat(this.D).concat("</u>")));
        }
        int f0 = com.comviva.webaxn.utils.j1.a(this.A).f0();
        this.h = f0;
        this.h = n1.d(f0);
        c(this.d);
        this.C = new LinearLayout(this.A);
        if (!TextUtils.isEmpty(this.B.r1)) {
            this.C.setContentDescription(this.B.r1);
        }
        vj vjVar = this.B.q1;
        if (vjVar != null) {
            q2.a(this.C, vjVar.a());
        }
        this.C.setOrientation(0);
    }

    public int a(TextView textView) {
        String str = this.B.g;
        if (str != null) {
            if (str.equalsIgnoreCase("C") || this.B.g.equalsIgnoreCase("Center")) {
                return 17;
            }
            if (this.B.g.equalsIgnoreCase("L") || this.B.g.equalsIgnoreCase("Left")) {
                if (this.m) {
                    return 5;
                }
            } else if ((this.B.g.equalsIgnoreCase("R") || this.B.g.equalsIgnoreCase("Right")) && !this.m) {
                return 5;
            }
        }
        return 3;
    }

    public void a(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.z.setLetterSpacing(f);
        }
    }

    public void a(Spanned spanned) {
        this.z.setText(spanned);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(AbsoluteLayout.LayoutParams layoutParams) {
        ((AbsoluteLayout.LayoutParams) this.C.getLayoutParams()).x = layoutParams.x;
        ((AbsoluteLayout.LayoutParams) this.C.getLayoutParams()).y = layoutParams.y;
        if (layoutParams.width > 0) {
            ((AbsoluteLayout.LayoutParams) this.C.getLayoutParams()).width = layoutParams.width;
        }
        if (layoutParams.height > 0) {
            ((AbsoluteLayout.LayoutParams) this.C.getLayoutParams()).height = layoutParams.height;
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(p0 p0Var) {
        int i = p0Var.a;
        int i2 = p0Var.c;
        if (this.m) {
            i2 = i;
            i = i2;
        }
        this.C.setPadding(i, p0Var.b, i2, p0Var.d);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.C.measure(makeMeasureSpec, makeMeasureSpec);
        int i3 = this.I.e;
        if (i3 <= 0 && i3 != -3) {
            this.l = this.C.getMeasuredWidth();
        }
        this.k = this.C.getMeasuredHeight();
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(yj yjVar) {
        b(yjVar.t0);
        a(yjVar.v0);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.C.measure(makeMeasureSpec, makeMeasureSpec);
        this.l = this.C.getMeasuredWidth();
        this.k = this.C.getMeasuredHeight();
    }

    public void a(boolean z) {
        this.x = z;
    }

    public void a(byte[] bArr) {
        int identifier = !TextUtils.isEmpty(this.B.r0) ? this.A.getResources().getIdentifier(this.B.r0, "drawable", this.A.getPackageName()) : 0;
        try {
            if (identifier > 0) {
                Bitmap a2 = com.comviva.webaxn.utils.e1.b(this.A).a(this.B.r0);
                if (a2 == null && (a2 = BitmapFactory.decodeResource(this.A.getResources(), identifier)) != null) {
                    com.comviva.webaxn.utils.e1.b(this.A).a(this.B.r0, a2);
                }
                this.e = NinePatch.isNinePatchChunk(a2.getNinePatchChunk()) ? new NinePatchDrawable(a2, a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(a2);
                this.C.setBackgroundDrawable(this.e);
                return;
            }
            if (bArr != null) {
                Bitmap a3 = com.comviva.webaxn.utils.e1.b(this.A).a(this.B.O);
                if (a3 == null && (a3 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                    com.comviva.webaxn.utils.e1.b(this.A).a(this.B.O, a3);
                }
                this.e = NinePatch.isNinePatchChunk(a3.getNinePatchChunk()) ? new NinePatchDrawable(a3, a3.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(a3);
                this.C.setBackgroundDrawable(this.e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
    }

    public int b(TextView textView) {
        yj yjVar = this.B;
        if (yjVar.h == null || yjVar.g.equalsIgnoreCase("M") || this.B.g.equalsIgnoreCase("Middle")) {
            return 17;
        }
        if (this.B.g.equalsIgnoreCase("B") || this.B.g.equalsIgnoreCase("Bottom")) {
            return 80;
        }
        return (this.B.g.equalsIgnoreCase("T") || this.B.g.equalsIgnoreCase("Top")) ? 48 : 17;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b() {
        this.b.removeView(this.C);
        this.C.removeAllViews();
        this.C.setBackgroundDrawable(null);
        this.C.removeAllViewsInLayout();
        this.e = null;
        this.C = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.I = null;
    }

    public void b(float f) {
        this.z.setLineSpacing(f, Build.VERSION.SDK_INT >= 16 ? this.z.getLineSpacingMultiplier() : 1.0f);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b(int i) {
        super.b(i);
        this.z.setTextColor(i);
    }

    public void b(String str) {
        this.B.n = str;
        c(str);
    }

    public void b(yj yjVar) {
        this.B = yjVar;
    }

    public void b(boolean z) {
        this.J = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f9  */
    /* JADX WARN: Type inference failed for: r0v33, types: [com.comviva.webaxn.utils.e1] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.comviva.webaxn.utils.e1] */
    /* JADX WARN: Type inference failed for: r7v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v24, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r7v27, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v38, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [android.graphics.Bitmap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(byte[] r7) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.i0.b(byte[]):void");
    }

    public int c(AbsoluteLayout.LayoutParams layoutParams) {
        TextView textView;
        String str = this.D;
        boolean z = (str == null || this.B.n == null || str.length() != this.B.n.length()) ? false : true;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        if (this.y != null) {
            layoutParams2.setMargins(0, 0, 0, 0);
        }
        if (this.m) {
            TextView textView2 = this.z;
            if (textView2 != null) {
                this.C.addView(textView2, layoutParams3);
            }
            ImageView imageView = this.y;
            if (imageView != null) {
                this.C.addView(imageView, layoutParams2);
            }
        } else {
            ImageView imageView2 = this.y;
            if (imageView2 != null) {
                this.C.addView(imageView2, layoutParams2);
            }
            TextView textView3 = this.z;
            if (textView3 != null) {
                this.C.addView(textView3, layoutParams3);
            }
        }
        TextView textView4 = this.z;
        if (textView4 != null) {
            ((LinearLayout.LayoutParams) textView4.getLayoutParams()).gravity = 16;
        }
        ej ejVar = this.B.O0;
        if (ejVar != null) {
            Drawable a2 = x1.a(ejVar, this.d);
            this.e = a2;
            this.C.setBackgroundDrawable(a2);
        } else if (this.F) {
            this.C.setBackgroundColor(this.G);
        } else {
            this.C.setBackgroundColor(0);
        }
        if (this.x) {
            this.C.setClickable(true);
            this.C.setFocusable(true);
            this.C.setOnClickListener(this.L);
            this.C.setOnTouchListener(this.q);
            this.C.setTag(this.B);
        } else if (TextUtils.isEmpty(this.B.S0)) {
            n1.a(this.C, this.B.d1);
            this.B.e1 = true;
        } else {
            this.C.setOnClickListener(this.M);
        }
        this.C.setLayoutParams(new AbsoluteLayout.LayoutParams(layoutParams.width, -2, layoutParams.x, layoutParams.y));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        if (layoutParams.width > this.E) {
            if (z && (textView = this.z) != null) {
                textView.setGravity(a(textView));
            }
            this.z.getLayoutParams().width = layoutParams.width - this.E;
            this.C.measure(makeMeasureSpec, makeMeasureSpec);
            this.l = layoutParams.width;
            this.k = this.C.getMeasuredHeight();
        } else {
            this.C.measure(makeMeasureSpec, makeMeasureSpec);
            this.l = this.C.getMeasuredWidth();
            this.k = this.C.getMeasuredHeight();
            if (this.x && z) {
                int i = this.l;
                int i2 = this.H;
                if (i < i2) {
                    this.l = i2;
                }
            }
        }
        this.C.setGravity(a(this.z) | b(this.z));
        return this.k;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void c() {
        this.B.b = false;
        this.C.setOnClickListener(null);
        this.C.setOnTouchListener(null);
        this.C.setClickable(false);
        this.C.setFocusable(false);
        yj yjVar = this.B;
        if (yjVar.e1) {
            n1.a(this.C, yjVar.d1);
        }
    }

    public void c(float f) {
        this.z.setTextSize(f);
    }

    public void c(String str) {
        this.z.setText(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(defpackage.yj r5) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.i0.c(yj):void");
    }

    @Override // com.comviva.webaxn.ui.n1
    public void d() {
        this.B.b = true;
        if (this.x) {
            this.C.setOnClickListener(this.L);
            this.C.setOnTouchListener(this.q);
            this.C.setClickable(true);
            this.C.setFocusable(true);
        }
        if (this.B.e1) {
            n1.a(this.C, n1.r);
            this.B.e1 = false;
        }
    }

    public void d(String str) {
        this.K = str;
    }

    @Override // com.comviva.webaxn.ui.n1
    public yj f() {
        return this.B;
    }

    public void g(int i) {
        this.z.setTypeface(this.B.p.h(), n1.e(i));
    }

    @Override // com.comviva.webaxn.ui.n1
    public View h() {
        return this.C;
    }

    public void h(int i) {
        this.z.setMaxLines(i);
        this.z.setLines(i);
        if (1 == i) {
            this.z.setSingleLine(true);
        }
        this.z.setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override // com.comviva.webaxn.ui.n1
    public int i() {
        return this.k;
    }

    public void i(int i) {
        this.F = true;
        this.G = i;
        this.C.setBackgroundColor(i);
    }

    @Override // com.comviva.webaxn.ui.n1
    public int j() {
        return this.l;
    }

    public void j(int i) {
        this.z.setTextColor(i);
    }

    public TextView m() {
        return this.z;
    }

    public String n() {
        return this.K;
    }

    public boolean o() {
        return this.J;
    }

    public void p() {
        dj djVar = this.B.J0;
        if (djVar != null) {
            n1.a(djVar, h());
        }
    }

    public void q() {
        if (this.b != null) {
            com.comviva.webaxn.utils.u uVar = this.B.p;
            if (uVar != null && uVar.k()) {
                b(n1.d(this.B.p.c()));
            }
            this.b.addView(this.C);
            this.b.invalidate();
        }
    }
}
