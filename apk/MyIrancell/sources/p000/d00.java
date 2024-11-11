package p000;

/* loaded from: classes.dex */
public final class d00 {

    /* renamed from: h */
    private static final d00[] f9627h = m11231h();

    /* renamed from: a */
    private final int f9628a;

    /* renamed from: b */
    private final int f9629b;

    /* renamed from: c */
    private final int f9630c;

    /* renamed from: d */
    private final int f9631d;

    /* renamed from: e */
    private final int f9632e;

    /* renamed from: f */
    private final C2369c f9633f;

    /* renamed from: g */
    private final int f9634g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d00$b */
    /* loaded from: classes.dex */
    public static final class C2368b {

        /* renamed from: a */
        private final int f9635a;

        /* renamed from: b */
        private final int f9636b;

        private C2368b(int i, int i2) {
            this.f9635a = i;
            this.f9636b = i2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public int m11239a() {
            return this.f9635a;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public int m11240b() {
            return this.f9636b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d00$c */
    /* loaded from: classes.dex */
    public static final class C2369c {

        /* renamed from: a */
        private final int f9637a;

        /* renamed from: b */
        private final C2368b[] f9638b;

        private C2369c(int i, C2368b c2368b) {
            this.f9637a = i;
            this.f9638b = new C2368b[]{c2368b};
        }

        private C2369c(int i, C2368b c2368b, C2368b c2368b2) {
            this.f9637a = i;
            this.f9638b = new C2368b[]{c2368b, c2368b2};
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public C2368b[] m11241a() {
            return this.f9638b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public int m11242b() {
            return this.f9637a;
        }
    }

    private d00(int i, int i2, int i3, int i4, int i5, C2369c c2369c) {
        this.f9628a = i;
        this.f9629b = i2;
        this.f9630c = i3;
        this.f9631d = i4;
        this.f9632e = i5;
        this.f9633f = c2369c;
        int m11242b = c2369c.m11242b();
        int i6 = 0;
        for (C2368b c2368b : c2369c.m11241a()) {
            i6 += c2368b.m11239a() * (c2368b.m11240b() + m11242b);
        }
        this.f9634g = i6;
    }

    /* renamed from: a */
    public static d00 m11230a(int i, int i2) {
        if ((i & 1) != 0 || (i2 & 1) != 0) {
            throw C3452xv.m16518a();
        }
        for (d00 d00Var : f9627h) {
            if (d00Var.f9629b == i && d00Var.f9630c == i2) {
                return d00Var;
            }
        }
        throw C3452xv.m16518a();
    }

    /* renamed from: h */
    private static d00[] m11231h() {
        int i = 1;
        int i2 = 5;
        int i3 = 8;
        d00 d00Var = new d00(3, 14, 14, 12, 12, new C2369c(10, new C2368b(i, i3)));
        int i4 = 2;
        int i5 = 12;
        int i6 = 18;
        d00 d00Var2 = new d00(7, 22, 22, 20, 20, new C2369c(20, new C2368b(i, 30)));
        int i7 = 6;
        int i8 = 36;
        int i9 = 62;
        int i10 = 56;
        int i11 = 68;
        C2368b c2368b = new C2368b(i, 5);
        C2368b c2368b2 = new C2368b(i, 10);
        C2368b c2368b3 = new C2368b(i, 16);
        return new d00[]{new d00(1, 10, 10, 8, 8, new C2369c(i2, new C2368b(i, 3))), new d00(2, 12, 12, 10, 10, new C2369c(7, new C2368b(i, i2))), d00Var, new d00(4, 16, 16, 14, 14, new C2369c(i5, new C2368b(i, i5))), new d00(5, 18, 18, 16, 16, new C2369c(14, new C2368b(i, i6))), new d00(6, 20, 20, 18, 18, new C2369c(i6, new C2368b(i, 22))), d00Var2, new d00(8, 24, 24, 22, 22, new C2369c(24, new C2368b(i, i8))), new d00(9, 26, 26, 24, 24, new C2369c(28, new C2368b(i, 44))), new d00(10, 32, 32, 14, 14, new C2369c(i8, new C2368b(i, i9))), new d00(11, 36, 36, 16, 16, new C2369c(42, new C2368b(i, 86))), new d00(12, 40, 40, 18, 18, new C2369c(48, new C2368b(i, 114))), new d00(13, 44, 44, 20, 20, new C2369c(i10, new C2368b(i, 144))), new d00(14, 48, 48, 22, 22, new C2369c(i11, new C2368b(i, 174))), new d00(15, 52, 52, 24, 24, new C2369c(42, new C2368b(i4, 102))), new d00(16, 64, 64, 14, 14, new C2369c(i10, new C2368b(i4, 140))), new d00(17, 72, 72, 16, 16, new C2369c(i8, new C2368b(4, 92))), new d00(18, 80, 80, 18, 18, new C2369c(48, new C2368b(4, 114))), new d00(19, 88, 88, 20, 20, new C2369c(i10, new C2368b(4, 144))), new d00(20, 96, 96, 22, 22, new C2369c(i11, new C2368b(4, 174))), new d00(21, 104, 104, 24, 24, new C2369c(i10, new C2368b(i7, 136))), new d00(22, 120, 120, 18, 18, new C2369c(i11, new C2368b(i7, 175))), new d00(23, 132, 132, 20, 20, new C2369c(i9, new C2368b(i3, 163))), new d00(24, 144, 144, 22, 22, new C2369c(i9, new C2368b(i3, 156), new C2368b(i4, 155))), new d00(25, 8, 18, 6, 16, new C2369c(7, c2368b)), new d00(26, 8, 32, 6, 14, new C2369c(11, c2368b2)), new d00(27, 12, 26, 10, 24, new C2369c(14, c2368b3)), new d00(28, 12, 36, 10, 16, new C2369c(i6, new C2368b(i, 22))), new d00(29, 16, 36, 14, 16, new C2369c(24, new C2368b(i, 32))), new d00(30, 16, 48, 14, 22, new C2369c(28, new C2368b(i, 49)))};
    }

    /* renamed from: a */
    public int m11232a() {
        return this.f9632e;
    }

    /* renamed from: b */
    public int m11233b() {
        return this.f9631d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C2369c m11234c() {
        return this.f9633f;
    }

    /* renamed from: d */
    public int m11235d() {
        return this.f9630c;
    }

    /* renamed from: e */
    public int m11236e() {
        return this.f9629b;
    }

    /* renamed from: f */
    public int m11237f() {
        return this.f9634g;
    }

    /* renamed from: g */
    public int m11238g() {
        return this.f9628a;
    }

    public String toString() {
        return String.valueOf(this.f9628a);
    }
}
