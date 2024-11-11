package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.t5 */
/* loaded from: classes.dex */
final class RunnableC1889t5 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ zzm f8071b;

    /* renamed from: c */
    private final /* synthetic */ BinderC1834o5 f8072c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1889t5(BinderC1834o5 binderC1834o5, zzm zzmVar) {
        this.f8072c = binderC1834o5;
        this.f8071b = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1838o9 c1838o9;
        C1838o9 c1838o92;
        c1838o9 = this.f8072c.f7912a;
        c1838o9.m9697r();
        c1838o92 = this.f8072c.f7912a;
        c1838o92.m9674a(this.f8071b);
    }
}
