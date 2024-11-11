package com.comviva.webaxn.p002ui;

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
import com.comviva.webaxn.utils.C0698e1;
import com.comviva.webaxn.utils.C0713j1;
import com.comviva.webaxn.utils.C0744u;
import com.comviva.webaxn.utils.C0755x1;
import p000.C2434ej;
import p000.C3107q2;
import p000.C3361vj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.e0 */
/* loaded from: classes.dex */
public class C0624e0 extends AbstractC0652n1 {

    /* renamed from: A */
    private LinearLayout f3616A;

    /* renamed from: B */
    private boolean f3617B;

    /* renamed from: C */
    private C3489yj f3618C;

    /* renamed from: D */
    private C0669v0 f3619D;

    /* renamed from: E */
    private int f3620E;

    /* renamed from: F */
    private int f3621F;

    /* renamed from: G */
    private boolean f3622G;

    /* renamed from: H */
    private Drawable f3623H;

    /* renamed from: I */
    private View.OnClickListener f3624I;

    /* renamed from: J */
    private View.OnClickListener f3625J;

    /* renamed from: x */
    private ImageView f3626x;

    /* renamed from: y */
    private ImageView f3627y;

    /* renamed from: z */
    private TextView f3628z;

    /* renamed from: com.comviva.webaxn.ui.e0$a */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!TextUtils.isEmpty(C0624e0.this.f3618C.f14258u1)) {
                C0624e0 c0624e0 = C0624e0.this;
                c0624e0.m4707a(c0624e0.f3618C.f14258u1);
            }
            C0624e0 c0624e02 = C0624e0.this;
            c0624e02.f4049g.mo4849b(c0624e02);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.e0$b */
    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0624e0 c0624e0 = C0624e0.this;
            c0624e0.f4049g.mo4850b(c0624e0.f3618C);
        }
    }

    public C0624e0(Context context, C3489yj c3489yj, C0669v0 c0669v0) {
        super(context);
        this.f3622G = false;
        this.f3624I = new a();
        this.f3625J = new b();
        this.f3619D = c0669v0;
        this.f3618C = c3489yj;
        this.f3626x = c3489yj.f14173O0 != null ? new C0650n(context) : new ImageView(context);
        int i = this.f3618C.f14204c1;
        if (i == -1) {
            this.f3626x.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        } else {
            this.f3626x.setScaleType(C0755x1.m6165b(i));
        }
        int m5664f0 = C0713j1.m5563a(this.f4045c).m5664f0();
        this.f4050h = m5664f0;
        this.f4050h = AbstractC0652n1.m4701d(m5664f0);
        LinearLayout linearLayout = new LinearLayout(this.f4045c);
        this.f3616A = linearLayout;
        C3361vj c3361vj = this.f3618C.f14246q1;
        if (c3361vj != null) {
            C3107q2.m14884a(linearLayout, c3361vj.m16034a());
        }
        if (!TextUtils.isEmpty(this.f3618C.f14249r1)) {
            this.f3616A.setContentDescription(this.f3618C.f14249r1);
        }
        this.f3616A.addView(this.f3626x, new ViewGroup.LayoutParams(-1, -1));
        this.f3616A.setOrientation(1);
        this.f3617B = false;
    }

    /* renamed from: a */
    public void m4282a(int i, int i2) {
        int width = this.f3619D.f4397c.width() - (this.f3618C.m16641g(this.f3619D.f4397c.width()) + this.f3618C.m16638d(this.f3619D.f4397c.width()));
        if (i >= width) {
            i = width;
        }
        if (i > 0) {
            this.f3626x.getLayoutParams().width = i;
        }
    }

    /* renamed from: a */
    public void m4283a(Drawable drawable) {
        this.f3623H = drawable;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4174a(C0639j0 c0639j0, C0669v0 c0669v0) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f3616A.measure(makeMeasureSpec, makeMeasureSpec);
        this.f4053k = this.f3616A.getMeasuredHeight();
        this.f4054l = this.f3616A.getMeasuredWidth();
        int m16645k = this.f3618C.m16645k(c0669v0.f4397c.width());
        int m16637c = this.f3618C.m16637c(c0669v0.f4397c.height());
        if (m16645k > 0) {
            this.f4054l = m16645k;
            TextView textView = this.f3628z;
            if (textView != null) {
                textView.setMaxWidth(m16645k);
                this.f3628z.setMinWidth(this.f4054l);
            }
        } else {
            this.f4054l = -1;
        }
        if (m16637c > 0) {
            this.f4053k = m16637c;
        } else {
            this.f4053k = this.f3621F;
        }
        this.f3616A.getLayoutParams().height = this.f4053k;
        this.f3616A.getLayoutParams().width = this.f4054l;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
        if (mo4148f().f14188W != null) {
            new C0647m(this.f4045c).m4682a(mo4148f().f14188W);
            byte[] bArr = C0647m.f4008d;
            if (bArr != null) {
                c3489yj.f14254t0 = bArr;
                c3489yj.f14149C0 = true;
            }
        }
        m4288b(c3489yj.f14254t0);
        m4285a(c3489yj.f14260v0);
    }

    /* renamed from: a */
    public void m4284a(boolean z) {
        this.f3622G = z;
    }

    /* renamed from: a */
    public void m4285a(byte[] bArr) {
        int identifier = !TextUtils.isEmpty(this.f3618C.f14248r0) ? this.f4045c.getResources().getIdentifier(this.f3618C.f14248r0, "drawable", this.f4045c.getPackageName()) : 0;
        try {
            if (identifier > 0) {
                Bitmap m5429a = C0698e1.m5426b(this.f4045c).m5429a(this.f3618C.f14248r0);
                if (m5429a == null && (m5429a = BitmapFactory.decodeResource(this.f4045c.getResources(), identifier)) != null) {
                    C0698e1.m5426b(this.f4045c).m5432a(this.f3618C.f14248r0, m5429a);
                }
                this.f4047e = NinePatch.isNinePatchChunk(m5429a.getNinePatchChunk()) ? new NinePatchDrawable(m5429a, m5429a.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a);
                this.f3616A.setBackgroundDrawable(this.f4047e);
                return;
            }
            if (bArr != null) {
                Bitmap m5429a2 = C0698e1.m5426b(this.f4045c).m5429a(this.f3618C.f14172O);
                if (m5429a2 == null && (m5429a2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                    C0698e1.m5426b(this.f4045c).m5432a(this.f3618C.f14172O, m5429a2);
                }
                this.f4047e = NinePatch.isNinePatchChunk(m5429a2.getNinePatchChunk()) ? new NinePatchDrawable(m5429a2, m5429a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a2);
                this.f3616A.setBackgroundDrawable(this.f4047e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: b */
    public void m4286b(String str) {
        if (str != null) {
            if (this.f3628z == null) {
                TextView textView = new TextView(this.f4045c);
                this.f3628z = textView;
                textView.setGravity(17);
                this.f3628z.setMaxLines(2);
                this.f3628z.setEllipsize(TextUtils.TruncateAt.END);
            }
            this.f3628z.setText(str);
            this.f3616A.addView(this.f3628z, new LinearLayout.LayoutParams(-2, -2));
        }
    }

    /* renamed from: b */
    public void m4287b(C3489yj c3489yj) {
        String str;
        this.f3618C = c3489yj;
        if (c3489yj.f14199b && (c3489yj.f14220i != null || c3489yj.f14226k != null || ((str = c3489yj.f14232m) != null && (str.equalsIgnoreCase("close") || this.f3618C.f14232m.equalsIgnoreCase("exit"))))) {
            this.f3616A.setOnClickListener(this.f3624I);
            this.f3616A.setOnTouchListener(this.f4059q);
        } else if (TextUtils.isEmpty(this.f3618C.f14181S0)) {
            AbstractC0652n1.m4697a(this.f3616A, this.f3618C.f14207d1);
            this.f3618C.f14210e1 = true;
        } else {
            this.f3616A.setOnClickListener(this.f3625J);
        }
        if (this.f3618C.f14241p.m6071j()) {
            m4708c(AbstractC0652n1.m4701d(this.f3618C.f14241p.m6057b()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4288b(byte[] r9) {
        /*
            r8 = this;
            yj r0 = r8.f3618C
            com.comviva.webaxn.ui.v0 r1 = r8.f3619D
            android.graphics.Rect r1 = r1.f4397c
            int r1 = r1.width()
            int r0 = r0.m16645k(r1)
            yj r1 = r8.f3618C
            com.comviva.webaxn.ui.v0 r2 = r8.f3619D
            android.graphics.Rect r2 = r2.f4397c
            int r2 = r2.height()
            int r1 = r1.m16637c(r2)
            if (r0 >= 0) goto L26
            com.comviva.webaxn.ui.v0 r0 = r8.f3619D
            android.graphics.Rect r0 = r0.f4397c
            int r0 = r0.width()
        L26:
            r3 = r0
            if (r1 >= 0) goto L31
            com.comviva.webaxn.ui.v0 r0 = r8.f3619D
            android.graphics.Rect r0 = r0.f4397c
            int r1 = r0.height()
        L31:
            r4 = r1
            yj r0 = r8.f3618C
            java.lang.String r0 = r0.f14242p0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L54
            android.content.Context r0 = r8.f4045c
            android.content.res.Resources r0 = r0.getResources()
            yj r1 = r8.f3618C
            java.lang.String r1 = r1.f14242p0
            android.content.Context r2 = r8.f4045c
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
            android.content.Context r9 = r8.f4045c     // Catch: java.lang.Exception -> L65 java.lang.OutOfMemoryError -> L6a
            android.content.res.Resources r2 = r9.getResources()     // Catch: java.lang.Exception -> L65 java.lang.OutOfMemoryError -> L6a
            r5 = 1
            r7 = 0
            android.graphics.Bitmap r9 = com.comviva.webaxn.utils.AsyncTaskC0693d.m5404a(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L65 java.lang.OutOfMemoryError -> L6a
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
            android.content.Context r0 = r8.f4045c     // Catch: java.lang.Exception -> L65 java.lang.OutOfMemoryError -> L6a
            android.content.res.Resources r2 = r0.getResources()     // Catch: java.lang.Exception -> L65 java.lang.OutOfMemoryError -> L6a
            r5 = 0
            r6 = -1
            r7 = r9
            android.graphics.Bitmap r9 = com.comviva.webaxn.utils.AsyncTaskC0693d.m5404a(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L65 java.lang.OutOfMemoryError -> L6a
            goto L90
        L7f:
            android.content.Context r9 = r8.f4045c     // Catch: java.lang.Exception -> L65 java.lang.OutOfMemoryError -> L6a
            android.content.res.Resources r2 = r9.getResources()     // Catch: java.lang.Exception -> L65 java.lang.OutOfMemoryError -> L6a
            r5 = 1
            r6 = 2131230820(0x7f080064, float:1.8077704E38)
            r7 = 0
            android.graphics.Bitmap r9 = com.comviva.webaxn.utils.AsyncTaskC0693d.m5404a(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L65 java.lang.OutOfMemoryError -> L6a
            goto L90
        L8f:
            r9 = 0
        L90:
            if (r9 == 0) goto La3
            android.widget.ImageView r0 = r8.f3626x
            r0.setImageBitmap(r9)
            int r0 = r9.getWidth()
            r8.f3620E = r0
            int r0 = r9.getHeight()
            r8.f3621F = r0
        La3:
            android.widget.TextView r0 = r8.f3628z
            if (r0 == 0) goto Lbb
            int r1 = r9.getWidth()
            int r1 = r1 + 10
            r0.setMaxWidth(r1)
            android.widget.TextView r0 = r8.f3628z
            int r9 = r9.getWidth()
            int r9 = r9 + 10
            r0.setMinWidth(r9)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0624e0.m4288b(byte[]):void");
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: c */
    public void mo4146c() {
        this.f3618C.f14199b = false;
        this.f3616A.setOnClickListener(null);
        this.f3616A.setOnTouchListener(null);
        this.f3616A.setClickable(false);
        this.f3616A.setFocusable(false);
        C3489yj c3489yj = this.f3618C;
        if (c3489yj.f14210e1) {
            AbstractC0652n1.m4697a(this.f3616A, c3489yj.f14207d1);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: d */
    public void mo4147d() {
        String str;
        C3489yj c3489yj = this.f3618C;
        c3489yj.f14199b = true;
        if (1 == 1 && (c3489yj.f14220i != null || c3489yj.f14226k != null || ((str = c3489yj.f14232m) != null && (str.equalsIgnoreCase("close") || this.f3618C.f14232m.equalsIgnoreCase("exit"))))) {
            this.f3616A.setOnClickListener(this.f3624I);
            this.f3616A.setOnTouchListener(this.f4059q);
            this.f3616A.setClickable(true);
            this.f3616A.setFocusable(true);
        }
        if (this.f3618C.f14210e1) {
            AbstractC0652n1.m4697a(this.f3616A, AbstractC0652n1.f4038r);
            this.f3618C.f14210e1 = false;
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: e */
    public ImageView mo4289e() {
        return this.f3626x;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: f */
    public C3489yj mo4148f() {
        return this.f3618C;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: h */
    public View mo4150h() {
        return this.f3616A;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: l */
    public boolean mo4290l() {
        C0755x1.m6185e(this.f4045c, "msg.ImgEmpty");
        return false;
    }

    /* renamed from: m */
    public float m4291m() {
        return this.f3618C.f14241p.m6067f();
    }

    /* renamed from: n */
    public Drawable m4292n() {
        return this.f3623H;
    }

    /* renamed from: o */
    public boolean m4293o() {
        return this.f3622G;
    }

    /* renamed from: p */
    public int m4294p() {
        String str;
        C3489yj c3489yj = this.f3618C;
        if (c3489yj != null && (str = c3489yj.f14214g) != null) {
            if (str.equalsIgnoreCase("C") || this.f3618C.f14214g.equalsIgnoreCase("Center")) {
                return 1;
            }
            if (this.f3618C.f14214g.equalsIgnoreCase("L") || this.f3618C.f14214g.equalsIgnoreCase("Left")) {
                if (this.f4055m) {
                    return 5;
                }
            } else if ((this.f3618C.f14214g.equalsIgnoreCase("R") || this.f3618C.f14214g.equalsIgnoreCase("Right")) && !this.f4055m) {
                return 5;
            }
        }
        return 3;
    }

    /* renamed from: q */
    public void m4295q() {
        if (this.f3617B) {
            RelativeLayout relativeLayout = new RelativeLayout(this.f4045c);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams2.addRule(12, -1);
            relativeLayout.addView(this.f3627y, layoutParams2);
            this.f4044b.addView(relativeLayout, layoutParams);
            return;
        }
        TextView textView = this.f3628z;
        C0744u c0744u = this.f3618C.f14241p;
        if (c0744u != null) {
            if (textView != null && c0744u.m6072k()) {
                this.f3628z.setTextColor(AbstractC0652n1.m4701d(this.f3618C.f14241p.m6062c()));
            }
            C3489yj c3489yj = this.f3618C;
            C2434ej c2434ej = c3489yj.f14173O0;
            if (c2434ej != null) {
                c2434ej.m11615a(this.f4053k);
                Drawable m6122a = C0755x1.m6122a(this.f3618C.f14173O0, this.f4046d);
                this.f4047e = m6122a;
                this.f3616A.setBackgroundDrawable(m6122a);
            } else if (c3489yj.f14241p.m6071j()) {
                this.f3616A.setBackgroundColor(AbstractC0652n1.m4701d(this.f3618C.f14241p.m6057b()));
            }
            TextView textView2 = this.f3628z;
            if (textView2 != null) {
                textView2.setTextSize(m4291m());
            }
        }
        if (this.f4048f != null) {
            this.f3616A.setPadding(this.f3618C.m16639e(this.f3619D.f4397c.width()), this.f3618C.m16644j(this.f3619D.f4397c.width()), this.f3618C.m16642h(this.f3619D.f4397c.width()), this.f3618C.m16635b(this.f3619D.f4397c.width()));
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f3616A.measure(makeMeasureSpec, makeMeasureSpec);
        this.f4053k = this.f3616A.getMeasuredHeight();
        this.f4054l = this.f3616A.getMeasuredWidth();
        int m16645k = this.f3618C.m16645k(this.f3619D.f4397c.width());
        int m16637c = this.f3618C.m16637c(this.f3619D.f4397c.height());
        if (m16645k > 0) {
            this.f4054l = m16645k;
            TextView textView3 = this.f3628z;
            if (textView3 != null) {
                textView3.setMaxWidth(m16645k);
                this.f3628z.setMinWidth(this.f4054l);
            }
        } else {
            this.f4054l = -1;
        }
        if (m16637c > 0) {
            this.f4053k = m16637c;
        } else {
            this.f4053k = this.f3621F;
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(this.f4054l, this.f4053k);
        layoutParams3.gravity = m4294p();
        layoutParams3.setMargins(this.f3618C.m16638d(this.f3619D.f4397c.width()), this.f3618C.m16643i(this.f3619D.f4397c.width()), this.f3618C.m16641g(this.f3619D.f4397c.width()), this.f3618C.m16632a(this.f3619D.f4397c.width()));
        this.f4044b.addView(this.f3616A, layoutParams3);
    }
}
