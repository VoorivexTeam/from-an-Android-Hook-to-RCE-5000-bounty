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
public class g {
    private static g e;
    private Context a;
    private HashMap<String, String> b;
    private String c;
    private lj d;

    private g(Context context) {
        this.a = context;
    }

    public static g a(Context context) {
        if (e == null) {
            e = new g(context);
        }
        return e;
    }

    public String a(String str) {
        com.comviva.webaxn.ui.n1 n1Var;
        if (!TextUtils.isEmpty(str)) {
            if (!str.startsWith("$") || !str.endsWith("$")) {
                return str;
            }
            String substring = str.substring(1, str.length() - 1);
            if (this.d.f() != null) {
                yj a = this.d.f().a(substring, (Vector<yj>) null);
                if (a == null || (n1Var = a.a0) == null) {
                    if (this.d.f().r != null) {
                        return this.d.f().r.get(substring);
                    }
                } else {
                    if (n1Var instanceof com.comviva.webaxn.ui.w) {
                        return ((com.comviva.webaxn.ui.w) n1Var).m();
                    }
                    if (n1Var instanceof com.comviva.webaxn.ui.v) {
                        return ((com.comviva.webaxn.ui.v) n1Var).m();
                    }
                    if ((n1Var instanceof com.comviva.webaxn.ui.i0) || (n1Var instanceof com.comviva.webaxn.ui.h0) || (n1Var instanceof com.comviva.webaxn.ui.g0)) {
                        return a.n;
                    }
                }
            }
        }
        return null;
    }

    public void a() {
        p1.a(this.a, this.c);
    }

    public void a(yj yjVar, e eVar, wj wjVar, mj mjVar, lj ljVar, String str) {
        this.d = ljVar;
        this.c = null;
        b(str);
    }

    public void b() {
        if (e != null) {
            e = null;
        }
        HashMap<String, String> hashMap = this.b;
        if (hashMap != null) {
            hashMap.clear();
            this.b = null;
        }
        this.a = null;
        this.d = null;
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        HashMap<String, String> hashMap = this.b;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashMap<String, String> f = x1.f(str);
        this.b = f;
        if (f.size() > 0) {
            this.c = a(this.b.get("text"));
        }
    }
}
