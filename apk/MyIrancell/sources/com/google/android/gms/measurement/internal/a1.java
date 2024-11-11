package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class a1 implements Runnable {
    private final /* synthetic */ long b;
    private final /* synthetic */ z c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a1(z zVar, long j) {
        this.c = zVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.b(this.b);
    }
}
