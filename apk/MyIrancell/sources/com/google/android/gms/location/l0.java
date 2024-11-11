package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class l0 extends com.google.android.gms.internal.location.s implements k0 {
    public static k0 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return queryLocalInterface instanceof k0 ? (k0) queryLocalInterface : new m0(iBinder);
    }

    @Override // com.google.android.gms.internal.location.s
    protected final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        a((Location) com.google.android.gms.internal.location.b0.a(parcel, Location.CREATOR));
        return true;
    }
}
