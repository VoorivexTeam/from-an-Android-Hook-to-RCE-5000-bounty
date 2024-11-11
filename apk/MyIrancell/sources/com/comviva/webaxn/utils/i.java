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
public class i {
    private static i i;
    private HashMap<String, String> a;
    public int b;
    public int c;
    private yj d;
    private e e;
    private mj f;
    private lj g;
    private wj h;

    private i(Context context) {
    }

    public static i a(Context context) {
        if (i == null) {
            i = new i(context);
        }
        return i;
    }

    public String a(String str) {
        try {
            int parseInt = str.equals("") ? 0 : Integer.parseInt(str);
            if (parseInt > this.b) {
                parseInt -= this.c;
            }
            if (parseInt < this.b) {
                parseInt = this.b;
            }
            return String.valueOf(parseInt);
        } catch (NumberFormatException unused) {
            return str;
        }
    }

    public void a(yj yjVar, e eVar, wj wjVar, mj mjVar, lj ljVar, String str) {
        this.d = yjVar;
        this.e = eVar;
        this.h = wjVar;
        this.f = mjVar;
        this.g = ljVar;
        this.b = 0;
        this.c = 0;
        HashMap<String, String> hashMap = this.a;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashMap<String, String> f = x1.f(str);
        this.a = f;
        this.c = Integer.parseInt(f.get("step"));
        this.b = Integer.parseInt(this.a.get("limit"));
        b(this.a.get("target"));
        String str2 = this.a.get("action");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if ((this.g.f().r == null || this.g.f().r.get("RELAYOUT_FLAG") == null || !this.g.f().r.get("RELAYOUT_FLAG").equals("1")) && !this.h.a(str2, false, this.d, this.e, this.f, this.g)) {
            String str3 = null;
            yj yjVar2 = this.d;
            if (yjVar2 != null) {
                str3 = yjVar2.j;
            } else {
                e eVar2 = this.e;
                if (eVar2 != null) {
                    str3 = eVar2.j;
                }
            }
            String str4 = str3;
            xj a = x1.a(str2, this.f.i());
            if (a != null) {
                this.f.a(a);
            }
            if (this.h.a(str2, false, false, this.f, false, false, str4, this.g) > 0) {
                this.h.E();
            }
        }
    }

    public String b(String str) {
        com.comviva.webaxn.ui.n1 n1Var;
        if (!TextUtils.isEmpty(str)) {
            if (!str.startsWith("$") || !str.endsWith("$")) {
                return str;
            }
            String substring = str.substring(1, str.length() - 1);
            if (this.g.f() != null) {
                yj a = this.g.f().a(substring, (Vector<yj>) null);
                if (a == null || (n1Var = a.a0) == null) {
                    if (this.g.f().r != null) {
                        return this.g.f().r.get(substring);
                    }
                } else {
                    if (n1Var instanceof com.comviva.webaxn.ui.w) {
                        com.comviva.webaxn.ui.w wVar = (com.comviva.webaxn.ui.w) n1Var;
                        String a2 = a(wVar.m());
                        wVar.h(a2);
                        wVar.g(a2.length());
                        return a2;
                    }
                    if (n1Var instanceof com.comviva.webaxn.ui.v) {
                        com.comviva.webaxn.ui.v vVar = (com.comviva.webaxn.ui.v) n1Var;
                        String a3 = a(vVar.m());
                        vVar.f(a3);
                        vVar.g(a3.length());
                        return a3;
                    }
                    if ((n1Var instanceof com.comviva.webaxn.ui.i0) || (n1Var instanceof com.comviva.webaxn.ui.h0) || (n1Var instanceof com.comviva.webaxn.ui.g0)) {
                        return a.n;
                    }
                }
            }
        }
        return null;
    }
}
