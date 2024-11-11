package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.auth.api.signin.f */
/* loaded from: classes.dex */
public final class C0831f implements Parcelable.Creator<SignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInAccount createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = "";
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            if (m7215a == 4) {
                str = C1052a.m7238o(parcel, m7216a);
            } else if (m7215a == 7) {
                googleSignInAccount = (GoogleSignInAccount) C1052a.m7217a(parcel, m7216a, GoogleSignInAccount.CREATOR);
            } else if (m7215a != 8) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                str2 = C1052a.m7238o(parcel, m7216a);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInAccount[] newArray(int i) {
        return new SignInAccount[i];
    }
}
