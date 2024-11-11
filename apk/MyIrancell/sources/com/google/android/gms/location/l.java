package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class l implements Parcelable.Creator<zzae> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzae createFromParcel(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        String str = "";
        String str2 = "";
        String str3 = str2;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            int a2 = com.google.android.gms.common.internal.safeparcel.a.a(a);
            if (a2 == 1) {
                str2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
            } else if (a2 == 2) {
                str3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
            } else if (a2 != 5) {
                com.google.android.gms.common.internal.safeparcel.a.G(parcel, a);
            } else {
                str = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.r(parcel, b);
        return new zzae(str, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzae[] newArray(int i) {
        return new zzae[i];
    }
}
