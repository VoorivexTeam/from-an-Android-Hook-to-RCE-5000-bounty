package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.identity.intents.model.b */
/* loaded from: classes.dex */
public final class C1138b implements Parcelable.Creator<UserAddress> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ UserAddress createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
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
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            switch (C1052a.m7215a(m7216a)) {
                case 2:
                    str = C1052a.m7238o(parcel, m7216a);
                    break;
                case 3:
                    str2 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 4:
                    str3 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 5:
                    str4 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 6:
                    str5 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 7:
                    str6 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 8:
                    str7 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 9:
                    str8 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 10:
                    str9 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 11:
                    str10 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 12:
                    str11 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 13:
                    str12 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 14:
                    z = C1052a.m7242s(parcel, m7216a);
                    break;
                case 15:
                    str13 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 16:
                    str14 = C1052a.m7238o(parcel, m7216a);
                    break;
                default:
                    C1052a.m7214G(parcel, m7216a);
                    break;
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new UserAddress(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, str13, str14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ UserAddress[] newArray(int i) {
        return new UserAddress[i];
    }
}
