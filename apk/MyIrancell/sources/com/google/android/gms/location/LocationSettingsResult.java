package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.InterfaceC0982m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class LocationSettingsResult extends AbstractSafeParcelable implements InterfaceC0982m {
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new C1598n();

    /* renamed from: b */
    private final Status f7086b;

    /* renamed from: c */
    private final LocationSettingsStates f7087c;

    public LocationSettingsResult(Status status) {
        this(status, null);
    }

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.f7086b = status;
        this.f7087c = locationSettingsStates;
    }

    @Override // com.google.android.gms.common.api.InterfaceC0982m
    /* renamed from: e */
    public final Status mo6496e() {
        return this.f7086b;
    }

    /* renamed from: j */
    public final LocationSettingsStates m8956j() {
        return this.f7087c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7260a(parcel, 1, (Parcelable) mo6496e(), i, false);
        C1053b.m7260a(parcel, 2, (Parcelable) m8956j(), i, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
