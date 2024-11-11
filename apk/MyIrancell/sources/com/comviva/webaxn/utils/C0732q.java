package com.comviva.webaxn.utils;

import android.content.Context;
import android.text.TextUtils;
import com.comviva.webaxn.p002ui.AbstractC0652n1;
import java.util.HashMap;
import java.util.Vector;
import p000.C2862kj;
import p000.C2899lj;
import p000.C2945mj;
import p000.C3400wj;
import p000.C3440xj;
import p000.C3489yj;
import p000.C3531zj;

/* renamed from: com.comviva.webaxn.utils.q */
/* loaded from: classes.dex */
public class C0732q {

    /* renamed from: g */
    private static C0732q f5082g;

    /* renamed from: a */
    private C3400wj f5083a;

    /* renamed from: b */
    private C2899lj f5084b;

    /* renamed from: c */
    private C2945mj f5085c;

    /* renamed from: d */
    private C3489yj f5086d;

    /* renamed from: e */
    private C0696e f5087e;

    /* renamed from: f */
    private String f5088f;

    private C0732q(Context context) {
    }

    /* renamed from: a */
    public static C0732q m5973a(Context context) {
        if (f5082g == null) {
            f5082g = new C0732q(context);
        }
        return f5082g;
    }

    /* renamed from: a */
    private void m5974a(String str) {
        HashMap<String, String> m6188f = C0755x1.m6188f(str);
        if (m6188f.size() > 0) {
            m5975a(m6188f.get("id"), false);
            String str2 = m6188f.get("action");
            if (!TextUtils.isEmpty(str2) && !this.f5083a.m16298a(str2, false, this.f5086d, this.f5087e, this.f5085c, this.f5084b)) {
                C3440xj m6134a = C0755x1.m6134a(str2, this.f5085c.m14145i());
                if (m6134a != null) {
                    this.f5085c.m14121a(m6134a);
                }
                if (this.f5083a.m16263a(str2, false, false, this.f5085c, false, false, this.f5088f, this.f5084b) > 0) {
                    this.f5083a.m16258E();
                }
            }
        }
        m6188f.clear();
    }

    /* renamed from: a */
    private void m5975a(String str, boolean z) {
        C3531zj m13901f = this.f5084b.m13901f();
        if (TextUtils.isEmpty(str) || m13901f == null) {
            return;
        }
        for (String str2 : str.split(";")) {
            if (str2.startsWith("$") && str2.endsWith("$")) {
                str2 = str2.substring(1, str2.length() - 1);
            }
            C3489yj m16930a = m13901f.m16930a(str2, (Vector<C3489yj>) null);
            if (m16930a != null) {
                if (m16930a.f14208e == 4) {
                    m5979a(m16930a, z);
                } else {
                    AbstractC0652n1 abstractC0652n1 = m16930a.f14197a0;
                    if (abstractC0652n1 != null) {
                        if (z) {
                            abstractC0652n1.mo4147d();
                        } else {
                            m16930a.f14210e1 = true;
                            abstractC0652n1.mo4146c();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m5976b(String str) {
        HashMap<String, String> m6188f = C0755x1.m6188f(str);
        if (m6188f.size() > 0) {
            m5975a(m6188f.get("id"), true);
            String str2 = m6188f.get("action");
            if (!TextUtils.isEmpty(str2) && !this.f5083a.m16298a(str2, false, this.f5086d, this.f5087e, this.f5085c, this.f5084b)) {
                C3440xj m6134a = C0755x1.m6134a(str2, this.f5085c.m14145i());
                if (m6134a != null) {
                    this.f5085c.m14121a(m6134a);
                }
                if (this.f5083a.m16263a(str2, false, false, this.f5085c, false, false, this.f5088f, this.f5084b) > 0) {
                    this.f5083a.m16258E();
                }
            }
            m6188f.clear();
        }
    }

    /* renamed from: a */
    public void m5977a() {
        if (f5082g != null) {
            f5082g = null;
        }
        this.f5086d = null;
        this.f5087e = null;
        this.f5084b = null;
        this.f5085c = null;
        this.f5083a = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m5978a(java.lang.String r1, p000.C3400wj r2, p000.C2945mj r3, p000.C2899lj r4, p000.C3489yj r5, com.comviva.webaxn.utils.C0696e r6) {
        /*
            r0 = this;
            r0.f5083a = r2
            r0.f5085c = r3
            r0.f5084b = r4
            r0.f5086d = r5
            r0.f5087e = r6
            if (r5 == 0) goto L11
            java.lang.String r2 = r5.f14223j
        Le:
            r0.f5088f = r2
            goto L16
        L11:
            if (r6 == 0) goto L16
            java.lang.String r2 = r6.f4718j
            goto Le
        L16:
            java.lang.String r2 = "disable://control?"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L28
            r2 = 18
            java.lang.String r1 = r1.substring(r2)
            r0.m5974a(r1)
            goto L39
        L28:
            java.lang.String r2 = "enable://control?"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L39
            r2 = 17
            java.lang.String r1 = r1.substring(r2)
            r0.m5976b(r1)
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.C0732q.m5978a(java.lang.String, wj, mj, lj, yj, com.comviva.webaxn.utils.e):void");
    }

    /* renamed from: a */
    public void m5979a(C3489yj c3489yj, boolean z) {
        Vector<C2862kj> vector;
        AbstractC0652n1 abstractC0652n1;
        Vector<C2862kj> vector2;
        int i = c3489yj.f14178R;
        int i2 = 0;
        if (i == 2) {
            if (!this.f5084b.f11887g.containsKey(c3489yj.f14186V) || (vector2 = this.f5084b.f11887g.get(c3489yj.f14186V)) == null) {
                return;
            }
            while (i2 < vector2.size()) {
                C3489yj c3489yj2 = vector2.elementAt(i2).f11759d;
                AbstractC0652n1 abstractC0652n12 = c3489yj2.f14197a0;
                if (abstractC0652n12 != null) {
                    if (z) {
                        abstractC0652n12.mo4147d();
                    } else {
                        c3489yj2.f14210e1 = true;
                        abstractC0652n12.mo4146c();
                    }
                }
                i2++;
            }
            return;
        }
        if (i != 4 && i != 3) {
            if (i != 1 || (abstractC0652n1 = c3489yj.f14197a0) == null) {
                return;
            }
            if (z) {
                abstractC0652n1.mo4147d();
                return;
            } else {
                c3489yj.f14210e1 = true;
                abstractC0652n1.mo4146c();
                return;
            }
        }
        if (!this.f5084b.f11889i.containsKey(c3489yj.f14186V) || (vector = this.f5084b.f11889i.get(c3489yj.f14186V)) == null) {
            return;
        }
        while (i2 < vector.size()) {
            C3489yj c3489yj3 = vector.elementAt(i2).f11759d;
            AbstractC0652n1 abstractC0652n13 = c3489yj3.f14197a0;
            if (abstractC0652n13 != null) {
                if (z) {
                    abstractC0652n13.mo4147d();
                } else {
                    c3489yj3.f14210e1 = true;
                    abstractC0652n13.mo4146c();
                }
            }
            i2++;
        }
    }
}
