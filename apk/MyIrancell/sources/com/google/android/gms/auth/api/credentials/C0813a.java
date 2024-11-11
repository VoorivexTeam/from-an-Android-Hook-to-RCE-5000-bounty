package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.credentials.a */
/* loaded from: classes.dex */
public final class C0813a implements Parcelable.Creator<Credential> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Credential createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        ArrayList arrayList = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            switch (C1052a.m7215a(m7216a)) {
                case 1:
                    str = C1052a.m7238o(parcel, m7216a);
                    break;
                case 2:
                    str2 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 3:
                    uri = (Uri) C1052a.m7217a(parcel, m7216a, Uri.CREATOR);
                    break;
                case 4:
                    arrayList = C1052a.m7226c(parcel, m7216a, IdToken.CREATOR);
                    break;
                case 5:
                    str3 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 6:
                    str4 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 7:
                case 8:
                default:
                    C1052a.m7214G(parcel, m7216a);
                    break;
                case 9:
                    str5 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 10:
                    str6 = C1052a.m7238o(parcel, m7216a);
                    break;
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new Credential(str, str2, uri, arrayList, str3, str4, str5, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Credential[] newArray(int i) {
        return new Credential[i];
    }
}
