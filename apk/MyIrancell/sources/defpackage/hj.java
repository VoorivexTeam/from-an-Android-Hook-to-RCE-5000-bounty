package defpackage;

import android.text.TextUtils;
import com.comviva.webaxn.utils.r1;

/* loaded from: classes.dex */
public class hj {
    private String c;
    private r1 g;
    private String a = null;
    private String b = null;
    private String d = null;
    private String e = null;
    private String f = null;

    public String a() {
        return this.f;
    }

    public void a(String str) {
        this.f = str;
    }

    public String b() {
        return this.b;
    }

    public void b(String str) {
        this.b = str;
    }

    public String c() {
        return this.e;
    }

    public void c(String str) {
        this.e = str;
    }

    public String d() {
        return this.d;
    }

    public void d(String str) {
        this.d = str;
    }

    public String e() {
        return this.c;
    }

    public void e(String str) {
        this.c = str;
    }

    public String f() {
        return this.a;
    }

    public void f(String str) {
        this.a = str;
    }

    public r1 g() {
        return this.g;
    }

    public void h() {
        if (TextUtils.isEmpty(this.f) || zi.A == 0) {
            return;
        }
        r1 r1Var = new r1();
        this.g = r1Var;
        r1Var.a(this.f);
    }
}
