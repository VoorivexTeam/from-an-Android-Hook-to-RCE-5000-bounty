package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;
import java.util.List;

/* renamed from: com.google.android.gms.location.j */
/* loaded from: classes.dex */
public final class C1590j implements Parcelable.Creator<LocationResult> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationResult createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        List<Location> list = LocationResult.f7077c;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            if (C1052a.m7215a(m7216a) != 1) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                list = C1052a.m7226c(parcel, m7216a, Location.CREATOR);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new LocationResult(list);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationResult[] newArray(int i) {
        return new LocationResult[i];
    }
}
