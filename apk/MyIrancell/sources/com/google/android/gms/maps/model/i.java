package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class i implements Parcelable.Creator<MarkerOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MarkerOptions createFromParcel(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f3 = 0.0f;
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = 1.0f;
        float f7 = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 2:
                    latLng = (LatLng) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, LatLng.CREATOR);
                    break;
                case 3:
                    str = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                case 4:
                    str2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                case 5:
                    iBinder = com.google.android.gms.common.internal.safeparcel.a.z(parcel, a);
                    break;
                case 6:
                    f = com.google.android.gms.common.internal.safeparcel.a.x(parcel, a);
                    break;
                case 7:
                    f2 = com.google.android.gms.common.internal.safeparcel.a.x(parcel, a);
                    break;
                case 8:
                    z = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
                    break;
                case 9:
                    z2 = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
                    break;
                case 10:
                    z3 = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
                    break;
                case 11:
                    f3 = com.google.android.gms.common.internal.safeparcel.a.x(parcel, a);
                    break;
                case 12:
                    f4 = com.google.android.gms.common.internal.safeparcel.a.x(parcel, a);
                    break;
                case 13:
                    f5 = com.google.android.gms.common.internal.safeparcel.a.x(parcel, a);
                    break;
                case 14:
                    f6 = com.google.android.gms.common.internal.safeparcel.a.x(parcel, a);
                    break;
                case 15:
                    f7 = com.google.android.gms.common.internal.safeparcel.a.x(parcel, a);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.G(parcel, a);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.r(parcel, b);
        return new MarkerOptions(latLng, str, str2, iBinder, f, f2, z, z2, z3, f3, f4, f5, f6, f7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MarkerOptions[] newArray(int i) {
        return new MarkerOptions[i];
    }
}
