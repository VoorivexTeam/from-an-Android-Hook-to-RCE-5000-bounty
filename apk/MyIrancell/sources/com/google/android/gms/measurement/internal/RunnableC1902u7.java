package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.u7 */
/* loaded from: classes.dex */
public final class RunnableC1902u7 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ boolean f8099b;

    /* renamed from: c */
    private final /* synthetic */ long f8100c;

    /* renamed from: d */
    private final /* synthetic */ C1880s7 f8101d;

    /* renamed from: e */
    private final /* synthetic */ C1880s7 f8102e;

    /* renamed from: f */
    private final /* synthetic */ C1869r7 f8103f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1902u7(C1869r7 c1869r7, boolean z, long j, C1880s7 c1880s7, C1880s7 c1880s72) {
        this.f8103f = c1869r7;
        this.f8099b = z;
        this.f8100c = j;
        this.f8101d = c1880s7;
        this.f8102e = c1880s72;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if (com.google.android.gms.measurement.internal.C1959z9.m9924c(r10.f8101d.f8054a, r10.f8102e.f8054a) != false) goto L27;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            com.google.android.gms.measurement.internal.r7 r0 = r10.f8103f
            com.google.android.gms.measurement.internal.la r0 = r0.m9326m()
            com.google.android.gms.measurement.internal.x3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C1828o.f7846Y
            boolean r0 = r0.m9480a(r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L29
            boolean r0 = r10.f8099b
            if (r0 == 0) goto L1c
            com.google.android.gms.measurement.internal.r7 r0 = r10.f8103f
            com.google.android.gms.measurement.internal.s7 r0 = r0.f8006c
            if (r0 == 0) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            if (r0 == 0) goto L39
            com.google.android.gms.measurement.internal.r7 r3 = r10.f8103f
            com.google.android.gms.measurement.internal.s7 r4 = r3.f8006c
            long r5 = r10.f8100c
            com.google.android.gms.measurement.internal.C1869r7.m9763a(r3, r4, r2, r5)
            goto L39
        L29:
            boolean r0 = r10.f8099b
            if (r0 == 0) goto L38
            com.google.android.gms.measurement.internal.r7 r0 = r10.f8103f
            com.google.android.gms.measurement.internal.s7 r3 = r0.f8006c
            if (r3 == 0) goto L38
            long r4 = r10.f8100c
            com.google.android.gms.measurement.internal.C1869r7.m9763a(r0, r3, r2, r4)
        L38:
            r0 = 0
        L39:
            com.google.android.gms.measurement.internal.s7 r3 = r10.f8101d
            if (r3 == 0) goto L5f
            long r4 = r3.f8056c
            com.google.android.gms.measurement.internal.s7 r6 = r10.f8102e
            long r7 = r6.f8056c
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 != 0) goto L5f
            java.lang.String r3 = r3.f8055b
            java.lang.String r4 = r6.f8055b
            boolean r3 = com.google.android.gms.measurement.internal.C1959z9.m9924c(r3, r4)
            if (r3 == 0) goto L5f
            com.google.android.gms.measurement.internal.s7 r3 = r10.f8101d
            java.lang.String r3 = r3.f8054a
            com.google.android.gms.measurement.internal.s7 r4 = r10.f8102e
            java.lang.String r4 = r4.f8054a
            boolean r3 = com.google.android.gms.measurement.internal.C1959z9.m9924c(r3, r4)
            if (r3 != 0) goto L60
        L5f:
            r1 = 1
        L60:
            if (r1 == 0) goto Lc3
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            com.google.android.gms.measurement.internal.s7 r3 = r10.f8102e
            com.google.android.gms.measurement.internal.C1869r7.m9764a(r3, r1, r2)
            com.google.android.gms.measurement.internal.s7 r2 = r10.f8101d
            if (r2 == 0) goto L8b
            java.lang.String r2 = r2.f8054a
            if (r2 == 0) goto L79
            java.lang.String r3 = "_pn"
            r1.putString(r3, r2)
        L79:
            com.google.android.gms.measurement.internal.s7 r2 = r10.f8101d
            java.lang.String r2 = r2.f8055b
            java.lang.String r3 = "_pc"
            r1.putString(r3, r2)
            com.google.android.gms.measurement.internal.s7 r2 = r10.f8101d
            long r2 = r2.f8056c
            java.lang.String r4 = "_pi"
            r1.putLong(r4, r2)
        L8b:
            com.google.android.gms.measurement.internal.r7 r2 = r10.f8103f
            com.google.android.gms.measurement.internal.la r2 = r2.m9326m()
            com.google.android.gms.measurement.internal.x3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C1828o.f7846Y
            boolean r2 = r2.m9480a(r3)
            if (r2 == 0) goto Lb6
            if (r0 == 0) goto Lb6
            com.google.android.gms.measurement.internal.r7 r0 = r10.f8103f
            com.google.android.gms.measurement.internal.x8 r0 = r0.m9202u()
            com.google.android.gms.measurement.internal.g9 r0 = r0.f8179e
            long r2 = r0.m9355b()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto Lb6
            com.google.android.gms.measurement.internal.r7 r0 = r10.f8103f
            com.google.android.gms.measurement.internal.z9 r0 = r0.m9322i()
            r0.m9940a(r1, r2)
        Lb6:
            com.google.android.gms.measurement.internal.r7 r0 = r10.f8103f
            com.google.android.gms.measurement.internal.p6 r0 = r0.m9197p()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_vs"
            r0.m9749b(r2, r3, r1)
        Lc3:
            com.google.android.gms.measurement.internal.r7 r0 = r10.f8103f
            com.google.android.gms.measurement.internal.s7 r1 = r10.f8102e
            r0.f8006c = r1
            com.google.android.gms.measurement.internal.w7 r0 = r0.m9199r()
            com.google.android.gms.measurement.internal.s7 r1 = r10.f8102e
            r0.m9866a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.RunnableC1902u7.run():void");
    }
}
