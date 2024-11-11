package com.comviva.webaxn.p002ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.NinePatchDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import android.widget.LinearLayout;
import com.comviva.webaxn.utils.C0687b;
import com.comviva.webaxn.utils.C0698e1;
import p000.C2391dj;
import p000.C2434ej;
import p000.C3107q2;
import p000.C3361vj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.c0 */
/* loaded from: classes.dex */
public class C0618c0 extends AbstractC0652n1 {

    /* renamed from: x */
    private C3489yj f3540x;

    /* renamed from: y */
    private LinearLayout f3541y;

    public C0618c0(Context context, C3489yj c3489yj, C0639j0 c0639j0) {
        super(context);
        this.f3540x = c3489yj;
        LinearLayout linearLayout = new LinearLayout(this.f4045c);
        this.f3541y = linearLayout;
        linearLayout.setOrientation(1);
        C3361vj c3361vj = this.f3540x.f14246q1;
        if (c3361vj != null) {
            C3107q2.m14884a(this.f3541y, c3361vj.m16034a());
        }
        C2434ej c2434ej = this.f3540x.f14173O0;
        if (c2434ej != null) {
            c2434ej.m11615a(c0639j0.f3869f);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4139a(AbsoluteLayout.LayoutParams layoutParams) {
        ((AbsoluteLayout.LayoutParams) this.f3541y.getLayoutParams()).x = layoutParams.x;
        ((AbsoluteLayout.LayoutParams) this.f3541y.getLayoutParams()).y = layoutParams.y;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
        m4182a(c3489yj.f14260v0);
    }

    /* renamed from: a */
    public void m4182a(byte[] bArr) {
        C0687b.m5342a(this.f4045c).m5343a().m5544a();
        int identifier = !TextUtils.isEmpty(this.f3540x.f14248r0) ? this.f4045c.getResources().getIdentifier(this.f3540x.f14248r0, "drawable", this.f4045c.getPackageName()) : 0;
        try {
            if (identifier > 0) {
                Bitmap m5429a = C0698e1.m5426b(this.f4045c).m5429a(this.f3540x.f14248r0);
                if (m5429a == null && (m5429a = BitmapFactory.decodeResource(this.f4045c.getResources(), identifier)) != null) {
                    C0698e1.m5426b(this.f4045c).m5432a(this.f3540x.f14248r0, m5429a);
                }
                this.f4047e = NinePatch.isNinePatchChunk(m5429a.getNinePatchChunk()) ? new NinePatchDrawable(m5429a, m5429a.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a);
                this.f3541y.setBackgroundDrawable(this.f4047e);
                return;
            }
            if (bArr != null) {
                Bitmap m5429a2 = C0698e1.m5426b(this.f4045c).m5429a(this.f3540x.f14172O);
                if (m5429a2 == null && (m5429a2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                    C0698e1.m5426b(this.f4045c).m5432a(this.f3540x.f14172O, m5429a2);
                }
                m5429a2.setDensity(160);
                this.f4047e = NinePatch.isNinePatchChunk(m5429a2.getNinePatchChunk()) ? new NinePatchDrawable(m5429a2, m5429a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a2);
                this.f3541y.setBackgroundDrawable(this.f4047e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4142b() {
        this.f4044b.removeView(this.f3541y);
    }

    /* renamed from: b */
    public void m4183b(C3489yj c3489yj) {
        this.f3540x = c3489yj;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m4184c(android.widget.AbsoluteLayout.LayoutParams r5) {
        /*
            r4 = this;
            yj r0 = r4.f3540x
            com.comviva.webaxn.utils.u r0 = r0.f14241p
            float r0 = r0.m6067f()
            int r0 = (int) r0
            yj r1 = r4.f3540x
            com.comviva.webaxn.utils.u r1 = r1.f14241p
            int r1 = r1.m6062c()
            yj r2 = r4.f3540x
            ej r3 = r2.f14173O0
            if (r3 == 0) goto L25
            r4.f4046d = r1
            android.graphics.drawable.Drawable r1 = com.comviva.webaxn.utils.C0755x1.m6122a(r3, r1)
            r4.f4047e = r1
            android.widget.LinearLayout r2 = r4.f3541y
            r2.setBackgroundDrawable(r1)
            goto L36
        L25:
            com.comviva.webaxn.utils.u r2 = r2.f14241p
            boolean r2 = r2.m6072k()
            if (r2 == 0) goto L36
            android.widget.LinearLayout r2 = r4.f3541y
            int r1 = com.comviva.webaxn.p002ui.AbstractC0652n1.m4701d(r1)
            r2.setBackgroundColor(r1)
        L36:
            r1 = 10
            if (r0 < 0) goto L40
            if (r0 > r1) goto L40
            r0 = 2
        L3d:
            r4.f4053k = r0
            goto L50
        L40:
            r2 = 20
            if (r0 <= r1) goto L48
            if (r0 > r2) goto L48
            r0 = 3
            goto L3d
        L48:
            if (r0 <= r2) goto L50
            r1 = 30
            if (r0 > r1) goto L50
            r0 = 4
            goto L3d
        L50:
            int r0 = r5.width
            if (r0 <= 0) goto L55
            goto L57
        L55:
            int r0 = r4.f4054l
        L57:
            r4.f4054l = r0
            android.widget.AbsoluteLayout$LayoutParams r0 = new android.widget.AbsoluteLayout$LayoutParams
            int r1 = r4.f4054l
            int r2 = r4.f4053k
            int r3 = r5.x
            int r5 = r5.y
            r0.<init>(r1, r2, r3, r5)
            android.widget.LinearLayout r5 = r4.f3541y
            r5.setLayoutParams(r0)
            int r5 = r4.f4053k
            int r5 = r5 + 0
            r4.f4053k = r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0618c0.m4184c(android.widget.AbsoluteLayout$LayoutParams):int");
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
        return this.f3540x;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: h */
    public View mo4150h() {
        return this.f3541y;
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

    /* renamed from: m */
    public void m4185m() {
        C2391dj c2391dj = this.f3540x.f14163J0;
        if (c2391dj != null) {
            AbstractC0652n1.m4700a(c2391dj, mo4150h());
        }
    }

    /* renamed from: n */
    public void m4186n() {
        ViewGroup viewGroup = this.f4044b;
        if (viewGroup != null) {
            viewGroup.addView(this.f3541y);
            this.f4044b.invalidate();
        }
    }
}
