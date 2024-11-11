package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.common.w */
/* loaded from: classes.dex */
public final class C1117w implements Parcelable.Creator<zzj> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzj createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        boolean z = false;
        String str = null;
        IBinder iBinder = null;
        boolean z2 = false;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            if (m7215a == 1) {
                str = C1052a.m7238o(parcel, m7216a);
            } else if (m7215a == 2) {
                iBinder = C1052a.m7249z(parcel, m7216a);
            } else if (m7215a == 3) {
                z = C1052a.m7242s(parcel, m7216a);
            } else if (m7215a != 4) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                z2 = C1052a.m7242s(parcel, m7216a);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new zzj(str, iBinder, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzj[] newArray(int i) {
        return new zzj[i];
    }
}
