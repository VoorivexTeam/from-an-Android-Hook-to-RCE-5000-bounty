package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m implements Parcelable.Creator<LocationSettingsRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationSettingsRequest createFromParcel(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        boolean z = false;
        ArrayList arrayList = null;
        zzae zzaeVar = null;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            int a2 = com.google.android.gms.common.internal.safeparcel.a.a(a);
            if (a2 == 1) {
                arrayList = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, LocationRequest.CREATOR);
            } else if (a2 == 2) {
                z = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
            } else if (a2 == 3) {
                z2 = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
            } else if (a2 != 5) {
                com.google.android.gms.common.internal.safeparcel.a.G(parcel, a);
            } else {
                zzaeVar = (zzae) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, zzae.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.r(parcel, b);
        return new LocationSettingsRequest(arrayList, z, z2, zzaeVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationSettingsRequest[] newArray(int i) {
        return new LocationSettingsRequest[i];
    }
}
