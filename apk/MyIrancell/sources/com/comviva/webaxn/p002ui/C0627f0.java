package com.comviva.webaxn.p002ui;

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
import com.comviva.webaxn.utils.C0687b;
import com.comviva.webaxn.utils.C0698e1;
import com.comviva.webaxn.utils.C0744u;
import com.comviva.webaxn.utils.C0755x1;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.f0 */
/* loaded from: classes.dex */
public class C0627f0 extends AbstractC0652n1 {

    /* renamed from: K */
    private static int f3653K;

    /* renamed from: L */
    private static float f3654L;

    /* renamed from: A */
    private TextView f3655A;

    /* renamed from: B */
    private int f3656B;

    /* renamed from: C */
    private int f3657C;

    /* renamed from: D */
    private double f3658D;

    /* renamed from: E */
    private C0639j0 f3659E;

    /* renamed from: F */
    private String[] f3660F;

    /* renamed from: G */
    private boolean f3661G;

    /* renamed from: H */
    private Drawable f3662H;

    /* renamed from: I */
    private View.OnClickListener f3663I;

    /* renamed from: J */
    private View.OnClickListener f3664J;

    /* renamed from: x */
    private ImageView f3665x;

    /* renamed from: y */
    private C3489yj f3666y;

    /* renamed from: z */
    private LinearLayout f3667z;

