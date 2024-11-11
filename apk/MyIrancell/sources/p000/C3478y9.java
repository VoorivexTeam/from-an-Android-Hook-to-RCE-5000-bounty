package p000;

/* renamed from: y9 */
/* loaded from: classes.dex */
public class C3478y9 {

    /* renamed from: a */
    private float f14117a;

    /* renamed from: b */
    private float f14118b;

    public C3478y9() {
        this(1.0f, 1.0f);
    }

    public C3478y9(float f, float f2) {
        this.f14117a = f;
        this.f14118b = f2;
    }

    /* renamed from: a */
    public float m16608a() {
        return this.f14117a;
    }

    /* renamed from: a */
    public boolean m16609a(float f, float f2) {
        return this.f14117a == f && this.f14118b == f2;
    }

    /* renamed from: b */
    public float m16610b() {
        return this.f14118b;
    }

    /* renamed from: b */
    public void m16611b(float f, float f2) {
        this.f14117a = f;
        this.f14118b = f2;
    }

    public String toString() {
        return m16608a() + "x" + m16610b();
    }
}
