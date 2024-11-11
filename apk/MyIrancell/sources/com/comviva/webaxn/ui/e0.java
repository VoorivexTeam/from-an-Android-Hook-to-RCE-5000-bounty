package com.comviva.webaxn.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.comviva.webaxn.utils.x1;
import defpackage.ej;
import defpackage.q2;
import defpackage.vj;
import defpackage.yj;

/* loaded from: classes.dex */
public class e0 extends n1 {
    private LinearLayout A;
    private boolean B;
    private yj C;
    private v0 D;
    private int E;
    private int F;
    private boolean G;
    private Drawable H;
    private View.OnClickListener I;
    private View.OnClickListener J;
    private ImageView x;
    private ImageView y;
    private TextView z;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!TextUtils.isEmpty(e0.this.C.u1)) {
                e0 e0Var = e0.this;
                e0Var.a(e0Var.C.u1);
            }
            e0 e0Var2 = e0.this;
            e0Var2.g.b(e0Var2);
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e0 e0Var = e0.this;
            e0Var.g.b(e0Var.C);
        }
    }

    public e0(Context context, yj yjVar, v0 v0Var) {
        super(context);
        this.G = false;
        this.I = new a();
        this.J = new b();
        this.D = v0Var;
        this.C = yjVar;
        this.x = yjVar.O0 != null ? new n(context) : new ImageView(context);
        int i = this.C.c1;
        if (i == -1) {
            this.x.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        } else {
            this.x.setScaleType(x1.b(i));
        }
        int f0 = com.comviva.webaxn.utils.j1.a(this.c).f0();
        this.h = f0;
        this.h = n1.d(f0);
        LinearLayout linearLayout = new LinearLayout(this.c);
        this.A = linearLayout;
        vj vjVar = this.C.q1;
        if (vjVar != null) {
            q2.a(linearLayout, vjVar.a());
        }
        if (!TextUtils.isEmpty(this.C.r1)) {
            this.A.setContentDescription(this.C.r1);
        }
        this.A.addView(this.x, new ViewGroup.LayoutParams(-1, -1));
        this.A.setOrientation(1);
        this.B = false;
    }

    public void a(int i, int i2) {
        int width = this.D.c.width() - (this.C.g(this.D.c.width()) + this.C.d(this.D.c.width()));
        if (i >= width) {
            i = width;
        }
        if (i > 0) {
            this.x.getLayoutParams().width = i;
        }
    }

    public void a(Drawable drawable) {
        this.H = drawable;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(j0 j0Var, v0 v0Var) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.A.measure(makeMeasureSpec, makeMeasureSpec);
        this.k = this.A.getMeasuredHeight();
        this.l = this.A.getMeasuredWidth();
        int k = this.C.k(v0Var.c.width());
        int c = this.C.c(v0Var.c.height());
        if (k > 0) {
            this.l = k;
            TextView textView = this.z;
            if (textView != null) {
                textView.setMaxWidth(k);
                this.z.setMinWidth(this.l);
            }
        } else {
            this.l = -1;
        }
        if (c > 0) {
            this.k = c;
        } else {
            this.k = this.F;
        }
        this.A.getLayoutParams().height = this.k;
        this.A.getLayoutParams().width = this.l;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(yj yjVar) {
        if (f().W != null) {
            new m(this.c).a(f().W);
            byte[] bArr = m.d;
            if (bArr != null) {
                yjVar.t0 = bArr;
                yjVar.C0 = true;
            }
        }
        b(yjVar.t0);
        a(yjVar.v0);
    }

    public void a(boolean z) {
        this.G = z;
    }

    public void a(byte[] bArr) {
        int identifier = !TextUtils.isEmpty(this.C.r0) ? this.c.getResources().getIdentifier(this.C.r0, "drawable", this.c.getPackageName()) : 0;
        try {
            if (identifier > 0) {
                Bitmap a2 = com.comviva.webaxn.utils.e1.b(this.c).a(this.C.r0);
                if (a2 == null && (a2 = BitmapFactory.decodeResource(this.c.getResources(), identifier)) != null) {
                    com.comviva.webaxn.utils.e1.b(this.c).a(this.C.r0, a2);
                }
                this.e = NinePatch.isNinePatchChunk(a2.getNinePatchChunk()) ? new NinePatchDrawable(a2, a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(a2);
                this.A.setBackgroundDrawable(this.e);
                return;
            }
            if (bArr != null) {
                Bitmap a3 = com.comviva.webaxn.utils.e1.b(this.c).a(this.C.O);
                if (a3 == null && (a3 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                    com.comviva.webaxn.utils.e1.b(this.c).a(this.C.O, a3);
                }
                this.e = NinePatch.isNinePatchChunk(a3.getNinePatchChunk()) ? new NinePatchDrawable(a3, a3.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(a3);
                this.A.setBackgroundDrawable(this.e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
    }

    public void b(String str) {
        if (str != null) {
            if (this.z == null) {
                TextView textView = new TextView(this.c);
                this.z = textView;
                textView.setGravity(17);
                this.z.setMaxLines(2);
                this.z.setEllipsize(TextUtils.TruncateAt.END);
            }
            this.z.setText(str);
            this.A.addView(this.z, new LinearLayout.LayoutParams(-2, -2));
        }
    }

    public void b(yj yjVar) {
        String str;
        this.C = yjVar;
        if (yjVar.b && (yjVar.i != null || yjVar.k != null || ((str = yjVar.m) != null && (str.equalsIgnoreCase("close") || this.C.m.equalsIgnoreCase("exit"))))) {
            this.A.setOnClickListener(this.I);
            this.A.setOnTouchListener(this.q);
        } else if (TextUtils.isEmpty(this.C.S0)) {
            n1.a(this.A, this.C.d1);
            this.C.e1 = true;
        } else {
            this.A.setOnClickListener(this.J);
        }
        if (this.C.p.j()) {
            c(n1.d(this.C.p.b()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(byte[] r9) {
        /*
            r8 = this;
            yj r0 = r8.C
            com.comviva.webaxn.ui.v0 r1 = r8.D
            android.graphics.Rect r1 = r1.c
            int r1 = r1.width()
            int r0 = r0.k(r1)
            yj r1 = r8.C
            com.comviva.webaxn.ui.v0 r2 = r8.D
            android.graphics.Rect r2 = r2.c
            int r2 = r2.height()
            int r1 = r1.c(r2)
            if (r0 >= 0) goto L26
            com.comviva.webaxn.ui.v0 r0 = r8.D
            android.graphics.Rect r0 = r0.c
            int r0 = r0.width()
        L26:
            r3 = r0
            if (r1 >= 0) goto L31
            com.comviva.webaxn.ui.v0 r0 = r8.D
            android.graphics.Rect r0 = r0.c
            int r1 = r0.height()
        L31:
            r4 = r1
            yj r0 = r8.C
            java.lang.String r0 = r0.p0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L54
            android.content.Context r0 = r8.c
            android.content.res.Resources r0 = r0.getResources()
            yj r1 = r8.C
            java.lang.String r1 = r1.p0
            android.content.Context r2 = r8.c
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r5 = "drawable"
            int r0 = r0.getIdentifier(r1, r5, r2)
            r6 = r0
            goto L56
        L54:
            r0 = 0
            r6 = 0
        L56:
            if (r6 <= 0) goto L6f
            android.content.Context r9 = r8.c     // Catch: java.lang.Exception -> L65 java.lang.OutOfMemoryError -> L6a
            android.content.res.Resources r2 = r9.getResources()     // Catch: java.lang.Exception -> L65 java.lang.OutOfMemoryError -> L6a
            r5 = 1
            r7 = 0
            android.graphics.Bitmap r9 = com.comviva.webaxn.utils.d.a(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L65 java.lang.OutOfMemoryError -> L6a
            goto L90
        L65:
            r9 = move-exception
            r9.printStackTrace()
            goto L8f
        L6a:
            r9 = move-exception
            r9.printStackTrace()
            goto L8f
        L6f:
            if (r9 == 0) goto L7f
            android.content.Context r0 = r8.c     // Catch: java.lang.Exception -> L65 java.lang.OutOfMemoryError -> L6a
            android.content.res.Resources r2 = r0.getResources()     // Catch: java.lang.Exception -> L65 java.lang.OutOfMemoryError -> L6a
            r5 = 0
            r6 = -1
            r7 = r9
            android.graphics.Bitmap r9 = com.comviva.webaxn.utils.d.a(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L65 java.lang.OutOfMemoryError -> L6a
            goto L90
        L7f:
            android.content.Context r9 = r8.c     // Catch: java.lang.Exception -> L65 java.lang.OutOfMemoryError -> L6a
            android.content.res.Resources r2 = r9.getResources()     // Catch: java.lang.Exception -> L65 java.lang.OutOfMemoryError -> L6a
            r5 = 1
            r6 = 2131230820(0x7f080064, float:1.8077704E38)
            r7 = 0
            android.graphics.Bitmap r9 = com.comviva.webaxn.utils.d.a(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L65 java.lang.OutOfMemoryError -> L6a
            goto L90
        L8f:
            r9 = 0
        L90:
            if (r9 == 0) goto La3
            android.widget.ImageView r0 = r8.x
            r0.setImageBitmap(r9)
            int r0 = r9.getWidth()
            r8.E = r0
            int r0 = r9.getHeight()
            r8.F = r0
        La3:
            android.widget.TextView r0 = r8.z
            if (r0 == 0) goto Lbb
            int r1 = r9.getWidth()
            int r1 = r1 + 10
            r0.setMaxWidth(r1)
            android.widget.TextView r0 = r8.z
            int r9 = r9.getWidth()
            int r9 = r9 + 10
            r0.setMinWidth(r9)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.e0.b(byte[]):void");
    }

    @Override // com.comviva.webaxn.ui.n1
    public void c() {
        this.C.b = false;
        this.A.setOnClickListener(null);
        this.A.setOnTouchListener(null);
        this.A.setClickable(false);
        this.A.setFocusable(false);
        yj yjVar = this.C;
        if (yjVar.e1) {
            n1.a(this.A, yjVar.d1);
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void d() {
        String str;
        yj yjVar = this.C;
        yjVar.b = true;
        if (1 == 1 && (yjVar.i != null || yjVar.k != null || ((str = yjVar.m) != null && (str.equalsIgnoreCase("close") || this.C.m.equalsIgnoreCase("exit"))))) {
            this.A.setOnClickListener(this.I);
            this.A.setOnTouchListener(this.q);
            this.A.setClickable(true);
            this.A.setFocusable(true);
        }
        if (this.C.e1) {
            n1.a(this.A, n1.r);
            this.C.e1 = false;
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public ImageView e() {
        return this.x;
    }

    @Override // com.comviva.webaxn.ui.n1
    public yj f() {
        return this.C;
    }

    @Override // com.comviva.webaxn.ui.n1
    public View h() {
        return this.A;
    }

    @Override // com.comviva.webaxn.ui.n1
    public boolean l() {
        x1.e(this.c, "msg.ImgEmpty");
        return false;
    }

    public float m() {
        return this.C.p.f();
    }

    public Drawable n() {
        return this.H;
    }

    public boolean o() {
        return this.G;
    }

    public int p() {
        String str;
        yj yjVar = this.C;
        if (yjVar != null && (str = yjVar.g) != null) {
            if (str.equalsIgnoreCase("C") || this.C.g.equalsIgnoreCase("Center")) {
                return 1;
            }
            if (this.C.g.equalsIgnoreCase("L") || this.C.g.equalsIgnoreCase("Left")) {
                if (this.m) {
                    return 5;
                }
            } else if ((this.C.g.equalsIgnoreCase("R") || this.C.g.equalsIgnoreCase("Right")) && !this.m) {
                return 5;
            }
        }
        return 3;
    }

    public void q() {
        if (this.B) {
            RelativeLayout relativeLayout = new RelativeLayout(this.c);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams2.addRule(12, -1);
            relativeLayout.addView(this.y, layoutParams2);
            this.b.addView(relativeLayout, layoutParams);
            return;
        }
        TextView textView = this.z;
        com.comviva.webaxn.utils.u uVar = this.C.p;
        if (uVar != null) {
            if (textView != null && uVar.k()) {
                this.z.setTextColor(n1.d(this.C.p.c()));
            }
            yj yjVar = this.C;
            ej ejVar = yjVar.O0;
            if (ejVar != null) {
                ejVar.a(this.k);
                Drawable a2 = x1.a(this.C.O0, this.d);
                this.e = a2;
                this.A.setBackgroundDrawable(a2);
            } else if (yjVar.p.j()) {
                this.A.setBackgroundColor(n1.d(this.C.p.b()));
            }
            TextView textView2 = this.z;
            if (textView2 != null) {
                textView2.setTextSize(m());
            }
        }
        if (this.f != null) {
            this.A.setPadding(this.C.e(this.D.c.width()), this.C.j(this.D.c.width()), this.C.h(this.D.c.width()), this.C.b(this.D.c.width()));
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.A.measure(makeMeasureSpec, makeMeasureSpec);
        this.k = this.A.getMeasuredHeight();
        this.l = this.A.getMeasuredWidth();
        int k = this.C.k(this.D.c.width());
        int c = this.C.c(this.D.c.height());
        if (k > 0) {
            this.l = k;
            TextView textView3 = this.z;
            if (textView3 != null) {
                textView3.setMaxWidth(k);
                this.z.setMinWidth(this.l);
            }
        } else {
            this.l = -1;
        }
        if (c > 0) {
            this.k = c;
        } else {
            this.k = this.F;
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(this.l, this.k);
        layoutParams3.gravity = p();
        layoutParams3.setMargins(this.C.d(this.D.c.width()), this.C.i(this.D.c.width()), this.C.g(this.D.c.width()), this.C.a(this.D.c.width()));
        this.b.addView(this.A, layoutParams3);
    }
}
