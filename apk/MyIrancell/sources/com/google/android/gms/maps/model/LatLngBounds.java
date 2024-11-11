package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new C1640f();

    /* renamed from: b */
    public final LatLng f7264b;

    /* renamed from: c */
    public final LatLng f7265c;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        C1057u.m7287a(latLng, "null southwest");
        C1057u.m7287a(latLng2, "null northeast");
        C1057u.m7295a(latLng2.f7262b >= latLng.f7262b, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(latLng.f7262b), Double.valueOf(latLng2.f7262b));
        this.f7264b = latLng;
        this.f7265c = latLng2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f7264b.equals(latLngBounds.f7264b) && this.f7265c.equals(latLngBounds.f7265c);
    }

    public final int hashCode() {
        return C1050s.m7203a(this.f7264b, this.f7265c);
    }

    public final String toString() {
        C1050s.a m7204a = C1050s.m7204a(this);
        m7204a.m7206a("southwest", this.f7264b);
        m7204a.m7206a("northeast", this.f7265c);
        return m7204a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7260a(parcel, 2, (Parcelable) this.f7264b, i, false);
        C1053b.m7260a(parcel, 3, (Parcelable) this.f7265c, i, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
