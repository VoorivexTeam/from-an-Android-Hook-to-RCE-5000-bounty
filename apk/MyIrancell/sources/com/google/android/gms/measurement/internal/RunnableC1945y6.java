package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.y6 */
/* loaded from: classes.dex */
public final class RunnableC1945y6 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ AtomicReference f8189b;

    /* renamed from: c */
    private final /* synthetic */ String f8190c;

    /* renamed from: d */
    private final /* synthetic */ String f8191d;

    /* renamed from: e */
    private final /* synthetic */ String f8192e;

    /* renamed from: f */
    private final /* synthetic */ boolean f8193f;

    /* renamed from: g */
    private final /* synthetic */ C1846p6 f8194g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1945y6(C1846p6 c1846p6, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f8194g = c1846p6;
        this.f8189b = atomicReference;
        this.f8190c = str;
        this.f8191d = str2;
        this.f8192e = str3;
        this.f8193f = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8194g.f7550a.m9401F().m9874a(this.f8189b, this.f8190c, this.f8191d, this.f8192e, this.f8193f);
    }
}
