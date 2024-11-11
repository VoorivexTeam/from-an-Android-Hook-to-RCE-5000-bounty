package p000;

/* renamed from: xi */
/* loaded from: classes.dex */
public class C3439xi {

    /* renamed from: a */
    private int f14052a;

    /* renamed from: b */
    private int f14053b;

    /* renamed from: c */
    private String f14054c;

    /* renamed from: a */
    public String m16494a() {
        if (this.f14052a == 1) {
            return this.f14054c;
        }
        throw new C3399wi(12);
    }

    /* renamed from: a */
    public void m16495a(int i) {
        this.f14053b = i;
        this.f14052a = 0;
    }

    /* renamed from: a */
    public void m16496a(String str) {
        this.f14054c = str;
        this.f14052a = 1;
    }

    /* renamed from: b */
    public int m16497b() {
        if (this.f14052a == 0) {
            return this.f14053b;
        }
        throw new C3399wi(12);
    }

    /* renamed from: c */
    public int m16498c() {
        return this.f14052a;
    }
}
