package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.util.InterfaceC1099e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.l9 */
/* loaded from: classes.dex */
public final class C1802l9 {

    /* renamed from: a */
    private final InterfaceC1099e f7748a;

    /* renamed from: b */
    private long f7749b;

    public C1802l9(InterfaceC1099e interfaceC1099e) {
        C1057u.m7286a(interfaceC1099e);
        this.f7748a = interfaceC1099e;
    }

    /* renamed from: a */
    public final void m9469a() {
        this.f7749b = this.f7748a.mo7376b();
    }

    /* renamed from: a */
    public final boolean m9470a(long j) {
        return this.f7749b == 0 || this.f7748a.mo7376b() - this.f7749b >= 3600000;
    }

    /* renamed from: b */
    public final void m9471b() {
        this.f7749b = 0L;
    }
}
