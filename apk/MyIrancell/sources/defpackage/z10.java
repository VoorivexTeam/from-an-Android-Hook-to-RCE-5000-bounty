package defpackage;

/* loaded from: classes.dex */
final class z10 extends a20 {
    private final int b;
    private final int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z10(int i, int i2, int i3) {
        super(i);
        if (i2 < 0 || i2 > 10 || i3 < 0 || i3 > 10) {
            throw xv.a();
        }
        this.b = i2;
        this.c = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return this.b == 10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return this.c == 10;
    }
}
