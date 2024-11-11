package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.location.BinderC1183s;
import com.google.android.gms.internal.location.C1161b0;

/* renamed from: com.google.android.gms.location.l0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1595l0 extends BinderC1183s implements InterfaceC1593k0 {
    /* renamed from: a */
    public static InterfaceC1593k0 m8973a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return queryLocalInterface instanceof InterfaceC1593k0 ? (InterfaceC1593k0) queryLocalInterface : new C1597m0(iBinder);
    }

    @Override // com.google.android.gms.internal.location.BinderC1183s
    /* renamed from: a */
    protected final boolean mo7479a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo7494a((Location) C1161b0.m7471a(parcel, Location.CREATOR));
        return true;
    }
}
