package com.comviva.webaxn.utils;

import com.comviva.webaxn.utils.x1;
import defpackage.lj;
import defpackage.yj;
import java.util.List;
import java.util.Map;
import java.util.Vector;

/* loaded from: classes.dex */
public class l1 {
    public com.comviva.webaxn.ui.a1 A;
    public boolean B;
    public String D;
    public String E;
    public Vector<k1> F;
    public boolean G;
    public j H;
    public int K;
    public yj L;
    private String N;
    private r1 O;
    public String a;
    public long b;
    public int c;
    public String d;
    public long e;
    public int f;
    public long g;
    public byte[] h;
    public int i;
    public String j;
    public byte[] k;
    private int l;
    private Map<String, List<String>> m;
    private int n;
    public boolean o;
    public x1.k q;
    public com.comviva.webaxn.ui.n1 r;
    public lj x;
    public boolean p = false;
    public int s = -1;
    public String t = null;
    public String u = null;
    public String v = null;
    public boolean w = false;
    public boolean y = false;
    public boolean z = false;
    public boolean C = false;
    public int I = -1;
    public String J = null;
    private boolean M = false;

    public String a() {
        return this.N;
    }

    public String a(String str) {
        if (this.m.get(str) != null) {
            return this.m.get(str).get(0);
        }
        return null;
    }

    public void a(int i) {
        this.n = i;
    }

    public void a(r1 r1Var) {
        this.O = r1Var;
    }

    public void a(Map<String, List<String>> map) {
        this.m = map;
    }

    public void a(boolean z, String str) {
        this.M = z;
        this.N = str;
    }

    public void a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            this.k = null;
            return;
        }
        byte[] bArr2 = new byte[bArr.length];
        this.k = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    public String b() {
        return this.j;
    }

    public void b(int i) {
        this.l = i;
    }

    public boolean c() {
        return this.M;
    }

    public byte[] d() {
        return this.h;
    }

    public int e() {
        return this.i;
    }

    public byte[] f() {
        return this.k;
    }

    public int g() {
        return this.n;
    }

    public int h() {
        return this.l;
    }

    public r1 i() {
        return this.O;
    }

    public boolean j() {
        return this.o;
    }
}
