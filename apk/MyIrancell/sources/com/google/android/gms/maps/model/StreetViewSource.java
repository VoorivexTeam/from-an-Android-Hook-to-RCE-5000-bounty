package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class StreetViewSource extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewSource> CREATOR = new C1652r();

    /* renamed from: c */
    public static final StreetViewSource f7321c = new StreetViewSource(0);

    /* renamed from: b */
    private final int f7322b;

    static {
        new StreetViewSource(1);
    }

    public StreetViewSource(int i) {
        this.f7322b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StreetViewSource) && this.f7322b == ((StreetViewSource) obj).f7322b;
    }

    public final int hashCode() {
        return C1050s.m7203a(Integer.valueOf(this.f7322b));
    }

    public final String toString() {
        int i = this.f7322b;
        return String.format("StreetViewSource:%s", i != 0 ? i != 1 ? String.format("UNKNOWN(%s)", Integer.valueOf(i)) : "OUTDOOR" : "DEFAULT");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 2, this.f7322b);
        C1053b.m7251a(parcel, m7250a);
    }
}
