package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator<CredentialPickerConfig> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CredentialPickerConfig createFromParcel(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            int a2 = com.google.android.gms.common.internal.safeparcel.a.a(a);
            if (a2 == 1) {
                z = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
            } else if (a2 == 2) {
                z2 = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
            } else if (a2 == 3) {
                z3 = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
            } else if (a2 == 4) {
                i2 = com.google.android.gms.common.internal.safeparcel.a.A(parcel, a);
            } else if (a2 != 1000) {
                com.google.android.gms.common.internal.safeparcel.a.G(parcel, a);
            } else {
                i = com.google.android.gms.common.internal.safeparcel.a.A(parcel, a);
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.r(parcel, b);
        return new CredentialPickerConfig(i, z, z2, z3, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CredentialPickerConfig[] newArray(int i) {
        return new CredentialPickerConfig[i];
    }
}
