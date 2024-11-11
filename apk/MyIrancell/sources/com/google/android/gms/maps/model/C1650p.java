package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.maps.model.p */
/* loaded from: classes.dex */
public final class C1650p implements Parcelable.Creator<StreetViewPanoramaLocation> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ StreetViewPanoramaLocation createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        StreetViewPanoramaLink[] streetViewPanoramaLinkArr = null;
        LatLng latLng = null;
        String str = null;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            if (m7215a == 2) {
                streetViewPanoramaLinkArr = (StreetViewPanoramaLink[]) C1052a.m7223b(parcel, m7216a, StreetViewPanoramaLink.CREATOR);
            } else if (m7215a == 3) {
                latLng = (LatLng) C1052a.m7217a(parcel, m7216a, LatLng.CREATOR);
            } else if (m7215a != 4) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                str = C1052a.m7238o(parcel, m7216a);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new StreetViewPanoramaLocation(streetViewPanoramaLinkArr, latLng, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ StreetViewPanoramaLocation[] newArray(int i) {
        return new StreetViewPanoramaLocation[i];
    }
}
