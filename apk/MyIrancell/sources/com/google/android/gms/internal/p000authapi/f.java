package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.a;

/* loaded from: classes.dex */
public final class f implements Parcelable.Creator<zzs> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzs createFromParcel(Parcel parcel) {
        int b = a.b(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            if (a.a(a) != 1) {
                a.G(parcel, a);
            } else {
                credential = (Credential) a.a(parcel, a, Credential.CREATOR);
            }
        }
        a.r(parcel, b);
        return new zzs(credential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzs[] newArray(int i) {
        return new zzs[i];
    }
}
