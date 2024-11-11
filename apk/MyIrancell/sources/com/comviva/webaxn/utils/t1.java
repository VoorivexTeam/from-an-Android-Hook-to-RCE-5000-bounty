package com.comviva.webaxn.utils;

import android.content.Context;
import android.text.TextUtils;
import defpackage.lj;
import defpackage.mj;
import defpackage.wj;
import defpackage.yj;

/* loaded from: classes.dex */
public class t1 {
    private static t1 h;
    private Context a;
    private wj b;
    private mj c;
    lj d;
    private yj e;
    private e f;
    private String g;

    private t1(Context context) {
        this.a = context;
    }

    public static t1 a(Context context) {
        if (h == null) {
            h = new t1(context);
        }
        return h;
    }

    private boolean a(yj yjVar, com.comviva.webaxn.ui.o1 o1Var) {
        String m;
        int i = yjVar.e;
        if (i == 4) {
            com.comviva.webaxn.ui.n1 n1Var = yjVar.a0;
            if ((n1Var instanceof com.comviva.webaxn.ui.s0) || (n1Var instanceof com.comviva.webaxn.ui.t0)) {
                if (!TextUtils.isEmpty(x1.b(yjVar, o1Var))) {
                    return false;
                }
            } else if ((n1Var instanceof com.comviva.webaxn.ui.h) || (n1Var instanceof com.comviva.webaxn.ui.i)) {
                if (!TextUtils.isEmpty(x1.a(yjVar, o1Var))) {
                    return false;
                }
            } else if (n1Var instanceof com.comviva.webaxn.ui.k) {
                if (!TextUtils.isEmpty(x1.b(this.a, yjVar, o1Var))) {
                    return false;
                }
            } else if (!(n1Var instanceof com.comviva.webaxn.ui.l) || !TextUtils.isEmpty(x1.a(this.a, yjVar, o1Var))) {
                return false;
            }
        } else {
            if (i == 3) {
                com.comviva.webaxn.ui.n1 n1Var2 = yjVar.a0;
                if (n1Var2 instanceof com.comviva.webaxn.ui.v) {
                    m = ((com.comviva.webaxn.ui.v) n1Var2).m();
                } else {
                    if (!(n1Var2 instanceof com.comviva.webaxn.ui.w)) {
                        return false;
                    }
                    m = ((com.comviva.webaxn.ui.w) n1Var2).m();
                }
                return TextUtils.isEmpty(m);
            }
            com.comviva.webaxn.ui.n1 n1Var3 = yjVar.a0;
            if ((n1Var3 instanceof com.comviva.webaxn.ui.f) || (n1Var3 instanceof com.comviva.webaxn.ui.g)) {
                if ((yjVar.e != 10 || yjVar.x0 != null) && (yjVar.e != 11 || yjVar.y0 != null)) {
                    return false;
                }
            } else {
                if (!(n1Var3 instanceof com.comviva.webaxn.ui.e0) && !(n1Var3 instanceof com.comviva.webaxn.ui.f0)) {
                    return false;
                }
                if (p1.c) {
                    p1.c = false;
                    return false;
                }
            }
        }
        return true;
    }

    public void a() {
        if (h != null) {
            h = null;
        }
        this.a = null;
        this.b = null;
        this.e = null;
        this.f = null;
        this.d = null;
        this.c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r16, defpackage.wj r17, defpackage.mj r18, defpackage.lj r19, com.comviva.webaxn.ui.o1 r20, defpackage.yj r21, com.comviva.webaxn.utils.e r22) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comviva.webaxn.utils.t1.a(java.lang.String, wj, mj, lj, com.comviva.webaxn.ui.o1, yj, com.comviva.webaxn.utils.e):void");
    }
}
