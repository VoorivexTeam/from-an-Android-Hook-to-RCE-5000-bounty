package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.server.response.d */
/* loaded from: classes.dex */
public final class C1086d implements Parcelable.Creator<zaj> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zaj createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        ArrayList arrayList = null;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            if (m7215a == 1) {
                i = C1052a.m7208A(parcel, m7216a);
            } else if (m7215a == 2) {
                arrayList = C1052a.m7226c(parcel, m7216a, zam.CREATOR);
            } else if (m7215a != 3) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                str = C1052a.m7238o(parcel, m7216a);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new zaj(i, arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zaj[] newArray(int i) {
        return new zaj[i];
    }
}
