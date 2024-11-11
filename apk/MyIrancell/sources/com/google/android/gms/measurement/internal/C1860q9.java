package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.q9 */
/* loaded from: classes.dex */
public final class C1860q9 implements InterfaceC1797l4 {

    /* renamed from: a */
    private final /* synthetic */ String f7993a;

    /* renamed from: b */
    private final /* synthetic */ C1838o9 f7994b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1860q9(C1838o9 c1838o9, String str) {
        this.f7994b = c1838o9;
        this.f7993a = str;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1797l4
    /* renamed from: a */
    public final void mo9466a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.f7994b.m9669a(i, th, bArr, this.f7993a);
    }
}
