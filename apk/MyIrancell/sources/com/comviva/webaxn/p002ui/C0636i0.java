package com.comviva.webaxn.p002ui;

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
import com.comviva.webaxn.utils.C0687b;
import com.comviva.webaxn.utils.C0698e1;
import com.comviva.webaxn.utils.C0713j1;
import com.comviva.webaxn.utils.C0744u;
import com.comviva.webaxn.utils.C0755x1;
import p000.C2391dj;
import p000.C2434ej;
import p000.C3107q2;
import p000.C3361vj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.i0 */
/* loaded from: classes.dex */
public class C0636i0 extends AbstractC0652n1 {

    /* renamed from: N */
    private static float f3824N;

    /* renamed from: A */
    private Context f3825A;

    /* renamed from: B */
    private C3489yj f3826B;

    /* renamed from: C */
    private LinearLayout f3827C;

    /* renamed from: D */
    private String f3828D;

    /* renamed from: E */
    private int f3829E;

    /* renamed from: F */
    public boolean f3830F;

    /* renamed from: G */
    public int f3831G;

    /* renamed from: H */
    private int f3832H;

    /* renamed from: I */
    private C0639j0 f3833I;

    /* renamed from: J */
    private boolean f3834J;

    /* renamed from: K */
    private String f3835K;

    /* renamed from: L */
    private View.OnClickListener f3836L;

    /* renamed from: M */
    private View.OnClickListener f3837M;

    /* renamed from: x */
    private boolean f3838x;

    /* renamed from: y */
    private ImageView f3839y;

    /* renamed from: z */
    private TextView f3840z;

