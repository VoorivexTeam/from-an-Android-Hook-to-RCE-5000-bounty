package com.comviva.webaxn.p002ui;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.comviva.webaxn.utils.C0687b;
import com.comviva.webaxn.utils.C0698e1;
import com.comviva.webaxn.utils.C0713j1;
import com.comviva.webaxn.utils.C0755x1;
import com.mtni.myirancell.R;
import java.util.Calendar;
import p000.C0023aj;
import p000.C0482bj;
import p000.C2391dj;
import p000.C2434ej;
import p000.C3107q2;
import p000.C3361vj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.p */
/* loaded from: classes.dex */
public class C0656p extends AbstractC0652n1 {

    /* renamed from: A */
    C3489yj f4193A;

    /* renamed from: B */
    private int f4194B;

    /* renamed from: C */
    private int f4195C;

    /* renamed from: D */
    private int f4196D;

    /* renamed from: E */
    private boolean f4197E;

    /* renamed from: F */
    private int f4198F;

    /* renamed from: G */
    private C0669v0 f4199G;

    /* renamed from: H */
    private float f4200H;

    /* renamed from: I */
    private int f4201I;

    /* renamed from: J */
    private Spanned f4202J;

    /* renamed from: K */
    private String f4203K;

    /* renamed from: L */
    private boolean f4204L;

    /* renamed from: M */
    private C0655o1 f4205M;

    /* renamed from: N */
    private View.OnClickListener f4206N;

    /* renamed from: O */
    private DialogInterface.OnDismissListener f4207O;

    /* renamed from: P */
    private DialogInterface.OnCancelListener f4208P;

    /* renamed from: Q */
    private DatePickerDialog.OnDateSetListener f4209Q;

    /* renamed from: x */
    private EditText f4210x;

    /* renamed from: y */
    private ImageView f4211y;

    /* renamed from: z */
    private LinearLayout f4212z;

