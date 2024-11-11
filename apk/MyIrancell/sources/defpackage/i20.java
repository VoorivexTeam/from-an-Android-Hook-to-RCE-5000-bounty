package defpackage;

/* loaded from: classes.dex */
final class i20 {
    private hz a;
    private hw b;
    private hw c;
    private hw d;
    private hw e;
    private int f;
    private int g;
    private int h;
    private int i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i20(hz hzVar, hw hwVar, hw hwVar2, hw hwVar3, hw hwVar4) {
        if ((hwVar == null && hwVar3 == null) || ((hwVar2 == null && hwVar4 == null) || ((hwVar != null && hwVar2 == null) || (hwVar3 != null && hwVar4 == null)))) {
            throw aw.a();
        }
        a(hzVar, hwVar, hwVar2, hwVar3, hwVar4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i20(i20 i20Var) {
        a(i20Var.a, i20Var.b, i20Var.c, i20Var.d, i20Var.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i20 a(i20 i20Var, i20 i20Var2) {
        return i20Var == null ? i20Var2 : i20Var2 == null ? i20Var : new i20(i20Var.a, i20Var.b, i20Var.c, i20Var2.d, i20Var2.e);
    }

    private void a(hz hzVar, hw hwVar, hw hwVar2, hw hwVar3, hw hwVar4) {
        this.a = hzVar;
        this.b = hwVar;
        this.c = hwVar2;
        this.d = hwVar3;
        this.e = hwVar4;
        i();
    }

    private void i() {
        if (this.b == null) {
            this.b = new hw(0.0f, this.d.b());
            this.c = new hw(0.0f, this.e.b());
        } else if (this.d == null) {
            this.d = new hw(this.a.h() - 1, this.b.b());
            this.e = new hw(this.a.h() - 1, this.c.b());
        }
        this.f = (int) Math.min(this.b.a(), this.c.a());
        this.g = (int) Math.max(this.d.a(), this.e.a());
        this.h = (int) Math.min(this.b.b(), this.d.b());
        this.i = (int) Math.max(this.c.b(), this.e.b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public hw a() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.i20 a(int r13, int r14, boolean r15) {
        /*
            r12 = this;
            hw r0 = r12.b
            hw r1 = r12.c
            hw r2 = r12.d
            hw r3 = r12.e
            if (r13 <= 0) goto L29
            if (r15 == 0) goto Le
            r4 = r0
            goto Lf
        Le:
            r4 = r2
        Lf:
            float r5 = r4.b()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L18
            r5 = 0
        L18:
            hw r13 = new hw
            float r4 = r4.a()
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
            hw r13 = r12.c
            goto L34
        L32:
            hw r13 = r12.e
        L34:
            float r0 = r13.b()
            int r0 = (int) r0
            int r0 = r0 + r14
            hz r14 = r12.a
            int r14 = r14.c()
            if (r0 < r14) goto L4a
            hz r14 = r12.a
            int r14 = r14.c()
            int r0 = r14 + (-1)
        L4a:
            hw r14 = new hw
            float r13 = r13.a()
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
            r12.i()
            i20 r13 = new i20
            hz r7 = r12.a
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i20.a(int, int, boolean):i20");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public hw b() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public hw g() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public hw h() {
        return this.d;
    }
}
