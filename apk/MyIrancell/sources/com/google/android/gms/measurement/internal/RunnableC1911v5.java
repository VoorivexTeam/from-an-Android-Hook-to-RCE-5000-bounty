package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.v5 */
/* loaded from: classes.dex */
final class RunnableC1911v5 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ zzan f8114b;

    /* renamed from: c */
    private final /* synthetic */ String f8115c;

    /* renamed from: d */
    private final /* synthetic */ BinderC1834o5 f8116d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1911v5(BinderC1834o5 binderC1834o5, zzan zzanVar, String str) {
        this.f8116d = binderC1834o5;
        this.f8114b = zzanVar;
        this.f8115c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1838o9 c1838o9;
        C1838o9 c1838o92;
        c1838o9 = this.f8116d.f7912a;
        c1838o9.m9697r();
        c1838o92 = this.f8116d.f7912a;
        c1838o92.m9672a(this.f8114b, this.f8115c);
    }
}
