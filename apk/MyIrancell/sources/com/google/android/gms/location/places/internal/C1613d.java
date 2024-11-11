package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.location.places.internal.d */
/* loaded from: classes.dex */
public final class C1613d implements Parcelable.Creator<zzal> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzal createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            if (m7215a == 1) {
                arrayList = C1052a.m7226c(parcel, m7216a, zzao.CREATOR);
            } else if (m7215a != 2) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                arrayList2 = C1052a.m7226c(parcel, m7216a, zzan.CREATOR);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new zzal(arrayList, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzal[] newArray(int i) {
        return new zzal[i];
    }
}
