package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class da implements Parcelable.Creator<zzm> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzm createFromParcel(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        long j6 = -2147483648L;
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
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
                    str3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                case 5:
                    str4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                case 6:
                    j = com.google.android.gms.common.internal.safeparcel.a.C(parcel, a);
                    break;
                case 7:
                    j2 = com.google.android.gms.common.internal.safeparcel.a.C(parcel, a);
                    break;
                case 8:
                    str5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                case 9:
                    z = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
                    break;
                case 10:
                    z2 = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
                    break;
                case 11:
                    j6 = com.google.android.gms.common.internal.safeparcel.a.C(parcel, a);
                    break;
                case 12:
                    str6 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                case 13:
                    j3 = com.google.android.gms.common.internal.safeparcel.a.C(parcel, a);
                    break;
                case 14:
                    j4 = com.google.android.gms.common.internal.safeparcel.a.C(parcel, a);
                    break;
                case 15:
                    i = com.google.android.gms.common.internal.safeparcel.a.A(parcel, a);
                    break;
                case 16:
                    z3 = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
                    break;
                case 17:
                    z4 = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
                    break;
                case 18:
                    z5 = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
                    break;
                case 19:
                    str7 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                case 20:
                default:
                    com.google.android.gms.common.internal.safeparcel.a.G(parcel, a);
                    break;
                case 21:
                    bool = com.google.android.gms.common.internal.safeparcel.a.t(parcel, a);
                    break;
                case 22:
                    j5 = com.google.android.gms.common.internal.safeparcel.a.C(parcel, a);
                    break;
                case 23:
                    arrayList = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 24:
                    str8 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.r(parcel, b);
        return new zzm(str, str2, str3, str4, j, j2, str5, z, z2, j6, str6, j3, j4, i, z3, z4, z5, str7, bool, j5, arrayList, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzm[] newArray(int i) {
        return new zzm[i];
    }
}
