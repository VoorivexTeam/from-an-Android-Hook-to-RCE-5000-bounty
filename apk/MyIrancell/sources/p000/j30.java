package p000;

/* loaded from: classes.dex */
public final class j30 extends C2568hw {

    /* renamed from: c */
    private final float f11456c;

    /* renamed from: d */
    private final int f11457d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j30(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }

    private j30(float f, float f2, float f3, int i) {
        super(f, f2);
        this.f11456c = f3;
        this.f11457d = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m13394a(float f, float f2, float f3) {
        if (Math.abs(f2 - m12249b()) > f || Math.abs(f3 - m12248a()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f11456c);
        return abs <= 1.0f || abs <= this.f11456c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public j30 m13395b(float f, float f2, float f3) {
        int i = this.f11457d;
        int i2 = i + 1;
        float m12248a = (i * m12248a()) + f2;
        float f4 = i2;
        return new j30(m12248a / f4, ((this.f11457d * m12249b()) + f) / f4, ((this.f11457d * this.f11456c) + f3) / f4, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m13396c() {
        return this.f11457d;
    }

    /* renamed from: d */
    public float m13397d() {
        return this.f11456c;
    }
}
