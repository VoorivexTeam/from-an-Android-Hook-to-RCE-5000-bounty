package com.google.android.gms.internal.location;

import android.os.Parcel;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: com.google.android.gms.internal.location.j */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1174j extends BinderC1183s implements InterfaceC1173i {
    public AbstractBinderC1174j() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override // com.google.android.gms.internal.location.BinderC1183s
    /* renamed from: a */
    protected final boolean mo7479a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo7484a((LocationSettingsResult) C1161b0.m7471a(parcel, LocationSettingsResult.CREATOR));
        return true;
    }
}
