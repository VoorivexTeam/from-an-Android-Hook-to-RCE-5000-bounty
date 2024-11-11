package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.r5 */
/* loaded from: classes.dex */
final class CallableC1867r5 implements Callable<List<zzv>> {

    /* renamed from: a */
    private final /* synthetic */ zzm f8000a;

    /* renamed from: b */
    private final /* synthetic */ String f8001b;

    /* renamed from: c */
    private final /* synthetic */ String f8002c;

    /* renamed from: d */
    private final /* synthetic */ BinderC1834o5 f8003d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC1867r5(BinderC1834o5 binderC1834o5, zzm zzmVar, String str, String str2) {
        this.f8003d = binderC1834o5;
        this.f8000a = zzmVar;
        this.f8001b = str;
        this.f8002c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzv> call() {
        C1838o9 c1838o9;
        C1838o9 c1838o92;
        c1838o9 = this.f8003d.f7912a;
        c1838o9.m9697r();
        c1838o92 = this.f8003d.f7912a;
        return c1838o92.m9689f().m9172b(this.f8000a.f8231b, this.f8001b, this.f8002c);
    }
}
