package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.InterfaceC1038m;
import p000.C0489bq;
import p000.C2355cq;

/* renamed from: com.google.android.gms.signin.internal.g */
/* loaded from: classes.dex */
public final class C1966g extends C0489bq implements InterfaceC1964e {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1966g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.signin.internal.InterfaceC1964e
    /* renamed from: a */
    public final void mo9980a(InterfaceC1038m interfaceC1038m, int i, boolean z) {
        Parcel m3435a = m3435a();
        C2355cq.m11207a(m3435a, interfaceC1038m);
        m3435a.writeInt(i);
        C2355cq.m11209a(m3435a, z);
        m3436a(9, m3435a);
    }

    @Override // com.google.android.gms.signin.internal.InterfaceC1964e
    /* renamed from: a */
    public final void mo9981a(zai zaiVar, InterfaceC1962c interfaceC1962c) {
        Parcel m3435a = m3435a();
        C2355cq.m11208a(m3435a, zaiVar);
        C2355cq.m11207a(m3435a, interfaceC1962c);
        m3436a(12, m3435a);
    }

    @Override // com.google.android.gms.signin.internal.InterfaceC1964e
    /* renamed from: c */
    public final void mo9982c(int i) {
        Parcel m3435a = m3435a();
        m3435a.writeInt(i);
        m3436a(7, m3435a);
    }
}
