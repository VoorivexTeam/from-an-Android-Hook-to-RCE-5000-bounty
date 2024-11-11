package com.comviva.webaxn.utils;

import android.text.TextUtils;
import defpackage.zi;

/* loaded from: classes.dex */
public class e {
    public String a;
    public int b;
    public int c;
    public String e;
    public String f;
    public String g;
    public Object h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    private r1 n;
    public boolean p;
    public byte q;
    public String r;
    public String s;
    public String u;
    public boolean d = true;
    public boolean o = true;
    public int t = 0;
    public boolean v = false;

    public r1 a() {
        return this.n;
    }

    public void a(int i) {
        this.t = x1.a(i);
    }

    public void b() {
        if (TextUtils.isEmpty(this.m) || zi.A == 0) {
            return;
        }
        r1 r1Var = new r1();
        this.n = r1Var;
        r1Var.a(this.m);
    }
}
