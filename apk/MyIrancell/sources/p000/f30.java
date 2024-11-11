package p000;

/* loaded from: classes.dex */
public final class f30 {

    /* renamed from: e */
    private static final int[] f10058e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* renamed from: f */
    private static final f30[] f10059f = m11676f();

    /* renamed from: a */
    private final int f10060a;

    /* renamed from: b */
    private final int[] f10061b;

    /* renamed from: c */
    private final C2457b[] f10062c;

    /* renamed from: d */
    private final int f10063d;

    /* renamed from: f30$a */
    /* loaded from: classes.dex */
    public static final class C2456a {

        /* renamed from: a */
        private final int f10064a;

        /* renamed from: b */
        private final int f10065b;

        C2456a(int i, int i2) {
            this.f10064a = i;
            this.f10065b = i2;
        }

        /* renamed from: a */
        public int m11683a() {
            return this.f10064a;
        }

        /* renamed from: b */
        public int m11684b() {
            return this.f10065b;
        }
    }

    /* renamed from: f30$b */
    /* loaded from: classes.dex */
    public static final class C2457b {

        /* renamed from: a */
        private final int f10066a;

        /* renamed from: b */
        private final C2456a[] f10067b;

        C2457b(int i, C2456a... c2456aArr) {
            this.f10066a = i;
            this.f10067b = c2456aArr;
        }

        /* renamed from: a */
        public C2456a[] m11685a() {
            return this.f10067b;
        }

        /* renamed from: b */
        public int m11686b() {
            return this.f10066a;
        }
    }

