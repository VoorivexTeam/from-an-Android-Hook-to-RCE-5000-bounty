package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j implements Parcelable.Creator<zzv> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzv createFromParcel(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            int a2 = com.google.android.gms.common.internal.safeparcel.a.a(a);
            if (a2 == 1) {
                i = com.google.android.gms.common.internal.safeparcel.a.A(parcel, a);
            } else if (a2 != 2) {
                com.google.android.gms.common.internal.safeparcel.a.G(parcel, a);
            } else {
                str = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.r(parcel, b);
        return new zzv(i, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzv[] newArray(int i) {
        return new zzv[i];
    }
}
