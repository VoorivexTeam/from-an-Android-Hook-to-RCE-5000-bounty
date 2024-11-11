package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.common.internal.x */
/* loaded from: classes.dex */
public final class C1063x implements Parcelable.Creator<AuthAccountRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AuthAccountRequest createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Integer num = null;
        Integer num2 = null;
        Account account = null;
        int i = 0;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            switch (C1052a.m7215a(m7216a)) {
                case 1:
                    i = C1052a.m7208A(parcel, m7216a);
                    break;
                case 2:
                    iBinder = C1052a.m7249z(parcel, m7216a);
                    break;
                case 3:
                    scopeArr = (Scope[]) C1052a.m7223b(parcel, m7216a, Scope.CREATOR);
                    break;
                case 4:
                    num = C1052a.m7209B(parcel, m7216a);
                    break;
                case 5:
                    num2 = C1052a.m7209B(parcel, m7216a);
                    break;
                case 6:
                    account = (Account) C1052a.m7217a(parcel, m7216a, Account.CREATOR);
                    break;
                default:
                    C1052a.m7214G(parcel, m7216a);
                    break;
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new AuthAccountRequest(i, iBinder, scopeArr, num, num2, account);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AuthAccountRequest[] newArray(int i) {
        return new AuthAccountRequest[i];
    }
}
