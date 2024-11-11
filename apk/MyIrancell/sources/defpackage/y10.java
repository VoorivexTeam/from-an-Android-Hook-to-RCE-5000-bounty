package defpackage;

/* loaded from: classes.dex */
final class y10 extends a20 {
    private final String b;
    private final int c;
    private final boolean d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y10(int i, String str) {
        super(i);
        this.b = str;
        this.d = false;
        this.c = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y10(int i, String str, int i2) {
        super(i);
        this.d = true;
        this.c = i2;
        this.b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return this.d;
    }
}
