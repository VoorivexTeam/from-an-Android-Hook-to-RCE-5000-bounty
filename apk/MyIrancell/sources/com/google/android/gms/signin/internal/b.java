package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator<zab> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zab createFromParcel(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            int a2 = com.google.android.gms.common.internal.safeparcel.a.a(a);
            if (a2 == 1) {
                i = com.google.android.gms.common.internal.safeparcel.a.A(parcel, a);
            } else if (a2 == 2) {
                i2 = com.google.android.gms.common.internal.safeparcel.a.A(parcel, a);
            } else if (a2 != 3) {
                com.google.android.gms.common.internal.safeparcel.a.G(parcel, a);
            } else {
                intent = (Intent) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, Intent.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.r(parcel, b);
        return new zab(i, i2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zab[] newArray(int i) {
        return new zab[i];
    }
}
