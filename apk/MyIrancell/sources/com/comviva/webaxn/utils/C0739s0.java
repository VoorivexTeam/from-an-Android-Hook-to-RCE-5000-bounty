package com.comviva.webaxn.utils;

import android.content.Context;
import android.text.TextUtils;
import com.comviva.webaxn.p002ui.AbstractC0652n1;
import com.comviva.webaxn.p002ui.C0668v;
import com.comviva.webaxn.p002ui.C0670w;
import java.util.HashMap;
import java.util.Vector;
import p000.C2899lj;
import p000.C2945mj;
import p000.C3400wj;
import p000.C3440xj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.utils.s0 */
/* loaded from: classes.dex */
public class C0739s0 {

    /* renamed from: g */
    private static C0739s0 f5146g;

    /* renamed from: a */
    private HashMap<String, String> f5147a;

    /* renamed from: b */
    private C3489yj f5148b;

    /* renamed from: c */
    private C0696e f5149c;

    /* renamed from: d */
    private C2945mj f5150d;

    /* renamed from: e */
    private C3400wj f5151e;

    /* renamed from: f */
    private C2899lj f5152f;

    private C0739s0(Context context) {
    }

    /* renamed from: a */
    public static C0739s0 m6024a(Context context) {
        if (f5146g == null) {
            f5146g = new C0739s0(context);
        }
        return f5146g;
    }

    /* renamed from: a */
    public void m6025a() {
        if (f5146g != null) {
            f5146g = null;
        }
        HashMap<String, String> hashMap = this.f5147a;
        if (hashMap != null) {
            hashMap.clear();
            this.f5147a = null;
        }
        this.f5151e = null;
        this.f5148b = null;
        this.f5149c = null;
        this.f5150d = null;
        this.f5152f = null;
    }

    /* renamed from: a */
    public void m6026a(C3489yj c3489yj, C0696e c0696e, C3400wj c3400wj, C2945mj c2945mj, C2899lj c2899lj, String str) {
        AbstractC0652n1 abstractC0652n1;
        this.f5148b = c3489yj;
        this.f5149c = c0696e;
        this.f5151e = c3400wj;
        this.f5150d = c2945mj;
        this.f5152f = c2899lj;
        HashMap<String, String> hashMap = this.f5147a;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashMap<String, String> m6188f = C0755x1.m6188f(str);
        this.f5147a = m6188f;
        String str2 = null;
        if (m6188f.size() > 0 && this.f5152f.m13901f() != null) {
            String str3 = this.f5147a.get("id");
            if (!TextUtils.isEmpty(str3)) {
                if (str3.startsWith("$") && str3.endsWith("$")) {
                    str3 = str3.substring(1, str3.length() - 1);
                }
                C3489yj m16930a = this.f5152f.m13901f().m16930a(str3, (Vector<C3489yj>) null);
                if (m16930a != null && (abstractC0652n1 = m16930a.f14197a0) != null) {
                    if (abstractC0652n1 instanceof C0670w) {
                        C0670w c0670w = (C0670w) abstractC0652n1;
                        c0670w.m5104t();
                        c0670w.m5090g(c0670w.m5097m().length());
                    } else if (abstractC0652n1 instanceof C0668v) {
                        C0668v c0668v = (C0668v) abstractC0652n1;
                        c0668v.m5040s();
                        c0668v.m5030g(c0668v.m5034m().length());
                    }
                }
            }
        }
        String str4 = this.f5147a.get("action");
        if (TextUtils.isEmpty(str4) || this.f5151e.m16298a(str4, false, this.f5148b, this.f5149c, this.f5150d, this.f5152f)) {
            return;
        }
        C3440xj m6134a = C0755x1.m6134a(str4, this.f5150d.m14145i());
        if (m6134a != null) {
            this.f5150d.m14121a(m6134a);
        }
        C3489yj c3489yj2 = this.f5148b;
        if (c3489yj2 != null) {
            str2 = c3489yj2.f14223j;
        } else {
            C0696e c0696e2 = this.f5149c;
            if (c0696e2 != null) {
                str2 = c0696e2.f4718j;
            }
        }
        if (this.f5151e.m16263a(str4, false, false, this.f5150d, false, false, str2, this.f5152f) > 0) {
            this.f5151e.m16258E();
        }
    }
}
