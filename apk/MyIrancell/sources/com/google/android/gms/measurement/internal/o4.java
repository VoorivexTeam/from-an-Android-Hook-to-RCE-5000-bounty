package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class o4 implements Runnable {
    private final l4 b;
    private final int c;
    private final Throwable d;
    private final byte[] e;
    private final String f;
    private final Map<String, List<String>> g;

    private o4(String str, l4 l4Var, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        com.google.android.gms.common.internal.u.a(l4Var);
        this.b = l4Var;
        this.c = i;
        this.d = th;
        this.e = bArr;
        this.f = str;
        this.g = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a(this.f, this.c, this.d, this.e, this.g);
    }
}
