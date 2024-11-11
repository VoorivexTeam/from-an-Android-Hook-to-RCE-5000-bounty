package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.identity.intents.model.a */
/* loaded from: classes.dex */
public final class C1137a implements Parcelable.Creator<CountrySpecification> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CountrySpecification createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        String str = null;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            if (C1052a.m7215a(m7216a) != 2) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                str = C1052a.m7238o(parcel, m7216a);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new CountrySpecification(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CountrySpecification[] newArray(int i) {
        return new CountrySpecification[i];
    }
}
