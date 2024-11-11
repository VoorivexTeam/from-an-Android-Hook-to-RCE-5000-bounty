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
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.comviva.webaxn.utils.x1;
import com.mtni.myirancell.R;
import defpackage.aj;
import defpackage.dj;
import defpackage.ej;
import defpackage.kj;
import defpackage.q2;
import defpackage.vj;
import defpackage.yj;
import java.util.ArrayList;
import java.util.Vector;

/* loaded from: classes.dex */
public class k extends n1 {
    int A;
    public int B;
    private v0 C;
    Spinner x;
    private yj y;
    ArrayList<String> z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            k kVar = k.this;
            if (kVar.A != i) {
                kVar.A = i;
                if (kVar.g == null || kVar.h(i) == null) {
                    return;
                }
                if (!TextUtils.isEmpty(k.this.y.u1)) {
                    k kVar2 = k.this;
                    kVar2.a(kVar2.y.u1);
                }
                k kVar3 = k.this;
                kVar3.g.a(kVar3, kVar3.g(i), k.this.y);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements View.OnTouchListener {
        b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            k kVar = k.this;
            kVar.g.b(kVar);
            return false;
        }
    }

    public k(Context context, yj yjVar, v0 v0Var) {
        super(context);
        this.c = context;
        this.y = yjVar;
        this.B = (int) (yjVar.a * 5.0f);
        this.C = v0Var;
        Spinner spinner = new Spinner(context);
        this.x = spinner;
        vj vjVar = this.y.q1;
        if (vjVar != null) {
            q2.a(spinner, vjVar.a());
        }
        if (!TextUtils.isEmpty(this.y.r1)) {
            this.x.setContentDescription(this.y.r1);
        }
        Spinner spinner2 = this.x;
        int i = this.B;
        spinner2.setPadding(i, i, i, i);
        this.A = 0;
        if (1.0f > com.comviva.webaxn.utils.b.a(context).a().a()) {
            return;
        }
        com.comviva.webaxn.utils.b.a(context).a().a();
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(j0 j0Var, v0 v0Var) {
        String str = this.y.m0;
        int k = (str == null || str.equalsIgnoreCase("equal")) ? -1 : this.y.k(v0Var.c.width());
        yj yjVar = this.y;
        int c = yjVar.n0 != null ? yjVar.c(com.comviva.webaxn.utils.b.a(this.c).a().b()) : -2;
        this.x.getLayoutParams().width = k;
        this.x.getLayoutParams().height = c;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(yj yjVar) {
        a(yjVar.v0);
    }

    public void a(byte[] bArr) {
        Spinner spinner;
        int i;
        int i2;
        int i3;
        int i4;
        Spinner spinner2;
        int i5;
        int i6;
        int i7;
        int i8;
        com.comviva.webaxn.utils.b.a(this.c).a().a();
        int identifier = !TextUtils.isEmpty(this.y.r0) ? this.c.getResources().getIdentifier(this.y.r0, "drawable", this.c.getPackageName()) : 0;
        try {
            if (identifier > 0) {
                Bitmap a2 = com.comviva.webaxn.utils.e1.b(this.c).a(this.y.r0);
                if (a2 == null && (a2 = BitmapFactory.decodeResource(this.c.getResources(), identifier)) != null) {
                    com.comviva.webaxn.utils.e1.b(this.c).a(this.y.r0, a2);
                }
                this.e = NinePatch.isNinePatchChunk(a2.getNinePatchChunk()) ? new NinePatchDrawable(a2, a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(a2);
                this.x.setBackgroundDrawable(this.e);
                if (this.y.E) {
                    spinner2 = this.x;
                    i5 = this.f.a;
                    i6 = this.f.b;
                    i7 = this.f.c;
                    i8 = this.f.d;
                } else {
                    spinner2 = this.x;
                    i5 = this.B;
                    i6 = this.B;
                    i7 = this.B;
                    i8 = this.B;
                }
                spinner2.setPadding(i5, i6, i7, i8);
                return;
            }
            if (bArr == null) {
                this.d = n1.d(this.y.p.b());
                this.x.setTag(this.y);
                yj yjVar = this.y;
                ej ejVar = yjVar.O0;
                if (ejVar != null) {
                    ejVar.a(this.k);
                    Drawable a3 = x1.a(this.y.O0, this.d);
                    this.e = a3;
                    this.x.setBackgroundDrawable(a3);
                    return;
                }
                if (yjVar.p.j()) {
                    int f0 = com.comviva.webaxn.utils.j1.a(this.c).f0();
                    this.h = f0;
                    this.h = n1.d(f0);
                    this.x.setBackgroundColor(this.d);
                    return;
                }
                return;
            }
            Bitmap a4 = com.comviva.webaxn.utils.e1.b(this.c).a(this.y.O);
            if (a4 == null && (a4 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                com.comviva.webaxn.utils.e1.b(this.c).a(this.y.O, a4);
            }
            this.e = NinePatch.isNinePatchChunk(a4.getNinePatchChunk()) ? new NinePatchDrawable(a4, a4.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(a4);
            this.x.setBackgroundDrawable(this.e);
            if (this.y.E) {
                spinner = this.x;
                i = this.f.a;
                i2 = this.f.b;
                i3 = this.f.c;
                i4 = this.f.d;
            } else {
                spinner = this.x;
                i = this.B;
                i2 = this.B;
                i3 = this.B;
                i4 = this.B;
            }
            spinner.setPadding(i, i2, i3, i4);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
    }

    public void b(String str) {
        if (this.z == null) {
            this.z = new ArrayList<>();
        }
        this.z.add(str);
    }

    public void b(yj yjVar) {
        this.y = yjVar;
        this.B = (int) (yjVar.a * 5.0f);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void c() {
        this.y.b = false;
        this.x.setClickable(false);
        this.x.setEnabled(false);
        yj yjVar = this.y;
        if (yjVar.e1) {
            n1.a(this.x, yjVar.d1);
        }
    }

    public void c(String str) {
        int i;
        int i2;
        String e = aj.a(this.c).e(this.y.V);
        int i3 = 0;
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
        if (i != 0) {
            if (i == 1) {
                i2 = 0;
                while (i2 < this.y.P.size()) {
                    if (!this.y.P.elementAt(i2).b.equals(str)) {
                        i2++;
                    }
                }
            } else if (i == 2) {
                i2 = 0;
                while (i2 < this.y.P.size()) {
                    if (!this.y.P.elementAt(i2).a.equals(str)) {
                        i2++;
                    }
                }
            }
            i3 = i2;
            break;
        }
        try {
            i3 = Integer.parseInt(str);
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        i(i3);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void d() {
        this.y.b = true;
        this.x.setClickable(true);
        this.x.setEnabled(true);
        if (this.y.e1) {
            n1.a(this.x, n1.r);
            this.y.e1 = false;
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public yj f() {
        return this.y;
    }

    public String g(int i) {
        kj elementAt;
        Vector<kj> vector = this.y.P;
        String str = (vector == null || (elementAt = vector.elementAt(i)) == null || TextUtils.isEmpty(elementAt.c)) ? null : elementAt.c;
        return TextUtils.isEmpty(str) ? this.y.i : str;
    }

    @Override // com.comviva.webaxn.ui.n1
    public View h() {
        return this.x;
    }

    public String h(int i) {
        kj elementAt;
        Vector<kj> vector = this.y.P;
        if (vector == null || (elementAt = vector.elementAt(i)) == null || TextUtils.isEmpty(elementAt.b)) {
            return null;
        }
        return elementAt.b;
    }

    public void i(int i) {
        this.A = i;
        this.x.setSelection(i);
    }

    @Override // com.comviva.webaxn.ui.n1
    public boolean l() {
        x1.e(this.c, "msg.empty");
        return false;
    }

    public int m() {
        return this.x.getSelectedItemPosition();
    }

    public int n() {
        return this.A;
    }

    public void o() {
        dj djVar = this.y.J0;
        if (djVar != null) {
            n1.a(djVar, h());
        }
    }

    public int p() {
        String str;
        yj yjVar = this.y;
        if (yjVar != null && (str = yjVar.g) != null) {
            if (str.equalsIgnoreCase("C") || this.y.g.equalsIgnoreCase("Center")) {
                return 1;
            }
            if (this.y.g.equalsIgnoreCase("L") || this.y.g.equalsIgnoreCase("Left")) {
                if (this.m) {
                    return 5;
                }
            } else if ((this.y.g.equalsIgnoreCase("R") || this.y.g.equalsIgnoreCase("Right")) && !this.m) {
                return 5;
            }
        }
        return 3;
    }

    public void q() {
        if (this.y.b) {
            this.x.setOnItemSelectedListener(new a());
            this.x.setOnTouchListener(new b());
        } else {
            this.x.setClickable(false);
            this.x.setEnabled(false);
            n1.a(this.x, this.y.d1);
            this.y.e1 = true;
        }
    }

    public void r() {
        int i;
        int i2;
        String str = this.y.m0;
        if (str == null || str.equalsIgnoreCase("equal")) {
            i = -1;
        } else {
            i = this.y.k(this.C.c.width());
            if (i < 0) {
                i = this.C.c.width() - (this.y.d(this.C.c.width()) + this.y.g(this.C.c.width()));
            }
        }
        yj yjVar = this.y;
        if (yjVar.n0 != null) {
            int c = yjVar.c(com.comviva.webaxn.utils.b.a(this.c).a().b());
            if (c < 0) {
                c = this.C.c.height() - (this.y.i(this.C.c.width()) + this.y.a(this.C.c.width()));
            }
            i2 = c;
        } else {
            i2 = -2;
        }
        j jVar = new j(this.c, this.y, R.layout.custom_combobox, this.z, i, this.m);
        jVar.setDropDownViewResource(R.layout.custom_dropdown_view);
        this.x.setAdapter((SpinnerAdapter) jVar);
        yj yjVar2 = this.y;
        if (yjVar2.E) {
            p0 p0Var = new p0(yjVar2.e(i), this.y.j(i), this.y.h(i), this.y.b(i), com.comviva.webaxn.utils.b.a(this.c).a().a());
            this.f = p0Var;
            this.x.setPadding(p0Var.a, p0Var.b, p0Var.c, p0Var.d);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(this.y.d(this.C.c.width()), this.y.i(this.C.c.width()), this.y.g(this.C.c.width()), this.y.a(this.C.c.width()));
        layoutParams.width = i;
        layoutParams.height = i2;
        layoutParams.gravity = p();
        this.b.addView(this.x, layoutParams);
    }
}
