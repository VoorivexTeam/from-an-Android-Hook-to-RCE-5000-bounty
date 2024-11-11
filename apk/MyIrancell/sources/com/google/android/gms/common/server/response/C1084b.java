package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* renamed from: com.google.android.gms.common.server.response.b */
/* loaded from: classes.dex */
public final class C1084b implements Parcelable.Creator<zal> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zal createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        String str = null;
        FastJsonResponse.Field field = null;
        int i = 0;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            if (m7215a == 1) {
                i = C1052a.m7208A(parcel, m7216a);
            } else if (m7215a == 2) {
                str = C1052a.m7238o(parcel, m7216a);
            } else if (m7215a != 3) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                field = (FastJsonResponse.Field) C1052a.m7217a(parcel, m7216a, FastJsonResponse.Field.CREATOR);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new zal(i, str, field);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zal[] newArray(int i) {
        return new zal[i];
    }
}
