package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.common.internal.g0 */
/* loaded from: classes.dex */
public final class C1027g0 implements Parcelable.Creator<ResolveAccountRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ResolveAccountRequest createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            if (m7215a == 1) {
                i = C1052a.m7208A(parcel, m7216a);
            } else if (m7215a == 2) {
                account = (Account) C1052a.m7217a(parcel, m7216a, Account.CREATOR);
            } else if (m7215a == 3) {
                i2 = C1052a.m7208A(parcel, m7216a);
            } else if (m7215a != 4) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                googleSignInAccount = (GoogleSignInAccount) C1052a.m7217a(parcel, m7216a, GoogleSignInAccount.CREATOR);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new ResolveAccountRequest(i, account, i2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ResolveAccountRequest[] newArray(int i) {
        return new ResolveAccountRequest[i];
    }
}