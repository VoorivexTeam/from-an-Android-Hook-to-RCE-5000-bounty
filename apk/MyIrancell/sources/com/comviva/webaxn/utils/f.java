package com.comviva.webaxn.utils;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.comviva.webaxn.utils.x1;
import defpackage.lj;
import defpackage.mj;
import defpackage.wj;
import defpackage.xj;
import defpackage.yj;
import java.util.HashMap;
import java.util.Vector;

/* loaded from: classes.dex */
public class f {
    private static f m;
    private Context a;
    private HashMap<String, String> b;
    private yj c;
    private e d;
    private mj e;
    private lj f;
    private wj g;
    private int h;
    private int i;
    private String j;
    private boolean k;
    private final x1.o l = new a();

    /* loaded from: classes.dex */
    class a implements x1.o {
        a() {
        }

        @Override // com.comviva.webaxn.utils.x1.o
        public void a(boolean z) {
            if (z) {
                f.this.c();
            }
        }
    }

    private f(Context context) {
        this.a = context;
    }

    public static f a(Context context) {
        if (m == null) {
            m = new f(context);
        }
        return m;
    }

    private void b() {
        if (m1.a(this.a, new String[]{"android.permission.READ_CONTACTS"})) {
            c();
            return;
        }
        if (j1.a(this.a).d("android.permission.READ_CONTACTS") == -1) {
            m1.a((Activity) this.a, new String[]{"android.permission.READ_CONTACTS"}, 3);
        } else {
            if (!m1.a(this.a, "android.permission.READ_CONTACTS")) {
                x1.d(this.a, "msg.rpCon");
                return;
            }
            m1.a((Activity) this.a, new String[]{"android.permission.READ_CONTACTS"}, 3);
        }
        this.g.n().a(this.l);
        x1.v = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        HashMap<String, String> f = x1.f(this.j);
        this.b = f;
        if (!this.k) {
            p1.a(this.a, 2002);
            return;
        }
        this.h = 1;
        this.i = 0;
        if (!TextUtils.isEmpty(f.get("min"))) {
            try {
                int parseInt = Integer.parseInt(this.b.get("min"));
                this.h = parseInt;
                if (parseInt == 0) {
                    this.h = 1;
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (!TextUtils.isEmpty(this.b.get("max"))) {
            try {
                this.i = Integer.parseInt(this.b.get("max"));
            } catch (NumberFormatException unused2) {
            }
        }
        p1.a(this.a, this.h, this.i, 2003);
    }

    public HashMap<String, String> a() {
        return this.b;
    }

    public void a(String str, String str2) {
        com.comviva.webaxn.ui.n1 n1Var;
        if (TextUtils.isEmpty(str) || this.b.size() <= 0) {
            return;
        }
        String str3 = this.b.get("target");
        String str4 = null;
        if (!TextUtils.isEmpty(str3) && str3.startsWith("$") && str3.endsWith("$")) {
            String substring = str3.substring(1, str3.length() - 1);
            if (!TextUtils.isEmpty(this.b.get("len"))) {
                try {
                    int parseInt = Integer.parseInt(this.b.get("len"));
                    int length = str.length();
                    if (length > parseInt) {
                        str = str.substring(length - parseInt, str.length());
                    }
                } catch (NumberFormatException unused) {
                }
            }
            if (this.f.f() != null) {
                yj a2 = this.f.f().a(substring, (Vector<yj>) null);
                if (a2 == null || (n1Var = a2.a0) == null) {
                    if (this.f.f().r != null && this.f.f().r.containsKey(substring)) {
                        this.f.f().a(substring, str);
                    }
                } else if (n1Var instanceof com.comviva.webaxn.ui.w) {
                    com.comviva.webaxn.ui.w wVar = (com.comviva.webaxn.ui.w) n1Var;
                    wVar.h(str);
                    wVar.g(str.length());
                } else if (n1Var instanceof com.comviva.webaxn.ui.v) {
                    com.comviva.webaxn.ui.v vVar = (com.comviva.webaxn.ui.v) n1Var;
                    vVar.f(str);
                    vVar.g(str.length());
                }
            }
        }
        String str5 = this.b.get("action");
        if (TextUtils.isEmpty(str5) || !x1.l || this.g.a(str5, false, this.c, this.d, this.e, this.f)) {
            return;
        }
        xj a3 = x1.a(str5, this.e.i());
        if (a3 != null) {
            this.e.a(a3);
        }
        yj yjVar = this.c;
        if (yjVar != null) {
            str4 = yjVar.j;
        } else {
            e eVar = this.d;
            if (eVar != null) {
                str4 = eVar.j;
            }
        }
        if (this.g.a(str5, false, false, this.e, false, false, str4, this.f) > 0) {
            this.g.E();
        }
    }

    public void a(String str, wj wjVar, mj mjVar, lj ljVar, yj yjVar, e eVar, boolean z) {
        this.j = str;
        this.g = wjVar;
        this.c = yjVar;
        this.d = eVar;
        this.e = mjVar;
        this.f = ljVar;
        this.k = z;
        HashMap<String, String> hashMap = this.b;
        if (hashMap != null) {
            hashMap.clear();
        }
        b();
    }
}
