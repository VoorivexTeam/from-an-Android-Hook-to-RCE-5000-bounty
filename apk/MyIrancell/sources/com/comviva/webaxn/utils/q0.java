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
public class q0 {
    private static q0 h;
    private Context a;
    private HashMap<String, String> b;
    private yj c;
    private e d;
    private lj e;
    private mj f;
    private wj g;

    private q0(Context context) {
        this.a = context;
    }

    public static q0 a(Context context) {
        if (h == null) {
            h = new q0(context);
        }
        return h;
    }

    private void b() {
        com.comviva.webaxn.ui.n1 n1Var;
        String str;
        yj.a aVar;
        ImageView e;
        String str2 = this.b.get("id");
        String str3 = this.b.get("resimg");
        boolean z = false;
        if (!TextUtils.isEmpty(str3)) {
            if (str3.indexOf(".") != -1) {
                str3 = str3.substring(0, str3.indexOf("."));
            }
            if (str3.equals("trans")) {
                z = true;
            }
        }
        if (!TextUtils.isEmpty(str2) && str2.startsWith("$")) {
            str2 = str2.substring(1, str2.endsWith("$") ? str2.length() - 1 : str2.length());
        }
        yj a = this.e.f().a(str2, (Vector<yj>) null);
        if (a != null && (n1Var = a.a0) != null) {
            if (n1Var instanceof com.comviva.webaxn.ui.e0) {
                e = ((com.comviva.webaxn.ui.e0) n1Var).e();
            } else if (n1Var instanceof com.comviva.webaxn.ui.f0) {
                e = ((com.comviva.webaxn.ui.f0) n1Var).e();
            } else if (n1Var instanceof com.comviva.webaxn.ui.v) {
                com.comviva.webaxn.ui.v vVar = (com.comviva.webaxn.ui.v) n1Var;
                if (!TextUtils.isEmpty(str3)) {
                    if (z) {
                        vVar.a(5, (Drawable) null);
                    } else {
                        vVar.a(3, x1.b(this.a, str3));
                    }
                }
            } else if (n1Var instanceof com.comviva.webaxn.ui.w) {
                com.comviva.webaxn.ui.w wVar = (com.comviva.webaxn.ui.w) n1Var;
                if (TextUtils.isEmpty(str3)) {
                    if (!TextUtils.isEmpty(this.b.get("focus"))) {
                        str = this.b.get("focus");
                        if (str.equalsIgnoreCase("true") && a.k1 != null) {
                            aVar = yj.a.FOCUS;
                            wVar.a(aVar, (String) null);
                        }
                        wVar.a((yj.a) null, str);
                    } else if (!TextUtils.isEmpty(this.b.get("filled"))) {
                        str = this.b.get("filled");
                        if (str.equalsIgnoreCase("true") && a.l1 != null) {
                            aVar = yj.a.FILLED;
                            wVar.a(aVar, (String) null);
                        }
                        wVar.a((yj.a) null, str);
                    } else if (!TextUtils.isEmpty(this.b.get("error"))) {
                        str = this.b.get("error");
                        if (str.equalsIgnoreCase("true") && a.m1 != null) {
                            aVar = yj.a.ERROR;
                            wVar.a(aVar, (String) null);
                        }
                        wVar.a((yj.a) null, str);
                    } else if (!TextUtils.isEmpty(this.b.get("normal")) && this.b.get("normal").equalsIgnoreCase("true")) {
                        wVar.a((yj.a) null, (String) null);
                    }
                } else if (z) {
                    wVar.a(5, (Drawable) null);
                } else {
                    wVar.a(3, x1.b(this.a, str3));
                }
            }
            e.setImageDrawable(x1.b(this.a, str3));
        }
        a();
    }

    public void a() {
        if (TextUtils.isEmpty(this.b.get("action")) || this.g.a(this.b.get("action"), false, this.c, this.d, this.f, this.e)) {
            return;
        }
        xj a = x1.a(this.b.get("action"), this.f.i());
        if (a != null) {
            this.f.a(a);
        }
        String str = null;
        yj yjVar = this.c;
        if (yjVar != null) {
            str = yjVar.j;
        } else {
            e eVar = this.d;
            if (eVar != null) {
                str = eVar.j;
            }
        }
        if (this.g.a(this.b.get("action"), false, false, this.f, false, false, str, this.e) > 0) {
            this.g.E();
        }
    }

    public void a(yj yjVar, e eVar, wj wjVar, mj mjVar, lj ljVar, String str) {
        this.c = yjVar;
        this.d = eVar;
        this.g = wjVar;
        this.f = mjVar;
        this.e = ljVar;
        HashMap<String, String> hashMap = this.b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.b = x1.f(str);
        b();
    }
}
