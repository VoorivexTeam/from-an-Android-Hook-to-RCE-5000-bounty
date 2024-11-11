package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j implements Parcelable.Creator<zzp> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzp createFromParcel(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            int a2 = com.google.android.gms.common.internal.safeparcel.a.a(a);
            if (a2 == 1) {
                str = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
            } else if (a2 != 2) {
                com.google.android.gms.common.internal.safeparcel.a.G(parcel, a);
            } else {
                i = com.google.android.gms.common.internal.safeparcel.a.A(parcel, a);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.r(parcel, b);
        return new zzp(str, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzp[] newArray(int i) {
        return new zzp[i];
    }
}
