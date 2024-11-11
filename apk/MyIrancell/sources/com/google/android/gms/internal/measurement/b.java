package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.ld;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends ld.a {
    private final /* synthetic */ String f;
    private final /* synthetic */ String g;
    private final /* synthetic */ Context h;
    private final /* synthetic */ Bundle i;
    private final /* synthetic */ ld j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ld ldVar, String str, String str2, Context context, Bundle bundle) {
        super(ldVar);
        this.j = ldVar;
        this.f = str;
        this.g = str2;
        this.h = context;
        this.i = bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054 A[Catch: Exception -> 0x009a, TryCatch #0 {Exception -> 0x009a, blocks: (B:3:0x0002, B:5:0x0019, B:6:0x002a, B:11:0x003f, B:13:0x0054, B:16:0x005a, B:18:0x0068, B:22:0x007d), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[Catch: Exception -> 0x009a, TryCatch #0 {Exception -> 0x009a, blocks: (B:3:0x0002, B:5:0x0019, B:6:0x002a, B:11:0x003f, B:13:0x0054, B:16:0x005a, B:18:0x0068, B:22:0x007d), top: B:2:0x0002 }] */
    @Override // com.google.android.gms.internal.measurement.ld.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r14 = this;
            r0 = 0
            r1 = 1
            com.google.android.gms.internal.measurement.ld r2 = r14.j     // Catch: java.lang.Exception -> L9a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> L9a
            r3.<init>()     // Catch: java.lang.Exception -> L9a
            com.google.android.gms.internal.measurement.ld.a(r2, r3)     // Catch: java.lang.Exception -> L9a
            com.google.android.gms.internal.measurement.ld r2 = r14.j     // Catch: java.lang.Exception -> L9a
            java.lang.String r3 = r14.f     // Catch: java.lang.Exception -> L9a
            java.lang.String r4 = r14.g     // Catch: java.lang.Exception -> L9a
            boolean r2 = com.google.android.gms.internal.measurement.ld.a(r2, r3, r4)     // Catch: java.lang.Exception -> L9a
            r3 = 0
            if (r2 == 0) goto L27
            java.lang.String r3 = r14.g     // Catch: java.lang.Exception -> L9a
            java.lang.String r2 = r14.f     // Catch: java.lang.Exception -> L9a
            com.google.android.gms.internal.measurement.ld r4 = r14.j     // Catch: java.lang.Exception -> L9a
            java.lang.String r4 = com.google.android.gms.internal.measurement.ld.b(r4)     // Catch: java.lang.Exception -> L9a
            r10 = r2
            r11 = r3
            r9 = r4
            goto L2a
        L27:
            r9 = r3
            r10 = r9
            r11 = r10
        L2a:
            android.content.Context r2 = r14.h     // Catch: java.lang.Exception -> L9a
            com.google.android.gms.internal.measurement.ld.c(r2)     // Catch: java.lang.Exception -> L9a
            java.lang.Boolean r2 = com.google.android.gms.internal.measurement.ld.f()     // Catch: java.lang.Exception -> L9a
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Exception -> L9a
            if (r2 != 0) goto L3e
            if (r10 == 0) goto L3c
            goto L3e
        L3c:
            r2 = 0
            goto L3f
        L3e:
            r2 = 1
        L3f:
            com.google.android.gms.internal.measurement.ld r3 = r14.j     // Catch: java.lang.Exception -> L9a
            com.google.android.gms.internal.measurement.ld r4 = r14.j     // Catch: java.lang.Exception -> L9a
            android.content.Context r5 = r14.h     // Catch: java.lang.Exception -> L9a
            com.google.android.gms.internal.measurement.ob r4 = r4.a(r5, r2)     // Catch: java.lang.Exception -> L9a
            com.google.android.gms.internal.measurement.ld.a(r3, r4)     // Catch: java.lang.Exception -> L9a
            com.google.android.gms.internal.measurement.ld r3 = r14.j     // Catch: java.lang.Exception -> L9a
            com.google.android.gms.internal.measurement.ob r3 = com.google.android.gms.internal.measurement.ld.c(r3)     // Catch: java.lang.Exception -> L9a
            if (r3 != 0) goto L5a
            com.google.android.gms.internal.measurement.ld r2 = r14.j     // Catch: java.lang.Exception -> L9a
            com.google.android.gms.internal.measurement.ld.b(r2)     // Catch: java.lang.Exception -> L9a
            return
        L5a:
            android.content.Context r3 = r14.h     // Catch: java.lang.Exception -> L9a
            int r3 = com.google.android.gms.internal.measurement.ld.d(r3)     // Catch: java.lang.Exception -> L9a
            android.content.Context r4 = r14.h     // Catch: java.lang.Exception -> L9a
            int r4 = com.google.android.gms.internal.measurement.ld.e(r4)     // Catch: java.lang.Exception -> L9a
            if (r2 == 0) goto L73
            int r2 = java.lang.Math.max(r3, r4)     // Catch: java.lang.Exception -> L9a
            if (r4 >= r3) goto L70
            r3 = 1
            goto L71
        L70:
            r3 = 0
        L71:
            r8 = r3
            goto L7d
        L73:
            if (r3 <= 0) goto L76
            r4 = r3
        L76:
            if (r3 <= 0) goto L7a
            r2 = 1
            goto L7b
        L7a:
            r2 = 0
        L7b:
            r8 = r2
            r2 = r4
        L7d:
            com.google.android.gms.internal.measurement.zzv r13 = new com.google.android.gms.internal.measurement.zzv     // Catch: java.lang.Exception -> L9a
            r4 = 21028(0x5224, double:1.0389E-319)
            long r6 = (long) r2     // Catch: java.lang.Exception -> L9a
            android.os.Bundle r12 = r14.i     // Catch: java.lang.Exception -> L9a
            r3 = r13
            r3.<init>(r4, r6, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L9a
            com.google.android.gms.internal.measurement.ld r2 = r14.j     // Catch: java.lang.Exception -> L9a
            com.google.android.gms.internal.measurement.ob r2 = com.google.android.gms.internal.measurement.ld.c(r2)     // Catch: java.lang.Exception -> L9a
            android.content.Context r3 = r14.h     // Catch: java.lang.Exception -> L9a
            fp r3 = defpackage.gp.a(r3)     // Catch: java.lang.Exception -> L9a
            long r4 = r14.b     // Catch: java.lang.Exception -> L9a
            r2.initialize(r3, r13, r4)     // Catch: java.lang.Exception -> L9a
            return
        L9a:
            r2 = move-exception
            com.google.android.gms.internal.measurement.ld r3 = r14.j
            com.google.android.gms.internal.measurement.ld.a(r3, r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b.a():void");
    }
}
