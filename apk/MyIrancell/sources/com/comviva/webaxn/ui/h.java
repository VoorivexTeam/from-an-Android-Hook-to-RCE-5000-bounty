package com.comviva.webaxn.ui;

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
import com.comviva.webaxn.utils.x1;
import com.mtni.myirancell.R;
import defpackage.dj;
import defpackage.yj;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class h extends n1 {
    public boolean A;
    public boolean B;
    public boolean C;
    public String D;
    private ArrayList<CheckBox> E;
    private v0 F;
    public int[] G;
    private final ArrayList<androidx.appcompat.widget.n0> H;
    private CompoundButton.OnCheckedChangeListener I;
    private CompoundButton.OnCheckedChangeListener J;
    private View.OnClickListener K;
    private Context x;
    private LinearLayout y;
    private yj z;

    /* loaded from: classes.dex */
    class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (compoundButton != null) {
                int i = -1;
                Iterator it = h.this.H.iterator();
                while (it.hasNext()) {
                    i++;
                    if (((androidx.appcompat.widget.n0) it.next()).equals(compoundButton)) {
                        h hVar = h.this;
                        hVar.D = hVar.z.P.elementAt(i).c;
                        h hVar2 = h.this;
                        int[] iArr = hVar2.G;
                        if (iArr[i] == 1) {
                            iArr[i] = 0;
                            return;
                        }
                        hVar2.g.a(hVar2, hVar2.n(), h.this.z);
                    }
                }
            }
        }
    }

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
                h hVar = h.this;
                if (hVar.C) {
                    hVar.C = false;
                } else {
                    hVar.g.b(hVar);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements CompoundButton.OnCheckedChangeListener {
        c() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                compoundButton.setError(null);
            }
            h hVar = h.this;
            if (hVar.C) {
                hVar.C = false;
                return;
            }
            hVar.A = true;
            hVar.B = z;
            hVar.g.b(hVar);
        }
    }

    /* loaded from: classes.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = h.this.E.iterator();
            int i = -1;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                i++;
                if (((CheckBox) it.next()).equals(view)) {
                    h hVar = h.this;
                    hVar.D = hVar.z.P.elementAt(i).c;
                    break;
                }
            }
            if (!TextUtils.isEmpty(h.this.z.u1)) {
                h hVar2 = h.this;
                hVar2.a(hVar2.z.u1);
            }
            h hVar3 = h.this;
            hVar3.g.a(hVar3, hVar3.n(), h.this.z);
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
    public h(android.content.Context r10, defpackage.yj r11, com.comviva.webaxn.ui.v0 r12) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.h.<init>(android.content.Context, yj, com.comviva.webaxn.ui.v0):void");
    }

    private void a(androidx.appcompat.widget.n0 n0Var) {
        int i;
        n0Var.setTextOff("OFF");
        n0Var.setTextOn("ON");
        if (Build.VERSION.SDK_INT >= 21) {
            n0Var.setShowText(true);
        }
        n0Var.a(this.x, R.style.SwitchTextAppearance);
        n0Var.a((Typeface) null, 1);
        n0Var.setThumbTextPadding((int) (this.z.a * (com.comviva.webaxn.utils.b.a(this.x).a().h() ? 10.0f : 1.0f)));
        n0Var.setThumbDrawable(g(this.z.K0));
        int i2 = this.z.K0;
        if (i2 == 1) {
            i = R.drawable.switchtrackbg;
        } else if (i2 != 3) {
            return;
        } else {
            i = R.drawable.switchtrackbg_ng;
        }
        n0Var.setTrackResource(i);
    }

    private void a(androidx.appcompat.widget.n0 n0Var, int i, int i2) {
        if (i == -1 || i2 == -1) {
            return;
        }
        ColorStateList a2 = x1.a(android.R.attr.state_checked, i, -1, i2);
        ColorStateList a3 = x1.a(android.R.attr.state_checked, Color.argb(77, Color.red(i), Color.green(i), Color.blue(i)), -1, Color.argb(77, Color.red(i2), Color.green(i2), Color.blue(i2)));
        n0Var.setThumbTintList(a2);
        n0Var.setTrackTintList(a3);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(j0 j0Var, v0 v0Var) {
        String str = this.z.m0;
        this.y.getLayoutParams().width = (str == null || str.equalsIgnoreCase("equal")) ? -1 : this.z.k(v0Var.c.width()) - (this.z.d(this.F.c.width()) + this.z.g(this.F.c.width()));
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(yj yjVar) {
        a(yjVar.v0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(byte[] bArr) {
        BitmapDrawable bitmapDrawable;
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
                float a3 = com.comviva.webaxn.utils.b.a(this.x).a().a();
                Bitmap a4 = com.comviva.webaxn.utils.e1.b(this.x).a(this.z.O);
                if (a4 == null && (a4 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                    com.comviva.webaxn.utils.e1.b(this.x).a(this.z.O, a4);
                }
                a4.setDensity(160);
                if (NinePatch.isNinePatchChunk(a4.getNinePatchChunk())) {
                    NinePatchDrawable ninePatchDrawable = new NinePatchDrawable(a4, a4.getNinePatchChunk(), new Rect(), null);
                    ninePatchDrawable.setTargetDensity((int) (a3 * 160.0f));
                    bitmapDrawable = ninePatchDrawable;
                } else {
                    bitmapDrawable = new BitmapDrawable(a4);
                }
                this.e = bitmapDrawable;
                this.y.setBackgroundDrawable(this.e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
    }

    public boolean a(String str, String str2) {
        int i;
        int i2;
        try {
            if (p()) {
                if (str2 == null) {
                    return false;
                }
                if (str2.equals("1")) {
                    i2 = 0;
                    while (i2 < this.z.P.size()) {
                        if (!this.z.P.elementAt(i2).b.equals(str)) {
                            i2++;
                        } else if (i2 >= this.H.size()) {
                            return false;
                        }
                    }
                    return false;
                }
                if (!str2.equals("2")) {
                    int parseInt = Integer.parseInt(str);
                    if (parseInt >= this.H.size()) {
                        return false;
                    }
                    this.H.get(parseInt).setChecked(true);
                    return true;
                }
                i2 = 0;
                while (i2 < this.z.P.size()) {
                    if (!this.z.P.elementAt(i2).a.equals(str)) {
                        i2++;
                    } else if (i2 >= this.H.size()) {
                        return false;
                    }
                }
                return false;
                this.H.get(i2).setChecked(true);
                return true;
            }
            if (str2 == null) {
                return false;
            }
            if (str2.equals("1")) {
                i = 0;
                while (i < this.z.P.size()) {
                    if (!this.z.P.elementAt(i).b.equals(str)) {
                        i++;
                    } else if (i >= this.E.size()) {
                        return false;
                    }
                }
                return false;
            }
            if (!str2.equals("2")) {
                int parseInt2 = Integer.parseInt(str);
                if (parseInt2 >= this.E.size()) {
                    return false;
                }
                this.E.get(parseInt2).setChecked(true);
                return true;
            }
            i = 0;
            while (i < this.z.P.size()) {
                if (!this.z.P.elementAt(i).a.equals(str)) {
                    i++;
                } else if (i >= this.E.size()) {
                    return false;
                }
            }
            return false;
            this.E.get(i).setChecked(true);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void b(yj yjVar) {
        this.z = yjVar;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void c() {
        this.z.b = false;
        if (p()) {
            if (this.H != null) {
                for (int i = 0; i < this.H.size(); i++) {
                    this.H.get(i).setClickable(false);
                }
            }
        } else if (this.E != null) {
            for (int i2 = 0; i2 < this.E.size(); i2++) {
                this.E.get(i2).setClickable(false);
            }
        }
        yj yjVar = this.z;
        if (yjVar.e1) {
            n1.a(this.y, yjVar.d1);
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void d() {
        this.z.b = true;
        if (p()) {
            if (this.H != null) {
                for (int i = 0; i < this.H.size(); i++) {
                    this.H.get(i).setClickable(true);
                }
            }
        } else if (this.E != null) {
            for (int i2 = 0; i2 < this.E.size(); i2++) {
                this.E.get(i2).setClickable(true);
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

    public StateListDrawable g(int i) {
        StateListDrawable stateListDrawable;
        StateListDrawable stateListDrawable2 = null;
        try {
            stateListDrawable = new StateListDrawable();
        } catch (Exception unused) {
        }
        try {
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, this.x.getResources().getDrawable(R.drawable.onbg));
            stateListDrawable.addState(new int[]{android.R.attr.state_checked}, this.x.getResources().getDrawable(R.drawable.onbg));
            stateListDrawable.addState(new int[]{android.R.attr.state_selected}, this.x.getResources().getDrawable(R.drawable.onbg));
            if (i == 1) {
                stateListDrawable.addState(new int[0], this.x.getResources().getDrawable(R.drawable.offbg));
            } else if (i == 3) {
                stateListDrawable.addState(new int[0], this.x.getResources().getDrawable(R.drawable.offbg_ng));
            }
            return stateListDrawable;
        } catch (Exception unused2) {
            stateListDrawable2 = stateListDrawable;
            return stateListDrawable2;
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public View h() {
        return this.y;
    }

    @Override // com.comviva.webaxn.ui.n1
    public boolean l() {
        o();
        x1.e(this.x, "msg.empty");
        return false;
    }

    public ArrayList<CheckBox> m() {
        return this.E;
    }

    public String n() {
        return this.D;
    }

    public void o() {
        Drawable drawable = this.x.getResources().getDrawable(R.drawable.empty);
        ArrayList<CheckBox> arrayList = this.E;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        CheckBox checkBox = this.E.get(0);
        checkBox.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        checkBox.setError(null, drawable);
    }

    public boolean p() {
        int i;
        return Build.VERSION.SDK_INT >= 16 && ((i = this.z.K0) == 1 || i == 3 || i == 6);
    }

    public void q() {
        dj djVar = this.z.J0;
        if (djVar != null) {
            n1.a(djVar, h());
        }
    }

    public void r() {
        if (!p()) {
            if (this.E != null) {
                for (int i = 0; i < this.E.size(); i++) {
                    this.E.get(i).setChecked(false);
                }
                return;
            }
            return;
        }
        if (this.H != null) {
            for (int i2 = 0; i2 < this.H.size(); i2++) {
                androidx.appcompat.widget.n0 n0Var = this.H.get(i2);
                if (n0Var.isChecked()) {
                    this.G[i2] = 1;
                    n0Var.setChecked(false);
                }
            }
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
        if (this.b == null) {
            return;
        }
        String str = this.z.m0;
        int k = (str == null || str.equalsIgnoreCase("equal")) ? -1 : this.z.k(this.F.c.width());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(this.z.d(this.F.c.width()), this.z.i(this.F.c.width()), this.z.g(this.F.c.width()), this.z.a(this.F.c.width()));
        layoutParams.width = k;
        layoutParams.gravity = s();
        this.b.addView(this.y, layoutParams);
    }
}
