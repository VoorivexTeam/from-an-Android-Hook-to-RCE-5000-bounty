package defpackage;

/* loaded from: classes.dex */
public final class d00 {
    private static final d00[] h = h();
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final c f;
    private final int g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b {
        private final int a;
        private final int b;

        private b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int a() {
            return this.a;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int b() {
            return this.b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c {
        private final int a;
        private final b[] b;

        private c(int i, b bVar) {
            this.a = i;
            this.b = new b[]{bVar};
        }

        private c(int i, b bVar, b bVar2) {
            this.a = i;
            this.b = new b[]{bVar, bVar2};
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b[] a() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int b() {
            return this.a;
        }
    }

    private d00(int i, int i2, int i3, int i4, int i5, c cVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = cVar;
        int b2 = cVar.b();
        int i6 = 0;
        for (b bVar : cVar.a()) {
            i6 += bVar.a() * (bVar.b() + b2);
        }
        this.g = i6;
    }

    public static d00 a(int i, int i2) {
        if ((i & 1) != 0 || (i2 & 1) != 0) {
            throw xv.a();
        }
        for (d00 d00Var : h) {
            if (d00Var.b == i && d00Var.c == i2) {
                return d00Var;
            }
        }
        throw xv.a();
    }

    private static d00[] h() {
        int i = 1;
        int i2 = 5;
        int i3 = 8;
        d00 d00Var = new d00(3, 14, 14, 12, 12, new c(10, new b(i, i3)));
        int i4 = 2;
        int i5 = 12;
        int i6 = 18;
        d00 d00Var2 = new d00(7, 22, 22, 20, 20, new c(20, new b(i, 30)));
        int i7 = 6;
        int i8 = 36;
        int i9 = 62;
        int i10 = 56;
        int i11 = 68;
        b bVar = new b(i, 5);
        b bVar2 = new b(i, 10);
        b bVar3 = new b(i, 16);
        return new d00[]{new d00(1, 10, 10, 8, 8, new c(i2, new b(i, 3))), new d00(2, 12, 12, 10, 10, new c(7, new b(i, i2))), d00Var, new d00(4, 16, 16, 14, 14, new c(i5, new b(i, i5))), new d00(5, 18, 18, 16, 16, new c(14, new b(i, i6))), new d00(6, 20, 20, 18, 18, new c(i6, new b(i, 22))), d00Var2, new d00(8, 24, 24, 22, 22, new c(24, new b(i, i8))), new d00(9, 26, 26, 24, 24, new c(28, new b(i, 44))), new d00(10, 32, 32, 14, 14, new c(i8, new b(i, i9))), new d00(11, 36, 36, 16, 16, new c(42, new b(i, 86))), new d00(12, 40, 40, 18, 18, new c(48, new b(i, 114))), new d00(13, 44, 44, 20, 20, new c(i10, new b(i, 144))), new d00(14, 48, 48, 22, 22, new c(i11, new b(i, 174))), new d00(15, 52, 52, 24, 24, new c(42, new b(i4, 102))), new d00(16, 64, 64, 14, 14, new c(i10, new b(i4, 140))), new d00(17, 72, 72, 16, 16, new c(i8, new b(4, 92))), new d00(18, 80, 80, 18, 18, new c(48, new b(4, 114))), new d00(19, 88, 88, 20, 20, new c(i10, new b(4, 144))), new d00(20, 96, 96, 22, 22, new c(i11, new b(4, 174))), new d00(21, 104, 104, 24, 24, new c(i10, new b(i7, 136))), new d00(22, 120, 120, 18, 18, new c(i11, new b(i7, 175))), new d00(23, 132, 132, 20, 20, new c(i9, new b(i3, 163))), new d00(24, 144, 144, 22, 22, new c(i9, new b(i3, 156), new b(i4, 155))), new d00(25, 8, 18, 6, 16, new c(7, bVar)), new d00(26, 8, 32, 6, 14, new c(11, bVar2)), new d00(27, 12, 26, 10, 24, new c(14, bVar3)), new d00(28, 12, 36, 10, 16, new c(i6, new b(i, 22))), new d00(29, 16, 36, 14, 16, new c(24, new b(i, 32))), new d00(30, 16, 48, 14, 22, new c(28, new b(i, 49)))};
    }

    public int a() {
        return this.e;
    }

    public int b() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c c() {
        return this.f;
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return this.b;
    }

    public int f() {
        return this.g;
    }

    public int g() {
        return this.a;
    }

    public String toString() {
        return String.valueOf(this.a);
    }
}
