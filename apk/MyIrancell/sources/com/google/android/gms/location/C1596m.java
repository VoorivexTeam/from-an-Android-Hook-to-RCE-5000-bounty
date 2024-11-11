package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.location.m */
/* loaded from: classes.dex */
public final class C1596m implements Parcelable.Creator<LocationSettingsRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationSettingsRequest createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        boolean z = false;
        ArrayList arrayList = null;
        zzae zzaeVar = null;
        boolean z2 = false;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            if (m7215a == 1) {
                arrayList = C1052a.m7226c(parcel, m7216a, LocationRequest.CREATOR);
            } else if (m7215a == 2) {
                z = C1052a.m7242s(parcel, m7216a);
            } else if (m7215a == 3) {
                z2 = C1052a.m7242s(parcel, m7216a);
            } else if (m7215a != 5) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                zzaeVar = (zzae) C1052a.m7217a(parcel, m7216a, zzae.CREATOR);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new LocationSettingsRequest(arrayList, z, z2, zzaeVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationSettingsRequest[] newArray(int i) {
        return new LocationSettingsRequest[i];
    }
}
