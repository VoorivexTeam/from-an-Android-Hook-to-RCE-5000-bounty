package com.comviva.webaxn.ui;

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
import com.comviva.webaxn.utils.x1;
import com.mtni.myirancell.R;
import defpackage.dj;
import defpackage.kj;
import defpackage.yj;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class i extends n1 {
    public boolean A;
    public boolean B;
    public String C;
    private ArrayList<CheckBox> D;
    public int[] E;
    private final ArrayList<androidx.appcompat.widget.n0> F;
    private o1 G;
    private boolean H;
    private View.OnClickListener I;
    private CompoundButton.OnCheckedChangeListener J;
    private CompoundButton.OnCheckedChangeListener K;
    private yj x;
    private LinearLayout y;
    public boolean z;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = i.this.D.iterator();
            int i = -1;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                i++;
                if (((CheckBox) it.next()).equals(view)) {
                    i iVar = i.this;
                    iVar.C = iVar.x.P.elementAt(i).c;
                    break;
                }
            }
            if (!TextUtils.isEmpty(i.this.x.f1)) {
                if (i.this.H) {
                    if (i.this.G.j().equals("VALIDATE")) {
                        i iVar2 = i.this;
                        iVar2.g.a(false, iVar2.x);
                    } else if (i.this.G.a(i.this.x.f1, i.this.x.V)) {
                        i iVar3 = i.this;
                        iVar3.g.a(iVar3.x.g1, i.this.x);
                    }
                    i.this.H = false;
                } else {
                    if (i.this.G.j().equals("VALIDATE")) {
                        i iVar4 = i.this;
                        iVar4.g.a(true, iVar4.x);
                    } else if (i.this.G.b(i.this.x.f1, i.this.x.V)) {
                        i iVar5 = i.this;
                        iVar5.g.a(iVar5.x.f1, i.this.x);
                    }
                    i.this.H = true;
                }
            }
            if (!TextUtils.isEmpty(i.this.x.u1)) {
                i iVar6 = i.this;
                iVar6.a(iVar6.x.u1);
            }
            i iVar7 = i.this;
            iVar7.g.a(iVar7, iVar7.n(), i.this.x);
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
                i iVar = i.this;
                if (iVar.B) {
                    iVar.B = false;
                } else {
                    iVar.g.b(iVar);
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
            i iVar = i.this;
            if (iVar.B) {
                iVar.B = false;
                return;
            }
            iVar.z = true;
            iVar.A = z;
            iVar.g.b(iVar);
        }
    }

    /* loaded from: classes.dex */
    class d implements CompoundButton.OnCheckedChangeListener {
        d() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (compoundButton != null) {
                int i = -1;
                Iterator it = i.this.F.iterator();
                while (it.hasNext()) {
                    i++;
                    if (((androidx.appcompat.widget.n0) it.next()).equals(compoundButton)) {
                        i iVar = i.this;
                        iVar.C = iVar.x.P.elementAt(i).c;
                        i iVar2 = i.this;
                        int[] iArr = iVar2.E;
                        if (iArr[i] == 1) {
                            iArr[i] = 0;
                            return;
                        }
                        iVar2.g.a(iVar2, iVar2.n(), i.this.x);
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
    public i(android.content.Context r5, java.lang.String r6, defpackage.yj r7, com.comviva.webaxn.ui.j0 r8, com.comviva.webaxn.ui.v0 r9, com.comviva.webaxn.ui.o1 r10) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.i.<init>(android.content.Context, java.lang.String, yj, com.comviva.webaxn.ui.j0, com.comviva.webaxn.ui.v0, com.comviva.webaxn.ui.o1):void");
    }

    private void a(androidx.appcompat.widget.n0 n0Var) {
        int i;
        n0Var.setTextOff("OFF");
        n0Var.setTextOn("ON");
        if (Build.VERSION.SDK_INT >= 21) {
            n0Var.setShowText(true);
        }
        n0Var.a(this.c, R.style.SwitchTextAppearance);
        n0Var.a((Typeface) null, 1);
        n0Var.setThumbTextPadding((int) (this.x.a * (com.comviva.webaxn.utils.b.a(this.c).a().h() ? 10.0f : 1.0f)));
        n0Var.setThumbDrawable(g(this.x.K0));
        int i2 = this.x.K0;
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
    public void a(AbsoluteLayout.LayoutParams layoutParams) {
        ((AbsoluteLayout.LayoutParams) this.y.getLayoutParams()).x = layoutParams.x;
        ((AbsoluteLayout.LayoutParams) this.y.getLayoutParams()).y = layoutParams.y;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(p0 p0Var) {
        this.y.setPadding(p0Var.a, p0Var.b, p0Var.c, p0Var.d);
    }

    public void a(kj kjVar) {
        int indexOf;
        int indexOf2 = this.x.P.indexOf(kjVar);
        if (-1 == indexOf2) {
            return;
        }
        if (q()) {
            ArrayList<androidx.appcompat.widget.n0> arrayList = this.F;
            if (arrayList == null || (indexOf = arrayList.indexOf(kjVar)) >= this.F.size() || indexOf < 0) {
                return;
            }
            androidx.appcompat.widget.n0 n0Var = this.F.get(indexOf);
            if (n0Var.isChecked()) {
                n0Var.setChecked(false);
                return;
            } else {
                n0Var.setChecked(true);
                return;
            }
        }
        ArrayList<CheckBox> arrayList2 = this.D;
        if (arrayList2 == null || indexOf2 >= arrayList2.size() || indexOf2 < 0) {
            return;
        }
        CheckBox checkBox = this.D.get(indexOf2);
        if (checkBox.isChecked()) {
            checkBox.setChecked(false);
        } else {
            checkBox.setChecked(true);
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(yj yjVar) {
        a(yjVar.v0);
    }

    public void a(byte[] bArr) {
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

    public boolean a(String str, String str2) {
        int i;
        int i2;
        try {
            if (!q()) {
                if (str2 == null) {
                    return false;
                }
                if (str2.equals("1")) {
                    i = 0;
                    while (i < this.x.P.size()) {
                        if (!this.x.P.elementAt(i).b.equals(str)) {
                            i++;
                        } else if (i >= this.D.size()) {
                            return false;
                        }
                    }
                    return false;
                }
                if (!str2.equals("2")) {
                    int parseInt = Integer.parseInt(str);
                    if (parseInt >= this.D.size()) {
                        return false;
                    }
                    this.D.get(parseInt).setChecked(true);
                    return true;
                }
                i = 0;
                while (i < this.x.P.size()) {
                    if (!this.x.P.elementAt(i).a.equals(str)) {
                        i++;
                    } else if (i >= this.D.size()) {
                        return false;
                    }
                }
                return false;
                this.D.get(i).setChecked(true);
                return true;
            }
            if (str2 == null) {
                return false;
            }
            if (str2.equals("1")) {
                i2 = 0;
                while (i2 < this.x.P.size()) {
                    if (!this.x.P.elementAt(i2).b.equals(str)) {
                        i2++;
                    } else if (i2 >= this.F.size()) {
                        return false;
                    }
                }
                return false;
            }
            if (!str2.equals("2")) {
                int parseInt2 = Integer.parseInt(str);
                if (parseInt2 >= this.F.size()) {
                    return false;
                }
                this.F.get(parseInt2).setChecked(!this.F.get(parseInt2).isChecked());
                return true;
            }
            i2 = 0;
            while (i2 < this.x.P.size()) {
                if (!this.x.P.elementAt(i2).a.equals(str)) {
                    i2++;
                } else if (i2 >= this.F.size()) {
                    return false;
                }
            }
            return false;
            this.F.get(i2).setChecked(true);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b() {
        this.b.removeView(this.y);
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
        if (q()) {
            if (this.F != null) {
                for (int i = 0; i < this.F.size(); i++) {
                    this.F.get(i).setClickable(false);
                }
            }
        } else if (this.D != null) {
            for (int i2 = 0; i2 < this.D.size(); i2++) {
                this.D.get(i2).setClickable(false);
            }
        }
        yj yjVar = this.x;
        if (yjVar.e1) {
            n1.a(this.y, yjVar.d1);
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void d() {
        this.x.b = true;
        if (q()) {
            if (this.F != null) {
                for (int i = 0; i < this.F.size(); i++) {
                    this.F.get(i).setClickable(true);
                }
            }
        } else if (this.D != null) {
            for (int i2 = 0; i2 < this.D.size(); i2++) {
                this.D.get(i2).setClickable(true);
            }
        }
        if (this.x.e1) {
            n1.a(this.y, n1.r);
            this.x.e1 = false;
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public yj f() {
        return this.x;
    }

    public StateListDrawable g(int i) {
        StateListDrawable stateListDrawable;
        StateListDrawable stateListDrawable2 = null;
        try {
            stateListDrawable = new StateListDrawable();
        } catch (Exception unused) {
        }
        try {
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, this.c.getResources().getDrawable(R.drawable.onbg));
            stateListDrawable.addState(new int[]{android.R.attr.state_checked}, this.c.getResources().getDrawable(R.drawable.onbg));
            stateListDrawable.addState(new int[]{android.R.attr.state_selected}, this.c.getResources().getDrawable(R.drawable.onbg));
            if (i == 1) {
                stateListDrawable.addState(new int[0], this.c.getResources().getDrawable(R.drawable.offbg));
            } else if (i == 3) {
                stateListDrawable.addState(new int[0], this.c.getResources().getDrawable(R.drawable.offbg_ng));
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

    public ArrayList<CheckBox> m() {
        return this.D;
    }

    public String n() {
        return this.C;
    }

    public ArrayList<androidx.appcompat.widget.n0> o() {
        return this.F;
    }

    public void p() {
        Drawable drawable = this.c.getResources().getDrawable(R.drawable.empty);
        ArrayList<CheckBox> arrayList = this.D;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        CheckBox checkBox = this.D.get(0);
        checkBox.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        checkBox.setError(null, drawable);
    }

    public boolean q() {
        int i;
        return Build.VERSION.SDK_INT >= 16 && ((i = this.x.K0) == 1 || i == 3 || i == 6);
    }

    public void r() {
        dj djVar = this.x.J0;
        if (djVar != null) {
            n1.a(djVar, h());
        }
    }

    public void s() {
        if (!q()) {
            if (this.D != null) {
                for (int i = 0; i < this.D.size(); i++) {
                    this.D.get(i).setChecked(false);
                }
                return;
            }
            return;
        }
        if (this.F != null) {
            for (int i2 = 0; i2 < this.F.size(); i2++) {
                androidx.appcompat.widget.n0 n0Var = this.F.get(i2);
                if (n0Var.isChecked()) {
                    this.E[i2] = 1;
                    n0Var.setChecked(false);
                }
            }
        }
    }

    public void t() {
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.addView(this.y);
            this.b.invalidate();
        }
    }
}
