package com.comviva.webaxn.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.View;
import android.widget.AbsoluteLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.comviva.webaxn.utils.p1;
import com.comviva.webaxn.utils.x1;
import com.mtni.myirancell.R;
import defpackage.q2;
import defpackage.vj;
import defpackage.yj;

/* loaded from: classes.dex */
public class t extends n1 {
    private j0 A;
    private View.OnClickListener B;
    private ImageView x;
    private LinearLayout y;
    private yj z;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t tVar = t.this;
            p1.a(tVar.c, tVar.z, null, null, null, null, t.this.z.p.i(), null, null, null, null, null, null, null, null);
        }
    }

    public t(Context context, yj yjVar, j0 j0Var) {
        super(context);
        this.B = new a();
        this.z = yjVar;
        this.A = j0Var;
        this.x = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(this.c);
        this.y = linearLayout;
        linearLayout.addView(this.x, layoutParams);
        this.y.setOrientation(1);
        vj vjVar = this.z.q1;
        if (vjVar != null) {
            q2.a(this.y, vjVar.a());
        }
        if (!TextUtils.isEmpty(this.z.r1)) {
            this.y.setContentDescription(this.z.r1);
        }
        if (yjVar.b) {
            this.y.setOnClickListener(this.B);
            this.y.setOnTouchListener(this.q);
        } else {
            n1.a(this.y, this.z.d1);
            this.z.e1 = true;
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(AbsoluteLayout.LayoutParams layoutParams) {
        ((AbsoluteLayout.LayoutParams) this.y.getLayoutParams()).x = layoutParams.x;
        ((AbsoluteLayout.LayoutParams) this.y.getLayoutParams()).y = layoutParams.y;
        if (layoutParams.width > 0) {
            ((AbsoluteLayout.LayoutParams) this.y.getLayoutParams()).width = layoutParams.width;
        }
        if (layoutParams.height > 0) {
            ((AbsoluteLayout.LayoutParams) this.y.getLayoutParams()).height = layoutParams.height;
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(p0 p0Var) {
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(yj yjVar) {
        a(yjVar.t0);
    }

    public void a(byte[] bArr) {
        Bitmap bitmap;
        int identifier = !TextUtils.isEmpty(this.z.p0) ? this.c.getResources().getIdentifier(this.z.p0, "drawable", this.c.getPackageName()) : 0;
        try {
            bitmap = identifier > 0 ? BitmapFactory.decodeResource(this.c.getResources(), identifier) : bArr != null ? BitmapFactory.decodeByteArray(bArr, 0, bArr.length) : BitmapFactory.decodeResource(this.c.getResources(), R.drawable.click);
        } catch (Exception e) {
            e.printStackTrace();
            bitmap = null;
            this.x.setImageBitmap(bitmap);
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            bitmap = null;
            this.x.setImageBitmap(bitmap);
        }
        this.x.setImageBitmap(bitmap);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b() {
        this.b.removeView(this.y);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void c() {
        this.z.b = false;
        this.y.setOnClickListener(null);
        this.y.setOnTouchListener(null);
        this.y.setClickable(false);
        this.y.setFocusable(false);
        yj yjVar = this.z;
        if (yjVar.e1) {
            n1.a(this.y, yjVar.d1);
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void d() {
        this.z.b = true;
        this.y.setOnClickListener(this.B);
        this.y.setOnTouchListener(this.q);
        this.y.setClickable(true);
        this.y.setFocusable(true);
        if (this.z.e1) {
            n1.a(this.y, n1.r);
            this.z.e1 = false;
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public yj f() {
        return null;
    }

    @Override // com.comviva.webaxn.ui.n1
    public View h() {
        return this.y;
    }

    @Override // com.comviva.webaxn.ui.n1
    public boolean l() {
        x1.e(this.c, "msg.DrawEmpty");
        return false;
    }

    public int m() {
        String str;
        yj yjVar = this.z;
        if (yjVar != null && (str = yjVar.g) != null) {
            if (str.equalsIgnoreCase("C") || this.z.g.equalsIgnoreCase("Center")) {
                return 1;
            }
            if (this.z.g.equalsIgnoreCase("L") || this.z.g.equalsIgnoreCase("Left")) {
                if (this.m) {
                    return 5;
                }
            } else if ((this.z.g.equalsIgnoreCase("R") || this.z.g.equalsIgnoreCase("Right")) && !this.m) {
                return 5;
            }
        }
        return 3;
    }

    public void n() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(70, 70);
        this.k = 70;
        this.l = 100;
        layoutParams.gravity = m();
        layoutParams.setMargins(this.z.d(this.A.q.c.width()), this.z.i(this.A.q.c.width()), this.z.g(this.A.q.c.width()), this.z.a(this.A.q.c.width()));
        this.b.addView(this.y, layoutParams);
    }
}
