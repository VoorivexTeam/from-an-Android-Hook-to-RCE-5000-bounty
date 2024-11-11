package com.comviva.webaxn.utils;

import android.content.Context;
import android.text.TextUtils;
import com.comviva.webaxn.p002ui.AbstractC0652n1;
import com.comviva.webaxn.p002ui.C0630g0;
import com.comviva.webaxn.p002ui.C0633h0;
import com.comviva.webaxn.p002ui.C0636i0;
import com.comviva.webaxn.p002ui.C0668v;
import com.comviva.webaxn.p002ui.C0670w;
import java.util.HashMap;
import java.util.Vector;
import p000.C2899lj;
import p000.C2945mj;
import p000.C3400wj;
import p000.C3440xj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.utils.f1 */
/* loaded from: classes.dex */
public class C0701f1 {

    /* renamed from: i */
    private static C0701f1 f4784i;

    /* renamed from: a */
    private HashMap<String, String> f4785a;

    /* renamed from: b */
    public int f4786b;

    /* renamed from: c */
    public int f4787c;

    /* renamed from: d */
    private C3489yj f4788d;

    /* renamed from: e */
    private C0696e f4789e;

    /* renamed from: f */
    private C2945mj f4790f;

    /* renamed from: g */
    private C2899lj f4791g;

    /* renamed from: h */
    private C3400wj f4792h;

    private C0701f1(Context context) {
    }

    /* renamed from: a */
    public static C0701f1 m5453a(Context context) {
        if (f4784i == null) {
            f4784i = new C0701f1(context);
        }
        return f4784i;
    }

    /* renamed from: a */
    public String m5454a(String str) {
        AbstractC0652n1 abstractC0652n1;
        if (!TextUtils.isEmpty(str)) {
            if (!str.startsWith("$") || !str.endsWith("$")) {
                return str;
            }
            String substring = str.substring(1, str.length() - 1);
            if (this.f4791g.m13901f() != null) {
                C3489yj m16930a = this.f4791g.m13901f().m16930a(substring, (Vector<C3489yj>) null);
                if (m16930a == null || (abstractC0652n1 = m16930a.f14197a0) == null) {
                    if (this.f4791g.m13901f().f14519r != null) {
                        return this.f4791g.m13901f().f14519r.get(substring);
                    }
                } else {
                    if (abstractC0652n1 instanceof C0670w) {
                        C0670w c0670w = (C0670w) abstractC0652n1;
                        String m5456b = m5456b(c0670w.m5097m());
                        c0670w.m5093h(m5456b);
                        c0670w.m5090g(m5456b.length());
                        return m5456b;
                    }
                    if (abstractC0652n1 instanceof C0668v) {
                        C0668v c0668v = (C0668v) abstractC0652n1;
                        String m5456b2 = m5456b(c0668v.m5034m());
                        c0668v.m5029f(m5456b2);
                        c0668v.m5030g(m5456b2.length());
                        return m5456b2;
                    }
                    if ((abstractC0652n1 instanceof C0636i0) || (abstractC0652n1 instanceof C0633h0) || (abstractC0652n1 instanceof C0630g0)) {
                        return m16930a.f14235n;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m5455a(C3489yj c3489yj, C0696e c0696e, C3400wj c3400wj, C2945mj c2945mj, C2899lj c2899lj, String str) {
        this.f4788d = c3489yj;
        this.f4789e = c0696e;
        this.f4792h = c3400wj;
        this.f4790f = c2945mj;
        this.f4791g = c2899lj;
        this.f4786b = 0;
        this.f4787c = 0;
        HashMap<String, String> hashMap = this.f4785a;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashMap<String, String> m6188f = C0755x1.m6188f(str);
        this.f4785a = m6188f;
        try {
            this.f4787c = Integer.parseInt(m6188f.get("step"));
            this.f4786b = Integer.parseInt(this.f4785a.get("limit"));
        } catch (Exception unused) {
        }
        m5454a(this.f4785a.get("target"));
        String str2 = this.f4785a.get("action");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if ((this.f4791g.m13901f().f14519r == null || this.f4791g.m13901f().f14519r.get("RELAYOUT_FLAG") == null || !this.f4791g.m13901f().f14519r.get("RELAYOUT_FLAG").equals("1")) && !this.f4792h.m16298a(str2, false, this.f4788d, this.f4789e, this.f4790f, this.f4791g)) {
            String str3 = null;
            C3489yj c3489yj2 = this.f4788d;
            if (c3489yj2 != null) {
                str3 = c3489yj2.f14223j;
            } else {
                C0696e c0696e2 = this.f4789e;
                if (c0696e2 != null) {
                    str3 = c0696e2.f4718j;
                }
            }
            String str4 = str3;
            C3440xj m6134a = C0755x1.m6134a(str2, this.f4790f.m14145i());
            if (m6134a != null) {
                this.f4790f.m14121a(m6134a);
            }
            if (this.f4792h.m16263a(str2, false, false, this.f4790f, false, false, str4, this.f4791g) > 0) {
                this.f4792h.m16258E();
            }
        }
    }

    /* renamed from: b */
    public String m5456b(String str) {
        try {
            int parseInt = str.equals("") ? 0 : Integer.parseInt(str);
            if (parseInt < this.f4786b) {
                parseInt += this.f4787c;
            }
            if (parseInt > this.f4786b) {
                parseInt = this.f4786b;
            }
            return String.valueOf(parseInt);
        } catch (NumberFormatException unused) {
            return str;
        }
    }
}
