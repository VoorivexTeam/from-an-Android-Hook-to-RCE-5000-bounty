package com.google.android.gms.internal.location;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.location.e */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1166e extends BinderC1183s implements InterfaceC1164d {
    public AbstractBinderC1166e() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // com.google.android.gms.internal.location.BinderC1183s
    /* renamed from: a */
    protected final boolean mo7479a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo7476a((zzad) C1161b0.m7471a(parcel, zzad.CREATOR));
        return true;
    }
}
