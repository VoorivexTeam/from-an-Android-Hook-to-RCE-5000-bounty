package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator<zal> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zal createFromParcel(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        String str = null;
        FastJsonResponse.Field field = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            int a2 = com.google.android.gms.common.internal.safeparcel.a.a(a);
            if (a2 == 1) {
                i = com.google.android.gms.common.internal.safeparcel.a.A(parcel, a);
            } else if (a2 == 2) {
                str = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
            } else if (a2 != 3) {
                com.google.android.gms.common.internal.safeparcel.a.G(parcel, a);
            } else {
                field = (FastJsonResponse.Field) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, FastJsonResponse.Field.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.r(parcel, b);
        return new zal(i, str, field);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zal[] newArray(int i) {
        return new zal[i];
    }
}
