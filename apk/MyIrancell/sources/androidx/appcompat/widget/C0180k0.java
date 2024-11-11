package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.k0 */
/* loaded from: classes.dex */
class C0180k0 {

    /* renamed from: a */
    private int f1095a = 0;

    /* renamed from: b */
    private int f1096b = 0;

    /* renamed from: c */
    private int f1097c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f1098d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f1099e = 0;

    /* renamed from: f */
    private int f1100f = 0;

    /* renamed from: g */
    private boolean f1101g = false;

    /* renamed from: h */
    private boolean f1102h = false;

    /* renamed from: a */
    public int m1053a() {
        return this.f1101g ? this.f1095a : this.f1096b;
    }

    /* renamed from: a */
    public void m1054a(int i, int i2) {
        this.f1102h = false;
        if (i != Integer.MIN_VALUE) {
            this.f1099e = i;
            this.f1095a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1100f = i2;
            this.f1096b = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001a, code lost:
    
        if (r2 != Integer.MIN_VALUE) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
    
        if (r2 != Integer.MIN_VALUE) goto L25;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1055a(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f1101g
            if (r2 != r0) goto L5
            return
        L5:
            r1.f1101g = r2
            boolean r0 = r1.f1102h
            if (r0 == 0) goto L2b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L1d
            int r2 = r1.f1098d
            if (r2 == r0) goto L14
            goto L16
        L14:
            int r2 = r1.f1099e
        L16:
            r1.f1095a = r2
            int r2 = r1.f1097c
            if (r2 == r0) goto L2f
            goto L31
        L1d:
            int r2 = r1.f1097c
            if (r2 == r0) goto L22
            goto L24
        L22:
            int r2 = r1.f1099e
        L24:
            r1.f1095a = r2
            int r2 = r1.f1098d
            if (r2 == r0) goto L2f
            goto L31
        L2b:
            int r2 = r1.f1099e
            r1.f1095a = r2
        L2f:
            int r2 = r1.f1100f
        L31:
            r1.f1096b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0180k0.m1055a(boolean):void");
    }

    /* renamed from: b */
    public int m1056b() {
        return this.f1095a;
    }

    /* renamed from: b */
    public void m1057b(int i, int i2) {
        this.f1097c = i;
        this.f1098d = i2;
        this.f1102h = true;
        if (this.f1101g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1095a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1096b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1095a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1096b = i2;
        }
    }

    /* renamed from: c */
    public int m1058c() {
        return this.f1096b;
    }

    /* renamed from: d */
    public int m1059d() {
        return this.f1101g ? this.f1096b : this.f1095a;
    }
}
