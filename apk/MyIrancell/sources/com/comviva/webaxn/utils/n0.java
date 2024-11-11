package com.comviva.webaxn.utils;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.text.TextUtils;
import com.comviva.webaxn.utils.x1;
import defpackage.eo;
import defpackage.gs;
import defpackage.hs;
import defpackage.ks;
import defpackage.lj;
import defpackage.mj;
import defpackage.wj;
import defpackage.xj;
import defpackage.yj;
import java.util.HashMap;
import java.util.Vector;

/* loaded from: classes.dex */
public class n0 {
    private static n0 n;
    private Context a;
    private HashMap<String, String> b;
    private wj c;
    private yj d;
    private e e;
    private mj f;
    private lj g;
    private String i;
    private w1 k;
    private boolean h = false;
    private int j = 0;
    private boolean l = false;
    private final x1.m m = new c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements hs<Void> {
        a(n0 n0Var) {
        }

        @Override // defpackage.hs
        public void a(Void r1) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements gs {
        b(n0 n0Var) {
        }

        @Override // defpackage.gs
        public void a(Exception exc) {
        }
    }

    /* loaded from: classes.dex */
    class c implements x1.m {
        c() {
        }

        @Override // com.comviva.webaxn.utils.x1.m
        public void a() {
            n0.this.h = false;
            n0.this.b(Uri.decode((String) n0.this.b.get("timeout_act")));
            n0.this.i();
        }

        @Override // com.comviva.webaxn.utils.x1.m
        public void a(String str) {
            n0.this.h = false;
            n0.this.a(str);
            if (n0.this.l) {
                y0.a(n0.this.a).a(false);
            }
            n0.this.i();
        }
    }

    private n0(Context context) {
        this.a = context;
    }

    public static n0 a(Context context) {
        if (n == null) {
            n = new n0(context);
        }
        return n;
    }

    private void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.c.a(Uri.decode(str), false, this.d, this.e, this.f, this.g);
        this.l = true;
    }

    private void f() {
        h();
        c(this.b.get("ctimer"));
        if (!TextUtils.isEmpty(this.b.get("receive_act"))) {
            b(this.b.get("action"));
        }
        this.h = true;
        if (!TextUtils.isEmpty(this.b.get("delimeter"))) {
            this.i = this.b.get("delimeter");
        }
        if (TextUtils.isEmpty(this.b.get("len"))) {
            return;
        }
        try {
            this.j = Integer.parseInt(this.b.get("len"));
        } catch (NumberFormatException unused) {
        }
    }

    private void g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        w1 w1Var = new w1();
        this.k = w1Var;
        this.a.registerReceiver(w1Var, intentFilter);
    }

    private void h() {
        ks<Void> h = eo.a(this.a).h();
        h.a(new a(this));
        h.a(new b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.a.unregisterReceiver(this.k);
    }

    public void a() {
        if (this.h) {
            this.h = false;
            i();
        }
        if (n != null) {
            n = null;
        }
        HashMap<String, String> hashMap = this.b;
        if (hashMap != null) {
            hashMap.clear();
            this.b = null;
        }
        this.a = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.g = null;
        this.f = null;
    }

    public void a(String str) {
        int i;
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (this.b.size() > 0) {
                String[] split = this.b.get("target").trim().split(";");
                String str2 = this.b.get("multi");
                int i2 = 0;
                if (TextUtils.isEmpty(str2)) {
                    int length = split.length;
                    while (i2 < length) {
                        String str3 = split[i2];
                        if (!TextUtils.isEmpty(str3)) {
                            if (str3.startsWith("$") && str3.endsWith("$")) {
                                str3 = str3.substring(1, str3.length() - 1);
                            }
                            a(str3, str);
                        }
                        i2++;
                    }
                } else {
                    try {
                        i = Integer.parseInt(str2);
                    } catch (NumberFormatException unused) {
                        i = 0;
                    }
                    if (i == split.length) {
                        while (i2 < i) {
                            String str4 = split[i2];
                            if (!TextUtils.isEmpty(str4)) {
                                if (str4.startsWith("$") && str4.endsWith("$")) {
                                    str4 = str4.substring(1, str4.length() - 1);
                                }
                                a(str4, str.substring(i2, i2 + 1));
                            }
                            i2++;
                        }
                    }
                }
            }
            b(!TextUtils.isEmpty(this.b.get("receive_act")) ? Uri.decode(this.b.get("receive_act")) : this.b.get("action"));
        } catch (Exception unused2) {
        }
    }

    public void a(String str, String str2) {
        com.comviva.webaxn.ui.n1 n1Var;
        if (this.g.f() != null) {
            yj a2 = this.g.f().a(str, (Vector<yj>) null);
            if (a2 == null || (n1Var = a2.a0) == null) {
                if (this.g.f().r == null || !this.g.f().r.containsKey(str)) {
                    return;
                }
                this.g.f().a(str, str2);
                return;
            }
            if (n1Var instanceof com.comviva.webaxn.ui.w) {
                com.comviva.webaxn.ui.w wVar = (com.comviva.webaxn.ui.w) n1Var;
                wVar.h(str2);
                wVar.g(str2.length());
            } else if (n1Var instanceof com.comviva.webaxn.ui.v) {
                com.comviva.webaxn.ui.v vVar = (com.comviva.webaxn.ui.v) n1Var;
                vVar.f(str2);
                vVar.g(str2.length());
            }
        }
    }

    public void a(String str, wj wjVar, mj mjVar, lj ljVar, yj yjVar, e eVar, boolean z) {
        this.c = wjVar;
        this.d = yjVar;
        this.e = eVar;
        this.f = mjVar;
        this.g = ljVar;
        if (!TextUtils.isEmpty(str)) {
            HashMap<String, String> hashMap = this.b;
            if (hashMap != null) {
                hashMap.clear();
            }
            this.b = x1.f(str);
            this.j = 0;
            this.l = false;
        }
        if (!z || this.b.size() <= 0) {
            return;
        }
        g();
        f();
    }

    public void a(boolean z) {
        if (this.h) {
            this.h = false;
            i();
        }
        if (z) {
            b(this.b.get("action"));
        }
    }

    public String b() {
        return this.i;
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str) || !x1.l || this.c.a(str, false, this.d, this.e, this.f, this.g)) {
            return;
        }
        xj a2 = x1.a(str, this.f.i());
        if (a2 != null) {
            this.f.a(a2);
        }
        String str2 = null;
        yj yjVar = this.d;
        if (yjVar != null) {
            str2 = yjVar.j;
        } else {
            e eVar = this.e;
            if (eVar != null) {
                str2 = eVar.j;
            }
        }
        if (this.c.a(str, false, false, this.f, false, false, str2, this.g) > 0) {
            this.c.E();
        }
    }

    public int c() {
        return this.j;
    }

    public x1.m d() {
        return this.m;
    }

    public boolean e() {
        return this.h;
    }
}
