package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f implements Parcelable.Creator<AutocompleteFilter> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AutocompleteFilter createFromParcel(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        ArrayList<Integer> arrayList = null;
        String str = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            int a2 = com.google.android.gms.common.internal.safeparcel.a.a(a);
            if (a2 == 1) {
                z = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
            } else if (a2 == 2) {
                arrayList = com.google.android.gms.common.internal.safeparcel.a.k(parcel, a);
            } else if (a2 == 3) {
                str = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
            } else if (a2 != 1000) {
                com.google.android.gms.common.internal.safeparcel.a.G(parcel, a);
            } else {
                i = com.google.android.gms.common.internal.safeparcel.a.A(parcel, a);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.r(parcel, b);
        return new AutocompleteFilter(i, z, arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AutocompleteFilter[] newArray(int i) {
        return new AutocompleteFilter[i];
    }
}
