package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC0864f;
import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.internal.C1057u;

/* renamed from: com.google.android.gms.common.api.internal.q2 */
/* loaded from: classes.dex */
public final class C0942q2 implements AbstractC0864f.b, AbstractC0864f.c {

    /* renamed from: a */
    public final C0859a<?> f5938a;

    /* renamed from: b */
    private final boolean f5939b;

    /* renamed from: c */
    private InterfaceC0950s2 f5940c;

    public C0942q2(C0859a<?> c0859a, boolean z) {
        this.f5938a = c0859a;
        this.f5939b = z;
    }

    /* renamed from: a */
    private final void m6846a() {
        C1057u.m7287a(this.f5940c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0895f
    /* renamed from: a */
    public final void mo6688a(int i) {
        m6846a();
        this.f5940c.mo6688a(i);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0923m
    /* renamed from: a */
    public final void mo6740a(ConnectionResult connectionResult) {
        m6846a();
        this.f5940c.mo6741a(connectionResult, this.f5938a, this.f5939b);
    }

    /* renamed from: a */
    public final void m6847a(InterfaceC0950s2 interfaceC0950s2) {
        this.f5940c = interfaceC0950s2;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0895f
    /* renamed from: b */
    public final void mo6689b(Bundle bundle) {
        m6846a();
        this.f5940c.mo6689b(bundle);
    }
}
