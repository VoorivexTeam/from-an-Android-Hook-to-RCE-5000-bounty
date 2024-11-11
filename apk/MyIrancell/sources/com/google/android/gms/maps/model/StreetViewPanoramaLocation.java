package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public class StreetViewPanoramaLocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaLocation> CREATOR = new C1650p();

    /* renamed from: b */
    public final StreetViewPanoramaLink[] f7314b;

    /* renamed from: c */
    public final LatLng f7315c;

    /* renamed from: d */
    public final String f7316d;

    public StreetViewPanoramaLocation(StreetViewPanoramaLink[] streetViewPanoramaLinkArr, LatLng latLng, String str) {
        this.f7314b = streetViewPanoramaLinkArr;
        this.f7315c = latLng;
        this.f7316d = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLocation)) {
            return false;
        }
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) obj;
        return this.f7316d.equals(streetViewPanoramaLocation.f7316d) && this.f7315c.equals(streetViewPanoramaLocation.f7315c);
    }

    public int hashCode() {
        return C1050s.m7203a(this.f7315c, this.f7316d);
    }

    public String toString() {
        C1050s.a m7204a = C1050s.m7204a(this);
        m7204a.m7206a("panoId", this.f7316d);
        m7204a.m7206a("position", this.f7315c.toString());
        return m7204a.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7271a(parcel, 2, (Parcelable[]) this.f7314b, i, false);
        C1053b.m7260a(parcel, 3, (Parcelable) this.f7315c, i, false);
        C1053b.m7266a(parcel, 4, this.f7316d, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
