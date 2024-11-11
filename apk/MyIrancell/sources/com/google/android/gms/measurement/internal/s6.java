package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s6 implements Runnable {
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ Object d;
    private final /* synthetic */ long e;
    private final /* synthetic */ p6 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s6(p6 p6Var, String str, String str2, Object obj, long j) {
        this.f = p6Var;
        this.b = str;
        this.c = str2;
        this.d = obj;
        this.e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.a(this.b, this.c, this.d, this.e);
    }
}
