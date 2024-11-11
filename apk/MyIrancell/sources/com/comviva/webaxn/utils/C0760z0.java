package com.comviva.webaxn.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.comviva.webaxn.p002ui.AbstractC0652n1;
import com.comviva.webaxn.p002ui.C0624e0;
import com.comviva.webaxn.p002ui.C0627f0;
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
import p000.C3440xj;
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.utils.z0 */
/* loaded from: classes.dex */
public class C0760z0 {

    /* renamed from: h */
    private static C0760z0 f5334h;

    /* renamed from: a */
    private Context f5335a;

    /* renamed from: b */
    private C3400wj f5336b;

    /* renamed from: c */
    private C2945mj f5337c;

    /* renamed from: d */
    private C2899lj f5338d;

    /* renamed from: e */
    private C3489yj f5339e;

    /* renamed from: f */
    private C0696e f5340f;

    /* renamed from: g */
    private HashMap<String, String> f5341g;

    private C0760z0(Context context) {
        this.f5335a = context;
    }

    /* renamed from: a */
    public static C0760z0 m6227a(Context context) {
        if (f5334h == null) {
            f5334h = new C0760z0(context);
        }
        return f5334h;
    }

    /* renamed from: a */
    private void m6228a(String str) {
        AbstractC0652n1 abstractC0652n1;
        String mo4379o;
        String m4501n;
        String mo4379o2;
        ImageView mo4289e;
        if (this.f5338d.m13901f() != null) {
            Drawable drawable = null;
            C3489yj m16930a = this.f5338d.m13901f().m16930a(str, (Vector<C3489yj>) null);
            if (m16930a == null || (abstractC0652n1 = m16930a.f14197a0) == null) {
                return;
            }
            if (abstractC0652n1 instanceof C0670w) {
                ((C0670w) abstractC0652n1).m5073a(m16930a.f14178R, false);
            } else if (abstractC0652n1 instanceof C0668v) {
                ((C0668v) abstractC0652n1).m5015a(m16930a.f14178R, false);
            } else if (abstractC0652n1 instanceof C0633h0) {
                C0633h0 c0633h0 = (C0633h0) abstractC0652n1;
                if (c0633h0.mo4380p()) {
                    c0633h0.mo4370b(false);
                    mo4379o2 = c0633h0.mo4379o();
                } else {
                    mo4379o2 = this.f5341g.get("toggle_text");
                    c0633h0.mo4370b(true);
                }
                c0633h0.mo4372c(m16930a.f14235n);
                if (!TextUtils.isEmpty(mo4379o2)) {
                    c0633h0.m4438d(mo4379o2);
                }
            } else if (abstractC0652n1 instanceof C0636i0) {
                C0636i0 c0636i0 = (C0636i0) abstractC0652n1;
                if (c0636i0.m4502o()) {
                    c0636i0.m4489b(false);
                    m4501n = c0636i0.m4501n();
                } else {
                    m4501n = this.f5341g.get("toggle_text");
                    c0636i0.m4489b(true);
                }
                c0636i0.m4495d(m16930a.f14235n);
                if (!TextUtils.isEmpty(m4501n)) {
                    c0636i0.m4487b(m4501n);
                }
            } else if (abstractC0652n1 instanceof C0630g0) {
                C0630g0 c0630g0 = (C0630g0) abstractC0652n1;
                if (c0630g0.mo4380p()) {
                    c0630g0.mo4370b(false);
                    mo4379o = c0630g0.mo4379o();
                } else {
                    mo4379o = this.f5341g.get("toggle_text");
                    c0630g0.mo4370b(true);
                }
                c0630g0.mo4372c(c0630g0.m4377m());
                if (!TextUtils.isEmpty(mo4379o)) {
                    c0630g0.m4368b(mo4379o);
                }
            }
            AbstractC0652n1 abstractC0652n12 = m16930a.f14197a0;
            if (abstractC0652n12 instanceof C0624e0) {
                C0624e0 c0624e0 = (C0624e0) abstractC0652n12;
                if (c0624e0.m4293o()) {
                    c0624e0.m4284a(false);
                    drawable = c0624e0.m4292n();
                } else {
                    if (c0624e0.m4292n() == null) {
                        String str2 = this.f5341g.get("toggle_img");
                        if (!TextUtils.isEmpty(str2)) {
                            drawable = C0755x1.m6163b(this.f5335a, str2);
                        }
                    } else {
                        drawable = c0624e0.m4292n();
                    }
                    c0624e0.m4284a(true);
                }
                c0624e0.m4283a(c0624e0.mo4289e().getDrawable());
                if (drawable == null) {
                    return;
                } else {
                    mo4289e = c0624e0.mo4289e();
                }
            } else {
                if (!(abstractC0652n12 instanceof C0627f0)) {
                    return;
                }
                C0627f0 c0627f0 = (C0627f0) abstractC0652n12;
                if (c0627f0.m4326o()) {
                    c0627f0.m4316a(false);
                    drawable = c0627f0.m4324m();
                } else {
                    if (c0627f0.m4324m() == null) {
                        String str3 = this.f5341g.get("toggle_img");
                        if (!TextUtils.isEmpty(str3)) {
                            drawable = C0755x1.m6163b(this.f5335a, str3);
                        }
                    } else {
                        drawable = c0627f0.m4324m();
                    }
                    c0627f0.m4316a(true);
                }
                c0627f0.m4315a(c0627f0.mo4289e().getDrawable());
                if (drawable == null) {
                    return;
                } else {
                    mo4289e = c0627f0.mo4289e();
                }
            }
            mo4289e.setImageDrawable(drawable);
        }
    }

