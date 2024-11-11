package p000;

import java.util.Vector;

/* renamed from: ui */
/* loaded from: classes.dex */
public class C3307ui extends C3128qi {

    /* renamed from: e */
    private int f13480e;

    /* renamed from: f */
    private int f13481f;

    /* renamed from: g */
    private Vector<C3128qi> f13482g;

    /* renamed from: h */
    private int f13483h;

    /* renamed from: i */
    private Vector<C3307ui> f13484i;

    /* renamed from: j */
    private String f13485j;

    /* renamed from: k */
    private byte[] f13486k;

    public C3307ui(int i) {
        super(i);
        this.f13480e = 0;
        this.f13483h = 0;
        this.f14143a = i;
        this.f13482g = new Vector<>();
        this.f13484i = new Vector<>();
    }

    /* renamed from: a */
    public void m15812a(C3128qi c3128qi) {
        this.f13482g.addElement(c3128qi);
    }

    /* renamed from: a */
    public void m15813a(C3307ui c3307ui) {
        if (this.f13483h != 0) {
            throw new C3399wi(12);
        }
        this.f13484i.addElement(c3307ui);
    }

    /* renamed from: a */
    public void m15814a(C3439xi c3439xi) {
        this.f13483h = 2;
    }

    /* renamed from: a */
    public void m15815a(byte[] bArr) {
        this.f13486k = bArr;
        this.f13483h = 5;
    }

    /* renamed from: b */
    public C3128qi m15816b(int i) {
        if (i < 0 || i >= this.f13482g.size()) {
            return null;
        }
        return this.f13482g.elementAt(i);
    }

    /* renamed from: b */
    public void m15817b(String str) {
        this.f13485j = str;
        this.f13483h = 1;
    }

    /* renamed from: b */
    public void m15818b(C3128qi c3128qi) {
        this.f13483h = 4;
    }

    /* renamed from: c */
    public Vector<C3167ri> m15819c(int i) {
        for (int i2 = 0; i2 < this.f13482g.size(); i2++) {
            C3128qi elementAt = this.f13482g.elementAt(i2);
            if (elementAt.m15102c() == 0 && elementAt.m15101b() == i) {
                return elementAt.m15103d();
            }
        }
        return null;
    }

    /* renamed from: c */
    public void m15820c(String str) {
        this.f13480e = 1;
    }

    /* renamed from: d */
    public C3307ui m15821d(int i) {
        if (i < 0 || i >= this.f13484i.size()) {
            return null;
        }
        return this.f13484i.elementAt(i);
    }

    /* renamed from: e */
    public int m15822e() {
        return this.f13482g.size();
    }

    /* renamed from: e */
    public void m15823e(int i) {
        this.f13481f = i;
        this.f13480e = 0;
    }

    /* renamed from: f */
    public int m15824f() {
        return this.f13483h;
    }

    /* renamed from: g */
    public byte[] m15825g() {
        if (this.f13483h == 5) {
            return this.f13486k;
        }
        throw new C3399wi(12);
    }

    /* renamed from: h */
    public String m15826h() {
        if (this.f13483h == 1) {
            return this.f13485j;
        }
        throw new C3399wi(12);
    }

    /* renamed from: i */
    public int m15827i() {
        return this.f13484i.size();
    }

    /* renamed from: j */
    public int m15828j() {
        if (this.f13480e == 0) {
            return this.f13481f;
        }
        throw new C3399wi(12);
    }
}
