package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.s5 */
/* loaded from: classes.dex */
final class CallableC1878s5 implements Callable<List<C1926w9>> {

    /* renamed from: a */
    private final /* synthetic */ String f8045a;

    /* renamed from: b */
    private final /* synthetic */ String f8046b;

    /* renamed from: c */
    private final /* synthetic */ String f8047c;

    /* renamed from: d */
    private final /* synthetic */ BinderC1834o5 f8048d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC1878s5(BinderC1834o5 binderC1834o5, String str, String str2, String str3) {
        this.f8048d = binderC1834o5;
        this.f8045a = str;
        this.f8046b = str2;
        this.f8047c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C1926w9> call() {
        C1838o9 c1838o9;
        C1838o9 c1838o92;
        c1838o9 = this.f8048d.f7912a;
        c1838o9.m9697r();
        c1838o92 = this.f8048d.f7912a;
        return c1838o92.m9689f().m9160a(this.f8045a, this.f8046b, this.f8047c);
    }
}
