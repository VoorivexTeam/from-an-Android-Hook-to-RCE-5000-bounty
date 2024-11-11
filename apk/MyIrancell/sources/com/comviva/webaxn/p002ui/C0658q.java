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
import android.widget.AbsoluteLayout;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.comviva.webaxn.utils.C0687b;
import com.comviva.webaxn.utils.C0698e1;
import com.comviva.webaxn.utils.C0744u;
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

/* renamed from: com.comviva.webaxn.ui.q */
/* loaded from: classes.dex */
public class C0658q extends AbstractC0652n1 {

    /* renamed from: A */
    C3489yj f4222A;

    /* renamed from: B */
    private int f4223B;

    /* renamed from: C */
    private int f4224C;

    /* renamed from: D */
    private int f4225D;

    /* renamed from: E */
    private boolean f4226E;

    /* renamed from: F */
    private int f4227F;

    /* renamed from: G */
    private int f4228G;

    /* renamed from: H */
    private float f4229H;

    /* renamed from: I */
    private int f4230I;

    /* renamed from: J */
    private Spanned f4231J;

    /* renamed from: K */
    private String f4232K;

    /* renamed from: L */
    private boolean f4233L;

    /* renamed from: M */
    private C0655o1 f4234M;

    /* renamed from: N */
    private View.OnClickListener f4235N;

    /* renamed from: O */
    private DialogInterface.OnDismissListener f4236O;

    /* renamed from: P */
    private DialogInterface.OnCancelListener f4237P;

    /* renamed from: Q */
    private DatePickerDialog.OnDateSetListener f4238Q;

    /* renamed from: x */
    private EditText f4239x;

    /* renamed from: y */
    private ImageView f4240y;

    /* renamed from: z */
    private LinearLayout f4241z;

