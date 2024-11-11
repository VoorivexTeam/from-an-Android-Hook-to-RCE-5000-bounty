package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator<UserAddress> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ UserAddress createFromParcel(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 2:
                    str = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                case 3:
                    str2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                case 4:
                    str3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                case 5:
                    str4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                case 6:
                    str5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                case 7:
                    str6 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                case 8:
                    str7 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                case 9:
                    str8 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                case 10:
                    str9 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                case 11:
                    str10 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                case 12:
                    str11 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                case 13:
                    str12 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                case 14:
                    z = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
                    break;
                case 15:
                    str13 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                case 16:
                    str14 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.G(parcel, a);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.r(parcel, b);
        return new UserAddress(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, str13, str14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ UserAddress[] newArray(int i) {
        return new UserAddress[i];
    }
}
