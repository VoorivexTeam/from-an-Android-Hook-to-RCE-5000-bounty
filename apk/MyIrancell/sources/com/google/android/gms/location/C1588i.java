package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.location.i */
/* loaded from: classes.dex */
public final class C1588i implements Parcelable.Creator<LocationRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationRequest createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        long j = 3600000;
        long j2 = 600000;
        long j3 = Long.MAX_VALUE;
        long j4 = 0;
        int i = 102;
        boolean z = false;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            switch (C1052a.m7215a(m7216a)) {
                case 1:
                    i = C1052a.m7208A(parcel, m7216a);
                    break;
                case 2:
                    j = C1052a.m7210C(parcel, m7216a);
                    break;
                case 3:
                    j2 = C1052a.m7210C(parcel, m7216a);
                    break;
                case 4:
                    z = C1052a.m7242s(parcel, m7216a);
                    break;
                case 5:
                    j3 = C1052a.m7210C(parcel, m7216a);
                    break;
                case 6:
                    i2 = C1052a.m7208A(parcel, m7216a);
                    break;
                case 7:
                    f = C1052a.m7247x(parcel, m7216a);
                    break;
                case 8:
                    j4 = C1052a.m7210C(parcel, m7216a);
                    break;
                default:
                    C1052a.m7214G(parcel, m7216a);
                    break;
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new LocationRequest(i, j, j2, z, j3, i2, f, j4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationRequest[] newArray(int i) {
        return new LocationRequest[i];
    }
}
