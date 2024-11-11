package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1057u;
import java.lang.Thread;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.i5 */
/* loaded from: classes.dex */
public final class C1762i5 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final String f7625a;

    /* renamed from: b */
    private final /* synthetic */ C1738g5 f7626b;

    public C1762i5(C1738g5 c1738g5, String str) {
        this.f7626b = c1738g5;
        C1057u.m7286a(str);
        this.f7625a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f7626b.mo9324k().m9309t().m9366a(this.f7625a, th);
    }
}
