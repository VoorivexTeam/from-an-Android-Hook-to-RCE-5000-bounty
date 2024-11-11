package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w6 implements Runnable {
    private final /* synthetic */ AtomicReference b;
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;
    private final /* synthetic */ String e;
    private final /* synthetic */ p6 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w6(p6 p6Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f = p6Var;
        this.b = atomicReference;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.a.F().a(this.b, this.c, this.d, this.e);
    }
}
