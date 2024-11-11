package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class ma implements Parcelable.Creator<zzv> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzv createFromParcel(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
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
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 2:
                    str = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                case 3:
                    str2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                case 4:
                    zzkqVar = (zzkq) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, zzkq.CREATOR);
                    break;
                case 5:
                    j = com.google.android.gms.common.internal.safeparcel.a.C(parcel, a);
                    break;
                case 6:
                    z = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
                    break;
                case 7:
                    str3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                case 8:
                    zzanVar = (zzan) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, zzan.CREATOR);
                    break;
                case 9:
                    j2 = com.google.android.gms.common.internal.safeparcel.a.C(parcel, a);
                    break;
                case 10:
                    zzanVar2 = (zzan) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, zzan.CREATOR);
                    break;
                case 11:
                    j3 = com.google.android.gms.common.internal.safeparcel.a.C(parcel, a);
                    break;
                case 12:
                    zzanVar3 = (zzan) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, zzan.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.G(parcel, a);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.r(parcel, b);
        return new zzv(str, str2, zzkqVar, j, z, str3, zzanVar, j2, zzanVar2, j3, zzanVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzv[] newArray(int i) {
        return new zzv[i];
    }
}
