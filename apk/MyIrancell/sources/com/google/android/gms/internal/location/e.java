package com.google.android.gms.internal.location;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class e extends s implements d {
    public e() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // com.google.android.gms.internal.location.s
    protected final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        a((zzad) b0.a(parcel, zzad.CREATOR));
        return true;
    }
}
