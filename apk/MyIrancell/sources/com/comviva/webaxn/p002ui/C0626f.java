package com.comviva.webaxn.p002ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.comviva.webaxn.utils.C0687b;
import com.comviva.webaxn.utils.C0713j1;
import com.comviva.webaxn.utils.C0722m1;
import com.comviva.webaxn.utils.C0731p1;
import com.comviva.webaxn.utils.C0755x1;
import com.mtni.myirancell.R;
import p000.C3107q2;
import p000.C3361vj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.f */
/* loaded from: classes.dex */
public class C0626f extends AbstractC0652n1 {

    /* renamed from: A */
    private double f3641A;

    /* renamed from: B */
    private C3489yj f3642B;

    /* renamed from: C */
    private int f3643C;

    /* renamed from: D */
    private int f3644D;

    /* renamed from: E */
    private C0669v0 f3645E;

    /* renamed from: F */
    private View.OnClickListener f3646F;

    /* renamed from: G */
    private final C0755x1.o f3647G;

    /* renamed from: x */
    private ImageView f3648x;

    /* renamed from: y */
    private LinearLayout f3649y;

    /* renamed from: z */
    private byte[] f3650z;

    /* renamed from: com.comviva.webaxn.ui.f$a */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C0626f.this.f3642B.f14208e == 10) {
                C0626f.this.m4302o();
            } else if (C0626f.this.f3642B.f14208e == 11) {
                C0626f.this.m4303p();
            }
        }
    }

    /* renamed from: com.comviva.webaxn.ui.f$b */
    /* loaded from: classes.dex */
    class b implements C0755x1.o {
        b() {
        }

        @Override // com.comviva.webaxn.utils.C0755x1.o
        /* renamed from: a */
        public void mo4309a(boolean z) {
            if (z) {
                if (C0626f.this.f3642B.f14208e == 10) {
                    C0626f c0626f = C0626f.this;
                    C0731p1.m5961a(c0626f.f4045c, c0626f.f3642B, 1, (String) null, 1500);
                } else if (C0626f.this.f3642B.f14208e == 11) {
                    C0626f c0626f2 = C0626f.this;
                    C0731p1.m5959a(c0626f2.f4045c, c0626f2.f3642B);
                }
            }
        }
    }

    public C0626f(Context context, C0669v0 c0669v0) {
        super(context);
        this.f3641A = 1.0d;
        this.f3646F = new a();
        this.f3647G = new b();
        this.f3645E = c0669v0;
        this.f3648x = new ImageView(context);
        int m5664f0 = C0713j1.m5563a(this.f4045c).m5664f0();
        this.f4050h = m5664f0;
        this.f4050h = AbstractC0652n1.m4701d(m5664f0);
        LinearLayout linearLayout = new LinearLayout(this.f4045c);
        this.f3649y = linearLayout;
        linearLayout.setOrientation(1);
        C3361vj c3361vj = this.f3642B.f14246q1;
        if (c3361vj != null) {
            C3107q2.m14884a(this.f3649y, c3361vj.m16034a());
        }
        if (TextUtils.isEmpty(this.f3642B.f14249r1)) {
            return;
        }
        this.f3649y.setContentDescription(this.f3642B.f14249r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m4302o() {
        if (C0722m1.m5887a(this.f4045c, new String[]{"android.permission.CAMERA"})) {
            C0731p1.m5961a(this.f4045c, this.f3642B, 1, (String) null, 1500);
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
        ((WebAxnActivity) this.f4045c).m4078b().m16337n().mo4083a(this.f3647G);
        C0755x1.f5264v = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m4303p() {
        if (C0722m1.m5887a(this.f4045c, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"})) {
            C0731p1.m5959a(this.f4045c, this.f3642B);
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
        ((WebAxnActivity) this.f4045c).m4078b().m16337n().mo4083a(this.f3647G);
        C0755x1.f5264v = true;
    }

    /* renamed from: a */
    public void m4304a(int i, int i2) {
        int width = ((WindowManager) this.f4045c.getSystemService("window")).getDefaultDisplay().getWidth();
        if (i >= width) {
            i = width;
        }
        this.f3643C = i;
        this.f3644D = i2;
        if (i > 0) {
            this.f3648x.getLayoutParams().width = i;
        }
        if (i2 > 0) {
            this.f3648x.getLayoutParams().height = i2;
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4174a(C0639j0 c0639j0, C0669v0 c0669v0) {
        m4304a(this.f3642B.m16645k(c0669v0.f4397c.width()), this.f3642B.m16637c(C0687b.m5342a(this.f4045c).m5343a().m5547b()));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f3649y.measure(makeMeasureSpec, makeMeasureSpec);
        this.f4053k = this.f3649y.getMeasuredHeight();
        this.f4054l = this.f3649y.getMeasuredWidth();
        this.f3649y.getLayoutParams().height = this.f4053k;
        this.f3649y.getLayoutParams().width = this.f4054l;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
        if (c3489yj.f14264x0 == null) {
            if (c3489yj.f14260v0 == null && c3489yj.f14248r0 == null) {
                return;
            }
            m4305a(c3489yj.f14260v0);
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
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4305a(byte[] r9) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0626f.m4305a(byte[]):void");
    }

    /* renamed from: b */
    public void m4306b(C3489yj c3489yj) {
        this.f3642B = c3489yj;
        if (c3489yj.f14199b) {
            this.f3649y.setOnClickListener(this.f3646F);
            this.f3649y.setOnTouchListener(this.f4059q);
        } else {
            this.f3649y.setClickable(false);
            this.f3649y.setFocusable(false);
            AbstractC0652n1.m4697a(this.f3649y, this.f3642B.f14207d1);
            this.f3642B.f14210e1 = true;
        }
        this.f3649y.addView(this.f3648x);
        if (this.f3642B.f14241p.m6071j()) {
            m4708c(AbstractC0652n1.m4701d(this.f3642B.f14241p.m6057b()));
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: c */
    public void mo4146c() {
        this.f3642B.f14199b = false;
        this.f3649y.setOnClickListener(null);
        this.f3649y.setOnTouchListener(null);
        this.f3649y.setClickable(false);
        this.f3649y.setFocusable(false);
        C3489yj c3489yj = this.f3642B;
        if (c3489yj.f14210e1) {
            AbstractC0652n1.m4697a(this.f3649y, c3489yj.f14207d1);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: d */
    public void mo4147d() {
        this.f3642B.f14199b = true;
        this.f3649y.setOnClickListener(this.f3646F);
        this.f3649y.setOnTouchListener(this.f4059q);
        this.f3649y.setClickable(true);
        this.f3649y.setFocusable(true);
        if (this.f3642B.f14210e1) {
            AbstractC0652n1.m4697a(this.f3649y, AbstractC0652n1.f4038r);
            this.f3642B.f14210e1 = false;
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: e */
    public ImageView mo4289e() {
        return this.f3648x;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: f */
    public C3489yj mo4148f() {
        return this.f3642B;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: h */
    public View mo4150h() {
        return this.f3649y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (r6.f4055m != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        r0.gravity = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        r0.gravity = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r6.f4055m != false) goto L26;
     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.LinearLayout.LayoutParams m4307m() {
        /*
            r6 = this;
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            yj r2 = r6.f3642B
            if (r2 == 0) goto L6d
            java.lang.String r2 = r2.f14214g
            if (r2 != 0) goto Lf
            goto L6d
        Lf:
            java.lang.String r3 = "C"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 != 0) goto L6a
            yj r2 = r6.f3642B
            java.lang.String r2 = r2.f14214g
            java.lang.String r3 = "Center"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L24
            goto L6a
        L24:
            yj r2 = r6.f3642B
            java.lang.String r2 = r2.f14214g
            java.lang.String r3 = "L"
            boolean r2 = r2.equalsIgnoreCase(r3)
            r3 = 5
            r4 = 3
            if (r2 != 0) goto L5e
            yj r2 = r6.f3642B
            java.lang.String r2 = r2.f14214g
            java.lang.String r5 = "Left"
            boolean r2 = r2.equalsIgnoreCase(r5)
            if (r2 == 0) goto L3f
            goto L5e
        L3f:
            yj r2 = r6.f3642B
            java.lang.String r2 = r2.f14214g
            java.lang.String r5 = "R"
            boolean r2 = r2.equalsIgnoreCase(r5)
            if (r2 != 0) goto L57
            yj r2 = r6.f3642B
            java.lang.String r2 = r2.f14214g
            java.lang.String r5 = "Right"
            boolean r2 = r2.equalsIgnoreCase(r5)
            if (r2 == 0) goto L6d
        L57:
            r0.width = r1
            boolean r1 = r6.f4055m
            if (r1 == 0) goto L64
            goto L67
        L5e:
            r0.width = r1
            boolean r1 = r6.f4055m
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
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0626f.m4307m():android.widget.LinearLayout$LayoutParams");
    }

    /* renamed from: n */
    public void m4308n() {
        if (this.f3650z == null && this.f3642B.f14248r0 == null) {
            this.f3648x.setImageBitmap(BitmapFactory.decodeResource(this.f4045c.getResources(), R.drawable.alttext));
        }
        new LinearLayout.LayoutParams(-2, -2);
        LinearLayout.LayoutParams m4307m = m4307m();
        m4307m.setMargins(this.f3642B.m16638d(this.f3645E.f4397c.width()), this.f3642B.m16643i(this.f3645E.f4397c.width()), this.f3642B.m16641g(this.f3645E.f4397c.width()), this.f3642B.m16632a(this.f3645E.f4397c.width()));
        this.f4044b.addView(this.f3649y, m4307m);
    }
}
