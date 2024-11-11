package com.comviva.webaxn.ui;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import android.widget.ImageView;
import com.comviva.webaxn.utils.p1;
import com.comviva.webaxn.utils.x1;
import defpackage.yj;

/* loaded from: classes.dex */
public class g extends n1 {
    private int A;
    private float B;
    private View.OnClickListener C;
    private final x1.o D;
    private ImageView x;
    private yj y;
    private int z;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (g.this.y.e == 10) {
                g.this.n();
            } else if (g.this.y.e == 11) {
                g.this.o();
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
                if (g.this.y.e == 10) {
                    g gVar = g.this;
                    p1.a(gVar.c, gVar.y, 1, (String) null, 1500);
                } else if (g.this.y.e == 11) {
                    g gVar2 = g.this;
                    p1.a(gVar2.c, gVar2.y);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(android.content.Context r4, defpackage.yj r5, com.comviva.webaxn.ui.j0 r6) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.g.<init>(android.content.Context, yj, com.comviva.webaxn.ui.j0):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (com.comviva.webaxn.utils.m1.a(this.c, new String[]{"android.permission.CAMERA"})) {
            p1.a(this.c, this.y, 1, (String) null, 1500);
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
        ((WebAxnActivity) this.c).b().n().a(this.D);
        x1.v = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (com.comviva.webaxn.utils.m1.a(this.c, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"})) {
            p1.a(this.c, this.y);
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
        ((WebAxnActivity) this.c).b().n().a(this.D);
        x1.v = true;
    }

    public int a(AbsoluteLayout.LayoutParams layoutParams, v0 v0Var) {
        int i = layoutParams.width;
        if (i > 0) {
            this.z = i;
            this.A = (int) (this.B * i);
        }
        int i2 = layoutParams.height;
        if (i2 > 0) {
            this.A = i2;
            if (layoutParams.width < 0) {
                this.z = (int) (i2 / this.B);
            }
        }
        this.l = this.z;
        this.k = this.A;
        this.x.setLayoutParams(new AbsoluteLayout.LayoutParams(this.l, this.k, layoutParams.x, layoutParams.y));
        return this.k;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(AbsoluteLayout.LayoutParams layoutParams) {
        ((AbsoluteLayout.LayoutParams) this.x.getLayoutParams()).x = layoutParams.x;
        ((AbsoluteLayout.LayoutParams) this.x.getLayoutParams()).y = layoutParams.y;
        if (layoutParams.width > 0) {
            ((AbsoluteLayout.LayoutParams) this.x.getLayoutParams()).width = layoutParams.width;
        }
        if (layoutParams.height > 0) {
            ((AbsoluteLayout.LayoutParams) this.x.getLayoutParams()).height = layoutParams.height;
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(yj yjVar) {
        if (yjVar.x0 == null && (yjVar.v0 != null || yjVar.r0 != null)) {
            a(yjVar.v0);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.x.measure(makeMeasureSpec, makeMeasureSpec);
        this.l = this.x.getMeasuredWidth();
        this.k = this.x.getMeasuredHeight();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(byte[] r6) {
        /*
            r5 = this;
            yj r0 = r5.y
            java.lang.String r0 = r0.r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 != 0) goto L22
            android.content.Context r0 = r5.c
            android.content.res.Resources r0 = r0.getResources()
            yj r2 = r5.y
            java.lang.String r2 = r2.r0
            android.content.Context r3 = r5.c
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r4 = "drawable"
            int r0 = r0.getIdentifier(r2, r4, r3)
            goto L23
        L22:
            r0 = 0
        L23:
            r2 = 0
            if (r0 <= 0) goto L60
            android.content.Context r6 = r5.c     // Catch: java.lang.Exception -> L54 java.lang.OutOfMemoryError -> L5a
            com.comviva.webaxn.utils.e1 r6 = com.comviva.webaxn.utils.e1.b(r6)     // Catch: java.lang.Exception -> L54 java.lang.OutOfMemoryError -> L5a
            yj r1 = r5.y     // Catch: java.lang.Exception -> L54 java.lang.OutOfMemoryError -> L5a
            java.lang.String r1 = r1.r0     // Catch: java.lang.Exception -> L54 java.lang.OutOfMemoryError -> L5a
            android.graphics.Bitmap r6 = r6.a(r1)     // Catch: java.lang.Exception -> L54 java.lang.OutOfMemoryError -> L5a
            if (r6 != 0) goto L8c
            android.content.Context r1 = r5.c     // Catch: java.lang.Exception -> L50 java.lang.OutOfMemoryError -> L52
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Exception -> L50 java.lang.OutOfMemoryError -> L52
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeResource(r1, r0)     // Catch: java.lang.Exception -> L50 java.lang.OutOfMemoryError -> L52
            if (r6 == 0) goto L8c
            android.content.Context r0 = r5.c     // Catch: java.lang.Exception -> L50 java.lang.OutOfMemoryError -> L52
            com.comviva.webaxn.utils.e1 r0 = com.comviva.webaxn.utils.e1.b(r0)     // Catch: java.lang.Exception -> L50 java.lang.OutOfMemoryError -> L52
            yj r1 = r5.y     // Catch: java.lang.Exception -> L50 java.lang.OutOfMemoryError -> L52
            java.lang.String r1 = r1.r0     // Catch: java.lang.Exception -> L50 java.lang.OutOfMemoryError -> L52
            r0.a(r1, r6)     // Catch: java.lang.Exception -> L50 java.lang.OutOfMemoryError -> L52
            goto L8c
        L50:
            r0 = move-exception
            goto L56
        L52:
            r0 = move-exception
            goto L5c
        L54:
            r0 = move-exception
            r6 = r2
        L56:
            r0.printStackTrace()
            goto L8c
        L5a:
            r0 = move-exception
            r6 = r2
        L5c:
            r0.printStackTrace()
            goto L8c
        L60:
            if (r6 == 0) goto L8b
            android.content.Context r0 = r5.c     // Catch: java.lang.Exception -> L8b
            com.comviva.webaxn.utils.e1 r0 = com.comviva.webaxn.utils.e1.b(r0)     // Catch: java.lang.Exception -> L8b
            yj r3 = r5.y     // Catch: java.lang.Exception -> L8b
            java.lang.String r3 = r3.O     // Catch: java.lang.Exception -> L8b
            android.graphics.Bitmap r0 = r0.a(r3)     // Catch: java.lang.Exception -> L8b
            if (r0 != 0) goto L89
            int r3 = r6.length     // Catch: java.lang.Exception -> L89
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeByteArray(r6, r1, r3)     // Catch: java.lang.Exception -> L89
            if (r6 == 0) goto L8c
            android.content.Context r0 = r5.c     // Catch: java.lang.Exception -> L87
            com.comviva.webaxn.utils.e1 r0 = com.comviva.webaxn.utils.e1.b(r0)     // Catch: java.lang.Exception -> L87
            yj r1 = r5.y     // Catch: java.lang.Exception -> L87
            java.lang.String r1 = r1.O     // Catch: java.lang.Exception -> L87
            r0.a(r1, r6)     // Catch: java.lang.Exception -> L87
            goto L8c
        L87:
            goto L8c
        L89:
            r6 = r0
            goto L8c
        L8b:
            r6 = r2
        L8c:
            if (r6 != 0) goto Lb4
            android.content.Context r6 = r5.c
            com.comviva.webaxn.utils.e1 r6 = com.comviva.webaxn.utils.e1.b(r6)
            java.lang.String r0 = "alttext"
            android.graphics.Bitmap r6 = r6.a(r0)
            if (r6 != 0) goto Lb4
            android.content.Context r6 = r5.c
            android.content.res.Resources r6 = r6.getResources()
            r1 = 2131230820(0x7f080064, float:1.8077704E38)
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeResource(r6, r1)
            if (r6 == 0) goto Lb4
            android.content.Context r1 = r5.c
            com.comviva.webaxn.utils.e1 r1 = com.comviva.webaxn.utils.e1.b(r1)
            r1.a(r0, r6)
        Lb4:
            byte[] r0 = r6.getNinePatchChunk()
            boolean r0 = android.graphics.NinePatch.isNinePatchChunk(r0)
            if (r0 == 0) goto Lcd
            android.graphics.drawable.NinePatchDrawable r0 = new android.graphics.drawable.NinePatchDrawable
            byte[] r1 = r6.getNinePatchChunk()
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r0.<init>(r6, r1, r3, r2)
            goto Ld2
        Lcd:
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r6)
        Ld2:
            android.widget.ImageView r1 = r5.x
            r1.setImageDrawable(r0)
            int r0 = r6.getWidth()
            r5.z = r0
            int r6 = r6.getHeight()
            r5.A = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.g.a(byte[]):void");
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b() {
        this.b.removeView(this.x);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b(AbsoluteLayout.LayoutParams layoutParams) {
        int i = layoutParams.width;
        if (i > 0) {
            this.z = i;
            this.A = (int) (this.B * i);
        }
        int i2 = layoutParams.height;
        if (i2 > 0) {
            this.A = i2;
            if (layoutParams.width < 0) {
                this.z = (int) (i2 / this.B);
            }
        }
        this.x.getLayoutParams().width = this.z;
        ViewGroup.LayoutParams layoutParams2 = this.x.getLayoutParams();
        int i3 = this.A;
        layoutParams2.height = i3;
        this.l = this.z;
        this.k = i3;
    }

    public void b(yj yjVar) {
        this.y = yjVar;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void c() {
        this.y.b = false;
        this.x.setOnClickListener(null);
        this.x.setOnTouchListener(null);
        this.x.setClickable(false);
        this.x.setFocusable(false);
        yj yjVar = this.y;
        if (yjVar.e1) {
            n1.a(this.x, yjVar.d1);
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void d() {
        this.y.b = true;
        this.x.setOnClickListener(this.C);
        this.x.setOnTouchListener(this.q);
        this.x.setClickable(true);
        this.x.setFocusable(true);
        if (this.y.e1) {
            n1.a(this.x, n1.r);
            this.y.e1 = false;
        }
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

    @Override // com.comviva.webaxn.ui.n1
    public boolean l() {
        x1.e(this.c, "msg.ImgEmpty");
        return false;
    }

    public void m() {
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.addView(this.x);
            this.b.invalidate();
        }
    }
}
