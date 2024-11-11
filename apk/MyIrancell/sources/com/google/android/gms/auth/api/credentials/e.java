package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e implements Parcelable.Creator<HintRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ HintRequest createFromParcel(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        CredentialPickerConfig credentialPickerConfig = null;
        String[] strArr = null;
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
                        credentialPickerConfig = (CredentialPickerConfig) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, CredentialPickerConfig.CREATOR);
                        break;
                    case 2:
                        z = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
                        break;
                    case 3:
                        z2 = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
                        break;
                    case 4:
                        strArr = com.google.android.gms.common.internal.safeparcel.a.p(parcel, a);
                        break;
                    case 5:
                        z3 = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
                        break;
                    case 6:
                        str = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                        break;
                    case 7:
                        str2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
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
        return new HintRequest(i, credentialPickerConfig, z, z2, strArr, z3, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ HintRequest[] newArray(int i) {
        return new HintRequest[i];
    }
}
