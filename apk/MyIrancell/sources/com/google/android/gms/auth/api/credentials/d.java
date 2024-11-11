package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d implements Parcelable.Creator<CredentialRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CredentialRequest createFromParcel(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        String[] strArr = null;
        CredentialPickerConfig credentialPickerConfig = null;
        CredentialPickerConfig credentialPickerConfig2 = null;
        String str = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            int a2 = com.google.android.gms.common.internal.safeparcel.a.a(a);
            if (a2 != 1000) {
                switch (a2) {
                    case 1:
                        z = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
                        break;
                    case 2:
                        strArr = com.google.android.gms.common.internal.safeparcel.a.p(parcel, a);
                        break;
                    case 3:
                        credentialPickerConfig = (CredentialPickerConfig) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, CredentialPickerConfig.CREATOR);
                        break;
                    case 4:
                        credentialPickerConfig2 = (CredentialPickerConfig) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, CredentialPickerConfig.CREATOR);
                        break;
                    case 5:
                        z2 = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
                        break;
                    case 6:
                        str = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                        break;
                    case 7:
                        str2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                        break;
                    case 8:
                        z3 = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
                        break;
                    default:
                        com.google.android.gms.common.internal.safeparcel.a.G(parcel, a);
                        break;
                }
            } else {
                i = com.google.android.gms.common.internal.safeparcel.a.A(parcel, a);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.r(parcel, b);
        return new CredentialRequest(i, z, strArr, credentialPickerConfig, credentialPickerConfig2, z2, str, str2, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CredentialRequest[] newArray(int i) {
        return new CredentialRequest[i];
    }
}
