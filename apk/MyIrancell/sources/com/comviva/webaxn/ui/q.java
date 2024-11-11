package com.comviva.webaxn.ui;

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
import com.comviva.webaxn.utils.x1;
import com.mtni.myirancell.R;
import defpackage.aj;
import defpackage.bj;
import defpackage.dj;
import defpackage.ej;
import defpackage.q2;
import defpackage.vj;
import defpackage.yj;
import java.util.Calendar;

/* loaded from: classes.dex */
public class q extends n1 {
    yj A;
    private int B;
    private int C;
    private int D;
    private boolean E;
    private int F;
    private int G;
    private float H;
    private int I;
    private Spanned J;
    private String K;
    private boolean L;
    private o1 M;
    private View.OnClickListener N;
    private DialogInterface.OnDismissListener O;
    private DialogInterface.OnCancelListener P;
    private DatePickerDialog.OnDateSetListener Q;
    private EditText x;
    private ImageView y;
    private LinearLayout z;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            q.this.E = true;
            q qVar = q.this;
            qVar.g.b(qVar);
        }
    }

    /* loaded from: classes.dex */
    class b implements DialogInterface.OnDismissListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            q.this.E = false;
            q qVar = q.this;
            qVar.g.b(qVar);
        }
    }

    /* loaded from: classes.dex */
    class c implements DialogInterface.OnCancelListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            q.this.E = false;
            q qVar = q.this;
            qVar.g.b(qVar);
        }
    }

    /* loaded from: classes.dex */
    class d implements DatePickerDialog.OnDateSetListener {
        d() {
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            q.this.C = i;
            q.this.B = i2;
            q.this.D = i3;
            q.this.q();
            q qVar = q.this;
            qVar.g.b(qVar);
            q.this.E = false;
        }
    }

    /* loaded from: classes.dex */
    class e implements View.OnTouchListener {
        e() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            try {
                int action = motionEvent.getAction();
                if (action == 0) {
                    q.this.H = motionEvent.getRawY();
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                } else if (action == 1) {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                    if (Math.abs(motionEvent.getRawY() - q.this.H) <= q.this.k / 2) {
                        q.this.E = true;
                        q.this.g.b(q.this);
                    }
                }
            } catch (Exception unused) {
            }
            return true;
        }
    }

    public q(Context context, String str, yj yjVar, j0 j0Var, o1 o1Var) {
        super(context);
        this.E = true;
        this.F = 2;
        this.G = 4;
        this.H = 0.0f;
        this.I = -1;
        this.J = null;
        this.K = "";
        this.L = false;
        this.N = new a();
        this.O = new b();
        this.P = new c();
        this.Q = new d();
        this.A = yjVar;
        this.M = o1Var;
        this.F = (int) (this.F * com.comviva.webaxn.utils.b.a(this.c).a().a());
        this.G = (int) (this.G * com.comviva.webaxn.utils.b.a(this.c).a().a());
        ej ejVar = this.A.O0;
        if (ejVar != null) {
            ejVar.a(j0Var.f);
        }
        this.x = new EditText(context);
        LinearLayout linearLayout = new LinearLayout(this.c);
        this.z = linearLayout;
        vj vjVar = this.A.q1;
        if (vjVar != null) {
            q2.a(linearLayout, vjVar.a());
        }
        if (!TextUtils.isEmpty(this.A.r1)) {
            this.z.setContentDescription(this.A.r1);
        }
        this.z.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (this.m) {
            layoutParams.rightMargin = this.F;
            EditText editText = this.x;
            editText.setPadding(editText.getPaddingLeft(), this.x.getPaddingTop(), this.G, this.x.getPaddingBottom());
            this.z.addView(this.x, layoutParams);
            if (this.A.K0 != 1) {
                ImageView imageView = new ImageView(this.c);
                this.y = imageView;
                imageView.setImageResource(R.drawable.calendar);
                ImageView imageView2 = this.y;
                int i = this.F;
                imageView2.setPadding(i, i, i, i);
                this.z.addView(this.y);
            }
        } else {
            if (this.A.K0 != 1) {
                ImageView imageView3 = new ImageView(this.c);
                this.y = imageView3;
                imageView3.setImageResource(R.drawable.calendar);
                ImageView imageView4 = this.y;
                int i2 = this.F;
                imageView4.setPadding(i2, i2, i2, i2);
                this.z.addView(this.y);
            }
            layoutParams.leftMargin = this.F;
            EditText editText2 = this.x;
            editText2.setPadding(this.G, editText2.getPaddingTop(), this.x.getPaddingRight(), this.x.getPaddingBottom());
            this.z.addView(this.x, layoutParams);
        }
        bj bjVar = this.A.L0;
        this.z.setGravity(bjVar != null ? x1.a(bjVar.f(), this.A.L0.g(), this.m) : 19);
        b(this.A);
        if (yjVar.b) {
            this.z.setOnClickListener(this.N);
        } else {
            n1.a(this.z, this.A.d1);
            this.A.e1 = true;
        }
        this.x.setOnTouchListener(new e());
        Calendar calendar = Calendar.getInstance();
        this.C = calendar.get(1);
        this.B = calendar.get(2);
        this.D = calendar.get(5);
        String h = TextUtils.isEmpty(yjVar.Q) ? aj.a(this.c).h(this.A.V) : aj.a(this.c).h(this.A.Q);
        h = TextUtils.isEmpty(h) ? aj.a(this.c).g(this.A.V) : h;
        if (TextUtils.isEmpty(h) && !TextUtils.isEmpty(this.A.n)) {
            h = this.A.n;
        }
        this.K = h;
        b(h);
        yj yjVar2 = this.A;
        if (yjVar2.K0 == 1 && !TextUtils.isEmpty(yjVar2.o)) {
            this.x.setHint(this.A.o);
            if (this.A.b()) {
                this.x.setHintTextColor(this.A.a());
            }
            if (TextUtils.isEmpty(h)) {
                return;
            }
        }
        q();
    }

    public void a(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.x.setLetterSpacing(f);
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(int i) {
        super.a(i);
        yj yjVar = this.A;
        ej ejVar = yjVar.O0;
        if (ejVar != null) {
            Drawable a2 = x1.a(ejVar, this.d);
            this.e = a2;
            this.x.setBackgroundDrawable(a2);
        } else if (yjVar.p.j()) {
            this.x.setBackgroundColor(i);
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(AbsoluteLayout.LayoutParams layoutParams) {
        ((AbsoluteLayout.LayoutParams) this.z.getLayoutParams()).x = layoutParams.x;
        ((AbsoluteLayout.LayoutParams) this.z.getLayoutParams()).y = layoutParams.y;
        if (layoutParams.width > 0) {
            ((AbsoluteLayout.LayoutParams) this.z.getLayoutParams()).width = layoutParams.width;
        }
        if (layoutParams.height > 0) {
            ((AbsoluteLayout.LayoutParams) this.z.getLayoutParams()).height = layoutParams.height;
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(p0 p0Var) {
        this.z.setPadding(p0Var.a, p0Var.b, p0Var.c, p0Var.d);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void a(yj yjVar) {
        this.z.setMinimumWidth(com.comviva.webaxn.utils.b.a(this.c).a().d() / 3);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.z.measure(makeMeasureSpec, makeMeasureSpec);
        this.l = this.z.getMeasuredWidth();
        this.k = this.z.getMeasuredHeight();
        if (yjVar != null) {
            if (yjVar.v0 == null && yjVar.r0 == null) {
                return;
            }
            a(yjVar.v0);
        }
    }

    public void a(byte[] bArr) {
        int identifier = !TextUtils.isEmpty(this.A.r0) ? this.c.getResources().getIdentifier(this.A.r0, "drawable", this.c.getPackageName()) : 0;
        try {
            if (identifier > 0) {
                Bitmap a2 = com.comviva.webaxn.utils.e1.b(this.c).a(this.A.r0);
                if (a2 == null && (a2 = BitmapFactory.decodeResource(this.c.getResources(), identifier)) != null) {
                    com.comviva.webaxn.utils.e1.b(this.c).a(this.A.r0, a2);
                }
                this.e = NinePatch.isNinePatchChunk(a2.getNinePatchChunk()) ? new NinePatchDrawable(a2, a2.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(a2);
                this.z.setBackgroundDrawable(this.e);
                return;
            }
            if (bArr != null) {
                Bitmap a3 = com.comviva.webaxn.utils.e1.b(this.c).a(this.A.O);
                if (a3 == null && (a3 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                    com.comviva.webaxn.utils.e1.b(this.c).a(this.A.O, a3);
                }
                this.e = NinePatch.isNinePatchChunk(a3.getNinePatchChunk()) ? new NinePatchDrawable(a3, a3.getNinePatchChunk(), new Rect(), null) : new BitmapDrawable(a3);
                this.z.setBackgroundDrawable(this.e);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        } catch (OutOfMemoryError e3) {
            e3.printStackTrace();
        }
    }

    public void b(float f) {
        this.x.setTextSize(f);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b(int i) {
        super.b(i);
        this.x.setTextColor(i);
    }

    @Override // com.comviva.webaxn.ui.n1
    public void b(AbsoluteLayout.LayoutParams layoutParams) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.z.measure(makeMeasureSpec, makeMeasureSpec);
        int i = layoutParams.width;
        if (i <= 0) {
            i = this.z.getMeasuredWidth();
        }
        this.l = i;
        int i2 = layoutParams.height;
        if (i2 <= 0) {
            i2 = this.z.getMeasuredHeight();
        }
        this.k = i2;
        this.z.getLayoutParams().width = this.l;
        this.z.getLayoutParams().height = this.k;
    }

    public void b(String str) {
        String str2;
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.A.d0)) {
                return;
            }
            if (this.A.d0.equalsIgnoreCase("MM/DD/YYYY")) {
                String[] split = str.split("/");
                this.D = Integer.parseInt(split[1]);
                this.B = Integer.parseInt(split[0]) - 1;
                str2 = split[2];
            } else if (this.A.d0.equalsIgnoreCase("DD/MM/YY")) {
                String[] split2 = str.split("/");
                this.D = Integer.parseInt(split2[0]);
                this.B = Integer.parseInt(split2[1]) - 1;
                str2 = "20" + split2[2];
            } else if (this.A.d0.equalsIgnoreCase("MM/DD/YY")) {
                String[] split3 = str.split("/");
                this.D = Integer.parseInt(split3[1]);
                this.B = Integer.parseInt(split3[0]) - 1;
                str2 = "20" + split3[2];
            } else if (this.A.d0.equalsIgnoreCase("MM/YYYY")) {
                String[] split4 = str.split("/");
                this.B = Integer.parseInt(split4[0]) - 1;
                str2 = split4[1];
            } else if (this.A.d0.equalsIgnoreCase("MM/YY")) {
                String[] split5 = str.split("/");
                this.B = Integer.parseInt(split5[0]) - 1;
                str2 = "20" + split5[1];
            } else if (this.A.d0.equalsIgnoreCase("MMYY")) {
                this.B = Integer.parseInt(str.substring(0, 1)) - 1;
                str2 = "20" + str.substring(2, str.length());
            } else if (this.A.d0.equalsIgnoreCase("DDMMYYYY")) {
                this.D = Integer.parseInt(str.substring(0, 1));
                this.B = Integer.parseInt(str.substring(2, 3)) - 1;
                str2 = "20" + str.substring(4, str.length());
            } else if (this.A.d0.equalsIgnoreCase("DD.MM.YYYY")) {
                String[] split6 = str.split(".");
                this.D = Integer.parseInt(split6[0]);
                this.B = Integer.parseInt(split6[1]) - 1;
                str2 = split6[2];
            } else if (this.A.d0.equalsIgnoreCase("DD-MM-YYYY")) {
                String[] split7 = str.split("-");
                this.D = Integer.parseInt(split7[0]);
                this.B = Integer.parseInt(split7[1]) - 1;
                str2 = split7[2];
            } else {
                if (this.A.d0.equalsIgnoreCase("YYYY-MM-DD")) {
                    String[] split8 = str.split("-");
                    this.C = Integer.parseInt(split8[0]);
                    this.B = Integer.parseInt(split8[1]) - 1;
                    this.D = Integer.parseInt(split8[2]);
                    return;
                }
                if (!this.A.d0.equalsIgnoreCase("DDs MMM YYYY") && !this.A.d0.equalsIgnoreCase("DDs MMMM YYYY")) {
                    if (!this.A.d0.equalsIgnoreCase("DD MMM YYYY") && !this.A.d0.equalsIgnoreCase("DD MMMM YYYY")) {
                        if (this.A.d0.equalsIgnoreCase("DD MM YYYY")) {
                            String[] split9 = str.split(" ");
                            this.D = Integer.parseInt(split9[0]);
                            this.B = Integer.parseInt(split9[1]) - 1;
                            str2 = split9[2];
                        } else {
                            if (this.A.d0.equalsIgnoreCase("MM-YY")) {
                                String[] split10 = str.split("-");
                                this.B = Integer.parseInt(split10[0]) - 1;
                                Integer.parseInt("20" + split10[1]);
                                return;
                            }
                            if (this.A.d0.equalsIgnoreCase("MM-YYYY")) {
                                String[] split11 = str.split("-");
                                this.B = Integer.parseInt(split11[0]) - 1;
                                str2 = split11[1];
                            } else if (this.A.d0.equalsIgnoreCase("MMM-YYYY")) {
                                String[] split12 = str.split("-");
                                this.B = x1.h(split12[0]);
                                str2 = split12[1];
                            } else if (this.A.d0.equalsIgnoreCase("MMM/YYYY")) {
                                String[] split13 = str.split("/");
                                this.B = x1.h(split13[0]);
                                str2 = split13[1];
                            } else {
                                String[] split14 = str.split("/");
                                this.D = Integer.parseInt(split14[0]);
                                this.B = Integer.parseInt(split14[1]) - 1;
                                str2 = split14[2];
                            }
                        }
                    }
                    String[] split15 = str.split(" ");
                    this.D = Integer.parseInt(split15[0]);
                    this.B = x1.h(split15[1]);
                    str2 = split15[2];
                }
                String[] split16 = str.split(" ");
                this.D = x1.d(split16[0]);
                this.B = x1.h(split16[1]);
                str2 = split16[2];
            }
            this.C = Integer.parseInt(str2);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(defpackage.yj r5) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.q.b(yj):void");
    }

    public int c(AbsoluteLayout.LayoutParams layoutParams) {
        this.l = layoutParams.width;
        this.k = layoutParams.height;
        this.z.setLayoutParams(new AbsoluteLayout.LayoutParams(this.l, this.k, layoutParams.x, layoutParams.y));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.z.measure(makeMeasureSpec, makeMeasureSpec);
        if (layoutParams.width <= 0) {
            this.l = this.z.getMeasuredWidth();
        }
        int measuredHeight = this.z.getMeasuredHeight();
        this.k = measuredHeight;
        return measuredHeight;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void c() {
        this.A.b = false;
        this.z.setOnClickListener(null);
        this.z.setClickable(false);
        this.z.setFocusable(false);
        yj yjVar = this.A;
        if (yjVar.e1) {
            n1.a(this.z, yjVar.d1);
        }
    }

    public void c(yj yjVar) {
        this.A = yjVar;
    }

    @Override // com.comviva.webaxn.ui.n1
    public void d() {
        this.A.b = true;
        this.z.setOnClickListener(this.N);
        this.z.setClickable(true);
        this.z.setFocusable(true);
        if (this.A.e1) {
            n1.a(this.z, n1.r);
            this.A.e1 = false;
        }
    }

    @Override // com.comviva.webaxn.ui.n1
    public yj f() {
        return this.A;
    }

    public void g(int i) {
        this.x.setTypeface(this.A.p.h(), n1.e(i));
    }

    @Override // com.comviva.webaxn.ui.n1
    public View h() {
        return this.z;
    }

    @Override // com.comviva.webaxn.ui.n1
    public int i() {
        return this.k;
    }

    @Override // com.comviva.webaxn.ui.n1
    public int j() {
        return this.l;
    }

    public String m() {
        StringBuilder sb;
        String format;
        Spanned a2;
        try {
            if (TextUtils.isEmpty(this.A.d0)) {
                return String.format("%02d/%02d/%4d  ", Integer.valueOf(this.D), Integer.valueOf(this.B + 1), Integer.valueOf(this.C));
            }
            if (this.A.d0.equalsIgnoreCase("MM/DD/YYYY")) {
                return String.format("%02d/%02d/%4d", Integer.valueOf(this.B + 1), Integer.valueOf(this.D), Integer.valueOf(this.C));
            }
            if (this.A.d0.equalsIgnoreCase("DD/MM/YY")) {
                String valueOf = String.valueOf(this.C);
                return String.format("%02d/%02d/%2d", Integer.valueOf(this.D), Integer.valueOf(this.B + 1), Integer.valueOf(Integer.parseInt(valueOf.substring(2, valueOf.length()))));
            }
            if (this.A.d0.equalsIgnoreCase("MM/DD/YY")) {
                String valueOf2 = String.valueOf(this.C);
                return String.format("%02d/%02d/%2d", Integer.valueOf(this.B + 1), Integer.valueOf(this.D), Integer.valueOf(Integer.parseInt(valueOf2.substring(2, valueOf2.length()))));
            }
            if (this.A.d0.equalsIgnoreCase("MM/YYYY")) {
                return String.format("%02d/%4d", Integer.valueOf(this.B + 1), Integer.valueOf(this.C));
            }
            if (this.A.d0.equalsIgnoreCase("MM/YY")) {
                String valueOf3 = String.valueOf(this.C);
                return String.format("%02d/%2d", Integer.valueOf(this.B + 1), Integer.valueOf(Integer.parseInt(valueOf3.substring(2, valueOf3.length()))));
            }
            if (this.A.d0.equalsIgnoreCase("MMYY")) {
                String valueOf4 = String.valueOf(this.C);
                return String.format("%02d%2d", Integer.valueOf(this.B + 1), Integer.valueOf(Integer.parseInt(valueOf4.substring(2, valueOf4.length()))));
            }
            if (this.A.d0.equalsIgnoreCase("DDMMYYYY")) {
                return String.format("%02d%02d%4d", Integer.valueOf(this.D), Integer.valueOf(this.B + 1), Integer.valueOf(this.C));
            }
            if (this.A.d0.equalsIgnoreCase("DD.MM.YYYY")) {
                return String.format("%02d.%02d.%4d", Integer.valueOf(this.D), Integer.valueOf(this.B + 1), Integer.valueOf(this.C));
            }
            if (this.A.d0.equalsIgnoreCase("DD-MM-YYYY")) {
                return String.format("%02d-%02d-%4d", Integer.valueOf(this.D), Integer.valueOf(this.B + 1), Integer.valueOf(this.C));
            }
            if (this.A.d0.equalsIgnoreCase("YYYY-MM-DD")) {
                return String.format("%4d-%02d-%02d", Integer.valueOf(this.C), Integer.valueOf(this.B + 1), Integer.valueOf(this.D));
            }
            if (this.A.d0.equalsIgnoreCase("DDs MMM YYYY")) {
                this.I = 2;
                a2 = x1.a(this.D, this.B + 1, this.C, 2, " ");
            } else {
                if (!this.A.d0.equalsIgnoreCase("DDs MMMM YYYY")) {
                    if (this.A.d0.equalsIgnoreCase("DD MMM YYYY")) {
                        sb = new StringBuilder();
                        sb.append(String.format("%02d", Integer.valueOf(this.D)));
                        sb.append(" ");
                        sb.append(x1.a(this.B + 1, 0));
                        sb.append(" ");
                        format = String.format("%02d", Integer.valueOf(this.C));
                    } else if (this.A.d0.equalsIgnoreCase("DD MMMM YYYY")) {
                        sb = new StringBuilder();
                        sb.append(String.format("%02d", Integer.valueOf(this.D)));
                        sb.append(" ");
                        sb.append(x1.a(this.B + 1, 1));
                        sb.append(" ");
                        format = String.format("%02d", Integer.valueOf(this.C));
                    } else {
                        if (this.A.d0.equalsIgnoreCase("DD MM YYYY")) {
                            return String.format("%02d %02d %4d", Integer.valueOf(this.D), Integer.valueOf(this.B + 1), Integer.valueOf(this.C));
                        }
                        if (this.A.d0.equalsIgnoreCase("MM-YY")) {
                            String valueOf5 = String.valueOf(this.C);
                            return String.format("%02d-%2d", Integer.valueOf(this.B + 1), Integer.valueOf(Integer.parseInt(valueOf5.substring(2, valueOf5.length()))));
                        }
                        if (this.A.d0.equalsIgnoreCase("MM-YYYY")) {
                            return String.format("%02d-%4d", Integer.valueOf(this.B + 1), Integer.valueOf(this.C));
                        }
                        if (this.A.d0.equalsIgnoreCase("MMM-YYYY")) {
                            sb = new StringBuilder();
                            sb.append(x1.a(this.B + 1, 0));
                            sb.append("-");
                            format = String.format("%04d", Integer.valueOf(this.C));
                        } else {
                            if (!this.A.d0.equalsIgnoreCase("MMM/YYYY")) {
                                return String.format("%02d/%02d/%4d", Integer.valueOf(this.D), Integer.valueOf(this.B + 1), Integer.valueOf(this.C));
                            }
                            sb = new StringBuilder();
                            sb.append(x1.a(this.B + 1, 0));
                            sb.append("/");
                            format = String.format("%04d", Integer.valueOf(this.C));
                        }
                    }
                    sb.append(format);
                    return sb.toString();
                }
                this.I = 3;
                a2 = x1.a(this.D, this.B + 1, this.C, 3, " ");
            }
            this.J = a2;
            return a2.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public String n() {
        String obj = this.x.getText().toString();
        return obj != null ? obj.trim() : obj;
    }

    public boolean o() {
        return this.E;
    }

    public void p() {
        dj djVar = this.A.J0;
        if (djVar != null) {
            n1.a(djVar, h());
        }
    }

    public void q() {
        String m = m();
        if (this.g != null && !this.L && !TextUtils.isEmpty(this.A.f1) && !m.equals(this.K)) {
            if (this.M.j().equals("VALIDATE")) {
                this.g.a(true, this.A);
            } else {
                o1 o1Var = this.M;
                yj yjVar = this.A;
                if (o1Var.b(yjVar.f1, yjVar.V)) {
                    x1.p pVar = this.g;
                    yj yjVar2 = this.A;
                    pVar.a(yjVar2.f1, yjVar2);
                }
            }
            this.L = true;
        }
        if (this.L && m.equals(this.K)) {
            if (this.M.j().equals("VALIDATE")) {
                this.g.a(false, this.A);
            } else {
                o1 o1Var2 = this.M;
                yj yjVar3 = this.A;
                if (o1Var2.a(yjVar3.f1, yjVar3.V)) {
                    x1.p pVar2 = this.g;
                    yj yjVar4 = this.A;
                    pVar2.a(yjVar4.g1, yjVar4);
                }
            }
            this.L = false;
        }
        this.x.setText(m);
    }

    public void r() {
        if (this.b != null) {
            int d2 = com.comviva.webaxn.utils.b.a(this.c).a().d() / 3;
            com.comviva.webaxn.utils.u uVar = this.A.p;
            if (uVar != null && uVar.k()) {
                b(n1.d(this.A.p.c()));
            }
            this.b.addView(this.z);
            this.b.invalidate();
        }
    }

    public void s() {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this.c, this.Q, this.C, this.B, this.D);
        if (this.A.K0 == 2 && Build.VERSION.SDK_INT >= 11) {
            datePickerDialog.getDatePicker().setSpinnersShown(false);
            datePickerDialog.getDatePicker().setCalendarViewShown(true);
        }
        datePickerDialog.setOnDismissListener(this.O);
        datePickerDialog.setOnCancelListener(this.P);
        datePickerDialog.show();
    }
}
