package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.signin.internal.i */
/* loaded from: classes.dex */
public final class C1968i implements Parcelable.Creator<zak> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zak createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        ConnectionResult connectionResult = null;
        ResolveAccountResponse resolveAccountResponse = null;
        int i = 0;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            if (m7215a == 1) {
                i = C1052a.m7208A(parcel, m7216a);
            } else if (m7215a == 2) {
                connectionResult = (ConnectionResult) C1052a.m7217a(parcel, m7216a, ConnectionResult.CREATOR);
            } else if (m7215a != 3) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                resolveAccountResponse = (ResolveAccountResponse) C1052a.m7217a(parcel, m7216a, ResolveAccountResponse.CREATOR);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new zak(i, connectionResult, resolveAccountResponse);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zak[] newArray(int i) {
        return new zak[i];
    }
}
