package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.x5 */
/* loaded from: classes.dex */
final class RunnableC1933x5 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ zzkq f8168b;

    /* renamed from: c */
    private final /* synthetic */ zzm f8169c;

    /* renamed from: d */
    private final /* synthetic */ BinderC1834o5 f8170d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1933x5(BinderC1834o5 binderC1834o5, zzkq zzkqVar, zzm zzmVar) {
        this.f8170d = binderC1834o5;
        this.f8168b = zzkqVar;
        this.f8169c = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1838o9 c1838o9;
        C1838o9 c1838o92;
        C1838o9 c1838o93;
        c1838o9 = this.f8170d.f7912a;
        c1838o9.m9697r();
        if (this.f8168b.zza() == null) {
            c1838o93 = this.f8170d.f7912a;
            c1838o93.m9681b(this.f8168b, this.f8169c);
        } else {
            c1838o92 = this.f8170d.f7912a;
            c1838o92.m9673a(this.f8168b, this.f8169c);
        }
    }
}
