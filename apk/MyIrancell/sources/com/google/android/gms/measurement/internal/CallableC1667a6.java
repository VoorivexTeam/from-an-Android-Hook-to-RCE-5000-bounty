package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.a6 */
/* loaded from: classes.dex */
final class CallableC1667a6 implements Callable<List<C1926w9>> {

    /* renamed from: a */
    private final /* synthetic */ zzm f7365a;

    /* renamed from: b */
    private final /* synthetic */ BinderC1834o5 f7366b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC1667a6(BinderC1834o5 binderC1834o5, zzm zzmVar) {
        this.f7366b = binderC1834o5;
        this.f7365a = zzmVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C1926w9> call() {
        C1838o9 c1838o9;
        C1838o9 c1838o92;
        c1838o9 = this.f7366b.f7912a;
        c1838o9.m9697r();
        c1838o92 = this.f7366b.f7912a;
        return c1838o92.m9689f().m9158a(this.f7365a.f8231b);
    }
}
