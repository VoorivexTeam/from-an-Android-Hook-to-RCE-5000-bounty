package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.maps.model.e */
/* loaded from: classes.dex */
public final class C1639e implements Parcelable.Creator<GroundOverlayOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GroundOverlayOptions createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        IBinder iBinder = null;
        LatLng latLng = null;
        LatLngBounds latLngBounds = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        boolean z = false;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        boolean z2 = false;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            switch (C1052a.m7215a(m7216a)) {
                case 2:
                    iBinder = C1052a.m7249z(parcel, m7216a);
                    break;
                case 3:
                    latLng = (LatLng) C1052a.m7217a(parcel, m7216a, LatLng.CREATOR);
                    break;
                case 4:
                    f = C1052a.m7247x(parcel, m7216a);
                    break;
                case 5:
                    f2 = C1052a.m7247x(parcel, m7216a);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) C1052a.m7217a(parcel, m7216a, LatLngBounds.CREATOR);
                    break;
                case 7:
                    f3 = C1052a.m7247x(parcel, m7216a);
                    break;
                case 8:
                    f4 = C1052a.m7247x(parcel, m7216a);
                    break;
                case 9:
                    z = C1052a.m7242s(parcel, m7216a);
                    break;
                case 10:
                    f5 = C1052a.m7247x(parcel, m7216a);
                    break;
                case 11:
                    f6 = C1052a.m7247x(parcel, m7216a);
                    break;
                case 12:
                    f7 = C1052a.m7247x(parcel, m7216a);
                    break;
                case 13:
                    z2 = C1052a.m7242s(parcel, m7216a);
                    break;
                default:
                    C1052a.m7214G(parcel, m7216a);
                    break;
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new GroundOverlayOptions(iBinder, latLng, f, f2, latLngBounds, f3, f4, z, f5, f6, f7, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GroundOverlayOptions[] newArray(int i) {
        return new GroundOverlayOptions[i];
    }
}
