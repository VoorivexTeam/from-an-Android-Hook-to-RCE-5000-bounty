package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C1052a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.signin.e */
/* loaded from: classes.dex */
public final class C0830e implements Parcelable.Creator<GoogleSignInOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            switch (C1052a.m7215a(m7216a)) {
                case 1:
                    i = C1052a.m7208A(parcel, m7216a);
                    break;
                case 2:
                    arrayList = C1052a.m7226c(parcel, m7216a, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) C1052a.m7217a(parcel, m7216a, Account.CREATOR);
                    break;
                case 4:
                    z = C1052a.m7242s(parcel, m7216a);
                    break;
                case 5:
                    z2 = C1052a.m7242s(parcel, m7216a);
                    break;
                case 6:
                    z3 = C1052a.m7242s(parcel, m7216a);
                    break;
                case 7:
                    str = C1052a.m7238o(parcel, m7216a);
                    break;
                case 8:
                    str2 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 9:
                    arrayList2 = C1052a.m7226c(parcel, m7216a, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case 10:
                    str3 = C1052a.m7238o(parcel, m7216a);
                    break;
                default:
                    C1052a.m7214G(parcel, m7216a);
                    break;
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new GoogleSignInOptions(i, (ArrayList<Scope>) arrayList, account, z, z2, z3, str, str2, (ArrayList<GoogleSignInOptionsExtensionParcelable>) arrayList2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
