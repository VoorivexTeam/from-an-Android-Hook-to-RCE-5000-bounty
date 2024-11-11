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
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.utils.g */
/* loaded from: classes.dex */
public class C0702g {

    /* renamed from: e */
    private static C0702g f4793e;

    /* renamed from: a */
    private Context f4794a;

    /* renamed from: b */
    private HashMap<String, String> f4795b;

    /* renamed from: c */
    private String f4796c;

    /* renamed from: d */
    private C2899lj f4797d;

    private C0702g(Context context) {
        this.f4794a = context;
    }

    /* renamed from: a */
    public static C0702g m5457a(Context context) {
        if (f4793e == null) {
            f4793e = new C0702g(context);
        }
        return f4793e;
    }

    /* renamed from: a */
    public String m5458a(String str) {
        AbstractC0652n1 abstractC0652n1;
        if (!TextUtils.isEmpty(str)) {
            if (!str.startsWith("$") || !str.endsWith("$")) {
                return str;
            }
            String substring = str.substring(1, str.length() - 1);
            if (this.f4797d.m13901f() != null) {
                C3489yj m16930a = this.f4797d.m13901f().m16930a(substring, (Vector<C3489yj>) null);
                if (m16930a == null || (abstractC0652n1 = m16930a.f14197a0) == null) {
                    if (this.f4797d.m13901f().f14519r != null) {
                        return this.f4797d.m13901f().f14519r.get(substring);
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
    public void m5459a() {
        C0731p1.m5952a(this.f4794a, this.f4796c);
    }

    /* renamed from: a */
    public void m5460a(C3489yj c3489yj, C0696e c0696e, C3400wj c3400wj, C2945mj c2945mj, C2899lj c2899lj, String str) {
        this.f4797d = c2899lj;
        this.f4796c = null;
        m5462b(str);
    }

    /* renamed from: b */
    public void m5461b() {
        if (f4793e != null) {
            f4793e = null;
        }
        HashMap<String, String> hashMap = this.f4795b;
        if (hashMap != null) {
            hashMap.clear();
            this.f4795b = null;
        }
        this.f4794a = null;
        this.f4797d = null;
    }

    /* renamed from: b */
    public void m5462b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        HashMap<String, String> hashMap = this.f4795b;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashMap<String, String> m6188f = C0755x1.m6188f(str);
        this.f4795b = m6188f;
        if (m6188f.size() > 0) {
            this.f4796c = m5458a(this.f4795b.get("text"));
        }
    }
}
