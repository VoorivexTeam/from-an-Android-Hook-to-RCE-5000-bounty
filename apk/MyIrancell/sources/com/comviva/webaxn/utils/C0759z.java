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
import p000.C3489yj;

/* renamed from: com.comviva.webaxn.utils.z */
/* loaded from: classes.dex */
public class C0759z {

    /* renamed from: i */
    private static C0759z f5325i;

    /* renamed from: a */
    private Context f5326a;

    /* renamed from: b */
    private C3400wj f5327b;

    /* renamed from: c */
    private C2899lj f5328c;

    /* renamed from: d */
    private C2945mj f5329d;

    /* renamed from: e */
    private C3489yj f5330e;

    /* renamed from: f */
    private C0696e f5331f;

    /* renamed from: g */
    private String f5332g;

    /* renamed from: h */
    private HashMap<String, String> f5333h;

    private C0759z(Context context) {
        this.f5326a = context;
    }

    /* renamed from: a */
    public static C0759z m6223a(Context context) {
        if (f5325i == null) {
            f5325i = new C0759z(context);
        }
        return f5325i;
    }

    /* renamed from: a */
    public void m6224a() {
        if (f5325i != null) {
            f5325i = null;
        }
        HashMap<String, String> hashMap = this.f5333h;
        if (hashMap != null) {
            hashMap.clear();
            this.f5333h = null;
        }
        this.f5326a = null;
        this.f5327b = null;
        this.f5330e = null;
        this.f5331f = null;
        this.f5328c = null;
        this.f5329d = null;
    }

    /* renamed from: a */
    public void m6225a(String str, String str2) {
        AbstractC0652n1 abstractC0652n1;
        if (str.startsWith("$")) {
            str = str.substring(1, str.endsWith("$") ? str.length() - 1 : str.length());
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C3489yj m16930a = this.f5328c.m13901f().m16930a(str, (Vector<C3489yj>) null);
        if (m16930a == null || (abstractC0652n1 = m16930a.f14197a0) == null) {
            if (this.f5328c.m13901f().f14519r == null || !this.f5328c.m13901f().f14519r.containsKey(str)) {
                return;
            }
            this.f5328c.m13901f().m16931a(str, str2);
            return;
        }
        if (abstractC0652n1 instanceof C0668v) {
            ((C0668v) abstractC0652n1).m5029f(str2);
        } else if (abstractC0652n1 instanceof C0670w) {
            ((C0670w) abstractC0652n1).m5093h(str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m6226a(java.lang.String r14, p000.C3400wj r15, p000.C2945mj r16, p000.C2899lj r17, p000.C3489yj r18, com.comviva.webaxn.utils.C0696e r19, com.comviva.webaxn.p002ui.C0655o1 r20) {
        /*
            r13 = this;
            r0 = r13
            r1 = r18
            r2 = r19
            r3 = r15
            r0.f5327b = r3
            r3 = r16
            r0.f5329d = r3
            r3 = r17
            r0.f5328c = r3
            r0.f5330e = r1
            r0.f5331f = r2
            if (r1 == 0) goto L1b
            java.lang.String r1 = r1.f14223j
        L18:
            r0.f5332g = r1
            goto L20
        L1b:
            if (r2 == 0) goto L20
            java.lang.String r1 = r2.f4718j
            goto L18
        L20:
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.f5333h
            if (r1 == 0) goto L27
            r1.clear()
        L27:
            java.util.HashMap r1 = com.comviva.webaxn.utils.C0755x1.m6188f(r14)
            r0.f5333h = r1
            int r1 = r1.size()
            if (r1 <= 0) goto Le3
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.f5333h
            java.lang.String r2 = "msisdn"
            java.lang.Object r1 = r1.get(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L54
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.f5333h
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            android.content.Context r2 = r0.f5326a
            java.lang.String r2 = com.comviva.webaxn.utils.C0714k.m5774k(r2)
            r13.m6225a(r1, r2)
        L54:
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.f5333h
            java.lang.String r2 = "email"
            java.lang.Object r1 = r1.get(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L75
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.f5333h
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            android.content.Context r2 = r0.f5326a
            java.lang.String r2 = com.comviva.webaxn.utils.C0714k.m5777n(r2)
            r13.m6225a(r1, r2)
        L75:
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.f5333h
            java.lang.String r2 = "action"
            java.lang.Object r1 = r1.get(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Le3
            wj r1 = r0.f5327b
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r0.f5333h
            java.lang.Object r3 = r3.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            r4 = 0
            yj r5 = r0.f5330e
            com.comviva.webaxn.utils.e r6 = r0.f5331f
            mj r7 = r0.f5329d
            lj r8 = r0.f5328c
            r14 = r1
            r15 = r3
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r8
            boolean r1 = r14.m16298a(r15, r16, r17, r18, r19, r20)
            if (r1 != 0) goto Le3
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.f5333h
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            mj r3 = r0.f5329d
            java.util.Vector r3 = r3.m14145i()
            xj r1 = com.comviva.webaxn.utils.C0755x1.m6134a(r1, r3)
            if (r1 == 0) goto Lc3
            mj r3 = r0.f5329d
            r3.m14121a(r1)
        Lc3:
            wj r4 = r0.f5327b
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.f5333h
            java.lang.Object r1 = r1.get(r2)
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            r6 = 0
            r7 = 0
            mj r8 = r0.f5329d
            r9 = 0
            r10 = 0
            java.lang.String r11 = r0.f5332g
            lj r12 = r0.f5328c
            int r1 = r4.m16263a(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r1 <= 0) goto Le3
            wj r1 = r0.f5327b
            r1.m16258E()
        Le3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.C0759z.m6226a(java.lang.String, wj, mj, lj, yj, com.comviva.webaxn.utils.e, com.comviva.webaxn.ui.o1):void");
    }
}
