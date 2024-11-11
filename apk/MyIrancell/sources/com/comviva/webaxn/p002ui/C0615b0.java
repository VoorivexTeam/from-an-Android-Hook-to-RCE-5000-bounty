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
import android.widget.LinearLayout;
import com.comviva.webaxn.utils.C0687b;
import com.comviva.webaxn.utils.C0698e1;
import com.comviva.webaxn.utils.C0755x1;
import p000.C2391dj;
import p000.C3107q2;
import p000.C3361vj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.b0 */
/* loaded from: classes.dex */
public class C0615b0 extends AbstractC0652n1 {

    /* renamed from: x */
    private C3489yj f3529x;

    /* renamed from: y */
    private LinearLayout f3530y;

    /* renamed from: z */
    private C0669v0 f3531z;

    public C0615b0(Context context, C3489yj c3489yj, C0669v0 c0669v0) {
        super(context);
        this.f3529x = c3489yj;
        this.f3531z = c0669v0;
        int m6067f = (int) c3489yj.f14241p.m6067f();
        int m6062c = c3489yj.f14241p.m6062c();
        LinearLayout linearLayout = new LinearLayout(this.f4045c);
        this.f3530y = linearLayout;
        C3361vj c3361vj = this.f3529x.f14246q1;
        if (c3361vj != null) {
            C3107q2.m14884a(linearLayout, c3361vj.m16034a());
        }
        if (c3489yj.f14173O0 != null) {
            this.f4046d = m6062c;
            this.f3529x.f14173O0.m11615a(this.f4053k);
            Drawable m6122a = C0755x1.m6122a(c3489yj.f14173O0, this.f4046d);
            this.f4047e = m6122a;
            this.f3530y.setBackgroundDrawable(m6122a);
        } else if (c3489yj.f14241p.m6072k()) {
            this.f3530y.setBackgroundColor(AbstractC0652n1.m4701d(m6062c));
        }
        this.f3530y.setMinimumHeight((m6067f < 0 || m6067f > 10) ? (m6067f <= 10 || m6067f > 20) ? (m6067f <= 20 || m6067f > 30) ? 1 : 4 : 3 : 2);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
        m4167a(c3489yj.f14260v0);
    }

    /* renamed from: a */
    public void m4167a(byte[] bArr) {
        C0687b.m5342a(this.f4045c).m5343a().m5544a();
        int identifier = !TextUtils.isEmpty(this.f3529x.f14248r0) ? this.f4045c.getResources().getIdentifier(this.f3529x.f14248r0, "drawable", this.f4045c.getPackageName()) : 0;
        try {
            if (identifier > 0) {
                Bitmap m5429a = C0698e1.m5426b(this.f4045c).m5429a(this.f3529x.f14248r0);
                if (m5429a == null && (m5429a = BitmapFactory.decodeResource(this.f4045c.getResources(), identifier)) != null) {
                    C0698e1.m5426b(this.f4045c).m5432a(this.f3529x.f14248r0, m5429a);
                }
                this.f4047e = NinePatch.isNinePatchChunk(m5429a.getNinePatchChunk()) ? new NinePatchDrawable(m5429a, m5429a.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a);
                this.f3530y.setBackgroundDrawable(this.f4047e);
                return;
            }
            if (bArr != null) {
                Bitmap m5429a2 = C0698e1.m5426b(this.f4045c).m5429a(this.f3529x.f14172O);
                if (m5429a2 == null && (m5429a2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                    C0698e1.m5426b(this.f4045c).m5432a(this.f3529x.f14172O, m5429a2);
                }
                m5429a2.setDensity(160);
                this.f4047e = NinePatch.isNinePatchChunk(m5429a2.getNinePatchChunk()) ? new NinePatchDrawable(m5429a2, m5429a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a2);
                this.f3530y.setBackgroundDrawable(this.f4047e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: b */
    public void m4168b(C3489yj c3489yj) {
        this.f3529x = c3489yj;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: c */
    public void mo4146c() {
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: d */
    public void mo4147d() {
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: f */
    public C3489yj mo4148f() {
        return this.f3529x;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: h */
    public View mo4150h() {
        return this.f3530y;
    }

    /* renamed from: m */
    public void m4169m() {
        C2391dj c2391dj = this.f3529x.f14163J0;
        if (c2391dj != null) {
            AbstractC0652n1.m4700a(c2391dj, mo4150h());
        }
    }

    /* renamed from: n */
    public void m4170n() {
        if (this.f4044b != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(this.f3529x.m16638d(this.f3531z.f4397c.width()), this.f3529x.m16643i(this.f3531z.f4397c.width()), this.f3529x.m16641g(this.f3531z.f4397c.width()), this.f3529x.m16632a(this.f3531z.f4397c.width()));
            this.f4044b.addView(this.f3530y, layoutParams);
        }
    }
}
