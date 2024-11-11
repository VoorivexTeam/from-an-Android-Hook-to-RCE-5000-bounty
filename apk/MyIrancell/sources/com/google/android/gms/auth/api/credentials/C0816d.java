package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.auth.api.credentials.d */
/* loaded from: classes.dex */
public final class C0816d implements Parcelable.Creator<CredentialRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CredentialRequest createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        String[] strArr = null;
        CredentialPickerConfig credentialPickerConfig = null;
        CredentialPickerConfig credentialPickerConfig2 = null;
        String str = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            if (m7215a != 1000) {
                switch (m7215a) {
                    case 1:
                        z = C1052a.m7242s(parcel, m7216a);
                        break;
                    case 2:
                        strArr = C1052a.m7239p(parcel, m7216a);
                        break;
                    case 3:
                        credentialPickerConfig = (CredentialPickerConfig) C1052a.m7217a(parcel, m7216a, CredentialPickerConfig.CREATOR);
                        break;
                    case 4:
                        credentialPickerConfig2 = (CredentialPickerConfig) C1052a.m7217a(parcel, m7216a, CredentialPickerConfig.CREATOR);
                        break;
                    case 5:
                        z2 = C1052a.m7242s(parcel, m7216a);
                        break;
                    case 6:
                        str = C1052a.m7238o(parcel, m7216a);
                        break;
                    case 7:
                        str2 = C1052a.m7238o(parcel, m7216a);
                        break;
                    case 8:
                        z3 = C1052a.m7242s(parcel, m7216a);
                        break;
                    default:
                        C1052a.m7214G(parcel, m7216a);
                        break;
                }
            } else {
                i = C1052a.m7208A(parcel, m7216a);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new CredentialRequest(i, z, strArr, credentialPickerConfig, credentialPickerConfig2, z2, str, str2, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CredentialRequest[] newArray(int i) {
        return new CredentialRequest[i];
    }
}
