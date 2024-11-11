package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.api.InterfaceC0982m;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.google.android.gms.common.api.internal.n0 */
/* loaded from: classes.dex */
public final class C0928n0 implements InterfaceC0964w0 {

    /* renamed from: a */
    private final C0976z0 f5901a;

    public C0928n0(C0976z0 c0976z0) {
        this.f5901a = c0976z0;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0964w0
    /* renamed from: a */
    public final <A extends C0859a.b, T extends AbstractC0885d<? extends InterfaceC0982m, A>> T mo6673a(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0964w0
    /* renamed from: a */
    public final void mo6674a() {
        Iterator<C0859a.f> it = this.f5901a.f6029f.values().iterator();
        while (it.hasNext()) {
            it.next().mo6515b();
        }
        this.f5901a.f6037n.f5928q = Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0964w0
    /* renamed from: a */
    public final void mo6675a(int i) {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0964w0
    /* renamed from: a */
    public final void mo6676a(ConnectionResult connectionResult, C0859a<?> c0859a, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0964w0
    /* renamed from: b */
    public final <A extends C0859a.b, R extends InterfaceC0982m, T extends AbstractC0885d<R, A>> T mo6677b(T t) {
        this.f5901a.f6037n.f5920i.add(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0964w0
    /* renamed from: b */
    public final void mo6678b(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0964w0
    /* renamed from: b */
    public final boolean mo6679b() {
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0964w0
    /* renamed from: c */
    public final void mo6680c() {
        this.f5901a.m6936h();
    }
}
