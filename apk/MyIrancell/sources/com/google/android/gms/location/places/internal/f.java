package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f implements Parcelable.Creator<zzau> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzau createFromParcel(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            int a2 = com.google.android.gms.common.internal.safeparcel.a.a(a);
            if (a2 == 1) {
                str = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
            } else if (a2 == 2) {
                str2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
            } else if (a2 == 3) {
                str3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
            } else if (a2 == 4) {
                str4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
            } else if (a2 == 6) {
                i = com.google.android.gms.common.internal.safeparcel.a.A(parcel, a);
            } else if (a2 != 7) {
                com.google.android.gms.common.internal.safeparcel.a.G(parcel, a);
            } else {
                i2 = com.google.android.gms.common.internal.safeparcel.a.A(parcel, a);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.r(parcel, b);
        return new zzau(str, str2, str3, str4, i, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzau[] newArray(int i) {
        return new zzau[i];
    }
}
