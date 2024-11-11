package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.maps.model.l */
/* loaded from: classes.dex */
public final class C1646l implements Parcelable.Creator<PolygonOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PolygonOptions createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            switch (C1052a.m7215a(m7216a)) {
                case 2:
                    arrayList2 = C1052a.m7226c(parcel, m7216a, LatLng.CREATOR);
                    break;
                case 3:
                    C1052a.m7221a(parcel, m7216a, arrayList, C1646l.class.getClassLoader());
                    break;
                case 4:
                    f = C1052a.m7247x(parcel, m7216a);
                    break;
                case 5:
                    i = C1052a.m7208A(parcel, m7216a);
                    break;
                case 6:
                    i2 = C1052a.m7208A(parcel, m7216a);
                    break;
                case 7:
                    f2 = C1052a.m7247x(parcel, m7216a);
                    break;
                case 8:
                    z = C1052a.m7242s(parcel, m7216a);
                    break;
                case 9:
                    z2 = C1052a.m7242s(parcel, m7216a);
                    break;
                case 10:
                    z3 = C1052a.m7242s(parcel, m7216a);
                    break;
                case 11:
                    i3 = C1052a.m7208A(parcel, m7216a);
                    break;
                case 12:
                    arrayList3 = C1052a.m7226c(parcel, m7216a, PatternItem.CREATOR);
                    break;
                default:
                    C1052a.m7214G(parcel, m7216a);
                    break;
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new PolygonOptions(arrayList2, arrayList, f, i, i2, f2, z, z2, z3, i3, arrayList3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PolygonOptions[] newArray(int i) {
        return new PolygonOptions[i];
    }
}
