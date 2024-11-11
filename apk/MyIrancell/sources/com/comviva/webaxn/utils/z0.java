package com.comviva.webaxn.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import defpackage.lj;
import defpackage.mj;
import defpackage.wj;
import defpackage.xj;
import defpackage.yj;
import java.util.HashMap;
import java.util.Vector;

/* loaded from: classes.dex */
public class z0 {
    private static z0 h;
    private Context a;
    private wj b;
    private mj c;
    private lj d;
    private yj e;
    private e f;
    private HashMap<String, String> g;

    private z0(Context context) {
        this.a = context;
    }

    public static z0 a(Context context) {
        if (h == null) {
            h = new z0(context);
        }
        return h;
    }

    private void a(String str) {
        com.comviva.webaxn.ui.n1 n1Var;
        String o;
        String n;
        String o2;
        ImageView e;
        if (this.d.f() != null) {
            Drawable drawable = null;
            yj a = this.d.f().a(str, (Vector<yj>) null);
            if (a == null || (n1Var = a.a0) == null) {
                return;
            }
            if (n1Var instanceof com.comviva.webaxn.ui.w) {
                ((com.comviva.webaxn.ui.w) n1Var).a(a.R, false);
            } else if (n1Var instanceof com.comviva.webaxn.ui.v) {
                ((com.comviva.webaxn.ui.v) n1Var).a(a.R, false);
            } else if (n1Var instanceof com.comviva.webaxn.ui.h0) {
                com.comviva.webaxn.ui.h0 h0Var = (com.comviva.webaxn.ui.h0) n1Var;
                if (h0Var.p()) {
                    h0Var.b(false);
                    o2 = h0Var.o();
                } else {
                    o2 = this.g.get("toggle_text");
                    h0Var.b(true);
                }
                h0Var.c(a.n);
                if (!TextUtils.isEmpty(o2)) {
                    h0Var.d(o2);
                }
            } else if (n1Var instanceof com.comviva.webaxn.ui.i0) {
                com.comviva.webaxn.ui.i0 i0Var = (com.comviva.webaxn.ui.i0) n1Var;
                if (i0Var.o()) {
                    i0Var.b(false);
                    n = i0Var.n();
                } else {
                    n = this.g.get("toggle_text");
                    i0Var.b(true);
                }
                i0Var.d(a.n);
                if (!TextUtils.isEmpty(n)) {
                    i0Var.b(n);
                }
            } else if (n1Var instanceof com.comviva.webaxn.ui.g0) {
                com.comviva.webaxn.ui.g0 g0Var = (com.comviva.webaxn.ui.g0) n1Var;
                if (g0Var.p()) {
                    g0Var.b(false);
                    o = g0Var.o();
                } else {
                    o = this.g.get("toggle_text");
                    g0Var.b(true);
                }
                g0Var.c(g0Var.m());
                if (!TextUtils.isEmpty(o)) {
                    g0Var.b(o);
                }
            }
            com.comviva.webaxn.ui.n1 n1Var2 = a.a0;
            if (n1Var2 instanceof com.comviva.webaxn.ui.e0) {
                com.comviva.webaxn.ui.e0 e0Var = (com.comviva.webaxn.ui.e0) n1Var2;
                if (e0Var.o()) {
                    e0Var.a(false);
                    drawable = e0Var.n();
                } else {
                    if (e0Var.n() == null) {
                        String str2 = this.g.get("toggle_img");
                        if (!TextUtils.isEmpty(str2)) {
                            drawable = x1.b(this.a, str2);
                        }
                    } else {
                        drawable = e0Var.n();
                    }
                    e0Var.a(true);
                }
                e0Var.a(e0Var.e().getDrawable());
                if (drawable == null) {
                    return;
                } else {
                    e = e0Var.e();
                }
            } else {
                if (!(n1Var2 instanceof com.comviva.webaxn.ui.f0)) {
                    return;
                }
                com.comviva.webaxn.ui.f0 f0Var = (com.comviva.webaxn.ui.f0) n1Var2;
                if (f0Var.o()) {
                    f0Var.a(false);
                    drawable = f0Var.m();
                } else {
                    if (f0Var.m() == null) {
                        String str3 = this.g.get("toggle_img");
                        if (!TextUtils.isEmpty(str3)) {
                            drawable = x1.b(this.a, str3);
                        }
                    } else {
                        drawable = f0Var.m();
                    }
                    f0Var.a(true);
                }
                f0Var.a(f0Var.e().getDrawable());
                if (drawable == null) {
                    return;
                } else {
                    e = f0Var.e();
                }
            }
            e.setImageDrawable(drawable);
        }
    }

    public void a() {
        this.a = null;
        this.b = null;
        this.e = null;
        this.f = null;
        this.d = null;
        this.c = null;
        if (h != null) {
            h = null;
        }
    }

    public void a(String str, wj wjVar, mj mjVar, lj ljVar, yj yjVar, e eVar, com.comviva.webaxn.ui.o1 o1Var) {
        this.b = wjVar;
        this.c = mjVar;
        this.d = ljVar;
        this.e = yjVar;
        this.f = eVar;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        HashMap<String, String> hashMap = this.g;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashMap<String, String> f = x1.f(str);
        this.g = f;
        if (f.size() > 0) {
            String str2 = this.g.get("type");
            if (!TextUtils.isEmpty(str2) && str2.equalsIgnoreCase("pwd")) {
                for (String str3 : this.g.get("target").trim().split(";")) {
                    if (!TextUtils.isEmpty(str3)) {
                        if (str3.startsWith("$")) {
                            str3 = str3.substring(1, str3.endsWith("$") ? str3.length() - 1 : str3.length());
                        }
                        a(str3);
                    }
                }
            }
            b();
        }
    }

    public void b() {
        if (TextUtils.isEmpty(this.g.get("action")) || this.b.a(this.g.get("action"), false, this.e, this.f, this.c, this.d)) {
            return;
        }
        xj a = x1.a(this.g.get("action"), this.c.i());
        if (a != null) {
            this.c.a(a);
        }
        String str = null;
        yj yjVar = this.e;
        if (yjVar != null) {
            str = yjVar.j;
        } else {
            e eVar = this.f;
            if (eVar != null) {
                str = eVar.j;
            }
        }
        if (this.b.a(this.g.get("action"), false, false, this.c, false, false, str, this.d) > 0) {
            this.b.E();
        }
    }
}
