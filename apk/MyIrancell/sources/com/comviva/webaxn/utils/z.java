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
public class z {
    private static z i;
    private Context a;
    private wj b;
    private lj c;
    private mj d;
    private yj e;
    private e f;
    private String g;
    private HashMap<String, String> h;

    private z(Context context) {
        this.a = context;
    }

    public static z a(Context context) {
        if (i == null) {
            i = new z(context);
        }
        return i;
    }

    public void a() {
        if (i != null) {
            i = null;
        }
        HashMap<String, String> hashMap = this.h;
        if (hashMap != null) {
            hashMap.clear();
            this.h = null;
        }
        this.a = null;
        this.b = null;
        this.e = null;
        this.f = null;
        this.c = null;
        this.d = null;
    }

    public void a(String str, String str2) {
        com.comviva.webaxn.ui.n1 n1Var;
        if (str.startsWith("$")) {
            str = str.substring(1, str.endsWith("$") ? str.length() - 1 : str.length());
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        yj a = this.c.f().a(str, (Vector<yj>) null);
        if (a == null || (n1Var = a.a0) == null) {
            if (this.c.f().r == null || !this.c.f().r.containsKey(str)) {
                return;
            }
            this.c.f().a(str, str2);
            return;
        }
        if (n1Var instanceof com.comviva.webaxn.ui.v) {
            ((com.comviva.webaxn.ui.v) n1Var).f(str2);
        } else if (n1Var instanceof com.comviva.webaxn.ui.w) {
            ((com.comviva.webaxn.ui.w) n1Var).h(str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r14, defpackage.wj r15, defpackage.mj r16, defpackage.lj r17, defpackage.yj r18, com.comviva.webaxn.utils.e r19, com.comviva.webaxn.ui.o1 r20) {
        /*
            r13 = this;
            r0 = r13
            r1 = r18
            r2 = r19
            r3 = r15
            r0.b = r3
            r3 = r16
            r0.d = r3
            r3 = r17
            r0.c = r3
            r0.e = r1
            r0.f = r2
            if (r1 == 0) goto L1b
            java.lang.String r1 = r1.j
        L18:
            r0.g = r1
            goto L20
        L1b:
            if (r2 == 0) goto L20
            java.lang.String r1 = r2.j
            goto L18
        L20:
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.h
            if (r1 == 0) goto L27
            r1.clear()
        L27:
            java.util.HashMap r1 = com.comviva.webaxn.utils.x1.f(r14)
            r0.h = r1
            int r1 = r1.size()
            if (r1 <= 0) goto Le3
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.h
            java.lang.String r2 = "msisdn"
            java.lang.Object r1 = r1.get(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L54
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.h
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            android.content.Context r2 = r0.a
            java.lang.String r2 = com.comviva.webaxn.utils.k.k(r2)
            r13.a(r1, r2)
        L54:
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.h
            java.lang.String r2 = "email"
            java.lang.Object r1 = r1.get(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L75
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.h
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            android.content.Context r2 = r0.a
            java.lang.String r2 = com.comviva.webaxn.utils.k.n(r2)
            r13.a(r1, r2)
        L75:
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.h
            java.lang.String r2 = "action"
            java.lang.Object r1 = r1.get(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Le3
            wj r1 = r0.b
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r0.h
            java.lang.Object r3 = r3.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            r4 = 0
            yj r5 = r0.e
            com.comviva.webaxn.utils.e r6 = r0.f
            mj r7 = r0.d
            lj r8 = r0.c
            r14 = r1
            r15 = r3
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r8
            boolean r1 = r14.a(r15, r16, r17, r18, r19, r20)
            if (r1 != 0) goto Le3
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.h
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            mj r3 = r0.d
            java.util.Vector r3 = r3.i()
            xj r1 = com.comviva.webaxn.utils.x1.a(r1, r3)
            if (r1 == 0) goto Lc3
            mj r3 = r0.d
            r3.a(r1)
        Lc3:
            wj r4 = r0.b
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.h
            java.lang.Object r1 = r1.get(r2)
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            r6 = 0
            r7 = 0
            mj r8 = r0.d
            r9 = 0
            r10 = 0
            java.lang.String r11 = r0.g
            lj r12 = r0.c
            int r1 = r4.a(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r1 <= 0) goto Le3
            wj r1 = r0.b
            r1.E()
        Le3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.z.a(java.lang.String, wj, mj, lj, yj, com.comviva.webaxn.utils.e, com.comviva.webaxn.ui.o1):void");
    }
}
