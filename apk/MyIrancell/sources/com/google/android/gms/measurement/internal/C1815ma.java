package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.measurement.internal.ma */
/* loaded from: classes.dex */
public final class C1815ma implements Parcelable.Creator<zzv> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzv createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        zzkq zzkqVar = null;
        String str3 = null;
        zzan zzanVar = null;
        zzan zzanVar2 = null;
        zzan zzanVar3 = null;
        boolean z = false;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            switch (C1052a.m7215a(m7216a)) {
                case 2:
                    str = C1052a.m7238o(parcel, m7216a);
                    break;
                case 3:
                    str2 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 4:
                    zzkqVar = (zzkq) C1052a.m7217a(parcel, m7216a, zzkq.CREATOR);
                    break;
                case 5:
                    j = C1052a.m7210C(parcel, m7216a);
                    break;
                case 6:
                    z = C1052a.m7242s(parcel, m7216a);
                    break;
                case 7:
                    str3 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 8:
                    zzanVar = (zzan) C1052a.m7217a(parcel, m7216a, zzan.CREATOR);
                    break;
                case 9:
                    j2 = C1052a.m7210C(parcel, m7216a);
                    break;
                case 10:
                    zzanVar2 = (zzan) C1052a.m7217a(parcel, m7216a, zzan.CREATOR);
                    break;
                case 11:
                    j3 = C1052a.m7210C(parcel, m7216a);
                    break;
                case 12:
                    zzanVar3 = (zzan) C1052a.m7217a(parcel, m7216a, zzan.CREATOR);
                    break;
                default:
                    C1052a.m7214G(parcel, m7216a);
                    break;
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new zzv(str, str2, zzkqVar, j, z, str3, zzanVar, j2, zzanVar2, j3, zzanVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzv[] newArray(int i) {
        return new zzv[i];
    }
}
