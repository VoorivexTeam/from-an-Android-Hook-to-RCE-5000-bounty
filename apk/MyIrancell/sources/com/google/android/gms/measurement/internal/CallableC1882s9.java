package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.s9 */
/* loaded from: classes.dex */
public final class CallableC1882s9 implements Callable<String> {

    /* renamed from: a */
    private final /* synthetic */ zzm f8059a;

    /* renamed from: b */
    private final /* synthetic */ C1838o9 f8060b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC1882s9(C1838o9 c1838o9, zzm zzmVar) {
        this.f8060b = c1838o9;
        this.f8059a = zzmVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        C1714e5 m9686c = this.f8060b.m9686c(this.f8059a);
        if (m9686c != null) {
            return m9686c.m9271m();
        }
        this.f8060b.mo9324k().m9312w().m9365a("App info was null when attempting to get app instance id");
        return null;
    }
}
