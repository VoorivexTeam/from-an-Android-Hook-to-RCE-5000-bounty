package com.comviva.webaxn.p002ui;

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
import com.comviva.webaxn.utils.C0698e1;
import com.comviva.webaxn.utils.C0713j1;
import com.comviva.webaxn.utils.C0755x1;
import com.mtni.myirancell.R;
import java.util.ArrayList;
import java.util.Vector;
import p000.C0023aj;
import p000.C2391dj;
import p000.C2434ej;
import p000.C2475fj;
import p000.C2515gj;
import p000.C2862kj;
import p000.C3107q2;
import p000.C3361vj;
import p000.C3489yj;
import p000.C3530zi;

/* renamed from: com.comviva.webaxn.ui.l */
/* loaded from: classes.dex */
public class C0644l extends AbstractC0652n1 {

    /* renamed from: A */
    int f3942A;

    /* renamed from: B */
    private LinearLayout f3943B;

    /* renamed from: C */
    private AbsoluteLayout.LayoutParams f3944C;

    /* renamed from: D */
    public int f3945D;

    /* renamed from: E */
    public int f3946E;

    /* renamed from: F */
    private ListView f3947F;

    /* renamed from: G */
    private EditText f3948G;

    /* renamed from: H */
    private TextView f3949H;

    /* renamed from: I */
    private LinearLayout f3950I;

    /* renamed from: J */
    private ArrayAdapter<String> f3951J;

    /* renamed from: K */
    private int f3952K;

    /* renamed from: L */
    private Button f3953L;

    /* renamed from: M */
    Dialog f3954M;

    /* renamed from: N */
    LinearLayout f3955N;

    /* renamed from: O */
    private ArrayList<String> f3956O;

    /* renamed from: P */
    private String f3957P;

    /* renamed from: Q */
    private boolean f3958Q;

    /* renamed from: x */
    Spinner f3959x;

    /* renamed from: y */
    private C3489yj f3960y;

    /* renamed from: z */
    ArrayList<String> f3961z;

