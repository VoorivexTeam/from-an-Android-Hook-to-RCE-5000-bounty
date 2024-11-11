package p000;

/* loaded from: classes.dex */
abstract class y20 {

    /* renamed from: a */
    private static final y20[] f14096a;

    /* renamed from: y20$b */
    /* loaded from: classes.dex */
    private static final class C3462b extends y20 {
        private C3462b() {
            super();
        }

        @Override // p000.y20
        /* renamed from: a */
        boolean mo16562a(int i, int i2) {
            return ((i + i2) & 1) == 0;
        }
    }

    /* renamed from: y20$c */
    /* loaded from: classes.dex */
    private static final class C3463c extends y20 {
        private C3463c() {
            super();
        }

        @Override // p000.y20
        /* renamed from: a */
        boolean mo16562a(int i, int i2) {
            return (i & 1) == 0;
        }
    }

    /* renamed from: y20$d */
    /* loaded from: classes.dex */
    private static final class C3464d extends y20 {
        private C3464d() {
            super();
        }

        @Override // p000.y20
        /* renamed from: a */
        boolean mo16562a(int i, int i2) {
            return i2 % 3 == 0;
        }
    }

    /* renamed from: y20$e */
    /* loaded from: classes.dex */
    private static final class C3465e extends y20 {
        private C3465e() {
            super();
        }

        @Override // p000.y20
        /* renamed from: a */
        boolean mo16562a(int i, int i2) {
            return (i + i2) % 3 == 0;
        }
    }

    /* renamed from: y20$f */
    /* loaded from: classes.dex */
    private static final class C3466f extends y20 {
        private C3466f() {
            super();
        }

        @Override // p000.y20
        /* renamed from: a */
        boolean mo16562a(int i, int i2) {
            return (((i / 2) + (i2 / 3)) & 1) == 0;
        }
    }

    /* renamed from: y20$g */
    /* loaded from: classes.dex */
    private static final class C3467g extends y20 {
        private C3467g() {
            super();
        }

        @Override // p000.y20
        /* renamed from: a */
        boolean mo16562a(int i, int i2) {
            int i3 = i * i2;
            return (i3 & 1) + (i3 % 3) == 0;
        }
    }

    /* renamed from: y20$h */
    /* loaded from: classes.dex */
    private static final class C3468h extends y20 {
        private C3468h() {
            super();
        }

        @Override // p000.y20
        /* renamed from: a */
        boolean mo16562a(int i, int i2) {
            int i3 = i * i2;
            return (((i3 & 1) + (i3 % 3)) & 1) == 0;
        }
    }

    /* renamed from: y20$i */
    /* loaded from: classes.dex */
    private static final class C3469i extends y20 {
        private C3469i() {
            super();
        }

        @Override // p000.y20
        /* renamed from: a */
        boolean mo16562a(int i, int i2) {
            return ((((i + i2) & 1) + ((i * i2) % 3)) & 1) == 0;
        }
    }

    static {
        f14096a = new y20[]{new C3462b(), new C3463c(), new C3464d(), new C3465e(), new C3466f(), new C3467g(), new C3468h(), new C3469i()};
    }

    private y20() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static y20 m16560a(int i) {
        if (i < 0 || i > 7) {
            throw new IllegalArgumentException();
        }
        return f14096a[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m16561a(C2571hz c2571hz, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                if (mo16562a(i2, i3)) {
                    c2571hz.m12291a(i3, i2);
                }
            }
        }
    }

    /* renamed from: a */
    abstract boolean mo16562a(int i, int i2);
}
