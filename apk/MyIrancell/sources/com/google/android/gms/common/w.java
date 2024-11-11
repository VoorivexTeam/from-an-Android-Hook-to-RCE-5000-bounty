package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class w implements Parcelable.Creator<zzj> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzj createFromParcel(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        boolean z = false;
        String str = null;
        IBinder iBinder = null;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            int a2 = com.google.android.gms.common.internal.safeparcel.a.a(a);
            if (a2 == 1) {
                str = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
            } else if (a2 == 2) {
                iBinder = com.google.android.gms.common.internal.safeparcel.a.z(parcel, a);
            } else if (a2 == 3) {
                z = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
            } else if (a2 != 4) {
                com.google.android.gms.common.internal.safeparcel.a.G(parcel, a);
            } else {
                z2 = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.r(parcel, b);
        return new zzj(str, iBinder, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzj[] newArray(int i) {
        return new zzj[i];
    }
}
