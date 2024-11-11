package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.location.BinderC1183s;

/* renamed from: com.google.android.gms.location.f0 */
/* loaded from: classes.dex */
public class BinderC1583f0 extends BinderC1183s implements InterfaceC1581e0 {
    /* renamed from: a */
    public static InterfaceC1581e0 m8970a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        return queryLocalInterface instanceof InterfaceC1581e0 ? (InterfaceC1581e0) queryLocalInterface : new C1585g0(iBinder);
    }

    @Override // com.google.android.gms.internal.location.BinderC1183s
    /* renamed from: a */
    protected final boolean mo7479a(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw new NoSuchMethodError();
    }
}
