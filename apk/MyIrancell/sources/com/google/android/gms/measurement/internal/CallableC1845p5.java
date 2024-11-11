package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.p5 */
/* loaded from: classes.dex */
final class CallableC1845p5 implements Callable<List<C1926w9>> {

    /* renamed from: a */
    private final /* synthetic */ zzm f7959a;

    /* renamed from: b */
    private final /* synthetic */ String f7960b;

    /* renamed from: c */
    private final /* synthetic */ String f7961c;

    /* renamed from: d */
    private final /* synthetic */ BinderC1834o5 f7962d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC1845p5(BinderC1834o5 binderC1834o5, zzm zzmVar, String str, String str2) {
        this.f7962d = binderC1834o5;
        this.f7959a = zzmVar;
        this.f7960b = str;
        this.f7961c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C1926w9> call() {
        C1838o9 c1838o9;
        C1838o9 c1838o92;
        c1838o9 = this.f7962d.f7912a;
        c1838o9.m9697r();
        c1838o92 = this.f7962d.f7912a;
        return c1838o92.m9689f().m9160a(this.f7959a.f8231b, this.f7960b, this.f7961c);
    }
}
