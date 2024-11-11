package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.q6 */
/* loaded from: classes.dex */
public final class RunnableC1857q6 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ String f7982b;

    /* renamed from: c */
    private final /* synthetic */ String f7983c;

    /* renamed from: d */
    private final /* synthetic */ long f7984d;

    /* renamed from: e */
    private final /* synthetic */ Bundle f7985e;

    /* renamed from: f */
    private final /* synthetic */ boolean f7986f;

    /* renamed from: g */
    private final /* synthetic */ boolean f7987g;

    /* renamed from: h */
    private final /* synthetic */ boolean f7988h;

    /* renamed from: i */
    private final /* synthetic */ String f7989i;

    /* renamed from: j */
    private final /* synthetic */ C1846p6 f7990j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1857q6(C1846p6 c1846p6, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f7990j = c1846p6;
        this.f7982b = str;
        this.f7983c = str2;
        this.f7984d = j;
        this.f7985e = bundle;
        this.f7986f = z;
        this.f7987g = z2;
        this.f7988h = z3;
        this.f7989i = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7990j.m9737a(this.f7982b, this.f7983c, this.f7984d, this.f7985e, this.f7986f, this.f7987g, this.f7988h, this.f7989i);
    }
}
