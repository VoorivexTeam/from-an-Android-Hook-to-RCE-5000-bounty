package com.comviva.webaxn.p002ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.comviva.webaxn.utils.C0731p1;
import com.comviva.webaxn.utils.C0755x1;
import com.mtni.myirancell.R;
import p000.C3107q2;
import p000.C3361vj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.u */
/* loaded from: classes.dex */
public class C0666u extends AbstractC0652n1 {

    /* renamed from: A */
    private C0669v0 f4337A;

    /* renamed from: B */
    private View.OnClickListener f4338B;

    /* renamed from: x */
    private ImageView f4339x;

    /* renamed from: y */
    private LinearLayout f4340y;

    /* renamed from: z */
    private C3489yj f4341z;

    /* renamed from: com.comviva.webaxn.ui.u$a */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0666u c0666u = C0666u.this;
            C0731p1.m5964a(c0666u.f4045c, c0666u.f4341z, null, null, null, null, C0666u.this.f4341z.f14241p.m6070i(), null, null, null, null, null, null, null, null);
        }
    }

    public C0666u(Context context, C3489yj c3489yj, C0669v0 c0669v0) {
        super(context);
        this.f4338B = new a();
        this.f4341z = c3489yj;
        this.f4337A = c0669v0;
        this.f4339x = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(this.f4045c);
        this.f4340y = linearLayout;
        C3361vj c3361vj = this.f4341z.f14246q1;
        if (c3361vj != null) {
            C3107q2.m14884a(linearLayout, c3361vj.m16034a());
        }
        if (!TextUtils.isEmpty(this.f4341z.f14249r1)) {
            this.f4340y.setContentDescription(this.f4341z.f14249r1);
        }
        this.f4340y.addView(this.f4339x, layoutParams);
        if (c3489yj.f14199b) {
            this.f4340y.setOnClickListener(this.f4338B);
            this.f4340y.setOnTouchListener(this.f4059q);
        } else {
            AbstractC0652n1.m4697a(this.f4340y, this.f4341z.f14207d1);
            this.f4341z.f14210e1 = true;
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
        m4988a(c3489yj.f14254t0);
    }

    /* renamed from: a */
    public void m4988a(byte[] bArr) {
        Bitmap bitmap;
        int identifier = !TextUtils.isEmpty(this.f4341z.f14242p0) ? this.f4045c.getResources().getIdentifier(this.f4341z.f14242p0, "drawable", this.f4045c.getPackageName()) : 0;
        try {
            bitmap = identifier > 0 ? BitmapFactory.decodeResource(this.f4045c.getResources(), identifier) : bArr != null ? BitmapFactory.decodeByteArray(bArr, 0, bArr.length) : BitmapFactory.decodeResource(this.f4045c.getResources(), R.drawable.click);
        } catch (Exception e) {
            e.printStackTrace();
            bitmap = null;
            this.f4339x.setImageBitmap(bitmap);
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            bitmap = null;
            this.f4339x.setImageBitmap(bitmap);
        }
        this.f4339x.setImageBitmap(bitmap);
    }

    /* renamed from: b */
    public void m4989b(C3489yj c3489yj) {
        this.f4341z = c3489yj;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: c */
    public void mo4146c() {
        this.f4341z.f14199b = false;
        this.f4340y.setOnClickListener(null);
        this.f4340y.setOnTouchListener(null);
        this.f4340y.setClickable(false);
        this.f4340y.setFocusable(false);
        C3489yj c3489yj = this.f4341z;
        if (c3489yj.f14210e1) {
            AbstractC0652n1.m4697a(this.f4340y, c3489yj.f14207d1);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: d */
    public void mo4147d() {
        this.f4341z.f14199b = true;
        this.f4340y.setOnClickListener(this.f4338B);
        this.f4340y.setOnTouchListener(this.f4059q);
        this.f4340y.setClickable(true);
        this.f4340y.setFocusable(true);
        if (this.f4341z.f14210e1) {
            AbstractC0652n1.m4697a(this.f4340y, AbstractC0652n1.f4038r);
            this.f4341z.f14210e1 = false;
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: f */
    public C3489yj mo4148f() {
        return null;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: h */
    public View mo4150h() {
        return this.f4340y;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: l */
    public boolean mo4290l() {
        C0755x1.m6185e(this.f4045c, "msg.DrawEmpty");
        return false;
    }

    /* renamed from: m */
    public int m4990m() {
        String str;
        C3489yj c3489yj = this.f4341z;
        if (c3489yj != null && (str = c3489yj.f14214g) != null) {
            if (str.equalsIgnoreCase("C") || this.f4341z.f14214g.equalsIgnoreCase("Center")) {
                return 1;
            }
            if (this.f4341z.f14214g.equalsIgnoreCase("L") || this.f4341z.f14214g.equalsIgnoreCase("Left")) {
                if (this.f4055m) {
                    return 5;
                }
            } else if ((this.f4341z.f14214g.equalsIgnoreCase("R") || this.f4341z.f14214g.equalsIgnoreCase("Right")) && !this.f4055m) {
                return 5;
            }
        }
        return 3;
    }

    /* renamed from: n */
    public void m4991n() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(200, 100);
        layoutParams.gravity = m4990m();
        layoutParams.setMargins(this.f4341z.m16638d(this.f4337A.f4397c.width()), this.f4341z.m16643i(this.f4337A.f4397c.width()), this.f4341z.m16641g(this.f4337A.f4397c.width()), this.f4341z.m16632a(this.f4337A.f4397c.width()));
        this.f4044b.addView(this.f4340y, layoutParams);
    }
}
