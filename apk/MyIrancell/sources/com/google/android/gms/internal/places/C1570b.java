package com.google.android.gms.internal.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.places.b */
/* loaded from: classes.dex */
public final class C1570b implements Parcelable.Creator<zzi> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzi createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            if (m7215a == 1) {
                str = C1052a.m7238o(parcel, m7216a);
            } else if (m7215a == 2) {
                str2 = C1052a.m7238o(parcel, m7216a);
            } else if (m7215a != 6) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                arrayList = C1052a.m7226c(parcel, m7216a, zzg.CREATOR);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new zzi(str, str2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzi[] newArray(int i) {
        return new zzi[i];
    }
}
