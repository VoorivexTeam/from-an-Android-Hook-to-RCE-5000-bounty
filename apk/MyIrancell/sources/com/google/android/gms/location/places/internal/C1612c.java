package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.location.places.internal.c */
/* loaded from: classes.dex */
public final class C1612c implements Parcelable.Creator<zzak> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzak createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        PlaceEntity placeEntity = null;
        float f = 0.0f;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            if (m7215a == 1) {
                placeEntity = (PlaceEntity) C1052a.m7217a(parcel, m7216a, PlaceEntity.CREATOR);
            } else if (m7215a != 2) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                f = C1052a.m7247x(parcel, m7216a);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new zzak(placeEntity, f);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzak[] newArray(int i) {
        return new zzak[i];
    }
}
