package com.comviva.webaxn.utils;

import android.content.Context;
import android.text.TextUtils;
import com.comviva.webaxn.p002ui.AbstractC0652n1;
import com.comviva.webaxn.p002ui.C0668v;
import com.comviva.webaxn.p002ui.C0670w;
import java.util.HashMap;
import java.util.Stack;
import java.util.Vector;
import p000.C2899lj;
import p000.C2945mj;
import p000.C3400wj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.utils.a0 */
/* loaded from: classes.dex */
public class C0685a0 {

    /* renamed from: e */
    private static C0685a0 f4628e;

    /* renamed from: a */
    private String f4629a;

    /* renamed from: b */
    private HashMap<String, String> f4630b;

    /* renamed from: c */
    int f4631c = 0;

    /* renamed from: d */
    private C2899lj f4632d;

    private C0685a0(Context context) {
    }

    /* renamed from: a */
    public static C0685a0 m5322a(Context context) {
        if (f4628e == null) {
            f4628e = new C0685a0(context);
        }
        return f4628e;
    }

    /* renamed from: a */
    private String m5323a(String str, String str2) {
        String str3;
        String str4;
        String str5;
        String[] strArr;
        int search;
        Stack stack = new Stack();
        if (m5332a(str2)) {
            str3 = m5325b(str, str2);
            stack.push("0");
        } else {
            str3 = str;
        }
        if (str2.equals("+") || str2.equals("-") || str2.equals("*") || str2.equals("/")) {
            str3 = m5325b(str, str2);
            stack.clear();
        }
        String str6 = ")";
        String str7 = "(";
        if (str2.equals("()")) {
            int m5329f = m5329f(str3);
            int m5328e = m5328e(str3);
            if (m5328e != m5329f) {
                if (m5329f > m5328e && str3.endsWith(")")) {
                    str3 = m5325b(str3, ")");
                }
                if (!str3.equals("") && !str3.endsWith("+") && !str3.endsWith("-") && !str3.endsWith("*") && !str3.endsWith("/") && !str3.endsWith("(") && (m5328e != m5329f || m5329f == 0)) {
                    if (!str3.endsWith(".")) {
                        str3 = m5325b(str3, ")");
                    }
                }
            } else if (str3.endsWith("0") || str3.endsWith("1") || str3.endsWith("2") || str3.endsWith("3") || str3.endsWith("4") || str3.endsWith("5") || str3.endsWith("6") || str3.endsWith("7") || str3.endsWith("8") || str3.endsWith("9") || str3.endsWith(")")) {
                str3 = m5325b(str3, "*(");
                this.f4631c++;
            } else {
                str3 = m5329f != 0 ? m5325b(str3, "(") : m5325b(str3, "(");
            }
        }
        if (str2.equals(".") && ((search = stack.search(".")) == -1 || search < 1)) {
            if (str3.equals(".") || str3.endsWith("+") || str3.endsWith("-") || str3.endsWith("*") || str3.endsWith("/") || str3.endsWith("(")) {
                str3 = m5325b(str3, "0.");
                this.f4631c++;
            } else if (!str3.endsWith(".") && !str3.endsWith(")")) {
                str3 = m5325b(str3, ".");
            }
            stack.push(".");
        }
        if (str2.equals("+/-")) {
            if (str3.equals("") || str3.endsWith("+") || str3.endsWith("-") || str3.endsWith("*") || str3.endsWith("/")) {
                str3 = m5325b(str3, "(-");
                stack.clear();
            }
            if (m5326c(str3)) {
                String[] split = str3.split("");
                int length = split.length - 1;
                while (length > 0) {
                    String str8 = str3;
                    if (Boolean.valueOf(m5332a(split[length])).booleanValue()) {
                        length--;
                        strArr = split;
                        str4 = str6;
                        str5 = str7;
                    } else {
                        if (split[length].equals("-")) {
                            int i = length - 1;
                            if (split[i].equals(str7)) {
                                String[] strArr2 = new String[(split.length - 1) - length];
                                String[] strArr3 = new String[i];
                                str4 = str6;
                                str5 = str7;
                                int i2 = 0;
                                int i3 = 0;
                                for (int i4 = 0; i4 < split.length; i4++) {
                                    if (i4 <= length - 2) {
                                        strArr3[i2] = split[i4];
                                        i2++;
                                    }
                                    if (i4 > length) {
                                        strArr2[i3] = split[i4];
                                        i3++;
                                    }
                                }
                                str3 = m5324a(strArr3) + m5324a(strArr2);
                                this.f4631c -= 2;
                                strArr = split;
                                str7 = str5;
                                str6 = str4;
                                split = strArr;
                            }
                        }
                        str4 = str6;
                        str5 = str7;
                        String[] strArr4 = new String[(split.length - 1) - length];
                        String[] strArr5 = new String[length + 1];
                        int i5 = 0;
                        int i6 = 0;
                        int i7 = 0;
                        while (i5 < split.length) {
                            if (i5 <= length) {
                                strArr5[i7] = split[i5];
                                i7++;
                            } else {
                                strArr4[i6] = split[i5];
                                i6++;
                            }
                            str8 = m5324a(strArr5) + "(-" + m5324a(strArr4);
                            i5++;
                            split = split;
                        }
                        strArr = split;
                        this.f4631c += 2;
                    }
                    str3 = str8;
                    str7 = str5;
                    str6 = str4;
                    split = strArr;
                }
            }
        }
        String str9 = str6;
        String str10 = "Wrong Format";
        if (!str2.equals("equals")) {
            return str3;
        }
        if (!str3.contains("()")) {
            if (str3.equals("")) {
                return str3;
            }
            int m5329f2 = m5329f(str3);
            int m5328e2 = m5328e(str3);
            try {
                if (str3.contains("E")) {
                    stack.clear();
                    return str3;
                }
                if (m5328e2 == m5329f2 && !str3.endsWith("+") && !str3.endsWith("-") && !str3.endsWith("*") && !str3.endsWith("/")) {
                    str3 = new C0735r(str3).m5993a().toString();
                    stack.clear();
                }
                if (m5328e2 <= m5329f2) {
                    str10 = str3;
                }
                if (m5328e2 < m5329f2) {
                    int i8 = 0;
                    while (i8 < m5329f2 - m5328e2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str10);
                        String str11 = str9;
                        sb.append(str11);
                        i8++;
                        str9 = str11;
                        str10 = sb.toString();
                    }
                    stack.clear();
                }
            } catch (ArithmeticException unused) {
                return "Division by zero.";
            }
        }
        return str10;
    }

    /* renamed from: a */
    private String m5324a(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: b */
    private String m5325b(String str, String str2) {
        StringBuilder sb;
        if (str != "") {
            if (str.endsWith("+") || str.endsWith("-") || str.endsWith("*") || str.endsWith("/") || str.endsWith(".")) {
                if (str2.equals("+") || str2.equals("-") || str2.equals("*") || str2.equals("/") || str2.equals(".")) {
                    return str;
                }
                sb = new StringBuilder();
            } else if (str.endsWith(")")) {
                if (!str2.equals("+") && !str2.equals("-") && !str2.equals("*") && !str2.equals("/") && !str2.equals(".") && !str2.equals("*(")) {
                    return str;
                }
                sb = new StringBuilder();
            } else if (str.endsWith("(")) {
                if (str2.equals("+") || str2.equals("-") || str2.equals("*") || str2.equals("/") || str2.equals(".") || str2.equals(")")) {
                    return str;
                }
                sb = new StringBuilder();
            } else {
                if (str.endsWith(")")) {
                    return str;
                }
                sb = new StringBuilder();
            }
        } else {
            if (str2.equals("+") || str2.equals("-") || str2.equals("*") || str2.equals("/")) {
                return str;
            }
            sb = new StringBuilder();
        }
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: c */
    private boolean m5326c(String str) {
        return str.endsWith("0") || str.endsWith("1") || str.endsWith("2") || str.endsWith("3") || str.endsWith("4") || str.endsWith("5") || str.endsWith("6") || str.endsWith("7") || str.endsWith("8") || str.endsWith("9");
    }

    /* renamed from: d */
    private String m5327d(String str) {
        AbstractC0652n1 abstractC0652n1;
        if (!TextUtils.isEmpty(str)) {
            if (!str.startsWith("$") || !str.endsWith("$")) {
                return str;
            }
            String substring = str.substring(1, str.length() - 1);
            if (this.f4632d.m13901f() != null) {
                C3489yj m16930a = this.f4632d.m13901f().m16930a(substring, (Vector<C3489yj>) null);
                if (m16930a == null || (abstractC0652n1 = m16930a.f14197a0) == null) {
                    if (this.f4632d.m13901f().f14519r != null) {
                        return this.f4632d.m13901f().f14519r.get(substring);
                    }
                } else {
                    if (abstractC0652n1 instanceof C0670w) {
                        C0670w c0670w = (C0670w) abstractC0652n1;
                        String m5323a = m5323a(c0670w.m5097m(), this.f4629a);
                        c0670w.m5093h(m5323a);
                        c0670w.m5090g(m5323a.length());
                        return m5323a;
                    }
                    if (abstractC0652n1 instanceof C0668v) {
                        C0668v c0668v = (C0668v) abstractC0652n1;
                        String m5323a2 = m5323a(c0668v.m5034m(), this.f4629a);
                        c0668v.m5029f(m5323a2);
                        c0668v.m5030g(m5323a2.length());
                        return m5323a2;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: e */
    private int m5328e(String str) {
        return str.length() - str.replaceAll("\\)", "").length();
    }

    /* renamed from: f */
    private int m5329f(String str) {
        return str.length() - str.replaceAll("\\(", "").length();
    }

    /* renamed from: a */
    public void m5330a() {
        if (f4628e != null) {
            f4628e = null;
        }
        HashMap<String, String> hashMap = this.f4630b;
        if (hashMap != null) {
            hashMap.clear();
            this.f4630b = null;
        }
        this.f4632d = null;
    }

    /* renamed from: a */
    public void m5331a(C3489yj c3489yj, C0696e c0696e, C3400wj c3400wj, C2945mj c2945mj, C2899lj c2899lj, String str) {
        this.f4632d = c2899lj;
        this.f4629a = null;
        m5333b(str);
    }

    /* renamed from: a */
    public boolean m5332a(String str) {
        try {
            if (str.equals(".")) {
                return true;
            }
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public void m5333b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        HashMap<String, String> hashMap = this.f4630b;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashMap<String, String> m6188f = C0755x1.m6188f(str);
        this.f4630b = m6188f;
        if (m6188f.size() > 0) {
            this.f4629a = m5327d(this.f4630b.get("operator"));
            m5327d(this.f4630b.get("target"));
        }
    }
}
