package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public class StreetViewPanoramaLink extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaLink> CREATOR = new C1649o();

    /* renamed from: b */
    public final String f7312b;

    /* renamed from: c */
    public final float f7313c;

    public StreetViewPanoramaLink(String str, float f) {
        this.f7312b = str;
        this.f7313c = (((double) f) <= 0.0d ? (f % 360.0f) + 360.0f : f) % 360.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLink)) {
            return false;
        }
        StreetViewPanoramaLink streetViewPanoramaLink = (StreetViewPanoramaLink) obj;
        return this.f7312b.equals(streetViewPanoramaLink.f7312b) && Float.floatToIntBits(this.f7313c) == Float.floatToIntBits(streetViewPanoramaLink.f7313c);
    }

    public int hashCode() {
        return C1050s.m7203a(this.f7312b, Float.valueOf(this.f7313c));
    }

    public String toString() {
        C1050s.a m7204a = C1050s.m7204a(this);
        m7204a.m7206a("panoId", this.f7312b);
        m7204a.m7206a("bearing", Float.valueOf(this.f7313c));
        return m7204a.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7266a(parcel, 2, this.f7312b, false);
        C1053b.m7254a(parcel, 3, this.f7313c);
        C1053b.m7251a(parcel, m7250a);
    }
}
