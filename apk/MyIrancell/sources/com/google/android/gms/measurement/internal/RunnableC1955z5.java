package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.z5 */
/* loaded from: classes.dex */
final class RunnableC1955z5 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ zzm f8206b;

    /* renamed from: c */
    private final /* synthetic */ BinderC1834o5 f8207c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1955z5(BinderC1834o5 binderC1834o5, zzm zzmVar) {
        this.f8207c = binderC1834o5;
        this.f8206b = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1838o9 c1838o9;
        C1838o9 c1838o92;
        c1838o9 = this.f8207c.f7912a;
        c1838o9.m9697r();
        c1838o92 = this.f8207c.f7912a;
        c1838o92.m9682b(this.f8206b);
    }
}
