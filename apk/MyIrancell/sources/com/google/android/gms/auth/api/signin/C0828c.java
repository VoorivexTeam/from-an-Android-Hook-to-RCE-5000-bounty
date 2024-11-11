package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C1052a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.signin.c */
/* loaded from: classes.dex */
public final class C0828c implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            switch (C1052a.m7215a(m7216a)) {
                case 1:
                    i = C1052a.m7208A(parcel, m7216a);
                    break;
                case 2:
                    str = C1052a.m7238o(parcel, m7216a);
                    break;
                case 3:
                    str2 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 4:
                    str3 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 5:
                    str4 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 6:
                    uri = (Uri) C1052a.m7217a(parcel, m7216a, Uri.CREATOR);
                    break;
                case 7:
                    str5 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 8:
                    j = C1052a.m7210C(parcel, m7216a);
                    break;
                case 9:
                    str6 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 10:
                    arrayList = C1052a.m7226c(parcel, m7216a, Scope.CREATOR);
                    break;
                case 11:
                    str7 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 12:
                    str8 = C1052a.m7238o(parcel, m7216a);
                    break;
                default:
                    C1052a.m7214G(parcel, m7216a);
                    break;
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
