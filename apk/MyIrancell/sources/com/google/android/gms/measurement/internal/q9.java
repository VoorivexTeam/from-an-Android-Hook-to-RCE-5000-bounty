package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q9 implements l4 {
    private final /* synthetic */ String a;
    private final /* synthetic */ o9 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q9(o9 o9Var, String str) {
        this.b = o9Var;
        this.a = str;
    }

    @Override // com.google.android.gms.measurement.internal.l4
    public final void a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.b.a(i, th, bArr, this.a);
    }
}
