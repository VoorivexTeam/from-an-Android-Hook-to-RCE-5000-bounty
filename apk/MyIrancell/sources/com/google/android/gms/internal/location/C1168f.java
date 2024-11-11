package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.location.f */
/* loaded from: classes.dex */
public final class C1168f extends C1158a implements InterfaceC1164d {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1168f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // com.google.android.gms.internal.location.InterfaceC1164d
    /* renamed from: a */
    public final void mo7476a(zzad zzadVar) {
        Parcel m7466a = m7466a();
        C1161b0.m7473a(m7466a, zzadVar);
        m7468b(1, m7466a);
    }
}
