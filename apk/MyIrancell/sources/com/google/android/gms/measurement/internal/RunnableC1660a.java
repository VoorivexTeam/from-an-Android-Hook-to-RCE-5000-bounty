package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.a */
/* loaded from: classes.dex */
public final class RunnableC1660a implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ String f7352b;

    /* renamed from: c */
    private final /* synthetic */ long f7353c;

    /* renamed from: d */
    private final /* synthetic */ C1949z f7354d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1660a(C1949z c1949z, String str, long j) {
        this.f7354d = c1949z;
        this.f7352b = str;
        this.f7353c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7354d.m9898c(this.f7352b, this.f7353c);
    }
}
