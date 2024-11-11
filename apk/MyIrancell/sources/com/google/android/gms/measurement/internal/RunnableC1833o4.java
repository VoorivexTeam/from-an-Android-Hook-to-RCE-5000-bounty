package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1057u;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.o4 */
/* loaded from: classes.dex */
final class RunnableC1833o4 implements Runnable {

    /* renamed from: b */
    private final InterfaceC1797l4 f7906b;

    /* renamed from: c */
    private final int f7907c;

    /* renamed from: d */
    private final Throwable f7908d;

    /* renamed from: e */
    private final byte[] f7909e;

    /* renamed from: f */
    private final String f7910f;

    /* renamed from: g */
    private final Map<String, List<String>> f7911g;

    private RunnableC1833o4(String str, InterfaceC1797l4 interfaceC1797l4, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        C1057u.m7286a(interfaceC1797l4);
        this.f7906b = interfaceC1797l4;
        this.f7907c = i;
        this.f7908d = th;
        this.f7909e = bArr;
        this.f7910f = str;
        this.f7911g = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7906b.mo9466a(this.f7910f, this.f7907c, this.f7908d, this.f7909e, this.f7911g);
    }
}
