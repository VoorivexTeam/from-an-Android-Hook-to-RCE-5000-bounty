package com.comviva.webaxn.utils;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import defpackage.lj;
import defpackage.mj;
import defpackage.wj;
import defpackage.xj;
import defpackage.yj;
import java.util.HashMap;
import java.util.Vector;

/* loaded from: classes.dex */
public class o0 {
    private static o0 k;
    private Context a;
    private yj b;
    private e c;
    private lj d;
    private mj e;
    private wj f;
    private HashMap<String, String> g;
    private int h = -1;
    private boolean i = false;
    private ProgressDialog j;

    private o0(Context context) {
        this.a = context;
    }

    public static o0 a(Context context) {
        if (k == null) {
            k = new o0(context);
        }
        return k;
    }

    private void a(String str, String str2) {
        com.comviva.webaxn.ui.n1 n1Var;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.startsWith("$")) {
            str = str.substring(1, str.endsWith("$") ? str.length() - 1 : str.length());
        }
        yj a = this.d.f().a(str, (Vector<yj>) null);
        if (a == null || (n1Var = a.a0) == null) {
            if (this.d.f().r == null || !this.d.f().r.containsKey(str)) {
                return;
            }
            this.d.f().a(str, str2);
            return;
        }
        if (n1Var instanceof com.comviva.webaxn.ui.v) {
            ((com.comviva.webaxn.ui.v) n1Var).f(str2);
        } else if (n1Var instanceof com.comviva.webaxn.ui.w) {
            ((com.comviva.webaxn.ui.w) n1Var).h(str2);
        }
    }

    public void a() {
        int i = this.h;
        if (i == 1) {
            i0.b().a(this.a);
        } else if (i == 2) {
            l0.b().a();
        }
        HashMap<String, String> hashMap = this.g;
        if (hashMap != null) {
            hashMap.clear();
            this.g = null;
        }
        this.a = null;
        this.f = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        if (k != null) {
            k = null;
        }
    }

    public void a(int i, int i2, Intent intent, String str, boolean z) {
        if (this.i) {
            if (i != 1) {
                if (this.h == 2) {
                    a(this.g.get("target"), l0.b().a(this.a, i2, intent));
                }
                this.i = false;
            }
            ProgressDialog progressDialog = this.j;
            if (progressDialog != null) {
                progressDialog.dismiss();
                this.j = null;
            }
            a(this.g.get("target"), str);
            a(z);
            this.i = false;
        }
    }

    public void a(yj yjVar, e eVar, wj wjVar, mj mjVar, lj ljVar, String str, int i) {
        this.b = yjVar;
        this.c = eVar;
        this.f = wjVar;
        this.e = mjVar;
        this.d = ljVar;
        HashMap<String, String> hashMap = this.g;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.h = i;
        if (i == 1) {
            this.i = i0.b().b(this.a);
        }
        this.g = x1.f(str);
        if (i == 1) {
            this.j = i0.b().c(this.a, this.g);
        } else {
            if (this.h != 2 || this.i) {
                return;
            }
            l0.b().a(this.a, this.g);
            this.i = true;
        }
    }

    public void a(boolean z) {
        if (TextUtils.isEmpty(this.g.get("action")) || this.f.a(this.g.get("action"), false, this.b, this.c, this.e, this.d)) {
            return;
        }
        xj a = x1.a(this.g.get("action"), this.e.i());
        if (a != null) {
            this.e.a(a);
        }
        String str = null;
        yj yjVar = this.b;
        if (yjVar != null) {
            str = yjVar.j;
        } else {
            e eVar = this.c;
            if (eVar != null) {
                str = eVar.j;
            }
        }
        if (this.f.a(this.g.get("action"), false, false, this.e, false, false, str, this.d) <= 0 || !z) {
            return;
        }
        this.f.E();
    }

    public boolean b() {
        return this.i;
    }

    public void c() {
        this.i = false;
    }
}
