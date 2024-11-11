package com.comviva.webaxn.p002ui;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.C0186n0;
import com.comviva.webaxn.utils.C0687b;
import com.comviva.webaxn.utils.C0698e1;
import com.comviva.webaxn.utils.C0755x1;
import com.mtni.myirancell.R;
import java.util.ArrayList;
import java.util.Iterator;
import p000.C2391dj;
import p000.C2862kj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.i */
/* loaded from: classes.dex */
public class C0635i extends AbstractC0652n1 {

    /* renamed from: A */
    public boolean f3806A;

    /* renamed from: B */
    public boolean f3807B;

    /* renamed from: C */
    public String f3808C;

    /* renamed from: D */
    private ArrayList<CheckBox> f3809D;

    /* renamed from: E */
    public int[] f3810E;

    /* renamed from: F */
    private final ArrayList<C0186n0> f3811F;

    /* renamed from: G */
    private C0655o1 f3812G;

    /* renamed from: H */
    private boolean f3813H;

    /* renamed from: I */
    private View.OnClickListener f3814I;

    /* renamed from: J */
    private CompoundButton.OnCheckedChangeListener f3815J;

    /* renamed from: K */
    private CompoundButton.OnCheckedChangeListener f3816K;

    /* renamed from: x */
    private C3489yj f3817x;

    /* renamed from: y */
    private LinearLayout f3818y;

    /* renamed from: z */
    public boolean f3819z;

