package defpackage;

import java.util.Vector;

/* loaded from: classes.dex */
public class ui extends qi {
    private int e;
    private int f;
    private Vector<qi> g;
    private int h;
    private Vector<ui> i;
    private String j;
    private byte[] k;

    public ui(int i) {
        super(i);
        this.e = 0;
        this.h = 0;
        this.a = i;
        this.g = new Vector<>();
        this.i = new Vector<>();
    }

    public void a(qi qiVar) {
        this.g.addElement(qiVar);
    }

    public void a(ui uiVar) {
        if (this.h != 0) {
            throw new wi(12);
        }
        this.i.addElement(uiVar);
    }

    public void a(xi xiVar) {
        this.h = 2;
    }

    public void a(byte[] bArr) {
        this.k = bArr;
        this.h = 5;
    }

    public qi b(int i) {
        if (i < 0 || i >= this.g.size()) {
            return null;
        }
        return this.g.elementAt(i);
    }

    public void b(String str) {
        this.j = str;
        this.h = 1;
    }

    public void b(qi qiVar) {
        this.h = 4;
    }

    public Vector<ri> c(int i) {
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            qi elementAt = this.g.elementAt(i2);
            if (elementAt.c() == 0 && elementAt.b() == i) {
                return elementAt.d();
            }
        }
        return null;
    }

    public void c(String str) {
        this.e = 1;
    }

    public ui d(int i) {
        if (i < 0 || i >= this.i.size()) {
            return null;
        }
        return this.i.elementAt(i);
    }

    public int e() {
        return this.g.size();
    }

    public void e(int i) {
        this.f = i;
        this.e = 0;
    }

    public int f() {
        return this.h;
    }

    public byte[] g() {
        if (this.h == 5) {
            return this.k;
        }
        throw new wi(12);
    }

    public String h() {
        if (this.h == 1) {
            return this.j;
        }
        throw new wi(12);
    }

    public int i() {
        return this.i.size();
    }

    public int j() {
        if (this.e == 0) {
            return this.f;
        }
        throw new wi(12);
    }
}
