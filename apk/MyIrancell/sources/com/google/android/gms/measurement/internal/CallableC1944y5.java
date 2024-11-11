package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.y5 */
/* loaded from: classes.dex */
final class CallableC1944y5 implements Callable<byte[]> {

    /* renamed from: a */
    private final /* synthetic */ zzan f8186a;

    /* renamed from: b */
    private final /* synthetic */ String f8187b;

    /* renamed from: c */
    private final /* synthetic */ BinderC1834o5 f8188c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC1944y5(BinderC1834o5 binderC1834o5, zzan zzanVar, String str) {
        this.f8188c = binderC1834o5;
        this.f8186a = zzanVar;
        this.f8187b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() {
        C1838o9 c1838o9;
        C1838o9 c1838o92;
        c1838o9 = this.f8188c.f7912a;
        c1838o9.m9697r();
        c1838o92 = this.f8188c.f7912a;
        c1838o92.m9691j().m9760a(this.f8186a, this.f8187b);
        throw null;
    }
}
