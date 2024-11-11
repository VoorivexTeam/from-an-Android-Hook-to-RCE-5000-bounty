package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.v8 */
/* loaded from: classes.dex */
public final class RunnableC1914v8 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ C1838o9 f8120b;

    /* renamed from: c */
    private final /* synthetic */ Runnable f8121c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1914v8(C1903u8 c1903u8, C1838o9 c1838o9, Runnable runnable) {
        this.f8120b = c1838o9;
        this.f8121c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8120b.m9697r();
        this.f8120b.m9677a(this.f8121c);
        this.f8120b.m9696q();
    }
}
