package com.comviva.webaxn.utils;

import android.content.Context;
import android.net.Uri;
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
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.utils.u0 */
/* loaded from: classes.dex */
public class C0745u0 {

    /* renamed from: e */
    private static C0745u0 f5185e;

    /* renamed from: a */
    private Context f5186a;

    /* renamed from: b */
    private HashMap<String, String> f5187b;

    /* renamed from: c */
    private String f5188c;

    /* renamed from: d */
    private C2899lj f5189d;

    private C0745u0(Context context) {
        this.f5186a = context;
    }

    /* renamed from: a */
    public static C0745u0 m6075a(Context context) {
        if (f5185e == null) {
            f5185e = new C0745u0(context);
        }
        return f5185e;
    }

    /* renamed from: a */
    public String m6076a(String str) {
        AbstractC0652n1 abstractC0652n1;
        if (str != null) {
            if (!str.startsWith("$") || !str.endsWith("$")) {
                return str;
            }
            String substring = str.substring(1, str.length() - 1);
            if (this.f5189d.m13901f() != null) {
                C3489yj m16930a = this.f5189d.m13901f().m16930a(substring, (Vector<C3489yj>) null);
                if (m16930a == null || (abstractC0652n1 = m16930a.f14197a0) == null) {
                    if (this.f5189d.m13901f().f14519r != null) {
                        return this.f5189d.m13901f().f14519r.get(substring);
                    }
                } else {
                    if (abstractC0652n1 instanceof C0670w) {
                        return ((C0670w) abstractC0652n1).m5097m();
                    }
                    if (abstractC0652n1 instanceof C0668v) {
                        return ((C0668v) abstractC0652n1).m5034m();
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
    public void m6077a() {
        if (f5185e != null) {
            f5185e = null;
        }
        HashMap<String, String> hashMap = this.f5187b;
        if (hashMap != null) {
            hashMap.clear();
            this.f5187b = null;
        }
        this.f5186a = null;
        this.f5189d = null;
    }

    /* renamed from: a */
    public void m6078a(C3489yj c3489yj, C0696e c0696e, C3400wj c3400wj, C2945mj c2945mj, C2899lj c2899lj, String str) {
        this.f5189d = c2899lj;
        this.f5188c = null;
        m6080b(str);
    }

    /* renamed from: b */
    public void m6079b() {
        C0731p1.m5972f(this.f5186a, this.f5188c);
    }

    /* renamed from: b */
    public void m6080b(String str) {
        if (!TextUtils.isEmpty(str)) {
            HashMap<String, String> hashMap = this.f5187b;
            if (hashMap != null) {
                hashMap.clear();
            }
            HashMap<String, String> m6188f = C0755x1.m6188f(str);
            this.f5187b = m6188f;
            if (m6188f.size() > 0) {
                String m6076a = m6076a(this.f5187b.get("text"));
                this.f5188c = m6076a;
                this.f5188c = Uri.decode(m6076a);
            }
        }
        m6079b();
    }
}