    /* renamed from: com.comviva.webaxn.ui.f0$a */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!TextUtils.isEmpty(C0627f0.this.f3666y.f14258u1)) {
                C0627f0 c0627f0 = C0627f0.this;
                c0627f0.m4707a(c0627f0.f3666y.f14258u1);
            }
            C0627f0 c0627f02 = C0627f0.this;
            c0627f02.f4049g.mo4849b(c0627f02);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.f0$b */
    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0627f0 c0627f0 = C0627f0.this;
            c0627f0.f4049g.mo4850b(c0627f0.f3666y);
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
    public C0627f0(android.content.Context r12, p000.C3489yj r13, com.comviva.webaxn.p002ui.C0639j0 r14) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0627f0.<init>(android.content.Context, yj, com.comviva.webaxn.ui.j0):void");
    }

    /* renamed from: q */
    private void m4311q() {
        if (TextUtils.isEmpty(this.f3666y.f14187V0)) {
            return;
        }
        try {
            AnimationDrawable m4521a = C0640j1.m4520a(this.f4045c).m4521a(this.f3666y.f14186V);
            if (m4521a == null || m4521a.getNumberOfFrames() != this.f3660F.length) {
                C0640j1.m4520a(this.f4045c).m4523a(this.f3666y.f14187V0, this.f3666y.f14186V, this.f3660F);
                m4521a = C0640j1.m4520a(this.f4045c).m4521a(this.f3666y.f14186V);
            }
            if (m4521a != null) {
                if (Build.VERSION.SDK_INT >= 16) {
                    this.f3665x.setBackground(m4521a);
                } else {
                    this.f3665x.setBackgroundDrawable(m4521a);
                }
                m4322c(this.f3666y.f14186V);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public int m4312a(AbsoluteLayout.LayoutParams layoutParams, C0669v0 c0669v0) {
        int width = c0669v0 != null ? c0669v0.f4397c.width() - (this.f3666y.m16641g(c0669v0.f4397c.width()) + this.f3666y.m16638d(c0669v0.f4397c.width())) : 0;
        int i = layoutParams.width;
        if (i > 0) {
            this.f3656B = i;
            int i2 = layoutParams.height;
            if (i2 > 0) {
                this.f3657C = i2;
            } else {
                double d = i;
                double d2 = this.f3658D;
                Double.isNaN(d);
                this.f3657C = (int) (d * d2);
            }
        } else {
            int i3 = layoutParams.height;
            if (i3 > 0) {
                this.f3657C = i3;
                double d3 = i3;
                double d4 = this.f3658D;
                Double.isNaN(d3);
                this.f3656B = (int) (d3 / d4);
            }
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.f3656B, this.f3657C);
        layoutParams2.gravity = 17;
        int i4 = this.f3666y.f14204c1;
        if (i4 == -1) {
            this.f3665x.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            this.f3665x.setScaleType(C0755x1.m6165b(i4));
        }
        this.f3665x.setLayoutParams(layoutParams2);
        this.f3665x.setAdjustViewBounds(false);
        if (c0669v0 != null && width < this.f3656B) {
            this.f3656B = width;
            double d5 = width;
            double d6 = this.f3658D;
            Double.isNaN(d5);
            this.f3657C = (int) (d5 * d6);
            ((LinearLayout.LayoutParams) this.f3665x.getLayoutParams()).width = this.f3656B;
            ((LinearLayout.LayoutParams) this.f3665x.getLayoutParams()).height = this.f3657C;
        }
        if (this.f3655A != null && C0755x1.m6135a(this.f3666y) == null) {
            this.f3655A.getLayoutParams().width = this.f3656B + f3653K;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f3667z.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredWidth = this.f3667z.getMeasuredWidth();
        this.f4054l = measuredWidth;
        int i5 = layoutParams.width;
        if (i5 > 0 && measuredWidth > i5) {
            this.f4054l = i5;
            if (this.f3655A != null && C0755x1.m6135a(this.f3666y) == null) {
                this.f3655A.getLayoutParams().width = this.f4054l;
            }
        }
        if (c0669v0 != null && width < this.f4054l) {
            this.f4054l = width;
        }
        this.f4053k = this.f3667z.getMeasuredHeight();
        if (layoutParams.height <= 0 && this.f3655A == null) {
            double d7 = this.f4054l;
            double d8 = this.f3658D;
            Double.isNaN(d7);
            this.f4053k = (int) (d7 * d8);
        }
        this.f3667z.setLayoutParams(new AbsoluteLayout.LayoutParams(this.f4054l, this.f4053k, layoutParams.x, layoutParams.y));
        return this.f4053k;
    }

    /* renamed from: a */
    public void m4313a(float f) {
        TextView textView = this.f3655A;
        if (textView == null || Build.VERSION.SDK_INT < 21) {
            return;
        }
        textView.setLetterSpacing(f);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4314a(int i) {
        super.mo4314a(i);
        this.f3667z.setBackgroundColor(i);
        m4708c(this.f4046d);
    }

    /* renamed from: a */
    public void m4315a(Drawable drawable) {
        this.f3662H = drawable;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4139a(AbsoluteLayout.LayoutParams layoutParams) {
        ((AbsoluteLayout.LayoutParams) this.f3667z.getLayoutParams()).x = layoutParams.x;
        ((AbsoluteLayout.LayoutParams) this.f3667z.getLayoutParams()).y = layoutParams.y;
        if (layoutParams.width > 0) {
            ((AbsoluteLayout.LayoutParams) this.f3667z.getLayoutParams()).width = layoutParams.width;
        }
        if (layoutParams.height > 0) {
            ((AbsoluteLayout.LayoutParams) this.f3667z.getLayoutParams()).height = layoutParams.height;
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4201a(C0657p0 c0657p0) {
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
        if (TextUtils.isEmpty(this.f3666y.f14187V0)) {
            m4321b(c3489yj.f14254t0);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            this.f3667z.measure(makeMeasureSpec, makeMeasureSpec);
            this.f4054l = this.f3667z.getMeasuredWidth();
            this.f4053k = this.f3667z.getMeasuredHeight();
            m4317a(c3489yj.f14260v0);
        }
    }

    /* renamed from: a */
    public void m4316a(boolean z) {
        this.f3661G = z;
    }

    /* renamed from: a */
    public void m4317a(byte[] bArr) {
        if (TextUtils.isEmpty(this.f3666y.f14187V0)) {
            int identifier = !TextUtils.isEmpty(this.f3666y.f14248r0) ? this.f4045c.getResources().getIdentifier(this.f3666y.f14248r0, "drawable", this.f4045c.getPackageName()) : 0;
            try {
                if (identifier > 0) {
                    Bitmap m5429a = C0698e1.m5426b(this.f4045c).m5429a(this.f3666y.f14248r0);
                    if (m5429a == null && (m5429a = BitmapFactory.decodeResource(this.f4045c.getResources(), identifier)) != null) {
                        C0698e1.m5426b(this.f4045c).m5432a(this.f3666y.f14248r0, m5429a);
                    }
                    this.f4047e = NinePatch.isNinePatchChunk(m5429a.getNinePatchChunk()) ? new NinePatchDrawable(m5429a, m5429a.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a);
                    this.f3667z.setBackgroundDrawable(this.f4047e);
                    return;
                }
                if (bArr != null) {
                    Bitmap m5429a2 = C0698e1.m5426b(this.f4045c).m5429a(this.f3666y.f14172O);
                    if (m5429a2 == null && (m5429a2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                        C0698e1.m5426b(this.f4045c).m5432a(this.f3666y.f14172O, m5429a2);
                    }
                    this.f4047e = NinePatch.isNinePatchChunk(m5429a2.getNinePatchChunk()) ? new NinePatchDrawable(m5429a2, m5429a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a2);
                    this.f3667z.setBackgroundDrawable(this.f4047e);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } catch (OutOfMemoryError e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4142b() {
        if (!TextUtils.isEmpty(this.f3666y.f14187V0)) {
            m4323d(this.f3666y.f14186V);
        }
        this.f4044b.removeView(this.f3667z);
        this.f3667z.removeAllViews();
        this.f3667z.setBackgroundDrawable(null);
        this.f3667z.removeAllViewsInLayout();
        this.f3667z = null;
        this.f4047e = null;
        this.f3665x = null;
        this.f3666y = null;
        this.f3655A = null;
        this.f3659E = null;
    }

    /* renamed from: b */
    public void m4318b(float f) {
        TextView textView = this.f3655A;
        if (textView != null) {
            textView.setTextSize(f);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4176b(int i) {
        super.mo4176b(i);
        TextView textView = this.f3655A;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    /* renamed from: b */
    public void m4319b(String str) {
        LinearLayout.LayoutParams layoutParams;
        if (str != null) {
            if (this.f3655A == null) {
                TextView textView = new TextView(this.f4045c);
                this.f3655A = textView;
                textView.setGravity(49);
                if (C0755x1.m6135a(this.f3666y) == null) {
                    this.f3655A.setLines(2);
                    this.f3655A.setEllipsize(TextUtils.TruncateAt.END);
                    layoutParams = new LinearLayout.LayoutParams(this.f3656B + f3653K, -2);
                } else {
                    this.f3655A.setLines(1);
                    layoutParams = new LinearLayout.LayoutParams(-2, -2);
                }
                TextView textView2 = this.f3655A;
                layoutParams.gravity = 17;
                this.f3667z.addView(textView2, layoutParams);
            }
            this.f3655A.setText(str);
        }
    }

    /* renamed from: b */
    public void m4320b(C3489yj c3489yj) {
        this.f3666y = c3489yj;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4321b(byte[] r11) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0627f0.m4321b(byte[]):void");
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: c */
    public void mo4146c() {
        this.f3666y.f14199b = false;
        this.f3667z.setOnTouchListener(null);
        this.f3667z.setOnClickListener(null);
        this.f3667z.setClickable(false);
        this.f3667z.setFocusable(false);
        C3489yj c3489yj = this.f3666y;
        if (c3489yj.f14210e1) {
            AbstractC0652n1.m4697a(this.f3667z, c3489yj.f14207d1);
        }
        if (TextUtils.isEmpty(this.f3666y.f14187V0)) {
            return;
        }
        m4323d(this.f3666y.f14186V);
    }

    /* renamed from: c */
    public void m4322c(String str) {
        C0640j1.m4520a(this.f4045c).m4524b(str);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: d */
    public void mo4147d() {
        String str;
        C3489yj c3489yj = this.f3666y;
        c3489yj.f14199b = true;
        if (1 == 1 && (c3489yj.f14220i != null || c3489yj.f14226k != null || ((str = c3489yj.f14232m) != null && (str.equalsIgnoreCase("close") || this.f3666y.f14232m.equalsIgnoreCase("exit"))))) {
            this.f3667z.setOnClickListener(this.f3663I);
            this.f3667z.setOnTouchListener(this.f4059q);
            this.f3667z.setClickable(true);
            this.f3667z.setFocusable(true);
        }
        if (this.f3666y.f14210e1) {
            AbstractC0652n1.m4697a(this.f3667z, AbstractC0652n1.f4038r);
            this.f3666y.f14210e1 = false;
        }
        if (TextUtils.isEmpty(this.f3666y.f14187V0)) {
            return;
        }
        m4322c(this.f3666y.f14186V);
    }

    /* renamed from: d */
    public void m4323d(String str) {
        C0640j1.m4520a(this.f4045c).m4525c(str);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: e */
    public ImageView mo4289e() {
        return this.f3665x;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: f */
    public C3489yj mo4148f() {
        return this.f3666y;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: h */
    public View mo4150h() {
        return this.f3667z;
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
    public Drawable m4324m() {
        return this.f3662H;
    }

    /* renamed from: n */
    public boolean m4325n() {
        C3489yj c3489yj = this.f3666y.f14145A0;
        return c3489yj != null && c3489yj.f14221i0 == 4;
    }

    /* renamed from: o */
    public boolean m4326o() {
        return this.f3661G;
    }

    /* renamed from: p */
    public void m4327p() {
        if (this.f4044b != null) {
            int m5552d = C0687b.m5342a(this.f4045c).m5343a().m5552d() / 3;
            C0744u c0744u = this.f3666y.f14241p;
            if (c0744u != null) {
                if (c0744u.m6072k()) {
                    mo4176b(AbstractC0652n1.m4701d(this.f3666y.f14241p.m6062c()));
                }
                if (this.f3666y.f14241p.m6071j()) {
                    mo4314a(AbstractC0652n1.m4701d(this.f3666y.f14241p.m6057b()));
                }
            }
            this.f4044b.addView(this.f3667z);
            this.f4044b.invalidate();
            m4311q();
        }
    }
}
