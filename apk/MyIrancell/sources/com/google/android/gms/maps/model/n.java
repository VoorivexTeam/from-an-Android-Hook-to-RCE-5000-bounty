package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class n implements Parcelable.Creator<StreetViewPanoramaCamera> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ StreetViewPanoramaCamera createFromParcel(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            int a2 = com.google.android.gms.common.internal.safeparcel.a.a(a);
            if (a2 == 2) {
                f = com.google.android.gms.common.internal.safeparcel.a.x(parcel, a);
            } else if (a2 == 3) {
                f2 = com.google.android.gms.common.internal.safeparcel.a.x(parcel, a);
            } else if (a2 != 4) {
                com.google.android.gms.common.internal.safeparcel.a.G(parcel, a);
            } else {
                f3 = com.google.android.gms.common.internal.safeparcel.a.x(parcel, a);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.r(parcel, b);
        return new StreetViewPanoramaCamera(f, f2, f3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ StreetViewPanoramaCamera[] newArray(int i) {
        return new StreetViewPanoramaCamera[i];
    }
}
