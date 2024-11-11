package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.maps.model.i */
/* loaded from: classes.dex */
public final class C1643i implements Parcelable.Creator<MarkerOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MarkerOptions createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f3 = 0.0f;
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = 1.0f;
        float f7 = 0.0f;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            switch (C1052a.m7215a(m7216a)) {
                case 2:
                    latLng = (LatLng) C1052a.m7217a(parcel, m7216a, LatLng.CREATOR);
                    break;
                case 3:
                    str = C1052a.m7238o(parcel, m7216a);
                    break;
                case 4:
                    str2 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 5:
                    iBinder = C1052a.m7249z(parcel, m7216a);
                    break;
                case 6:
                    f = C1052a.m7247x(parcel, m7216a);
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
                    z3 = C1052a.m7242s(parcel, m7216a);
                    break;
                case 11:
                    f3 = C1052a.m7247x(parcel, m7216a);
                    break;
                case 12:
                    f4 = C1052a.m7247x(parcel, m7216a);
                    break;
                case 13:
                    f5 = C1052a.m7247x(parcel, m7216a);
                    break;
                case 14:
                    f6 = C1052a.m7247x(parcel, m7216a);
                    break;
                case 15:
                    f7 = C1052a.m7247x(parcel, m7216a);
                    break;
                default:
                    C1052a.m7214G(parcel, m7216a);
                    break;
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new MarkerOptions(latLng, str, str2, iBinder, f, f2, z, z2, z3, f3, f4, f5, f6, f7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MarkerOptions[] newArray(int i) {
        return new MarkerOptions[i];
    }
}
