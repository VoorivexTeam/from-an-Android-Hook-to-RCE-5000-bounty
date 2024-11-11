package p000;

/* loaded from: classes.dex */
final class i20 {

    /* renamed from: a */
    private C2571hz f10551a;

    /* renamed from: b */
    private C2568hw f10552b;

    /* renamed from: c */
    private C2568hw f10553c;

    /* renamed from: d */
    private C2568hw f10554d;

    /* renamed from: e */
    private C2568hw f10555e;

    /* renamed from: f */
    private int f10556f;

    /* renamed from: g */
    private int f10557g;

    /* renamed from: h */
    private int f10558h;

    /* renamed from: i */
    private int f10559i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i20(C2571hz c2571hz, C2568hw c2568hw, C2568hw c2568hw2, C2568hw c2568hw3, C2568hw c2568hw4) {
        if ((c2568hw == null && c2568hw3 == null) || ((c2568hw2 == null && c2568hw4 == null) || ((c2568hw != null && c2568hw2 == null) || (c2568hw3 != null && c2568hw4 == null)))) {
            throw C0438aw.m3194a();
        }
        m12324a(c2571hz, c2568hw, c2568hw2, c2568hw3, c2568hw4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i20(i20 i20Var) {
        m12324a(i20Var.f10551a, i20Var.f10552b, i20Var.f10553c, i20Var.f10554d, i20Var.f10555e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static i20 m12323a(i20 i20Var, i20 i20Var2) {
        return i20Var == null ? i20Var2 : i20Var2 == null ? i20Var : new i20(i20Var.f10551a, i20Var.f10552b, i20Var.f10553c, i20Var2.f10554d, i20Var2.f10555e);
    }

    /* renamed from: a */
    private void m12324a(C2571hz c2571hz, C2568hw c2568hw, C2568hw c2568hw2, C2568hw c2568hw3, C2568hw c2568hw4) {
        this.f10551a = c2571hz;
        this.f10552b = c2568hw;
        this.f10553c = c2568hw2;
        this.f10554d = c2568hw3;
        this.f10555e = c2568hw4;
        m12325i();
    }

    /* renamed from: i */
    private void m12325i() {
        if (this.f10552b == null) {
            this.f10552b = new C2568hw(0.0f, this.f10554d.m12249b());
            this.f10553c = new C2568hw(0.0f, this.f10555e.m12249b());
        } else if (this.f10554d == null) {
            this.f10554d = new C2568hw(this.f10551a.m12300h() - 1, this.f10552b.m12249b());
            this.f10555e = new C2568hw(this.f10551a.m12300h() - 1, this.f10553c.m12249b());
        }
        this.f10556f = (int) Math.min(this.f10552b.m12248a(), this.f10553c.m12248a());
        this.f10557g = (int) Math.max(this.f10554d.m12248a(), this.f10555e.m12248a());
        this.f10558h = (int) Math.min(this.f10552b.m12249b(), this.f10554d.m12249b());
        this.f10559i = (int) Math.max(this.f10553c.m12249b(), this.f10555e.m12249b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C2568hw m12326a() {
        return this.f10553c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p000.i20 m12327a(int r13, int r14, boolean r15) {
        /*
            r12 = this;
            hw r0 = r12.f10552b
            hw r1 = r12.f10553c
            hw r2 = r12.f10554d
            hw r3 = r12.f10555e
            if (r13 <= 0) goto L29
            if (r15 == 0) goto Le
            r4 = r0
            goto Lf
        Le:
            r4 = r2
        Lf:
            float r5 = r4.m12249b()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L18
            r5 = 0
        L18:
            hw r13 = new hw
            float r4 = r4.m12248a()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L26
            r8 = r13
            goto L2a
        L26:
            r10 = r13
            r8 = r0
            goto L2b
        L29:
            r8 = r0
        L2a:
            r10 = r2
        L2b:
            if (r14 <= 0) goto L5b
            if (r15 == 0) goto L32
            hw r13 = r12.f10553c
            goto L34
        L32:
            hw r13 = r12.f10555e
        L34:
            float r0 = r13.m12249b()
            int r0 = (int) r0
            int r0 = r0 + r14
            hz r14 = r12.f10551a
            int r14 = r14.m12297c()
            if (r0 < r14) goto L4a
            hz r14 = r12.f10551a
            int r14 = r14.m12297c()
            int r0 = r14 + (-1)
        L4a:
            hw r14 = new hw
            float r13 = r13.m12248a()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L58
            r9 = r14
            goto L5c
        L58:
            r11 = r14
            r9 = r1
            goto L5d
        L5b:
            r9 = r1
        L5c:
            r11 = r3
        L5d:
            r12.m12325i()
            i20 r13 = new i20
            hz r7 = r12.f10551a
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.i20.m12327a(int, int, boolean):i20");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C2568hw m12328b() {
        return this.f10555e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m12329c() {
        return this.f10557g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m12330d() {
        return this.f10559i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m12331e() {
        return this.f10556f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m12332f() {
        return this.f10558h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C2568hw m12333g() {
        return this.f10552b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C2568hw m12334h() {
        return this.f10554d;
    }
}
