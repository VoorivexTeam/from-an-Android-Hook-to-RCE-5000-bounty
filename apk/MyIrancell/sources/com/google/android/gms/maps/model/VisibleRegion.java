package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class VisibleRegion extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VisibleRegion> CREATOR = new C1656v();

    /* renamed from: b */
    public final LatLng f7331b;

    /* renamed from: c */
    public final LatLng f7332c;

    /* renamed from: d */
    public final LatLng f7333d;

    /* renamed from: e */
    public final LatLng f7334e;

    /* renamed from: f */
    public final LatLngBounds f7335f;

    public VisibleRegion(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f7331b = latLng;
        this.f7332c = latLng2;
        this.f7333d = latLng3;
        this.f7334e = latLng4;
        this.f7335f = latLngBounds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        return this.f7331b.equals(visibleRegion.f7331b) && this.f7332c.equals(visibleRegion.f7332c) && this.f7333d.equals(visibleRegion.f7333d) && this.f7334e.equals(visibleRegion.f7334e) && this.f7335f.equals(visibleRegion.f7335f);
    }

    public final int hashCode() {
        return C1050s.m7203a(this.f7331b, this.f7332c, this.f7333d, this.f7334e, this.f7335f);
    }

    public final String toString() {
        C1050s.a m7204a = C1050s.m7204a(this);
        m7204a.m7206a("nearLeft", this.f7331b);
        m7204a.m7206a("nearRight", this.f7332c);
        m7204a.m7206a("farLeft", this.f7333d);
        m7204a.m7206a("farRight", this.f7334e);
        m7204a.m7206a("latLngBounds", this.f7335f);
        return m7204a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7260a(parcel, 2, (Parcelable) this.f7331b, i, false);
        C1053b.m7260a(parcel, 3, (Parcelable) this.f7332c, i, false);
        C1053b.m7260a(parcel, 4, (Parcelable) this.f7333d, i, false);
        C1053b.m7260a(parcel, 5, (Parcelable) this.f7334e, i, false);
        C1053b.m7260a(parcel, 6, (Parcelable) this.f7335f, i, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
