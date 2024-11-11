package defpackage;

/* loaded from: classes.dex */
final class j20 {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private int e = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j20(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(int i) {
        return i != -1 && this.c == (i % 3) * 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i) {
        this.e = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.b - this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return a(this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        this.e = ((this.d / 30) * 3) + (this.c / 3);
    }

    public String toString() {
        return this.e + "|" + this.d;
    }
}
