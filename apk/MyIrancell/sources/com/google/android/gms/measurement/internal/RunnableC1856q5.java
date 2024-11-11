package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.q5 */
/* loaded from: classes.dex */
final class RunnableC1856q5 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ zzv f7980b;

    /* renamed from: c */
    private final /* synthetic */ BinderC1834o5 f7981c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1856q5(BinderC1834o5 binderC1834o5, zzv zzvVar) {
        this.f7981c = binderC1834o5;
        this.f7980b = zzvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1838o9 c1838o9;
        C1838o9 c1838o92;
        C1838o9 c1838o93;
        c1838o9 = this.f7981c.f7912a;
        c1838o9.m9697r();
        if (this.f7980b.f8255d.zza() == null) {
            c1838o93 = this.f7981c.f7912a;
            c1838o93.m9683b(this.f7980b);
        } else {
            c1838o92 = this.f7981c.f7912a;
            c1838o92.m9675a(this.f7980b);
        }
    }
}
