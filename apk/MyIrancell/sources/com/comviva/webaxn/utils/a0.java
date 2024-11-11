package com.comviva.webaxn.utils;

import android.content.Context;
import android.text.TextUtils;
import defpackage.lj;
import defpackage.mj;
import defpackage.wj;
import defpackage.yj;
import java.util.HashMap;
import java.util.Stack;
import java.util.Vector;

/* loaded from: classes.dex */
public class a0 {
    private static a0 e;
    private String a;
    private HashMap<String, String> b;
    int c = 0;
    private lj d;

    private a0(Context context) {
    }

    public static a0 a(Context context) {
        if (e == null) {
            e = new a0(context);
        }
        return e;
    }

    private String a(String str, String str2) {
        String str3;
        String str4;
        String str5;
        String[] strArr;
        int search;
        Stack stack = new Stack();
        if (a(str2)) {
            str3 = b(str, str2);
            stack.push("0");
        } else {
            str3 = str;
        }
        if (str2.equals("+") || str2.equals("-") || str2.equals("*") || str2.equals("/")) {
            str3 = b(str, str2);
            stack.clear();
        }
        String str6 = ")";
        String str7 = "(";
        if (str2.equals("()")) {
            int f = f(str3);
            int e2 = e(str3);
            if (e2 != f) {
                if (f > e2 && str3.endsWith(")")) {
                    str3 = b(str3, ")");
                }
                if (!str3.equals("") && !str3.endsWith("+") && !str3.endsWith("-") && !str3.endsWith("*") && !str3.endsWith("/") && !str3.endsWith("(") && (e2 != f || f == 0)) {
                    if (!str3.endsWith(".")) {
                        str3 = b(str3, ")");
                    }
                }
            } else if (str3.endsWith("0") || str3.endsWith("1") || str3.endsWith("2") || str3.endsWith("3") || str3.endsWith("4") || str3.endsWith("5") || str3.endsWith("6") || str3.endsWith("7") || str3.endsWith("8") || str3.endsWith("9") || str3.endsWith(")")) {
                str3 = b(str3, "*(");
                this.c++;
            } else {
                str3 = f != 0 ? b(str3, "(") : b(str3, "(");
            }
        }
        if (str2.equals(".") && ((search = stack.search(".")) == -1 || search < 1)) {
            if (str3.equals(".") || str3.endsWith("+") || str3.endsWith("-") || str3.endsWith("*") || str3.endsWith("/") || str3.endsWith("(")) {
                str3 = b(str3, "0.");
                this.c++;
            } else if (!str3.endsWith(".") && !str3.endsWith(")")) {
                str3 = b(str3, ".");
            }
            stack.push(".");
        }
        if (str2.equals("+/-")) {
            if (str3.equals("") || str3.endsWith("+") || str3.endsWith("-") || str3.endsWith("*") || str3.endsWith("/")) {
                str3 = b(str3, "(-");
                stack.clear();
            }
            if (c(str3)) {
                String[] split = str3.split("");
                int length = split.length - 1;
                while (length > 0) {
                    String str8 = str3;
                    if (Boolean.valueOf(a(split[length])).booleanValue()) {
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
                                str3 = a(strArr3) + a(strArr2);
                                this.c -= 2;
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
                            str8 = a(strArr5) + "(-" + a(strArr4);
                            i5++;
                            split = split;
                        }
                        strArr = split;
                        this.c += 2;
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
            int f2 = f(str3);
            int e3 = e(str3);
            try {
                if (str3.contains("E")) {
                    stack.clear();
                    return str3;
                }
                if (e3 == f2 && !str3.endsWith("+") && !str3.endsWith("-") && !str3.endsWith("*") && !str3.endsWith("/")) {
                    str3 = new r(str3).a().toString();
                    stack.clear();
                }
                if (e3 <= f2) {
                    str10 = str3;
                }
                if (e3 < f2) {
                    int i8 = 0;
                    while (i8 < f2 - e3) {
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

    private String a(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
        }
        return sb.toString();
    }

    private String b(String str, String str2) {
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

    private boolean c(String str) {
        return str.endsWith("0") || str.endsWith("1") || str.endsWith("2") || str.endsWith("3") || str.endsWith("4") || str.endsWith("5") || str.endsWith("6") || str.endsWith("7") || str.endsWith("8") || str.endsWith("9");
    }

    private String d(String str) {
        com.comviva.webaxn.ui.n1 n1Var;
        if (!TextUtils.isEmpty(str)) {
            if (!str.startsWith("$") || !str.endsWith("$")) {
                return str;
            }
            String substring = str.substring(1, str.length() - 1);
            if (this.d.f() != null) {
                yj a = this.d.f().a(substring, (Vector<yj>) null);
                if (a == null || (n1Var = a.a0) == null) {
                    if (this.d.f().r != null) {
                        return this.d.f().r.get(substring);
                    }
                } else {
                    if (n1Var instanceof com.comviva.webaxn.ui.w) {
                        com.comviva.webaxn.ui.w wVar = (com.comviva.webaxn.ui.w) n1Var;
                        String a2 = a(wVar.m(), this.a);
                        wVar.h(a2);
                        wVar.g(a2.length());
                        return a2;
                    }
                    if (n1Var instanceof com.comviva.webaxn.ui.v) {
                        com.comviva.webaxn.ui.v vVar = (com.comviva.webaxn.ui.v) n1Var;
                        String a3 = a(vVar.m(), this.a);
                        vVar.f(a3);
                        vVar.g(a3.length());
                        return a3;
                    }
                }
            }
        }
        return null;
    }

    private int e(String str) {
        return str.length() - str.replaceAll("\\)", "").length();
    }

    private int f(String str) {
        return str.length() - str.replaceAll("\\(", "").length();
    }

    public void a() {
        if (e != null) {
            e = null;
        }
        HashMap<String, String> hashMap = this.b;
        if (hashMap != null) {
            hashMap.clear();
            this.b = null;
        }
        this.d = null;
    }

    public void a(yj yjVar, e eVar, wj wjVar, mj mjVar, lj ljVar, String str) {
        this.d = ljVar;
        this.a = null;
        b(str);
    }

    public boolean a(String str) {
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

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        HashMap<String, String> hashMap = this.b;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashMap<String, String> f = x1.f(str);
        this.b = f;
        if (f.size() > 0) {
            this.a = d(this.b.get("operator"));
            d(this.b.get("target"));
        }
    }
}
