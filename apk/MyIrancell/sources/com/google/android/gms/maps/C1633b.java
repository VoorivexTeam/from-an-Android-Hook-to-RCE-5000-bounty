package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;

/* renamed from: com.google.android.gms.maps.b */
/* loaded from: classes.dex */
public final class C1633b implements Parcelable.Creator<StreetViewPanoramaOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ StreetViewPanoramaOptions createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        StreetViewPanoramaCamera streetViewPanoramaCamera = null;
        String str = null;
        LatLng latLng = null;
        Integer num = null;
        StreetViewSource streetViewSource = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            switch (C1052a.m7215a(m7216a)) {
                case 2:
                    streetViewPanoramaCamera = (StreetViewPanoramaCamera) C1052a.m7217a(parcel, m7216a, StreetViewPanoramaCamera.CREATOR);
                    break;
                case 3:
                    str = C1052a.m7238o(parcel, m7216a);
                    break;
                case 4:
                    latLng = (LatLng) C1052a.m7217a(parcel, m7216a, LatLng.CREATOR);
                    break;
                case 5:
                    num = C1052a.m7209B(parcel, m7216a);
                    break;
                case 6:
                    b = C1052a.m7244u(parcel, m7216a);
                    break;
                case 7:
                    b2 = C1052a.m7244u(parcel, m7216a);
                    break;
                case 8:
                    b3 = C1052a.m7244u(parcel, m7216a);
                    break;
                case 9:
                    b4 = C1052a.m7244u(parcel, m7216a);
                    break;
                case 10:
                    b5 = C1052a.m7244u(parcel, m7216a);
                    break;
                case 11:
                    streetViewSource = (StreetViewSource) C1052a.m7217a(parcel, m7216a, StreetViewSource.CREATOR);
                    break;
                default:
                    C1052a.m7214G(parcel, m7216a);
                    break;
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new StreetViewPanoramaOptions(streetViewPanoramaCamera, str, latLng, num, b, b2, b3, b4, b5, streetViewSource);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ StreetViewPanoramaOptions[] newArray(int i) {
        return new StreetViewPanoramaOptions[i];
    }
}
