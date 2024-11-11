package com.google.android.gms.internal.p003authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.internal.auth-api.i */
/* loaded from: classes.dex */
public final class C1147i implements Parcelable.Creator<zzy> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzy createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            if (C1052a.m7215a(m7216a) != 1) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                credential = (Credential) C1052a.m7217a(parcel, m7216a, Credential.CREATOR);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new zzy(credential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzy[] newArray(int i) {
        return new zzy[i];
    }
}
