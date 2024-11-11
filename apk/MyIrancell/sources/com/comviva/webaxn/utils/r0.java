package com.comviva.webaxn.utils;

import android.content.Context;
import android.text.TextUtils;
import defpackage.lj;
import defpackage.mj;
import defpackage.wj;
import defpackage.yj;
import java.util.HashMap;
import java.util.Vector;

/* loaded from: classes.dex */
public class r0 {
    private static r0 j;
    private lj a;
    private yj b;
    private e c;
    private HashMap<String, String> d;
    private n1 e;
    private String[] f;
    private String g;
    private double h;
    private double i = 2.0d;

    private r0(Context context) {
    }

    private double a(double d) {
        double pow = Math.pow(10.0d, this.i);
        double round = Math.round(d * pow);
        Double.isNaN(round);
        return round / pow;
    }

    public static r0 a(Context context) {
        if (j == null) {
            j = new r0(context);
        }
        return j;
    }

    public void a() {
        if (j != null) {
            j = null;
        }
        HashMap<String, String> hashMap = this.d;
        if (hashMap != null) {
            hashMap.clear();
            this.d = null;
        }
        this.b = null;
        this.c = null;
        this.a = null;
        this.e = null;
    }

    public void a(String str, float f) {
        double d;
        com.comviva.webaxn.ui.n1 n1Var;
        if (TextUtils.isEmpty(this.d.get("unit")) || !this.d.get("unit").equals("degree")) {
            d = f;
        } else {
            double d2 = f * 180.0f;
            Double.isNaN(d2);
            d = d2 / 3.14159d;
            this.h = d;
        }
        this.h = a(d);
        this.g = String.valueOf(this.h);
        yj a = this.a.f().a(str, (Vector<yj>) null);
        if (a == null || (n1Var = a.a0) == null) {
            if (this.a.f().r == null || !this.a.f().r.containsKey(str)) {
                return;
            }
            this.a.f().a(str, this.g);
            return;
        }
        if (n1Var instanceof com.comviva.webaxn.ui.v) {
            ((com.comviva.webaxn.ui.v) n1Var).f(this.g);
            return;
        }
        if (n1Var instanceof com.comviva.webaxn.ui.w) {
            ((com.comviva.webaxn.ui.w) n1Var).h(this.g);
            return;
        }
        if ((n1Var instanceof com.comviva.webaxn.ui.g0) && a.X0) {
            String str2 = this.g;
            a.n = str2;
            ((com.comviva.webaxn.ui.g0) n1Var).b(str2);
            return;
        }
        com.comviva.webaxn.ui.n1 n1Var2 = a.a0;
        if ((n1Var2 instanceof com.comviva.webaxn.ui.h0) && a.X0) {
            String str3 = this.g;
            a.n = str3;
            ((com.comviva.webaxn.ui.h0) n1Var2).b(str3);
            return;
        }
        com.comviva.webaxn.ui.n1 n1Var3 = a.a0;
        if ((n1Var3 instanceof com.comviva.webaxn.ui.i0) && a.X0) {
            String str4 = this.g;
            a.n = str4;
            ((com.comviva.webaxn.ui.i0) n1Var3).c(str4);
        }
    }

    public void a(String str, wj wjVar, mj mjVar, lj ljVar, yj yjVar, e eVar, com.comviva.webaxn.ui.o1 o1Var) {
        this.a = ljVar;
        this.b = yjVar;
        this.c = eVar;
        if (yjVar != null) {
            String str2 = yjVar.j;
        } else if (eVar != null) {
            String str3 = eVar.j;
        }
        this.f = null;
        HashMap<String, String> hashMap = this.d;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashMap<String, String> f = x1.f(str);
        this.d = f;
        if (!TextUtils.isEmpty(f.get("target"))) {
            this.f = this.d.get("target").split(";");
            int i = 0;
            while (true) {
                String[] strArr = this.f;
                if (i >= strArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(strArr[i]) && this.f[i].startsWith("$")) {
                    if (this.f[i].endsWith("$")) {
                        String[] strArr2 = this.f;
                        strArr2[i] = strArr2[i].substring(1, strArr2[i].length() - 1);
                    } else {
                        String[] strArr3 = this.f;
                        strArr3[i] = strArr3[i].substring(1, strArr3[i].length());
                    }
                }
                i++;
            }
        }
        if (!TextUtils.isEmpty(this.d.get("roundoff"))) {
            try {
                this.i = Double.parseDouble(this.d.get("roundoff"));
            } catch (NumberFormatException unused) {
            }
        }
        this.e = new n1();
    }

    public void a(float[] fArr) {
        float f;
        for (String str : this.f) {
            if (!TextUtils.isEmpty(str)) {
                if (str.equals("AZIMUTH")) {
                    f = fArr[0];
                } else if (str.equals("PITCH")) {
                    f = fArr[1];
                } else if (str.equals("ROLL")) {
                    f = fArr[2];
                }
                a(str, f);
            }
        }
    }

    public n1 b() {
        return this.e;
    }
}
