package p000;

/* loaded from: classes.dex */
final class j20 {

    /* renamed from: a */
    private final int f11427a;

    /* renamed from: b */
    private final int f11428b;

    /* renamed from: c */
    private final int f11429c;

    /* renamed from: d */
    private final int f11430d;

    /* renamed from: e */
    private int f11431e = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j20(int i, int i2, int i3, int i4) {
        this.f11427a = i;
        this.f11428b = i2;
        this.f11429c = i3;
        this.f11430d = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m13345a() {
        return this.f11429c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m13346a(int i) {
        return i != -1 && this.f11429c == (i % 3) * 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m13347b() {
        return this.f11428b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m13348b(int i) {
        this.f11431e = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m13349c() {
        return this.f11431e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m13350d() {
        return this.f11427a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m13351e() {
        return this.f11430d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m13352f() {
        return this.f11428b - this.f11427a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m13353g() {
        return m13346a(this.f11431e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m13354h() {
        this.f11431e = ((this.f11430d / 30) * 3) + (this.f11429c / 3);
    }

    public String toString() {
        return this.f11431e + "|" + this.f11430d;
    }
}
