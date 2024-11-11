package com.comviva.webaxn.p002ui;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.comviva.webaxn.utils.C0696e;
import com.comviva.webaxn.utils.C0755x1;
import com.mtni.myirancell.R;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Vector;
import p000.C0023aj;
import p000.C2899lj;
import p000.C2945mj;
import p000.C3400wj;
import p000.C3440xj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.ui.o */
/* loaded from: classes.dex */
public class C0653o {

    /* renamed from: J */
    private static HashMap<String, String> f4063J;

    /* renamed from: K */
    private static C0653o f4064K;

    /* renamed from: L */
    public static C0655o1 f4065L;

    /* renamed from: M */
    public static C3400wj f4066M;

    /* renamed from: A */
    private C3489yj f4067A;

    /* renamed from: C */
    LinearLayout f4069C;

    /* renamed from: G */
    private String f4073G;

    /* renamed from: a */
    public View.OnClickListener f4076a;

    /* renamed from: b */
    public ImageView f4077b;

    /* renamed from: c */
    public ImageView f4078c;

    /* renamed from: d */
    public ImageView f4079d;

    /* renamed from: e */
    public ImageView f4080e;

    /* renamed from: f */
    public ImageView f4081f;

    /* renamed from: g */
    public ImageView f4082g;

    /* renamed from: h */
    public EditText f4083h;

    /* renamed from: i */
    public EditText f4084i;

    /* renamed from: j */
    public EditText f4085j;

    /* renamed from: k */
    public TextView f4086k;

    /* renamed from: l */
    public Calendar f4087l;

    /* renamed from: m */
    public Button f4088m;

    /* renamed from: n */
    public Button f4089n;

    /* renamed from: o */
    public Dialog f4090o;

    /* renamed from: p */
    private int f4091p;

    /* renamed from: q */
    private int f4092q;

    /* renamed from: r */
    private int f4093r;

    /* renamed from: s */
    public C3489yj f4094s;

    /* renamed from: t */
    public Context f4095t;

    /* renamed from: u */
    public String f4096u;

    /* renamed from: v */
    public DialogInterface.OnCancelListener f4097v;

    /* renamed from: w */
    private String f4098w;

    /* renamed from: x */
    private C0696e f4099x;

    /* renamed from: y */
    private C2945mj f4100y;

    /* renamed from: z */
    private C2899lj f4101z;

    /* renamed from: B */
    private int f4068B = 0;

    /* renamed from: D */
    boolean f4070D = false;

    /* renamed from: E */
    boolean f4071E = false;

    /* renamed from: F */
    boolean f4072F = false;

    /* renamed from: H */
    private int f4074H = -1;

    /* renamed from: I */
    private DatePickerDialog.OnDateSetListener f4075I = new a();

    /* renamed from: com.comviva.webaxn.ui.o$a */
    /* loaded from: classes.dex */
    class a implements DatePickerDialog.OnDateSetListener {
        a() {
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            C0653o.this.f4092q = i;
            C0653o.this.f4091p = i2;
            C0653o.this.f4093r = i3;
            C0653o.this.m4720a(true);
            C0653o.this.m4724c();
        }
    }

    /* renamed from: com.comviva.webaxn.ui.o$b */
    /* loaded from: classes.dex */
    public class b implements InputFilter {

        /* renamed from: b */
        private int f4103b;

        /* renamed from: c */
        private int f4104c;

        public b(C0653o c0653o, int i, int i2) {
            this.f4103b = i;
            this.f4104c = i2;
        }

        /* renamed from: a */
        private boolean m4729a(int i, int i2, int i3) {
            if (i2 > i) {
                if (i3 >= i && i3 <= i2) {
                    return true;
                }
            } else if (i3 >= i2 && i3 <= i) {
                return true;
            }
            return false;
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            StringBuilder sb;
            try {
                if (i3 == 0) {
                    sb = new StringBuilder();
                    sb.append(charSequence.toString());
                    sb.append(spanned.toString());
                } else {
                    sb = new StringBuilder();
                    sb.append(spanned.toString());
                    sb.append(charSequence.toString());
                }
                if (m4729a(this.f4103b, this.f4104c, Integer.parseInt(sb.toString()))) {
                    return null;
                }
                return "";
            } catch (NumberFormatException unused) {
                return "";
            }
        }
    }

