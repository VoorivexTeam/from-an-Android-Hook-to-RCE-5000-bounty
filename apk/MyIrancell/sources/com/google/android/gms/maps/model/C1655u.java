package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.maps.model.u */
/* loaded from: classes.dex */
public final class C1655u implements Parcelable.Creator<TileOverlayOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TileOverlayOptions createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        IBinder iBinder = null;
        boolean z = false;
        float f = 0.0f;
        boolean z2 = true;
        float f2 = 0.0f;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            if (m7215a == 2) {
                iBinder = C1052a.m7249z(parcel, m7216a);
            } else if (m7215a == 3) {
                z = C1052a.m7242s(parcel, m7216a);
            } else if (m7215a == 4) {
                f = C1052a.m7247x(parcel, m7216a);
            } else if (m7215a == 5) {
                z2 = C1052a.m7242s(parcel, m7216a);
            } else if (m7215a != 6) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                f2 = C1052a.m7247x(parcel, m7216a);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new TileOverlayOptions(iBinder, z, f, z2, f2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TileOverlayOptions[] newArray(int i) {
        return new TileOverlayOptions[i];
    }
}
