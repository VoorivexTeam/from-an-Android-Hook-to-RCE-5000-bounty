package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.b2 */
/* loaded from: classes.dex */
public final class RunnableC1675b2 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ String f7378b;

    /* renamed from: c */
    private final /* synthetic */ long f7379c;

    /* renamed from: d */
    private final /* synthetic */ C1949z f7380d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1675b2(C1949z c1949z, String str, long j) {
        this.f7380d = c1949z;
        this.f7378b = str;
        this.f7379c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7380d.m9899d(this.f7378b, this.f7379c);
    }
}
