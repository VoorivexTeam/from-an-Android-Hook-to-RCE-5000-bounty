package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.location.BinderC1183s;
import com.google.android.gms.internal.location.C1161b0;

/* renamed from: com.google.android.gms.location.i0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1589i0 extends BinderC1183s implements InterfaceC1587h0 {
    public AbstractBinderC1589i0() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    /* renamed from: a */
    public static InterfaceC1587h0 m8972a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return queryLocalInterface instanceof InterfaceC1587h0 ? (InterfaceC1587h0) queryLocalInterface : new C1591j0(iBinder);
    }

    @Override // com.google.android.gms.internal.location.BinderC1183s
    /* renamed from: a */
    protected final boolean mo7479a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo7493a((LocationResult) C1161b0.m7471a(parcel, LocationResult.CREATOR));
        } else {
            if (i != 2) {
                return false;
            }
            mo7492a((LocationAvailability) C1161b0.m7471a(parcel, LocationAvailability.CREATOR));
        }
        return true;
    }
}
