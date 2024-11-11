package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.maps.model.c */
/* loaded from: classes.dex */
public final class C1637c implements Parcelable.Creator<Cap> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Cap createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        IBinder iBinder = null;
        Float f = null;
        int i = 0;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            if (m7215a == 2) {
                i = C1052a.m7208A(parcel, m7216a);
            } else if (m7215a == 3) {
                iBinder = C1052a.m7249z(parcel, m7216a);
            } else if (m7215a != 4) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                f = C1052a.m7248y(parcel, m7216a);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new Cap(i, iBinder, f);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Cap[] newArray(int i) {
        return new Cap[i];
    }
}
