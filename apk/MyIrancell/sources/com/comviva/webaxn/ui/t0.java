package com.comviva.webaxn.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.AbsoluteLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.comviva.webaxn.utils.x1;
import com.mtni.myirancell.R;
import defpackage.aj;
import defpackage.dj;
import defpackage.kj;
import defpackage.yj;

/* loaded from: classes.dex */
public class t0 extends n1 {
    private yj x;
    private LinearLayout y;
    private RadioGroup z;

    /* loaded from: classes.dex */
    class a implements RadioGroup.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            RadioButton radioButton = (RadioButton) radioGroup.findViewById(i);
            if (radioButton == null || !radioButton.isChecked()) {
                return;
            }
            radioButton.setError(null);
            t0 t0Var = t0.this;
            t0Var.g.b(t0Var);
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (((RadioButton) view).isChecked()) {
                    if (!TextUtils.isEmpty(t0.this.x.u1)) {
                        t0.this.a(t0.this.x.u1);
                    }
                    t0.this.g.a(t0.this, t0.this.m(), t0.this.x);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t0(android.content.Context r4, java.lang.String r5, defpackage.yj r6, com.comviva.webaxn.ui.j0 r7) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.t0.<init>(android.content.Context, java.lang.String, yj, com.comviva.webaxn.ui.j0):void");
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(AbsoluteLayout.LayoutParams layoutParams) {
        ((AbsoluteLayout.LayoutParams) this.y.getLayoutParams()).x = layoutParams.x;
        ((AbsoluteLayout.LayoutParams) this.y.getLayoutParams()).y = layoutParams.y;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(p0 p0Var) {
        this.y.setPadding(p0Var.a, p0Var.b, p0Var.c, p0Var.d);
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
                Bitmap a2 = com.comviva.webaxn.utils.e1.b(this.c).a(this.x.r0);
                if (a2 == null && (a2 = BitmapFactory.decodeResource(this.c.getResources(), identifier)) != null) {
                    com.comviva.webaxn.utils.e1.b(this.c).a(this.x.r0, a2);
                }
                this.e = NinePatch.isNinePatchChunk(a2.getNinePatchChunk()) ? new NinePatchDrawable(a2, a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(a2);
                this.y.setBackgroundDrawable(this.e);
                return;
            }
            if (bArr != null) {
                Bitmap a3 = com.comviva.webaxn.utils.e1.b(this.c).a(this.x.O);
                if (a3 == null && (a3 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                    com.comviva.webaxn.utils.e1.b(this.c).a(this.x.O, a3);
                }
                this.e = NinePatch.isNinePatchChunk(a3.getNinePatchChunk()) ? new NinePatchDrawable(a3, a3.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(a3);
                this.y.setBackgroundDrawable(this.e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
    }

    public int b(String str) {
        int i;
        int i2;
        String e = aj.a(this.c).e(this.x.V);
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (e == null) {
            i = 0;
        } else {
            try {
                i = Integer.parseInt(e);
            } catch (Exception e2) {
                e2.printStackTrace();
                i = -1;
            }
        }
        if (i == 0) {
            try {
                return Integer.parseInt(str);
            } catch (Exception e3) {
                e3.printStackTrace();
                return 0;
            }
        }
        if (i == 1) {
            i2 = 0;
            while (i2 < this.x.P.size()) {
                if (!this.x.P.elementAt(i2).b.equals(str)) {
                    i2++;
                }
            }
            return 0;
        }
        if (i != 2) {
            return 0;
        }
        i2 = 0;
        while (i2 < this.x.P.size()) {
            if (!this.x.P.elementAt(i2).a.equals(str)) {
                i2++;
            }
        }
        return 0;
        return i2;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b() {
        this.b.removeView(this.y);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b(int i) {
        super.b(i);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b(AbsoluteLayout.LayoutParams layoutParams) {
        boolean z;
        this.l = layoutParams.width;
        this.k = layoutParams.height;
        String str = this.x.m0;
        if (str == null || str.equalsIgnoreCase("equal")) {
            this.l = -2;
            String str2 = this.x.n0;
            if (str2 == null || str2.equalsIgnoreCase("equal")) {
                this.k = -2;
            }
            z = false;
        } else {
            z = true;
        }
        this.y.setLayoutParams(new AbsoluteLayout.LayoutParams(this.l, this.k, layoutParams.x, layoutParams.y));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.y.measure(makeMeasureSpec, makeMeasureSpec);
        if (layoutParams.width > 0 && !z) {
            int measuredWidth = this.y.getMeasuredWidth();
            this.l = measuredWidth;
            int i = layoutParams.width;
            if (measuredWidth > i) {
                this.l = i;
            }
        }
        if (layoutParams.height <= 0) {
            this.k = this.y.getMeasuredHeight();
        }
    }

    public void b(yj yjVar) {
        this.x = yjVar;
    }

    public int c(AbsoluteLayout.LayoutParams layoutParams) {
        boolean z;
        this.l = layoutParams.width;
        this.k = layoutParams.height;
        String str = this.x.m0;
        if (str == null || str.equalsIgnoreCase("equal")) {
            this.l = -2;
            String str2 = this.x.n0;
            if (str2 == null || str2.equalsIgnoreCase("equal")) {
                this.k = -2;
            }
            z = false;
        } else {
            z = true;
        }
        this.y.setLayoutParams(new AbsoluteLayout.LayoutParams(this.l, this.k, layoutParams.x, layoutParams.y));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.y.measure(makeMeasureSpec, makeMeasureSpec);
        if (layoutParams.width > 0 && !z) {
            int measuredWidth = this.y.getMeasuredWidth();
            this.l = measuredWidth;
            int i = layoutParams.width;
            if (measuredWidth > i) {
                this.l = i;
            }
        }
        if (layoutParams.height <= 0) {
            this.k = this.y.getMeasuredHeight();
        }
        return this.k;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void c() {
        this.x.b = false;
        if (this.z != null) {
            for (int i = 0; i < this.z.getChildCount(); i++) {
                ((RadioButton) this.z.getChildAt(i)).setClickable(false);
            }
        }
        yj yjVar = this.x;
        if (yjVar.e1) {
            n1.a(this.z, yjVar.d1);
        }
    }

    public boolean c(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        String e = aj.a(this.c).e(this.x.V);
        if (e == null) {
            try {
                i = Integer.parseInt(str);
            } catch (Exception e2) {
                e2.printStackTrace();
                i = -1;
            }
            if (i == -1) {
                int i5 = 0;
                while (true) {
                    if (i5 >= this.x.P.size()) {
                        break;
                    }
                    if (this.x.P.elementAt(i5).b.equals(str)) {
                        i = i5;
                        break;
                    }
                    i5++;
                }
            }
            if (i == -1) {
                int i6 = 0;
                while (true) {
                    if (i6 >= this.x.P.size()) {
                        break;
                    }
                    if (this.x.P.elementAt(i6).a.equals(str)) {
                        i = i6;
                        break;
                    }
                    i6++;
                }
            }
            i2 = i;
            i3 = -1;
        } else {
            try {
                i3 = Integer.parseInt(e);
            } catch (Exception e3) {
                e3.printStackTrace();
                i3 = -1;
            }
            i2 = -1;
        }
        if (i3 != 0) {
            if (i3 == 1) {
                i4 = 0;
                while (i4 < this.x.P.size()) {
                    if (!this.x.P.elementAt(i4).b.equals(str)) {
                        i4++;
                    }
                }
            } else if (i3 == 2) {
                i4 = 0;
                while (i4 < this.x.P.size()) {
                    if (!this.x.P.elementAt(i4).a.equals(str)) {
                        i4++;
                    }
                }
            }
            i2 = i4;
            break;
        }
        try {
            i2 = Integer.parseInt(str);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        if (-1 == i2) {
            return false;
        }
        h(i2);
        return true;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void d() {
        this.x.b = true;
        if (this.z != null) {
            for (int i = 0; i < this.z.getChildCount(); i++) {
                ((RadioButton) this.z.getChildAt(i)).setClickable(true);
            }
        }
        if (this.x.e1) {
            n1.a(this.z, n1.r);
            this.x.e1 = false;
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public yj f() {
        return this.x;
    }

    public View g(int i) {
        return this.z.getChildAt(i);
    }

    @Override // com.comviva.webaxn.ui.n1
    public View h() {
        return this.y;
    }

    public void h(int i) {
        if (this.z.getChildAt(i) != null) {
            ((RadioButton) this.z.getChildAt(i)).setChecked(true);
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public int i() {
        return this.k;
    }

    @Override // com.comviva.webaxn.ui.n1
    public int j() {
        return this.l;
    }

    @Override // com.comviva.webaxn.ui.n1
    public boolean l() {
        p();
        x1.e(this.c, "msg.empty");
        return false;
    }

    public String m() {
        kj elementAt;
        if (this.x.P != null && this.z != null) {
            int i = 0;
            while (true) {
                if (i >= this.z.getChildCount()) {
                    i = -1;
                    break;
                }
                if (((RadioButton) this.z.getChildAt(i)).isChecked()) {
                    break;
                }
                i++;
            }
            if (i != -1 && (elementAt = this.x.P.elementAt(i)) != null && !TextUtils.isEmpty(elementAt.c)) {
                return elementAt.c;
            }
        }
        return null;
    }

    public int n() {
        return this.z.getChildCount();
    }

    public RadioGroup o() {
        return this.z;
    }

    public void p() {
        Drawable drawable = this.c.getResources().getDrawable(R.drawable.empty);
        RadioGroup radioGroup = this.z;
        if (radioGroup == null || radioGroup.getChildCount() <= 0) {
            return;
        }
        RadioButton radioButton = (RadioButton) this.z.getChildAt(0);
        radioButton.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        radioButton.setError(null, drawable);
    }

    public void q() {
        dj djVar = this.x.J0;
        if (djVar != null) {
            n1.a(djVar, h());
        }
    }

    public void r() {
        RadioGroup radioGroup = this.z;
        if (radioGroup != null) {
            radioGroup.clearCheck();
        }
    }

    public void s() {
        if (this.b != null) {
            com.comviva.webaxn.utils.u uVar = this.x.p;
            if (uVar != null && uVar.k()) {
                b(n1.d(this.x.p.c()));
            }
            this.b.addView(this.y);
            this.b.invalidate();
        }
    }
}
