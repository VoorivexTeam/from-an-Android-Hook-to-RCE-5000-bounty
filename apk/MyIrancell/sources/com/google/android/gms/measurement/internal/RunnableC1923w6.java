package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.w6 */
/* loaded from: classes.dex */
public final class RunnableC1923w6 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ AtomicReference f8134b;

    /* renamed from: c */
    private final /* synthetic */ String f8135c;

    /* renamed from: d */
    private final /* synthetic */ String f8136d;

    /* renamed from: e */
    private final /* synthetic */ String f8137e;

    /* renamed from: f */
    private final /* synthetic */ C1846p6 f8138f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1923w6(C1846p6 c1846p6, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f8138f = c1846p6;
        this.f8134b = atomicReference;
        this.f8135c = str;
        this.f8136d = str2;
        this.f8137e = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8138f.f7550a.m9401F().m9873a(this.f8134b, this.f8135c, this.f8136d, this.f8137e);
    }
}
