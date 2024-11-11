package com.comviva.webaxn.utils;

import android.content.Context;
import android.text.TextUtils;
import com.comviva.webaxn.p002ui.AbstractC0652n1;
import com.comviva.webaxn.p002ui.C0630g0;
import com.comviva.webaxn.p002ui.C0633h0;
import com.comviva.webaxn.p002ui.C0636i0;
import com.comviva.webaxn.p002ui.C0655o1;
import com.comviva.webaxn.p002ui.C0668v;
import com.comviva.webaxn.p002ui.C0670w;
import java.util.HashMap;
import java.util.Vector;
import p000.C2899lj;
import p000.C2945mj;
import p000.C3400wj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.utils.r0 */
/* loaded from: classes.dex */
public class C0736r0 {

    /* renamed from: j */
    private static C0736r0 f5134j;

    /* renamed from: a */
    private C2899lj f5135a;

    /* renamed from: b */
    private C3489yj f5136b;

    /* renamed from: c */
    private C0696e f5137c;

    /* renamed from: d */
    private HashMap<String, String> f5138d;

    /* renamed from: e */
    private C0725n1 f5139e;

    /* renamed from: f */
    private String[] f5140f;

    /* renamed from: g */
    private String f5141g;

    /* renamed from: h */
    private double f5142h;

    /* renamed from: i */
    private double f5143i = 2.0d;

    private C0736r0(Context context) {
    }

    /* renamed from: a */
    private double m6003a(double d) {
        double pow = Math.pow(10.0d, this.f5143i);
        double round = Math.round(d * pow);
        Double.isNaN(round);
        return round / pow;
    }

    /* renamed from: a */
    public static C0736r0 m6004a(Context context) {
        if (f5134j == null) {
            f5134j = new C0736r0(context);
        }
        return f5134j;
    }

    /* renamed from: a */
    public void m6005a() {
        if (f5134j != null) {
            f5134j = null;
        }
        HashMap<String, String> hashMap = this.f5138d;
        if (hashMap != null) {
            hashMap.clear();
            this.f5138d = null;
        }
        this.f5136b = null;
        this.f5137c = null;
        this.f5135a = null;
        this.f5139e = null;
    }

    /* renamed from: a */
    public void m6006a(String str, float f) {
        double d;
        AbstractC0652n1 abstractC0652n1;
        if (TextUtils.isEmpty(this.f5138d.get("unit")) || !this.f5138d.get("unit").equals("degree")) {
            d = f;
        } else {
            double d2 = f * 180.0f;
            Double.isNaN(d2);
            d = d2 / 3.14159d;
            this.f5142h = d;
        }
        this.f5142h = m6003a(d);
        this.f5141g = String.valueOf(this.f5142h);
        C3489yj m16930a = this.f5135a.m13901f().m16930a(str, (Vector<C3489yj>) null);
        if (m16930a == null || (abstractC0652n1 = m16930a.f14197a0) == null) {
            if (this.f5135a.m13901f().f14519r == null || !this.f5135a.m13901f().f14519r.containsKey(str)) {
                return;
            }
            this.f5135a.m13901f().m16931a(str, this.f5141g);
            return;
        }
        if (abstractC0652n1 instanceof C0668v) {
            ((C0668v) abstractC0652n1).m5029f(this.f5141g);
            return;
        }
        if (abstractC0652n1 instanceof C0670w) {
            ((C0670w) abstractC0652n1).m5093h(this.f5141g);
            return;
        }
        if ((abstractC0652n1 instanceof C0630g0) && m16930a.f14191X0) {
            String str2 = this.f5141g;
            m16930a.f14235n = str2;
            ((C0630g0) abstractC0652n1).m4368b(str2);
            return;
        }
        AbstractC0652n1 abstractC0652n12 = m16930a.f14197a0;
        if ((abstractC0652n12 instanceof C0633h0) && m16930a.f14191X0) {
            String str3 = this.f5141g;
            m16930a.f14235n = str3;
            ((C0633h0) abstractC0652n12).m4368b(str3);
            return;
        }
        AbstractC0652n1 abstractC0652n13 = m16930a.f14197a0;
        if ((abstractC0652n13 instanceof C0636i0) && m16930a.f14191X0) {
            String str4 = this.f5141g;
            m16930a.f14235n = str4;
            ((C0636i0) abstractC0652n13).m4493c(str4);
        }
    }

    /* renamed from: a */
    public void m6007a(String str, C3400wj c3400wj, C2945mj c2945mj, C2899lj c2899lj, C3489yj c3489yj, C0696e c0696e, C0655o1 c0655o1) {
        this.f5135a = c2899lj;
        this.f5136b = c3489yj;
        this.f5137c = c0696e;
        if (c3489yj != null) {
            String str2 = c3489yj.f14223j;
        } else if (c0696e != null) {
            String str3 = c0696e.f4718j;
        }
        this.f5140f = null;
        HashMap<String, String> hashMap = this.f5138d;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashMap<String, String> m6188f = C0755x1.m6188f(str);
        this.f5138d = m6188f;
        if (!TextUtils.isEmpty(m6188f.get("target"))) {
            this.f5140f = this.f5138d.get("target").split(";");
            int i = 0;
            while (true) {
                String[] strArr = this.f5140f;
                if (i >= strArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(strArr[i]) && this.f5140f[i].startsWith("$")) {
                    if (this.f5140f[i].endsWith("$")) {
                        String[] strArr2 = this.f5140f;
                        strArr2[i] = strArr2[i].substring(1, strArr2[i].length() - 1);
                    } else {
                        String[] strArr3 = this.f5140f;
                        strArr3[i] = strArr3[i].substring(1, strArr3[i].length());
                    }
                }
                i++;
            }
        }
        if (!TextUtils.isEmpty(this.f5138d.get("roundoff"))) {
            try {
                this.f5143i = Double.parseDouble(this.f5138d.get("roundoff"));
            } catch (NumberFormatException unused) {
            }
        }
        this.f5139e = new C0725n1();
    }

    /* renamed from: a */
    public void m6008a(float[] fArr) {
        float f;
        for (String str : this.f5140f) {
            if (!TextUtils.isEmpty(str)) {
                if (str.equals("AZIMUTH")) {
                    f = fArr[0];
                } else if (str.equals("PITCH")) {
                    f = fArr[1];
                } else if (str.equals("ROLL")) {
                    f = fArr[2];
                }
                m6006a(str, f);
            }
        }
    }

    /* renamed from: b */
    public C0725n1 m6009b() {
        return this.f5139e;
    }
}
