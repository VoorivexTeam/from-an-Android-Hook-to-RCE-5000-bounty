package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.location.places.internal.j */
/* loaded from: classes.dex */
public final class C1619j implements Parcelable.Creator<zzan> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzan createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        ArrayList arrayList = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            switch (C1052a.m7215a(m7216a)) {
                case 1:
                    i = C1052a.m7208A(parcel, m7216a);
                    break;
                case 2:
                    i2 = C1052a.m7208A(parcel, m7216a);
                    break;
                case 3:
                    i3 = C1052a.m7208A(parcel, m7216a);
                    break;
                case 4:
                    i4 = C1052a.m7208A(parcel, m7216a);
                    break;
                case 5:
                    i5 = C1052a.m7208A(parcel, m7216a);
                    break;
                case 6:
                    i6 = C1052a.m7208A(parcel, m7216a);
                    break;
                case 7:
                    arrayList = C1052a.m7226c(parcel, m7216a, zzao.CREATOR);
                    break;
                default:
                    C1052a.m7214G(parcel, m7216a);
                    break;
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new zzan(i, i2, i3, i4, i5, i6, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzan[] newArray(int i) {
        return new zzan[i];
    }
}
