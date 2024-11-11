package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.r9 */
/* loaded from: classes.dex */
public final class RunnableC1871r9 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ C1904u9 f8012b;

    /* renamed from: c */
    private final /* synthetic */ C1838o9 f8013c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1871r9(C1838o9 c1838o9, C1904u9 c1904u9) {
        this.f8013c = c1838o9;
        this.f8012b = c1904u9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8013c.m9653a(this.f8012b);
        this.f8013c.m9668a();
    }
}
