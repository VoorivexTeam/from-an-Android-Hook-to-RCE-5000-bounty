package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a implements Runnable {
    private final /* synthetic */ String b;
    private final /* synthetic */ long c;
    private final /* synthetic */ z d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(z zVar, String str, long j) {
        this.d = zVar;
        this.b = str;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.c(this.b, this.c);
    }
}