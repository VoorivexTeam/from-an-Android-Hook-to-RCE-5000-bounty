package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.location.places.f */
/* loaded from: classes.dex */
public final class C1606f implements Parcelable.Creator<AutocompleteFilter> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AutocompleteFilter createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        ArrayList<Integer> arrayList = null;
        String str = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            if (m7215a == 1) {
                z = C1052a.m7242s(parcel, m7216a);
            } else if (m7215a == 2) {
                arrayList = C1052a.m7234k(parcel, m7216a);
            } else if (m7215a == 3) {
                str = C1052a.m7238o(parcel, m7216a);
            } else if (m7215a != 1000) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                i = C1052a.m7208A(parcel, m7216a);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new AutocompleteFilter(i, z, arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AutocompleteFilter[] newArray(int i) {
        return new AutocompleteFilter[i];
    }
}
