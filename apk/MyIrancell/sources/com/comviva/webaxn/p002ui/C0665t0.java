package com.comviva.webaxn.p002ui;

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
import com.comviva.webaxn.utils.C0687b;
import com.comviva.webaxn.utils.C0698e1;
import com.comviva.webaxn.utils.C0744u;
import com.comviva.webaxn.utils.C0755x1;
import com.mtni.myirancell.R;
import p000.C0023aj;
import p000.C2391dj;
import p000.C2862kj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.t0 */
/* loaded from: classes.dex */
public class C0665t0 extends AbstractC0652n1 {

    /* renamed from: x */
    private C3489yj f4332x;

    /* renamed from: y */
    private LinearLayout f4333y;

    /* renamed from: z */
    private RadioGroup f4334z;

    /* renamed from: com.comviva.webaxn.ui.t0$a */
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
            C0665t0 c0665t0 = C0665t0.this;
            c0665t0.f4049g.mo4849b(c0665t0);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.t0$b */
    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (((RadioButton) view).isChecked()) {
                    if (!TextUtils.isEmpty(C0665t0.this.f4332x.f14258u1)) {
                        C0665t0.this.m4707a(C0665t0.this.f4332x.f14258u1);
                    }
                    C0665t0.this.f4049g.mo4836a(C0665t0.this, C0665t0.this.m4980m(), C0665t0.this.f4332x);
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
    public C0665t0(android.content.Context r4, java.lang.String r5, p000.C3489yj r6, com.comviva.webaxn.p002ui.C0639j0 r7) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0665t0.<init>(android.content.Context, java.lang.String, yj, com.comviva.webaxn.ui.j0):void");
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4139a(AbsoluteLayout.LayoutParams layoutParams) {
        ((AbsoluteLayout.LayoutParams) this.f4333y.getLayoutParams()).x = layoutParams.x;
        ((AbsoluteLayout.LayoutParams) this.f4333y.getLayoutParams()).y = layoutParams.y;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4201a(C0657p0 c0657p0) {
        this.f4333y.setPadding(c0657p0.f4218a, c0657p0.f4219b, c0657p0.f4220c, c0657p0.f4221d);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
        m4973a(c3489yj.f14260v0);
    }

    /* renamed from: a */
    public void m4973a(byte[] bArr) {
        C0687b.m5342a(this.f4045c).m5343a().m5544a();
        int identifier = !TextUtils.isEmpty(this.f4332x.f14248r0) ? this.f4045c.getResources().getIdentifier(this.f4332x.f14248r0, "drawable", this.f4045c.getPackageName()) : 0;
        try {
            if (identifier > 0) {
                Bitmap m5429a = C0698e1.m5426b(this.f4045c).m5429a(this.f4332x.f14248r0);
                if (m5429a == null && (m5429a = BitmapFactory.decodeResource(this.f4045c.getResources(), identifier)) != null) {
                    C0698e1.m5426b(this.f4045c).m5432a(this.f4332x.f14248r0, m5429a);
                }
                this.f4047e = NinePatch.isNinePatchChunk(m5429a.getNinePatchChunk()) ? new NinePatchDrawable(m5429a, m5429a.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a);
                this.f4333y.setBackgroundDrawable(this.f4047e);
                return;
            }
            if (bArr != null) {
                Bitmap m5429a2 = C0698e1.m5426b(this.f4045c).m5429a(this.f4332x.f14172O);
                if (m5429a2 == null && (m5429a2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                    C0698e1.m5426b(this.f4045c).m5432a(this.f4332x.f14172O, m5429a2);
                }
                this.f4047e = NinePatch.isNinePatchChunk(m5429a2.getNinePatchChunk()) ? new NinePatchDrawable(m5429a2, m5429a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a2);
                this.f4333y.setBackgroundDrawable(this.f4047e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: b */
    public int m4974b(String str) {
        int i;
        int i2;
        String m191e = C0023aj.m160a(this.f4045c).m191e(this.f4332x.f14186V);
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
            while (i2 < this.f4332x.f14174P.size()) {
                if (!this.f4332x.f14174P.elementAt(i2).f11757b.equals(str)) {
                    i2++;
                }
            }
            return 0;
        }
        if (i != 2) {
            return 0;
        }
        i2 = 0;
        while (i2 < this.f4332x.f14174P.size()) {
            if (!this.f4332x.f14174P.elementAt(i2).f11756a.equals(str)) {
                i2++;
            }
        }
        return 0;
        return i2;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4142b() {
        this.f4044b.removeView(this.f4333y);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4176b(int i) {
        super.mo4176b(i);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4143b(AbsoluteLayout.LayoutParams layoutParams) {
        boolean z;
        this.f4054l = layoutParams.width;
        this.f4053k = layoutParams.height;
        String str = this.f4332x.f14233m0;
        if (str == null || str.equalsIgnoreCase("equal")) {
            this.f4054l = -2;
            String str2 = this.f4332x.f14236n0;
            if (str2 == null || str2.equalsIgnoreCase("equal")) {
                this.f4053k = -2;
            }
            z = false;
        } else {
            z = true;
        }
        this.f4333y.setLayoutParams(new AbsoluteLayout.LayoutParams(this.f4054l, this.f4053k, layoutParams.x, layoutParams.y));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f4333y.measure(makeMeasureSpec, makeMeasureSpec);
        if (layoutParams.width > 0 && !z) {
            int measuredWidth = this.f4333y.getMeasuredWidth();
            this.f4054l = measuredWidth;
            int i = layoutParams.width;
            if (measuredWidth > i) {
                this.f4054l = i;
            }
        }
        if (layoutParams.height <= 0) {
            this.f4053k = this.f4333y.getMeasuredHeight();
        }
    }

    /* renamed from: b */
    public void m4975b(C3489yj c3489yj) {
        this.f4332x = c3489yj;
    }

    /* renamed from: c */
    public int m4976c(AbsoluteLayout.LayoutParams layoutParams) {
        boolean z;
        this.f4054l = layoutParams.width;
        this.f4053k = layoutParams.height;
        String str = this.f4332x.f14233m0;
        if (str == null || str.equalsIgnoreCase("equal")) {
            this.f4054l = -2;
            String str2 = this.f4332x.f14236n0;
            if (str2 == null || str2.equalsIgnoreCase("equal")) {
                this.f4053k = -2;
            }
            z = false;
        } else {
            z = true;
        }
        this.f4333y.setLayoutParams(new AbsoluteLayout.LayoutParams(this.f4054l, this.f4053k, layoutParams.x, layoutParams.y));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f4333y.measure(makeMeasureSpec, makeMeasureSpec);
        if (layoutParams.width > 0 && !z) {
            int measuredWidth = this.f4333y.getMeasuredWidth();
            this.f4054l = measuredWidth;
            int i = layoutParams.width;
            if (measuredWidth > i) {
                this.f4054l = i;
            }
        }
        if (layoutParams.height <= 0) {
            this.f4053k = this.f4333y.getMeasuredHeight();
        }
        return this.f4053k;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: c */
    public void mo4146c() {
        this.f4332x.f14199b = false;
        if (this.f4334z != null) {
            for (int i = 0; i < this.f4334z.getChildCount(); i++) {
                ((RadioButton) this.f4334z.getChildAt(i)).setClickable(false);
            }
        }
        C3489yj c3489yj = this.f4332x;
        if (c3489yj.f14210e1) {
            AbstractC0652n1.m4697a(this.f4334z, c3489yj.f14207d1);
        }
    }

    /* renamed from: c */
    public boolean m4977c(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        String m191e = C0023aj.m160a(this.f4045c).m191e(this.f4332x.f14186V);
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
                    if (i5 >= this.f4332x.f14174P.size()) {
                        break;
                    }
                    if (this.f4332x.f14174P.elementAt(i5).f11757b.equals(str)) {
                        i = i5;
                        break;
                    }
                    i5++;
                }
            }
            if (i == -1) {
                int i6 = 0;
                while (true) {
                    if (i6 >= this.f4332x.f14174P.size()) {
                        break;
                    }
                    if (this.f4332x.f14174P.elementAt(i6).f11756a.equals(str)) {
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
                while (i4 < this.f4332x.f14174P.size()) {
                    if (!this.f4332x.f14174P.elementAt(i4).f11757b.equals(str)) {
                        i4++;
                    }
                }
            } else if (i3 == 2) {
                i4 = 0;
                while (i4 < this.f4332x.f14174P.size()) {
                    if (!this.f4332x.f14174P.elementAt(i4).f11756a.equals(str)) {
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
        m4979h(i2);
        return true;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: d */
    public void mo4147d() {
        this.f4332x.f14199b = true;
        if (this.f4334z != null) {
            for (int i = 0; i < this.f4334z.getChildCount(); i++) {
                ((RadioButton) this.f4334z.getChildAt(i)).setClickable(true);
            }
        }
        if (this.f4332x.f14210e1) {
            AbstractC0652n1.m4697a(this.f4334z, AbstractC0652n1.f4038r);
            this.f4332x.f14210e1 = false;
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: f */
    public C3489yj mo4148f() {
        return this.f4332x;
    }

    /* renamed from: g */
    public View m4978g(int i) {
        return this.f4334z.getChildAt(i);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: h */
    public View mo4150h() {
        return this.f4333y;
    }

    /* renamed from: h */
    public void m4979h(int i) {
        if (this.f4334z.getChildAt(i) != null) {
            ((RadioButton) this.f4334z.getChildAt(i)).setChecked(true);
        }
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

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: l */
    public boolean mo4290l() {
        m4983p();
        C0755x1.m6185e(this.f4045c, "msg.empty");
        return false;
    }

    /* renamed from: m */
    public String m4980m() {
        C2862kj elementAt;
        if (this.f4332x.f14174P != null && this.f4334z != null) {
            int i = 0;
            while (true) {
                if (i >= this.f4334z.getChildCount()) {
                    i = -1;
                    break;
                }
                if (((RadioButton) this.f4334z.getChildAt(i)).isChecked()) {
                    break;
                }
                i++;
            }
            if (i != -1 && (elementAt = this.f4332x.f14174P.elementAt(i)) != null && !TextUtils.isEmpty(elementAt.f11758c)) {
                return elementAt.f11758c;
            }
        }
        return null;
    }

    /* renamed from: n */
    public int m4981n() {
        return this.f4334z.getChildCount();
    }

    /* renamed from: o */
    public RadioGroup m4982o() {
        return this.f4334z;
    }

    /* renamed from: p */
    public void m4983p() {
        Drawable drawable = this.f4045c.getResources().getDrawable(R.drawable.empty);
        RadioGroup radioGroup = this.f4334z;
        if (radioGroup == null || radioGroup.getChildCount() <= 0) {
            return;
        }
        RadioButton radioButton = (RadioButton) this.f4334z.getChildAt(0);
        radioButton.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        radioButton.setError(null, drawable);
    }

    /* renamed from: q */
    public void m4984q() {
        C2391dj c2391dj = this.f4332x.f14163J0;
        if (c2391dj != null) {
            AbstractC0652n1.m4700a(c2391dj, mo4150h());
        }
    }

    /* renamed from: r */
    public void m4985r() {
        RadioGroup radioGroup = this.f4334z;
        if (radioGroup != null) {
            radioGroup.clearCheck();
        }
    }

    /* renamed from: s */
    public void m4986s() {
        if (this.f4044b != null) {
            C0744u c0744u = this.f4332x.f14241p;
            if (c0744u != null && c0744u.m6072k()) {
                mo4176b(AbstractC0652n1.m4701d(this.f4332x.f14241p.m6062c()));
            }
            this.f4044b.addView(this.f4333y);
            this.f4044b.invalidate();
        }
    }
}
