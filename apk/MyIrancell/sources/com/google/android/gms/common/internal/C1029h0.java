package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.common.internal.h0 */
/* loaded from: classes.dex */
public final class C1029h0 implements Parcelable.Creator<ResolveAccountResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ResolveAccountResponse createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        IBinder iBinder = null;
        ConnectionResult connectionResult = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            if (m7215a == 1) {
                i = C1052a.m7208A(parcel, m7216a);
            } else if (m7215a == 2) {
                iBinder = C1052a.m7249z(parcel, m7216a);
            } else if (m7215a == 3) {
                connectionResult = (ConnectionResult) C1052a.m7217a(parcel, m7216a, ConnectionResult.CREATOR);
            } else if (m7215a == 4) {
                z = C1052a.m7242s(parcel, m7216a);
            } else if (m7215a != 5) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                z2 = C1052a.m7242s(parcel, m7216a);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new ResolveAccountResponse(i, iBinder, connectionResult, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ResolveAccountResponse[] newArray(int i) {
        return new ResolveAccountResponse[i];
    }
}
