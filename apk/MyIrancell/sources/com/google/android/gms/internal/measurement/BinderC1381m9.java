package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.m9 */
/* loaded from: classes.dex */
public final class BinderC1381m9 extends AbstractBinderC1295gd {

    /* renamed from: a */
    private final AtomicReference<Bundle> f6753a = new AtomicReference<>();

    /* renamed from: b */
    private boolean f6754b;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0003, code lost:
    
        r4 = r4.get("r");
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> T m8029a(android.os.Bundle r4, java.lang.Class<T> r5) {
        /*
            r0 = 0
            if (r4 == 0) goto L32
            java.lang.String r1 = "r"
            java.lang.Object r4 = r4.get(r1)
            if (r4 == 0) goto L32
            java.lang.Object r4 = r5.cast(r4)     // Catch: java.lang.ClassCastException -> L10
            return r4
        L10:
            r0 = move-exception
            java.lang.String r5 = r5.getCanonicalName()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.String r1 = "Unexpected object type. Expected, Received"
            java.lang.String r2 = ": %s, %s"
            java.lang.String r1 = r1.concat(r2)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r4
            java.lang.String.format(r1, r2)
            throw r0
        L32:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.BinderC1381m9.m8029a(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    /* renamed from: a */
    public final String m8030a(long j) {
        return (String) m8029a(m8031b(j), String.class);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1428pc
    /* renamed from: a */
    public final void mo7833a(Bundle bundle) {
        synchronized (this.f6753a) {
            try {
                this.f6753a.set(bundle);
                this.f6754b = true;
            } finally {
                this.f6753a.notify();
            }
        }
    }

    /* renamed from: b */
    public final Bundle m8031b(long j) {
        Bundle bundle;
        synchronized (this.f6753a) {
            if (!this.f6754b) {
                try {
                    this.f6753a.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.f6753a.get();
        }
        return bundle;
    }
}
