package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.measurement.internal.p */
/* loaded from: classes.dex */
public final class C1839p implements Parcelable.Creator<zzan> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzan createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        String str = null;
        zzam zzamVar = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            if (m7215a == 2) {
                str = C1052a.m7238o(parcel, m7216a);
            } else if (m7215a == 3) {
                zzamVar = (zzam) C1052a.m7217a(parcel, m7216a, zzam.CREATOR);
            } else if (m7215a == 4) {
                str2 = C1052a.m7238o(parcel, m7216a);
            } else if (m7215a != 5) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                j = C1052a.m7210C(parcel, m7216a);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new zzan(str, zzamVar, str2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzan[] newArray(int i) {
        return new zzan[i];
    }
}
