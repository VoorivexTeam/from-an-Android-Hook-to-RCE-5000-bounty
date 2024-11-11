package com.comviva.webaxn.ui;

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
import com.comviva.webaxn.utils.x1;
import defpackage.dj;
import defpackage.q2;
import defpackage.vj;
import defpackage.yj;

/* loaded from: classes.dex */
public class b0 extends n1 {
    private yj x;
    private LinearLayout y;
    private v0 z;

    public b0(Context context, yj yjVar, v0 v0Var) {
        super(context);
        this.x = yjVar;
        this.z = v0Var;
        int f = (int) yjVar.p.f();
        int c = yjVar.p.c();
        LinearLayout linearLayout = new LinearLayout(this.c);
        this.y = linearLayout;
        vj vjVar = this.x.q1;
        if (vjVar != null) {
            q2.a(linearLayout, vjVar.a());
        }
        if (yjVar.O0 != null) {
            this.d = c;
            this.x.O0.a(this.k);
            Drawable a = x1.a(yjVar.O0, this.d);
            this.e = a;
            this.y.setBackgroundDrawable(a);
        } else if (yjVar.p.k()) {
            this.y.setBackgroundColor(n1.d(c));
        }
        this.y.setMinimumHeight((f < 0 || f > 10) ? (f <= 10 || f > 20) ? (f <= 20 || f > 30) ? 1 : 4 : 3 : 2);
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

    public void b(yj yjVar) {
        this.x = yjVar;
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

    public void m() {
        dj djVar = this.x.J0;
        if (djVar != null) {
            n1.a(djVar, h());
        }
    }

    public void n() {
        if (this.b != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(this.x.d(this.z.c.width()), this.x.i(this.z.c.width()), this.x.g(this.z.c.width()), this.x.a(this.z.c.width()));
            this.b.addView(this.y, layoutParams);
        }
    }
}
