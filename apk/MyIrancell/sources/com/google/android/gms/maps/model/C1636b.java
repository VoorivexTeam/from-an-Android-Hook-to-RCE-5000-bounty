package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.maps.model.b */
/* loaded from: classes.dex */
public final class C1636b implements Parcelable.Creator<CameraPosition> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CameraPosition createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        float f = 0.0f;
        LatLng latLng = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            if (m7215a == 2) {
                latLng = (LatLng) C1052a.m7217a(parcel, m7216a, LatLng.CREATOR);
            } else if (m7215a == 3) {
                f = C1052a.m7247x(parcel, m7216a);
            } else if (m7215a == 4) {
                f2 = C1052a.m7247x(parcel, m7216a);
            } else if (m7215a != 5) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                f3 = C1052a.m7247x(parcel, m7216a);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new CameraPosition(latLng, f, f2, f3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CameraPosition[] newArray(int i) {
        return new CameraPosition[i];
    }
}
