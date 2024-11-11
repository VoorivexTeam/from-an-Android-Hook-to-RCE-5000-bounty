package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.common.internal.l0 */
/* loaded from: classes.dex */
public final class C1037l0 implements Parcelable.Creator<GetServiceRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetServiceRequest createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        Feature[] featureArr = null;
        Feature[] featureArr2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
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
                    i3 = C1052a.m7208A(parcel, m7216a);
                    break;
                case 4:
                    str = C1052a.m7238o(parcel, m7216a);
                    break;
                case 5:
                    iBinder = C1052a.m7249z(parcel, m7216a);
                    break;
                case 6:
                    scopeArr = (Scope[]) C1052a.m7223b(parcel, m7216a, Scope.CREATOR);
                    break;
                case 7:
                    bundle = C1052a.m7229f(parcel, m7216a);
                    break;
                case 8:
                    account = (Account) C1052a.m7217a(parcel, m7216a, Account.CREATOR);
                    break;
                case 9:
                default:
                    C1052a.m7214G(parcel, m7216a);
                    break;
                case 10:
                    featureArr = (Feature[]) C1052a.m7223b(parcel, m7216a, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) C1052a.m7223b(parcel, m7216a, Feature.CREATOR);
                    break;
                case 12:
                    z = C1052a.m7242s(parcel, m7216a);
                    break;
                case 13:
                    i4 = C1052a.m7208A(parcel, m7216a);
                    break;
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new GetServiceRequest(i, i2, i3, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z, i4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetServiceRequest[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