    /* renamed from: a */
    public void m6229a() {
        this.f5335a = null;
        this.f5336b = null;
        this.f5339e = null;
        this.f5340f = null;
        this.f5338d = null;
        this.f5337c = null;
        if (f5334h != null) {
            f5334h = null;
        }
    }

    /* renamed from: a */
    public void m6230a(String str, C3400wj c3400wj, C2945mj c2945mj, C2899lj c2899lj, C3489yj c3489yj, C0696e c0696e, C0655o1 c0655o1) {
        this.f5336b = c3400wj;
        this.f5337c = c2945mj;
        this.f5338d = c2899lj;
        this.f5339e = c3489yj;
        this.f5340f = c0696e;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        HashMap<String, String> hashMap = this.f5341g;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashMap<String, String> m6188f = C0755x1.m6188f(str);
        this.f5341g = m6188f;
        if (m6188f.size() > 0) {
            String str2 = this.f5341g.get("type");
            if (!TextUtils.isEmpty(str2) && str2.equalsIgnoreCase("pwd")) {
                for (String str3 : this.f5341g.get("target").trim().split(";")) {
                    if (!TextUtils.isEmpty(str3)) {
                        if (str3.startsWith("$")) {
                            str3 = str3.substring(1, str3.endsWith("$") ? str3.length() - 1 : str3.length());
                        }
                        m6228a(str3);
                    }
                }
            }
            m6231b();
        }
    }

    /* renamed from: b */
    public void m6231b() {
        if (TextUtils.isEmpty(this.f5341g.get("action")) || this.f5336b.m16298a(this.f5341g.get("action"), false, this.f5339e, this.f5340f, this.f5337c, this.f5338d)) {
            return;
        }
        C3440xj m6134a = C0755x1.m6134a(this.f5341g.get("action"), this.f5337c.m14145i());
        if (m6134a != null) {
            this.f5337c.m14121a(m6134a);
        }
        String str = null;
        C3489yj c3489yj = this.f5339e;
        if (c3489yj != null) {
            str = c3489yj.f14223j;
        } else {
            C0696e c0696e = this.f5340f;
            if (c0696e != null) {
                str = c0696e.f4718j;
            }
        }
        if (this.f5336b.m16263a(this.f5341g.get("action"), false, false, this.f5337c, false, false, str, this.f5338d) > 0) {
            this.f5336b.m16258E();
        }
    }
}
