package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: com.google.android.gms.maps.a */
/* loaded from: classes.dex */
public final class C1632a implements Parcelable.Creator<GoogleMapOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleMapOptions createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        CameraPosition cameraPosition = null;
        Float f = null;
        Float f2 = null;
        LatLngBounds latLngBounds = null;
        byte b = -1;
        byte b2 = -1;
        int i = 0;
        byte b3 = -1;
        byte b4 = -1;
        byte b5 = -1;
        byte b6 = -1;
        byte b7 = -1;
        byte b8 = -1;
        byte b9 = -1;
        byte b10 = -1;
        byte b11 = -1;
        byte b12 = -1;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            switch (C1052a.m7215a(m7216a)) {
                case 2:
                    b = C1052a.m7244u(parcel, m7216a);
                    break;
                case 3:
                    b2 = C1052a.m7244u(parcel, m7216a);
                    break;
                case 4:
                    i = C1052a.m7208A(parcel, m7216a);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) C1052a.m7217a(parcel, m7216a, CameraPosition.CREATOR);
                    break;
                case 6:
                    b3 = C1052a.m7244u(parcel, m7216a);
                    break;
                case 7:
                    b4 = C1052a.m7244u(parcel, m7216a);
                    break;
                case 8:
                    b5 = C1052a.m7244u(parcel, m7216a);
                    break;
                case 9:
                    b6 = C1052a.m7244u(parcel, m7216a);
                    break;
                case 10:
                    b7 = C1052a.m7244u(parcel, m7216a);
                    break;
                case 11:
                    b8 = C1052a.m7244u(parcel, m7216a);
                    break;
                case 12:
                    b9 = C1052a.m7244u(parcel, m7216a);
                    break;
                case 13:
                default:
                    C1052a.m7214G(parcel, m7216a);
                    break;
                case 14:
                    b10 = C1052a.m7244u(parcel, m7216a);
                    break;
                case 15:
                    b11 = C1052a.m7244u(parcel, m7216a);
                    break;
                case 16:
                    f = C1052a.m7248y(parcel, m7216a);
                    break;
                case 17:
                    f2 = C1052a.m7248y(parcel, m7216a);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) C1052a.m7217a(parcel, m7216a, LatLngBounds.CREATOR);
                    break;
                case 19:
                    b12 = C1052a.m7244u(parcel, m7216a);
                    break;
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new GoogleMapOptions(b, b2, i, cameraPosition, b3, b4, b5, b6, b7, b8, b9, b10, b11, f, f2, latLngBounds, b12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleMapOptions[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
