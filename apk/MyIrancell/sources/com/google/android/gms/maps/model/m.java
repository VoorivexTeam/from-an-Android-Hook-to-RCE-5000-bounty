package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m implements Parcelable.Creator<PolylineOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PolylineOptions createFromParcel(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
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
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 2:
                    arrayList = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, LatLng.CREATOR);
                    break;
                case 3:
                    f = com.google.android.gms.common.internal.safeparcel.a.x(parcel, a);
                    break;
                case 4:
                    i = com.google.android.gms.common.internal.safeparcel.a.A(parcel, a);
                    break;
                case 5:
                    f2 = com.google.android.gms.common.internal.safeparcel.a.x(parcel, a);
                    break;
                case 6:
                    z = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
                    break;
                case 7:
                    z2 = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
                    break;
                case 8:
                    z3 = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
                    break;
                case 9:
                    cap = (Cap) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, Cap.CREATOR);
                    break;
                case 10:
                    cap2 = (Cap) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, Cap.CREATOR);
                    break;
                case 11:
                    i2 = com.google.android.gms.common.internal.safeparcel.a.A(parcel, a);
                    break;
                case 12:
                    arrayList2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, PatternItem.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.G(parcel, a);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.r(parcel, b);
        return new PolylineOptions(arrayList, f, i, f2, z, z2, z3, cap, cap2, i2, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PolylineOptions[] newArray(int i) {
        return new PolylineOptions[i];
    }
}
