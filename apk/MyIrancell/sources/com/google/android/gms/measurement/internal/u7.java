package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u7 implements Runnable {
    private final /* synthetic */ boolean b;
    private final /* synthetic */ long c;
    private final /* synthetic */ s7 d;
    private final /* synthetic */ s7 e;
    private final /* synthetic */ r7 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u7(r7 r7Var, boolean z, long j, s7 s7Var, s7 s7Var2) {
        this.f = r7Var;
        this.b = z;
        this.c = j;
        this.d = s7Var;
        this.e = s7Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if (com.google.android.gms.measurement.internal.z9.c(r10.d.a, r10.e.a) != false) goto L27;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            com.google.android.gms.measurement.internal.r7 r0 = r10.f
            com.google.android.gms.measurement.internal.la r0 = r0.m()
            com.google.android.gms.measurement.internal.x3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.o.Y
            boolean r0 = r0.a(r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L29
            boolean r0 = r10.b
            if (r0 == 0) goto L1c
            com.google.android.gms.measurement.internal.r7 r0 = r10.f
            com.google.android.gms.measurement.internal.s7 r0 = r0.c
            if (r0 == 0) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            if (r0 == 0) goto L39
            com.google.android.gms.measurement.internal.r7 r3 = r10.f
            com.google.android.gms.measurement.internal.s7 r4 = r3.c
            long r5 = r10.c
            com.google.android.gms.measurement.internal.r7.a(r3, r4, r2, r5)
            goto L39
        L29:
            boolean r0 = r10.b
            if (r0 == 0) goto L38
            com.google.android.gms.measurement.internal.r7 r0 = r10.f
            com.google.android.gms.measurement.internal.s7 r3 = r0.c
            if (r3 == 0) goto L38
            long r4 = r10.c
            com.google.android.gms.measurement.internal.r7.a(r0, r3, r2, r4)
        L38:
            r0 = 0
        L39:
            com.google.android.gms.measurement.internal.s7 r3 = r10.d
            if (r3 == 0) goto L5f
            long r4 = r3.c
            com.google.android.gms.measurement.internal.s7 r6 = r10.e
            long r7 = r6.c
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 != 0) goto L5f
            java.lang.String r3 = r3.b
            java.lang.String r4 = r6.b
            boolean r3 = com.google.android.gms.measurement.internal.z9.c(r3, r4)
            if (r3 == 0) goto L5f
            com.google.android.gms.measurement.internal.s7 r3 = r10.d
            java.lang.String r3 = r3.a
            com.google.android.gms.measurement.internal.s7 r4 = r10.e
            java.lang.String r4 = r4.a
            boolean r3 = com.google.android.gms.measurement.internal.z9.c(r3, r4)
            if (r3 != 0) goto L60
        L5f:
            r1 = 1
        L60:
            if (r1 == 0) goto Lc3
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            com.google.android.gms.measurement.internal.s7 r3 = r10.e
            com.google.android.gms.measurement.internal.r7.a(r3, r1, r2)
            com.google.android.gms.measurement.internal.s7 r2 = r10.d
            if (r2 == 0) goto L8b
            java.lang.String r2 = r2.a
            if (r2 == 0) goto L79
            java.lang.String r3 = "_pn"
            r1.putString(r3, r2)
        L79:
            com.google.android.gms.measurement.internal.s7 r2 = r10.d
            java.lang.String r2 = r2.b
            java.lang.String r3 = "_pc"
            r1.putString(r3, r2)
            com.google.android.gms.measurement.internal.s7 r2 = r10.d
            long r2 = r2.c
            java.lang.String r4 = "_pi"
            r1.putLong(r4, r2)
        L8b:
            com.google.android.gms.measurement.internal.r7 r2 = r10.f
            com.google.android.gms.measurement.internal.la r2 = r2.m()
            com.google.android.gms.measurement.internal.x3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.o.Y
            boolean r2 = r2.a(r3)
            if (r2 == 0) goto Lb6
            if (r0 == 0) goto Lb6
            com.google.android.gms.measurement.internal.r7 r0 = r10.f
            com.google.android.gms.measurement.internal.x8 r0 = r0.u()
            com.google.android.gms.measurement.internal.g9 r0 = r0.e
            long r2 = r0.b()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto Lb6
            com.google.android.gms.measurement.internal.r7 r0 = r10.f
            com.google.android.gms.measurement.internal.z9 r0 = r0.i()
            r0.a(r1, r2)
        Lb6:
            com.google.android.gms.measurement.internal.r7 r0 = r10.f
            com.google.android.gms.measurement.internal.p6 r0 = r0.p()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_vs"
            r0.b(r2, r3, r1)
        Lc3:
            com.google.android.gms.measurement.internal.r7 r0 = r10.f
            com.google.android.gms.measurement.internal.s7 r1 = r10.e
            r0.c = r1
            com.google.android.gms.measurement.internal.w7 r0 = r0.r()
            com.google.android.gms.measurement.internal.s7 r1 = r10.e
            r0.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.u7.run():void");
    }
}
