package com.comviva.webaxn.utils;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import defpackage.lj;
import defpackage.mj;
import defpackage.qr;
import defpackage.wj;
import defpackage.xj;
import defpackage.yj;
import java.util.HashMap;
import java.util.Vector;

/* loaded from: classes.dex */
public class p0 {
    private static p0 h;
    private Context a;
    private yj b;
    private e c;
    private lj d;
    private mj e;
    private wj f;
    private HashMap<String, String> g;

    private p0(Context context) {
        this.a = context;
    }

    public static p0 a(Context context) {
        if (h == null) {
            h = new p0(context);
        }
        return h;
    }

    private void b() {
        try {
            ((Activity) this.a).startActivityForResult(new qr.a().a((Activity) this.a), 2004);
        } catch (com.google.android.gms.common.e unused) {
            Toast.makeText(this.a, "Google Play Services is not available.", 1).show();
        } catch (com.google.android.gms.common.f e) {
            com.google.android.gms.common.g.a(e.a(), (Activity) this.a, 0);
        }
    }

    public void a() {
        if (h != null) {
            h = null;
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
    }

    public void a(com.google.android.gms.location.places.a aVar) {
        com.comviva.webaxn.ui.n1 n1Var;
        StringBuilder sb = new StringBuilder();
        if (aVar != null) {
            sb.append(aVar.h().b);
            sb.append(",");
            sb.append(aVar.h().c);
            if (aVar.f() != null) {
                sb.append(",");
                sb.append(Uri.encode(aVar.f().toString()));
            }
        }
        String str = this.g.get("target");
        if (TextUtils.isEmpty(str) || this.d.f() == null) {
            return;
        }
        if (str.startsWith("$")) {
            str = str.substring(1, str.endsWith("$") ? str.length() - 1 : str.length());
        }
        yj a = this.d.f().a(str, (Vector<yj>) null);
        if (a == null || (n1Var = a.a0) == null) {
            if (this.d.f().r != null && this.d.f().r.containsKey(str)) {
                this.d.f().a(str, sb.toString());
            }
        } else if (n1Var instanceof com.comviva.webaxn.ui.w) {
            com.comviva.webaxn.ui.w wVar = (com.comviva.webaxn.ui.w) n1Var;
            wVar.h(sb.toString());
            wVar.g(sb.toString().length());
        } else if (n1Var instanceof com.comviva.webaxn.ui.v) {
            com.comviva.webaxn.ui.v vVar = (com.comviva.webaxn.ui.v) n1Var;
            vVar.f(sb.toString());
            vVar.g(sb.toString().length());
        }
        a(true);
    }

    public void a(yj yjVar, e eVar, wj wjVar, mj mjVar, lj ljVar, String str) {
        this.b = yjVar;
        this.c = eVar;
        this.f = wjVar;
        this.e = mjVar;
        this.d = ljVar;
        HashMap<String, String> hashMap = this.g;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.g = x1.f(str);
        b();
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
}
