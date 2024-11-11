package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.maps.model.f */
/* loaded from: classes.dex */
public final class C1640f implements Parcelable.Creator<LatLngBounds> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LatLngBounds createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            if (m7215a == 2) {
                latLng = (LatLng) C1052a.m7217a(parcel, m7216a, LatLng.CREATOR);
            } else if (m7215a != 3) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                latLng2 = (LatLng) C1052a.m7217a(parcel, m7216a, LatLng.CREATOR);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new LatLngBounds(latLng, latLng2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LatLngBounds[] newArray(int i) {
        return new LatLngBounds[i];
    }
}
