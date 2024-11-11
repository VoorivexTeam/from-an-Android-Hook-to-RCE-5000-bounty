package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator<CameraPosition> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CameraPosition createFromParcel(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        float f = 0.0f;
        LatLng latLng = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            int a2 = com.google.android.gms.common.internal.safeparcel.a.a(a);
            if (a2 == 2) {
                latLng = (LatLng) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, LatLng.CREATOR);
            } else if (a2 == 3) {
                f = com.google.android.gms.common.internal.safeparcel.a.x(parcel, a);
            } else if (a2 == 4) {
                f2 = com.google.android.gms.common.internal.safeparcel.a.x(parcel, a);
            } else if (a2 != 5) {
                com.google.android.gms.common.internal.safeparcel.a.G(parcel, a);
            } else {
                f3 = com.google.android.gms.common.internal.safeparcel.a.x(parcel, a);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.r(parcel, b);
        return new CameraPosition(latLng, f, f2, f3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CameraPosition[] newArray(int i) {
        return new CameraPosition[i];
    }
}