    /* renamed from: com.comviva.webaxn.ui.q$a */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0658q.this.f4226E = true;
            C0658q c0658q = C0658q.this;
            c0658q.f4049g.mo4849b(c0658q);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.q$b */
    /* loaded from: classes.dex */
    class b implements DialogInterface.OnDismissListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            C0658q.this.f4226E = false;
            C0658q c0658q = C0658q.this;
            c0658q.f4049g.mo4849b(c0658q);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.q$c */
    /* loaded from: classes.dex */
    class c implements DialogInterface.OnCancelListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            C0658q.this.f4226E = false;
            C0658q c0658q = C0658q.this;
            c0658q.f4049g.mo4849b(c0658q);
        }
    }

    /* renamed from: com.comviva.webaxn.ui.q$d */
    /* loaded from: classes.dex */
    class d implements DatePickerDialog.OnDateSetListener {
        d() {
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            C0658q.this.f4224C = i;
            C0658q.this.f4223B = i2;
            C0658q.this.f4225D = i3;
            C0658q.this.m4894q();
            C0658q c0658q = C0658q.this;
            c0658q.f4049g.mo4849b(c0658q);
            C0658q.this.f4226E = false;
        }
    }

    /* renamed from: com.comviva.webaxn.ui.q$e */
    /* loaded from: classes.dex */
    class e implements View.OnTouchListener {
        e() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            try {
                int action = motionEvent.getAction();
                if (action == 0) {
                    C0658q.this.f4229H = motionEvent.getRawY();
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                } else if (action == 1) {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                    if (Math.abs(motionEvent.getRawY() - C0658q.this.f4229H) <= C0658q.this.f4053k / 2) {
                        C0658q.this.f4226E = true;
                        C0658q.this.f4049g.mo4849b(C0658q.this);
                    }
                }
            } catch (Exception unused) {
            }
            return true;
        }
    }

    public C0658q(Context context, String str, C3489yj c3489yj, C0639j0 c0639j0, C0655o1 c0655o1) {
        super(context);
        this.f4226E = true;
        this.f4227F = 2;
        this.f4228G = 4;
        this.f4229H = 0.0f;
        this.f4230I = -1;
        this.f4231J = null;
        this.f4232K = "";
        this.f4233L = false;
        this.f4235N = new a();
        this.f4236O = new b();
        this.f4237P = new c();
        this.f4238Q = new d();
        this.f4222A = c3489yj;
        this.f4234M = c0655o1;
        this.f4227F = (int) (this.f4227F * C0687b.m5342a(this.f4045c).m5343a().m5544a());
        this.f4228G = (int) (this.f4228G * C0687b.m5342a(this.f4045c).m5343a().m5544a());
        C2434ej c2434ej = this.f4222A.f14173O0;
        if (c2434ej != null) {
            c2434ej.m11615a(c0639j0.f3869f);
        }
        this.f4239x = new EditText(context);
        LinearLayout linearLayout = new LinearLayout(this.f4045c);
        this.f4241z = linearLayout;
        C3361vj c3361vj = this.f4222A.f14246q1;
        if (c3361vj != null) {
            C3107q2.m14884a(linearLayout, c3361vj.m16034a());
        }
        if (!TextUtils.isEmpty(this.f4222A.f14249r1)) {
            this.f4241z.setContentDescription(this.f4222A.f14249r1);
        }
        this.f4241z.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (this.f4055m) {
            layoutParams.rightMargin = this.f4227F;
            EditText editText = this.f4239x;
            editText.setPadding(editText.getPaddingLeft(), this.f4239x.getPaddingTop(), this.f4228G, this.f4239x.getPaddingBottom());
            this.f4241z.addView(this.f4239x, layoutParams);
            if (this.f4222A.f14165K0 != 1) {
                ImageView imageView = new ImageView(this.f4045c);
                this.f4240y = imageView;
                imageView.setImageResource(R.drawable.calendar);
                ImageView imageView2 = this.f4240y;
                int i = this.f4227F;
                imageView2.setPadding(i, i, i, i);
                this.f4241z.addView(this.f4240y);
            }
        } else {
            if (this.f4222A.f14165K0 != 1) {
                ImageView imageView3 = new ImageView(this.f4045c);
                this.f4240y = imageView3;
                imageView3.setImageResource(R.drawable.calendar);
                ImageView imageView4 = this.f4240y;
                int i2 = this.f4227F;
                imageView4.setPadding(i2, i2, i2, i2);
                this.f4241z.addView(this.f4240y);
            }
            layoutParams.leftMargin = this.f4227F;
            EditText editText2 = this.f4239x;
            editText2.setPadding(this.f4228G, editText2.getPaddingTop(), this.f4239x.getPaddingRight(), this.f4239x.getPaddingBottom());
            this.f4241z.addView(this.f4239x, layoutParams);
        }
        C0482bj c0482bj = this.f4222A.f14167L0;
        this.f4241z.setGravity(c0482bj != null ? C0755x1.m6116a(c0482bj.m3411f(), this.f4222A.f14167L0.m3412g(), this.f4055m) : 19);
        m4886b(this.f4222A);
        if (c3489yj.f14199b) {
            this.f4241z.setOnClickListener(this.f4235N);
        } else {
            AbstractC0652n1.m4697a(this.f4241z, this.f4222A.f14207d1);
            this.f4222A.f14210e1 = true;
        }
        this.f4239x.setOnTouchListener(new e());
        Calendar calendar = Calendar.getInstance();
        this.f4224C = calendar.get(1);
        this.f4223B = calendar.get(2);
        this.f4225D = calendar.get(5);
        String m200h = TextUtils.isEmpty(c3489yj.f14176Q) ? C0023aj.m160a(this.f4045c).m200h(this.f4222A.f14186V) : C0023aj.m160a(this.f4045c).m200h(this.f4222A.f14176Q);
        m200h = TextUtils.isEmpty(m200h) ? C0023aj.m160a(this.f4045c).m197g(this.f4222A.f14186V) : m200h;
        if (TextUtils.isEmpty(m200h) && !TextUtils.isEmpty(this.f4222A.f14235n)) {
            m200h = this.f4222A.f14235n;
        }
        this.f4232K = m200h;
        m4885b(m200h);
        C3489yj c3489yj2 = this.f4222A;
        if (c3489yj2.f14165K0 == 1 && !TextUtils.isEmpty(c3489yj2.f14238o)) {
            this.f4239x.setHint(this.f4222A.f14238o);
            if (this.f4222A.m16636b()) {
                this.f4239x.setHintTextColor(this.f4222A.m16631a());
            }
            if (TextUtils.isEmpty(m200h)) {
                return;
            }
        }
        m4894q();
    }

    /* renamed from: a */
    public void m4882a(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f4239x.setLetterSpacing(f);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4314a(int i) {
        super.mo4314a(i);
        C3489yj c3489yj = this.f4222A;
        C2434ej c2434ej = c3489yj.f14173O0;
        if (c2434ej != null) {
            Drawable m6122a = C0755x1.m6122a(c2434ej, this.f4046d);
            this.f4047e = m6122a;
            this.f4239x.setBackgroundDrawable(m6122a);
        } else if (c3489yj.f14241p.m6071j()) {
            this.f4239x.setBackgroundColor(i);
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4139a(AbsoluteLayout.LayoutParams layoutParams) {
        ((AbsoluteLayout.LayoutParams) this.f4241z.getLayoutParams()).x = layoutParams.x;
        ((AbsoluteLayout.LayoutParams) this.f4241z.getLayoutParams()).y = layoutParams.y;
        if (layoutParams.width > 0) {
            ((AbsoluteLayout.LayoutParams) this.f4241z.getLayoutParams()).width = layoutParams.width;
        }
        if (layoutParams.height > 0) {
            ((AbsoluteLayout.LayoutParams) this.f4241z.getLayoutParams()).height = layoutParams.height;
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4201a(C0657p0 c0657p0) {
        this.f4241z.setPadding(c0657p0.f4218a, c0657p0.f4219b, c0657p0.f4220c, c0657p0.f4221d);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: a */
    public void mo4140a(C3489yj c3489yj) {
        this.f4241z.setMinimumWidth(C0687b.m5342a(this.f4045c).m5343a().m5552d() / 3);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f4241z.measure(makeMeasureSpec, makeMeasureSpec);
        this.f4054l = this.f4241z.getMeasuredWidth();
        this.f4053k = this.f4241z.getMeasuredHeight();
        if (c3489yj != null) {
            if (c3489yj.f14260v0 == null && c3489yj.f14248r0 == null) {
                return;
            }
            m4883a(c3489yj.f14260v0);
        }
    }

    /* renamed from: a */
    public void m4883a(byte[] bArr) {
        int identifier = !TextUtils.isEmpty(this.f4222A.f14248r0) ? this.f4045c.getResources().getIdentifier(this.f4222A.f14248r0, "drawable", this.f4045c.getPackageName()) : 0;
        try {
            if (identifier > 0) {
                Bitmap m5429a = C0698e1.m5426b(this.f4045c).m5429a(this.f4222A.f14248r0);
                if (m5429a == null && (m5429a = BitmapFactory.decodeResource(this.f4045c.getResources(), identifier)) != null) {
                    C0698e1.m5426b(this.f4045c).m5432a(this.f4222A.f14248r0, m5429a);
                }
                this.f4047e = NinePatch.isNinePatchChunk(m5429a.getNinePatchChunk()) ? new NinePatchDrawable(m5429a, m5429a.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a);
                this.f4241z.setBackgroundDrawable(this.f4047e);
                return;
            }
            if (bArr != null) {
                Bitmap m5429a2 = C0698e1.m5426b(this.f4045c).m5429a(this.f4222A.f14172O);
                if (m5429a2 == null && (m5429a2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                    C0698e1.m5426b(this.f4045c).m5432a(this.f4222A.f14172O, m5429a2);
                }
                this.f4047e = NinePatch.isNinePatchChunk(m5429a2.getNinePatchChunk()) ? new NinePatchDrawable(m5429a2, m5429a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(m5429a2);
                this.f4241z.setBackgroundDrawable(this.f4047e);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        } catch (OutOfMemoryError e3) {
            e3.printStackTrace();
        }
    }

    /* renamed from: b */
    public void m4884b(float f) {
        this.f4239x.setTextSize(f);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4176b(int i) {
        super.mo4176b(i);
        this.f4239x.setTextColor(i);
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: b */
    public void mo4143b(AbsoluteLayout.LayoutParams layoutParams) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f4241z.measure(makeMeasureSpec, makeMeasureSpec);
        int i = layoutParams.width;
        if (i <= 0) {
            i = this.f4241z.getMeasuredWidth();
        }
        this.f4054l = i;
        int i2 = layoutParams.height;
        if (i2 <= 0) {
            i2 = this.f4241z.getMeasuredHeight();
        }
        this.f4053k = i2;
        this.f4241z.getLayoutParams().width = this.f4054l;
        this.f4241z.getLayoutParams().height = this.f4053k;
    }

    /* renamed from: b */
    public void m4885b(String str) {
        String str2;
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.f4222A.f14206d0)) {
                return;
            }
            if (this.f4222A.f14206d0.equalsIgnoreCase("MM/DD/YYYY")) {
                String[] split = str.split("/");
                this.f4225D = Integer.parseInt(split[1]);
                this.f4223B = Integer.parseInt(split[0]) - 1;
                str2 = split[2];
            } else if (this.f4222A.f14206d0.equalsIgnoreCase("DD/MM/YY")) {
                String[] split2 = str.split("/");
                this.f4225D = Integer.parseInt(split2[0]);
                this.f4223B = Integer.parseInt(split2[1]) - 1;
                str2 = "20" + split2[2];
            } else if (this.f4222A.f14206d0.equalsIgnoreCase("MM/DD/YY")) {
                String[] split3 = str.split("/");
                this.f4225D = Integer.parseInt(split3[1]);
                this.f4223B = Integer.parseInt(split3[0]) - 1;
                str2 = "20" + split3[2];
            } else if (this.f4222A.f14206d0.equalsIgnoreCase("MM/YYYY")) {
                String[] split4 = str.split("/");
                this.f4223B = Integer.parseInt(split4[0]) - 1;
                str2 = split4[1];
            } else if (this.f4222A.f14206d0.equalsIgnoreCase("MM/YY")) {
                String[] split5 = str.split("/");
                this.f4223B = Integer.parseInt(split5[0]) - 1;
                str2 = "20" + split5[1];
            } else if (this.f4222A.f14206d0.equalsIgnoreCase("MMYY")) {
                this.f4223B = Integer.parseInt(str.substring(0, 1)) - 1;
                str2 = "20" + str.substring(2, str.length());
            } else if (this.f4222A.f14206d0.equalsIgnoreCase("DDMMYYYY")) {
                this.f4225D = Integer.parseInt(str.substring(0, 1));
                this.f4223B = Integer.parseInt(str.substring(2, 3)) - 1;
                str2 = "20" + str.substring(4, str.length());
            } else if (this.f4222A.f14206d0.equalsIgnoreCase("DD.MM.YYYY")) {
                String[] split6 = str.split(".");
                this.f4225D = Integer.parseInt(split6[0]);
                this.f4223B = Integer.parseInt(split6[1]) - 1;
                str2 = split6[2];
            } else if (this.f4222A.f14206d0.equalsIgnoreCase("DD-MM-YYYY")) {
                String[] split7 = str.split("-");
                this.f4225D = Integer.parseInt(split7[0]);
                this.f4223B = Integer.parseInt(split7[1]) - 1;
                str2 = split7[2];
            } else {
                if (this.f4222A.f14206d0.equalsIgnoreCase("YYYY-MM-DD")) {
                    String[] split8 = str.split("-");
                    this.f4224C = Integer.parseInt(split8[0]);
                    this.f4223B = Integer.parseInt(split8[1]) - 1;
                    this.f4225D = Integer.parseInt(split8[2]);
                    return;
                }
                if (!this.f4222A.f14206d0.equalsIgnoreCase("DDs MMM YYYY") && !this.f4222A.f14206d0.equalsIgnoreCase("DDs MMMM YYYY")) {
                    if (!this.f4222A.f14206d0.equalsIgnoreCase("DD MMM YYYY") && !this.f4222A.f14206d0.equalsIgnoreCase("DD MMMM YYYY")) {
                        if (this.f4222A.f14206d0.equalsIgnoreCase("DD MM YYYY")) {
                            String[] split9 = str.split(" ");
                            this.f4225D = Integer.parseInt(split9[0]);
                            this.f4223B = Integer.parseInt(split9[1]) - 1;
                            str2 = split9[2];
                        } else {
                            if (this.f4222A.f14206d0.equalsIgnoreCase("MM-YY")) {
                                String[] split10 = str.split("-");
                                this.f4223B = Integer.parseInt(split10[0]) - 1;
                                Integer.parseInt("20" + split10[1]);
                                return;
                            }
                            if (this.f4222A.f14206d0.equalsIgnoreCase("MM-YYYY")) {
                                String[] split11 = str.split("-");
                                this.f4223B = Integer.parseInt(split11[0]) - 1;
                                str2 = split11[1];
                            } else if (this.f4222A.f14206d0.equalsIgnoreCase("MMM-YYYY")) {
                                String[] split12 = str.split("-");
                                this.f4223B = C0755x1.m6191h(split12[0]);
                                str2 = split12[1];
                            } else if (this.f4222A.f14206d0.equalsIgnoreCase("MMM/YYYY")) {
                                String[] split13 = str.split("/");
                                this.f4223B = C0755x1.m6191h(split13[0]);
                                str2 = split13[1];
                            } else {
                                String[] split14 = str.split("/");
                                this.f4225D = Integer.parseInt(split14[0]);
                                this.f4223B = Integer.parseInt(split14[1]) - 1;
                                str2 = split14[2];
                            }
                        }
                    }
                    String[] split15 = str.split(" ");
                    this.f4225D = Integer.parseInt(split15[0]);
                    this.f4223B = C0755x1.m6191h(split15[1]);
                    str2 = split15[2];
                }
                String[] split16 = str.split(" ");
                this.f4225D = C0755x1.m6180d(split16[0]);
                this.f4223B = C0755x1.m6191h(split16[1]);
                str2 = split16[2];
            }
            this.f4224C = Integer.parseInt(str2);
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
    public void m4886b(p000.C3489yj r5) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0658q.m4886b(yj):void");
    }

    /* renamed from: c */
    public int m4887c(AbsoluteLayout.LayoutParams layoutParams) {
        this.f4054l = layoutParams.width;
        this.f4053k = layoutParams.height;
        this.f4241z.setLayoutParams(new AbsoluteLayout.LayoutParams(this.f4054l, this.f4053k, layoutParams.x, layoutParams.y));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f4241z.measure(makeMeasureSpec, makeMeasureSpec);
        if (layoutParams.width <= 0) {
            this.f4054l = this.f4241z.getMeasuredWidth();
        }
        int measuredHeight = this.f4241z.getMeasuredHeight();
        this.f4053k = measuredHeight;
        return measuredHeight;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: c */
    public void mo4146c() {
        this.f4222A.f14199b = false;
        this.f4241z.setOnClickListener(null);
        this.f4241z.setClickable(false);
        this.f4241z.setFocusable(false);
        C3489yj c3489yj = this.f4222A;
        if (c3489yj.f14210e1) {
            AbstractC0652n1.m4697a(this.f4241z, c3489yj.f14207d1);
        }
    }

    /* renamed from: c */
    public void m4888c(C3489yj c3489yj) {
        this.f4222A = c3489yj;
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: d */
    public void mo4147d() {
        this.f4222A.f14199b = true;
        this.f4241z.setOnClickListener(this.f4235N);
        this.f4241z.setClickable(true);
        this.f4241z.setFocusable(true);
        if (this.f4222A.f14210e1) {
            AbstractC0652n1.m4697a(this.f4241z, AbstractC0652n1.f4038r);
            this.f4222A.f14210e1 = false;
        }
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: f */
    public C3489yj mo4148f() {
        return this.f4222A;
    }

    /* renamed from: g */
    public void m4889g(int i) {
        this.f4239x.setTypeface(this.f4222A.f14241p.m6069h(), AbstractC0652n1.m4702e(i));
    }

    @Override // com.comviva.webaxn.p002ui.AbstractC0652n1
    /* renamed from: h */
    public View mo4150h() {
        return this.f4241z;
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

    /* renamed from: m */
    public String m4890m() {
        StringBuilder sb;
        String format;
        Spanned m6125a;
        try {
            if (TextUtils.isEmpty(this.f4222A.f14206d0)) {
                return String.format("%02d/%02d/%4d  ", Integer.valueOf(this.f4225D), Integer.valueOf(this.f4223B + 1), Integer.valueOf(this.f4224C));
            }
            if (this.f4222A.f14206d0.equalsIgnoreCase("MM/DD/YYYY")) {
                return String.format("%02d/%02d/%4d", Integer.valueOf(this.f4223B + 1), Integer.valueOf(this.f4225D), Integer.valueOf(this.f4224C));
            }
            if (this.f4222A.f14206d0.equalsIgnoreCase("DD/MM/YY")) {
                String valueOf = String.valueOf(this.f4224C);
                return String.format("%02d/%02d/%2d", Integer.valueOf(this.f4225D), Integer.valueOf(this.f4223B + 1), Integer.valueOf(Integer.parseInt(valueOf.substring(2, valueOf.length()))));
            }
            if (this.f4222A.f14206d0.equalsIgnoreCase("MM/DD/YY")) {
                String valueOf2 = String.valueOf(this.f4224C);
                return String.format("%02d/%02d/%2d", Integer.valueOf(this.f4223B + 1), Integer.valueOf(this.f4225D), Integer.valueOf(Integer.parseInt(valueOf2.substring(2, valueOf2.length()))));
            }
            if (this.f4222A.f14206d0.equalsIgnoreCase("MM/YYYY")) {
                return String.format("%02d/%4d", Integer.valueOf(this.f4223B + 1), Integer.valueOf(this.f4224C));
            }
            if (this.f4222A.f14206d0.equalsIgnoreCase("MM/YY")) {
                String valueOf3 = String.valueOf(this.f4224C);
                return String.format("%02d/%2d", Integer.valueOf(this.f4223B + 1), Integer.valueOf(Integer.parseInt(valueOf3.substring(2, valueOf3.length()))));
            }
            if (this.f4222A.f14206d0.equalsIgnoreCase("MMYY")) {
                String valueOf4 = String.valueOf(this.f4224C);
                return String.format("%02d%2d", Integer.valueOf(this.f4223B + 1), Integer.valueOf(Integer.parseInt(valueOf4.substring(2, valueOf4.length()))));
            }
            if (this.f4222A.f14206d0.equalsIgnoreCase("DDMMYYYY")) {
                return String.format("%02d%02d%4d", Integer.valueOf(this.f4225D), Integer.valueOf(this.f4223B + 1), Integer.valueOf(this.f4224C));
            }
            if (this.f4222A.f14206d0.equalsIgnoreCase("DD.MM.YYYY")) {
                return String.format("%02d.%02d.%4d", Integer.valueOf(this.f4225D), Integer.valueOf(this.f4223B + 1), Integer.valueOf(this.f4224C));
            }
            if (this.f4222A.f14206d0.equalsIgnoreCase("DD-MM-YYYY")) {
                return String.format("%02d-%02d-%4d", Integer.valueOf(this.f4225D), Integer.valueOf(this.f4223B + 1), Integer.valueOf(this.f4224C));
            }
            if (this.f4222A.f14206d0.equalsIgnoreCase("YYYY-MM-DD")) {
                return String.format("%4d-%02d-%02d", Integer.valueOf(this.f4224C), Integer.valueOf(this.f4223B + 1), Integer.valueOf(this.f4225D));
            }
            if (this.f4222A.f14206d0.equalsIgnoreCase("DDs MMM YYYY")) {
                this.f4230I = 2;
                m6125a = C0755x1.m6125a(this.f4225D, this.f4223B + 1, this.f4224C, 2, " ");
            } else {
                if (!this.f4222A.f14206d0.equalsIgnoreCase("DDs MMMM YYYY")) {
                    if (this.f4222A.f14206d0.equalsIgnoreCase("DD MMM YYYY")) {
                        sb = new StringBuilder();
                        sb.append(String.format("%02d", Integer.valueOf(this.f4225D)));
                        sb.append(" ");
                        sb.append(C0755x1.m6126a(this.f4223B + 1, 0));
                        sb.append(" ");
                        format = String.format("%02d", Integer.valueOf(this.f4224C));
                    } else if (this.f4222A.f14206d0.equalsIgnoreCase("DD MMMM YYYY")) {
                        sb = new StringBuilder();
                        sb.append(String.format("%02d", Integer.valueOf(this.f4225D)));
                        sb.append(" ");
                        sb.append(C0755x1.m6126a(this.f4223B + 1, 1));
                        sb.append(" ");
                        format = String.format("%02d", Integer.valueOf(this.f4224C));
                    } else {
                        if (this.f4222A.f14206d0.equalsIgnoreCase("DD MM YYYY")) {
                            return String.format("%02d %02d %4d", Integer.valueOf(this.f4225D), Integer.valueOf(this.f4223B + 1), Integer.valueOf(this.f4224C));
                        }
                        if (this.f4222A.f14206d0.equalsIgnoreCase("MM-YY")) {
                            String valueOf5 = String.valueOf(this.f4224C);
                            return String.format("%02d-%2d", Integer.valueOf(this.f4223B + 1), Integer.valueOf(Integer.parseInt(valueOf5.substring(2, valueOf5.length()))));
                        }
                        if (this.f4222A.f14206d0.equalsIgnoreCase("MM-YYYY")) {
                            return String.format("%02d-%4d", Integer.valueOf(this.f4223B + 1), Integer.valueOf(this.f4224C));
                        }
                        if (this.f4222A.f14206d0.equalsIgnoreCase("MMM-YYYY")) {
                            sb = new StringBuilder();
                            sb.append(C0755x1.m6126a(this.f4223B + 1, 0));
                            sb.append("-");
                            format = String.format("%04d", Integer.valueOf(this.f4224C));
                        } else {
                            if (!this.f4222A.f14206d0.equalsIgnoreCase("MMM/YYYY")) {
                                return String.format("%02d/%02d/%4d", Integer.valueOf(this.f4225D), Integer.valueOf(this.f4223B + 1), Integer.valueOf(this.f4224C));
                            }
                            sb = new StringBuilder();
                            sb.append(C0755x1.m6126a(this.f4223B + 1, 0));
                            sb.append("/");
                            format = String.format("%04d", Integer.valueOf(this.f4224C));
                        }
                    }
                    sb.append(format);
                    return sb.toString();
                }
                this.f4230I = 3;
                m6125a = C0755x1.m6125a(this.f4225D, this.f4223B + 1, this.f4224C, 3, " ");
            }
            this.f4231J = m6125a;
            return m6125a.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: n */
    public String m4891n() {
        String obj = this.f4239x.getText().toString();
        return obj != null ? obj.trim() : obj;
    }

    /* renamed from: o */
    public boolean m4892o() {
        return this.f4226E;
    }

    /* renamed from: p */
    public void m4893p() {
        C2391dj c2391dj = this.f4222A.f14163J0;
        if (c2391dj != null) {
            AbstractC0652n1.m4700a(c2391dj, mo4150h());
        }
    }

    /* renamed from: q */
    public void m4894q() {
        String m4890m = m4890m();
        if (this.f4049g != null && !this.f4233L && !TextUtils.isEmpty(this.f4222A.f14213f1) && !m4890m.equals(this.f4232K)) {
            if (this.f4234M.m4816j().equals("VALIDATE")) {
                this.f4049g.mo4847a(true, this.f4222A);
            } else {
                C0655o1 c0655o1 = this.f4234M;
                C3489yj c3489yj = this.f4222A;
                if (c0655o1.m4805b(c3489yj.f14213f1, c3489yj.f14186V)) {
                    C0755x1.p pVar = this.f4049g;
                    C3489yj c3489yj2 = this.f4222A;
                    pVar.mo4842a(c3489yj2.f14213f1, c3489yj2);
                }
            }
            this.f4233L = true;
        }
        if (this.f4233L && m4890m.equals(this.f4232K)) {
            if (this.f4234M.m4816j().equals("VALIDATE")) {
                this.f4049g.mo4847a(false, this.f4222A);
            } else {
                C0655o1 c0655o12 = this.f4234M;
                C3489yj c3489yj3 = this.f4222A;
                if (c0655o12.m4795a(c3489yj3.f14213f1, c3489yj3.f14186V)) {
                    C0755x1.p pVar2 = this.f4049g;
                    C3489yj c3489yj4 = this.f4222A;
                    pVar2.mo4842a(c3489yj4.f14216g1, c3489yj4);
                }
            }
            this.f4233L = false;
        }
        this.f4239x.setText(m4890m);
    }

    /* renamed from: r */
    public void m4895r() {
        if (this.f4044b != null) {
            int m5552d = C0687b.m5342a(this.f4045c).m5343a().m5552d() / 3;
            C0744u c0744u = this.f4222A.f14241p;
            if (c0744u != null && c0744u.m6072k()) {
                mo4176b(AbstractC0652n1.m4701d(this.f4222A.f14241p.m6062c()));
            }
            this.f4044b.addView(this.f4241z);
            this.f4044b.invalidate();
        }
    }

    /* renamed from: s */
    public void m4896s() {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this.f4045c, this.f4238Q, this.f4224C, this.f4223B, this.f4225D);
        if (this.f4222A.f14165K0 == 2 && Build.VERSION.SDK_INT >= 11) {
            datePickerDialog.getDatePicker().setSpinnersShown(false);
            datePickerDialog.getDatePicker().setCalendarViewShown(true);
        }
        datePickerDialog.setOnDismissListener(this.f4236O);
        datePickerDialog.setOnCancelListener(this.f4237P);
        datePickerDialog.show();
    }
}
