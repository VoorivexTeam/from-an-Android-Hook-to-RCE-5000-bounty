package com.comviva.webaxn.p002ui;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import android.widget.ImageView;
import com.comviva.webaxn.utils.C0713j1;
import com.comviva.webaxn.utils.C0722m1;
import com.comviva.webaxn.utils.C0731p1;
import com.comviva.webaxn.utils.C0755x1;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.g */
/* loaded from: classes.dex */
public class C0629g extends AbstractC0652n1 {

    /* renamed from: A */
    private int f3697A;

    /* renamed from: B */
    private float f3698B;

    /* renamed from: C */
    private View.OnClickListener f3699C;

    /* renamed from: D */
    private final C0755x1.o f3700D;

    /* renamed from: x */
    private ImageView f3701x;

    /* renamed from: y */
    private C3489yj f3702y;

    /* renamed from: z */
    private int f3703z;

    /* renamed from: com.comviva.webaxn.ui.g$a */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C0629g.this.f3702y.f14208e == 10) {
                C0629g.this.m4356n();
            } else if (C0629g.this.f3702y.f14208e == 11) {
                C0629g.this.m4357o();
            }
        }
    }

    /* renamed from: com.comviva.webaxn.ui.g$b */
    /* loaded from: classes.dex */
    class b implements C0755x1.o {
        b() {
        }

        @Override // com.comviva.webaxn.utils.C0755x1.o
        /* renamed from: a */
        public void mo4309a(boolean z) {
            if (z) {
                if (C0629g.this.f3702y.f14208e == 10) {
                    C0629g c0629g = C0629g.this;
                    C0731p1.m5961a(c0629g.f4045c, c0629g.f3702y, 1, (String) null, 1500);
                } else if (C0629g.this.f3702y.f14208e == 11) {
                    C0629g c0629g2 = C0629g.this;
                    C0731p1.m5959a(c0629g2.f4045c, c0629g2.f3702y);
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
    public C0629g(android.content.Context r4, p000.C3489yj r5, com.comviva.webaxn.p002ui.C0639j0 r6) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0629g.<init>(android.content.Context, yj, com.comviva.webaxn.ui.j0):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m4356n() {
        if (C0722m1.m5887a(this.f4045c, new String[]{"android.permission.CAMERA"})) {
            C0731p1.m5961a(this.f4045c, this.f3702y, 1, (String) null, 1500);
            return;
        }
        if (C0713j1.m5563a(this.f4045c).m5647d("android.permission.CAMERA") == -1) {
            C0722m1.m5885a((Activity) this.f4045c, new String[]{"android.permission.CAMERA"}, 2);
        } else {
            if (!C0722m1.m5886a(this.f4045c, "android.permission.CAMERA")) {
                C0755x1.m6181d(this.f4045c, "msg.rpCam");
                return;
            }
            C0722m1.m5885a((Activity) this.f4045c, new String[]{"android.permission.CAMERA"}, 2);
        }
        ((WebAxnActivity) this.f4045c).m4078b().m16337n().mo4083a(this.f3700D);
        C0755x1.f5264v = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m4357o() {
        if (C0722m1.m5887a(this.f4045c, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"})) {
            C0731p1.m5959a(this.f4045c, this.f3702y);
            return;
        }
        if (C0713j1.m5563a(this.f4045c).m5647d("android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
            C0722m1.m5885a((Activity) this.f4045c, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 9);
        } else {
            if (!C0722m1.m5886a(this.f4045c, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                C0755x1.m6181d(this.f4045c, "msg.rpStorage");
                return;
            }
            C0722m1.m5885a((Activity) this.f4045c, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 9);
        }
        ((WebAxnActivity) this.f4045c).m4078b().m16337n().mo4083a(this.f3700D);
        C0755x1.f5264v = true;
    }

    /* renamed from: a */
    public int m4358a(AbsoluteLayout.LayoutParams layoutParams, C0669v0 c0669v0) {
        int i = layoutParams.width;
        if (i > 0) {
            this.f3703z = i;
            this.f3697A = (int) (this.f3698B * i);
        }
        int i2 = layoutParams.height;
        if (i2 > 0) {
            this.f3697A = i2;
            if (layoutParams.width < 0) {
                this.f3703z = (int) (i2 / this.f3698B);
            }
        }
        this.f4054l = this.f3703z;
        this.f4053k = this.f3697A;
        this.f3701x.setLayoutParams(new AbsoluteLayout.LayoutParams(this.f4054l, this.f4053k, layoutParams.x, layoutParams.y));
        return this.f4053k;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4139a(AbsoluteLayout.LayoutParams layoutParams) {
        ((AbsoluteLayout.LayoutParams) this.f3701x.getLayoutParams()).x = layoutParams.x;
        ((AbsoluteLayout.LayoutParams) this.f3701x.getLayoutParams()).y = layoutParams.y;
        if (layoutParams.width > 0) {
            ((AbsoluteLayout.LayoutParams) this.f3701x.getLayoutParams()).width = layoutParams.width;
        }
        if (layoutParams.height > 0) {
            ((AbsoluteLayout.LayoutParams) this.f3701x.getLayoutParams()).height = layoutParams.height;
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
        if (c3489yj.f14264x0 == null && (c3489yj.f14260v0 != null || c3489yj.f14248r0 != null)) {
            m4359a(c3489yj.f14260v0);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f3701x.measure(makeMeasureSpec, makeMeasureSpec);
        this.f4054l = this.f3701x.getMeasuredWidth();
        this.f4053k = this.f3701x.getMeasuredHeight();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4359a(byte[] r6) {
        /*
            r5 = this;
            yj r0 = r5.f3702y
            java.lang.String r0 = r0.f14248r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 != 0) goto L22
            android.content.Context r0 = r5.f4045c
            android.content.res.Resources r0 = r0.getResources()
            yj r2 = r5.f3702y
            java.lang.String r2 = r2.f14248r0
            android.content.Context r3 = r5.f4045c
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r4 = "drawable"
            int r0 = r0.getIdentifier(r2, r4, r3)
            goto L23
        L22:
            r0 = 0
        L23:
            r2 = 0
            if (r0 <= 0) goto L60
            android.content.Context r6 = r5.f4045c     // Catch: java.lang.Exception -> L54 java.lang.OutOfMemoryError -> L5a
            com.comviva.webaxn.utils.e1 r6 = com.comviva.webaxn.utils.C0698e1.m5426b(r6)     // Catch: java.lang.Exception -> L54 java.lang.OutOfMemoryError -> L5a
            yj r1 = r5.f3702y     // Catch: java.lang.Exception -> L54 java.lang.OutOfMemoryError -> L5a
            java.lang.String r1 = r1.f14248r0     // Catch: java.lang.Exception -> L54 java.lang.OutOfMemoryError -> L5a
            android.graphics.Bitmap r6 = r6.m5429a(r1)     // Catch: java.lang.Exception -> L54 java.lang.OutOfMemoryError -> L5a
            if (r6 != 0) goto L8c
            android.content.Context r1 = r5.f4045c     // Catch: java.lang.Exception -> L50 java.lang.OutOfMemoryError -> L52
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Exception -> L50 java.lang.OutOfMemoryError -> L52
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeResource(r1, r0)     // Catch: java.lang.Exception -> L50 java.lang.OutOfMemoryError -> L52
            if (r6 == 0) goto L8c
            android.content.Context r0 = r5.f4045c     // Catch: java.lang.Exception -> L50 java.lang.OutOfMemoryError -> L52
            com.comviva.webaxn.utils.e1 r0 = com.comviva.webaxn.utils.C0698e1.m5426b(r0)     // Catch: java.lang.Exception -> L50 java.lang.OutOfMemoryError -> L52
            yj r1 = r5.f3702y     // Catch: java.lang.Exception -> L50 java.lang.OutOfMemoryError -> L52
            java.lang.String r1 = r1.f14248r0     // Catch: java.lang.Exception -> L50 java.lang.OutOfMemoryError -> L52
            r0.m5432a(r1, r6)     // Catch: java.lang.Exception -> L50 java.lang.OutOfMemoryError -> L52
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
            android.content.Context r0 = r5.f4045c     // Catch: java.lang.Exception -> L8b
            com.comviva.webaxn.utils.e1 r0 = com.comviva.webaxn.utils.C0698e1.m5426b(r0)     // Catch: java.lang.Exception -> L8b
            yj r3 = r5.f3702y     // Catch: java.lang.Exception -> L8b
            java.lang.String r3 = r3.f14172O     // Catch: java.lang.Exception -> L8b
            android.graphics.Bitmap r0 = r0.m5429a(r3)     // Catch: java.lang.Exception -> L8b
            if (r0 != 0) goto L89
            int r3 = r6.length     // Catch: java.lang.Exception -> L89
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeByteArray(r6, r1, r3)     // Catch: java.lang.Exception -> L89
            if (r6 == 0) goto L8c
            android.content.Context r0 = r5.f4045c     // Catch: java.lang.Exception -> L87
            com.comviva.webaxn.utils.e1 r0 = com.comviva.webaxn.utils.C0698e1.m5426b(r0)     // Catch: java.lang.Exception -> L87
            yj r1 = r5.f3702y     // Catch: java.lang.Exception -> L87
            java.lang.String r1 = r1.f14172O     // Catch: java.lang.Exception -> L87
            r0.m5432a(r1, r6)     // Catch: java.lang.Exception -> L87
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
            android.content.Context r6 = r5.f4045c
            com.comviva.webaxn.utils.e1 r6 = com.comviva.webaxn.utils.C0698e1.m5426b(r6)
            java.lang.String r0 = "alttext"
            android.graphics.Bitmap r6 = r6.m5429a(r0)
            if (r6 != 0) goto Lb4
            android.content.Context r6 = r5.f4045c
            android.content.res.Resources r6 = r6.getResources()
            r1 = 2131230820(0x7f080064, float:1.8077704E38)
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeResource(r6, r1)
            if (r6 == 0) goto Lb4
            android.content.Context r1 = r5.f4045c
            com.comviva.webaxn.utils.e1 r1 = com.comviva.webaxn.utils.C0698e1.m5426b(r1)
            r1.m5432a(r0, r6)
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
            android.widget.ImageView r1 = r5.f3701x
            r1.setImageDrawable(r0)
            int r0 = r6.getWidth()
            r5.f3703z = r0
            int r6 = r6.getHeight()
            r5.f3697A = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0629g.m4359a(byte[]):void");
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4142b() {
        this.f4044b.removeView(this.f3701x);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4143b(AbsoluteLayout.LayoutParams layoutParams) {
        int i = layoutParams.width;
        if (i > 0) {
            this.f3703z = i;
            this.f3697A = (int) (this.f3698B * i);
        }
        int i2 = layoutParams.height;
        if (i2 > 0) {
            this.f3697A = i2;
            if (layoutParams.width < 0) {
                this.f3703z = (int) (i2 / this.f3698B);
            }
        }
        this.f3701x.getLayoutParams().width = this.f3703z;
        ViewGroup.LayoutParams layoutParams2 = this.f3701x.getLayoutParams();
        int i3 = this.f3697A;
        layoutParams2.height = i3;
        this.f4054l = this.f3703z;
        this.f4053k = i3;
    }

    /* renamed from: b */
    public void m4360b(C3489yj c3489yj) {
        this.f3702y = c3489yj;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: c */
    public void mo4146c() {
        this.f3702y.f14199b = false;
        this.f3701x.setOnClickListener(null);
        this.f3701x.setOnTouchListener(null);
        this.f3701x.setClickable(false);
        this.f3701x.setFocusable(false);
        C3489yj c3489yj = this.f3702y;
        if (c3489yj.f14210e1) {
            AbstractC0652n1.m4697a(this.f3701x, c3489yj.f14207d1);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: d */
    public void mo4147d() {
        this.f3702y.f14199b = true;
        this.f3701x.setOnClickListener(this.f3699C);
        this.f3701x.setOnTouchListener(this.f4059q);
        this.f3701x.setClickable(true);
        this.f3701x.setFocusable(true);
        if (this.f3702y.f14210e1) {
            AbstractC0652n1.m4697a(this.f3701x, AbstractC0652n1.f4038r);
            this.f3702y.f14210e1 = false;
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: e */
    public ImageView mo4289e() {
        return this.f3701x;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: f */
    public C3489yj mo4148f() {
        return this.f3702y;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: h */
    public View mo4150h() {
        return this.f3701x;
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

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: l */
    public boolean mo4290l() {
        C0755x1.m6185e(this.f4045c, "msg.ImgEmpty");
        return false;
    }

    /* renamed from: m */
    public void m4361m() {
        ViewGroup viewGroup = this.f4044b;
        if (viewGroup != null) {
            viewGroup.addView(this.f3701x);
            this.f4044b.invalidate();
        }
    }
}
