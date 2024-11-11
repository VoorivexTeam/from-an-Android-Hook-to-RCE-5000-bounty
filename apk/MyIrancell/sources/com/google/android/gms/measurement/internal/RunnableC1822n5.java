package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1057u;

/* renamed from: com.google.android.gms.measurement.internal.n5 */
/* loaded from: classes.dex */
final class RunnableC1822n5 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ zzm f7787b;

    /* renamed from: c */
    private final /* synthetic */ BinderC1834o5 f7788c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1822n5(BinderC1834o5 binderC1834o5, zzm zzmVar) {
        this.f7788c = binderC1834o5;
        this.f7787b = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1838o9 c1838o9;
        C1838o9 c1838o92;
        c1838o9 = this.f7788c.f7912a;
        c1838o9.m9697r();
        c1838o92 = this.f7788c.f7912a;
        zzm zzmVar = this.f7787b;
        c1838o92.mo9320g().mo9194c();
        c1838o92.m9695p();
        C1057u.m7296b(zzmVar.f8231b);
        c1838o92.m9686c(zzmVar);
    }
}
