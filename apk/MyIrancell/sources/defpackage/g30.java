package defpackage;

/* loaded from: classes.dex */
public final class g30 extends hw {
    private final float c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g30(float f, float f2, float f3) {
        super(f, f2);
        this.c = f3;
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
    public g30 b(float f, float f2, float f3) {
        return new g30((a() + f2) / 2.0f, (b() + f) / 2.0f, (this.c + f3) / 2.0f);
    }
}
