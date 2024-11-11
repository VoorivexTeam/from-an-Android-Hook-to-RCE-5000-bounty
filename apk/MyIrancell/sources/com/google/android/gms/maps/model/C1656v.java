package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.maps.model.v */
/* loaded from: classes.dex */
public final class C1656v implements Parcelable.Creator<VisibleRegion> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ VisibleRegion createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            if (m7215a == 2) {
                latLng = (LatLng) C1052a.m7217a(parcel, m7216a, LatLng.CREATOR);
            } else if (m7215a == 3) {
                latLng2 = (LatLng) C1052a.m7217a(parcel, m7216a, LatLng.CREATOR);
            } else if (m7215a == 4) {
                latLng3 = (LatLng) C1052a.m7217a(parcel, m7216a, LatLng.CREATOR);
            } else if (m7215a == 5) {
                latLng4 = (LatLng) C1052a.m7217a(parcel, m7216a, LatLng.CREATOR);
            } else if (m7215a != 6) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                latLngBounds = (LatLngBounds) C1052a.m7217a(parcel, m7216a, LatLngBounds.CREATOR);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new VisibleRegion(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ VisibleRegion[] newArray(int i) {
        return new VisibleRegion[i];
    }
}
