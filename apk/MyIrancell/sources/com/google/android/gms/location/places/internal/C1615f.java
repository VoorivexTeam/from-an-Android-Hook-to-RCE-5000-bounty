package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.location.places.internal.f */
/* loaded from: classes.dex */
public final class C1615f implements Parcelable.Creator<zzau> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzau createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            if (m7215a == 1) {
                str = C1052a.m7238o(parcel, m7216a);
            } else if (m7215a == 2) {
                str2 = C1052a.m7238o(parcel, m7216a);
            } else if (m7215a == 3) {
                str3 = C1052a.m7238o(parcel, m7216a);
            } else if (m7215a == 4) {
                str4 = C1052a.m7238o(parcel, m7216a);
            } else if (m7215a == 6) {
                i = C1052a.m7208A(parcel, m7216a);
            } else if (m7215a != 7) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                i2 = C1052a.m7208A(parcel, m7216a);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new zzau(str, str2, str3, str4, i, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzau[] newArray(int i) {
        return new zzau[i];
    }
}
