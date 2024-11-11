package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.c6 */
/* loaded from: classes.dex */
final class RunnableC1691c6 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ String f7424b;

    /* renamed from: c */
    private final /* synthetic */ String f7425c;

    /* renamed from: d */
    private final /* synthetic */ String f7426d;

    /* renamed from: e */
    private final /* synthetic */ long f7427e;

    /* renamed from: f */
    private final /* synthetic */ BinderC1834o5 f7428f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1691c6(BinderC1834o5 binderC1834o5, String str, String str2, String str3, long j) {
        this.f7428f = binderC1834o5;
        this.f7424b = str;
        this.f7425c = str2;
        this.f7426d = str3;
        this.f7427e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1838o9 c1838o9;
        C1838o9 c1838o92;
        String str = this.f7424b;
        if (str == null) {
            c1838o92 = this.f7428f.f7912a;
            c1838o92.m9699t().m9400E().m9772a(this.f7425c, (C1880s7) null);
        } else {
            C1880s7 c1880s7 = new C1880s7(this.f7426d, str, this.f7427e);
            c1838o9 = this.f7428f.f7912a;
            c1838o9.m9699t().m9400E().m9772a(this.f7425c, c1880s7);
        }
    }
}
