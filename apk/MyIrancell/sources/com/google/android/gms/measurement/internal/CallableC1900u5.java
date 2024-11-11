package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.u5 */
/* loaded from: classes.dex */
final class CallableC1900u5 implements Callable<List<zzv>> {

    /* renamed from: a */
    private final /* synthetic */ String f8093a;

    /* renamed from: b */
    private final /* synthetic */ String f8094b;

    /* renamed from: c */
    private final /* synthetic */ String f8095c;

    /* renamed from: d */
    private final /* synthetic */ BinderC1834o5 f8096d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC1900u5(BinderC1834o5 binderC1834o5, String str, String str2, String str3) {
        this.f8096d = binderC1834o5;
        this.f8093a = str;
        this.f8094b = str2;
        this.f8095c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzv> call() {
        C1838o9 c1838o9;
        C1838o9 c1838o92;
        c1838o9 = this.f8096d.f7912a;
        c1838o9.m9697r();
        c1838o92 = this.f8096d.f7912a;
        return c1838o92.m9689f().m9172b(this.f8093a, this.f8094b, this.f8095c);
    }
}
