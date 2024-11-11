package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.maps.model.d */
/* loaded from: classes.dex */
public final class C1638d implements Parcelable.Creator<CircleOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CircleOptions createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        LatLng latLng = null;
        ArrayList arrayList = null;
        double d = 0.0d;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            switch (C1052a.m7215a(m7216a)) {
                case 2:
                    latLng = (LatLng) C1052a.m7217a(parcel, m7216a, LatLng.CREATOR);
                    break;
                case 3:
                    d = C1052a.m7245v(parcel, m7216a);
                    break;
                case 4:
                    f = C1052a.m7247x(parcel, m7216a);
                    break;
                case 5:
                    i = C1052a.m7208A(parcel, m7216a);
                    break;
                case 6:
                    i2 = C1052a.m7208A(parcel, m7216a);
                    break;
                case 7:
                    f2 = C1052a.m7247x(parcel, m7216a);
                    break;
                case 8:
                    z = C1052a.m7242s(parcel, m7216a);
                    break;
                case 9:
                    z2 = C1052a.m7242s(parcel, m7216a);
                    break;
                case 10:
                    arrayList = C1052a.m7226c(parcel, m7216a, PatternItem.CREATOR);
                    break;
                default:
                    C1052a.m7214G(parcel, m7216a);
                    break;
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new CircleOptions(latLng, d, f, i, i2, f2, z, z2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CircleOptions[] newArray(int i) {
        return new CircleOptions[i];
    }
}
