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

/* renamed from: com.comviva.webaxn.utils.i */
/* loaded from: classes.dex */
public class C0708i {

    /* renamed from: i */
    private static C0708i f4846i;

    /* renamed from: a */
    private HashMap<String, String> f4847a;

    /* renamed from: b */
    public int f4848b;

    /* renamed from: c */
    public int f4849c;

    /* renamed from: d */
    private C3489yj f4850d;

    /* renamed from: e */
    private C0696e f4851e;

    /* renamed from: f */
    private C2945mj f4852f;

    /* renamed from: g */
    private C2899lj f4853g;

    /* renamed from: h */
    private C3400wj f4854h;

    private C0708i(Context context) {
    }

    /* renamed from: a */
    public static C0708i m5524a(Context context) {
        if (f4846i == null) {
            f4846i = new C0708i(context);
        }
        return f4846i;
    }

    /* renamed from: a */
    public String m5525a(String str) {
        try {
            int parseInt = str.equals("") ? 0 : Integer.parseInt(str);
            if (parseInt > this.f4848b) {
                parseInt -= this.f4849c;
            }
            if (parseInt < this.f4848b) {
                parseInt = this.f4848b;
            }
            return String.valueOf(parseInt);
        } catch (NumberFormatException unused) {
            return str;
        }
    }

    /* renamed from: a */
    public void m5526a(C3489yj c3489yj, C0696e c0696e, C3400wj c3400wj, C2945mj c2945mj, C2899lj c2899lj, String str) {
        this.f4850d = c3489yj;
        this.f4851e = c0696e;
        this.f4854h = c3400wj;
        this.f4852f = c2945mj;
        this.f4853g = c2899lj;
        this.f4848b = 0;
        this.f4849c = 0;
        HashMap<String, String> hashMap = this.f4847a;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashMap<String, String> m6188f = C0755x1.m6188f(str);
        this.f4847a = m6188f;
        this.f4849c = Integer.parseInt(m6188f.get("step"));
        this.f4848b = Integer.parseInt(this.f4847a.get("limit"));
        m5527b(this.f4847a.get("target"));
        String str2 = this.f4847a.get("action");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if ((this.f4853g.m13901f().f14519r == null || this.f4853g.m13901f().f14519r.get("RELAYOUT_FLAG") == null || !this.f4853g.m13901f().f14519r.get("RELAYOUT_FLAG").equals("1")) && !this.f4854h.m16298a(str2, false, this.f4850d, this.f4851e, this.f4852f, this.f4853g)) {
            String str3 = null;
            C3489yj c3489yj2 = this.f4850d;
            if (c3489yj2 != null) {
                str3 = c3489yj2.f14223j;
            } else {
                C0696e c0696e2 = this.f4851e;
                if (c0696e2 != null) {
                    str3 = c0696e2.f4718j;
                }
            }
            String str4 = str3;
            C3440xj m6134a = C0755x1.m6134a(str2, this.f4852f.m14145i());
            if (m6134a != null) {
                this.f4852f.m14121a(m6134a);
            }
            if (this.f4854h.m16263a(str2, false, false, this.f4852f, false, false, str4, this.f4853g) > 0) {
                this.f4854h.m16258E();
            }
        }
    }

    /* renamed from: b */
    public String m5527b(String str) {
        AbstractC0652n1 abstractC0652n1;
        if (!TextUtils.isEmpty(str)) {
            if (!str.startsWith("$") || !str.endsWith("$")) {
                return str;
            }
            String substring = str.substring(1, str.length() - 1);
            if (this.f4853g.m13901f() != null) {
                C3489yj m16930a = this.f4853g.m13901f().m16930a(substring, (Vector<C3489yj>) null);
                if (m16930a == null || (abstractC0652n1 = m16930a.f14197a0) == null) {
                    if (this.f4853g.m13901f().f14519r != null) {
                        return this.f4853g.m13901f().f14519r.get(substring);
                    }
                } else {
                    if (abstractC0652n1 instanceof C0670w) {
                        C0670w c0670w = (C0670w) abstractC0652n1;
                        String m5525a = m5525a(c0670w.m5097m());
                        c0670w.m5093h(m5525a);
                        c0670w.m5090g(m5525a.length());
                        return m5525a;
                    }
                    if (abstractC0652n1 instanceof C0668v) {
                        C0668v c0668v = (C0668v) abstractC0652n1;
                        String m5525a2 = m5525a(c0668v.m5034m());
                        c0668v.m5029f(m5525a2);
                        c0668v.m5030g(m5525a2.length());
                        return m5525a2;
                    }
                    if ((abstractC0652n1 instanceof C0636i0) || (abstractC0652n1 instanceof C0633h0) || (abstractC0652n1 instanceof C0630g0)) {
                        return m16930a.f14235n;
                    }
                }
            }
        }
        return null;
    }
}
