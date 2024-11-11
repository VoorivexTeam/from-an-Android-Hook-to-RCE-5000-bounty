package com.comviva.webaxn.p002ui;

import android.content.Context;
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
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.h */
/* loaded from: classes.dex */
public class C0632h extends AbstractC0652n1 {

    /* renamed from: A */
    public boolean f3761A;

    /* renamed from: B */
    public boolean f3762B;

    /* renamed from: C */
    public boolean f3763C;

    /* renamed from: D */
    public String f3764D;

    /* renamed from: E */
    private ArrayList<CheckBox> f3765E;

    /* renamed from: F */
    private C0669v0 f3766F;

    /* renamed from: G */
    public int[] f3767G;

    /* renamed from: H */
    private final ArrayList<C0186n0> f3768H;

    /* renamed from: I */
    private CompoundButton.OnCheckedChangeListener f3769I;

    /* renamed from: J */
    private CompoundButton.OnCheckedChangeListener f3770J;

    /* renamed from: K */
    private View.OnClickListener f3771K;

    /* renamed from: x */
    private Context f3772x;

    /* renamed from: y */
    private LinearLayout f3773y;

    /* renamed from: z */
    private C3489yj f3774z;

    /* renamed from: com.comviva.webaxn.ui.h$a */
    /* loaded from: classes.dex */
    class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (compoundButton != null) {
                int i = -1;
                Iterator it = C0632h.this.f3768H.iterator();
                while (it.hasNext()) {
                    i++;
                    if (((C0186n0) it.next()).equals(compoundButton)) {
                        C0632h c0632h = C0632h.this;
                        c0632h.f3764D = c0632h.f3774z.f14174P.elementAt(i).f11758c;
                        C0632h c0632h2 = C0632h.this;
                        int[] iArr = c0632h2.f3767G;
                        if (iArr[i] == 1) {
                            iArr[i] = 0;
                            return;
                        }
                        c0632h2.f4049g.mo4836a(c0632h2, c0632h2.m4429n(), C0632h.this.f3774z);
                    }
                }
            }
        }
    }

    /* renamed from: com.comviva.webaxn.ui.h$b */
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
                C0632h c0632h = C0632h.this;
                if (c0632h.f3763C) {
                    c0632h.f3763C = false;
                } else {
                    c0632h.f4049g.mo4849b(c0632h);
                }
            }
        }
    }

    /* renamed from: com.comviva.webaxn.ui.h$c */
    /* loaded from: classes.dex */
    class c implements CompoundButton.OnCheckedChangeListener {
        c() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                compoundButton.setError(null);
            }
            C0632h c0632h = C0632h.this;
            if (c0632h.f3763C) {
                c0632h.f3763C = false;
                return;
            }
            c0632h.f3761A = true;
            c0632h.f3762B = z;
            c0632h.f4049g.mo4849b(c0632h);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.h$d */
    /* loaded from: classes.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = C0632h.this.f3765E.iterator();
            int i = -1;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                i++;
                if (((CheckBox) it.next()).equals(view)) {
                    C0632h c0632h = C0632h.this;
                    c0632h.f3764D = c0632h.f3774z.f14174P.elementAt(i).f11758c;
                    break;
                }
            }
            if (!TextUtils.isEmpty(C0632h.this.f3774z.f14258u1)) {
                C0632h c0632h2 = C0632h.this;
                c0632h2.m4707a(c0632h2.f3774z.f14258u1);
            }
            C0632h c0632h3 = C0632h.this;
            c0632h3.f4049g.mo4836a(c0632h3, c0632h3.m4429n(), C0632h.this.f3774z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x021b  */
    /* JADX WARN: Type inference failed for: r1v21, types: [android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.widget.CheckBox, android.view.View] */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.appcompat.widget.n0, android.widget.CompoundButton, android.view.View] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.comviva.webaxn.ui.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0632h(android.content.Context r10, p000.C3489yj r11, com.comviva.webaxn.p002ui.C0669v0 r12) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0632h.<init>(android.content.Context, yj, com.comviva.webaxn.ui.v0):void");
    }

    /* renamed from: a */
    private void m4420a(C0186n0 c0186n0) {
        int i;
        c0186n0.setTextOff("OFF");
        c0186n0.setTextOn("ON");
        if (Build.VERSION.SDK_INT >= 21) {
            c0186n0.setShowText(true);
        }
        c0186n0.m1112a(this.f3772x, R.style.SwitchTextAppearance);
        c0186n0.m1113a((Typeface) null, 1);
        c0186n0.setThumbTextPadding((int) (this.f3774z.f14196a * (C0687b.m5342a(this.f3772x).m5343a().m5556h() ? 10.0f : 1.0f)));
        c0186n0.setThumbDrawable(m4427g(this.f3774z.f14165K0));
        int i2 = this.f3774z.f14165K0;
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
    private void m4421a(C0186n0 c0186n0, int i, int i2) {
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
    public void mo4174a(C0639j0 c0639j0, C0669v0 c0669v0) {
        String str = this.f3774z.f14233m0;
        this.f3773y.getLayoutParams().width = (str == null || str.equalsIgnoreCase("equal")) ? -1 : this.f3774z.m16645k(c0669v0.f4397c.width()) - (this.f3774z.m16638d(this.f3766F.f4397c.width()) + this.f3774z.m16641g(this.f3766F.f4397c.width()));
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
        m4424a(c3489yj.f14260v0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void m4424a(byte[] bArr) {
        BitmapDrawable bitmapDrawable;
        int identifier = !TextUtils.isEmpty(this.f3774z.f14248r0) ? this.f3772x.getResources().getIdentifier(this.f3774z.f14248r0, "drawable", this.f3772x.getPackageName()) : 0;
        try {
            if (identifier > 0) {
                Bitmap m5429a = C0698e1.m5426b(this.f3772x).m5429a(this.f3774z.f14248r0);
                if (m5429a == null && (m5429a = BitmapFactory.decodeResource(this.f3772x.getResources(), identifier)) != null) {
                    C0698e1.m5426b(this.f3772x).m5432a(this.f3774z.f14248r0, m5429a);
                }
                this.f4047e = NinePatch.isNinePatchChunk(m5429a.getNinePatchChunk()) ? new NinePatchDrawable(m5429a, m5429a.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a);
                this.f3773y.setBackgroundDrawable(this.f4047e);
                return;
            }
            if (bArr != null) {
                float m5544a = C0687b.m5342a(this.f3772x).m5343a().m5544a();
                Bitmap m5429a2 = C0698e1.m5426b(this.f3772x).m5429a(this.f3774z.f14172O);
                if (m5429a2 == null && (m5429a2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                    C0698e1.m5426b(this.f3772x).m5432a(this.f3774z.f14172O, m5429a2);
                }
                m5429a2.setDensity(160);
                if (NinePatch.isNinePatchChunk(m5429a2.getNinePatchChunk())) {
                    NinePatchDrawable ninePatchDrawable = new NinePatchDrawable(m5429a2, m5429a2.getNinePatchChunk(), new Rect(), null);
                    ninePatchDrawable.setTargetDensity((int) (m5544a * 160.0f));
                    bitmapDrawable = ninePatchDrawable;
                } else {
                    bitmapDrawable = new BitmapDrawable(m5429a2);
                }
                this.f4047e = bitmapDrawable;
                this.f3773y.setBackgroundDrawable(this.f4047e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public boolean m4425a(String str, String str2) {
        int i;
        int i2;
        try {
            if (m4431p()) {
                if (str2 == null) {
                    return false;
                }
                if (str2.equals("1")) {
                    i2 = 0;
                    while (i2 < this.f3774z.f14174P.size()) {
                        if (!this.f3774z.f14174P.elementAt(i2).f11757b.equals(str)) {
                            i2++;
                        } else if (i2 >= this.f3768H.size()) {
                            return false;
                        }
                    }
                    return false;
                }
                if (!str2.equals("2")) {
                    int parseInt = Integer.parseInt(str);
                    if (parseInt >= this.f3768H.size()) {
                        return false;
                    }
                    this.f3768H.get(parseInt).setChecked(true);
                    return true;
                }
                i2 = 0;
                while (i2 < this.f3774z.f14174P.size()) {
                    if (!this.f3774z.f14174P.elementAt(i2).f11756a.equals(str)) {
                        i2++;
                    } else if (i2 >= this.f3768H.size()) {
                        return false;
                    }
                }
                return false;
                this.f3768H.get(i2).setChecked(true);
                return true;
            }
            if (str2 == null) {
                return false;
            }
            if (str2.equals("1")) {
                i = 0;
                while (i < this.f3774z.f14174P.size()) {
                    if (!this.f3774z.f14174P.elementAt(i).f11757b.equals(str)) {
                        i++;
                    } else if (i >= this.f3765E.size()) {
                        return false;
                    }
                }
                return false;
            }
            if (!str2.equals("2")) {
                int parseInt2 = Integer.parseInt(str);
                if (parseInt2 >= this.f3765E.size()) {
                    return false;
                }
                this.f3765E.get(parseInt2).setChecked(true);
                return true;
            }
            i = 0;
            while (i < this.f3774z.f14174P.size()) {
                if (!this.f3774z.f14174P.elementAt(i).f11756a.equals(str)) {
                    i++;
                } else if (i >= this.f3765E.size()) {
                    return false;
                }
            }
            return false;
            this.f3765E.get(i).setChecked(true);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public void m4426b(C3489yj c3489yj) {
        this.f3774z = c3489yj;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: c */
    public void mo4146c() {
        this.f3774z.f14199b = false;
        if (m4431p()) {
            if (this.f3768H != null) {
                for (int i = 0; i < this.f3768H.size(); i++) {
                    this.f3768H.get(i).setClickable(false);
                }
            }
        } else if (this.f3765E != null) {
            for (int i2 = 0; i2 < this.f3765E.size(); i2++) {
                this.f3765E.get(i2).setClickable(false);
            }
        }
        C3489yj c3489yj = this.f3774z;
        if (c3489yj.f14210e1) {
            AbstractC0652n1.m4697a(this.f3773y, c3489yj.f14207d1);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: d */
    public void mo4147d() {
        this.f3774z.f14199b = true;
        if (m4431p()) {
            if (this.f3768H != null) {
                for (int i = 0; i < this.f3768H.size(); i++) {
                    this.f3768H.get(i).setClickable(true);
                }
            }
        } else if (this.f3765E != null) {
            for (int i2 = 0; i2 < this.f3765E.size(); i2++) {
                this.f3765E.get(i2).setClickable(true);
            }
        }
        if (this.f3774z.f14210e1) {
            AbstractC0652n1.m4697a(this.f3773y, AbstractC0652n1.f4038r);
            this.f3774z.f14210e1 = false;
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: f */
    public C3489yj mo4148f() {
        return this.f3774z;
    }

    /* renamed from: g */
    public StateListDrawable m4427g(int i) {
        StateListDrawable stateListDrawable;
        StateListDrawable stateListDrawable2 = null;
        try {
            stateListDrawable = new StateListDrawable();
        } catch (Exception unused) {
        }
        try {
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, this.f3772x.getResources().getDrawable(R.drawable.onbg));
            stateListDrawable.addState(new int[]{android.R.attr.state_checked}, this.f3772x.getResources().getDrawable(R.drawable.onbg));
            stateListDrawable.addState(new int[]{android.R.attr.state_selected}, this.f3772x.getResources().getDrawable(R.drawable.onbg));
            if (i == 1) {
                stateListDrawable.addState(new int[0], this.f3772x.getResources().getDrawable(R.drawable.offbg));
            } else if (i == 3) {
                stateListDrawable.addState(new int[0], this.f3772x.getResources().getDrawable(R.drawable.offbg_ng));
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
        return this.f3773y;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: l */
    public boolean mo4290l() {
        m4430o();
        C0755x1.m6185e(this.f3772x, "msg.empty");
        return false;
    }

    /* renamed from: m */
    public ArrayList<CheckBox> m4428m() {
        return this.f3765E;
    }

    /* renamed from: n */
    public String m4429n() {
        return this.f3764D;
    }

    /* renamed from: o */
    public void m4430o() {
        Drawable drawable = this.f3772x.getResources().getDrawable(R.drawable.empty);
        ArrayList<CheckBox> arrayList = this.f3765E;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        CheckBox checkBox = this.f3765E.get(0);
        checkBox.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        checkBox.setError(null, drawable);
    }

    /* renamed from: p */
    public boolean m4431p() {
        int i;
        return Build.VERSION.SDK_INT >= 16 && ((i = this.f3774z.f14165K0) == 1 || i == 3 || i == 6);
    }

    /* renamed from: q */
    public void m4432q() {
        C2391dj c2391dj = this.f3774z.f14163J0;
        if (c2391dj != null) {
            AbstractC0652n1.m4700a(c2391dj, mo4150h());
        }
    }

    /* renamed from: r */
    public void m4433r() {
        if (!m4431p()) {
            if (this.f3765E != null) {
                for (int i = 0; i < this.f3765E.size(); i++) {
                    this.f3765E.get(i).setChecked(false);
                }
                return;
            }
            return;
        }
        if (this.f3768H != null) {
            for (int i2 = 0; i2 < this.f3768H.size(); i2++) {
                C0186n0 c0186n0 = this.f3768H.get(i2);
                if (c0186n0.isChecked()) {
                    this.f3767G[i2] = 1;
                    c0186n0.setChecked(false);
                }
            }
        }
    }

    /* renamed from: s */
    public int m4434s() {
        String str;
        C3489yj c3489yj = this.f3774z;
        if (c3489yj != null && (str = c3489yj.f14214g) != null) {
            if (str.equalsIgnoreCase("C") || this.f3774z.f14214g.equalsIgnoreCase("Center")) {
                return 1;
            }
            if (this.f3774z.f14214g.equalsIgnoreCase("L") || this.f3774z.f14214g.equalsIgnoreCase("Left")) {
                if (this.f4055m) {
                    return 5;
                }
            } else if ((this.f3774z.f14214g.equalsIgnoreCase("R") || this.f3774z.f14214g.equalsIgnoreCase("Right")) && !this.f4055m) {
                return 5;
            }
        }
        return 3;
    }

    /* renamed from: t */
    public void m4435t() {
        if (this.f4044b == null) {
            return;
        }
        String str = this.f3774z.f14233m0;
        int m16645k = (str == null || str.equalsIgnoreCase("equal")) ? -1 : this.f3774z.m16645k(this.f3766F.f4397c.width());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(this.f3774z.m16638d(this.f3766F.f4397c.width()), this.f3774z.m16643i(this.f3766F.f4397c.width()), this.f3774z.m16641g(this.f3766F.f4397c.width()), this.f3774z.m16632a(this.f3766F.f4397c.width()));
        layoutParams.width = m16645k;
        layoutParams.gravity = m4434s();
        this.f4044b.addView(this.f3773y, layoutParams);
    }
}
