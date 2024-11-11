package com.comviva.webaxn.ui;

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
import com.comviva.webaxn.utils.x1;
import com.mtni.myirancell.R;
import defpackage.aj;
import defpackage.lj;
import defpackage.mj;
import defpackage.wj;
import defpackage.xj;
import defpackage.yj;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Vector;

/* loaded from: classes.dex */
public class o {
    private static HashMap<String, String> J;
    private static o K;
    public static o1 L;
    public static wj M;
    private yj A;
    LinearLayout C;
    private String G;
    public View.OnClickListener a;
    public ImageView b;
    public ImageView c;
    public ImageView d;
    public ImageView e;
    public ImageView f;
    public ImageView g;
    public EditText h;
    public EditText i;
    public EditText j;
    public TextView k;
    public Calendar l;
    public Button m;
    public Button n;
    public Dialog o;
    private int p;
    private int q;
    private int r;
    public yj s;
    public Context t;
    public String u;
    public DialogInterface.OnCancelListener v;
    private String w;
    private com.comviva.webaxn.utils.e x;
    private mj y;
    private lj z;
    private int B = 0;
    boolean D = false;
    boolean E = false;
    boolean F = false;
    private int H = -1;
    private DatePickerDialog.OnDateSetListener I = new a();

    /* loaded from: classes.dex */
    class a implements DatePickerDialog.OnDateSetListener {
        a() {
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            o.this.q = i;
            o.this.p = i2;
            o.this.r = i3;
            o.this.a(true);
            o.this.c();
        }
    }

    /* loaded from: classes.dex */
    public class b implements InputFilter {
        private int b;
        private int c;

        public b(o oVar, int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        private boolean a(int i, int i2, int i3) {
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
                if (a(this.b, this.c, Integer.parseInt(sb.toString()))) {
                    return null;
                }
                return "";
            } catch (NumberFormatException unused) {
                return "";
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o oVar = o.this;
            int i = 5;
            if (view != oVar.d) {
                if (view != oVar.e) {
                    i = 2;
                    if (view != oVar.b) {
                        if (view != oVar.c) {
                            if (view == oVar.f) {
                                oVar.g();
                                o.this.l.roll(1, 1);
                            } else {
                                if (view != oVar.g) {
                                    if (view == oVar.m) {
                                        oVar.b();
                                        return;
                                    } else {
                                        if (view == oVar.n) {
                                            oVar.a(false);
                                            o.this.b();
                                            o.this.c();
                                            return;
                                        }
                                        return;
                                    }
                                }
                                oVar.g();
                                o.this.l.roll(1, -1);
                            }
                            o.this.f();
                        }
                    }
                }
                oVar.g();
                o.this.l.roll(i, -1);
                o.this.f();
            }
            oVar.g();
            o.this.l.roll(i, 1);
            o.this.f();
        }
    }

    /* loaded from: classes.dex */
    public class d implements DialogInterface.OnCancelListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            o.this.b();
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnFocusChangeListener {
        public e(o oVar) {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (z) {
                EditText editText = (EditText) view;
                editText.setSelection(editText.getText().length());
            }
        }
    }

    private o(Context context) {
        this.t = context;
    }

    public static o a(Context context) {
        if (K == null) {
            K = new o(context);
        }
        return K;
    }

