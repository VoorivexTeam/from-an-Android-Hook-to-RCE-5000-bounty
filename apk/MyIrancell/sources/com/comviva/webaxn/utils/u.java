package com.comviva.webaxn.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import defpackage.nj;

/* loaded from: classes.dex */
public class u {
    Context a;
    private float h;
    private float i;
    private String j;
    public float e = -1.0f;
    private int f = -16777216;
    private boolean b = false;
    private int k = 0;
    private int g = -1;
    private boolean l = false;
    private boolean c = false;
    private boolean d = false;
    private String m = "Poppins-Regular.ttf";

    public u(Context context, float f) {
        this.a = context;
    }

    public String a() {
        return this.j;
    }

    public void a(float f) {
        if (-1.0f == f) {
            f = j1.a(this.a).J();
            if (-1.0f == f) {
                f = j1.a(this.a).u();
            }
        }
        this.h = f;
    }

    public void a(int i) {
        this.l = true;
        this.k = x1.a(i);
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.j = null;
        } else {
            this.j = new String(str);
        }
    }

    public void a(boolean z) {
        this.l = z;
    }

    public int b() {
        return this.k;
    }

    public void b(float f) {
        if (-1.0f == f) {
            f = j1.a(this.a).K();
            if (-1.0f == f) {
                f = j1.a(this.a).v();
            }
        }
        this.i = f;
    }

    public void b(int i) {
        this.f = x1.a(i);
        this.b = true;
    }

    public void b(String str) {
        this.m = str;
    }

    public void b(boolean z) {
        this.b = z;
    }

    public int c() {
        return this.f;
    }

    public void c(int i) {
        if (-1 == i && -1 == (i = j1.a(this.a).L())) {
            i = j1.a(this.a).w();
        }
        if (-1 == i) {
            i = nj.a;
        }
        this.c = true;
        this.e = i;
    }

    public float d() {
        return this.h;
    }

    public void d(int i) {
        if (-1 == i && -1 == (i = j1.a(this.a).M())) {
            i = j1.a(this.a).x();
        }
        if (-1 == i) {
            i = 0;
        }
        this.d = true;
        this.g = i;
    }

    public float e() {
        return this.i;
    }

    public float f() {
        return x1.a(this.a, this.e);
    }

    public int g() {
        return this.g;
    }

    public Typeface h() {
        if (TextUtils.isEmpty(this.m)) {
            String N = j1.a(this.a).N();
            this.m = N;
            if (TextUtils.isEmpty(N)) {
                this.m = j1.a(this.a).y();
            }
        }
        if (!TextUtils.isEmpty(this.m)) {
            try {
                return v.a(this.m);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public String i() {
        return this.m;
    }

    public boolean j() {
        return this.l;
    }

    public boolean k() {
        return this.b;
    }

    public boolean l() {
        return this.c;
    }

    public boolean m() {
        return this.d;
    }
}
