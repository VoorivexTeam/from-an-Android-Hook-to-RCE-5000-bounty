package p000;

/* loaded from: classes.dex */
final class z10 extends a20 {

    /* renamed from: b */
    private final int f14316b;

    /* renamed from: c */
    private final int f14317c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z10(int i, int i2, int i3) {
        super(i);
        if (i2 < 0 || i2 > 10 || i3 < 0 || i3 > 10) {
            throw C3452xv.m16518a();
        }
        this.f14316b = i2;
        this.f14317c = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m16704b() {
        return this.f14316b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m16705c() {
        return this.f14317c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m16706d() {
        return this.f14316b == 10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m16707e() {
        return this.f14317c == 10;
    }
}