    private CharSequence a(int i) {
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
                calendar = this.l;
                i2 = -1;
            } else {
                calendar = this.l;
            }
            calendar.roll(2, i2);
            f();
        }
        return str;
    }

    public String a(String str) {
        StringBuilder sb;
        String format;
        try {
            if (TextUtils.isEmpty(str)) {
                return String.format("%02d/%02d/%4d  ", Integer.valueOf(this.r), Integer.valueOf(this.p + 1), Integer.valueOf(this.q));
            }
            if (str.equalsIgnoreCase("MM/DD/YYYY")) {
                return String.format("%02d/%02d/%4d", Integer.valueOf(this.p + 1), Integer.valueOf(this.r), Integer.valueOf(this.q));
            }
            if (str.equalsIgnoreCase("DD/MM/YY")) {
                String valueOf = String.valueOf(this.q);
                return String.format("%02d/%02d/%2d", Integer.valueOf(this.r), Integer.valueOf(this.p + 1), Integer.valueOf(Integer.parseInt(valueOf.substring(2, valueOf.length()))));
            }
            if (str.equalsIgnoreCase("MM/DD/YY")) {
                String valueOf2 = String.valueOf(this.q);
                return String.format("%02d/%02d/%2d", Integer.valueOf(this.p + 1), Integer.valueOf(this.r), Integer.valueOf(Integer.parseInt(valueOf2.substring(2, valueOf2.length()))));
            }
            if (str.equalsIgnoreCase("MM/YYYY")) {
                return String.format("%02d/%4d", Integer.valueOf(this.p + 1), Integer.valueOf(this.q));
            }
            if (str.equalsIgnoreCase("MM/YY")) {
                String valueOf3 = String.valueOf(this.q);
                return String.format("%02d/%2d", Integer.valueOf(this.p + 1), Integer.valueOf(Integer.parseInt(valueOf3.substring(2, valueOf3.length()))));
            }
            if (str.equalsIgnoreCase("MMYY")) {
                String valueOf4 = String.valueOf(this.q);
                return String.format("%02d%2d", Integer.valueOf(this.p + 1), Integer.valueOf(Integer.parseInt(valueOf4.substring(2, valueOf4.length()))));
            }
            if (str.equalsIgnoreCase("DDMMYYYY")) {
                return String.format("%02d%02d%4d", Integer.valueOf(this.r), Integer.valueOf(this.p + 1), Integer.valueOf(this.q));
            }
            if (str.equalsIgnoreCase("DD.MM.YYYY")) {
                return String.format("%02d.%02d.%4d", Integer.valueOf(this.r), Integer.valueOf(this.p + 1), Integer.valueOf(this.q));
            }
            if (str.equalsIgnoreCase("DD-MM-YYYY")) {
                return String.format("%02d-%02d-%4d", Integer.valueOf(this.r), Integer.valueOf(this.p + 1), Integer.valueOf(this.q));
            }
            if (str.equalsIgnoreCase("YYYY-MM-DD")) {
                return String.format("%4d-%02d-%02d", Integer.valueOf(this.q), Integer.valueOf(this.p + 1), Integer.valueOf(this.r));
            }
            if (!str.equalsIgnoreCase("DDs MMM YYYY") && !str.equalsIgnoreCase("DDs MMMM YYYY")) {
                if (str.equalsIgnoreCase("DD MMM YYYY")) {
                    sb = new StringBuilder();
                    sb.append(String.format("%02d", Integer.valueOf(this.r)));
                    sb.append(" ");
                    sb.append(x1.a(this.p + 1, 0));
                    sb.append(" ");
                    format = String.format("%04d", Integer.valueOf(this.q));
                } else if (str.equalsIgnoreCase("DD MMMM YYYY")) {
                    sb = new StringBuilder();
                    sb.append(String.format("%02d", Integer.valueOf(this.r)));
                    sb.append(" ");
                    sb.append(x1.a(this.p + 1, 1));
                    sb.append(" ");
                    format = String.format("%04d", Integer.valueOf(this.q));
                } else {
                    if (str.equalsIgnoreCase("DD MM YYYY")) {
                        return String.format("%02d %02d %4d", Integer.valueOf(this.r), Integer.valueOf(this.p + 1), Integer.valueOf(this.q));
                    }
                    if (str.equalsIgnoreCase("MM-YY")) {
                        String valueOf5 = String.valueOf(this.q);
                        return String.format("%02d-%2d", Integer.valueOf(this.p + 1), Integer.valueOf(Integer.parseInt(valueOf5.substring(2, valueOf5.length()))));
                    }
                    if (str.equalsIgnoreCase("MM-YYYY")) {
                        return String.format("%02d-%4d", Integer.valueOf(this.p + 1), Integer.valueOf(this.q));
                    }
                    if (str.equalsIgnoreCase("MMM-YYYY")) {
                        sb = new StringBuilder();
                        sb.append(x1.a(this.p + 1, 0));
                        sb.append("-");
                        format = String.format("%04d", Integer.valueOf(this.q));
                    } else {
                        if (!str.equalsIgnoreCase("MMM/YYYY")) {
                            return String.format("%02d/%02d/%4d  ", Integer.valueOf(this.r), Integer.valueOf(this.p + 1), Integer.valueOf(this.q));
                        }
                        sb = new StringBuilder();
                        sb.append(x1.a(this.p + 1, 0));
                        sb.append("/");
                        format = String.format("%04d", Integer.valueOf(this.q));
                    }
                }
                sb.append(format);
                return sb.toString();
            }
            return x1.a(this.r, this.p + 1, this.q, this.H, " ").toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public void a() {
        if (K != null) {
            K = null;
        }
        HashMap<String, String> hashMap = J;
        if (hashMap != null) {
            hashMap.clear();
            J = null;
        }
        this.t = null;
        M = null;
        this.s = null;
        this.x = null;
        this.z = null;
        this.y = null;
        this.a = null;
        this.v = null;
    }

    public void a(String str, Spanned spanned) {
        n1 n1Var;
        g0 g0Var;
        yj yjVar = this.A;
        if (yjVar == null || (n1Var = yjVar.a0) == null) {
            if (this.z.f().r != null) {
                if (TextUtils.isEmpty(str) && spanned != null) {
                    str = spanned.toString();
                }
                this.z.f().a(this.w, str);
                return;
            }
            return;
        }
        if (n1Var instanceof v) {
            v vVar = (v) n1Var;
            if (!TextUtils.isEmpty(str)) {
                vVar.f(str);
            } else if (spanned != null) {
                vVar.a(spanned);
                str = spanned.toString();
            }
            if (!aj.a(this.t).j(this.w)) {
                return;
            }
        } else {
            if (!(n1Var instanceof w)) {
                if ((n1Var instanceof g0) && yjVar.X0) {
                    g0Var = (g0) n1Var;
                    if (TextUtils.isEmpty(str)) {
                        if (spanned == null) {
                            return;
                        }
                        this.A.n = spanned.toString();
                        g0Var.a(spanned);
                        return;
                    }
                    this.A.n = str;
                    g0Var.b(str);
                    return;
                }
                yj yjVar2 = this.A;
                n1 n1Var2 = yjVar2.a0;
                if ((n1Var2 instanceof h0) && yjVar2.X0) {
                    g0Var = (h0) n1Var2;
                    if (TextUtils.isEmpty(str)) {
                        if (spanned == null) {
                            return;
                        }
                        this.A.n = spanned.toString();
                        g0Var.a(spanned);
                        return;
                    }
                    this.A.n = str;
                    g0Var.b(str);
                    return;
                }
                yj yjVar3 = this.A;
                n1 n1Var3 = yjVar3.a0;
                if ((n1Var3 instanceof i0) && yjVar3.X0) {
                    i0 i0Var = (i0) n1Var3;
                    if (!TextUtils.isEmpty(str)) {
                        this.A.n = str;
                        i0Var.c(str);
                        return;
                    } else {
                        if (spanned != null) {
                            this.A.n = spanned.toString();
                            i0Var.a(spanned);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            w wVar = (w) n1Var;
            if (!TextUtils.isEmpty(str)) {
                wVar.h(str);
            } else if (spanned != null) {
                wVar.a(spanned);
                str = spanned.toString();
            }
            if (!aj.a(this.t).j(this.w)) {
                return;
            }
        }
        aj.a(this.t).h(this.w, str);
    }

    public void a(String str, o1 o1Var, wj wjVar, mj mjVar, lj ljVar, yj yjVar, com.comviva.webaxn.utils.e eVar) {
        L = o1Var;
        M = wjVar;
        this.y = mjVar;
        this.z = ljVar;
        this.s = yjVar;
        this.x = eVar;
        b(str);
        if (this.B == 1) {
            d();
        } else {
            e();
        }
    }

    public void a(String str, String str2) {
        String str3;
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            if (str2.equalsIgnoreCase("MM/DD/YYYY")) {
                String[] split = str.split("/");
                this.r = Integer.parseInt(split[1]);
                this.p = Integer.parseInt(split[0]) - 1;
                str3 = split[2];
            } else if (str2.equalsIgnoreCase("DD/MM/YY")) {
                String[] split2 = str.split("/");
                this.r = Integer.parseInt(split2[0]);
                this.p = Integer.parseInt(split2[1]) - 1;
                str3 = "20" + split2[2];
            } else if (str2.equalsIgnoreCase("MM/DD/YY")) {
                String[] split3 = str.split("/");
                this.r = Integer.parseInt(split3[1]);
                this.p = Integer.parseInt(split3[0]) - 1;
                str3 = "20" + split3[2];
            } else if (str2.equalsIgnoreCase("MM/YYYY")) {
                String[] split4 = str.split("/");
                this.p = Integer.parseInt(split4[0]) - 1;
                str3 = split4[1];
            } else if (str2.equalsIgnoreCase("MM/YY")) {
                String[] split5 = str.split("/");
                this.p = Integer.parseInt(split5[0]) - 1;
                str3 = "20" + split5[1];
            } else if (str2.equalsIgnoreCase("MMYY")) {
                this.p = Integer.parseInt(str.substring(0, 1)) - 1;
                str3 = "20" + str.substring(2, str.length());
            } else if (str2.equalsIgnoreCase("DDMMYYYY")) {
                this.r = Integer.parseInt(str.substring(0, 1));
                this.p = Integer.parseInt(str.substring(2, 3)) - 1;
                str3 = "20" + str.substring(4, str.length());
            } else if (str2.equalsIgnoreCase("DD.MM.YYYY")) {
                String[] split6 = str.split(".");
                this.r = Integer.parseInt(split6[0]);
                this.p = Integer.parseInt(split6[1]) - 1;
                str3 = split6[2];
            } else if (str2.equalsIgnoreCase("DD-MM-YYYY")) {
                String[] split7 = str.split("-");
                this.r = Integer.parseInt(split7[0]);
                this.p = Integer.parseInt(split7[1]) - 1;
                str3 = split7[2];
            } else {
                if (str2.equalsIgnoreCase("YYYY-MM-DD")) {
                    String[] split8 = str.split("-");
                    this.q = Integer.parseInt(split8[0]);
                    this.p = Integer.parseInt(split8[1]) - 1;
                    this.r = Integer.parseInt(split8[2]);
                    return;
                }
                if (!str2.equalsIgnoreCase("DDs MMM YYYY") && !str2.equalsIgnoreCase("DDs MMMM YYYY")) {
                    if (!str2.equalsIgnoreCase("DD MMM YYYY") && !str2.equalsIgnoreCase("DD MMMM YYYY")) {
                        if (str2.equalsIgnoreCase("DD MM YYYY")) {
                            String[] split9 = str.split(" ");
                            this.r = Integer.parseInt(split9[0]);
                            this.p = Integer.parseInt(split9[1]) - 1;
                            str3 = split9[2];
                        } else {
                            if (str2.equalsIgnoreCase("MM-YY")) {
                                String[] split10 = str.split("-");
                                this.p = Integer.parseInt(split10[0]) - 1;
                                Integer.parseInt("20" + split10[1]);
                                return;
                            }
                            if (str2.equalsIgnoreCase("MM-YYYY")) {
                                String[] split11 = str.split("-");
                                this.p = Integer.parseInt(split11[0]) - 1;
                                str3 = split11[1];
                            } else if (str2.equalsIgnoreCase("MMM-YYYY")) {
                                String[] split12 = str.split("-");
                                this.p = x1.h(split12[0]);
                                str3 = split12[1];
                            } else if (str2.equalsIgnoreCase("MMM/YYYY")) {
                                String[] split13 = str.split("/");
                                this.p = x1.h(split13[0]);
                                str3 = split13[1];
                            } else {
                                String[] split14 = str.split("/");
                                this.r = Integer.parseInt(split14[0]);
                                this.p = Integer.parseInt(split14[1]) - 1;
                                str3 = split14[2];
                            }
                        }
                    }
                    String[] split15 = str.split(" ");
                    this.r = Integer.parseInt(split15[0]);
                    this.p = x1.h(split15[1]);
                    str3 = split15[2];
                }
                String[] split16 = str.split(" ");
                this.r = x1.d(split16[0]);
                this.p = x1.h(split16[1]);
                str3 = split16[2];
            }
            this.q = Integer.parseInt(str3);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0159, code lost:
    
        r12 = a(r11.u);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017b, code lost:
    
        r12 = a(r11.u);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0196, code lost:
    
        r12 = a(r11.u);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7 A[Catch: Exception -> 0x01a6, TRY_ENTER, TryCatch #0 {Exception -> 0x01a6, blocks: (B:3:0x0004, B:5:0x000a, B:6:0x004c, B:9:0x0067, B:10:0x006d, B:11:0x007f, B:13:0x0084, B:17:0x009a, B:20:0x00b7, B:22:0x00c5, B:24:0x00cb, B:26:0x00d1, B:27:0x00e6, B:28:0x00ec, B:30:0x00fa, B:32:0x0108, B:34:0x010e, B:36:0x0114, B:37:0x0129, B:38:0x012d, B:42:0x0138, B:44:0x013e, B:46:0x0151, B:47:0x0153, B:50:0x0144, B:52:0x014a, B:56:0x0159, B:57:0x015f, B:59:0x0163, B:62:0x0169, B:64:0x016f, B:67:0x0176, B:69:0x017b, B:71:0x0184, B:73:0x018a, B:76:0x0191, B:78:0x0196, B:80:0x019f, B:82:0x008b, B:83:0x0070, B:85:0x0078, B:86:0x0014), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fa A[Catch: Exception -> 0x01a6, TryCatch #0 {Exception -> 0x01a6, blocks: (B:3:0x0004, B:5:0x000a, B:6:0x004c, B:9:0x0067, B:10:0x006d, B:11:0x007f, B:13:0x0084, B:17:0x009a, B:20:0x00b7, B:22:0x00c5, B:24:0x00cb, B:26:0x00d1, B:27:0x00e6, B:28:0x00ec, B:30:0x00fa, B:32:0x0108, B:34:0x010e, B:36:0x0114, B:37:0x0129, B:38:0x012d, B:42:0x0138, B:44:0x013e, B:46:0x0151, B:47:0x0153, B:50:0x0144, B:52:0x014a, B:56:0x0159, B:57:0x015f, B:59:0x0163, B:62:0x0169, B:64:0x016f, B:67:0x0176, B:69:0x017b, B:71:0x0184, B:73:0x018a, B:76:0x0191, B:78:0x0196, B:80:0x019f, B:82:0x008b, B:83:0x0070, B:85:0x0078, B:86:0x0014), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0136 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0169 A[Catch: Exception -> 0x01a6, TryCatch #0 {Exception -> 0x01a6, blocks: (B:3:0x0004, B:5:0x000a, B:6:0x004c, B:9:0x0067, B:10:0x006d, B:11:0x007f, B:13:0x0084, B:17:0x009a, B:20:0x00b7, B:22:0x00c5, B:24:0x00cb, B:26:0x00d1, B:27:0x00e6, B:28:0x00ec, B:30:0x00fa, B:32:0x0108, B:34:0x010e, B:36:0x0114, B:37:0x0129, B:38:0x012d, B:42:0x0138, B:44:0x013e, B:46:0x0151, B:47:0x0153, B:50:0x0144, B:52:0x014a, B:56:0x0159, B:57:0x015f, B:59:0x0163, B:62:0x0169, B:64:0x016f, B:67:0x0176, B:69:0x017b, B:71:0x0184, B:73:0x018a, B:76:0x0191, B:78:0x0196, B:80:0x019f, B:82:0x008b, B:83:0x0070, B:85:0x0078, B:86:0x0014), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r12) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.o.a(boolean):void");
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.ui.o.a(boolean, boolean):void");
    }

    public void b() {
        Dialog dialog = this.o;
        if (dialog != null) {
            dialog.dismiss();
            this.o = null;
            this.l = null;
        }
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        HashMap<String, String> hashMap = J;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashMap<String, String> f = x1.f(str);
        J = f;
        this.u = f.get("format");
        this.w = J.get("targetid");
        if (!TextUtils.isEmpty(J.get("type"))) {
            try {
                this.B = Integer.parseInt(J.get("type"));
            } catch (NumberFormatException unused) {
            }
        }
        if (TextUtils.isEmpty(this.w)) {
            return;
        }
        if (this.w.startsWith("$") && this.w.endsWith("$")) {
            String str2 = this.w;
            this.w = str2.substring(1, str2.length() - 1).trim();
        }
        this.A = this.z.f().a(this.w, (Vector<yj>) null);
        Calendar calendar = Calendar.getInstance();
        this.l = calendar;
        this.q = calendar.get(1);
        this.p = this.l.get(2);
        this.r = this.l.get(5);
        a(x1.a(this.z.f(), this.w, L, false), this.u);
        this.l.set(this.q, this.p, this.r);
    }

    public void c() {
        if (TextUtils.isEmpty(J.get("action")) || !x1.l || M.a(J.get("action"), false, this.s, this.x, this.y, this.z)) {
            return;
        }
        xj a2 = x1.a(J.get("action"), this.y.i());
        if (a2 != null) {
            this.y.a(a2);
        }
        String str = null;
        yj yjVar = this.s;
        if (yjVar != null) {
            str = yjVar.j;
        } else {
            com.comviva.webaxn.utils.e eVar = this.x;
            if (eVar != null) {
                str = eVar.j;
            }
        }
        if (M.a(J.get("action"), false, false, this.y, false, false, str, this.z) > 0) {
            M.E();
        }
    }

    public void d() {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this.t, this.I, this.q, this.p, this.r);
        if (Build.VERSION.SDK_INT >= 11) {
            datePickerDialog.getDatePicker().setSpinnersShown(false);
            datePickerDialog.getDatePicker().setCalendarViewShown(true);
        }
        datePickerDialog.show();
    }

    public void e() {
        e eVar = new e(this);
        this.a = new c();
        if (this.o == null) {
            Dialog dialog = new Dialog(this.t);
            this.o = dialog;
            dialog.requestWindowFeature(1);
            this.C = (LinearLayout) ((LayoutInflater) this.t.getSystemService("layout_inflater")).inflate(R.layout.date_picker, (ViewGroup) null);
            a(false, false);
            this.o.setContentView(this.C);
            this.o.show();
            this.o.setCanceledOnTouchOutside(false);
            d dVar = new d();
            this.v = dVar;
            this.o.setOnCancelListener(dVar);
            this.d = (ImageView) this.o.findViewById(R.id.dayplus);
            this.e = (ImageView) this.o.findViewById(R.id.dayminus);
            EditText editText = (EditText) this.o.findViewById(R.id.day);
            this.i = editText;
            editText.setOnFocusChangeListener(eVar);
            this.d.setOnClickListener(this.a);
            this.e.setOnClickListener(this.a);
            this.b = (ImageView) this.o.findViewById(R.id.monthplus);
            this.c = (ImageView) this.o.findViewById(R.id.monthminus);
            this.h = (EditText) this.o.findViewById(R.id.month);
            this.b.setOnClickListener(this.a);
            this.c.setOnClickListener(this.a);
            this.f = (ImageView) this.o.findViewById(R.id.yearplus);
            this.g = (ImageView) this.o.findViewById(R.id.yearminus);
            EditText editText2 = (EditText) this.o.findViewById(R.id.year);
            this.j = editText2;
            editText2.setOnFocusChangeListener(eVar);
            this.f.setOnClickListener(this.a);
            this.g.setOnClickListener(this.a);
            TextView textView = (TextView) this.o.findViewById(R.id.mTitle);
            this.k = textView;
            textView.setTextSize(20.0f);
            f();
            this.m = (Button) this.o.findViewById(R.id.nagetivebtn);
            this.n = (Button) this.o.findViewById(R.id.positivebtn);
            this.m.setOnClickListener(this.a);
            this.n.setOnClickListener(this.a);
        }
    }

    public void f() {
        EditText editText = this.h;
        if (editText != null) {
            editText.setText(a(this.l.get(2)));
        }
        EditText editText2 = this.i;
        if (editText2 != null) {
            editText2.setText(String.valueOf(this.l.get(5)));
            this.i.setFilters(new InputFilter[]{new b(this, this.l.getMinimum(5), this.l.getActualMaximum(5))});
            if (this.i.hasFocus()) {
                EditText editText3 = this.i;
                editText3.setSelection(editText3.getText().length());
            }
        }
        EditText editText4 = this.j;
        if (editText4 != null) {
            editText4.setText(String.valueOf(this.l.get(1)));
            if (this.j.hasFocus()) {
                EditText editText5 = this.j;
                editText5.setSelection(editText5.getText().length());
            }
        }
        a(false, true);
    }

    public void g() {
        try {
            if (TextUtils.isEmpty(this.j.getText().toString()) || TextUtils.isEmpty(this.i.getText().toString())) {
                return;
            }
            this.l.set(Integer.parseInt(this.j.getText().toString()), this.l.get(2), Integer.parseInt(this.i.getText().toString()));
            this.i.setFilters(new InputFilter[]{new b(this, this.l.getMinimum(5), this.l.getActualMaximum(5))});
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
