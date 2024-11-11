package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;
import com.google.android.gms.common.server.converter.zab;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* renamed from: com.google.android.gms.common.server.response.a */
/* loaded from: classes.dex */
public final class C1083a implements Parcelable.Creator<FastJsonResponse.Field> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FastJsonResponse.Field createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        String str = null;
        String str2 = null;
        zab zabVar = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            switch (C1052a.m7215a(m7216a)) {
                case 1:
                    i = C1052a.m7208A(parcel, m7216a);
                    break;
                case 2:
                    i2 = C1052a.m7208A(parcel, m7216a);
                    break;
                case 3:
                    z = C1052a.m7242s(parcel, m7216a);
                    break;
                case 4:
                    i3 = C1052a.m7208A(parcel, m7216a);
                    break;
                case 5:
                    z2 = C1052a.m7242s(parcel, m7216a);
                    break;
                case 6:
                    str = C1052a.m7238o(parcel, m7216a);
                    break;
                case 7:
                    i4 = C1052a.m7208A(parcel, m7216a);
                    break;
                case 8:
                    str2 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 9:
                    zabVar = (zab) C1052a.m7217a(parcel, m7216a, zab.CREATOR);
                    break;
                default:
                    C1052a.m7214G(parcel, m7216a);
                    break;
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new FastJsonResponse.Field(i, i2, z, i3, z2, str, i4, str2, zabVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FastJsonResponse.Field[] newArray(int i) {
        return new FastJsonResponse.Field[i];
    }
}
