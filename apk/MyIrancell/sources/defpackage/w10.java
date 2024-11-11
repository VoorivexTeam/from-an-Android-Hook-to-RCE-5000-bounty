package defpackage;

/* loaded from: classes.dex */
final class w10 {
    private int a = 0;
    private a b = a.NUMERIC;

    /* loaded from: classes.dex */
    private enum a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        this.a += i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i) {
        this.a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        return this.b == a.ALPHA;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return this.b == a.ISO_IEC_646;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        this.b = a.ALPHA;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        this.b = a.ISO_IEC_646;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        this.b = a.NUMERIC;
    }
}
