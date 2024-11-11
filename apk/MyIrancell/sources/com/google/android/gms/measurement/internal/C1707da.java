package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.measurement.internal.da */
/* loaded from: classes.dex */
public final class C1707da implements Parcelable.Creator<zzm> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzm createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
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
                    str3 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 5:
                    str4 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 6:
                    j = C1052a.m7210C(parcel, m7216a);
                    break;
                case 7:
                    j2 = C1052a.m7210C(parcel, m7216a);
                    break;
                case 8:
                    str5 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 9:
                    z = C1052a.m7242s(parcel, m7216a);
                    break;
                case 10:
                    z2 = C1052a.m7242s(parcel, m7216a);
                    break;
                case 11:
                    j6 = C1052a.m7210C(parcel, m7216a);
                    break;
                case 12:
                    str6 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 13:
                    j3 = C1052a.m7210C(parcel, m7216a);
                    break;
                case 14:
                    j4 = C1052a.m7210C(parcel, m7216a);
                    break;
                case 15:
                    i = C1052a.m7208A(parcel, m7216a);
                    break;
                case 16:
                    z3 = C1052a.m7242s(parcel, m7216a);
                    break;
                case 17:
                    z4 = C1052a.m7242s(parcel, m7216a);
                    break;
                case 18:
                    z5 = C1052a.m7242s(parcel, m7216a);
                    break;
                case 19:
                    str7 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 20:
                default:
                    C1052a.m7214G(parcel, m7216a);
                    break;
                case 21:
                    bool = C1052a.m7243t(parcel, m7216a);
                    break;
                case 22:
                    j5 = C1052a.m7210C(parcel, m7216a);
                    break;
                case 23:
                    arrayList = C1052a.m7240q(parcel, m7216a);
                    break;
                case 24:
                    str8 = C1052a.m7238o(parcel, m7216a);
                    break;
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new zzm(str, str2, str3, str4, j, j2, str5, z, z2, j6, str6, j3, j4, i, z3, z4, z5, str7, bool, j5, arrayList, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzm[] newArray(int i) {
        return new zzm[i];
    }
}
