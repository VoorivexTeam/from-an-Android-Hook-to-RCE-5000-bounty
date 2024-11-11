package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.location.places.internal.i */
/* loaded from: classes.dex */
public final class C1618i implements Parcelable.Creator<zzc> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzc createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        String str = null;
        ArrayList<Integer> arrayList = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        ArrayList arrayList3 = null;
        String str4 = null;
        ArrayList arrayList4 = null;
        int i = 0;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            switch (C1052a.m7215a(m7216a)) {
                case 1:
                    str2 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 2:
                    str = C1052a.m7238o(parcel, m7216a);
                    break;
                case 3:
                    arrayList = C1052a.m7234k(parcel, m7216a);
                    break;
                case 4:
                    arrayList2 = C1052a.m7226c(parcel, m7216a, zzb.CREATOR);
                    break;
                case 5:
                    i = C1052a.m7208A(parcel, m7216a);
                    break;
                case 6:
                    str3 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 7:
                    arrayList3 = C1052a.m7226c(parcel, m7216a, zzb.CREATOR);
                    break;
                case 8:
                    str4 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 9:
                    arrayList4 = C1052a.m7226c(parcel, m7216a, zzb.CREATOR);
                    break;
                default:
                    C1052a.m7214G(parcel, m7216a);
                    break;
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new zzc(str, arrayList, i, str2, arrayList2, str3, arrayList3, str4, arrayList4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzc[] newArray(int i) {
        return new zzc[i];
    }
}
