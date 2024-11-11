package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.location.o */
/* loaded from: classes.dex */
public final class C1599o implements Parcelable.Creator<LocationSettingsStates> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationSettingsStates createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            switch (C1052a.m7215a(m7216a)) {
                case 1:
                    z = C1052a.m7242s(parcel, m7216a);
                    break;
                case 2:
                    z2 = C1052a.m7242s(parcel, m7216a);
                    break;
                case 3:
                    z3 = C1052a.m7242s(parcel, m7216a);
                    break;
                case 4:
                    z4 = C1052a.m7242s(parcel, m7216a);
                    break;
                case 5:
                    z5 = C1052a.m7242s(parcel, m7216a);
                    break;
                case 6:
                    z6 = C1052a.m7242s(parcel, m7216a);
                    break;
                default:
                    C1052a.m7214G(parcel, m7216a);
                    break;
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new LocationSettingsStates(z, z2, z3, z4, z5, z6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationSettingsStates[] newArray(int i) {
        return new LocationSettingsStates[i];
    }
}
