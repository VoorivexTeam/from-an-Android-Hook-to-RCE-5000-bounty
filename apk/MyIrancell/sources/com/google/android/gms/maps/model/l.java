package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l implements Parcelable.Creator<PolygonOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PolygonOptions createFromParcel(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
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
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 2:
                    arrayList2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, LatLng.CREATOR);
                    break;
                case 3:
                    com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, arrayList, l.class.getClassLoader());
                    break;
                case 4:
                    f = com.google.android.gms.common.internal.safeparcel.a.x(parcel, a);
                    break;
                case 5:
                    i = com.google.android.gms.common.internal.safeparcel.a.A(parcel, a);
                    break;
                case 6:
                    i2 = com.google.android.gms.common.internal.safeparcel.a.A(parcel, a);
                    break;
                case 7:
                    f2 = com.google.android.gms.common.internal.safeparcel.a.x(parcel, a);
                    break;
                case 8:
                    z = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
                    break;
                case 9:
                    z2 = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
                    break;
                case 10:
                    z3 = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
                    break;
                case 11:
                    i3 = com.google.android.gms.common.internal.safeparcel.a.A(parcel, a);
                    break;
                case 12:
                    arrayList3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, PatternItem.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.G(parcel, a);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.r(parcel, b);
        return new PolygonOptions(arrayList2, arrayList, f, i, i2, f2, z, z2, z3, i3, arrayList3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PolygonOptions[] newArray(int i) {
        return new PolygonOptions[i];
    }
}
