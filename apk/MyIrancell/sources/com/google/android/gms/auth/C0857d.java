package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.d */
/* loaded from: classes.dex */
public final class C0857d implements Parcelable.Creator<TokenData> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TokenData createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        String str = null;
        Long l = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            switch (C1052a.m7215a(m7216a)) {
                case 1:
                    i = C1052a.m7208A(parcel, m7216a);
                    break;
                case 2:
                    str = C1052a.m7238o(parcel, m7216a);
                    break;
                case 3:
                    l = C1052a.m7211D(parcel, m7216a);
                    break;
                case 4:
                    z = C1052a.m7242s(parcel, m7216a);
                    break;
                case 5:
                    z2 = C1052a.m7242s(parcel, m7216a);
                    break;
                case 6:
                    arrayList = C1052a.m7240q(parcel, m7216a);
                    break;
                case 7:
                    str2 = C1052a.m7238o(parcel, m7216a);
                    break;
                default:
                    C1052a.m7214G(parcel, m7216a);
                    break;
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new TokenData(i, str, l, z, z2, arrayList, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TokenData[] newArray(int i) {
        return new TokenData[i];
    }
}