    /* renamed from: com.comviva.webaxn.ui.p$a */
    /* loaded from: classes.dex */
    class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            try {
                int action = motionEvent.getAction();
                if (action == 0) {
                    C0656p.this.f4200H = motionEvent.getRawY();
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                } else if (action == 1) {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                    if (Math.abs(motionEvent.getRawY() - C0656p.this.f4200H) <= C0656p.this.f4053k / 2) {
                        C0656p.this.f4197E = true;
                        C0656p.this.f4049g.mo4849b(C0656p.this);
                    }
                }
            } catch (Exception unused) {
            }
            return true;
        }
    }

    /* renamed from: com.comviva.webaxn.ui.p$b */
    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0656p.this.f4197E = true;
            C0656p c0656p = C0656p.this;
            c0656p.f4049g.mo4849b(c0656p);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.p$c */
    /* loaded from: classes.dex */
    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            C0656p.this.f4197E = false;
            C0656p c0656p = C0656p.this;
            c0656p.f4049g.mo4849b(c0656p);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.p$d */
    /* loaded from: classes.dex */
    class d implements DialogInterface.OnCancelListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            C0656p.this.f4197E = false;
            C0656p c0656p = C0656p.this;
            c0656p.f4049g.mo4849b(c0656p);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.p$e */
    /* loaded from: classes.dex */
    class e implements DatePickerDialog.OnDateSetListener {
        e() {
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            C0656p.this.f4195C = i;
            C0656p.this.f4194B = i2;
            C0656p.this.f4196D = i3;
            C0656p.this.m4873q();
            C0656p c0656p = C0656p.this;
            c0656p.f4049g.mo4849b(c0656p);
            C0656p.this.f4197E = false;
        }
    }

    public C0656p(Context context, C3489yj c3489yj, C0669v0 c0669v0, C0655o1 c0655o1) {
        super(context);
        this.f4197E = true;
        this.f4198F = 2;
        this.f4200H = 0.0f;
        this.f4201I = -1;
        this.f4202J = null;
        this.f4203K = "";
        this.f4204L = false;
        this.f4206N = new b();
        this.f4207O = new c();
        this.f4208P = new d();
        this.f4209Q = new e();
        this.f4193A = c3489yj;
        this.f4205M = c0655o1;
        this.f4199G = c0669v0;
        this.f4198F = (int) (C0687b.m5342a(this.f4045c).m5343a().m5544a() * 2.0f);
        int m5664f0 = C0713j1.m5563a(this.f4045c).m5664f0();
        this.f4050h = m5664f0;
        this.f4050h = AbstractC0652n1.m4701d(m5664f0);
        m4708c(this.f4046d);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f4212z = linearLayout;
        C3361vj c3361vj = this.f4193A.f14246q1;
        if (c3361vj != null) {
            C3107q2.m14884a(linearLayout, c3361vj.m16034a());
        }
        if (!TextUtils.isEmpty(this.f4193A.f14249r1)) {
            this.f4212z.setContentDescription(this.f4193A.f14249r1);
        }
        this.f4210x = new EditText(context);
        if (true == c3489yj.f14199b) {
            this.f4212z.setOnClickListener(this.f4206N);
        } else {
            AbstractC0652n1.m4697a(this.f4212z, this.f4193A.f14207d1);
            this.f4193A.f14210e1 = true;
        }
        this.f4210x.setOnTouchListener(new a());
        Calendar calendar = Calendar.getInstance();
        this.f4195C = calendar.get(1);
        this.f4194B = calendar.get(2);
        this.f4196D = calendar.get(5);
        String m200h = TextUtils.isEmpty(this.f4193A.f14176Q) ? C0023aj.m160a(this.f4045c).m200h(this.f4193A.f14186V) : C0023aj.m160a(this.f4045c).m200h(this.f4193A.f14176Q);
        m200h = TextUtils.isEmpty(m200h) ? C0023aj.m160a(this.f4045c).m197g(this.f4193A.f14186V) : m200h;
        if (TextUtils.isEmpty(m200h) && !TextUtils.isEmpty(this.f4193A.f14235n)) {
            m200h = this.f4193A.f14235n;
        }
        m4864b(m200h);
        C3489yj c3489yj2 = this.f4193A;
        if (c3489yj2.f14165K0 == 1 && !TextUtils.isEmpty(c3489yj2.f14238o)) {
            this.f4210x.setHint(this.f4193A.f14238o);
            if (this.f4193A.m16636b()) {
                this.f4210x.setHintTextColor(this.f4193A.m16631a());
            }
            if (TextUtils.isEmpty(m200h)) {
                return;
            }
        }
        m4873q();
    }

    /* renamed from: a */
    public void m4861a(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f4210x.setLetterSpacing(f);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4314a(int i) {
        super.mo4314a(i);
        C3489yj c3489yj = this.f4193A;
        C2434ej c2434ej = c3489yj.f14173O0;
        if (c2434ej == null) {
            if (c3489yj.f14241p.m6071j()) {
                this.f4210x.setBackgroundColor(i);
            }
        } else {
            c2434ej.m11615a(this.f4053k);
            Drawable m6122a = C0755x1.m6122a(this.f4193A.f14173O0, this.f4046d);
            this.f4047e = m6122a;
            this.f4210x.setBackgroundDrawable(m6122a);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4174a(C0639j0 c0639j0, C0669v0 c0669v0) {
        int m16645k = this.f4193A.m16645k(c0669v0.f4397c.width());
        if (m16645k < 0) {
            m16645k = c0669v0.f4397c.width() - (this.f4193A.m16641g(c0669v0.f4397c.width()) + this.f4193A.m16638d(c0669v0.f4397c.width()));
        }
        int m16637c = this.f4193A.m16637c(c0669v0.f4397c.height());
        if (m16637c < 0) {
            m16637c = c0669v0.f4397c.height();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f4212z.measure(makeMeasureSpec, makeMeasureSpec);
        this.f4054l = this.f4212z.getMeasuredWidth();
        this.f4053k = this.f4212z.getMeasuredHeight();
        if (m16645k > 0) {
            this.f4054l = m16645k;
        }
        if (m16637c > 0) {
            this.f4053k = m16637c;
        }
        this.f4212z.getLayoutParams().width = this.f4054l;
        this.f4212z.getLayoutParams().height = this.f4053k;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
        this.f4212z.setMinimumWidth(C0687b.m5342a(this.f4045c).m5343a().m5552d() / 3);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f4212z.measure(makeMeasureSpec, makeMeasureSpec);
        this.f4054l = this.f4212z.getMeasuredWidth();
        this.f4053k = this.f4212z.getMeasuredHeight();
        if (c3489yj != null) {
            if (c3489yj.f14260v0 == null && c3489yj.f14248r0 == null) {
                return;
            }
            m4862a(c3489yj.f14260v0);
        }
    }

    /* renamed from: a */
    public void m4862a(byte[] bArr) {
        int identifier = !TextUtils.isEmpty(this.f4193A.f14248r0) ? this.f4045c.getResources().getIdentifier(this.f4193A.f14248r0, "drawable", this.f4045c.getPackageName()) : 0;
        try {
            if (identifier > 0) {
                Bitmap m5429a = C0698e1.m5426b(this.f4045c).m5429a(this.f4193A.f14248r0);
                if (m5429a == null && (m5429a = BitmapFactory.decodeResource(this.f4045c.getResources(), identifier)) != null) {
                    C0698e1.m5426b(this.f4045c).m5432a(this.f4193A.f14248r0, m5429a);
                }
                this.f4047e = NinePatch.isNinePatchChunk(m5429a.getNinePatchChunk()) ? new NinePatchDrawable(m5429a, m5429a.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a);
                this.f4212z.setBackgroundDrawable(this.f4047e);
                return;
            }
            if (bArr != null) {
                Bitmap m5429a2 = C0698e1.m5426b(this.f4045c).m5429a(this.f4193A.f14172O);
                if (m5429a2 == null && (m5429a2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                    C0698e1.m5426b(this.f4045c).m5432a(this.f4193A.f14172O, m5429a2);
                }
                this.f4047e = NinePatch.isNinePatchChunk(m5429a2.getNinePatchChunk()) ? new NinePatchDrawable(m5429a2, m5429a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a2);
                this.f4212z.setBackgroundDrawable(this.f4047e);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        } catch (OutOfMemoryError e3) {
            e3.printStackTrace();
        }
    }

    /* renamed from: b */
    public void m4863b(float f) {
        this.f4210x.setTextSize(f);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4176b(int i) {
        super.mo4176b(i);
        this.f4210x.setTextColor(i);
    }

    /* renamed from: b */
    public void m4864b(String str) {
        String str2;
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.f4193A.f14206d0)) {
                return;
            }
            if (this.f4193A.f14206d0.equalsIgnoreCase("MM/DD/YYYY")) {
                String[] split = str.split("/");
                this.f4196D = Integer.parseInt(split[1]);
                this.f4194B = Integer.parseInt(split[0]) - 1;
                str2 = split[2];
            } else if (this.f4193A.f14206d0.equalsIgnoreCase("DD/MM/YY")) {
                String[] split2 = str.split("/");
                this.f4196D = Integer.parseInt(split2[0]);
                this.f4194B = Integer.parseInt(split2[1]) - 1;
                str2 = "20" + split2[2];
            } else if (this.f4193A.f14206d0.equalsIgnoreCase("MM/DD/YY")) {
                String[] split3 = str.split("/");
                this.f4196D = Integer.parseInt(split3[1]);
                this.f4194B = Integer.parseInt(split3[0]) - 1;
                str2 = "20" + split3[2];
            } else if (this.f4193A.f14206d0.equalsIgnoreCase("MM/YYYY")) {
                String[] split4 = str.split("/");
                this.f4194B = Integer.parseInt(split4[0]) - 1;
                str2 = split4[1];
            } else if (this.f4193A.f14206d0.equalsIgnoreCase("MM/YY")) {
                String[] split5 = str.split("/");
                this.f4194B = Integer.parseInt(split5[0]) - 1;
                str2 = "20" + split5[1];
            } else if (this.f4193A.f14206d0.equalsIgnoreCase("MMYY")) {
                this.f4194B = Integer.parseInt(str.substring(0, 1)) - 1;
                str2 = "20" + str.substring(2, str.length());
            } else if (this.f4193A.f14206d0.equalsIgnoreCase("DDMMYYYY")) {
                this.f4196D = Integer.parseInt(str.substring(0, 1));
                this.f4194B = Integer.parseInt(str.substring(2, 3)) - 1;
                str2 = "20" + str.substring(4, str.length());
            } else if (this.f4193A.f14206d0.equalsIgnoreCase("DD.MM.YYYY")) {
                String[] split6 = str.split(".");
                this.f4196D = Integer.parseInt(split6[0]);
                this.f4194B = Integer.parseInt(split6[1]) - 1;
                str2 = split6[2];
            } else if (this.f4193A.f14206d0.equalsIgnoreCase("DD-MM-YYYY")) {
                String[] split7 = str.split("-");
                this.f4196D = Integer.parseInt(split7[0]);
                this.f4194B = Integer.parseInt(split7[1]) - 1;
                str2 = split7[2];
            } else {
                if (this.f4193A.f14206d0.equalsIgnoreCase("YYYY-MM-DD")) {
                    String[] split8 = str.split("-");
                    this.f4195C = Integer.parseInt(split8[0]);
                    this.f4194B = Integer.parseInt(split8[1]) - 1;
                    this.f4196D = Integer.parseInt(split8[2]);
                    return;
                }
                if (!this.f4193A.f14206d0.equalsIgnoreCase("DDs MMM YYYY") && !this.f4193A.f14206d0.equalsIgnoreCase("DDs MMMM YYYY")) {
                    if (!this.f4193A.f14206d0.equalsIgnoreCase("DD MMM YYYY") && !this.f4193A.f14206d0.equalsIgnoreCase("DD MMMM YYYY")) {
                        if (this.f4193A.f14206d0.equalsIgnoreCase("DD MM YYYY")) {
                            String[] split9 = str.split(" ");
                            this.f4196D = Integer.parseInt(split9[0]);
                            this.f4194B = Integer.parseInt(split9[1]) - 1;
                            str2 = split9[2];
                        } else {
                            if (this.f4193A.f14206d0.equalsIgnoreCase("MM-YY")) {
                                String[] split10 = str.split("-");
                                this.f4194B = Integer.parseInt(split10[0]) - 1;
                                Integer.parseInt("20" + split10[1]);
                                return;
                            }
                            if (this.f4193A.f14206d0.equalsIgnoreCase("MM-YYYY")) {
                                String[] split11 = str.split("-");
                                this.f4194B = Integer.parseInt(split11[0]) - 1;
                                str2 = split11[1];
                            } else if (this.f4193A.f14206d0.equalsIgnoreCase("MMM-YYYY")) {
                                String[] split12 = str.split("-");
                                this.f4194B = C0755x1.m6191h(split12[0]);
                                str2 = split12[1];
                            } else if (this.f4193A.f14206d0.equalsIgnoreCase("MMM/YYYY")) {
                                String[] split13 = str.split("/");
                                this.f4194B = C0755x1.m6191h(split13[0]);
                                str2 = split13[1];
                            } else {
                                String[] split14 = str.split("/");
                                this.f4196D = Integer.parseInt(split14[0]);
                                this.f4194B = Integer.parseInt(split14[1]) - 1;
                                str2 = split14[2];
                            }
                        }
                    }
                    String[] split15 = str.split(" ");
                    this.f4196D = Integer.parseInt(split15[0]);
                    this.f4194B = C0755x1.m6191h(split15[1]);
                    str2 = split15[2];
                }
                String[] split16 = str.split(" ");
                this.f4196D = C0755x1.m6180d(split16[0]);
                this.f4194B = C0755x1.m6191h(split16[1]);
                str2 = split16[2];
            }
            this.f4195C = Integer.parseInt(str2);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005b  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4865b(p000.C3489yj r5) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0656p.m4865b(yj):void");
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: c */
    public void mo4146c() {
        this.f4193A.f14199b = false;
        this.f4212z.setOnClickListener(null);
        this.f4212z.setClickable(false);
        this.f4212z.setFocusable(false);
        C3489yj c3489yj = this.f4193A;
        if (c3489yj.f14210e1) {
            AbstractC0652n1.m4697a(this.f4212z, c3489yj.f14207d1);
        }
    }

    /* renamed from: c */
    public void m4866c(String str) {
        this.f4210x.setText(str);
        TextUtils.SimpleStringSplitter<String> simpleStringSplitter = new TextUtils.SimpleStringSplitter('/');
        simpleStringSplitter.setString(str);
        int i = 0;
        for (String str2 : simpleStringSplitter) {
            if (i == 0) {
                this.f4196D = Integer.parseInt(str2);
            } else if (1 == i) {
                this.f4194B = Integer.parseInt(str2) - 1;
            } else if (2 == i) {
                this.f4195C = Integer.parseInt(str2);
            }
            i++;
        }
    }

    /* renamed from: c */
    public void m4867c(C3489yj c3489yj) {
        this.f4193A = c3489yj;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: d */
    public void mo4147d() {
        this.f4193A.f14199b = true;
        this.f4212z.setOnClickListener(this.f4206N);
        this.f4212z.setClickable(true);
        this.f4212z.setFocusable(true);
        if (this.f4193A.f14210e1) {
            AbstractC0652n1.m4697a(this.f4212z, AbstractC0652n1.f4038r);
            this.f4193A.f14210e1 = false;
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: f */
    public C3489yj mo4148f() {
        return this.f4193A;
    }

    /* renamed from: g */
    public void m4868g(int i) {
        this.f4210x.setTypeface(this.f4193A.f14241p.m6069h(), AbstractC0652n1.m4702e(i));
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: h */
    public View mo4150h() {
        return this.f4212z;
    }

    /* renamed from: m */
    public String m4869m() {
        StringBuilder sb;
        String format;
        Spanned m6125a;
        try {
            if (TextUtils.isEmpty(this.f4193A.f14206d0)) {
                return String.format("%02d/%02d/%4d  ", Integer.valueOf(this.f4196D), Integer.valueOf(this.f4194B + 1), Integer.valueOf(this.f4195C));
            }
            if (this.f4193A.f14206d0.equalsIgnoreCase("MM/DD/YYYY")) {
                return String.format("%02d/%02d/%4d", Integer.valueOf(this.f4194B + 1), Integer.valueOf(this.f4196D), Integer.valueOf(this.f4195C));
            }
            if (this.f4193A.f14206d0.equalsIgnoreCase("DD/MM/YY")) {
                String valueOf = String.valueOf(this.f4195C);
                return String.format("%02d/%02d/%2d", Integer.valueOf(this.f4196D), Integer.valueOf(this.f4194B + 1), Integer.valueOf(Integer.parseInt(valueOf.substring(2, valueOf.length()))));
            }
            if (this.f4193A.f14206d0.equalsIgnoreCase("MM/DD/YY")) {
                String valueOf2 = String.valueOf(this.f4195C);
                return String.format("%02d/%02d/%2d", Integer.valueOf(this.f4194B + 1), Integer.valueOf(this.f4196D), Integer.valueOf(Integer.parseInt(valueOf2.substring(2, valueOf2.length()))));
            }
            if (this.f4193A.f14206d0.equalsIgnoreCase("MM/YYYY")) {
                return String.format("%02d/%4d", Integer.valueOf(this.f4194B + 1), Integer.valueOf(this.f4195C));
            }
            if (this.f4193A.f14206d0.equalsIgnoreCase("MM/YY")) {
                String valueOf3 = String.valueOf(this.f4195C);
                return String.format("%02d/%2d", Integer.valueOf(this.f4194B + 1), Integer.valueOf(Integer.parseInt(valueOf3.substring(2, valueOf3.length()))));
            }
            if (this.f4193A.f14206d0.equalsIgnoreCase("MMYY")) {
                String valueOf4 = String.valueOf(this.f4195C);
                return String.format("%02d%2d", Integer.valueOf(this.f4194B + 1), Integer.valueOf(Integer.parseInt(valueOf4.substring(2, valueOf4.length()))));
            }
            if (this.f4193A.f14206d0.equalsIgnoreCase("DDMMYYYY")) {
                return String.format("%02d%02d%4d", Integer.valueOf(this.f4196D), Integer.valueOf(this.f4194B + 1), Integer.valueOf(this.f4195C));
            }
            if (this.f4193A.f14206d0.equalsIgnoreCase("DD.MM.YYYY")) {
                return String.format("%02d.%02d.%4d", Integer.valueOf(this.f4196D), Integer.valueOf(this.f4194B + 1), Integer.valueOf(this.f4195C));
            }
            if (this.f4193A.f14206d0.equalsIgnoreCase("DD-MM-YYYY")) {
                return String.format("%02d-%02d-%4d", Integer.valueOf(this.f4196D), Integer.valueOf(this.f4194B + 1), Integer.valueOf(this.f4195C));
            }
            if (this.f4193A.f14206d0.equalsIgnoreCase("YYYY-MM-DD")) {
                return String.format("%4d-%02d-%02d", Integer.valueOf(this.f4195C), Integer.valueOf(this.f4194B + 1), Integer.valueOf(this.f4196D));
            }
            if (this.f4193A.f14206d0.equalsIgnoreCase("DDs MMM YYYY")) {
                this.f4201I = 2;
                m6125a = C0755x1.m6125a(this.f4196D, this.f4194B + 1, this.f4195C, 2, " ");
            } else {
                if (!this.f4193A.f14206d0.equalsIgnoreCase("DDs MMMM YYYY")) {
                    if (this.f4193A.f14206d0.equalsIgnoreCase("DD MMM YYYY")) {
                        sb = new StringBuilder();
                        sb.append(String.format("%02d", Integer.valueOf(this.f4196D)));
                        sb.append(" ");
                        sb.append(C0755x1.m6126a(this.f4194B + 1, 0));
                        sb.append(" ");
                        format = String.format("%02d", Integer.valueOf(this.f4195C));
                    } else if (this.f4193A.f14206d0.equalsIgnoreCase("DD MMMM YYYY")) {
                        sb = new StringBuilder();
                        sb.append(String.format("%02d", Integer.valueOf(this.f4196D)));
                        sb.append(" ");
                        sb.append(C0755x1.m6126a(this.f4194B + 1, 1));
                        sb.append(" ");
                        format = String.format("%02d", Integer.valueOf(this.f4195C));
                    } else {
                        if (this.f4193A.f14206d0.equalsIgnoreCase("DD MM YYYY")) {
                            return String.format("%02d %02d %4d", Integer.valueOf(this.f4196D), Integer.valueOf(this.f4194B + 1), Integer.valueOf(this.f4195C));
                        }
                        if (this.f4193A.f14206d0.equalsIgnoreCase("MM-YY")) {
                            String valueOf5 = String.valueOf(this.f4195C);
                            return String.format("%02d-%2d", Integer.valueOf(this.f4194B + 1), Integer.valueOf(Integer.parseInt(valueOf5.substring(2, valueOf5.length()))));
                        }
                        if (this.f4193A.f14206d0.equalsIgnoreCase("MM-YYYY")) {
                            return String.format("%02d-%4d", Integer.valueOf(this.f4194B + 1), Integer.valueOf(this.f4195C));
                        }
                        if (this.f4193A.f14206d0.equalsIgnoreCase("MMM-YYYY")) {
                            sb = new StringBuilder();
                            sb.append(C0755x1.m6126a(this.f4194B + 1, 0));
                            sb.append("-");
                            format = String.format("%04d", Integer.valueOf(this.f4195C));
                        } else {
                            if (!this.f4193A.f14206d0.equalsIgnoreCase("MMM/YYYY")) {
                                return String.format("%02d/%02d/%4d", Integer.valueOf(this.f4196D), Integer.valueOf(this.f4194B + 1), Integer.valueOf(this.f4195C));
                            }
                            sb = new StringBuilder();
                            sb.append(C0755x1.m6126a(this.f4194B + 1, 0));
                            sb.append("/");
                            format = String.format("%04d", Integer.valueOf(this.f4195C));
                        }
                    }
                    sb.append(format);
                    return sb.toString();
                }
                this.f4201I = 3;
                m6125a = C0755x1.m6125a(this.f4196D, this.f4194B + 1, this.f4195C, 3, " ");
            }
            this.f4202J = m6125a;
            return m6125a.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: n */
    public String m4870n() {
        String obj = this.f4210x.getText().toString();
        return obj != null ? obj.trim() : obj;
    }

    /* renamed from: o */
    public boolean m4871o() {
        return this.f4197E;
    }

    /* renamed from: p */
    public void m4872p() {
        C2391dj c2391dj = this.f4193A.f14163J0;
        if (c2391dj != null) {
            AbstractC0652n1.m4700a(c2391dj, mo4150h());
        }
    }

    /* renamed from: q */
    public void m4873q() {
        String m4869m = m4869m();
        if (this.f4049g != null && !this.f4204L && !TextUtils.isEmpty(this.f4193A.f14213f1) && !m4869m.equals(this.f4203K)) {
            C0655o1 c0655o1 = this.f4205M;
            C3489yj c3489yj = this.f4193A;
            if (c0655o1.m4805b(c3489yj.f14213f1, c3489yj.f14186V)) {
                C0755x1.p pVar = this.f4049g;
                C3489yj c3489yj2 = this.f4193A;
                pVar.mo4842a(c3489yj2.f14213f1, c3489yj2);
            }
            this.f4204L = true;
        }
        if (this.f4204L && m4869m.equals(this.f4203K)) {
            C0655o1 c0655o12 = this.f4205M;
            C3489yj c3489yj3 = this.f4193A;
            if (c0655o12.m4795a(c3489yj3.f14213f1, c3489yj3.f14186V)) {
                C0755x1.p pVar2 = this.f4049g;
                C3489yj c3489yj4 = this.f4193A;
                pVar2.mo4842a(c3489yj4.f14216g1, c3489yj4);
            }
            this.f4204L = false;
        }
        this.f4210x.setText(m4869m);
    }

    /* renamed from: r */
    public void m4874r() {
        int m16645k = this.f4193A.m16645k(this.f4199G.f4397c.width());
        int m16637c = this.f4193A.m16637c(this.f4199G.f4397c.height());
        if (m16645k < 0) {
            m16645k = this.f4199G.f4397c.width() - (this.f4193A.m16641g(this.f4199G.f4397c.width()) + this.f4193A.m16638d(this.f4199G.f4397c.width()));
        }
        if (m16637c < 0) {
            m16637c = this.f4199G.f4397c.height();
        }
        this.f4212z.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = this.f4198F;
        layoutParams.setMargins(i, i, i, i);
        if (this.f4055m) {
            this.f4212z.addView(this.f4210x);
            if (this.f4193A.f14165K0 != 1) {
                ImageView imageView = new ImageView(this.f4045c);
                this.f4211y = imageView;
                imageView.setImageResource(R.drawable.calendar);
                this.f4212z.addView(this.f4211y, layoutParams);
            }
        } else {
            if (this.f4193A.f14165K0 != 1) {
                ImageView imageView2 = new ImageView(this.f4045c);
                this.f4211y = imageView2;
                imageView2.setImageResource(R.drawable.calendar);
                this.f4212z.addView(this.f4211y, layoutParams);
            }
            this.f4212z.addView(this.f4210x);
        }
        this.f4212z.setPadding(this.f4193A.m16639e(this.f4199G.f4397c.width()), this.f4193A.m16644j(this.f4199G.f4397c.width()), this.f4193A.m16642h(this.f4199G.f4397c.width()), this.f4193A.m16635b(this.f4199G.f4397c.width()));
        m4865b(this.f4193A);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f4212z.measure(makeMeasureSpec, makeMeasureSpec);
        this.f4054l = this.f4212z.getMeasuredWidth();
        this.f4053k = this.f4212z.getMeasuredHeight();
        if (m16645k > 0) {
            this.f4054l = m16645k;
        }
        if (m16637c > 0) {
            this.f4053k = m16637c;
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.f4054l, this.f4053k);
        C3489yj c3489yj = this.f4193A;
        if (c3489yj.f14144A == null && c3489yj.f14146B == null && c3489yj.f14148C == null && c3489yj.f14150D == null) {
            int i2 = this.f4198F;
            layoutParams2.setMargins(i2, i2, i2, i2);
        } else {
            layoutParams2.setMargins(this.f4193A.m16638d(this.f4199G.f4397c.width()), this.f4193A.m16643i(this.f4199G.f4397c.width()), this.f4193A.m16641g(this.f4199G.f4397c.width()), this.f4193A.m16632a(this.f4199G.f4397c.width()));
        }
        layoutParams2.gravity = 19;
        C0482bj c0482bj = this.f4193A.f14167L0;
        if (c0482bj != null) {
            layoutParams2.gravity = C0755x1.m6116a(c0482bj.m3411f(), this.f4193A.f14167L0.m3412g(), this.f4055m);
        }
        this.f4044b.addView(this.f4212z, layoutParams2);
    }

    /* renamed from: s */
    public void m4875s() {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this.f4045c, this.f4209Q, this.f4195C, this.f4194B, this.f4196D);
        if (this.f4193A.f14165K0 == 2 && Build.VERSION.SDK_INT >= 11) {
            datePickerDialog.getDatePicker().setSpinnersShown(false);
            datePickerDialog.getDatePicker().setCalendarViewShown(true);
        }
        datePickerDialog.setOnDismissListener(this.f4207O);
        datePickerDialog.setOnCancelListener(this.f4208P);
        datePickerDialog.show();
    }
}
