package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.b6 */
/* loaded from: classes.dex */
final class RunnableC1679b6 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ zzv f7399b;

    /* renamed from: c */
    private final /* synthetic */ zzm f7400c;

    /* renamed from: d */
    private final /* synthetic */ BinderC1834o5 f7401d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1679b6(BinderC1834o5 binderC1834o5, zzv zzvVar, zzm zzmVar) {
        this.f7401d = binderC1834o5;
        this.f7399b = zzvVar;
        this.f7400c = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1838o9 c1838o9;
        C1838o9 c1838o92;
        C1838o9 c1838o93;
        c1838o9 = this.f7401d.f7912a;
        c1838o9.m9697r();
        if (this.f7399b.f8255d.zza() == null) {
            c1838o93 = this.f7401d.f7912a;
            c1838o93.m9684b(this.f7399b, this.f7400c);
        } else {
            c1838o92 = this.f7401d.f7912a;
            c1838o92.m9676a(this.f7399b, this.f7400c);
        }
    }
}
