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
import android.widget.LinearLayout;
import android.widget.TextView;
import com.comviva.webaxn.utils.C0698e1;
import com.comviva.webaxn.utils.C0744u;
import com.comviva.webaxn.utils.C0755x1;
import p000.C2434ej;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.g0 */
/* loaded from: classes.dex */
public class C0630g0 extends AbstractC0652n1 {

    /* renamed from: A */
    public int f3706A;

    /* renamed from: B */
    public float f3707B;

    /* renamed from: C */
    private boolean f3708C;

    /* renamed from: D */
    public boolean f3709D;

    /* renamed from: E */
    public boolean f3710E;

    /* renamed from: F */
    private LinearLayout f3711F;

    /* renamed from: G */
    private boolean f3712G;

    /* renamed from: H */
    private String f3713H;

    /* renamed from: I */
    public View.OnClickListener f3714I;

    /* renamed from: x */
    protected String f3715x;

    /* renamed from: y */
    protected TextView f3716y;

    /* renamed from: z */
    public C3489yj f3717z;

    /* renamed from: com.comviva.webaxn.ui.g0$a */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0630g0 c0630g0 = C0630g0.this;
            c0630g0.f4049g.mo4849b(c0630g0);
        }
    }

    public C0630g0(Context context) {
        super(context);
        this.f3709D = false;
        this.f3710E = false;
        this.f3712G = false;
        this.f3714I = new a();
        this.f3711F = new LinearLayout(this.f4045c);
        this.f3716y = new TextView(context);
        this.f3706A = -1;
        this.f3707B = -1.0f;
        this.f3708C = false;
    }

    public C0630g0(Context context, String str) {
        super(context);
        this.f3709D = false;
        this.f3710E = false;
        this.f3712G = false;
        this.f3714I = new a();
        this.f3711F = new LinearLayout(this.f4045c);
        this.f3715x = str;
        this.f3707B = -1.0f;
        this.f3716y = new TextView(context);
        this.f3706A = -1;
        this.f3708C = false;
    }

    /* renamed from: a */
    public void m4362a(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f3716y.setLetterSpacing(f);
        }
    }

    /* renamed from: a */
    public void m4363a(Spanned spanned) {
        this.f3715x = spanned.toString();
        this.f3716y.setText(spanned);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4174a(C0639j0 c0639j0, C0669v0 c0669v0) {
        int m16645k = this.f3717z.m16645k(c0669v0.f4397c.width());
        if (m16645k < 0) {
            m16645k = c0669v0.f4397c.width() - (this.f3717z.m16638d(c0669v0.f4397c.width()) + this.f3717z.m16641g(c0669v0.f4397c.width()));
        }
        int m16637c = this.f3717z.m16637c(c0669v0.f4397c.height());
        ((LinearLayout.LayoutParams) this.f3716y.getLayoutParams()).width = m16645k;
        ((LinearLayout.LayoutParams) this.f3716y.getLayoutParams()).height = m16637c;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f3711F.measure(makeMeasureSpec, makeMeasureSpec);
        this.f4054l = this.f3711F.getMeasuredWidth();
        this.f4053k = this.f3711F.getMeasuredHeight();
    }

    /* renamed from: a */
    public void mo4364a(C0669v0 c0669v0) {
        C0744u c0744u;
        if (this.f4044b == null || this.f3715x == null) {
            return;
        }
        C3489yj c3489yj = this.f3717z;
        if (c3489yj == null || (c0744u = c3489yj.f14241p) == null || c0744u.m6068g() != 4) {
            this.f3716y.setText(this.f3715x);
        } else {
            this.f3716y.setText(Html.fromHtml("<u>".concat(this.f3715x).concat("</u>")));
        }
        this.f3716y.setHorizontallyScrolling(false);
        if (this.f3708C) {
            this.f3716y.setOnClickListener(this.f3714I);
            this.f3716y.setOnTouchListener(this.f4059q);
            this.f3716y.setMinimumHeight(AbstractC0652n1.f4041u);
        } else {
            AbstractC0652n1.m4697a(this.f3711F, this.f3717z.f14207d1);
            this.f3717z.f14210e1 = true;
        }
        C0657p0 c0657p0 = this.f4048f;
        if (c0657p0 != null) {
            this.f3716y.setPadding(c0657p0.f4218a, c0657p0.f4219b, c0657p0.f4220c, c0657p0.f4221d);
        } else {
            this.f3716y.setPadding(1, 0, 1, 0);
        }
        m4381q();
        int m16645k = this.f3717z.m16645k(c0669v0.f4397c.width());
        if (m16645k < 0) {
            m16645k = c0669v0.f4397c.width() - (this.f3717z.m16638d(c0669v0.f4397c.width()) + this.f3717z.m16641g(c0669v0.f4397c.width()));
        }
        this.f3711F.addView(this.f3716y, new LinearLayout.LayoutParams(m16645k, this.f3717z.m16637c(c0669v0.f4397c.height())));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f3711F.measure(makeMeasureSpec, makeMeasureSpec);
        this.f4054l = this.f3711F.getMeasuredWidth();
        this.f4053k = this.f3711F.getMeasuredHeight();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.f4053k);
        layoutParams.setMargins(this.f3717z.m16638d(c0669v0.f4397c.width()), this.f3717z.m16643i(c0669v0.f4397c.width()), this.f3717z.m16641g(c0669v0.f4397c.width()), this.f3717z.m16632a(c0669v0.f4397c.width()));
        this.f4044b.addView(this.f3711F, layoutParams);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
        mo4366a(c3489yj.f14260v0);
    }

    /* renamed from: a */
    public void mo4365a(boolean z) {
        this.f3708C = z;
    }

    /* renamed from: a */
    public void mo4366a(byte[] bArr) {
        int identifier = !TextUtils.isEmpty(this.f3717z.f14248r0) ? this.f4045c.getResources().getIdentifier(this.f3717z.f14248r0, "drawable", this.f4045c.getPackageName()) : 0;
        try {
            if (identifier > 0) {
                Bitmap m5429a = C0698e1.m5426b(this.f4045c).m5429a(this.f3717z.f14248r0);
                if (m5429a == null && (m5429a = BitmapFactory.decodeResource(this.f4045c.getResources(), identifier)) != null) {
                    C0698e1.m5426b(this.f4045c).m5432a(this.f3717z.f14248r0, m5429a);
                }
                this.f4047e = NinePatch.isNinePatchChunk(m5429a.getNinePatchChunk()) ? new NinePatchDrawable(m5429a, m5429a.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a);
                this.f3711F.setBackgroundDrawable(this.f4047e);
                return;
            }
            if (bArr != null) {
                Bitmap m5429a2 = C0698e1.m5426b(this.f4045c).m5429a(this.f3717z.f14172O);
                if (m5429a2 == null && (m5429a2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                    C0698e1.m5426b(this.f4045c).m5432a(this.f3717z.f14172O, m5429a2);
                }
                this.f4047e = NinePatch.isNinePatchChunk(m5429a2.getNinePatchChunk()) ? new NinePatchDrawable(m5429a2, m5429a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a2);
                this.f3711F.setBackgroundDrawable(this.f4047e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: b */
    public void m4367b(float f) {
        this.f3716y.setLineSpacing(f, Build.VERSION.SDK_INT >= 16 ? this.f3716y.getLineSpacingMultiplier() : 1.0f);
    }

    /* renamed from: b */
    public void m4368b(String str) {
        this.f3715x = str;
        this.f3716y.setText(str);
    }

    /* renamed from: b */
    public void m4369b(C3489yj c3489yj) {
        this.f3717z = c3489yj;
        int i = c3489yj.f14180S;
        if (i > 0) {
            this.f3716y.setLines(i);
            this.f3716y.setEllipsize(TextUtils.TruncateAt.END);
        }
        if (TextUtils.isEmpty(this.f3717z.f14249r1)) {
            return;
        }
        this.f3711F.setContentDescription(this.f3717z.f14249r1);
    }

    /* renamed from: b */
    public void mo4370b(boolean z) {
        this.f3712G = z;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: c */
    public void mo4146c() {
        this.f3717z.f14199b = false;
        this.f3716y.setOnClickListener(null);
        this.f3716y.setOnTouchListener(null);
        this.f3716y.setClickable(false);
        this.f3716y.setFocusable(false);
        C3489yj c3489yj = this.f3717z;
        if (c3489yj.f14210e1) {
            AbstractC0652n1.m4697a(this.f3711F, c3489yj.f14207d1);
        }
    }

    /* renamed from: c */
    public void m4371c(float f) {
        this.f3707B = f;
        this.f3716y.setTextSize(f);
    }

    /* renamed from: c */
    public void mo4372c(String str) {
        this.f3713H = str;
    }

    /* renamed from: c */
    public void m4373c(C3489yj c3489yj) {
        C0744u c0744u = c3489yj.f14241p;
        if (c0744u != null) {
            m4376i(AbstractC0652n1.m4701d(c0744u.m6062c()));
            m4375h(AbstractC0652n1.m4701d(c3489yj.f14241p.m6057b()));
            m4371c(c3489yj.f14241p.m6067f());
            m4374g(c3489yj.f14241p.m6068g());
            m4362a(c3489yj.f14241p.m6064d());
            m4367b(c3489yj.f14241p.m6066e());
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: d */
    public void mo4147d() {
        this.f3717z.f14199b = true;
        if (this.f3708C) {
            this.f3716y.setOnClickListener(this.f3714I);
            this.f3716y.setOnTouchListener(this.f4059q);
            this.f3716y.setClickable(true);
            this.f3716y.setFocusable(true);
        }
        if (this.f3717z.f14210e1) {
            AbstractC0652n1.m4697a(this.f3711F, AbstractC0652n1.f4038r);
            this.f3717z.f14210e1 = false;
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: f */
    public C3489yj mo4148f() {
        return this.f3717z;
    }

    /* renamed from: g */
    public void m4374g(int i) {
        this.f3716y.setTypeface(this.f3717z.f14241p.m6069h(), AbstractC0652n1.m4702e(i));
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: h */
    public View mo4150h() {
        return this.f3711F;
    }

    /* renamed from: h */
    public void m4375h(int i) {
        this.f3709D = true;
        this.f4046d = i;
        C3489yj c3489yj = this.f3717z;
        C2434ej c2434ej = c3489yj.f14173O0;
        if (c2434ej == null) {
            if (c3489yj.f14241p.m6071j()) {
                this.f3711F.setBackgroundColor(i);
            }
        } else {
            c2434ej.m11615a(this.f4053k);
            Drawable m6122a = C0755x1.m6122a(this.f3717z.f14173O0, this.f4046d);
            this.f4047e = m6122a;
            this.f3711F.setBackgroundDrawable(m6122a);
        }
    }

    /* renamed from: i */
    public void m4376i(int i) {
        this.f3710E = true;
        this.f3706A = i;
        this.f3716y.setTextColor(i);
    }

    /* renamed from: m */
    public String m4377m() {
        return this.f3715x;
    }

    /* renamed from: n */
    public TextView m4378n() {
        return this.f3716y;
    }

    /* renamed from: o */
    public String mo4379o() {
        return this.f3713H;
    }

    /* renamed from: p */
    public boolean mo4380p() {
        return this.f3712G;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0051, code lost:
    
        if (r4.f4055m != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0058, code lost:
    
        r0 = r4.f3716y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x005b, code lost:
    
        r4.f3716y.setGravity(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0056, code lost:
    
        if (r4.f4055m != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4381q() {
        /*
            r4 = this;
            yj r0 = r4.f3717z
            java.lang.String r0 = r0.f14214g
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r1 = "C"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L61
            yj r0 = r4.f3717z
            java.lang.String r0 = r0.f14214g
            java.lang.String r1 = "Center"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L1c
            goto L61
        L1c:
            yj r0 = r4.f3717z
            java.lang.String r0 = r0.f14214g
            java.lang.String r1 = "L"
            boolean r0 = r0.equalsIgnoreCase(r1)
            r1 = 5
            r2 = 3
            if (r0 != 0) goto L54
            yj r0 = r4.f3717z
            java.lang.String r0 = r0.f14214g
            java.lang.String r3 = "Left"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L37
            goto L54
        L37:
            yj r0 = r4.f3717z
            java.lang.String r0 = r0.f14214g
            java.lang.String r3 = "R"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 != 0) goto L4f
            yj r0 = r4.f3717z
            java.lang.String r0 = r0.f14214g
            java.lang.String r3 = "Right"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L68
        L4f:
            boolean r0 = r4.f4055m
            if (r0 == 0) goto L58
            goto L5b
        L54:
            boolean r0 = r4.f4055m
            if (r0 == 0) goto L5b
        L58:
            android.widget.TextView r0 = r4.f3716y
            goto L65
        L5b:
            android.widget.TextView r0 = r4.f3716y
            r0.setGravity(r2)
            goto L68
        L61:
            android.widget.TextView r0 = r4.f3716y
            r1 = 17
        L65:
            r0.setGravity(r1)
        L68:
            yj r0 = r4.f3717z
            java.lang.String r1 = r0.f14217h
            if (r1 != 0) goto L6f
            return
        L6f:
            java.lang.String r0 = r0.f14214g
            java.lang.String r1 = "M"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto Lc1
            yj r0 = r4.f3717z
            java.lang.String r0 = r0.f14214g
            java.lang.String r1 = "Middle"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L86
            goto Lc1
        L86:
            yj r0 = r4.f3717z
            java.lang.String r0 = r0.f14214g
            java.lang.String r1 = "B"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto Lbc
            yj r0 = r4.f3717z
            java.lang.String r0 = r0.f14214g
            java.lang.String r1 = "Bottom"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L9f
            goto Lbc
        L9f:
            yj r0 = r4.f3717z
            java.lang.String r0 = r0.f14214g
            java.lang.String r1 = "T"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto Lb7
            yj r0 = r4.f3717z
            java.lang.String r0 = r0.f14214g
            java.lang.String r1 = "Top"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto Lc8
        Lb7:
            android.widget.TextView r0 = r4.f3716y
            r1 = 48
            goto Lc5
        Lbc:
            android.widget.TextView r0 = r4.f3716y
            r1 = 80
            goto Lc5
        Lc1:
            android.widget.TextView r0 = r4.f3716y
            r1 = 16
        Lc5:
            r0.setGravity(r1)
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0630g0.m4381q():void");
    }
}
