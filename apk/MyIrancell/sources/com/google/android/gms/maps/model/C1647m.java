package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.maps.model.m */
/* loaded from: classes.dex */
public final class C1647m implements Parcelable.Creator<PolylineOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PolylineOptions createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        ArrayList arrayList = null;
        Cap cap = null;
        Cap cap2 = null;
        ArrayList arrayList2 = null;
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            switch (C1052a.m7215a(m7216a)) {
                case 2:
                    arrayList = C1052a.m7226c(parcel, m7216a, LatLng.CREATOR);
                    break;
                case 3:
                    f = C1052a.m7247x(parcel, m7216a);
                    break;
                case 4:
                    i = C1052a.m7208A(parcel, m7216a);
                    break;
                case 5:
                    f2 = C1052a.m7247x(parcel, m7216a);
                    break;
                case 6:
                    z = C1052a.m7242s(parcel, m7216a);
                    break;
                case 7:
                    z2 = C1052a.m7242s(parcel, m7216a);
                    break;
                case 8:
                    z3 = C1052a.m7242s(parcel, m7216a);
                    break;
                case 9:
                    cap = (Cap) C1052a.m7217a(parcel, m7216a, Cap.CREATOR);
                    break;
                case 10:
                    cap2 = (Cap) C1052a.m7217a(parcel, m7216a, Cap.CREATOR);
                    break;
                case 11:
                    i2 = C1052a.m7208A(parcel, m7216a);
                    break;
                case 12:
                    arrayList2 = C1052a.m7226c(parcel, m7216a, PatternItem.CREATOR);
                    break;
                default:
                    C1052a.m7214G(parcel, m7216a);
                    break;
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new PolylineOptions(arrayList, f, i, f2, z, z2, z3, cap, cap2, i2, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PolylineOptions[] newArray(int i) {
        return new PolylineOptions[i];
    }
}