    /* renamed from: com.comviva.webaxn.ui.o$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0653o c0653o = C0653o.this;
            int i = 5;
            if (view != c0653o.f4079d) {
                if (view != c0653o.f4080e) {
                    i = 2;
                    if (view != c0653o.f4077b) {
                        if (view != c0653o.f4078c) {
                            if (view == c0653o.f4081f) {
                                c0653o.m4728g();
                                C0653o.this.f4087l.roll(1, 1);
                            } else {
                                if (view != c0653o.f4082g) {
                                    if (view == c0653o.f4088m) {
                                        c0653o.m4722b();
                                        return;
                                    } else {
                                        if (view == c0653o.f4089n) {
                                            c0653o.m4720a(false);
                                            C0653o.this.m4722b();
                                            C0653o.this.m4724c();
                                            return;
                                        }
                                        return;
                                    }
                                }
                                c0653o.m4728g();
                                C0653o.this.f4087l.roll(1, -1);
                            }
                            C0653o.this.m4727f();
                        }
                    }
                }
                c0653o.m4728g();
                C0653o.this.f4087l.roll(i, -1);
                C0653o.this.m4727f();
            }
            c0653o.m4728g();
            C0653o.this.f4087l.roll(i, 1);
            C0653o.this.m4727f();
        }
    }

    /* renamed from: com.comviva.webaxn.ui.o$d */
    /* loaded from: classes.dex */
    public class d implements DialogInterface.OnCancelListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            C0653o.this.m4722b();
        }
    }

    /* renamed from: com.comviva.webaxn.ui.o$e */
    /* loaded from: classes.dex */
    public class e implements View.OnFocusChangeListener {
        public e(C0653o c0653o) {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (z) {
                EditText editText = (EditText) view;
                editText.setSelection(editText.getText().length());
            }
        }
    }

    private C0653o(Context context) {
        this.f4095t = context;
    }

    /* renamed from: a */
    public static C0653o m4711a(Context context) {
        if (f4064K == null) {
            f4064K = new C0653o(context);
        }
        return f4064K;
    }

    /* renamed from: a */
    private CharSequence m4712a(int i) {
        Calendar calendar;
        String str = i == 0 ? "Jan" : null;
        int i2 = 1;
        if (i == 1) {
            str = "Feb";
        }
        if (i == 2) {
            str = "Mar";
        }
        if (i == 3) {
            str = "Apr";
        }
        if (i == 4) {
            str = "May";
        }
        if (i == 5) {
            str = "Jun";
        }
        if (i == 6) {
            str = "Jul";
        }
        if (i == 7) {
            str = "Aug";
        }
        if (i == 8) {
            str = "Sept";
        }
        if (i == 9) {
            str = "Oct";
        }
        if (i == 10) {
            str = "Nov";
        }
        if (i == 11) {
            str = "Dec";
        }
        if (i == 12) {
            if (i == 0) {
                calendar = this.f4087l;
                i2 = -1;
            } else {
                calendar = this.f4087l;
            }
            calendar.roll(2, i2);
            m4727f();
        }
        return str;
    }

    /* renamed from: a */
    public String m4715a(String str) {
        StringBuilder sb;
        String format;
        try {
            if (TextUtils.isEmpty(str)) {
                return String.format("%02d/%02d/%4d  ", Integer.valueOf(this.f4093r), Integer.valueOf(this.f4091p + 1), Integer.valueOf(this.f4092q));
            }
            if (str.equalsIgnoreCase("MM/DD/YYYY")) {
                return String.format("%02d/%02d/%4d", Integer.valueOf(this.f4091p + 1), Integer.valueOf(this.f4093r), Integer.valueOf(this.f4092q));
            }
            if (str.equalsIgnoreCase("DD/MM/YY")) {
                String valueOf = String.valueOf(this.f4092q);
                return String.format("%02d/%02d/%2d", Integer.valueOf(this.f4093r), Integer.valueOf(this.f4091p + 1), Integer.valueOf(Integer.parseInt(valueOf.substring(2, valueOf.length()))));
            }
            if (str.equalsIgnoreCase("MM/DD/YY")) {
                String valueOf2 = String.valueOf(this.f4092q);
                return String.format("%02d/%02d/%2d", Integer.valueOf(this.f4091p + 1), Integer.valueOf(this.f4093r), Integer.valueOf(Integer.parseInt(valueOf2.substring(2, valueOf2.length()))));
            }
            if (str.equalsIgnoreCase("MM/YYYY")) {
                return String.format("%02d/%4d", Integer.valueOf(this.f4091p + 1), Integer.valueOf(this.f4092q));
            }
            if (str.equalsIgnoreCase("MM/YY")) {
                String valueOf3 = String.valueOf(this.f4092q);
                return String.format("%02d/%2d", Integer.valueOf(this.f4091p + 1), Integer.valueOf(Integer.parseInt(valueOf3.substring(2, valueOf3.length()))));
            }
            if (str.equalsIgnoreCase("MMYY")) {
                String valueOf4 = String.valueOf(this.f4092q);
                return String.format("%02d%2d", Integer.valueOf(this.f4091p + 1), Integer.valueOf(Integer.parseInt(valueOf4.substring(2, valueOf4.length()))));
            }
            if (str.equalsIgnoreCase("DDMMYYYY")) {
                return String.format("%02d%02d%4d", Integer.valueOf(this.f4093r), Integer.valueOf(this.f4091p + 1), Integer.valueOf(this.f4092q));
            }
            if (str.equalsIgnoreCase("DD.MM.YYYY")) {
                return String.format("%02d.%02d.%4d", Integer.valueOf(this.f4093r), Integer.valueOf(this.f4091p + 1), Integer.valueOf(this.f4092q));
            }
            if (str.equalsIgnoreCase("DD-MM-YYYY")) {
                return String.format("%02d-%02d-%4d", Integer.valueOf(this.f4093r), Integer.valueOf(this.f4091p + 1), Integer.valueOf(this.f4092q));
            }
            if (str.equalsIgnoreCase("YYYY-MM-DD")) {
                return String.format("%4d-%02d-%02d", Integer.valueOf(this.f4092q), Integer.valueOf(this.f4091p + 1), Integer.valueOf(this.f4093r));
            }
            if (!str.equalsIgnoreCase("DDs MMM YYYY") && !str.equalsIgnoreCase("DDs MMMM YYYY")) {
                if (str.equalsIgnoreCase("DD MMM YYYY")) {
                    sb = new StringBuilder();
                    sb.append(String.format("%02d", Integer.valueOf(this.f4093r)));
                    sb.append(" ");
                    sb.append(C0755x1.m6126a(this.f4091p + 1, 0));
                    sb.append(" ");
                    format = String.format("%04d", Integer.valueOf(this.f4092q));
                } else if (str.equalsIgnoreCase("DD MMMM YYYY")) {
                    sb = new StringBuilder();
                    sb.append(String.format("%02d", Integer.valueOf(this.f4093r)));
                    sb.append(" ");
                    sb.append(C0755x1.m6126a(this.f4091p + 1, 1));
                    sb.append(" ");
                    format = String.format("%04d", Integer.valueOf(this.f4092q));
                } else {
                    if (str.equalsIgnoreCase("DD MM YYYY")) {
                        return String.format("%02d %02d %4d", Integer.valueOf(this.f4093r), Integer.valueOf(this.f4091p + 1), Integer.valueOf(this.f4092q));
                    }
                    if (str.equalsIgnoreCase("MM-YY")) {
                        String valueOf5 = String.valueOf(this.f4092q);
                        return String.format("%02d-%2d", Integer.valueOf(this.f4091p + 1), Integer.valueOf(Integer.parseInt(valueOf5.substring(2, valueOf5.length()))));
                    }
                    if (str.equalsIgnoreCase("MM-YYYY")) {
                        return String.format("%02d-%4d", Integer.valueOf(this.f4091p + 1), Integer.valueOf(this.f4092q));
                    }
                    if (str.equalsIgnoreCase("MMM-YYYY")) {
                        sb = new StringBuilder();
                        sb.append(C0755x1.m6126a(this.f4091p + 1, 0));
                        sb.append("-");
                        format = String.format("%04d", Integer.valueOf(this.f4092q));
                    } else {
                        if (!str.equalsIgnoreCase("MMM/YYYY")) {
                            return String.format("%02d/%02d/%4d  ", Integer.valueOf(this.f4093r), Integer.valueOf(this.f4091p + 1), Integer.valueOf(this.f4092q));
                        }
                        sb = new StringBuilder();
                        sb.append(C0755x1.m6126a(this.f4091p + 1, 0));
                        sb.append("/");
                        format = String.format("%04d", Integer.valueOf(this.f4092q));
                    }
                }
                sb.append(format);
                return sb.toString();
            }
            return C0755x1.m6125a(this.f4093r, this.f4091p + 1, this.f4092q, this.f4074H, " ").toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public void m4716a() {
        if (f4064K != null) {
            f4064K = null;
        }
        HashMap<String, String> hashMap = f4063J;
        if (hashMap != null) {
            hashMap.clear();
            f4063J = null;
        }
        this.f4095t = null;
        f4066M = null;
        this.f4094s = null;
        this.f4099x = null;
        this.f4101z = null;
        this.f4100y = null;
        this.f4076a = null;
        this.f4097v = null;
    }

    /* renamed from: a */
    public void m4717a(String str, Spanned spanned) {
        AbstractC0652n1 abstractC0652n1;
        C0630g0 c0630g0;
        C3489yj c3489yj = this.f4067A;
        if (c3489yj == null || (abstractC0652n1 = c3489yj.f14197a0) == null) {
            if (this.f4101z.m13901f().f14519r != null) {
                if (TextUtils.isEmpty(str) && spanned != null) {
                    str = spanned.toString();
                }
                this.f4101z.m13901f().m16931a(this.f4098w, str);
                return;
            }
            return;
        }
        if (abstractC0652n1 instanceof C0668v) {
            C0668v c0668v = (C0668v) abstractC0652n1;
            if (!TextUtils.isEmpty(str)) {
                c0668v.m5029f(str);
            } else if (spanned != null) {
                c0668v.m5017a(spanned);
                str = spanned.toString();
            }
            if (!C0023aj.m160a(this.f4095t).m207j(this.f4098w)) {
                return;
            }
        } else {
            if (!(abstractC0652n1 instanceof C0670w)) {
                if ((abstractC0652n1 instanceof C0630g0) && c3489yj.f14191X0) {
                    c0630g0 = (C0630g0) abstractC0652n1;
                    if (TextUtils.isEmpty(str)) {
                        if (spanned == null) {
                            return;
                        }
                        this.f4067A.f14235n = spanned.toString();
                        c0630g0.m4363a(spanned);
                        return;
                    }
                    this.f4067A.f14235n = str;
                    c0630g0.m4368b(str);
                    return;
                }
                C3489yj c3489yj2 = this.f4067A;
                AbstractC0652n1 abstractC0652n12 = c3489yj2.f14197a0;
                if ((abstractC0652n12 instanceof C0633h0) && c3489yj2.f14191X0) {
                    c0630g0 = (C0633h0) abstractC0652n12;
                    if (TextUtils.isEmpty(str)) {
                        if (spanned == null) {
                            return;
                        }
                        this.f4067A.f14235n = spanned.toString();
                        c0630g0.m4363a(spanned);
                        return;
                    }
                    this.f4067A.f14235n = str;
                    c0630g0.m4368b(str);
                    return;
                }
                C3489yj c3489yj3 = this.f4067A;
                AbstractC0652n1 abstractC0652n13 = c3489yj3.f14197a0;
                if ((abstractC0652n13 instanceof C0636i0) && c3489yj3.f14191X0) {
                    C0636i0 c0636i0 = (C0636i0) abstractC0652n13;
                    if (!TextUtils.isEmpty(str)) {
                        this.f4067A.f14235n = str;
                        c0636i0.m4493c(str);
                        return;
                    } else {
                        if (spanned != null) {
                            this.f4067A.f14235n = spanned.toString();
                            c0636i0.m4482a(spanned);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            C0670w c0670w = (C0670w) abstractC0652n1;
            if (!TextUtils.isEmpty(str)) {
                c0670w.m5093h(str);
            } else if (spanned != null) {
                c0670w.m5075a(spanned);
                str = spanned.toString();
            }
            if (!C0023aj.m160a(this.f4095t).m207j(this.f4098w)) {
                return;
            }
        }
        C0023aj.m160a(this.f4095t).m202h(this.f4098w, str);
    }

    /* renamed from: a */
    public void m4718a(String str, C0655o1 c0655o1, C3400wj c3400wj, C2945mj c2945mj, C2899lj c2899lj, C3489yj c3489yj, C0696e c0696e) {
        f4065L = c0655o1;
        f4066M = c3400wj;
        this.f4100y = c2945mj;
        this.f4101z = c2899lj;
        this.f4094s = c3489yj;
        this.f4099x = c0696e;
        m4723b(str);
        if (this.f4068B == 1) {
            m4725d();
        } else {
            m4726e();
        }
    }

    /* renamed from: a */
    public void m4719a(String str, String str2) {
        String str3;
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            if (str2.equalsIgnoreCase("MM/DD/YYYY")) {
                String[] split = str.split("/");
                this.f4093r = Integer.parseInt(split[1]);
                this.f4091p = Integer.parseInt(split[0]) - 1;
                str3 = split[2];
            } else if (str2.equalsIgnoreCase("DD/MM/YY")) {
                String[] split2 = str.split("/");
                this.f4093r = Integer.parseInt(split2[0]);
                this.f4091p = Integer.parseInt(split2[1]) - 1;
                str3 = "20" + split2[2];
            } else if (str2.equalsIgnoreCase("MM/DD/YY")) {
                String[] split3 = str.split("/");
                this.f4093r = Integer.parseInt(split3[1]);
                this.f4091p = Integer.parseInt(split3[0]) - 1;
                str3 = "20" + split3[2];
            } else if (str2.equalsIgnoreCase("MM/YYYY")) {
                String[] split4 = str.split("/");
                this.f4091p = Integer.parseInt(split4[0]) - 1;
                str3 = split4[1];
            } else if (str2.equalsIgnoreCase("MM/YY")) {
                String[] split5 = str.split("/");
                this.f4091p = Integer.parseInt(split5[0]) - 1;
                str3 = "20" + split5[1];
            } else if (str2.equalsIgnoreCase("MMYY")) {
                this.f4091p = Integer.parseInt(str.substring(0, 1)) - 1;
                str3 = "20" + str.substring(2, str.length());
            } else if (str2.equalsIgnoreCase("DDMMYYYY")) {
                this.f4093r = Integer.parseInt(str.substring(0, 1));
                this.f4091p = Integer.parseInt(str.substring(2, 3)) - 1;
                str3 = "20" + str.substring(4, str.length());
            } else if (str2.equalsIgnoreCase("DD.MM.YYYY")) {
                String[] split6 = str.split(".");
                this.f4093r = Integer.parseInt(split6[0]);
                this.f4091p = Integer.parseInt(split6[1]) - 1;
                str3 = split6[2];
            } else if (str2.equalsIgnoreCase("DD-MM-YYYY")) {
                String[] split7 = str.split("-");
                this.f4093r = Integer.parseInt(split7[0]);
                this.f4091p = Integer.parseInt(split7[1]) - 1;
                str3 = split7[2];
            } else {
                if (str2.equalsIgnoreCase("YYYY-MM-DD")) {
                    String[] split8 = str.split("-");
                    this.f4092q = Integer.parseInt(split8[0]);
                    this.f4091p = Integer.parseInt(split8[1]) - 1;
                    this.f4093r = Integer.parseInt(split8[2]);
                    return;
                }
                if (!str2.equalsIgnoreCase("DDs MMM YYYY") && !str2.equalsIgnoreCase("DDs MMMM YYYY")) {
                    if (!str2.equalsIgnoreCase("DD MMM YYYY") && !str2.equalsIgnoreCase("DD MMMM YYYY")) {
                        if (str2.equalsIgnoreCase("DD MM YYYY")) {
                            String[] split9 = str.split(" ");
                            this.f4093r = Integer.parseInt(split9[0]);
                            this.f4091p = Integer.parseInt(split9[1]) - 1;
                            str3 = split9[2];
                        } else {
                            if (str2.equalsIgnoreCase("MM-YY")) {
                                String[] split10 = str.split("-");
                                this.f4091p = Integer.parseInt(split10[0]) - 1;
                                Integer.parseInt("20" + split10[1]);
                                return;
                            }
                            if (str2.equalsIgnoreCase("MM-YYYY")) {
                                String[] split11 = str.split("-");
                                this.f4091p = Integer.parseInt(split11[0]) - 1;
                                str3 = split11[1];
                            } else if (str2.equalsIgnoreCase("MMM-YYYY")) {
                                String[] split12 = str.split("-");
                                this.f4091p = C0755x1.m6191h(split12[0]);
                                str3 = split12[1];
                            } else if (str2.equalsIgnoreCase("MMM/YYYY")) {
                                String[] split13 = str.split("/");
                                this.f4091p = C0755x1.m6191h(split13[0]);
                                str3 = split13[1];
                            } else {
                                String[] split14 = str.split("/");
                                this.f4093r = Integer.parseInt(split14[0]);
                                this.f4091p = Integer.parseInt(split14[1]) - 1;
                                str3 = split14[2];
                            }
                        }
                    }
                    String[] split15 = str.split(" ");
                    this.f4093r = Integer.parseInt(split15[0]);
                    this.f4091p = C0755x1.m6191h(split15[1]);
                    str3 = split15[2];
                }
                String[] split16 = str.split(" ");
                this.f4093r = C0755x1.m6180d(split16[0]);
                this.f4091p = C0755x1.m6191h(split16[1]);
                str3 = split16[2];
            }
            this.f4092q = Integer.parseInt(str3);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0159, code lost:
    
        r12 = m4715a(r11.f4096u);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017b, code lost:
    
        r12 = m4715a(r11.f4096u);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0196, code lost:
    
        r12 = m4715a(r11.f4096u);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7 A[Catch: Exception -> 0x01a6, TRY_ENTER, TryCatch #0 {Exception -> 0x01a6, blocks: (B:3:0x0004, B:5:0x000a, B:6:0x004c, B:9:0x0067, B:10:0x006d, B:11:0x007f, B:13:0x0084, B:17:0x009a, B:20:0x00b7, B:22:0x00c5, B:24:0x00cb, B:26:0x00d1, B:27:0x00e6, B:28:0x00ec, B:30:0x00fa, B:32:0x0108, B:34:0x010e, B:36:0x0114, B:37:0x0129, B:38:0x012d, B:42:0x0138, B:44:0x013e, B:46:0x0151, B:47:0x0153, B:50:0x0144, B:52:0x014a, B:56:0x0159, B:57:0x015f, B:59:0x0163, B:62:0x0169, B:64:0x016f, B:67:0x0176, B:69:0x017b, B:71:0x0184, B:73:0x018a, B:76:0x0191, B:78:0x0196, B:80:0x019f, B:82:0x008b, B:83:0x0070, B:85:0x0078, B:86:0x0014), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fa A[Catch: Exception -> 0x01a6, TryCatch #0 {Exception -> 0x01a6, blocks: (B:3:0x0004, B:5:0x000a, B:6:0x004c, B:9:0x0067, B:10:0x006d, B:11:0x007f, B:13:0x0084, B:17:0x009a, B:20:0x00b7, B:22:0x00c5, B:24:0x00cb, B:26:0x00d1, B:27:0x00e6, B:28:0x00ec, B:30:0x00fa, B:32:0x0108, B:34:0x010e, B:36:0x0114, B:37:0x0129, B:38:0x012d, B:42:0x0138, B:44:0x013e, B:46:0x0151, B:47:0x0153, B:50:0x0144, B:52:0x014a, B:56:0x0159, B:57:0x015f, B:59:0x0163, B:62:0x0169, B:64:0x016f, B:67:0x0176, B:69:0x017b, B:71:0x0184, B:73:0x018a, B:76:0x0191, B:78:0x0196, B:80:0x019f, B:82:0x008b, B:83:0x0070, B:85:0x0078, B:86:0x0014), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0136 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0169 A[Catch: Exception -> 0x01a6, TryCatch #0 {Exception -> 0x01a6, blocks: (B:3:0x0004, B:5:0x000a, B:6:0x004c, B:9:0x0067, B:10:0x006d, B:11:0x007f, B:13:0x0084, B:17:0x009a, B:20:0x00b7, B:22:0x00c5, B:24:0x00cb, B:26:0x00d1, B:27:0x00e6, B:28:0x00ec, B:30:0x00fa, B:32:0x0108, B:34:0x010e, B:36:0x0114, B:37:0x0129, B:38:0x012d, B:42:0x0138, B:44:0x013e, B:46:0x0151, B:47:0x0153, B:50:0x0144, B:52:0x014a, B:56:0x0159, B:57:0x015f, B:59:0x0163, B:62:0x0169, B:64:0x016f, B:67:0x0176, B:69:0x017b, B:71:0x0184, B:73:0x018a, B:76:0x0191, B:78:0x0196, B:80:0x019f, B:82:0x008b, B:83:0x0070, B:85:0x0078, B:86:0x0014), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00eb  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4720a(boolean r12) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0653o.m4720a(boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a6, code lost:
    
        if (r3.indexOf("MM") < r3.indexOf("YYYY")) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0116, code lost:
    
        if (r3.indexOf("DD") < r3.indexOf("YYYY")) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0180, code lost:
    
        if (r3.indexOf("MM") < r3.indexOf("DD")) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a4 A[EDGE_INSN: B:76:0x01a4->B:77:0x01a4 BREAK  A[LOOP:0: B:8:0x0040->B:24:0x01a1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0207  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4721a(boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.p002ui.C0653o.m4721a(boolean, boolean):void");
    }

    /* renamed from: b */
    public void m4722b() {
        Dialog dialog = this.f4090o;
        if (dialog != null) {
            dialog.dismiss();
            this.f4090o = null;
            this.f4087l = null;
        }
    }

    /* renamed from: b */
    public void m4723b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        HashMap<String, String> hashMap = f4063J;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashMap<String, String> m6188f = C0755x1.m6188f(str);
        f4063J = m6188f;
        this.f4096u = m6188f.get("format");
        this.f4098w = f4063J.get("targetid");
        if (!TextUtils.isEmpty(f4063J.get("type"))) {
            try {
                this.f4068B = Integer.parseInt(f4063J.get("type"));
            } catch (NumberFormatException unused) {
            }
        }
        if (TextUtils.isEmpty(this.f4098w)) {
            return;
        }
        if (this.f4098w.startsWith("$") && this.f4098w.endsWith("$")) {
            String str2 = this.f4098w;
            this.f4098w = str2.substring(1, str2.length() - 1).trim();
        }
        this.f4067A = this.f4101z.m13901f().m16930a(this.f4098w, (Vector<C3489yj>) null);
        Calendar calendar = Calendar.getInstance();
        this.f4087l = calendar;
        this.f4092q = calendar.get(1);
        this.f4091p = this.f4087l.get(2);
        this.f4093r = this.f4087l.get(5);
        m4719a(C0755x1.m6132a(this.f4101z.m13901f(), this.f4098w, f4065L, false), this.f4096u);
        this.f4087l.set(this.f4092q, this.f4091p, this.f4093r);
    }

    /* renamed from: c */
    public void m4724c() {
        if (TextUtils.isEmpty(f4063J.get("action")) || !C0755x1.f5254l || f4066M.m16298a(f4063J.get("action"), false, this.f4094s, this.f4099x, this.f4100y, this.f4101z)) {
            return;
        }
        C3440xj m6134a = C0755x1.m6134a(f4063J.get("action"), this.f4100y.m14145i());
        if (m6134a != null) {
            this.f4100y.m14121a(m6134a);
        }
        String str = null;
        C3489yj c3489yj = this.f4094s;
        if (c3489yj != null) {
            str = c3489yj.f14223j;
        } else {
            C0696e c0696e = this.f4099x;
            if (c0696e != null) {
                str = c0696e.f4718j;
            }
        }
        if (f4066M.m16263a(f4063J.get("action"), false, false, this.f4100y, false, false, str, this.f4101z) > 0) {
            f4066M.m16258E();
        }
    }

    /* renamed from: d */
    public void m4725d() {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this.f4095t, this.f4075I, this.f4092q, this.f4091p, this.f4093r);
        if (Build.VERSION.SDK_INT >= 11) {
            datePickerDialog.getDatePicker().setSpinnersShown(false);
            datePickerDialog.getDatePicker().setCalendarViewShown(true);
        }
        datePickerDialog.show();
    }

    /* renamed from: e */
    public void m4726e() {
        e eVar = new e(this);
        this.f4076a = new c();
        if (this.f4090o == null) {
            Dialog dialog = new Dialog(this.f4095t);
            this.f4090o = dialog;
            dialog.requestWindowFeature(1);
            this.f4069C = (LinearLayout) ((LayoutInflater) this.f4095t.getSystemService("layout_inflater")).inflate(R.layout.date_picker, (ViewGroup) null);
            m4721a(false, false);
            this.f4090o.setContentView(this.f4069C);
            this.f4090o.show();
            this.f4090o.setCanceledOnTouchOutside(false);
            d dVar = new d();
            this.f4097v = dVar;
            this.f4090o.setOnCancelListener(dVar);
            this.f4079d = (ImageView) this.f4090o.findViewById(R.id.dayplus);
            this.f4080e = (ImageView) this.f4090o.findViewById(R.id.dayminus);
            EditText editText = (EditText) this.f4090o.findViewById(R.id.day);
            this.f4084i = editText;
            editText.setOnFocusChangeListener(eVar);
            this.f4079d.setOnClickListener(this.f4076a);
            this.f4080e.setOnClickListener(this.f4076a);
            this.f4077b = (ImageView) this.f4090o.findViewById(R.id.monthplus);
            this.f4078c = (ImageView) this.f4090o.findViewById(R.id.monthminus);
            this.f4083h = (EditText) this.f4090o.findViewById(R.id.month);
            this.f4077b.setOnClickListener(this.f4076a);
            this.f4078c.setOnClickListener(this.f4076a);
            this.f4081f = (ImageView) this.f4090o.findViewById(R.id.yearplus);
            this.f4082g = (ImageView) this.f4090o.findViewById(R.id.yearminus);
            EditText editText2 = (EditText) this.f4090o.findViewById(R.id.year);
            this.f4085j = editText2;
            editText2.setOnFocusChangeListener(eVar);
            this.f4081f.setOnClickListener(this.f4076a);
            this.f4082g.setOnClickListener(this.f4076a);
            TextView textView = (TextView) this.f4090o.findViewById(R.id.mTitle);
            this.f4086k = textView;
            textView.setTextSize(20.0f);
            m4727f();
            this.f4088m = (Button) this.f4090o.findViewById(R.id.nagetivebtn);
            this.f4089n = (Button) this.f4090o.findViewById(R.id.positivebtn);
            this.f4088m.setOnClickListener(this.f4076a);
            this.f4089n.setOnClickListener(this.f4076a);
        }
    }

    /* renamed from: f */
    public void m4727f() {
        EditText editText = this.f4083h;
        if (editText != null) {
            editText.setText(m4712a(this.f4087l.get(2)));
        }
        EditText editText2 = this.f4084i;
        if (editText2 != null) {
            editText2.setText(String.valueOf(this.f4087l.get(5)));
            this.f4084i.setFilters(new InputFilter[]{new b(this, this.f4087l.getMinimum(5), this.f4087l.getActualMaximum(5))});
            if (this.f4084i.hasFocus()) {
                EditText editText3 = this.f4084i;
                editText3.setSelection(editText3.getText().length());
            }
        }
        EditText editText4 = this.f4085j;
        if (editText4 != null) {
            editText4.setText(String.valueOf(this.f4087l.get(1)));
            if (this.f4085j.hasFocus()) {
                EditText editText5 = this.f4085j;
                editText5.setSelection(editText5.getText().length());
            }
        }
        m4721a(false, true);
    }

    /* renamed from: g */
    public void m4728g() {
        try {
            if (TextUtils.isEmpty(this.f4085j.getText().toString()) || TextUtils.isEmpty(this.f4084i.getText().toString())) {
                return;
            }
            this.f4087l.set(Integer.parseInt(this.f4085j.getText().toString()), this.f4087l.get(2), Integer.parseInt(this.f4084i.getText().toString()));
            this.f4084i.setFilters(new InputFilter[]{new b(this, this.f4087l.getMinimum(5), this.f4087l.getActualMaximum(5))});
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
