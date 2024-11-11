package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class i0 extends com.google.android.gms.internal.location.s implements h0 {
    public i0() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static h0 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return queryLocalInterface instanceof h0 ? (h0) queryLocalInterface : new j0(iBinder);
    }

    @Override // com.google.android.gms.internal.location.s
    protected final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            a((LocationResult) com.google.android.gms.internal.location.b0.a(parcel, LocationResult.CREATOR));
        } else {
            if (i != 2) {
                return false;
            }
            a((LocationAvailability) com.google.android.gms.internal.location.b0.a(parcel, LocationAvailability.CREATOR));
        }
        return true;
    }
}
