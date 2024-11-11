package com.comviva.webaxn.utils;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import defpackage.lj;
import defpackage.mj;
import defpackage.wj;
import defpackage.yj;
import java.util.HashMap;
import java.util.Vector;

/* loaded from: classes.dex */
public class e0 {
    private static e0 i;
    private Context a;
    private HashMap<String, String> b;
    private lj c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;

    private e0(Context context) {
        this.a = context;
    }

    public static e0 a(Context context) {
        if (i == null) {
            i = new e0(context);
        }
        return i;
    }

    public String a(String str) {
        com.comviva.webaxn.ui.n1 n1Var;
        if (!TextUtils.isEmpty(str)) {
            if (!str.startsWith("$") || !str.endsWith("$")) {
                return str;
            }
            String substring = str.substring(1, str.length() - 1);
            if (this.c.f() != null) {
                yj a = this.c.f().a(substring, (Vector<yj>) null);
                if (a == null || (n1Var = a.a0) == null) {
                    if (this.c.f().r != null) {
                        return this.c.f().r.get(substring);
                    }
                } else {
                    if (n1Var instanceof com.comviva.webaxn.ui.w) {
                        return ((com.comviva.webaxn.ui.w) n1Var).m();
                    }
                    if (n1Var instanceof com.comviva.webaxn.ui.v) {
                        return ((com.comviva.webaxn.ui.v) n1Var).m();
                    }
                }
            }
        }
        return null;
    }

    public void a() {
        if (i != null) {
            i = null;
        }
        HashMap<String, String> hashMap = this.b;
        if (hashMap != null) {
            hashMap.clear();
            this.b = null;
        }
        this.a = null;
        this.c = null;
    }

    public void a(yj yjVar, e eVar, wj wjVar, mj mjVar, lj ljVar, String str) {
        this.c = ljVar;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        b(str);
    }

    public void b() {
        p1.a(this.a, this.d, this.e, this.f, this.g, this.h);
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
            this.d = a(this.b.get("to"));
            this.e = a(this.b.get("cc"));
            this.f = a(this.b.get("bcc"));
            this.g = Uri.decode(a(this.b.get("subject")));
            this.h = Uri.decode(a(this.b.get("body")));
        }
    }
}
