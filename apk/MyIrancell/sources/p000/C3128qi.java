package p000;

import java.util.Vector;

/* renamed from: qi */
/* loaded from: classes.dex */
public class C3128qi extends AbstractC3488yi {

    /* renamed from: b */
    private int f12804b;

    /* renamed from: c */
    private int f12805c;

    /* renamed from: d */
    private Vector<C3167ri> f12806d = new Vector<>();

    public C3128qi(int i) {
        this.f14143a = i;
    }

    /* renamed from: a */
    public void m15097a(int i) {
        this.f12805c = i;
        this.f12804b = 0;
    }

    /* renamed from: a */
    public void m15098a(int i, int i2) {
        C3167ri c3167ri = new C3167ri(i2);
        c3167ri.m15274a(i);
        this.f12806d.addElement(c3167ri);
    }

    /* renamed from: a */
    public void m15099a(String str) {
        this.f12804b = 1;
    }

    /* renamed from: a */
    public void m15100a(String str, int i) {
        C3167ri c3167ri = new C3167ri(i);
        c3167ri.m15275a(str);
        this.f12806d.addElement(c3167ri);
    }

    /* renamed from: b */
    public int m15101b() {
        if (this.f12804b == 0) {
            return this.f12805c;
        }
        throw new C3399wi(12);
    }

    /* renamed from: c */
    public int m15102c() {
        return this.f12804b;
    }

    /* renamed from: d */
    public Vector<C3167ri> m15103d() {
        return this.f12806d;
    }
}
