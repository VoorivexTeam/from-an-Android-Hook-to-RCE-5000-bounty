package com.comviva.webaxn.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.comviva.webaxn.utils.p1;
import com.comviva.webaxn.utils.x1;
import com.mtni.myirancell.R;
import defpackage.q2;
import defpackage.vj;
import defpackage.yj;

/* loaded from: classes.dex */
public class f extends n1 {
    private double A;
    private yj B;
    private int C;
    private int D;
    private v0 E;
    private View.OnClickListener F;
    private final x1.o G;
    private ImageView x;
    private LinearLayout y;
    private byte[] z;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (f.this.B.e == 10) {
                f.this.o();
            } else if (f.this.B.e == 11) {
                f.this.p();
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements x1.o {
        b() {
        }

        @Override // com.comviva.webaxn.utils.x1.o
        public void a(boolean z) {
            if (z) {
                if (f.this.B.e == 10) {
                    f fVar = f.this;
                    p1.a(fVar.c, fVar.B, 1, (String) null, 1500);
                } else if (f.this.B.e == 11) {
                    f fVar2 = f.this;
                    p1.a(fVar2.c, fVar2.B);
                }
            }
        }
    }

    public f(Context context, v0 v0Var) {
        super(context);
        this.A = 1.0d;
        this.F = new a();
        this.G = new b();
        this.E = v0Var;
        this.x = new ImageView(context);
        int f0 = com.comviva.webaxn.utils.j1.a(this.c).f0();
        this.h = f0;
        this.h = n1.d(f0);
        LinearLayout linearLayout = new LinearLayout(this.c);
        this.y = linearLayout;
        linearLayout.setOrientation(1);
        vj vjVar = this.B.q1;
        if (vjVar != null) {
            q2.a(this.y, vjVar.a());
        }
        if (TextUtils.isEmpty(this.B.r1)) {
            return;
        }
        this.y.setContentDescription(this.B.r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (com.comviva.webaxn.utils.m1.a(this.c, new String[]{"android.permission.CAMERA"})) {
            p1.a(this.c, this.B, 1, (String) null, 1500);
            return;
        }
        if (com.comviva.webaxn.utils.j1.a(this.c).d("android.permission.CAMERA") == -1) {
            com.comviva.webaxn.utils.m1.a((Activity) this.c, new String[]{"android.permission.CAMERA"}, 2);
        } else {
            if (!com.comviva.webaxn.utils.m1.a(this.c, "android.permission.CAMERA")) {
                x1.d(this.c, "msg.rpCam");
                return;
            }
            com.comviva.webaxn.utils.m1.a((Activity) this.c, new String[]{"android.permission.CAMERA"}, 2);
        }
        ((WebAxnActivity) this.c).b().n().a(this.G);
        x1.v = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (com.comviva.webaxn.utils.m1.a(this.c, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"})) {
            p1.a(this.c, this.B);
            return;
        }
        if (com.comviva.webaxn.utils.j1.a(this.c).d("android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
            com.comviva.webaxn.utils.m1.a((Activity) this.c, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 9);
        } else {
            if (!com.comviva.webaxn.utils.m1.a(this.c, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                x1.d(this.c, "msg.rpStorage");
                return;
            }
            com.comviva.webaxn.utils.m1.a((Activity) this.c, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 9);
        }
        ((WebAxnActivity) this.c).b().n().a(this.G);
        x1.v = true;
    }

    public void a(int i, int i2) {
        int width = ((WindowManager) this.c.getSystemService("window")).getDefaultDisplay().getWidth();
        if (i >= width) {
            i = width;
        }
        this.C = i;
        this.D = i2;
        if (i > 0) {
            this.x.getLayoutParams().width = i;
        }
        if (i2 > 0) {
            this.x.getLayoutParams().height = i2;
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(j0 j0Var, v0 v0Var) {
        a(this.B.k(v0Var.c.width()), this.B.c(com.comviva.webaxn.utils.b.a(this.c).a().b()));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.y.measure(makeMeasureSpec, makeMeasureSpec);
        this.k = this.y.getMeasuredHeight();
        this.l = this.y.getMeasuredWidth();
        this.y.getLayoutParams().height = this.k;
        this.y.getLayoutParams().width = this.l;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(yj yjVar) {
        if (yjVar.x0 == null) {
            if (yjVar.v0 == null && yjVar.r0 == null) {
                return;
            }
            a(yjVar.v0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v19, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v25, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.graphics.Bitmap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(byte[] r9) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.f.a(byte[]):void");
    }

    public void b(yj yjVar) {
        this.B = yjVar;
        if (yjVar.b) {
            this.y.setOnClickListener(this.F);
            this.y.setOnTouchListener(this.q);
        } else {
            this.y.setClickable(false);
            this.y.setFocusable(false);
            n1.a(this.y, this.B.d1);
            this.B.e1 = true;
        }
        this.y.addView(this.x);
        if (this.B.p.j()) {
            c(n1.d(this.B.p.b()));
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void c() {
        this.B.b = false;
        this.y.setOnClickListener(null);
        this.y.setOnTouchListener(null);
        this.y.setClickable(false);
        this.y.setFocusable(false);
        yj yjVar = this.B;
        if (yjVar.e1) {
            n1.a(this.y, yjVar.d1);
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void d() {
        this.B.b = true;
        this.y.setOnClickListener(this.F);
        this.y.setOnTouchListener(this.q);
        this.y.setClickable(true);
        this.y.setFocusable(true);
        if (this.B.e1) {
            n1.a(this.y, n1.r);
            this.B.e1 = false;
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public ImageView e() {
        return this.x;
    }

    @Override // com.comviva.webaxn.ui.n1
    public yj f() {
        return this.B;
    }

    @Override // com.comviva.webaxn.ui.n1
    public View h() {
        return this.y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (r6.m != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        r0.gravity = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        r0.gravity = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r6.m != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.LinearLayout.LayoutParams m() {
        /*
            r6 = this;
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            yj r2 = r6.B
            if (r2 == 0) goto L6d
            java.lang.String r2 = r2.g
            if (r2 != 0) goto Lf
            goto L6d
        Lf:
            java.lang.String r3 = "C"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 != 0) goto L6a
            yj r2 = r6.B
            java.lang.String r2 = r2.g
            java.lang.String r3 = "Center"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L24
            goto L6a
        L24:
            yj r2 = r6.B
            java.lang.String r2 = r2.g
            java.lang.String r3 = "L"
            boolean r2 = r2.equalsIgnoreCase(r3)
            r3 = 5
            r4 = 3
            if (r2 != 0) goto L5e
            yj r2 = r6.B
            java.lang.String r2 = r2.g
            java.lang.String r5 = "Left"
            boolean r2 = r2.equalsIgnoreCase(r5)
            if (r2 == 0) goto L3f
            goto L5e
        L3f:
            yj r2 = r6.B
            java.lang.String r2 = r2.g
            java.lang.String r5 = "R"
            boolean r2 = r2.equalsIgnoreCase(r5)
            if (r2 != 0) goto L57
            yj r2 = r6.B
            java.lang.String r2 = r2.g
            java.lang.String r5 = "Right"
            boolean r2 = r2.equalsIgnoreCase(r5)
            if (r2 == 0) goto L6d
        L57:
            r0.width = r1
            boolean r1 = r6.m
            if (r1 == 0) goto L64
            goto L67
        L5e:
            r0.width = r1
            boolean r1 = r6.m
            if (r1 == 0) goto L67
        L64:
            r0.gravity = r3
            goto L6d
        L67:
            r0.gravity = r4
            goto L6d
        L6a:
            r1 = 1
            r0.gravity = r1
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.f.m():android.widget.LinearLayout$LayoutParams");
    }

    public void n() {
        if (this.z == null && this.B.r0 == null) {
            this.x.setImageBitmap(BitmapFactory.decodeResource(this.c.getResources(), R.drawable.alttext));
        }
        new LinearLayout.LayoutParams(-2, -2);
        LinearLayout.LayoutParams m = m();
        m.setMargins(this.B.d(this.E.c.width()), this.B.i(this.E.c.width()), this.B.g(this.E.c.width()), this.B.a(this.E.c.width()));
        this.b.addView(this.y, m);
    }
}
