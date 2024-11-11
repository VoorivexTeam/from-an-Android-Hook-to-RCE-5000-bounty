package com.comviva.webaxn.p002ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.View;
import android.widget.AbsoluteLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.comviva.webaxn.utils.C0731p1;
import com.comviva.webaxn.utils.C0755x1;
import com.mtni.myirancell.R;
import p000.C3107q2;
import p000.C3361vj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.t */
/* loaded from: classes.dex */
public class C0664t extends AbstractC0652n1 {

    /* renamed from: A */
    private C0639j0 f4326A;

    /* renamed from: B */
    private View.OnClickListener f4327B;

    /* renamed from: x */
    private ImageView f4328x;

    /* renamed from: y */
    private LinearLayout f4329y;

    /* renamed from: z */
    private C3489yj f4330z;

    /* renamed from: com.comviva.webaxn.ui.t$a */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0664t c0664t = C0664t.this;
            C0731p1.m5964a(c0664t.f4045c, c0664t.f4330z, null, null, null, null, C0664t.this.f4330z.f14241p.m6070i(), null, null, null, null, null, null, null, null);
        }
    }

    public C0664t(Context context, C3489yj c3489yj, C0639j0 c0639j0) {
        super(context);
        this.f4327B = new a();
        this.f4330z = c3489yj;
        this.f4326A = c0639j0;
        this.f4328x = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(this.f4045c);
        this.f4329y = linearLayout;
        linearLayout.addView(this.f4328x, layoutParams);
        this.f4329y.setOrientation(1);
        C3361vj c3361vj = this.f4330z.f14246q1;
        if (c3361vj != null) {
            C3107q2.m14884a(this.f4329y, c3361vj.m16034a());
        }
        if (!TextUtils.isEmpty(this.f4330z.f14249r1)) {
            this.f4329y.setContentDescription(this.f4330z.f14249r1);
        }
        if (c3489yj.f14199b) {
            this.f4329y.setOnClickListener(this.f4327B);
            this.f4329y.setOnTouchListener(this.f4059q);
        } else {
            AbstractC0652n1.m4697a(this.f4329y, this.f4330z.f14207d1);
            this.f4330z.f14210e1 = true;
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4139a(AbsoluteLayout.LayoutParams layoutParams) {
        ((AbsoluteLayout.LayoutParams) this.f4329y.getLayoutParams()).x = layoutParams.x;
        ((AbsoluteLayout.LayoutParams) this.f4329y.getLayoutParams()).y = layoutParams.y;
        if (layoutParams.width > 0) {
            ((AbsoluteLayout.LayoutParams) this.f4329y.getLayoutParams()).width = layoutParams.width;
        }
        if (layoutParams.height > 0) {
            ((AbsoluteLayout.LayoutParams) this.f4329y.getLayoutParams()).height = layoutParams.height;
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4201a(C0657p0 c0657p0) {
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
        m4969a(c3489yj.f14254t0);
    }

    /* renamed from: a */
    public void m4969a(byte[] bArr) {
        Bitmap bitmap;
        int identifier = !TextUtils.isEmpty(this.f4330z.f14242p0) ? this.f4045c.getResources().getIdentifier(this.f4330z.f14242p0, "drawable", this.f4045c.getPackageName()) : 0;
        try {
            bitmap = identifier > 0 ? BitmapFactory.decodeResource(this.f4045c.getResources(), identifier) : bArr != null ? BitmapFactory.decodeByteArray(bArr, 0, bArr.length) : BitmapFactory.decodeResource(this.f4045c.getResources(), R.drawable.click);
        } catch (Exception e) {
            e.printStackTrace();
            bitmap = null;
            this.f4328x.setImageBitmap(bitmap);
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            bitmap = null;
            this.f4328x.setImageBitmap(bitmap);
        }
        this.f4328x.setImageBitmap(bitmap);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4142b() {
        this.f4044b.removeView(this.f4329y);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: c */
    public void mo4146c() {
        this.f4330z.f14199b = false;
        this.f4329y.setOnClickListener(null);
        this.f4329y.setOnTouchListener(null);
        this.f4329y.setClickable(false);
        this.f4329y.setFocusable(false);
        C3489yj c3489yj = this.f4330z;
        if (c3489yj.f14210e1) {
            AbstractC0652n1.m4697a(this.f4329y, c3489yj.f14207d1);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: d */
    public void mo4147d() {
        this.f4330z.f14199b = true;
        this.f4329y.setOnClickListener(this.f4327B);
        this.f4329y.setOnTouchListener(this.f4059q);
        this.f4329y.setClickable(true);
        this.f4329y.setFocusable(true);
        if (this.f4330z.f14210e1) {
            AbstractC0652n1.m4697a(this.f4329y, AbstractC0652n1.f4038r);
            this.f4330z.f14210e1 = false;
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
        return this.f4329y;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: l */
    public boolean mo4290l() {
        C0755x1.m6185e(this.f4045c, "msg.DrawEmpty");
        return false;
    }

    /* renamed from: m */
    public int m4970m() {
        String str;
        C3489yj c3489yj = this.f4330z;
        if (c3489yj != null && (str = c3489yj.f14214g) != null) {
            if (str.equalsIgnoreCase("C") || this.f4330z.f14214g.equalsIgnoreCase("Center")) {
                return 1;
            }
            if (this.f4330z.f14214g.equalsIgnoreCase("L") || this.f4330z.f14214g.equalsIgnoreCase("Left")) {
                if (this.f4055m) {
                    return 5;
                }
            } else if ((this.f4330z.f14214g.equalsIgnoreCase("R") || this.f4330z.f14214g.equalsIgnoreCase("Right")) && !this.f4055m) {
                return 5;
            }
        }
        return 3;
    }

    /* renamed from: n */
    public void m4971n() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(70, 70);
        this.f4053k = 70;
        this.f4054l = 100;
        layoutParams.gravity = m4970m();
        layoutParams.setMargins(this.f4330z.m16638d(this.f4326A.f3880q.f4397c.width()), this.f4330z.m16643i(this.f4326A.f3880q.f4397c.width()), this.f4330z.m16641g(this.f4326A.f3880q.f4397c.width()), this.f4330z.m16632a(this.f4326A.f3880q.f4397c.width()));
        this.f4044b.addView(this.f4329y, layoutParams);
    }
}
