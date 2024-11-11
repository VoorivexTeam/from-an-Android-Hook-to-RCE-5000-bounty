package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.signin.internal.h */
/* loaded from: classes.dex */
public final class C1967h implements Parcelable.Creator<zai> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zai createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        int i = 0;
        ResolveAccountRequest resolveAccountRequest = null;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            if (m7215a == 1) {
                i = C1052a.m7208A(parcel, m7216a);
            } else if (m7215a != 2) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                resolveAccountRequest = (ResolveAccountRequest) C1052a.m7217a(parcel, m7216a, ResolveAccountRequest.CREATOR);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new zai(i, resolveAccountRequest);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zai[] newArray(int i) {
        return new zai[i];
    }
}
