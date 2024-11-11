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
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.comviva.webaxn.utils.C0687b;
import com.comviva.webaxn.utils.C0698e1;
import com.comviva.webaxn.utils.C0713j1;
import com.comviva.webaxn.utils.C0755x1;
import com.mtni.myirancell.R;
import java.util.ArrayList;
import java.util.Vector;
import p000.C0023aj;
import p000.C2391dj;
import p000.C2434ej;
import p000.C2862kj;
import p000.C3107q2;
import p000.C3361vj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.k */
/* loaded from: classes.dex */
public class C0641k extends AbstractC0652n1 {

    /* renamed from: A */
    int f3885A;

    /* renamed from: B */
    public int f3886B;

    /* renamed from: C */
    private C0669v0 f3887C;

    /* renamed from: x */
    Spinner f3888x;

    /* renamed from: y */
    private C3489yj f3889y;

    /* renamed from: z */
    ArrayList<String> f3890z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.k$a */
    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C0641k c0641k = C0641k.this;
            if (c0641k.f3885A != i) {
                c0641k.f3885A = i;
                if (c0641k.f4049g == null || c0641k.m4532h(i) == null) {
                    return;
                }
                if (!TextUtils.isEmpty(C0641k.this.f3889y.f14258u1)) {
                    C0641k c0641k2 = C0641k.this;
                    c0641k2.m4707a(c0641k2.f3889y.f14258u1);
                }
                C0641k c0641k3 = C0641k.this;
                c0641k3.f4049g.mo4836a(c0641k3, c0641k3.m4531g(i), C0641k.this.f3889y);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.k$b */
    /* loaded from: classes.dex */
    public class b implements View.OnTouchListener {
        b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            C0641k c0641k = C0641k.this;
            c0641k.f4049g.mo4849b(c0641k);
            return false;
        }
    }

