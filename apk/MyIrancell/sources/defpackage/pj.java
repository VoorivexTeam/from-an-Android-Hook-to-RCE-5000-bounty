package defpackage;

import android.text.TextUtils;
import com.comviva.webaxn.utils.r1;
import com.comviva.webaxn.utils.u;

/* loaded from: classes.dex */
public class pj {
    private String a = null;
    private String b = null;
    private String c = null;
    private String d = null;
    private String e = null;
    private String f = null;
    private String g = null;
    private r1 h;

    public String a() {
        return this.a;
    }

    public void a(u uVar) {
    }

    public void a(String str) {
        this.a = str;
    }

    public void a(byte[] bArr) {
    }

    public String b() {
        return this.f;
    }

    public void b(String str) {
        this.f = str;
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
        return this.b;
    }

    public void e(String str) {
        this.b = str;
    }

    public String f() {
        return this.c;
    }

    public void f(String str) {
    }

    public r1 g() {
        return this.h;
    }

    public void g(String str) {
        this.c = str;
    }

    public void h() {
        if (TextUtils.isEmpty(this.g) || zi.A == 0) {
            return;
        }
        r1 r1Var = new r1();
        this.h = r1Var;
        r1Var.a(this.g);
    }

    public void h(String str) {
        this.g = str;
    }
}
