package defpackage;

/* loaded from: classes.dex */
public final class j30 extends hw {
    private final float c;
    private final int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j30(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }

    private j30(float f, float f2, float f3, int i) {
        super(f, f2);
        this.c = f3;
        this.d = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(float f, float f2, float f3) {
        if (Math.abs(f2 - b()) > f || Math.abs(f3 - a()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.c);
        return abs <= 1.0f || abs <= this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j30 b(float f, float f2, float f3) {
        int i = this.d;
        int i2 = i + 1;
        float a = (i * a()) + f2;
        float f4 = i2;
        return new j30(a / f4, ((this.d * b()) + f) / f4, ((this.d * this.c) + f3) / f4, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.d;
    }

    public float d() {
        return this.c;
    }
}
