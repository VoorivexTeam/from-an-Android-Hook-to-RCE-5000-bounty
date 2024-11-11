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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.comviva.webaxn.utils.x1;
import com.mtni.myirancell.R;
import defpackage.aj;
import defpackage.dj;
import defpackage.kj;
import defpackage.yj;

/* loaded from: classes.dex */
public class s0 extends n1 {
    private v0 A;
    private RadioGroup.OnCheckedChangeListener B;
    private Context x;
    private RadioGroup y;
    private yj z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (((RadioButton) view).isChecked()) {
                    if (!TextUtils.isEmpty(s0.this.z.u1)) {
                        s0.this.a(s0.this.z.u1);
                    }
                    s0.this.g.a(s0.this, s0.this.m(), s0.this.z);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements RadioGroup.OnCheckedChangeListener {
        b() {
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            RadioButton radioButton = (RadioButton) radioGroup.findViewById(i);
            if (radioButton == null || !radioButton.isChecked()) {
                return;
            }
            radioButton.setError(null);
            s0 s0Var = s0.this;
            s0Var.g.b(s0Var);
        }
    }

    public s0(Context context, yj yjVar, v0 v0Var) {
        super(context);
        this.B = new b();
        this.z = yjVar;
        this.x = context;
        this.A = v0Var;
        RadioGroup radioGroup = new RadioGroup(context);
        this.y = radioGroup;
        if (yjVar.b) {
            radioGroup.setOnCheckedChangeListener(this.B);
        } else {
            radioGroup.setClickable(false);
            n1.a(this.y, this.z.d1);
            yjVar.e1 = true;
        }
        b(yjVar);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(j0 j0Var, v0 v0Var) {
        int i;
        String str = this.z.m0;
        if (str == null || str.equalsIgnoreCase("equal")) {
            i = -1;
        } else {
            i = this.z.k(v0Var.c.width());
            if (i < 0) {
                i = v0Var.c.width() - (this.z.d(v0Var.c.width()) + this.z.g(v0Var.c.width()));
            }
        }
        this.y.getLayoutParams().width = i;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(yj yjVar) {
        a(yjVar.v0);
    }

    public void a(byte[] bArr) {
        com.comviva.webaxn.utils.b.a(this.x).a().a();
        int identifier = !TextUtils.isEmpty(this.z.r0) ? this.x.getResources().getIdentifier(this.z.r0, "drawable", this.x.getPackageName()) : 0;
        try {
            if (identifier > 0) {
                Bitmap a2 = com.comviva.webaxn.utils.e1.b(this.x).a(this.z.r0);
                if (a2 == null && (a2 = BitmapFactory.decodeResource(this.x.getResources(), identifier)) != null) {
                    com.comviva.webaxn.utils.e1.b(this.x).a(this.z.r0, a2);
                }
                this.e = NinePatch.isNinePatchChunk(a2.getNinePatchChunk()) ? new NinePatchDrawable(a2, a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(a2);
                this.y.setBackgroundDrawable(this.e);
                return;
            }
            if (bArr != null) {
                Bitmap a3 = com.comviva.webaxn.utils.e1.b(this.x).a(this.z.O);
                if (a3 == null && (a3 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                    com.comviva.webaxn.utils.e1.b(this.x).a(this.z.O, a3);
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
        String e = aj.a(this.x).e(this.z.V);
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
            while (i2 < this.z.P.size()) {
                if (!this.z.P.elementAt(i2).b.equals(str)) {
                    i2++;
                }
            }
            return 0;
        }
        if (i != 2) {
            return 0;
        }
        i2 = 0;
        while (i2 < this.z.P.size()) {
            if (!this.z.P.elementAt(i2).a.equals(str)) {
                i2++;
            }
        }
        return 0;
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(defpackage.yj r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            java.util.Vector<kj> r2 = r7.P
            int r2 = r2.size()
            if (r1 >= r2) goto Lbc
            r2 = 0
            java.util.Vector<kj> r3 = r7.P
            if (r3 == 0) goto L17
            java.lang.Object r2 = r3.elementAt(r1)
            kj r2 = (defpackage.kj) r2
            java.lang.String r2 = r2.a
        L17:
            android.widget.RadioButton r3 = new android.widget.RadioButton
            android.content.Context r4 = r6.x
            r3.<init>(r4)
            yj r4 = r6.z
            java.lang.String r4 = r4.r1
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L2f
            yj r4 = r6.z
            java.lang.String r4 = r4.r1
            r3.setContentDescription(r4)
        L2f:
            yj r4 = r6.z
            vj r4 = r4.q1
            if (r4 == 0) goto L3c
            float r4 = r4.a()
            defpackage.q2.a(r3, r4)
        L3c:
            int r4 = r7.K0
            r5 = 2
            if (r4 != r5) goto L48
            r4 = 2131230922(0x7f0800ca, float:1.807791E38)
        L44:
            r3.setButtonDrawable(r4)
            goto L5a
        L48:
            yj r4 = r6.z
            int r4 = r4.K0
            r5 = 4
            if (r4 != r5) goto L53
            r4 = 2131231401(0x7f0802a9, float:1.8078882E38)
            goto L44
        L53:
            r5 = 5
            if (r4 != r5) goto L5a
            r4 = 2131230927(0x7f0800cf, float:1.807792E38)
            goto L44
        L5a:
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L63
            r3.append(r2)
        L63:
            com.comviva.webaxn.utils.u r2 = r7.p
            if (r2 == 0) goto La3
            int r2 = r2.c()
            int r2 = com.comviva.webaxn.ui.n1.d(r2)
            r3.setTextColor(r2)
            com.comviva.webaxn.utils.u r2 = r7.p
            float r2 = r2.f()
            r3.setTextSize(r2)
            yj r2 = r6.z
            com.comviva.webaxn.utils.u r2 = r2.p
            android.graphics.Typeface r2 = r2.h()
            yj r4 = r6.z
            com.comviva.webaxn.utils.u r4 = r4.p
            int r4 = r4.g()
            int r4 = com.comviva.webaxn.ui.n1.e(r4)
            r3.setTypeface(r2, r4)
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r2 < r4) goto La3
            yj r2 = r6.z
            com.comviva.webaxn.utils.u r2 = r2.p
            float r2 = r2.d()
            r3.setLetterSpacing(r2)
        La3:
            boolean r2 = r7.b
            if (r2 != 0) goto Lab
            r3.setClickable(r0)
            goto Lb3
        Lab:
            com.comviva.webaxn.ui.s0$a r2 = new com.comviva.webaxn.ui.s0$a
            r2.<init>()
            r3.setOnClickListener(r2)
        Lb3:
            android.widget.RadioGroup r2 = r6.y
            r2.addView(r3)
            int r1 = r1 + 1
            goto L2
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.s0.b(yj):void");
    }

    @Override // com.comviva.webaxn.ui.n1
    public void c() {
        this.z.b = false;
        if (this.y != null) {
            for (int i = 0; i < this.y.getChildCount(); i++) {
                ((RadioButton) this.y.getChildAt(i)).setClickable(false);
            }
        }
        yj yjVar = this.z;
        if (yjVar.e1) {
            n1.a(this.y, yjVar.d1);
        }
    }

    public void c(yj yjVar) {
        this.z = yjVar;
    }

    public boolean c(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        String e = aj.a(this.x).e(this.z.V);
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
                    if (i5 >= this.z.P.size()) {
                        break;
                    }
                    if (this.z.P.elementAt(i5).b.equals(str)) {
                        i = i5;
                        break;
                    }
                    i5++;
                }
            }
            if (i == -1) {
                int i6 = 0;
                while (true) {
                    if (i6 >= this.z.P.size()) {
                        break;
                    }
                    if (this.z.P.elementAt(i6).a.equals(str)) {
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
                while (i4 < this.z.P.size()) {
                    if (!this.z.P.elementAt(i4).b.equals(str)) {
                        i4++;
                    }
                }
            } else if (i3 == 2) {
                i4 = 0;
                while (i4 < this.z.P.size()) {
                    if (!this.z.P.elementAt(i4).a.equals(str)) {
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
        this.z.b = true;
        if (this.y != null) {
            for (int i = 0; i < this.y.getChildCount(); i++) {
                ((RadioButton) this.y.getChildAt(i)).setClickable(true);
            }
        }
        if (this.z.e1) {
            n1.a(this.y, n1.r);
            this.z.e1 = false;
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public yj f() {
        return this.z;
    }

    public View g(int i) {
        return this.y.getChildAt(i);
    }

    @Override // com.comviva.webaxn.ui.n1
    public View h() {
        return this.y;
    }

    public void h(int i) {
        if (this.y.getChildAt(i) != null) {
            ((RadioButton) this.y.getChildAt(i)).setChecked(true);
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public boolean l() {
        p();
        x1.e(this.x, "msg.empty");
        return false;
    }

    public String m() {
        kj elementAt;
        if (this.z.P != null && this.y != null) {
            int i = 0;
            while (true) {
                if (i >= this.y.getChildCount()) {
                    i = -1;
                    break;
                }
                if (((RadioButton) this.y.getChildAt(i)).isChecked()) {
                    break;
                }
                i++;
            }
            if (i != -1 && (elementAt = this.z.P.elementAt(i)) != null && !TextUtils.isEmpty(elementAt.c)) {
                return elementAt.c;
            }
        }
        return null;
    }

    public int n() {
        return this.y.getChildCount();
    }

    public RadioGroup o() {
        return this.y;
    }

    public void p() {
        Drawable drawable = this.x.getResources().getDrawable(R.drawable.empty);
        RadioGroup radioGroup = this.y;
        if (radioGroup == null || radioGroup.getChildCount() <= 0) {
            return;
        }
        RadioButton radioButton = (RadioButton) this.y.getChildAt(0);
        radioButton.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        radioButton.setError(null, drawable);
    }

    public void q() {
        dj djVar = this.z.J0;
        if (djVar != null) {
            n1.a(djVar, h());
        }
    }

    public void r() {
        RadioGroup radioGroup = this.y;
        if (radioGroup != null) {
            radioGroup.clearCheck();
        }
    }

    public int s() {
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

    public void t() {
        int i;
        if (this.b == null) {
            return;
        }
        String str = this.z.m0;
        if (str == null || str.equalsIgnoreCase("equal")) {
            i = -1;
        } else {
            i = this.z.k(this.A.c.width());
            if (i < 0) {
                i = this.A.c.width() - (this.z.d(this.A.c.width()) + this.z.g(this.A.c.width()));
            }
        }
        this.y.setFocusable(true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(this.z.d(this.A.c.width()), this.z.i(this.A.c.width()), this.z.g(this.A.c.width()), this.z.a(this.A.c.width()));
        layoutParams.width = i;
        layoutParams.gravity = s();
        this.b.addView(this.y, layoutParams);
    }
}
