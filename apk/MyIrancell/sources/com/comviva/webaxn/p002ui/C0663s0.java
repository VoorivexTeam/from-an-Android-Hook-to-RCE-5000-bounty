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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.comviva.webaxn.utils.C0687b;
import com.comviva.webaxn.utils.C0698e1;
import com.comviva.webaxn.utils.C0755x1;
import com.mtni.myirancell.R;
import p000.C0023aj;
import p000.C2391dj;
import p000.C2862kj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.s0 */
/* loaded from: classes.dex */
public class C0663s0 extends AbstractC0652n1 {

    /* renamed from: A */
    private C0669v0 f4319A;

    /* renamed from: B */
    private RadioGroup.OnCheckedChangeListener f4320B;

    /* renamed from: x */
    private Context f4321x;

    /* renamed from: y */
    private RadioGroup f4322y;

    /* renamed from: z */
    private C3489yj f4323z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.comviva.webaxn.ui.s0$a */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (((RadioButton) view).isChecked()) {
                    if (!TextUtils.isEmpty(C0663s0.this.f4323z.f14258u1)) {
                        C0663s0.this.m4707a(C0663s0.this.f4323z.f14258u1);
                    }
                    C0663s0.this.f4049g.mo4836a(C0663s0.this, C0663s0.this.m4960m(), C0663s0.this.f4323z);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.comviva.webaxn.ui.s0$b */
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
            C0663s0 c0663s0 = C0663s0.this;
            c0663s0.f4049g.mo4849b(c0663s0);
        }
    }

    public C0663s0(Context context, C3489yj c3489yj, C0669v0 c0669v0) {
        super(context);
        this.f4320B = new b();
        this.f4323z = c3489yj;
        this.f4321x = context;
        this.f4319A = c0669v0;
        RadioGroup radioGroup = new RadioGroup(context);
        this.f4322y = radioGroup;
        if (c3489yj.f14199b) {
            radioGroup.setOnCheckedChangeListener(this.f4320B);
        } else {
            radioGroup.setClickable(false);
            AbstractC0652n1.m4697a(this.f4322y, this.f4323z.f14207d1);
            c3489yj.f14210e1 = true;
        }
        m4955b(c3489yj);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4174a(C0639j0 c0639j0, C0669v0 c0669v0) {
        int i;
        String str = this.f4323z.f14233m0;
        if (str == null || str.equalsIgnoreCase("equal")) {
            i = -1;
        } else {
            i = this.f4323z.m16645k(c0669v0.f4397c.width());
            if (i < 0) {
                i = c0669v0.f4397c.width() - (this.f4323z.m16638d(c0669v0.f4397c.width()) + this.f4323z.m16641g(c0669v0.f4397c.width()));
            }
        }
        this.f4322y.getLayoutParams().width = i;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
        m4953a(c3489yj.f14260v0);
    }

    /* renamed from: a */
    public void m4953a(byte[] bArr) {
        C0687b.m5342a(this.f4321x).m5343a().m5544a();
        int identifier = !TextUtils.isEmpty(this.f4323z.f14248r0) ? this.f4321x.getResources().getIdentifier(this.f4323z.f14248r0, "drawable", this.f4321x.getPackageName()) : 0;
        try {
            if (identifier > 0) {
                Bitmap m5429a = C0698e1.m5426b(this.f4321x).m5429a(this.f4323z.f14248r0);
                if (m5429a == null && (m5429a = BitmapFactory.decodeResource(this.f4321x.getResources(), identifier)) != null) {
                    C0698e1.m5426b(this.f4321x).m5432a(this.f4323z.f14248r0, m5429a);
                }
                this.f4047e = NinePatch.isNinePatchChunk(m5429a.getNinePatchChunk()) ? new NinePatchDrawable(m5429a, m5429a.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a);
                this.f4322y.setBackgroundDrawable(this.f4047e);
                return;
            }
            if (bArr != null) {
                Bitmap m5429a2 = C0698e1.m5426b(this.f4321x).m5429a(this.f4323z.f14172O);
                if (m5429a2 == null && (m5429a2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                    C0698e1.m5426b(this.f4321x).m5432a(this.f4323z.f14172O, m5429a2);
                }
                this.f4047e = NinePatch.isNinePatchChunk(m5429a2.getNinePatchChunk()) ? new NinePatchDrawable(m5429a2, m5429a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a2);
                this.f4322y.setBackgroundDrawable(this.f4047e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: b */
    public int m4954b(String str) {
        int i;
        int i2;
        String m191e = C0023aj.m160a(this.f4321x).m191e(this.f4323z.f14186V);
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
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
        if (i == 0) {
            try {
                return Integer.parseInt(str);
            } catch (Exception e2) {
                e2.printStackTrace();
                return 0;
            }
        }
        if (i == 1) {
            i2 = 0;
            while (i2 < this.f4323z.f14174P.size()) {
                if (!this.f4323z.f14174P.elementAt(i2).f11757b.equals(str)) {
                    i2++;
                }
            }
            return 0;
        }
        if (i != 2) {
            return 0;
        }
        i2 = 0;
        while (i2 < this.f4323z.f14174P.size()) {
            if (!this.f4323z.f14174P.elementAt(i2).f11756a.equals(str)) {
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
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4955b(p000.C3489yj r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            java.util.Vector<kj> r2 = r7.f14174P
            int r2 = r2.size()
            if (r1 >= r2) goto Lbc
            r2 = 0
            java.util.Vector<kj> r3 = r7.f14174P
            if (r3 == 0) goto L17
            java.lang.Object r2 = r3.elementAt(r1)
            kj r2 = (p000.C2862kj) r2
            java.lang.String r2 = r2.f11756a
        L17:
            android.widget.RadioButton r3 = new android.widget.RadioButton
            android.content.Context r4 = r6.f4321x
            r3.<init>(r4)
            yj r4 = r6.f4323z
            java.lang.String r4 = r4.f14249r1
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L2f
            yj r4 = r6.f4323z
            java.lang.String r4 = r4.f14249r1
            r3.setContentDescription(r4)
        L2f:
            yj r4 = r6.f4323z
            vj r4 = r4.f14246q1
            if (r4 == 0) goto L3c
            float r4 = r4.m16034a()
            p000.C3107q2.m14884a(r3, r4)
        L3c:
            int r4 = r7.f14165K0
            r5 = 2
            if (r4 != r5) goto L48
            r4 = 2131230922(0x7f0800ca, float:1.807791E38)
        L44:
            r3.setButtonDrawable(r4)
            goto L5a
        L48:
            yj r4 = r6.f4323z
            int r4 = r4.f14165K0
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
            com.comviva.webaxn.utils.u r2 = r7.f14241p
            if (r2 == 0) goto La3
            int r2 = r2.m6062c()
            int r2 = com.comviva.webaxn.p002ui.AbstractC0652n1.m4701d(r2)
            r3.setTextColor(r2)
            com.comviva.webaxn.utils.u r2 = r7.f14241p
            float r2 = r2.m6067f()
            r3.setTextSize(r2)
            yj r2 = r6.f4323z
            com.comviva.webaxn.utils.u r2 = r2.f14241p
            android.graphics.Typeface r2 = r2.m6069h()
            yj r4 = r6.f4323z
            com.comviva.webaxn.utils.u r4 = r4.f14241p
            int r4 = r4.m6068g()
            int r4 = com.comviva.webaxn.p002ui.AbstractC0652n1.m4702e(r4)
            r3.setTypeface(r2, r4)
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r2 < r4) goto La3
            yj r2 = r6.f4323z
            com.comviva.webaxn.utils.u r2 = r2.f14241p
            float r2 = r2.m6064d()
            r3.setLetterSpacing(r2)
        La3:
            boolean r2 = r7.f14199b
            if (r2 != 0) goto Lab
            r3.setClickable(r0)
            goto Lb3
        Lab:
            com.comviva.webaxn.ui.s0$a r2 = new com.comviva.webaxn.ui.s0$a
            r2.<init>()
            r3.setOnClickListener(r2)
        Lb3:
            android.widget.RadioGroup r2 = r6.f4322y
            r2.addView(r3)
            int r1 = r1 + 1
            goto L2
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0663s0.m4955b(yj):void");
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: c */
    public void mo4146c() {
        this.f4323z.f14199b = false;
        if (this.f4322y != null) {
            for (int i = 0; i < this.f4322y.getChildCount(); i++) {
                ((RadioButton) this.f4322y.getChildAt(i)).setClickable(false);
            }
        }
        C3489yj c3489yj = this.f4323z;
        if (c3489yj.f14210e1) {
            AbstractC0652n1.m4697a(this.f4322y, c3489yj.f14207d1);
        }
    }

    /* renamed from: c */
    public void m4956c(C3489yj c3489yj) {
        this.f4323z = c3489yj;
    }

    /* renamed from: c */
    public boolean m4957c(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        String m191e = C0023aj.m160a(this.f4321x).m191e(this.f4323z.f14186V);
        if (m191e == null) {
            try {
                i = Integer.parseInt(str);
            } catch (Exception e) {
                e.printStackTrace();
                i = -1;
            }
            if (i == -1) {
                int i5 = 0;
                while (true) {
                    if (i5 >= this.f4323z.f14174P.size()) {
                        break;
                    }
                    if (this.f4323z.f14174P.elementAt(i5).f11757b.equals(str)) {
                        i = i5;
                        break;
                    }
                    i5++;
                }
            }
            if (i == -1) {
                int i6 = 0;
                while (true) {
                    if (i6 >= this.f4323z.f14174P.size()) {
                        break;
                    }
                    if (this.f4323z.f14174P.elementAt(i6).f11756a.equals(str)) {
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
                i3 = Integer.parseInt(m191e);
            } catch (Exception e2) {
                e2.printStackTrace();
                i3 = -1;
            }
            i2 = -1;
        }
        if (i3 != 0) {
            if (i3 == 1) {
                i4 = 0;
                while (i4 < this.f4323z.f14174P.size()) {
                    if (!this.f4323z.f14174P.elementAt(i4).f11757b.equals(str)) {
                        i4++;
                    }
                }
            } else if (i3 == 2) {
                i4 = 0;
                while (i4 < this.f4323z.f14174P.size()) {
                    if (!this.f4323z.f14174P.elementAt(i4).f11756a.equals(str)) {
                        i4++;
                    }
                }
            }
            i2 = i4;
            break;
        }
        try {
            i2 = Integer.parseInt(str);
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        if (-1 == i2) {
            return false;
        }
        m4959h(i2);
        return true;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: d */
    public void mo4147d() {
        this.f4323z.f14199b = true;
        if (this.f4322y != null) {
            for (int i = 0; i < this.f4322y.getChildCount(); i++) {
                ((RadioButton) this.f4322y.getChildAt(i)).setClickable(true);
            }
        }
        if (this.f4323z.f14210e1) {
            AbstractC0652n1.m4697a(this.f4322y, AbstractC0652n1.f4038r);
            this.f4323z.f14210e1 = false;
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: f */
    public C3489yj mo4148f() {
        return this.f4323z;
    }

    /* renamed from: g */
    public View m4958g(int i) {
        return this.f4322y.getChildAt(i);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: h */
    public View mo4150h() {
        return this.f4322y;
    }

    /* renamed from: h */
    public void m4959h(int i) {
        if (this.f4322y.getChildAt(i) != null) {
            ((RadioButton) this.f4322y.getChildAt(i)).setChecked(true);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: l */
    public boolean mo4290l() {
        m4963p();
        C0755x1.m6185e(this.f4321x, "msg.empty");
        return false;
    }

    /* renamed from: m */
    public String m4960m() {
        C2862kj elementAt;
        if (this.f4323z.f14174P != null && this.f4322y != null) {
            int i = 0;
            while (true) {
                if (i >= this.f4322y.getChildCount()) {
                    i = -1;
                    break;
                }
                if (((RadioButton) this.f4322y.getChildAt(i)).isChecked()) {
                    break;
                }
                i++;
            }
            if (i != -1 && (elementAt = this.f4323z.f14174P.elementAt(i)) != null && !TextUtils.isEmpty(elementAt.f11758c)) {
                return elementAt.f11758c;
            }
        }
        return null;
    }

    /* renamed from: n */
    public int m4961n() {
        return this.f4322y.getChildCount();
    }

    /* renamed from: o */
    public RadioGroup m4962o() {
        return this.f4322y;
    }

    /* renamed from: p */
    public void m4963p() {
        Drawable drawable = this.f4321x.getResources().getDrawable(R.drawable.empty);
        RadioGroup radioGroup = this.f4322y;
        if (radioGroup == null || radioGroup.getChildCount() <= 0) {
            return;
        }
        RadioButton radioButton = (RadioButton) this.f4322y.getChildAt(0);
        radioButton.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        radioButton.setError(null, drawable);
    }

    /* renamed from: q */
    public void m4964q() {
        C2391dj c2391dj = this.f4323z.f14163J0;
        if (c2391dj != null) {
            AbstractC0652n1.m4700a(c2391dj, mo4150h());
        }
    }

    /* renamed from: r */
    public void m4965r() {
        RadioGroup radioGroup = this.f4322y;
        if (radioGroup != null) {
            radioGroup.clearCheck();
        }
    }

    /* renamed from: s */
    public int m4966s() {
        String str;
        C3489yj c3489yj = this.f4323z;
        if (c3489yj != null && (str = c3489yj.f14214g) != null) {
            if (str.equalsIgnoreCase("C") || this.f4323z.f14214g.equalsIgnoreCase("Center")) {
                return 1;
            }
            if (this.f4323z.f14214g.equalsIgnoreCase("L") || this.f4323z.f14214g.equalsIgnoreCase("Left")) {
                if (this.f4055m) {
                    return 5;
                }
            } else if ((this.f4323z.f14214g.equalsIgnoreCase("R") || this.f4323z.f14214g.equalsIgnoreCase("Right")) && !this.f4055m) {
                return 5;
            }
        }
        return 3;
    }

    /* renamed from: t */
    public void m4967t() {
        int i;
        if (this.f4044b == null) {
            return;
        }
        String str = this.f4323z.f14233m0;
        if (str == null || str.equalsIgnoreCase("equal")) {
            i = -1;
        } else {
            i = this.f4323z.m16645k(this.f4319A.f4397c.width());
            if (i < 0) {
                i = this.f4319A.f4397c.width() - (this.f4323z.m16638d(this.f4319A.f4397c.width()) + this.f4323z.m16641g(this.f4319A.f4397c.width()));
            }
        }
        this.f4322y.setFocusable(true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(this.f4323z.m16638d(this.f4319A.f4397c.width()), this.f4323z.m16643i(this.f4319A.f4397c.width()), this.f4323z.m16641g(this.f4319A.f4397c.width()), this.f4323z.m16632a(this.f4319A.f4397c.width()));
        layoutParams.width = i;
        layoutParams.gravity = m4966s();
        this.f4044b.addView(this.f4322y, layoutParams);
    }
}
