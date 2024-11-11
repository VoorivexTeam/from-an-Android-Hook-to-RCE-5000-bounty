package com.comviva.webaxn.ui;

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
import defpackage.dj;
import defpackage.ej;
import defpackage.q2;
import defpackage.vj;
import defpackage.yj;

/* loaded from: classes.dex */
public class c0 extends n1 {
    private yj x;
    private LinearLayout y;

    public c0(Context context, yj yjVar, j0 j0Var) {
        super(context);
        this.x = yjVar;
        LinearLayout linearLayout = new LinearLayout(this.c);
        this.y = linearLayout;
        linearLayout.setOrientation(1);
        vj vjVar = this.x.q1;
        if (vjVar != null) {
            q2.a(this.y, vjVar.a());
        }
        ej ejVar = this.x.O0;
        if (ejVar != null) {
            ejVar.a(j0Var.f);
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(AbsoluteLayout.LayoutParams layoutParams) {
        ((AbsoluteLayout.LayoutParams) this.y.getLayoutParams()).x = layoutParams.x;
        ((AbsoluteLayout.LayoutParams) this.y.getLayoutParams()).y = layoutParams.y;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(yj yjVar) {
        a(yjVar.v0);
    }

    public void a(byte[] bArr) {
        com.comviva.webaxn.utils.b.a(this.c).a().a();
        int identifier = !TextUtils.isEmpty(this.x.r0) ? this.c.getResources().getIdentifier(this.x.r0, "drawable", this.c.getPackageName()) : 0;
        try {
            if (identifier > 0) {
                Bitmap a = com.comviva.webaxn.utils.e1.b(this.c).a(this.x.r0);
                if (a == null && (a = BitmapFactory.decodeResource(this.c.getResources(), identifier)) != null) {
                    com.comviva.webaxn.utils.e1.b(this.c).a(this.x.r0, a);
                }
                this.e = NinePatch.isNinePatchChunk(a.getNinePatchChunk()) ? new NinePatchDrawable(a, a.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(a);
                this.y.setBackgroundDrawable(this.e);
                return;
            }
            if (bArr != null) {
                Bitmap a2 = com.comviva.webaxn.utils.e1.b(this.c).a(this.x.O);
                if (a2 == null && (a2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                    com.comviva.webaxn.utils.e1.b(this.c).a(this.x.O, a2);
                }
                a2.setDensity(160);
                this.e = NinePatch.isNinePatchChunk(a2.getNinePatchChunk()) ? new NinePatchDrawable(a2, a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(a2);
                this.y.setBackgroundDrawable(this.e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b() {
        this.b.removeView(this.y);
    }

    public void b(yj yjVar) {
        this.x = yjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int c(android.widget.AbsoluteLayout.LayoutParams r5) {
        /*
            r4 = this;
            yj r0 = r4.x
            com.comviva.webaxn.utils.u r0 = r0.p
            float r0 = r0.f()
            int r0 = (int) r0
            yj r1 = r4.x
            com.comviva.webaxn.utils.u r1 = r1.p
            int r1 = r1.c()
            yj r2 = r4.x
            ej r3 = r2.O0
            if (r3 == 0) goto L25
            r4.d = r1
            android.graphics.drawable.Drawable r1 = com.comviva.webaxn.utils.x1.a(r3, r1)
            r4.e = r1
            android.widget.LinearLayout r2 = r4.y
            r2.setBackgroundDrawable(r1)
            goto L36
        L25:
            com.comviva.webaxn.utils.u r2 = r2.p
            boolean r2 = r2.k()
            if (r2 == 0) goto L36
            android.widget.LinearLayout r2 = r4.y
            int r1 = com.comviva.webaxn.ui.n1.d(r1)
            r2.setBackgroundColor(r1)
        L36:
            r1 = 10
            if (r0 < 0) goto L40
            if (r0 > r1) goto L40
            r0 = 2
        L3d:
            r4.k = r0
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
            int r0 = r4.l
        L57:
            r4.l = r0
            android.widget.AbsoluteLayout$LayoutParams r0 = new android.widget.AbsoluteLayout$LayoutParams
            int r1 = r4.l
            int r2 = r4.k
            int r3 = r5.x
            int r5 = r5.y
            r0.<init>(r1, r2, r3, r5)
            android.widget.LinearLayout r5 = r4.y
            r5.setLayoutParams(r0)
            int r5 = r4.k
            int r5 = r5 + 0
            r4.k = r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.c0.c(android.widget.AbsoluteLayout$LayoutParams):int");
    }

    @Override // com.comviva.webaxn.ui.n1
    public void c() {
    }

    @Override // com.comviva.webaxn.ui.n1
    public void d() {
    }

    @Override // com.comviva.webaxn.ui.n1
    public yj f() {
        return this.x;
    }

    @Override // com.comviva.webaxn.ui.n1
    public View h() {
        return this.y;
    }

    @Override // com.comviva.webaxn.ui.n1
    public int i() {
        return this.k;
    }

    @Override // com.comviva.webaxn.ui.n1
    public int j() {
        return this.l;
    }

    public void m() {
        dj djVar = this.x.J0;
        if (djVar != null) {
            n1.a(djVar, h());
        }
    }

    public void n() {
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.addView(this.y);
            this.b.invalidate();
        }
    }
}
