package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d implements Parcelable.Creator<TokenData> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TokenData createFromParcel(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        String str = null;
        Long l = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.a.A(parcel, a);
                    break;
                case 2:
                    str = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                case 3:
                    l = com.google.android.gms.common.internal.safeparcel.a.D(parcel, a);
                    break;
                case 4:
                    z = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
                    break;
                case 5:
                    z2 = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
                    break;
                case 6:
                    arrayList = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 7:
                    str2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.G(parcel, a);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.r(parcel, b);
        return new TokenData(i, str, l, z, z2, arrayList, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TokenData[] newArray(int i) {
        return new TokenData[i];
    }
}