    /* renamed from: com.comviva.webaxn.ui.i$a */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = C0635i.this.f3809D.iterator();
            int i = -1;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                i++;
                if (((CheckBox) it.next()).equals(view)) {
                    C0635i c0635i = C0635i.this;
                    c0635i.f3808C = c0635i.f3817x.f14174P.elementAt(i).f11758c;
                    break;
                }
            }
            if (!TextUtils.isEmpty(C0635i.this.f3817x.f14213f1)) {
                if (C0635i.this.f3813H) {
                    if (C0635i.this.f3812G.m4816j().equals("VALIDATE")) {
                        C0635i c0635i2 = C0635i.this;
                        c0635i2.f4049g.mo4847a(false, c0635i2.f3817x);
                    } else if (C0635i.this.f3812G.m4795a(C0635i.this.f3817x.f14213f1, C0635i.this.f3817x.f14186V)) {
                        C0635i c0635i3 = C0635i.this;
                        c0635i3.f4049g.mo4842a(c0635i3.f3817x.f14216g1, C0635i.this.f3817x);
                    }
                    C0635i.this.f3813H = false;
                } else {
                    if (C0635i.this.f3812G.m4816j().equals("VALIDATE")) {
                        C0635i c0635i4 = C0635i.this;
                        c0635i4.f4049g.mo4847a(true, c0635i4.f3817x);
                    } else if (C0635i.this.f3812G.m4805b(C0635i.this.f3817x.f14213f1, C0635i.this.f3817x.f14186V)) {
                        C0635i c0635i5 = C0635i.this;
                        c0635i5.f4049g.mo4842a(c0635i5.f3817x.f14213f1, C0635i.this.f3817x);
                    }
                    C0635i.this.f3813H = true;
                }
            }
            if (!TextUtils.isEmpty(C0635i.this.f3817x.f14258u1)) {
                C0635i c0635i6 = C0635i.this;
                c0635i6.m4707a(c0635i6.f3817x.f14258u1);
            }
            C0635i c0635i7 = C0635i.this;
            c0635i7.f4049g.mo4836a(c0635i7, c0635i7.m4472n(), C0635i.this.f3817x);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.i$b */
    /* loaded from: classes.dex */
    class b implements CompoundButton.OnCheckedChangeListener {
        b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (compoundButton != null) {
                if (z) {
                    compoundButton.setError(null);
                }
                C0635i c0635i = C0635i.this;
                if (c0635i.f3807B) {
                    c0635i.f3807B = false;
                } else {
                    c0635i.f4049g.mo4849b(c0635i);
                }
            }
        }
    }

    /* renamed from: com.comviva.webaxn.ui.i$c */
    /* loaded from: classes.dex */
    class c implements CompoundButton.OnCheckedChangeListener {
        c() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                compoundButton.setError(null);
            }
            C0635i c0635i = C0635i.this;
            if (c0635i.f3807B) {
                c0635i.f3807B = false;
                return;
            }
            c0635i.f3819z = true;
            c0635i.f3806A = z;
            c0635i.f4049g.mo4849b(c0635i);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.i$d */
    /* loaded from: classes.dex */
    class d implements CompoundButton.OnCheckedChangeListener {
        d() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (compoundButton != null) {
                int i = -1;
                Iterator it = C0635i.this.f3811F.iterator();
                while (it.hasNext()) {
                    i++;
                    if (((C0186n0) it.next()).equals(compoundButton)) {
                        C0635i c0635i = C0635i.this;
                        c0635i.f3808C = c0635i.f3817x.f14174P.elementAt(i).f11758c;
                        C0635i c0635i2 = C0635i.this;
                        int[] iArr = c0635i2.f3810E;
                        if (iArr[i] == 1) {
                            iArr[i] = 0;
                            return;
                        }
                        c0635i2.f4049g.mo4836a(c0635i2, c0635i2.m4472n(), C0635i.this.f3817x);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021f  */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.widget.CheckBox, android.view.View] */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4, types: [androidx.appcompat.widget.n0, android.widget.CompoundButton, android.view.View] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.comviva.webaxn.ui.i, com.comviva.webaxn.ui.n1] */
    /* JADX WARN: Type inference failed for: r8v17, types: [android.widget.LinearLayout] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0635i(android.content.Context r5, java.lang.String r6, p000.C3489yj r7, com.comviva.webaxn.p002ui.C0639j0 r8, com.comviva.webaxn.p002ui.C0669v0 r9, com.comviva.webaxn.p002ui.C0655o1 r10) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0635i.<init>(android.content.Context, java.lang.String, yj, com.comviva.webaxn.ui.j0, com.comviva.webaxn.ui.v0, com.comviva.webaxn.ui.o1):void");
    }

    /* renamed from: a */
    private void m4458a(C0186n0 c0186n0) {
        int i;
        c0186n0.setTextOff("OFF");
        c0186n0.setTextOn("ON");
        if (Build.VERSION.SDK_INT >= 21) {
            c0186n0.setShowText(true);
        }
        c0186n0.m1112a(this.f4045c, R.style.SwitchTextAppearance);
        c0186n0.m1113a((Typeface) null, 1);
        c0186n0.setThumbTextPadding((int) (this.f3817x.f14196a * (C0687b.m5342a(this.f4045c).m5343a().m5556h() ? 10.0f : 1.0f)));
        c0186n0.setThumbDrawable(m4470g(this.f3817x.f14165K0));
        int i2 = this.f3817x.f14165K0;
        if (i2 == 1) {
            i = R.drawable.switchtrackbg;
        } else if (i2 != 3) {
            return;
        } else {
            i = R.drawable.switchtrackbg_ng;
        }
        c0186n0.setTrackResource(i);
    }

    /* renamed from: a */
    private void m4459a(C0186n0 c0186n0, int i, int i2) {
        if (i == -1 || i2 == -1) {
            return;
        }
        ColorStateList m6117a = C0755x1.m6117a(android.R.attr.state_checked, i, -1, i2);
        ColorStateList m6117a2 = C0755x1.m6117a(android.R.attr.state_checked, Color.argb(77, Color.red(i), Color.green(i), Color.blue(i)), -1, Color.argb(77, Color.red(i2), Color.green(i2), Color.blue(i2)));
        c0186n0.setThumbTintList(m6117a);
        c0186n0.setTrackTintList(m6117a2);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4139a(AbsoluteLayout.LayoutParams layoutParams) {
        ((AbsoluteLayout.LayoutParams) this.f3818y.getLayoutParams()).x = layoutParams.x;
        ((AbsoluteLayout.LayoutParams) this.f3818y.getLayoutParams()).y = layoutParams.y;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4201a(C0657p0 c0657p0) {
        this.f3818y.setPadding(c0657p0.f4218a, c0657p0.f4219b, c0657p0.f4220c, c0657p0.f4221d);
    }

    /* renamed from: a */
    public void m4465a(C2862kj c2862kj) {
        int indexOf;
        int indexOf2 = this.f3817x.f14174P.indexOf(c2862kj);
        if (-1 == indexOf2) {
            return;
        }
        if (m4475q()) {
            ArrayList<C0186n0> arrayList = this.f3811F;
            if (arrayList == null || (indexOf = arrayList.indexOf(c2862kj)) >= this.f3811F.size() || indexOf < 0) {
                return;
            }
            C0186n0 c0186n0 = this.f3811F.get(indexOf);
            if (c0186n0.isChecked()) {
                c0186n0.setChecked(false);
                return;
            } else {
                c0186n0.setChecked(true);
                return;
            }
        }
        ArrayList<CheckBox> arrayList2 = this.f3809D;
        if (arrayList2 == null || indexOf2 >= arrayList2.size() || indexOf2 < 0) {
            return;
        }
        CheckBox checkBox = this.f3809D.get(indexOf2);
        if (checkBox.isChecked()) {
            checkBox.setChecked(false);
        } else {
            checkBox.setChecked(true);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
        m4466a(c3489yj.f14260v0);
    }

    /* renamed from: a */
    public void m4466a(byte[] bArr) {
        int identifier = !TextUtils.isEmpty(this.f3817x.f14248r0) ? this.f4045c.getResources().getIdentifier(this.f3817x.f14248r0, "drawable", this.f4045c.getPackageName()) : 0;
        try {
            if (identifier > 0) {
                Bitmap m5429a = C0698e1.m5426b(this.f4045c).m5429a(this.f3817x.f14248r0);
                if (m5429a == null && (m5429a = BitmapFactory.decodeResource(this.f4045c.getResources(), identifier)) != null) {
                    C0698e1.m5426b(this.f4045c).m5432a(this.f3817x.f14248r0, m5429a);
                }
                this.f4047e = NinePatch.isNinePatchChunk(m5429a.getNinePatchChunk()) ? new NinePatchDrawable(m5429a, m5429a.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a);
                this.f3818y.setBackgroundDrawable(this.f4047e);
                return;
            }
            if (bArr != null) {
                Bitmap m5429a2 = C0698e1.m5426b(this.f4045c).m5429a(this.f3817x.f14172O);
                if (m5429a2 == null && (m5429a2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                    C0698e1.m5426b(this.f4045c).m5432a(this.f3817x.f14172O, m5429a2);
                }
                this.f4047e = NinePatch.isNinePatchChunk(m5429a2.getNinePatchChunk()) ? new NinePatchDrawable(m5429a2, m5429a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a2);
                this.f3818y.setBackgroundDrawable(this.f4047e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public boolean m4467a(String str, String str2) {
        int i;
        int i2;
        try {
            if (!m4475q()) {
                if (str2 == null) {
                    return false;
                }
                if (str2.equals("1")) {
                    i = 0;
                    while (i < this.f3817x.f14174P.size()) {
                        if (!this.f3817x.f14174P.elementAt(i).f11757b.equals(str)) {
                            i++;
                        } else if (i >= this.f3809D.size()) {
                            return false;
                        }
                    }
                    return false;
                }
                if (!str2.equals("2")) {
                    int parseInt = Integer.parseInt(str);
                    if (parseInt >= this.f3809D.size()) {
                        return false;
                    }
                    this.f3809D.get(parseInt).setChecked(true);
                    return true;
                }
                i = 0;
                while (i < this.f3817x.f14174P.size()) {
                    if (!this.f3817x.f14174P.elementAt(i).f11756a.equals(str)) {
                        i++;
                    } else if (i >= this.f3809D.size()) {
                        return false;
                    }
                }
                return false;
                this.f3809D.get(i).setChecked(true);
                return true;
            }
            if (str2 == null) {
                return false;
            }
            if (str2.equals("1")) {
                i2 = 0;
                while (i2 < this.f3817x.f14174P.size()) {
                    if (!this.f3817x.f14174P.elementAt(i2).f11757b.equals(str)) {
                        i2++;
                    } else if (i2 >= this.f3811F.size()) {
                        return false;
                    }
                }
                return false;
            }
            if (!str2.equals("2")) {
                int parseInt2 = Integer.parseInt(str);
                if (parseInt2 >= this.f3811F.size()) {
                    return false;
                }
                this.f3811F.get(parseInt2).setChecked(!this.f3811F.get(parseInt2).isChecked());
                return true;
            }
            i2 = 0;
            while (i2 < this.f3817x.f14174P.size()) {
                if (!this.f3817x.f14174P.elementAt(i2).f11756a.equals(str)) {
                    i2++;
                } else if (i2 >= this.f3811F.size()) {
                    return false;
                }
            }
            return false;
            this.f3811F.get(i2).setChecked(true);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4142b() {
        this.f4044b.removeView(this.f3818y);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4143b(AbsoluteLayout.LayoutParams layoutParams) {
        boolean z;
        this.f4054l = layoutParams.width;
        this.f4053k = layoutParams.height;
        String str = this.f3817x.f14233m0;
        if (str == null || str.equalsIgnoreCase("equal")) {
            this.f4054l = -2;
            String str2 = this.f3817x.f14236n0;
            if (str2 == null || str2.equalsIgnoreCase("equal")) {
                this.f4053k = -2;
            }
            z = false;
        } else {
            z = true;
        }
        this.f3818y.setLayoutParams(new AbsoluteLayout.LayoutParams(this.f4054l, this.f4053k, layoutParams.x, layoutParams.y));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f3818y.measure(makeMeasureSpec, makeMeasureSpec);
        if (layoutParams.width > 0 && !z) {
            int measuredWidth = this.f3818y.getMeasuredWidth();
            this.f4054l = measuredWidth;
            int i = layoutParams.width;
            if (measuredWidth > i) {
                this.f4054l = i;
            }
        }
        if (layoutParams.height <= 0) {
            this.f4053k = this.f3818y.getMeasuredHeight();
        }
    }

    /* renamed from: b */
    public void m4468b(C3489yj c3489yj) {
        this.f3817x = c3489yj;
    }

    /* renamed from: c */
    public int m4469c(AbsoluteLayout.LayoutParams layoutParams) {
        boolean z;
        this.f4054l = layoutParams.width;
        this.f4053k = layoutParams.height;
        String str = this.f3817x.f14233m0;
        if (str == null || str.equalsIgnoreCase("equal")) {
            this.f4054l = -2;
            String str2 = this.f3817x.f14236n0;
            if (str2 == null || str2.equalsIgnoreCase("equal")) {
                this.f4053k = -2;
            }
            z = false;
        } else {
            z = true;
        }
        this.f3818y.setLayoutParams(new AbsoluteLayout.LayoutParams(this.f4054l, this.f4053k, layoutParams.x, layoutParams.y));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f3818y.measure(makeMeasureSpec, makeMeasureSpec);
        if (layoutParams.width > 0 && !z) {
            int measuredWidth = this.f3818y.getMeasuredWidth();
            this.f4054l = measuredWidth;
            int i = layoutParams.width;
            if (measuredWidth > i) {
                this.f4054l = i;
            }
        }
        if (layoutParams.height <= 0) {
            this.f4053k = this.f3818y.getMeasuredHeight();
        }
        return this.f4053k;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: c */
    public void mo4146c() {
        this.f3817x.f14199b = false;
        if (m4475q()) {
            if (this.f3811F != null) {
                for (int i = 0; i < this.f3811F.size(); i++) {
                    this.f3811F.get(i).setClickable(false);
                }
            }
        } else if (this.f3809D != null) {
            for (int i2 = 0; i2 < this.f3809D.size(); i2++) {
                this.f3809D.get(i2).setClickable(false);
            }
        }
        C3489yj c3489yj = this.f3817x;
        if (c3489yj.f14210e1) {
            AbstractC0652n1.m4697a(this.f3818y, c3489yj.f14207d1);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: d */
    public void mo4147d() {
        this.f3817x.f14199b = true;
        if (m4475q()) {
            if (this.f3811F != null) {
                for (int i = 0; i < this.f3811F.size(); i++) {
                    this.f3811F.get(i).setClickable(true);
                }
            }
        } else if (this.f3809D != null) {
            for (int i2 = 0; i2 < this.f3809D.size(); i2++) {
                this.f3809D.get(i2).setClickable(true);
            }
        }
        if (this.f3817x.f14210e1) {
            AbstractC0652n1.m4697a(this.f3818y, AbstractC0652n1.f4038r);
            this.f3817x.f14210e1 = false;
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: f */
    public C3489yj mo4148f() {
        return this.f3817x;
    }

    /* renamed from: g */
    public StateListDrawable m4470g(int i) {
        StateListDrawable stateListDrawable;
        StateListDrawable stateListDrawable2 = null;
        try {
            stateListDrawable = new StateListDrawable();
        } catch (Exception unused) {
        }
        try {
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, this.f4045c.getResources().getDrawable(R.drawable.onbg));
            stateListDrawable.addState(new int[]{android.R.attr.state_checked}, this.f4045c.getResources().getDrawable(R.drawable.onbg));
            stateListDrawable.addState(new int[]{android.R.attr.state_selected}, this.f4045c.getResources().getDrawable(R.drawable.onbg));
            if (i == 1) {
                stateListDrawable.addState(new int[0], this.f4045c.getResources().getDrawable(R.drawable.offbg));
            } else if (i == 3) {
                stateListDrawable.addState(new int[0], this.f4045c.getResources().getDrawable(R.drawable.offbg_ng));
            }
            return stateListDrawable;
        } catch (Exception unused2) {
            stateListDrawable2 = stateListDrawable;
            return stateListDrawable2;
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: h */
    public View mo4150h() {
        return this.f3818y;
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
        m4474p();
        C0755x1.m6185e(this.f4045c, "msg.empty");
        return false;
    }

    /* renamed from: m */
    public ArrayList<CheckBox> m4471m() {
        return this.f3809D;
    }

    /* renamed from: n */
    public String m4472n() {
        return this.f3808C;
    }

    /* renamed from: o */
    public ArrayList<C0186n0> m4473o() {
        return this.f3811F;
    }

    /* renamed from: p */
    public void m4474p() {
        Drawable drawable = this.f4045c.getResources().getDrawable(R.drawable.empty);
        ArrayList<CheckBox> arrayList = this.f3809D;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        CheckBox checkBox = this.f3809D.get(0);
        checkBox.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        checkBox.setError(null, drawable);
    }

    /* renamed from: q */
    public boolean m4475q() {
        int i;
        return Build.VERSION.SDK_INT >= 16 && ((i = this.f3817x.f14165K0) == 1 || i == 3 || i == 6);
    }

    /* renamed from: r */
    public void m4476r() {
        C2391dj c2391dj = this.f3817x.f14163J0;
        if (c2391dj != null) {
            AbstractC0652n1.m4700a(c2391dj, mo4150h());
        }
    }

    /* renamed from: s */
    public void m4477s() {
        if (!m4475q()) {
            if (this.f3809D != null) {
                for (int i = 0; i < this.f3809D.size(); i++) {
                    this.f3809D.get(i).setChecked(false);
                }
                return;
            }
            return;
        }
        if (this.f3811F != null) {
            for (int i2 = 0; i2 < this.f3811F.size(); i2++) {
                C0186n0 c0186n0 = this.f3811F.get(i2);
                if (c0186n0.isChecked()) {
                    this.f3810E[i2] = 1;
                    c0186n0.setChecked(false);
                }
            }
        }
    }

    /* renamed from: t */
    public void m4478t() {
        ViewGroup viewGroup = this.f4044b;
        if (viewGroup != null) {
            viewGroup.addView(this.f3818y);
            this.f4044b.invalidate();
        }
    }
}
