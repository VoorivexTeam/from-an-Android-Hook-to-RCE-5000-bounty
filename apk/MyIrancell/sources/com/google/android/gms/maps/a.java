package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator<GoogleMapOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleMapOptions createFromParcel(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        CameraPosition cameraPosition = null;
        Float f = null;
        Float f2 = null;
        LatLngBounds latLngBounds = null;
        byte b2 = -1;
        byte b3 = -1;
        int i = 0;
        byte b4 = -1;
        byte b5 = -1;
        byte b6 = -1;
        byte b7 = -1;
        byte b8 = -1;
        byte b9 = -1;
        byte b10 = -1;
        byte b11 = -1;
        byte b12 = -1;
        byte b13 = -1;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 2:
                    b2 = com.google.android.gms.common.internal.safeparcel.a.u(parcel, a);
                    break;
                case 3:
                    b3 = com.google.android.gms.common.internal.safeparcel.a.u(parcel, a);
                    break;
                case 4:
                    i = com.google.android.gms.common.internal.safeparcel.a.A(parcel, a);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, CameraPosition.CREATOR);
                    break;
                case 6:
                    b4 = com.google.android.gms.common.internal.safeparcel.a.u(parcel, a);
                    break;
                case 7:
                    b5 = com.google.android.gms.common.internal.safeparcel.a.u(parcel, a);
                    break;
                case 8:
                    b6 = com.google.android.gms.common.internal.safeparcel.a.u(parcel, a);
                    break;
                case 9:
                    b7 = com.google.android.gms.common.internal.safeparcel.a.u(parcel, a);
                    break;
                case 10:
                    b8 = com.google.android.gms.common.internal.safeparcel.a.u(parcel, a);
                    break;
                case 11:
                    b9 = com.google.android.gms.common.internal.safeparcel.a.u(parcel, a);
                    break;
                case 12:
                    b10 = com.google.android.gms.common.internal.safeparcel.a.u(parcel, a);
                    break;
                case 13:
                default:
                    com.google.android.gms.common.internal.safeparcel.a.G(parcel, a);
                    break;
                case 14:
                    b11 = com.google.android.gms.common.internal.safeparcel.a.u(parcel, a);
                    break;
                case 15:
                    b12 = com.google.android.gms.common.internal.safeparcel.a.u(parcel, a);
                    break;
                case 16:
                    f = com.google.android.gms.common.internal.safeparcel.a.y(parcel, a);
                    break;
                case 17:
                    f2 = com.google.android.gms.common.internal.safeparcel.a.y(parcel, a);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, LatLngBounds.CREATOR);
                    break;
                case 19:
                    b13 = com.google.android.gms.common.internal.safeparcel.a.u(parcel, a);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.r(parcel, b);
        return new GoogleMapOptions(b2, b3, i, cameraPosition, b4, b5, b6, b7, b8, b9, b10, b11, b12, f, f2, latLngBounds, b13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleMapOptions[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
