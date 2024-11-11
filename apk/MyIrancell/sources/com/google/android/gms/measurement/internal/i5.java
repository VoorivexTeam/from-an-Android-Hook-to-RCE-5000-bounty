package com.google.android.gms.measurement.internal;

import java.lang.Thread;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i5 implements Thread.UncaughtExceptionHandler {
    private final String a;
    private final /* synthetic */ g5 b;

    public i5(g5 g5Var, String str) {
        this.b = g5Var;
        com.google.android.gms.common.internal.u.a(str);
        this.a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.b.k().t().a(this.a, th);
    }
}
