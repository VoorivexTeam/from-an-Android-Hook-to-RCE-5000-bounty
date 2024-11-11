package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.InterfaceC0982m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class zzad extends AbstractSafeParcelable implements InterfaceC0982m {
    public static final Parcelable.Creator<zzad> CREATOR;

    /* renamed from: b */
    private final Status f6448b;

    static {
        new zzad(Status.f5668f);
        CREATOR = new C1160b();
    }

    public zzad(Status status) {
        this.f6448b = status;
    }

    @Override // com.google.android.gms.common.api.InterfaceC0982m
    /* renamed from: e */
    public final Status mo6496e() {
        return this.f6448b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7260a(parcel, 1, (Parcelable) mo6496e(), i, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
