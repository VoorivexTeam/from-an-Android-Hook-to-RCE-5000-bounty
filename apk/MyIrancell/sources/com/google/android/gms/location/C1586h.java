package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.location.h */
/* loaded from: classes.dex */
public final class C1586h implements Parcelable.Creator<LocationAvailability> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationAvailability createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        long j = 0;
        zzaj[] zzajVarArr = null;
        int i = 1000;
        int i2 = 1;
        int i3 = 1;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            if (m7215a == 1) {
                i2 = C1052a.m7208A(parcel, m7216a);
            } else if (m7215a == 2) {
                i3 = C1052a.m7208A(parcel, m7216a);
            } else if (m7215a == 3) {
                j = C1052a.m7210C(parcel, m7216a);
            } else if (m7215a == 4) {
                i = C1052a.m7208A(parcel, m7216a);
            } else if (m7215a != 5) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                zzajVarArr = (zzaj[]) C1052a.m7223b(parcel, m7216a, zzaj.CREATOR);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new LocationAvailability(i, i2, i3, j, zzajVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationAvailability[] newArray(int i) {
        return new LocationAvailability[i];
    }
}