    /* renamed from: com.comviva.webaxn.ui.l$a */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0644l.this.f3961z.clear();
            C0644l c0644l = C0644l.this;
            c0644l.f3961z.addAll(c0644l.f3956O);
            if (-1 != C0644l.this.f3952K) {
                C0644l c0644l2 = C0644l.this;
                c0644l2.f3961z.remove(c0644l2.f3952K);
            }
            C0644l c0644l3 = C0644l.this;
            C0644l c0644l4 = C0644l.this;
            Context context = c0644l4.f4045c;
            C3489yj c3489yj = c0644l4.f3960y;
            C0644l c0644l5 = C0644l.this;
            c0644l3.f3951J = new C0638j(context, c3489yj, R.id.combo_box1, c0644l5.f3961z, c0644l5.f4054l, c0644l5.f4055m);
            C0644l.this.f3947F.setAdapter((ListAdapter) C0644l.this.f3951J);
            if (C0644l.this.f3948G.getText().toString() != null) {
                C0644l.this.f3948G.setText((CharSequence) null);
            }
            if (C0644l.this.f3954M.isShowing()) {
                C0644l.this.f3954M.dismiss();
            }
            C0644l.this.f3954M.show();
        }
    }

    /* renamed from: com.comviva.webaxn.ui.l$b */
    /* loaded from: classes.dex */
    class b implements AdapterView.OnItemClickListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (C0644l.this.f3954M.isShowing()) {
                C0644l.this.f3954M.dismiss();
            }
            String obj = adapterView.getItemAtPosition(i).toString();
            if (obj != null) {
                C0644l c0644l = C0644l.this;
                c0644l.f3952K = c0644l.f3956O.indexOf(obj);
                C0644l.this.f3953L.setText(obj);
                C0644l.this.m4627d(obj);
                C0644l.this.f3953L.setTextColor(AbstractC0652n1.m4701d(C0644l.this.f3960y.f14241p.m6062c()));
                C0644l.this.f3953L.setTextSize(C0644l.this.f3960y.f14241p.m6067f());
                C0644l.this.f3951J.clear();
                for (int i2 = 0; i2 < C0644l.this.f3956O.size(); i2++) {
                    C0644l.this.f3951J.add(C0644l.this.f3956O.get(i2));
                }
                C0644l.this.f3951J.remove(obj);
                C0644l.this.f3951J.notifyDataSetChanged();
            }
            C0644l c0644l2 = C0644l.this;
            if (c0644l2.f3942A != c0644l2.f3952K) {
                C0644l c0644l3 = C0644l.this;
                if (c0644l3.f4049g != null && c0644l3.m4629h(c0644l3.f3952K) != null) {
                    C0644l c0644l4 = C0644l.this;
                    c0644l4.f4049g.mo4849b(c0644l4);
                }
                C0644l c0644l5 = C0644l.this;
                c0644l5.f3942A = c0644l5.f3952K;
            }
        }
    }

    /* renamed from: com.comviva.webaxn.ui.l$c */
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
            C0644l.this.f3951J.getFilter().filter(charSequence.toString());
            C0644l.this.f3951J.notifyDataSetChanged();
        }
    }

    /* renamed from: com.comviva.webaxn.ui.l$d */
    /* loaded from: classes.dex */
    class d implements AdapterView.OnItemSelectedListener {
        d() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (C0644l.this.f3958Q) {
                C0644l c0644l = C0644l.this;
                c0644l.m4621a(c0644l.f4047e);
                C0644l.this.f3958Q = true;
            }
            C0644l c0644l2 = C0644l.this;
            if (c0644l2.f3942A != i) {
                if (c0644l2.f4049g != null && c0644l2.m4629h(i) != null) {
                    if (!TextUtils.isEmpty(C0644l.this.f3960y.f14258u1)) {
                        C0644l c0644l3 = C0644l.this;
                        c0644l3.m4707a(c0644l3.f3960y.f14258u1);
                    }
                    C0644l c0644l4 = C0644l.this;
                    c0644l4.f4049g.mo4836a(c0644l4, c0644l4.m4628g(i), C0644l.this.f3960y);
                }
                C0644l.this.f3942A = i;
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.comviva.webaxn.ui.l$e */
    /* loaded from: classes.dex */
    class e implements View.OnTouchListener {
        e() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            C0644l c0644l = C0644l.this;
            c0644l.f4049g.mo4849b(c0644l);
            return false;
        }
    }

    public C0644l(Context context, C3489yj c3489yj, C0639j0 c0639j0) {
        super(context);
        this.f3952K = -1;
        this.f3958Q = false;
        float f = c0639j0.f3879p.f14196a;
        this.f3945D = 1.0f > f ? 30 : (int) (f * 37.0f);
        this.f3960y = c3489yj;
        this.f4045c = context;
        this.f3942A = 0;
        C2434ej c2434ej = c3489yj.f14173O0;
        if (c2434ej != null) {
            c2434ej.m11615a(c0639j0.f3869f);
        }
        LinearLayout linearLayout = new LinearLayout(this.f4045c);
        this.f3943B = linearLayout;
        linearLayout.setOrientation(1);
        this.f3943B.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        if (c3489yj.f14165K0 == 1) {
            this.f3961z = new ArrayList<>();
            this.f3956O = new ArrayList<>();
            Button button = new Button(context);
            this.f3953L = button;
            button.setTextSize(c3489yj.f14241p.m6067f());
            this.f3953L.setTypeface(c3489yj.f14241p.m6069h(), c3489yj.f14241p.m6068g());
            if (Build.VERSION.SDK_INT >= 21) {
                this.f3953L.setLetterSpacing(c3489yj.f14241p.m6064d());
            }
            this.f3953L.setTextColor(AbstractC0652n1.m4701d(c3489yj.f14241p.m6062c()));
            this.f3943B.addView(this.f3953L, new LinearLayout.LayoutParams(-1, -2));
            LinearLayout linearLayout2 = (LinearLayout) ((WebAxnActivity) this.f4045c).getLayoutInflater().inflate(R.layout.layout_customdialog, (ViewGroup) null);
            this.f3955N = linearLayout2;
            this.f3947F = (ListView) linearLayout2.findViewById(R.id.listview);
            this.f3948G = (EditText) this.f3955N.findViewById(R.id.et_search);
            this.f3949H = (TextView) this.f3955N.findViewById(R.id.status);
            this.f3950I = (LinearLayout) this.f3955N.findViewById(R.id.search_lyt);
            Dialog dialog = new Dialog(this.f4045c);
            this.f3954M = dialog;
            dialog.setCancelable(true);
            this.f3954M.setCanceledOnTouchOutside(true);
            this.f3954M.getWindow().requestFeature(1);
            this.f3954M.setContentView(this.f3955N);
            this.f3954M.getWindow().setSoftInputMode(16);
            this.f3953L.setOnClickListener(new a());
            this.f3947F.setTextFilterEnabled(true);
            this.f3947F.setOnItemClickListener(new b());
            this.f3948G.addTextChangedListener(new c());
        } else {
            this.f3959x = Build.VERSION.SDK_INT >= 11 ? new Spinner(context, 1) : new Spinner(context);
            Spinner spinner = this.f3959x;
            int i = this.f3946E;
            spinner.setPadding(i, i, i, i);
            if (!TextUtils.isEmpty(this.f3960y.f14249r1)) {
                this.f3959x.setContentDescription(this.f3960y.f14249r1);
            }
            this.f3943B.addView(this.f3959x);
        }
        C3361vj c3361vj = this.f3960y.f14246q1;
        if (c3361vj != null) {
            C3107q2.m14884a(this.f3943B, c3361vj.m16034a());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0021, code lost:
    
        if (r3.f4055m != false) goto L21;
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
    
        if (r3.f4055m != false) goto L20;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4620a(int r4, android.graphics.drawable.Drawable r5) {
        /*
            r3 = this;
            android.widget.Spinner r0 = r3.f3959x
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
            boolean r4 = r3.f4055m
            if (r4 == 0) goto L2c
            goto L30
        L24:
            r0.setCompoundDrawablesWithIntrinsicBounds(r2, r5, r2, r2)
            goto L33
        L28:
            boolean r4 = r3.f4055m
            if (r4 == 0) goto L30
        L2c:
            r0.setCompoundDrawablesWithIntrinsicBounds(r2, r2, r5, r2)
            goto L33
        L30:
            r0.setCompoundDrawablesWithIntrinsicBounds(r5, r2, r2, r2)
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0644l.m4620a(int, android.graphics.drawable.Drawable):void");
    }

    /* renamed from: a */
    public void m4621a(Drawable drawable) {
        C0657p0 c0657p0;
        this.f3959x.setBackgroundDrawable(drawable);
        if (this.f3960y.f14152E && (c0657p0 = this.f4048f) != null) {
            this.f3959x.setPadding(c0657p0.f4218a, c0657p0.f4219b, c0657p0.f4220c, c0657p0.f4221d);
            return;
        }
        Spinner spinner = this.f3959x;
        int i = this.f3946E;
        spinner.setPadding(i, i, i, i);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4139a(AbsoluteLayout.LayoutParams layoutParams) {
        ((AbsoluteLayout.LayoutParams) this.f3943B.getLayoutParams()).x = layoutParams.x;
        ((AbsoluteLayout.LayoutParams) this.f3943B.getLayoutParams()).y = layoutParams.y;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4201a(C0657p0 c0657p0) {
        this.f4048f = c0657p0;
        C3489yj c3489yj = this.f3960y;
        if (c3489yj.f14152E) {
            if (c3489yj.f14165K0 == 1) {
                this.f3953L.setPadding(c0657p0.f4218a, c0657p0.f4219b, c0657p0.f4220c, c0657p0.f4221d);
            } else {
                this.f3959x.setPadding(c0657p0.f4218a, c0657p0.f4219b, c0657p0.f4220c, c0657p0.f4221d);
            }
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
        C2515gj c2515gj;
        C2475fj c2475fj = c3489yj.f14231l1;
        if ((c2475fj == null || !c2475fj.m11787h()) && ((c2515gj = c3489yj.f14234m1) == null || !c2515gj.m12028i())) {
            m4622a(c3489yj.f14260v0);
            return;
        }
        C2475fj c2475fj2 = c3489yj.f14231l1;
        if (c2475fj2 != null && c2475fj2.m11787h()) {
            this.f3960y.f14231l1.m11772a(c3489yj.f14231l1.m11773a());
            c3489yj.f14231l1.m11777b(false);
            return;
        }
        C2515gj c2515gj2 = c3489yj.f14234m1;
        if (c2515gj2 == null || !c2515gj2.m12028i()) {
            return;
        }
        this.f3960y.f14234m1.m12012a(c3489yj.f14234m1.m12013a());
        c3489yj.f14234m1.m12017b(false);
    }

    /* renamed from: a */
    public void m4622a(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        View view = this.f3959x;
        if (this.f3960y.f14165K0 == 1) {
            view = this.f3953L;
        }
        int identifier = !TextUtils.isEmpty(this.f3960y.f14248r0) ? this.f4045c.getResources().getIdentifier(this.f3960y.f14248r0, "drawable", this.f4045c.getPackageName()) : 0;
        try {
            if (identifier > 0) {
                Bitmap m5429a = C0698e1.m5426b(this.f4045c).m5429a(this.f3960y.f14248r0);
                if (m5429a == null && (m5429a = BitmapFactory.decodeResource(this.f4045c.getResources(), identifier)) != null) {
                    C0698e1.m5426b(this.f4045c).m5432a(this.f3960y.f14248r0, m5429a);
                }
                this.f4047e = NinePatch.isNinePatchChunk(m5429a.getNinePatchChunk()) ? new NinePatchDrawable(m5429a, m5429a.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a);
                view.setBackgroundDrawable(this.f4047e);
                if (!this.f3960y.f14152E || this.f4048f == null) {
                    i5 = this.f3946E;
                    i6 = this.f3946E;
                    i7 = this.f3946E;
                    i8 = this.f3946E;
                } else {
                    i5 = this.f4048f.f4218a;
                    i6 = this.f4048f.f4219b;
                    i7 = this.f4048f.f4220c;
                    i8 = this.f4048f.f4221d;
                }
                view.setPadding(i5, i6, i7, i8);
                return;
            }
            if (bArr == null) {
                this.f4046d = AbstractC0652n1.m4701d(this.f3960y.f14241p.m6057b());
                view.setTag(this.f3960y);
                C3489yj c3489yj = this.f3960y;
                C2434ej c2434ej = c3489yj.f14173O0;
                if (c2434ej != null) {
                    Drawable m6122a = C0755x1.m6122a(c2434ej, this.f4046d);
                    this.f4047e = m6122a;
                    view.setBackgroundDrawable(m6122a);
                    return;
                } else {
                    if (c3489yj.f14241p.m6071j()) {
                        int m5664f0 = C0713j1.m5563a(this.f4045c).m5664f0();
                        this.f4050h = m5664f0;
                        this.f4050h = AbstractC0652n1.m4701d(m5664f0);
                        view.setBackgroundColor(this.f4046d);
                        return;
                    }
                    return;
                }
            }
            Bitmap m5429a2 = C0698e1.m5426b(this.f4045c).m5429a(this.f3960y.f14172O);
            if (m5429a2 == null && (m5429a2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                C0698e1.m5426b(this.f4045c).m5432a(this.f3960y.f14172O, m5429a2);
            }
            this.f4047e = NinePatch.isNinePatchChunk(m5429a2.getNinePatchChunk()) ? new NinePatchDrawable(m5429a2, m5429a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a2);
            view.setBackgroundDrawable(this.f4047e);
            if (!this.f3960y.f14152E || this.f4048f == null) {
                i = this.f3946E;
                i2 = this.f3946E;
                i3 = this.f3946E;
                i4 = this.f3946E;
            } else {
                i = this.f4048f.f4218a;
                i2 = this.f4048f.f4219b;
                i3 = this.f4048f.f4220c;
                i4 = this.f4048f.f4221d;
            }
            view.setPadding(i, i2, i3, i4);
        } catch (Exception e2) {
            e2.printStackTrace();
        } catch (OutOfMemoryError e3) {
            e3.printStackTrace();
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4142b() {
        this.f4044b.removeView(this.f3943B);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4143b(AbsoluteLayout.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2;
        int i;
        ViewGroup.LayoutParams layoutParams3 = this.f3943B.getLayoutParams();
        int i2 = layoutParams.width;
        this.f4054l = i2;
        layoutParams3.width = i2;
        int i3 = layoutParams.height;
        if (i3 <= 0) {
            i3 = -2;
        }
        if (i3 > 0 && i3 < (i = this.f3945D)) {
            i3 = i;
        }
        this.f3943B.getLayoutParams().height = i3;
        if (this.f3960y.f14165K0 == 1) {
            if (this.f3953L.getLayoutParams() != null) {
                this.f3953L.getLayoutParams().width = layoutParams.width;
                layoutParams2 = this.f3953L.getLayoutParams();
                layoutParams2.height = i3;
            }
        } else if (this.f3959x.getLayoutParams() != null) {
            this.f3959x.getLayoutParams().width = layoutParams.width;
            layoutParams2 = this.f3959x.getLayoutParams();
            layoutParams2.height = i3;
        }
        if (i3 < 0) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            this.f3943B.measure(makeMeasureSpec, makeMeasureSpec);
            this.f4053k = this.f3943B.getMeasuredHeight();
        } else {
            this.f4053k = i3;
        }
        Spinner spinner = this.f3959x;
        if (spinner == null || Build.VERSION.SDK_INT < 21) {
            return;
        }
        spinner.setDropDownVerticalOffset(this.f4053k);
    }

    /* renamed from: b */
    public void m4623b(String str) {
        if (this.f3961z == null) {
            this.f3961z = new ArrayList<>();
        }
        this.f3961z.add(str);
        if (this.f3960y.f14165K0 == 1) {
            this.f3956O.add(str);
        }
    }

    /* renamed from: b */
    public void m4624b(C3489yj c3489yj) {
        this.f3960y = c3489yj;
        this.f3946E = (int) (c3489yj.f14196a * 5.0f);
    }

    /* renamed from: c */
    public int m4625c(AbsoluteLayout.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2;
        int i;
        this.f4053k = -2;
        this.f4054l = layoutParams.width;
        int i2 = layoutParams.height;
        if (i2 > 0) {
            this.f4053k = i2;
        }
        int i3 = this.f4053k;
        if (i3 > 0 && i3 < (i = this.f3945D)) {
            this.f4053k = i;
        }
        if (this.f3960y.f14165K0 == 1) {
            C0638j c0638j = new C0638j(this.f4045c, this.f3960y, R.layout.custom_combobox, this.f3961z, this.f4054l, this.f4055m);
            this.f3951J = c0638j;
            c0638j.setDropDownViewResource(R.layout.custom_dropdown_view);
            ArrayList<String> arrayList = this.f3961z;
            if (arrayList == null || arrayList.size() > 5) {
                this.f3950I.setVisibility(0);
            } else {
                this.f3950I.setVisibility(8);
            }
        } else {
            C0638j c0638j2 = new C0638j(this.f4045c, this.f3960y, R.layout.custom_combobox, this.f3961z, this.f4054l, this.f4055m);
            c0638j2.setDropDownViewResource(R.layout.custom_dropdown_view);
            this.f3959x.setAdapter((SpinnerAdapter) c0638j2);
        }
        this.f3944C = new AbsoluteLayout.LayoutParams(this.f4054l, this.f4053k, layoutParams.x, layoutParams.y);
        if (this.f3960y.f14165K0 == 1) {
            if (this.f3953L.getLayoutParams() != null) {
                this.f3953L.getLayoutParams().width = this.f4054l;
                layoutParams2 = this.f3953L.getLayoutParams();
                layoutParams2.height = this.f4053k;
            }
        } else if (this.f3959x.getLayoutParams() != null) {
            this.f3959x.getLayoutParams().width = this.f4054l;
            layoutParams2 = this.f3959x.getLayoutParams();
            layoutParams2.height = this.f4053k;
        }
        this.f4044b.addView(this.f3943B, this.f3944C);
        if (this.f4053k < 0) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            this.f3943B.measure(makeMeasureSpec, makeMeasureSpec);
            this.f4053k = this.f3943B.getMeasuredHeight();
        }
        Spinner spinner = this.f3959x;
        if (spinner != null && Build.VERSION.SDK_INT >= 21) {
            spinner.setDropDownVerticalOffset(this.f4053k);
        }
        return this.f4053k;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: c */
    public void mo4146c() {
        C3489yj c3489yj;
        View view;
        C3489yj c3489yj2 = this.f3960y;
        c3489yj2.f14199b = false;
        if (c3489yj2.f14165K0 == 1) {
            this.f3953L.setClickable(false);
            this.f3953L.setEnabled(false);
            c3489yj = this.f3960y;
            if (!c3489yj.f14210e1) {
                return;
            } else {
                view = this.f3953L;
            }
        } else {
            this.f3959x.setClickable(false);
            this.f3959x.setEnabled(false);
            c3489yj = this.f3960y;
            if (!c3489yj.f14210e1) {
                return;
            } else {
                view = this.f3959x;
            }
        }
        AbstractC0652n1.m4697a(view, c3489yj.f14207d1);
    }

    /* renamed from: c */
    public void m4626c(String str) {
        int i;
        int i2;
        String m191e = C0023aj.m160a(this.f4045c).m191e(this.f3960y.f14186V);
        int i3 = 0;
        if (m191e == null) {
            i = 0;
        } else {
            try {
                i = Integer.parseInt(m191e);
            } catch (Exception e2) {
                e2.printStackTrace();
                i = -1;
            }
        }
        if (i == 0) {
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt == -1) {
                    try {
                        if (this.f3960y.f14184U != null && this.f3960y.f14184U.length > 0) {
                            parseInt = this.f3960y.f14184U[0];
                        }
                    } catch (Exception e3) {
                        e = e3;
                        i3 = parseInt;
                        e.printStackTrace();
                        m4630i(i3);
                    }
                }
                i3 = parseInt;
            } catch (Exception e4) {
                e = e4;
            }
        } else if (i == 1) {
            i2 = 0;
            while (i2 < this.f3960y.f14174P.size()) {
                if (this.f3960y.f14174P.elementAt(i2).f11757b.equals(str)) {
                    i3 = i2;
                    break;
                }
                i2++;
            }
        } else if (i == 2) {
            i2 = 0;
            while (i2 < this.f3960y.f14174P.size()) {
                if (this.f3960y.f14174P.elementAt(i2).f11756a.equals(str)) {
                    i3 = i2;
                    break;
                }
                i2++;
            }
        }
        m4630i(i3);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: d */
    public void mo4147d() {
        View view;
        C3489yj c3489yj = this.f3960y;
        c3489yj.f14199b = true;
        if (c3489yj.f14165K0 == 1) {
            this.f3953L.setClickable(true);
            this.f3953L.setEnabled(true);
            if (this.f3960y.f14210e1) {
                view = this.f3953L;
                AbstractC0652n1.m4697a(view, AbstractC0652n1.f4038r);
            }
        } else {
            this.f3959x.setClickable(true);
            this.f3959x.setEnabled(true);
            if (this.f3960y.f14210e1) {
                view = this.f3959x;
                AbstractC0652n1.m4697a(view, AbstractC0652n1.f4038r);
            }
        }
        this.f3960y.f14210e1 = false;
    }

    /* renamed from: d */
    public void m4627d(String str) {
        this.f3957P = str;
        TextView textView = this.f3949H;
        if (textView != null) {
            textView.setText(str);
            this.f3948G.setHint("Search");
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: f */
    public C3489yj mo4148f() {
        return this.f3960y;
    }

    /* renamed from: g */
    public String m4628g(int i) {
        C2862kj elementAt;
        Vector<C2862kj> vector = this.f3960y.f14174P;
        String str = (vector == null || (elementAt = vector.elementAt(i)) == null || TextUtils.isEmpty(elementAt.f11758c)) ? null : elementAt.f11758c;
        return TextUtils.isEmpty(str) ? this.f3960y.f14220i : str;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: h */
    public View mo4150h() {
        return this.f3943B;
    }

    /* renamed from: h */
    public String m4629h(int i) {
        C2862kj elementAt;
        Vector<C2862kj> vector = this.f3960y.f14174P;
        if (vector == null || (elementAt = vector.elementAt(i)) == null || TextUtils.isEmpty(elementAt.f11757b)) {
            return null;
        }
        return elementAt.f11757b;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: i */
    public int mo4151i() {
        return this.f4053k;
    }

    /* renamed from: i */
    public void m4630i(int i) {
        this.f3942A = i;
        if (this.f3960y.f14165K0 != 1) {
            this.f3959x.setSelection(i);
            return;
        }
        this.f3952K = i;
        String str = this.f3956O.get(i);
        if (str != null) {
            this.f3951J.clear();
            for (int i2 = 0; i2 < this.f3956O.size(); i2++) {
                this.f3951J.add(this.f3956O.get(i2));
            }
            this.f3951J.remove(str);
        }
        m4627d(str);
        this.f3953L.setText(str);
        this.f3953L.setTextSize(this.f3960y.f14241p.m6067f());
        this.f3953L.setTextColor(AbstractC0652n1.m4701d(this.f3960y.f14241p.m6062c()));
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: j */
    public int mo4152j() {
        return this.f4054l;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: l */
    public boolean mo4290l() {
        C3489yj c3489yj = this.f3960y;
        if (c3489yj.f14234m1 != null) {
            Drawable m6121a = C0755x1.m6121a(this.f4045c, c3489yj, C3489yj.a.ERROR);
            if (m6121a != null) {
                m4621a(m6121a);
                this.f3958Q = true;
                TextView textView = (TextView) this.f3959x.getSelectedView();
                if (textView != null) {
                    textView.setTextColor(this.f3960y.f14234m1.m12023e());
                }
            }
        } else if (C3530zi.f14470m) {
            m4620a(3, this.f4045c.getResources().getDrawable(R.drawable.empty));
        } else {
            m4621a(this.f4045c.getResources().getDrawable(R.drawable.empty_error));
            this.f3958Q = true;
        }
        if (!this.f3958Q) {
            C0755x1.m6185e(this.f4045c, "msg.empty");
        }
        return false;
    }

    /* renamed from: m */
    public int m4631m() {
        if (this.f3960y.f14165K0 != 1) {
            return this.f3959x.getSelectedItemPosition();
        }
        int i = this.f3952K;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    /* renamed from: n */
    public int m4632n() {
        return this.f3942A;
    }

    /* renamed from: o */
    public void m4633o() {
        C2391dj c2391dj = this.f3960y.f14163J0;
        if (c2391dj != null) {
            AbstractC0652n1.m4700a(c2391dj, mo4150h());
        }
    }

    /* renamed from: p */
    public void m4634p() {
        View view;
        C3489yj c3489yj = this.f3960y;
        boolean z = c3489yj.f14199b;
        int i = c3489yj.f14165K0;
        if (z) {
            if (i != 1) {
                this.f3959x.setOnItemSelectedListener(new d());
                this.f3959x.setOnTouchListener(new e());
                return;
            }
            return;
        }
        if (i == 1) {
            this.f3953L.setClickable(false);
            this.f3953L.setEnabled(false);
            view = this.f3953L;
        } else {
            this.f3959x.setClickable(false);
            this.f3959x.setEnabled(false);
            view = this.f3959x;
        }
        AbstractC0652n1.m4697a(view, this.f3960y.f14207d1);
        this.f3960y.f14210e1 = true;
    }

    /* renamed from: q */
    public void m4635q() {
    }
}
