package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.location.z */
/* loaded from: classes.dex */
public final class C1631z implements Parcelable.Creator<zzj> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzj createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        long j = 50;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        float f = 0.0f;
        int i = Integer.MAX_VALUE;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            if (m7215a == 1) {
                z = C1052a.m7242s(parcel, m7216a);
            } else if (m7215a == 2) {
                j = C1052a.m7210C(parcel, m7216a);
            } else if (m7215a == 3) {
                f = C1052a.m7247x(parcel, m7216a);
            } else if (m7215a == 4) {
                j2 = C1052a.m7210C(parcel, m7216a);
            } else if (m7215a != 5) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                i = C1052a.m7208A(parcel, m7216a);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new zzj(z, j, f, j2, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzj[] newArray(int i) {
        return new zzj[i];
    }
}
