package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.internal.location.f0 */
/* loaded from: classes.dex */
public final class C1169f0 implements Parcelable.Creator<zzo> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzo createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        zzm zzmVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        int i = 1;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            if (m7215a == 1) {
                i = C1052a.m7208A(parcel, m7216a);
            } else if (m7215a == 2) {
                zzmVar = (zzm) C1052a.m7217a(parcel, m7216a, zzm.CREATOR);
            } else if (m7215a == 3) {
                iBinder = C1052a.m7249z(parcel, m7216a);
            } else if (m7215a != 4) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                iBinder2 = C1052a.m7249z(parcel, m7216a);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new zzo(i, zzmVar, iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzo[] newArray(int i) {
        return new zzo[i];
    }
}
