package com.google.android.gms.internal.p003authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new C1144f();

    /* renamed from: b */
    private final Credential f6412b;

    public zzs(Credential credential) {
        this.f6412b = credential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7260a(parcel, 1, (Parcelable) this.f6412b, i, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