    public C0641k(Context context, C3489yj c3489yj, C0669v0 c0669v0) {
        super(context);
        this.f4045c = context;
        this.f3889y = c3489yj;
        this.f3886B = (int) (c3489yj.f14196a * 5.0f);
        this.f3887C = c0669v0;
        Spinner spinner = new Spinner(context);
        this.f3888x = spinner;
        C3361vj c3361vj = this.f3889y.f14246q1;
        if (c3361vj != null) {
            C3107q2.m14884a(spinner, c3361vj.m16034a());
        }
        if (!TextUtils.isEmpty(this.f3889y.f14249r1)) {
            this.f3888x.setContentDescription(this.f3889y.f14249r1);
        }
        Spinner spinner2 = this.f3888x;
        int i = this.f3886B;
        spinner2.setPadding(i, i, i, i);
        this.f3885A = 0;
        if (1.0f > C0687b.m5342a(context).m5343a().m5544a()) {
            return;
        }
        C0687b.m5342a(context).m5343a().m5544a();
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4174a(C0639j0 c0639j0, C0669v0 c0669v0) {
        String str = this.f3889y.f14233m0;
        int m16645k = (str == null || str.equalsIgnoreCase("equal")) ? -1 : this.f3889y.m16645k(c0669v0.f4397c.width());
        C3489yj c3489yj = this.f3889y;
        int m16637c = c3489yj.f14236n0 != null ? c3489yj.m16637c(C0687b.m5342a(this.f4045c).m5343a().m5547b()) : -2;
        this.f3888x.getLayoutParams().width = m16645k;
        this.f3888x.getLayoutParams().height = m16637c;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
        m4527a(c3489yj.f14260v0);
    }

    /* renamed from: a */
    public void m4527a(byte[] bArr) {
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
        C0687b.m5342a(this.f4045c).m5343a().m5544a();
        int identifier = !TextUtils.isEmpty(this.f3889y.f14248r0) ? this.f4045c.getResources().getIdentifier(this.f3889y.f14248r0, "drawable", this.f4045c.getPackageName()) : 0;
        try {
            if (identifier > 0) {
                Bitmap m5429a = C0698e1.m5426b(this.f4045c).m5429a(this.f3889y.f14248r0);
                if (m5429a == null && (m5429a = BitmapFactory.decodeResource(this.f4045c.getResources(), identifier)) != null) {
                    C0698e1.m5426b(this.f4045c).m5432a(this.f3889y.f14248r0, m5429a);
                }
                this.f4047e = NinePatch.isNinePatchChunk(m5429a.getNinePatchChunk()) ? new NinePatchDrawable(m5429a, m5429a.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a);
                this.f3888x.setBackgroundDrawable(this.f4047e);
                if (this.f3889y.f14152E) {
                    spinner2 = this.f3888x;
                    i5 = this.f4048f.f4218a;
                    i6 = this.f4048f.f4219b;
                    i7 = this.f4048f.f4220c;
                    i8 = this.f4048f.f4221d;
                } else {
                    spinner2 = this.f3888x;
                    i5 = this.f3886B;
                    i6 = this.f3886B;
                    i7 = this.f3886B;
                    i8 = this.f3886B;
                }
                spinner2.setPadding(i5, i6, i7, i8);
                return;
            }
            if (bArr == null) {
                this.f4046d = AbstractC0652n1.m4701d(this.f3889y.f14241p.m6057b());
                this.f3888x.setTag(this.f3889y);
                C3489yj c3489yj = this.f3889y;
                C2434ej c2434ej = c3489yj.f14173O0;
                if (c2434ej != null) {
                    c2434ej.m11615a(this.f4053k);
                    Drawable m6122a = C0755x1.m6122a(this.f3889y.f14173O0, this.f4046d);
                    this.f4047e = m6122a;
                    this.f3888x.setBackgroundDrawable(m6122a);
                    return;
                }
                if (c3489yj.f14241p.m6071j()) {
                    int m5664f0 = C0713j1.m5563a(this.f4045c).m5664f0();
                    this.f4050h = m5664f0;
                    this.f4050h = AbstractC0652n1.m4701d(m5664f0);
                    this.f3888x.setBackgroundColor(this.f4046d);
                    return;
                }
                return;
            }
            Bitmap m5429a2 = C0698e1.m5426b(this.f4045c).m5429a(this.f3889y.f14172O);
            if (m5429a2 == null && (m5429a2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                C0698e1.m5426b(this.f4045c).m5432a(this.f3889y.f14172O, m5429a2);
            }
            this.f4047e = NinePatch.isNinePatchChunk(m5429a2.getNinePatchChunk()) ? new NinePatchDrawable(m5429a2, m5429a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a2);
            this.f3888x.setBackgroundDrawable(this.f4047e);
            if (this.f3889y.f14152E) {
                spinner = this.f3888x;
                i = this.f4048f.f4218a;
                i2 = this.f4048f.f4219b;
                i3 = this.f4048f.f4220c;
                i4 = this.f4048f.f4221d;
            } else {
                spinner = this.f3888x;
                i = this.f3886B;
                i2 = this.f3886B;
                i3 = this.f3886B;
                i4 = this.f3886B;
            }
            spinner.setPadding(i, i2, i3, i4);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: b */
    public void m4528b(String str) {
        if (this.f3890z == null) {
            this.f3890z = new ArrayList<>();
        }
        this.f3890z.add(str);
    }

    /* renamed from: b */
    public void m4529b(C3489yj c3489yj) {
        this.f3889y = c3489yj;
        this.f3886B = (int) (c3489yj.f14196a * 5.0f);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: c */
    public void mo4146c() {
        this.f3889y.f14199b = false;
        this.f3888x.setClickable(false);
        this.f3888x.setEnabled(false);
        C3489yj c3489yj = this.f3889y;
        if (c3489yj.f14210e1) {
            AbstractC0652n1.m4697a(this.f3888x, c3489yj.f14207d1);
        }
    }

    /* renamed from: c */
    public void m4530c(String str) {
        int i;
        int i2;
        String m191e = C0023aj.m160a(this.f4045c).m191e(this.f3889y.f14186V);
        int i3 = 0;
        if (m191e == null) {
            i = 0;
        } else {
            try {
                i = Integer.parseInt(m191e);
            } catch (Exception e) {
                e.printStackTrace();
                i = -1;
            }
        }
        if (i != 0) {
            if (i == 1) {
                i2 = 0;
                while (i2 < this.f3889y.f14174P.size()) {
                    if (!this.f3889y.f14174P.elementAt(i2).f11757b.equals(str)) {
                        i2++;
                    }
                }
            } else if (i == 2) {
                i2 = 0;
                while (i2 < this.f3889y.f14174P.size()) {
                    if (!this.f3889y.f14174P.elementAt(i2).f11756a.equals(str)) {
                        i2++;
                    }
                }
            }
            i3 = i2;
            break;
        }
        try {
            i3 = Integer.parseInt(str);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        m4533i(i3);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: d */
    public void mo4147d() {
        this.f3889y.f14199b = true;
        this.f3888x.setClickable(true);
        this.f3888x.setEnabled(true);
        if (this.f3889y.f14210e1) {
            AbstractC0652n1.m4697a(this.f3888x, AbstractC0652n1.f4038r);
            this.f3889y.f14210e1 = false;
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: f */
    public C3489yj mo4148f() {
        return this.f3889y;
    }

    /* renamed from: g */
    public String m4531g(int i) {
        C2862kj elementAt;
        Vector<C2862kj> vector = this.f3889y.f14174P;
        String str = (vector == null || (elementAt = vector.elementAt(i)) == null || TextUtils.isEmpty(elementAt.f11758c)) ? null : elementAt.f11758c;
        return TextUtils.isEmpty(str) ? this.f3889y.f14220i : str;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: h */
    public View mo4150h() {
        return this.f3888x;
    }

    /* renamed from: h */
    public String m4532h(int i) {
        C2862kj elementAt;
        Vector<C2862kj> vector = this.f3889y.f14174P;
        if (vector == null || (elementAt = vector.elementAt(i)) == null || TextUtils.isEmpty(elementAt.f11757b)) {
            return null;
        }
        return elementAt.f11757b;
    }

    /* renamed from: i */
    public void m4533i(int i) {
        this.f3885A = i;
        this.f3888x.setSelection(i);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: l */
    public boolean mo4290l() {
        C0755x1.m6185e(this.f4045c, "msg.empty");
        return false;
    }

    /* renamed from: m */
    public int m4534m() {
        return this.f3888x.getSelectedItemPosition();
    }

    /* renamed from: n */
    public int m4535n() {
        return this.f3885A;
    }

    /* renamed from: o */
    public void m4536o() {
        C2391dj c2391dj = this.f3889y.f14163J0;
        if (c2391dj != null) {
            AbstractC0652n1.m4700a(c2391dj, mo4150h());
        }
    }

    /* renamed from: p */
    public int m4537p() {
        String str;
        C3489yj c3489yj = this.f3889y;
        if (c3489yj != null && (str = c3489yj.f14214g) != null) {
            if (str.equalsIgnoreCase("C") || this.f3889y.f14214g.equalsIgnoreCase("Center")) {
                return 1;
            }
            if (this.f3889y.f14214g.equalsIgnoreCase("L") || this.f3889y.f14214g.equalsIgnoreCase("Left")) {
                if (this.f4055m) {
                    return 5;
                }
            } else if ((this.f3889y.f14214g.equalsIgnoreCase("R") || this.f3889y.f14214g.equalsIgnoreCase("Right")) && !this.f4055m) {
                return 5;
            }
        }
        return 3;
    }

    /* renamed from: q */
    public void m4538q() {
        if (this.f3889y.f14199b) {
            this.f3888x.setOnItemSelectedListener(new a());
            this.f3888x.setOnTouchListener(new b());
        } else {
            this.f3888x.setClickable(false);
            this.f3888x.setEnabled(false);
            AbstractC0652n1.m4697a(this.f3888x, this.f3889y.f14207d1);
            this.f3889y.f14210e1 = true;
        }
    }

    /* renamed from: r */
    public void m4539r() {
        int i;
        int i2;
        String str = this.f3889y.f14233m0;
        if (str == null || str.equalsIgnoreCase("equal")) {
            i = -1;
        } else {
            i = this.f3889y.m16645k(this.f3887C.f4397c.width());
            if (i < 0) {
                i = this.f3887C.f4397c.width() - (this.f3889y.m16638d(this.f3887C.f4397c.width()) + this.f3889y.m16641g(this.f3887C.f4397c.width()));
            }
        }
        C3489yj c3489yj = this.f3889y;
        if (c3489yj.f14236n0 != null) {
            int m16637c = c3489yj.m16637c(C0687b.m5342a(this.f4045c).m5343a().m5547b());
            if (m16637c < 0) {
                m16637c = this.f3887C.f4397c.height() - (this.f3889y.m16643i(this.f3887C.f4397c.width()) + this.f3889y.m16632a(this.f3887C.f4397c.width()));
            }
            i2 = m16637c;
        } else {
            i2 = -2;
        }
        C0638j c0638j = new C0638j(this.f4045c, this.f3889y, R.layout.custom_combobox, this.f3890z, i, this.f4055m);
        c0638j.setDropDownViewResource(R.layout.custom_dropdown_view);
        this.f3888x.setAdapter((SpinnerAdapter) c0638j);
        C3489yj c3489yj2 = this.f3889y;
        if (c3489yj2.f14152E) {
            C0657p0 c0657p0 = new C0657p0(c3489yj2.m16639e(i), this.f3889y.m16644j(i), this.f3889y.m16642h(i), this.f3889y.m16635b(i), C0687b.m5342a(this.f4045c).m5343a().m5544a());
            this.f4048f = c0657p0;
            this.f3888x.setPadding(c0657p0.f4218a, c0657p0.f4219b, c0657p0.f4220c, c0657p0.f4221d);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(this.f3889y.m16638d(this.f3887C.f4397c.width()), this.f3889y.m16643i(this.f3887C.f4397c.width()), this.f3889y.m16641g(this.f3887C.f4397c.width()), this.f3889y.m16632a(this.f3887C.f4397c.width()));
        layoutParams.width = i;
        layoutParams.height = i2;
        layoutParams.gravity = m4537p();
        this.f4044b.addView(this.f3888x, layoutParams);
    }
}