    /* renamed from: com.comviva.webaxn.ui.i0$a */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0636i0 c0636i0 = C0636i0.this;
            c0636i0.f4049g.mo4849b(c0636i0);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.i0$b */
    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0636i0 c0636i0 = C0636i0.this;
            c0636i0.f4049g.mo4850b(c0636i0.f3826B);
        }
    }

    public C0636i0(Context context, C3489yj c3489yj, String str, C0639j0 c0639j0) {
        super(context);
        C0744u c0744u;
        this.f3839y = null;
        this.f3840z = null;
        this.f3829E = 0;
        this.f3830F = false;
        this.f3832H = 30;
        this.f3834J = false;
        this.f3836L = new a();
        this.f3837M = new b();
        this.f3825A = context;
        this.f3833I = c0639j0;
        this.f3826B = c3489yj;
        float m5544a = C0687b.m5342a(context).m5343a().m5544a();
        f3824N = m5544a;
        this.f3832H = (int) (this.f3832H * m5544a);
        C2434ej c2434ej = this.f3826B.f14173O0;
        if (c2434ej != null) {
            c2434ej.m11615a(c0639j0.f3869f);
        }
        if (c3489yj.f14208e == 27 && str != null && str.endsWith("\n")) {
            str = str.substring(0, str.indexOf("\n"));
        }
        this.f3828D = str;
        this.f3840z = new TextView(context);
        if (c3489yj == null || (c0744u = c3489yj.f14241p) == null || c0744u.m6068g() != 4) {
            this.f3840z.setText(this.f3828D);
        } else {
            this.f3840z.setText(Html.fromHtml("<u>".concat(this.f3828D).concat("</u>")));
        }
        int m5664f0 = C0713j1.m5563a(this.f3825A).m5664f0();
        this.f4050h = m5664f0;
        this.f4050h = AbstractC0652n1.m4701d(m5664f0);
        m4708c(this.f4046d);
        this.f3827C = new LinearLayout(this.f3825A);
        if (!TextUtils.isEmpty(this.f3826B.f14249r1)) {
            this.f3827C.setContentDescription(this.f3826B.f14249r1);
        }
        C3361vj c3361vj = this.f3826B.f14246q1;
        if (c3361vj != null) {
            C3107q2.m14884a(this.f3827C, c3361vj.m16034a());
        }
        this.f3827C.setOrientation(0);
    }

    /* renamed from: a */
    public int m4480a(TextView textView) {
        String str = this.f3826B.f14214g;
        if (str != null) {
            if (str.equalsIgnoreCase("C") || this.f3826B.f14214g.equalsIgnoreCase("Center")) {
                return 17;
            }
            if (this.f3826B.f14214g.equalsIgnoreCase("L") || this.f3826B.f14214g.equalsIgnoreCase("Left")) {
                if (this.f4055m) {
                    return 5;
                }
            } else if ((this.f3826B.f14214g.equalsIgnoreCase("R") || this.f3826B.f14214g.equalsIgnoreCase("Right")) && !this.f4055m) {
                return 5;
            }
        }
        return 3;
    }

    /* renamed from: a */
    public void m4481a(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f3840z.setLetterSpacing(f);
        }
    }

    /* renamed from: a */
    public void m4482a(Spanned spanned) {
        this.f3840z.setText(spanned);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4139a(AbsoluteLayout.LayoutParams layoutParams) {
        ((AbsoluteLayout.LayoutParams) this.f3827C.getLayoutParams()).x = layoutParams.x;
        ((AbsoluteLayout.LayoutParams) this.f3827C.getLayoutParams()).y = layoutParams.y;
        if (layoutParams.width > 0) {
            ((AbsoluteLayout.LayoutParams) this.f3827C.getLayoutParams()).width = layoutParams.width;
        }
        if (layoutParams.height > 0) {
            ((AbsoluteLayout.LayoutParams) this.f3827C.getLayoutParams()).height = layoutParams.height;
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4201a(C0657p0 c0657p0) {
        int i = c0657p0.f4218a;
        int i2 = c0657p0.f4220c;
        if (this.f4055m) {
            i2 = i;
            i = i2;
        }
        this.f3827C.setPadding(i, c0657p0.f4219b, i2, c0657p0.f4221d);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f3827C.measure(makeMeasureSpec, makeMeasureSpec);
        int i3 = this.f3833I.f3868e;
        if (i3 <= 0 && i3 != -3) {
            this.f4054l = this.f3827C.getMeasuredWidth();
        }
        this.f4053k = this.f3827C.getMeasuredHeight();
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
        m4490b(c3489yj.f14254t0);
        m4484a(c3489yj.f14260v0);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f3827C.measure(makeMeasureSpec, makeMeasureSpec);
        this.f4054l = this.f3827C.getMeasuredWidth();
        this.f4053k = this.f3827C.getMeasuredHeight();
    }

    /* renamed from: a */
    public void m4483a(boolean z) {
        this.f3838x = z;
    }

    /* renamed from: a */
    public void m4484a(byte[] bArr) {
        int identifier = !TextUtils.isEmpty(this.f3826B.f14248r0) ? this.f3825A.getResources().getIdentifier(this.f3826B.f14248r0, "drawable", this.f3825A.getPackageName()) : 0;
        try {
            if (identifier > 0) {
                Bitmap m5429a = C0698e1.m5426b(this.f3825A).m5429a(this.f3826B.f14248r0);
                if (m5429a == null && (m5429a = BitmapFactory.decodeResource(this.f3825A.getResources(), identifier)) != null) {
                    C0698e1.m5426b(this.f3825A).m5432a(this.f3826B.f14248r0, m5429a);
                }
                this.f4047e = NinePatch.isNinePatchChunk(m5429a.getNinePatchChunk()) ? new NinePatchDrawable(m5429a, m5429a.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a);
                this.f3827C.setBackgroundDrawable(this.f4047e);
                return;
            }
            if (bArr != null) {
                Bitmap m5429a2 = C0698e1.m5426b(this.f3825A).m5429a(this.f3826B.f14172O);
                if (m5429a2 == null && (m5429a2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                    C0698e1.m5426b(this.f3825A).m5432a(this.f3826B.f14172O, m5429a2);
                }
                this.f4047e = NinePatch.isNinePatchChunk(m5429a2.getNinePatchChunk()) ? new NinePatchDrawable(m5429a2, m5429a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a2);
                this.f3827C.setBackgroundDrawable(this.f4047e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: b */
    public int m4485b(TextView textView) {
        C3489yj c3489yj = this.f3826B;
        if (c3489yj.f14217h == null || c3489yj.f14214g.equalsIgnoreCase("M") || this.f3826B.f14214g.equalsIgnoreCase("Middle")) {
            return 17;
        }
        if (this.f3826B.f14214g.equalsIgnoreCase("B") || this.f3826B.f14214g.equalsIgnoreCase("Bottom")) {
            return 80;
        }
        return (this.f3826B.f14214g.equalsIgnoreCase("T") || this.f3826B.f14214g.equalsIgnoreCase("Top")) ? 48 : 17;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4142b() {
        this.f4044b.removeView(this.f3827C);
        this.f3827C.removeAllViews();
        this.f3827C.setBackgroundDrawable(null);
        this.f3827C.removeAllViewsInLayout();
        this.f4047e = null;
        this.f3827C = null;
        this.f3839y = null;
        this.f3840z = null;
        this.f3825A = null;
        this.f3826B = null;
        this.f3833I = null;
    }

    /* renamed from: b */
    public void m4486b(float f) {
        this.f3840z.setLineSpacing(f, Build.VERSION.SDK_INT >= 16 ? this.f3840z.getLineSpacingMultiplier() : 1.0f);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4176b(int i) {
        super.mo4176b(i);
        this.f3840z.setTextColor(i);
    }

    /* renamed from: b */
    public void m4487b(String str) {
        this.f3826B.f14235n = str;
        m4493c(str);
    }

    /* renamed from: b */
    public void m4488b(C3489yj c3489yj) {
        this.f3826B = c3489yj;
    }

    /* renamed from: b */
    public void m4489b(boolean z) {
        this.f3834J = z;
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
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4490b(byte[] r7) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0636i0.m4490b(byte[]):void");
    }

    /* renamed from: c */
    public int m4491c(AbsoluteLayout.LayoutParams layoutParams) {
        TextView textView;
        String str = this.f3828D;
        boolean z = (str == null || this.f3826B.f14235n == null || str.length() != this.f3826B.f14235n.length()) ? false : true;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        if (this.f3839y != null) {
            layoutParams2.setMargins(0, 0, 0, 0);
        }
        if (this.f4055m) {
            TextView textView2 = this.f3840z;
            if (textView2 != null) {
                this.f3827C.addView(textView2, layoutParams3);
            }
            ImageView imageView = this.f3839y;
            if (imageView != null) {
                this.f3827C.addView(imageView, layoutParams2);
            }
        } else {
            ImageView imageView2 = this.f3839y;
            if (imageView2 != null) {
                this.f3827C.addView(imageView2, layoutParams2);
            }
            TextView textView3 = this.f3840z;
            if (textView3 != null) {
                this.f3827C.addView(textView3, layoutParams3);
            }
        }
        TextView textView4 = this.f3840z;
        if (textView4 != null) {
            ((LinearLayout.LayoutParams) textView4.getLayoutParams()).gravity = 16;
        }
        C2434ej c2434ej = this.f3826B.f14173O0;
        if (c2434ej != null) {
            Drawable m6122a = C0755x1.m6122a(c2434ej, this.f4046d);
            this.f4047e = m6122a;
            this.f3827C.setBackgroundDrawable(m6122a);
        } else if (this.f3830F) {
            this.f3827C.setBackgroundColor(this.f3831G);
        } else {
            this.f3827C.setBackgroundColor(0);
        }
        if (this.f3838x) {
            this.f3827C.setClickable(true);
            this.f3827C.setFocusable(true);
            this.f3827C.setOnClickListener(this.f3836L);
            this.f3827C.setOnTouchListener(this.f4059q);
            this.f3827C.setTag(this.f3826B);
        } else if (TextUtils.isEmpty(this.f3826B.f14181S0)) {
            AbstractC0652n1.m4697a(this.f3827C, this.f3826B.f14207d1);
            this.f3826B.f14210e1 = true;
        } else {
            this.f3827C.setOnClickListener(this.f3837M);
        }
        this.f3827C.setLayoutParams(new AbsoluteLayout.LayoutParams(layoutParams.width, -2, layoutParams.x, layoutParams.y));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        if (layoutParams.width > this.f3829E) {
            if (z && (textView = this.f3840z) != null) {
                textView.setGravity(m4480a(textView));
            }
            this.f3840z.getLayoutParams().width = layoutParams.width - this.f3829E;
            this.f3827C.measure(makeMeasureSpec, makeMeasureSpec);
            this.f4054l = layoutParams.width;
            this.f4053k = this.f3827C.getMeasuredHeight();
        } else {
            this.f3827C.measure(makeMeasureSpec, makeMeasureSpec);
            this.f4054l = this.f3827C.getMeasuredWidth();
            this.f4053k = this.f3827C.getMeasuredHeight();
            if (this.f3838x && z) {
                int i = this.f4054l;
                int i2 = this.f3832H;
                if (i < i2) {
                    this.f4054l = i2;
                }
            }
        }
        this.f3827C.setGravity(m4480a(this.f3840z) | m4485b(this.f3840z));
        return this.f4053k;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: c */
    public void mo4146c() {
        this.f3826B.f14199b = false;
        this.f3827C.setOnClickListener(null);
        this.f3827C.setOnTouchListener(null);
        this.f3827C.setClickable(false);
        this.f3827C.setFocusable(false);
        C3489yj c3489yj = this.f3826B;
        if (c3489yj.f14210e1) {
            AbstractC0652n1.m4697a(this.f3827C, c3489yj.f14207d1);
        }
    }

    /* renamed from: c */
    public void m4492c(float f) {
        this.f3840z.setTextSize(f);
    }

    /* renamed from: c */
    public void m4493c(String str) {
        this.f3840z.setText(str);
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
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4494c(p000.C3489yj r5) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0636i0.m4494c(yj):void");
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: d */
    public void mo4147d() {
        this.f3826B.f14199b = true;
        if (this.f3838x) {
            this.f3827C.setOnClickListener(this.f3836L);
            this.f3827C.setOnTouchListener(this.f4059q);
            this.f3827C.setClickable(true);
            this.f3827C.setFocusable(true);
        }
        if (this.f3826B.f14210e1) {
            AbstractC0652n1.m4697a(this.f3827C, AbstractC0652n1.f4038r);
            this.f3826B.f14210e1 = false;
        }
    }

    /* renamed from: d */
    public void m4495d(String str) {
        this.f3835K = str;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: f */
    public C3489yj mo4148f() {
        return this.f3826B;
    }

    /* renamed from: g */
    public void m4496g(int i) {
        this.f3840z.setTypeface(this.f3826B.f14241p.m6069h(), AbstractC0652n1.m4702e(i));
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: h */
    public View mo4150h() {
        return this.f3827C;
    }

    /* renamed from: h */
    public void m4497h(int i) {
        this.f3840z.setMaxLines(i);
        this.f3840z.setLines(i);
        if (1 == i) {
            this.f3840z.setSingleLine(true);
        }
        this.f3840z.setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: i */
    public int mo4151i() {
        return this.f4053k;
    }

    /* renamed from: i */
    public void m4498i(int i) {
        this.f3830F = true;
        this.f3831G = i;
        this.f3827C.setBackgroundColor(i);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: j */
    public int mo4152j() {
        return this.f4054l;
    }

    /* renamed from: j */
    public void m4499j(int i) {
        this.f3840z.setTextColor(i);
    }

    /* renamed from: m */
    public TextView m4500m() {
        return this.f3840z;
    }

    /* renamed from: n */
    public String m4501n() {
        return this.f3835K;
    }

    /* renamed from: o */
    public boolean m4502o() {
        return this.f3834J;
    }

    /* renamed from: p */
    public void m4503p() {
        C2391dj c2391dj = this.f3826B.f14163J0;
        if (c2391dj != null) {
            AbstractC0652n1.m4700a(c2391dj, mo4150h());
        }
    }

    /* renamed from: q */
    public void m4504q() {
        if (this.f4044b != null) {
            C0744u c0744u = this.f3826B.f14241p;
            if (c0744u != null && c0744u.m6072k()) {
                mo4176b(AbstractC0652n1.m4701d(this.f3826B.f14241p.m6062c()));
            }
            this.f4044b.addView(this.f3827C);
            this.f4044b.invalidate();
        }
    }
}
