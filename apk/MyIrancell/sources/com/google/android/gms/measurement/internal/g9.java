package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g9 {
    private long a;
    private long b;
    private final g c;
    private final /* synthetic */ x8 d;

    public g9(x8 x8Var) {
        this.d = x8Var;
        this.c = new j9(this, this.d.a);
        long b = x8Var.h().b();
        this.a = b;
        this.b = b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        this.d.c();
        a(false, false, this.d.h().b());
        this.d.o().a(this.d.h().b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.c.c();
        this.a = 0L;
        this.b = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(long j) {
        this.d.c();
        this.c.c();
        this.a = j;
        this.b = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d8, code lost:
    
        if (r8 == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(boolean r7, boolean r8, long r9) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.g9.a(boolean, boolean, long):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long b() {
        long b = this.d.h().b();
        long j = b - this.b;
        this.b = b;
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(long j) {
        this.c.c();
        if (this.a != 0) {
            this.d.j().w.a(this.d.j().w.a() + (j - this.a));
        }
    }
}
