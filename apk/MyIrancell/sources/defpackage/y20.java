package defpackage;

/* loaded from: classes.dex */
abstract class y20 {
    private static final y20[] a;

    /* loaded from: classes.dex */
    private static final class b extends y20 {
        private b() {
            super();
        }

        @Override // defpackage.y20
        boolean a(int i, int i2) {
            return ((i + i2) & 1) == 0;
        }
    }

    /* loaded from: classes.dex */
    private static final class c extends y20 {
        private c() {
            super();
        }

        @Override // defpackage.y20
        boolean a(int i, int i2) {
            return (i & 1) == 0;
        }
    }

    /* loaded from: classes.dex */
    private static final class d extends y20 {
        private d() {
            super();
        }

        @Override // defpackage.y20
        boolean a(int i, int i2) {
            return i2 % 3 == 0;
        }
    }

    /* loaded from: classes.dex */
    private static final class e extends y20 {
        private e() {
            super();
        }

        @Override // defpackage.y20
        boolean a(int i, int i2) {
            return (i + i2) % 3 == 0;
        }
    }

    /* loaded from: classes.dex */
    private static final class f extends y20 {
        private f() {
            super();
        }

        @Override // defpackage.y20
        boolean a(int i, int i2) {
            return (((i / 2) + (i2 / 3)) & 1) == 0;
        }
    }

    /* loaded from: classes.dex */
    private static final class g extends y20 {
        private g() {
            super();
        }

        @Override // defpackage.y20
        boolean a(int i, int i2) {
            int i3 = i * i2;
            return (i3 & 1) + (i3 % 3) == 0;
        }
    }

    /* loaded from: classes.dex */
    private static final class h extends y20 {
        private h() {
            super();
        }

        @Override // defpackage.y20
        boolean a(int i, int i2) {
            int i3 = i * i2;
            return (((i3 & 1) + (i3 % 3)) & 1) == 0;
        }
    }

    /* loaded from: classes.dex */
    private static final class i extends y20 {
        private i() {
            super();
        }

        @Override // defpackage.y20
        boolean a(int i, int i2) {
            return ((((i + i2) & 1) + ((i * i2) % 3)) & 1) == 0;
        }
    }

    static {
        a = new y20[]{new b(), new c(), new d(), new e(), new f(), new g(), new h(), new i()};
    }

    private y20() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y20 a(int i2) {
        if (i2 < 0 || i2 > 7) {
            throw new IllegalArgumentException();
        }
        return a[i2];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(hz hzVar, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                if (a(i3, i4)) {
                    hzVar.a(i4, i3);
                }
            }
        }
    }

    abstract boolean a(int i2, int i3);
}
