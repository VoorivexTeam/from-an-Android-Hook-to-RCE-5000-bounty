package com.comviva.webaxn.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.comviva.webaxn.utils.x1;
import defpackage.dj;
import defpackage.ej;
import defpackage.yj;

/* loaded from: classes.dex */
public class h0 extends g0 {
    private boolean J;
    private ImageView K;
    private Context L;
    LinearLayout M;
    private int N;
    private int O;
    private boolean P;
    private String Q;
    private View.OnClickListener R;
    public View.OnClickListener S;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h0 h0Var = h0.this;
            h0Var.g.b(h0Var.z);
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h0 h0Var = h0.this;
            h0Var.g.b(h0Var);
        }
    }

    public h0(Context context, String str) {
        super(context, str);
        this.K = null;
        this.N = 0;
        this.O = 0;
        this.P = false;
        this.R = new a();
        this.S = new b();
        this.L = context;
        this.J = false;
        this.M = new LinearLayout(context);
        int f0 = com.comviva.webaxn.utils.j1.a(this.L).f0();
        this.h = f0;
        this.h = n1.d(f0);
        c(this.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r4.m != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        r5.setGravity(21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        r5.setGravity(19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (r4.m != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.widget.TextView r5) {
        /*
            r4 = this;
            yj r0 = r4.z
            java.lang.String r0 = r0.g
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r1 = "C"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L62
            yj r0 = r4.z
            java.lang.String r0 = r0.g
            java.lang.String r1 = "Center"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L1c
            goto L62
        L1c:
            yj r0 = r4.z
            java.lang.String r0 = r0.g
            java.lang.String r1 = "L"
            boolean r0 = r0.equalsIgnoreCase(r1)
            r1 = 21
            r2 = 19
            if (r0 != 0) goto L56
            yj r0 = r4.z
            java.lang.String r0 = r0.g
            java.lang.String r3 = "Left"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L39
            goto L56
        L39:
            yj r0 = r4.z
            java.lang.String r0 = r0.g
            java.lang.String r3 = "R"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 != 0) goto L51
            yj r0 = r4.z
            java.lang.String r0 = r0.g
            java.lang.String r3 = "Right"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L67
        L51:
            boolean r0 = r4.m
            if (r0 == 0) goto L5a
            goto L5e
        L56:
            boolean r0 = r4.m
            if (r0 == 0) goto L5e
        L5a:
            r5.setGravity(r1)
            goto L67
        L5e:
            r5.setGravity(r2)
            goto L67
        L62:
            r0 = 17
            r5.setGravity(r0)
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.h0.a(android.widget.TextView):void");
    }

    @Override // com.comviva.webaxn.ui.g0, com.comviva.webaxn.ui.n1
    public void a(j0 j0Var, v0 v0Var) {
        int k = this.z.k(v0Var.c.width());
        this.l = k;
        if (k < 0) {
            this.l = v0Var.c.width() - (this.z.d(v0Var.c.width()) + this.z.g(v0Var.c.width()));
        }
        int i = this.l;
        int e = i - (this.z.e(i) + this.z.h(this.l));
        int c = this.z.c(v0Var.c.height());
        byte[] bArr = this.z.t0;
        if (bArr != null) {
            b(bArr);
            this.K.getLayoutParams().width = this.N;
            this.K.getLayoutParams().height = this.O;
            e -= this.N;
        }
        if (this.x != null) {
            this.y.getLayoutParams().width = e;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.M.measure(makeMeasureSpec, makeMeasureSpec);
        if (c <= 0) {
            c = this.M.getMeasuredHeight();
        }
        this.k = c;
        this.M.getLayoutParams().height = this.k;
        this.M.getLayoutParams().width = this.l;
    }

    @Override // com.comviva.webaxn.ui.g0
    public void a(v0 v0Var) {
        LinearLayout.LayoutParams layoutParams;
        com.comviva.webaxn.utils.u uVar;
        if (this.b != null) {
            if (this.x != null) {
                while (this.x.contains("$$")) {
                    this.x = this.x.replace("$$", "$");
                }
                if (this.x.endsWith("\n")) {
                    String str = this.x;
                    this.x = str.substring(0, str.length() - 1);
                }
                yj yjVar = this.z;
                if (yjVar == null || (uVar = yjVar.p) == null || uVar.g() != 4) {
                    this.y.setText(this.x);
                } else {
                    this.y.setText(Html.fromHtml("<u>".concat(this.x).concat("</u>")));
                }
                if (this.E) {
                    this.y.setTextColor(this.A);
                }
            }
            c(this.d);
            int k = this.z.k(v0Var.c.width());
            this.l = k;
            if (-1 == k) {
                this.l = v0Var.c.width() - (this.z.d(v0Var.c.width()) + this.z.g(v0Var.c.width()));
            }
            int i = this.l;
            int e = i - (this.z.e(i) + this.z.h(this.l));
            int c = this.z.c(v0Var.c.height());
            ImageView imageView = this.K;
            if (imageView != null) {
                imageView.setId(1);
                this.M.setOrientation(0);
                RelativeLayout relativeLayout = new RelativeLayout(this.L);
                this.M.addView(relativeLayout);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.N, this.O);
                layoutParams2.addRule(15);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                if (this.m) {
                    layoutParams2.addRule(11);
                }
                relativeLayout.addView(this.K, layoutParams2);
                int i2 = e - this.N;
                if (this.x != null) {
                    if (this.m) {
                        layoutParams3.addRule(0, this.K.getId());
                    } else {
                        layoutParams3.addRule(1, this.K.getId());
                    }
                    layoutParams3.addRule(15);
                    layoutParams3.width = i2;
                    relativeLayout.addView(this.y, layoutParams3);
                }
                ej ejVar = this.z.O0;
                if (ejVar != null) {
                    ejVar.a(this.k);
                    Drawable a2 = x1.a(this.z.O0, this.d);
                    this.e = a2;
                    this.M.setBackgroundDrawable(a2);
                } else if (this.D) {
                    this.M.setBackgroundColor(this.d);
                }
                if (this.J) {
                    this.M.setClickable(true);
                    this.M.setFocusable(true);
                    this.M.setOnClickListener(this.S);
                    this.M.setOnTouchListener(this.q);
                    this.M.setMinimumHeight(n1.u);
                } else if (TextUtils.isEmpty(this.z.S0)) {
                    n1.a(this.M, this.z.d1);
                    this.z.e1 = true;
                } else {
                    this.M.setOnClickListener(this.R);
                }
                p0 p0Var = this.f;
                if (p0Var != null) {
                    this.y.setPadding(p0Var.a, p0Var.b, p0Var.c, p0Var.d);
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.M.measure(makeMeasureSpec, makeMeasureSpec);
                if (c <= 0) {
                    c = this.M.getMeasuredHeight();
                }
                this.k = c;
                layoutParams = new LinearLayout.LayoutParams(this.l, this.k);
                layoutParams.setMargins(this.z.d(v0Var.c.width()), this.z.i(v0Var.c.width()), this.z.g(v0Var.c.width()), this.z.a(v0Var.c.width()));
                layoutParams.gravity = s();
            } else {
                if (this.x == null) {
                    return;
                }
                LinearLayout linearLayout = new LinearLayout(this.L);
                this.M = linearLayout;
                linearLayout.setOrientation(0);
                if (this.J) {
                    this.M.setOnClickListener(this.S);
                    this.M.setOnTouchListener(this.q);
                    this.M.setTag(this.z);
                    ej ejVar2 = this.z.O0;
                    if (ejVar2 != null) {
                        ejVar2.a(this.k);
                        Drawable a3 = x1.a(this.z.O0, this.d);
                        this.e = a3;
                        this.M.setBackgroundDrawable(a3);
                    } else if (this.D) {
                        this.M.setBackgroundColor(this.d);
                    }
                }
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -1);
                this.y.setFocusable(true);
                layoutParams4.width = e;
                this.M.addView(this.y, layoutParams4);
                p0 p0Var2 = this.f;
                if (p0Var2 != null) {
                    this.y.setPadding(p0Var2.a, p0Var2.b, p0Var2.c, p0Var2.d);
                }
                a(this.y);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.M.measure(makeMeasureSpec2, makeMeasureSpec2);
                if (c <= 0) {
                    c = this.M.getMeasuredHeight();
                }
                this.k = c;
                layoutParams = new LinearLayout.LayoutParams(this.l, this.k);
                layoutParams.gravity = s();
                layoutParams.setMargins(this.z.d(v0Var.c.width()), this.z.i(v0Var.c.width()), this.z.g(v0Var.c.width()), this.z.a(v0Var.c.width()));
            }
            this.b.addView(this.M, layoutParams);
        }
    }

    @Override // com.comviva.webaxn.ui.g0, com.comviva.webaxn.ui.n1
    public void a(yj yjVar) {
        a(yjVar.v0);
    }

    @Override // com.comviva.webaxn.ui.g0
    public void a(boolean z) {
        this.J = z;
    }

    @Override // com.comviva.webaxn.ui.g0
    public void a(byte[] bArr) {
        int identifier = !TextUtils.isEmpty(this.z.r0) ? this.L.getResources().getIdentifier(this.z.r0, "drawable", this.L.getPackageName()) : 0;
        try {
            if (identifier > 0) {
                Bitmap a2 = com.comviva.webaxn.utils.e1.b(this.L).a(this.z.r0);
                if (a2 == null && (a2 = BitmapFactory.decodeResource(this.L.getResources(), identifier)) != null) {
                    com.comviva.webaxn.utils.e1.b(this.L).a(this.z.r0, a2);
                }
                this.e = NinePatch.isNinePatchChunk(a2.getNinePatchChunk()) ? new NinePatchDrawable(a2, a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(a2);
                this.M.setBackgroundDrawable(this.e);
                return;
            }
            if (bArr != null) {
                Bitmap a3 = com.comviva.webaxn.utils.e1.b(this.L).a(this.z.O);
                if (a3 == null && (a3 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                    com.comviva.webaxn.utils.e1.b(this.L).a(this.z.O, a3);
                }
                this.e = NinePatch.isNinePatchChunk(a3.getNinePatchChunk()) ? new NinePatchDrawable(a3, a3.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(a3);
                this.M.setBackgroundDrawable(this.e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.comviva.webaxn.ui.g0
    public void b(boolean z) {
        this.P = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f9  */
    /* JADX WARN: Type inference failed for: r0v28, types: [com.comviva.webaxn.utils.e1] */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.comviva.webaxn.utils.e1] */
    /* JADX WARN: Type inference failed for: r7v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r7v14, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v25, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [android.graphics.Bitmap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(byte[] r7) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.h0.b(byte[]):void");
    }

    @Override // com.comviva.webaxn.ui.g0
    public void c(String str) {
        this.Q = str;
    }

    public void d(String str) {
        this.z.n = str;
        b(str);
    }

    @Override // com.comviva.webaxn.ui.g0, com.comviva.webaxn.ui.n1
    public View h() {
        return this.M;
    }

    @Override // com.comviva.webaxn.ui.g0
    public String o() {
        return this.Q;
    }

    @Override // com.comviva.webaxn.ui.g0
    public boolean p() {
        return this.P;
    }

    public void r() {
        dj djVar = this.z.J0;
        if (djVar != null) {
            n1.a(djVar, h());
        }
    }

    public int s() {
        String str = this.z.g;
        if (str != null) {
            if (str.equalsIgnoreCase("C") || this.z.g.equalsIgnoreCase("Center")) {
                return 17;
            }
            if (this.z.g.equalsIgnoreCase("L") || this.z.g.equalsIgnoreCase("Left")) {
                if (this.m) {
                    return 21;
                }
            } else if (this.z.g.equalsIgnoreCase("R") || this.z.g.equalsIgnoreCase("Right")) {
                if (!this.m) {
                    return 21;
                }
            }
            return 19;
        }
        return 3;
    }
}
