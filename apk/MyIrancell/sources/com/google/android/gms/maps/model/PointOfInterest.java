package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class PointOfInterest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PointOfInterest> CREATOR = new C1645k();

    /* renamed from: b */
    public final LatLng f7283b;

    /* renamed from: c */
    public final String f7284c;

    /* renamed from: d */
    public final String f7285d;

    public PointOfInterest(LatLng latLng, String str, String str2) {
        this.f7283b = latLng;
        this.f7284c = str;
        this.f7285d = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7260a(parcel, 2, (Parcelable) this.f7283b, i, false);
        C1053b.m7266a(parcel, 3, this.f7284c, false);
        C1053b.m7266a(parcel, 4, this.f7285d, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
