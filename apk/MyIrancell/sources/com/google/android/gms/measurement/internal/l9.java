package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l9 {
    private final com.google.android.gms.common.util.e a;
    private long b;

    public l9(com.google.android.gms.common.util.e eVar) {
        com.google.android.gms.common.internal.u.a(eVar);
        this.a = eVar;
    }

    public final void a() {
        this.b = this.a.b();
    }

    public final boolean a(long j) {
        return this.b == 0 || this.a.b() - this.b >= 3600000;
    }

    public final void b() {
        this.b = 0L;
    }
}
