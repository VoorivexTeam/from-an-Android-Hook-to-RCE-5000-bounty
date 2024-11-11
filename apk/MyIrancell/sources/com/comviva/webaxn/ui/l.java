package com.comviva.webaxn.ui;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.comviva.webaxn.utils.x1;
import com.mtni.myirancell.R;
import defpackage.aj;
import defpackage.dj;
import defpackage.ej;
import defpackage.fj;
import defpackage.gj;
import defpackage.kj;
import defpackage.q2;
import defpackage.vj;
import defpackage.yj;
import defpackage.zi;
import java.util.ArrayList;
import java.util.Vector;

/* loaded from: classes.dex */
public class l extends n1 {
    int A;
    private LinearLayout B;
    private AbsoluteLayout.LayoutParams C;
    public int D;
    public int E;
    private ListView F;
    private EditText G;
    private TextView H;
    private LinearLayout I;
    private ArrayAdapter<String> J;
    private int K;
    private Button L;
    Dialog M;
    LinearLayout N;
    private ArrayList<String> O;
    private String P;
    private boolean Q;
    Spinner x;
    private yj y;
    ArrayList<String> z;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            l.this.z.clear();
            l lVar = l.this;
            lVar.z.addAll(lVar.O);
            if (-1 != l.this.K) {
                l lVar2 = l.this;
                lVar2.z.remove(lVar2.K);
            }
            l lVar3 = l.this;
            l lVar4 = l.this;
            Context context = lVar4.c;
            yj yjVar = lVar4.y;
            l lVar5 = l.this;
            lVar3.J = new j(context, yjVar, R.id.combo_box1, lVar5.z, lVar5.l, lVar5.m);
            l.this.F.setAdapter((ListAdapter) l.this.J);
            if (l.this.G.getText().toString() != null) {
                l.this.G.setText((CharSequence) null);
            }
            if (l.this.M.isShowing()) {
                l.this.M.dismiss();
            }
            l.this.M.show();
        }
    }

    /* loaded from: classes.dex */
    class b implements AdapterView.OnItemClickListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (l.this.M.isShowing()) {
                l.this.M.dismiss();
            }
            String obj = adapterView.getItemAtPosition(i).toString();
            if (obj != null) {
                l lVar = l.this;
                lVar.K = lVar.O.indexOf(obj);
                l.this.L.setText(obj);
                l.this.d(obj);
                l.this.L.setTextColor(n1.d(l.this.y.p.c()));
                l.this.L.setTextSize(l.this.y.p.f());
                l.this.J.clear();
                for (int i2 = 0; i2 < l.this.O.size(); i2++) {
                    l.this.J.add(l.this.O.get(i2));
                }
                l.this.J.remove(obj);
                l.this.J.notifyDataSetChanged();
            }
            l lVar2 = l.this;
            if (lVar2.A != lVar2.K) {
                l lVar3 = l.this;
                if (lVar3.g != null && lVar3.h(lVar3.K) != null) {
                    l lVar4 = l.this;
                    lVar4.g.b(lVar4);
                }
                l lVar5 = l.this;
                lVar5.A = lVar5.K;
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements TextWatcher {
        c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            l.this.J.getFilter().filter(charSequence.toString());
            l.this.J.notifyDataSetChanged();
        }
    }

    /* loaded from: classes.dex */
    class d implements AdapterView.OnItemSelectedListener {
        d() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (l.this.Q) {
                l lVar = l.this;
                lVar.a(lVar.e);
                l.this.Q = true;
            }
            l lVar2 = l.this;
            if (lVar2.A != i) {
                if (lVar2.g != null && lVar2.h(i) != null) {
                    if (!TextUtils.isEmpty(l.this.y.u1)) {
                        l lVar3 = l.this;
                        lVar3.a(lVar3.y.u1);
                    }
                    l lVar4 = l.this;
                    lVar4.g.a(lVar4, lVar4.g(i), l.this.y);
                }
                l.this.A = i;
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes.dex */
    class e implements View.OnTouchListener {
        e() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            l lVar = l.this;
            lVar.g.b(lVar);
            return false;
        }
    }

    public l(Context context, yj yjVar, j0 j0Var) {
        super(context);
        this.K = -1;
        this.Q = false;
        float f = j0Var.p.a;
        this.D = 1.0f > f ? 30 : (int) (f * 37.0f);
        this.y = yjVar;
        this.c = context;
        this.A = 0;
        ej ejVar = yjVar.O0;
        if (ejVar != null) {
            ejVar.a(j0Var.f);
        }
        LinearLayout linearLayout = new LinearLayout(this.c);
        this.B = linearLayout;
        linearLayout.setOrientation(1);
        this.B.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        if (yjVar.K0 == 1) {
            this.z = new ArrayList<>();
            this.O = new ArrayList<>();
            Button button = new Button(context);
            this.L = button;
            button.setTextSize(yjVar.p.f());
            this.L.setTypeface(yjVar.p.h(), yjVar.p.g());
            if (Build.VERSION.SDK_INT >= 21) {
                this.L.setLetterSpacing(yjVar.p.d());
            }
            this.L.setTextColor(n1.d(yjVar.p.c()));
            this.B.addView(this.L, new LinearLayout.LayoutParams(-1, -2));
            LinearLayout linearLayout2 = (LinearLayout) ((WebAxnActivity) this.c).getLayoutInflater().inflate(R.layout.layout_customdialog, (ViewGroup) null);
            this.N = linearLayout2;
            this.F = (ListView) linearLayout2.findViewById(R.id.listview);
            this.G = (EditText) this.N.findViewById(R.id.et_search);
            this.H = (TextView) this.N.findViewById(R.id.status);
            this.I = (LinearLayout) this.N.findViewById(R.id.search_lyt);
            Dialog dialog = new Dialog(this.c);
            this.M = dialog;
            dialog.setCancelable(true);
            this.M.setCanceledOnTouchOutside(true);
            this.M.getWindow().requestFeature(1);
            this.M.setContentView(this.N);
            this.M.getWindow().setSoftInputMode(16);
            this.L.setOnClickListener(new a());
            this.F.setTextFilterEnabled(true);
            this.F.setOnItemClickListener(new b());
            this.G.addTextChangedListener(new c());
        } else {
            this.x = Build.VERSION.SDK_INT >= 11 ? new Spinner(context, 1) : new Spinner(context);
            Spinner spinner = this.x;
            int i = this.E;
            spinner.setPadding(i, i, i, i);
            if (!TextUtils.isEmpty(this.y.r1)) {
                this.x.setContentDescription(this.y.r1);
            }
            this.B.addView(this.x);
        }
        vj vjVar = this.y.q1;
        if (vjVar != null) {
            q2.a(this.B, vjVar.a());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0021, code lost:
    
        if (r3.m != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        r0.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, r5, (android.graphics.drawable.Drawable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        r0.setCompoundDrawablesWithIntrinsicBounds(r5, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002a, code lost:
    
        if (r3.m != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r4, android.graphics.drawable.Drawable r5) {
        /*
            r3 = this;
            android.widget.Spinner r0 = r3.x
            android.view.View r0 = r0.getSelectedView()
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L33
            r1 = 1
            r2 = 0
            if (r4 == r1) goto L28
            r1 = 2
            if (r4 == r1) goto L24
            r1 = 3
            if (r4 == r1) goto L1f
            r1 = 4
            if (r4 == r1) goto L1b
            r0.setCompoundDrawablesWithIntrinsicBounds(r2, r2, r2, r2)
            goto L33
        L1b:
            r0.setCompoundDrawablesWithIntrinsicBounds(r2, r2, r2, r5)
            goto L33
        L1f:
            boolean r4 = r3.m
            if (r4 == 0) goto L2c
            goto L30
        L24:
            r0.setCompoundDrawablesWithIntrinsicBounds(r2, r5, r2, r2)
            goto L33
        L28:
            boolean r4 = r3.m
            if (r4 == 0) goto L30
        L2c:
            r0.setCompoundDrawablesWithIntrinsicBounds(r2, r2, r5, r2)
            goto L33
        L30:
            r0.setCompoundDrawablesWithIntrinsicBounds(r5, r2, r2, r2)
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.l.a(int, android.graphics.drawable.Drawable):void");
    }

    public void a(Drawable drawable) {
        p0 p0Var;
        this.x.setBackgroundDrawable(drawable);
        if (this.y.E && (p0Var = this.f) != null) {
            this.x.setPadding(p0Var.a, p0Var.b, p0Var.c, p0Var.d);
            return;
        }
        Spinner spinner = this.x;
        int i = this.E;
        spinner.setPadding(i, i, i, i);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(AbsoluteLayout.LayoutParams layoutParams) {
        ((AbsoluteLayout.LayoutParams) this.B.getLayoutParams()).x = layoutParams.x;
        ((AbsoluteLayout.LayoutParams) this.B.getLayoutParams()).y = layoutParams.y;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(p0 p0Var) {
        this.f = p0Var;
        yj yjVar = this.y;
        if (yjVar.E) {
            if (yjVar.K0 == 1) {
                this.L.setPadding(p0Var.a, p0Var.b, p0Var.c, p0Var.d);
            } else {
                this.x.setPadding(p0Var.a, p0Var.b, p0Var.c, p0Var.d);
            }
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(yj yjVar) {
        gj gjVar;
        fj fjVar = yjVar.l1;
        if ((fjVar == null || !fjVar.h()) && ((gjVar = yjVar.m1) == null || !gjVar.i())) {
            a(yjVar.v0);
            return;
        }
        fj fjVar2 = yjVar.l1;
        if (fjVar2 != null && fjVar2.h()) {
            this.y.l1.a(yjVar.l1.a());
            yjVar.l1.b(false);
            return;
        }
        gj gjVar2 = yjVar.m1;
        if (gjVar2 == null || !gjVar2.i()) {
            return;
        }
        this.y.m1.a(yjVar.m1.a());
        yjVar.m1.b(false);
    }

    public void a(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        View view = this.x;
        if (this.y.K0 == 1) {
            view = this.L;
        }
        int identifier = !TextUtils.isEmpty(this.y.r0) ? this.c.getResources().getIdentifier(this.y.r0, "drawable", this.c.getPackageName()) : 0;
        try {
            if (identifier > 0) {
                Bitmap a2 = com.comviva.webaxn.utils.e1.b(this.c).a(this.y.r0);
                if (a2 == null && (a2 = BitmapFactory.decodeResource(this.c.getResources(), identifier)) != null) {
                    com.comviva.webaxn.utils.e1.b(this.c).a(this.y.r0, a2);
                }
                this.e = NinePatch.isNinePatchChunk(a2.getNinePatchChunk()) ? new NinePatchDrawable(a2, a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(a2);
                view.setBackgroundDrawable(this.e);
                if (!this.y.E || this.f == null) {
                    i5 = this.E;
                    i6 = this.E;
                    i7 = this.E;
                    i8 = this.E;
                } else {
                    i5 = this.f.a;
                    i6 = this.f.b;
                    i7 = this.f.c;
                    i8 = this.f.d;
                }
                view.setPadding(i5, i6, i7, i8);
                return;
            }
            if (bArr == null) {
                this.d = n1.d(this.y.p.b());
                view.setTag(this.y);
                yj yjVar = this.y;
                ej ejVar = yjVar.O0;
                if (ejVar != null) {
                    Drawable a3 = x1.a(ejVar, this.d);
                    this.e = a3;
                    view.setBackgroundDrawable(a3);
                    return;
                } else {
                    if (yjVar.p.j()) {
                        int f0 = com.comviva.webaxn.utils.j1.a(this.c).f0();
                        this.h = f0;
                        this.h = n1.d(f0);
                        view.setBackgroundColor(this.d);
                        return;
                    }
                    return;
                }
            }
            Bitmap a4 = com.comviva.webaxn.utils.e1.b(this.c).a(this.y.O);
            if (a4 == null && (a4 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                com.comviva.webaxn.utils.e1.b(this.c).a(this.y.O, a4);
            }
            this.e = NinePatch.isNinePatchChunk(a4.getNinePatchChunk()) ? new NinePatchDrawable(a4, a4.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(a4);
            view.setBackgroundDrawable(this.e);
            if (!this.y.E || this.f == null) {
                i = this.E;
                i2 = this.E;
                i3 = this.E;
                i4 = this.E;
            } else {
                i = this.f.a;
                i2 = this.f.b;
                i3 = this.f.c;
                i4 = this.f.d;
            }
            view.setPadding(i, i2, i3, i4);
        } catch (Exception e2) {
            e2.printStackTrace();
        } catch (OutOfMemoryError e3) {
            e3.printStackTrace();
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b() {
        this.b.removeView(this.B);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b(AbsoluteLayout.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2;
        int i;
        ViewGroup.LayoutParams layoutParams3 = this.B.getLayoutParams();
        int i2 = layoutParams.width;
        this.l = i2;
        layoutParams3.width = i2;
        int i3 = layoutParams.height;
        if (i3 <= 0) {
            i3 = -2;
        }
        if (i3 > 0 && i3 < (i = this.D)) {
            i3 = i;
        }
        this.B.getLayoutParams().height = i3;
        if (this.y.K0 == 1) {
            if (this.L.getLayoutParams() != null) {
                this.L.getLayoutParams().width = layoutParams.width;
                layoutParams2 = this.L.getLayoutParams();
                layoutParams2.height = i3;
            }
        } else if (this.x.getLayoutParams() != null) {
            this.x.getLayoutParams().width = layoutParams.width;
            layoutParams2 = this.x.getLayoutParams();
            layoutParams2.height = i3;
        }
        if (i3 < 0) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            this.B.measure(makeMeasureSpec, makeMeasureSpec);
            this.k = this.B.getMeasuredHeight();
        } else {
            this.k = i3;
        }
        Spinner spinner = this.x;
        if (spinner == null || Build.VERSION.SDK_INT < 21) {
            return;
        }
        spinner.setDropDownVerticalOffset(this.k);
    }

    public void b(String str) {
        if (this.z == null) {
            this.z = new ArrayList<>();
        }
        this.z.add(str);
        if (this.y.K0 == 1) {
            this.O.add(str);
        }
    }

    public void b(yj yjVar) {
        this.y = yjVar;
        this.E = (int) (yjVar.a * 5.0f);
    }

    public int c(AbsoluteLayout.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2;
        int i;
        this.k = -2;
        this.l = layoutParams.width;
        int i2 = layoutParams.height;
        if (i2 > 0) {
            this.k = i2;
        }
        int i3 = this.k;
        if (i3 > 0 && i3 < (i = this.D)) {
            this.k = i;
        }
        if (this.y.K0 == 1) {
            j jVar = new j(this.c, this.y, R.layout.custom_combobox, this.z, this.l, this.m);
            this.J = jVar;
            jVar.setDropDownViewResource(R.layout.custom_dropdown_view);
            ArrayList<String> arrayList = this.z;
            if (arrayList == null || arrayList.size() > 5) {
                this.I.setVisibility(0);
            } else {
                this.I.setVisibility(8);
            }
        } else {
            j jVar2 = new j(this.c, this.y, R.layout.custom_combobox, this.z, this.l, this.m);
            jVar2.setDropDownViewResource(R.layout.custom_dropdown_view);
            this.x.setAdapter((SpinnerAdapter) jVar2);
        }
        this.C = new AbsoluteLayout.LayoutParams(this.l, this.k, layoutParams.x, layoutParams.y);
        if (this.y.K0 == 1) {
            if (this.L.getLayoutParams() != null) {
                this.L.getLayoutParams().width = this.l;
                layoutParams2 = this.L.getLayoutParams();
                layoutParams2.height = this.k;
            }
        } else if (this.x.getLayoutParams() != null) {
            this.x.getLayoutParams().width = this.l;
            layoutParams2 = this.x.getLayoutParams();
            layoutParams2.height = this.k;
        }
        this.b.addView(this.B, this.C);
        if (this.k < 0) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            this.B.measure(makeMeasureSpec, makeMeasureSpec);
            this.k = this.B.getMeasuredHeight();
        }
        Spinner spinner = this.x;
        if (spinner != null && Build.VERSION.SDK_INT >= 21) {
            spinner.setDropDownVerticalOffset(this.k);
        }
        return this.k;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void c() {
        yj yjVar;
        View view;
        yj yjVar2 = this.y;
        yjVar2.b = false;
        if (yjVar2.K0 == 1) {
            this.L.setClickable(false);
            this.L.setEnabled(false);
            yjVar = this.y;
            if (!yjVar.e1) {
                return;
            } else {
                view = this.L;
            }
        } else {
            this.x.setClickable(false);
            this.x.setEnabled(false);
            yjVar = this.y;
            if (!yjVar.e1) {
                return;
            } else {
                view = this.x;
            }
        }
        n1.a(view, yjVar.d1);
    }

    public void c(String str) {
        int i;
        int i2;
        String e2 = aj.a(this.c).e(this.y.V);
        int i3 = 0;
        if (e2 == null) {
            i = 0;
        } else {
            try {
                i = Integer.parseInt(e2);
            } catch (Exception e3) {
                e3.printStackTrace();
                i = -1;
            }
        }
        if (i == 0) {
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt == -1) {
                    try {
                        if (this.y.U != null && this.y.U.length > 0) {
                            parseInt = this.y.U[0];
                        }
                    } catch (Exception e4) {
                        e = e4;
                        i3 = parseInt;
                        e.printStackTrace();
                        i(i3);
                    }
                }
                i3 = parseInt;
            } catch (Exception e5) {
                e = e5;
            }
        } else if (i == 1) {
            i2 = 0;
            while (i2 < this.y.P.size()) {
                if (this.y.P.elementAt(i2).b.equals(str)) {
                    i3 = i2;
                    break;
                }
                i2++;
            }
        } else if (i == 2) {
            i2 = 0;
            while (i2 < this.y.P.size()) {
                if (this.y.P.elementAt(i2).a.equals(str)) {
                    i3 = i2;
                    break;
                }
                i2++;
            }
        }
        i(i3);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void d() {
        View view;
        yj yjVar = this.y;
        yjVar.b = true;
        if (yjVar.K0 == 1) {
            this.L.setClickable(true);
            this.L.setEnabled(true);
            if (this.y.e1) {
                view = this.L;
                n1.a(view, n1.r);
            }
        } else {
            this.x.setClickable(true);
            this.x.setEnabled(true);
            if (this.y.e1) {
                view = this.x;
                n1.a(view, n1.r);
            }
        }
        this.y.e1 = false;
    }

    public void d(String str) {
        this.P = str;
        TextView textView = this.H;
        if (textView != null) {
            textView.setText(str);
            this.G.setHint("Search");
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
        return this.B;
    }

    public String h(int i) {
        kj elementAt;
        Vector<kj> vector = this.y.P;
        if (vector == null || (elementAt = vector.elementAt(i)) == null || TextUtils.isEmpty(elementAt.b)) {
            return null;
        }
        return elementAt.b;
    }

    @Override // com.comviva.webaxn.ui.n1
    public int i() {
        return this.k;
    }

    public void i(int i) {
        this.A = i;
        if (this.y.K0 != 1) {
            this.x.setSelection(i);
            return;
        }
        this.K = i;
        String str = this.O.get(i);
        if (str != null) {
            this.J.clear();
            for (int i2 = 0; i2 < this.O.size(); i2++) {
                this.J.add(this.O.get(i2));
            }
            this.J.remove(str);
        }
        d(str);
        this.L.setText(str);
        this.L.setTextSize(this.y.p.f());
        this.L.setTextColor(n1.d(this.y.p.c()));
    }

    @Override // com.comviva.webaxn.ui.n1
    public int j() {
        return this.l;
    }

    @Override // com.comviva.webaxn.ui.n1
    public boolean l() {
        yj yjVar = this.y;
        if (yjVar.m1 != null) {
            Drawable a2 = x1.a(this.c, yjVar, yj.a.ERROR);
            if (a2 != null) {
                a(a2);
                this.Q = true;
                TextView textView = (TextView) this.x.getSelectedView();
                if (textView != null) {
                    textView.setTextColor(this.y.m1.e());
                }
            }
        } else if (zi.m) {
            a(3, this.c.getResources().getDrawable(R.drawable.empty));
        } else {
            a(this.c.getResources().getDrawable(R.drawable.empty_error));
            this.Q = true;
        }
        if (!this.Q) {
            x1.e(this.c, "msg.empty");
        }
        return false;
    }

    public int m() {
        if (this.y.K0 != 1) {
            return this.x.getSelectedItemPosition();
        }
        int i = this.K;
        if (i < 0) {
            return 0;
        }
        return i;
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

    public void p() {
        View view;
        yj yjVar = this.y;
        boolean z = yjVar.b;
        int i = yjVar.K0;
        if (z) {
            if (i != 1) {
                this.x.setOnItemSelectedListener(new d());
                this.x.setOnTouchListener(new e());
                return;
            }
            return;
        }
        if (i == 1) {
            this.L.setClickable(false);
            this.L.setEnabled(false);
            view = this.L;
        } else {
            this.x.setClickable(false);
            this.x.setEnabled(false);
            view = this.x;
        }
        n1.a(view, this.y.d1);
        this.y.e1 = true;
    }

    public void q() {
    }
}
