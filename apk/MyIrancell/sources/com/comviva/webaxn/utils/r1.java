package com.comviva.webaxn.utils;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;

/* loaded from: classes.dex */
public class r1 {
    private a a;
    private int b = 0;

    public static void a(Context context) {
        a.a(context);
    }

    public void a(int i) {
        this.b = i;
    }

    public void a(String str) {
        if (str.startsWith("apm://24x7?")) {
            HashMap<String, String> f = x1.f(str.substring(11));
            if (f.size() <= 0 || TextUtils.isEmpty(f.get("name"))) {
                return;
            }
            this.a = new a();
            boolean z = false;
            if (!TextUtils.isEmpty(f.get("component")) && f.get("component").equalsIgnoreCase("true")) {
                z = true;
            }
            this.a.a(f.get("name"), z);
            this.b = 1;
        }
    }

    public void a(String str, boolean z) {
        if (this.b != 1) {
            return;
        }
        a aVar = new a();
        this.a = aVar;
        aVar.a(str, z);
    }

    public boolean a() {
        a aVar;
        if (this.b == 1 && (aVar = this.a) != null) {
            return aVar.d();
        }
        return false;
    }

    public boolean b() {
        a aVar;
        if (this.b == 1 && (aVar = this.a) != null) {
            return aVar.a();
        }
        return false;
    }

    public boolean c() {
        a aVar;
        if (this.b == 1 && (aVar = this.a) != null) {
            return aVar.b();
        }
        return false;
    }

    public boolean d() {
        a aVar;
        if (this.b == 1 && (aVar = this.a) != null) {
            return aVar.c();
        }
        return false;
    }

    public void e() {
        a aVar;
        if (this.b == 1 && (aVar = this.a) != null) {
            aVar.e();
        }
    }

    public void f() {
        a aVar;
        if (this.b == 1 && (aVar = this.a) != null) {
            aVar.f();
        }
    }

    public void g() {
        a aVar;
        if (this.b == 1 && (aVar = this.a) != null) {
            aVar.g();
        }
    }

    public void h() {
        a aVar;
        if (this.b == 1 && (aVar = this.a) != null) {
            aVar.h();
        }
    }

    public void i() {
        a aVar;
        if (this.b == 1 && (aVar = this.a) != null) {
            aVar.i();
        }
    }

    public void j() {
        a aVar;
        if (this.b == 1 && (aVar = this.a) != null) {
            aVar.j();
            this.a.i();
        }
    }
}