    private f30(int i, int[] iArr, C2457b... c2457bArr) {
        this.f10060a = i;
        this.f10061b = iArr;
        this.f10062c = c2457bArr;
        int m11686b = c2457bArr[0].m11686b();
        int i2 = 0;
        for (C2456a c2456a : c2457bArr[0].m11685a()) {
            i2 += c2456a.m11683a() * (c2456a.m11684b() + m11686b);
        }
        this.f10063d = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static f30 m11673a(int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        while (true) {
            int[] iArr = f10058e;
            if (i2 >= iArr.length) {
                if (i4 <= 3) {
                    return m11675c(i3);
                }
                return null;
            }
            int i5 = iArr[i2];
            if (i5 == i) {
                return m11675c(i2 + 7);
            }
            int m3547c = c30.m3547c(i, i5);
            if (m3547c < i4) {
                i3 = i2 + 7;
                i4 = m3547c;
            }
            i2++;
        }
    }

    /* renamed from: b */
    public static f30 m11674b(int i) {
        if (i % 4 != 1) {
            throw C3452xv.m16518a();
        }
        try {
            return m11675c((i - 17) / 4);
        } catch (IllegalArgumentException unused) {
            throw C3452xv.m16518a();
        }
    }

    /* renamed from: c */
    public static f30 m11675c(int i) {
        if (i < 1 || i > 40) {
            throw new IllegalArgumentException();
        }
        return f10059f[i - 1];
    }

    /* renamed from: f */
    private static f30[] m11676f() {
        return new f30[]{new f30(1, new int[0], new C2457b(7, new C2456a(1, 19)), new C2457b(10, new C2456a(1, 16)), new C2457b(13, new C2456a(1, 13)), new C2457b(17, new C2456a(1, 9))), new f30(2, new int[]{6, 18}, new C2457b(10, new C2456a(1, 34)), new C2457b(16, new C2456a(1, 28)), new C2457b(22, new C2456a(1, 22)), new C2457b(28, new C2456a(1, 16))), new f30(3, new int[]{6, 22}, new C2457b(15, new C2456a(1, 55)), new C2457b(26, new C2456a(1, 44)), new C2457b(18, new C2456a(2, 17)), new C2457b(22, new C2456a(2, 13))), new f30(4, new int[]{6, 26}, new C2457b(20, new C2456a(1, 80)), new C2457b(18, new C2456a(2, 32)), new C2457b(26, new C2456a(2, 24)), new C2457b(16, new C2456a(4, 9))), new f30(5, new int[]{6, 30}, new C2457b(26, new C2456a(1, 108)), new C2457b(24, new C2456a(2, 43)), new C2457b(18, new C2456a(2, 15), new C2456a(2, 16)), new C2457b(22, new C2456a(2, 11), new C2456a(2, 12))), new f30(6, new int[]{6, 34}, new C2457b(18, new C2456a(2, 68)), new C2457b(16, new C2456a(4, 27)), new C2457b(24, new C2456a(4, 19)), new C2457b(28, new C2456a(4, 15))), new f30(7, new int[]{6, 22, 38}, new C2457b(20, new C2456a(2, 78)), new C2457b(18, new C2456a(4, 31)), new C2457b(18, new C2456a(2, 14), new C2456a(4, 15)), new C2457b(26, new C2456a(4, 13), new C2456a(1, 14))), new f30(8, new int[]{6, 24, 42}, new C2457b(24, new C2456a(2, 97)), new C2457b(22, new C2456a(2, 38), new C2456a(2, 39)), new C2457b(22, new C2456a(4, 18), new C2456a(2, 19)), new C2457b(26, new C2456a(4, 14), new C2456a(2, 15))), new f30(9, new int[]{6, 26, 46}, new C2457b(30, new C2456a(2, 116)), new C2457b(22, new C2456a(3, 36), new C2456a(2, 37)), new C2457b(20, new C2456a(4, 16), new C2456a(4, 17)), new C2457b(24, new C2456a(4, 12), new C2456a(4, 13))), new f30(10, new int[]{6, 28, 50}, new C2457b(18, new C2456a(2, 68), new C2456a(2, 69)), new C2457b(26, new C2456a(4, 43), new C2456a(1, 44)), new C2457b(24, new C2456a(6, 19), new C2456a(2, 20)), new C2457b(28, new C2456a(6, 15), new C2456a(2, 16))), new f30(11, new int[]{6, 30, 54}, new C2457b(20, new C2456a(4, 81)), new C2457b(30, new C2456a(1, 50), new C2456a(4, 51)), new C2457b(28, new C2456a(4, 22), new C2456a(4, 23)), new C2457b(24, new C2456a(3, 12), new C2456a(8, 13))), new f30(12, new int[]{6, 32, 58}, new C2457b(24, new C2456a(2, 92), new C2456a(2, 93)), new C2457b(22, new C2456a(6, 36), new C2456a(2, 37)), new C2457b(26, new C2456a(4, 20), new C2456a(6, 21)), new C2457b(28, new C2456a(7, 14), new C2456a(4, 15))), new f30(13, new int[]{6, 34, 62}, new C2457b(26, new C2456a(4, 107)), new C2457b(22, new C2456a(8, 37), new C2456a(1, 38)), new C2457b(24, new C2456a(8, 20), new C2456a(4, 21)), new C2457b(22, new C2456a(12, 11), new C2456a(4, 12))), new f30(14, new int[]{6, 26, 46, 66}, new C2457b(30, new C2456a(3, 115), new C2456a(1, 116)), new C2457b(24, new C2456a(4, 40), new C2456a(5, 41)), new C2457b(20, new C2456a(11, 16), new C2456a(5, 17)), new C2457b(24, new C2456a(11, 12), new C2456a(5, 13))), new f30(15, new int[]{6, 26, 48, 70}, new C2457b(22, new C2456a(5, 87), new C2456a(1, 88)), new C2457b(24, new C2456a(5, 41), new C2456a(5, 42)), new C2457b(30, new C2456a(5, 24), new C2456a(7, 25)), new C2457b(24, new C2456a(11, 12), new C2456a(7, 13))), new f30(16, new int[]{6, 26, 50, 74}, new C2457b(24, new C2456a(5, 98), new C2456a(1, 99)), new C2457b(28, new C2456a(7, 45), new C2456a(3, 46)), new C2457b(24, new C2456a(15, 19), new C2456a(2, 20)), new C2457b(30, new C2456a(3, 15), new C2456a(13, 16))), new f30(17, new int[]{6, 30, 54, 78}, new C2457b(28, new C2456a(1, 107), new C2456a(5, 108)), new C2457b(28, new C2456a(10, 46), new C2456a(1, 47)), new C2457b(28, new C2456a(1, 22), new C2456a(15, 23)), new C2457b(28, new C2456a(2, 14), new C2456a(17, 15))), new f30(18, new int[]{6, 30, 56, 82}, new C2457b(30, new C2456a(5, 120), new C2456a(1, 121)), new C2457b(26, new C2456a(9, 43), new C2456a(4, 44)), new C2457b(28, new C2456a(17, 22), new C2456a(1, 23)), new C2457b(28, new C2456a(2, 14), new C2456a(19, 15))), new f30(19, new int[]{6, 30, 58, 86}, new C2457b(28, new C2456a(3, 113), new C2456a(4, 114)), new C2457b(26, new C2456a(3, 44), new C2456a(11, 45)), new C2457b(26, new C2456a(17, 21), new C2456a(4, 22)), new C2457b(26, new C2456a(9, 13), new C2456a(16, 14))), new f30(20, new int[]{6, 34, 62, 90}, new C2457b(28, new C2456a(3, 107), new C2456a(5, 108)), new C2457b(26, new C2456a(3, 41), new C2456a(13, 42)), new C2457b(30, new C2456a(15, 24), new C2456a(5, 25)), new C2457b(28, new C2456a(15, 15), new C2456a(10, 16))), new f30(21, new int[]{6, 28, 50, 72, 94}, new C2457b(28, new C2456a(4, 116), new C2456a(4, 117)), new C2457b(26, new C2456a(17, 42)), new C2457b(28, new C2456a(17, 22), new C2456a(6, 23)), new C2457b(30, new C2456a(19, 16), new C2456a(6, 17))), new f30(22, new int[]{6, 26, 50, 74, 98}, new C2457b(28, new C2456a(2, 111), new C2456a(7, 112)), new C2457b(28, new C2456a(17, 46)), new C2457b(30, new C2456a(7, 24), new C2456a(16, 25)), new C2457b(24, new C2456a(34, 13))), new f30(23, new int[]{6, 30, 54, 78, 102}, new C2457b(30, new C2456a(4, 121), new C2456a(5, 122)), new C2457b(28, new C2456a(4, 47), new C2456a(14, 48)), new C2457b(30, new C2456a(11, 24), new C2456a(14, 25)), new C2457b(30, new C2456a(16, 15), new C2456a(14, 16))), new f30(24, new int[]{6, 28, 54, 80, 106}, new C2457b(30, new C2456a(6, 117), new C2456a(4, 118)), new C2457b(28, new C2456a(6, 45), new C2456a(14, 46)), new C2457b(30, new C2456a(11, 24), new C2456a(16, 25)), new C2457b(30, new C2456a(30, 16), new C2456a(2, 17))), new f30(25, new int[]{6, 32, 58, 84, 110}, new C2457b(26, new C2456a(8, 106), new C2456a(4, 107)), new C2457b(28, new C2456a(8, 47), new C2456a(13, 48)), new C2457b(30, new C2456a(7, 24), new C2456a(22, 25)), new C2457b(30, new C2456a(22, 15), new C2456a(13, 16))), new f30(26, new int[]{6, 30, 58, 86, 114}, new C2457b(28, new C2456a(10, 114), new C2456a(2, 115)), new C2457b(28, new C2456a(19, 46), new C2456a(4, 47)), new C2457b(28, new C2456a(28, 22), new C2456a(6, 23)), new C2457b(30, new C2456a(33, 16), new C2456a(4, 17))), new f30(27, new int[]{6, 34, 62, 90, 118}, new C2457b(30, new C2456a(8, 122), new C2456a(4, 123)), new C2457b(28, new C2456a(22, 45), new C2456a(3, 46)), new C2457b(30, new C2456a(8, 23), new C2456a(26, 24)), new C2457b(30, new C2456a(12, 15), new C2456a(28, 16))), new f30(28, new int[]{6, 26, 50, 74, 98, 122}, new C2457b(30, new C2456a(3, 117), new C2456a(10, 118)), new C2457b(28, new C2456a(3, 45), new C2456a(23, 46)), new C2457b(30, new C2456a(4, 24), new C2456a(31, 25)), new C2457b(30, new C2456a(11, 15), new C2456a(31, 16))), new f30(29, new int[]{6, 30, 54, 78, 102, 126}, new C2457b(30, new C2456a(7, 116), new C2456a(7, 117)), new C2457b(28, new C2456a(21, 45), new C2456a(7, 46)), new C2457b(30, new C2456a(1, 23), new C2456a(37, 24)), new C2457b(30, new C2456a(19, 15), new C2456a(26, 16))), new f30(30, new int[]{6, 26, 52, 78, 104, 130}, new C2457b(30, new C2456a(5, 115), new C2456a(10, 116)), new C2457b(28, new C2456a(19, 47), new C2456a(10, 48)), new C2457b(30, new C2456a(15, 24), new C2456a(25, 25)), new C2457b(30, new C2456a(23, 15), new C2456a(25, 16))), new f30(31, new int[]{6, 30, 56, 82, 108, 134}, new C2457b(30, new C2456a(13, 115), new C2456a(3, 116)), new C2457b(28, new C2456a(2, 46), new C2456a(29, 47)), new C2457b(30, new C2456a(42, 24), new C2456a(1, 25)), new C2457b(30, new C2456a(23, 15), new C2456a(28, 16))), new f30(32, new int[]{6, 34, 60, 86, 112, 138}, new C2457b(30, new C2456a(17, 115)), new C2457b(28, new C2456a(10, 46), new C2456a(23, 47)), new C2457b(30, new C2456a(10, 24), new C2456a(35, 25)), new C2457b(30, new C2456a(19, 15), new C2456a(35, 16))), new f30(33, new int[]{6, 30, 58, 86, 114, 142}, new C2457b(30, new C2456a(17, 115), new C2456a(1, 116)), new C2457b(28, new C2456a(14, 46), new C2456a(21, 47)), new C2457b(30, new C2456a(29, 24), new C2456a(19, 25)), new C2457b(30, new C2456a(11, 15), new C2456a(46, 16))), new f30(34, new int[]{6, 34, 62, 90, 118, 146}, new C2457b(30, new C2456a(13, 115), new C2456a(6, 116)), new C2457b(28, new C2456a(14, 46), new C2456a(23, 47)), new C2457b(30, new C2456a(44, 24), new C2456a(7, 25)), new C2457b(30, new C2456a(59, 16), new C2456a(1, 17))), new f30(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new C2457b(30, new C2456a(12, 121), new C2456a(7, 122)), new C2457b(28, new C2456a(12, 47), new C2456a(26, 48)), new C2457b(30, new C2456a(39, 24), new C2456a(14, 25)), new C2457b(30, new C2456a(22, 15), new C2456a(41, 16))), new f30(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new C2457b(30, new C2456a(6, 121), new C2456a(14, 122)), new C2457b(28, new C2456a(6, 47), new C2456a(34, 48)), new C2457b(30, new C2456a(46, 24), new C2456a(10, 25)), new C2457b(30, new C2456a(2, 15), new C2456a(64, 16))), new f30(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new C2457b(30, new C2456a(17, 122), new C2456a(4, 123)), new C2457b(28, new C2456a(29, 46), new C2456a(14, 47)), new C2457b(30, new C2456a(49, 24), new C2456a(10, 25)), new C2457b(30, new C2456a(24, 15), new C2456a(46, 16))), new f30(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new C2457b(30, new C2456a(4, 122), new C2456a(18, 123)), new C2457b(28, new C2456a(13, 46), new C2456a(32, 47)), new C2457b(30, new C2456a(48, 24), new C2456a(14, 25)), new C2457b(30, new C2456a(42, 15), new C2456a(32, 16))), new f30(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new C2457b(30, new C2456a(20, 117), new C2456a(4, 118)), new C2457b(28, new C2456a(40, 47), new C2456a(7, 48)), new C2457b(30, new C2456a(43, 24), new C2456a(22, 25)), new C2457b(30, new C2456a(10, 15), new C2456a(67, 16))), new f30(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new C2457b(30, new C2456a(19, 118), new C2456a(6, 119)), new C2457b(28, new C2456a(18, 47), new C2456a(31, 48)), new C2457b(30, new C2456a(34, 24), new C2456a(34, 25)), new C2457b(30, new C2456a(20, 15), new C2456a(61, 16)))};
    }

    /* renamed from: a */
    public C2457b m11677a(b30 b30Var) {
        return this.f10062c[b30Var.ordinal()];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C2571hz m11678a() {
        int m11680c = m11680c();
        C2571hz c2571hz = new C2571hz(m11680c);
        c2571hz.m12292a(0, 0, 9, 9);
        int i = m11680c - 8;
        c2571hz.m12292a(i, 0, 8, 9);
        c2571hz.m12292a(0, i, 9, 8);
        int length = this.f10061b.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = this.f10061b[i2] - 2;
            for (int i4 = 0; i4 < length; i4++) {
                if ((i2 != 0 || (i4 != 0 && i4 != length - 1)) && (i2 != length - 1 || i4 != 0)) {
                    c2571hz.m12292a(this.f10061b[i4] - 2, i3, 5, 5);
                }
            }
        }
        int i5 = m11680c - 17;
        c2571hz.m12292a(6, 9, 1, i5);
        c2571hz.m12292a(9, 6, i5, 1);
        if (this.f10060a > 6) {
            int i6 = m11680c - 11;
            c2571hz.m12292a(i6, 0, 3, 6);
            c2571hz.m12292a(0, i6, 6, 3);
        }
        return c2571hz;
    }

    /* renamed from: b */
    public int[] m11679b() {
        return this.f10061b;
    }

    /* renamed from: c */
    public int m11680c() {
        return (this.f10060a * 4) + 17;
    }

    /* renamed from: d */
    public int m11681d() {
        return this.f10063d;
    }

    /* renamed from: e */
    public int m11682e() {
        return this.f10060a;
    }

    public String toString() {
        return String.valueOf(this.f10060a);
    }
}
