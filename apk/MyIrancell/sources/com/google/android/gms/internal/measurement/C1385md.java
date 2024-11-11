package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.internal.measurement.md */
/* loaded from: classes.dex */
public final class C1385md implements Parcelable.Creator<zzv> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzv createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            switch (C1052a.m7215a(m7216a)) {
                case 1:
                    j = C1052a.m7210C(parcel, m7216a);
                    break;
                case 2:
                    j2 = C1052a.m7210C(parcel, m7216a);
                    break;
                case 3:
                    z = C1052a.m7242s(parcel, m7216a);
                    break;
                case 4:
                    str = C1052a.m7238o(parcel, m7216a);
                    break;
                case 5:
                    str2 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 6:
                    str3 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 7:
                    bundle = C1052a.m7229f(parcel, m7216a);
                    break;
                default:
                    C1052a.m7214G(parcel, m7216a);
                    break;
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new zzv(j, j2, z, str, str2, str3, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzv[] newArray(int i) {
        return new zzv[i];
    }
}
