package com.comviva.webaxn.utils;

import android.content.Context;
import android.text.TextUtils;
import defpackage.lj;
import defpackage.mj;
import defpackage.wj;
import defpackage.xj;
import defpackage.yj;
import java.util.HashMap;
import java.util.Vector;

/* loaded from: classes.dex */
public class s0 {
    private static s0 g;
    private HashMap<String, String> a;
    private yj b;
    private e c;
    private mj d;
    private wj e;
    private lj f;

    private s0(Context context) {
    }

    public static s0 a(Context context) {
        if (g == null) {
            g = new s0(context);
        }
        return g;
    }

    public void a() {
        if (g != null) {
            g = null;
        }
        HashMap<String, String> hashMap = this.a;
        if (hashMap != null) {
            hashMap.clear();
            this.a = null;
        }
        this.e = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.f = null;
    }

    public void a(yj yjVar, e eVar, wj wjVar, mj mjVar, lj ljVar, String str) {
        com.comviva.webaxn.ui.n1 n1Var;
        this.b = yjVar;
        this.c = eVar;
        this.e = wjVar;
        this.d = mjVar;
        this.f = ljVar;
        HashMap<String, String> hashMap = this.a;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashMap<String, String> f = x1.f(str);
        this.a = f;
        String str2 = null;
        if (f.size() > 0 && this.f.f() != null) {
            String str3 = this.a.get("id");
            if (!TextUtils.isEmpty(str3)) {
                if (str3.startsWith("$") && str3.endsWith("$")) {
                    str3 = str3.substring(1, str3.length() - 1);
                }
                yj a = this.f.f().a(str3, (Vector<yj>) null);
                if (a != null && (n1Var = a.a0) != null) {
                    if (n1Var instanceof com.comviva.webaxn.ui.w) {
                        com.comviva.webaxn.ui.w wVar = (com.comviva.webaxn.ui.w) n1Var;
                        wVar.t();
                        wVar.g(wVar.m().length());
                    } else if (n1Var instanceof com.comviva.webaxn.ui.v) {
                        com.comviva.webaxn.ui.v vVar = (com.comviva.webaxn.ui.v) n1Var;
                        vVar.s();
                        vVar.g(vVar.m().length());
                    }
                }
            }
        }
        String str4 = this.a.get("action");
        if (TextUtils.isEmpty(str4) || this.e.a(str4, false, this.b, this.c, this.d, this.f)) {
            return;
        }
        xj a2 = x1.a(str4, this.d.i());
        if (a2 != null) {
            this.d.a(a2);
        }
        yj yjVar2 = this.b;
        if (yjVar2 != null) {
            str2 = yjVar2.j;
        } else {
            e eVar2 = this.c;
            if (eVar2 != null) {
                str2 = eVar2.j;
            }
        }
        if (this.e.a(str4, false, false, this.d, false, false, str2, this.f) > 0) {
            this.e.E();
        }
    }
}
