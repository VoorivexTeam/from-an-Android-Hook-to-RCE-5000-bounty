package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public class StreetViewPanoramaOrientation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOrientation> CREATOR = new C1651q();

    /* renamed from: b */
    public final float f7317b;

    /* renamed from: c */
    public final float f7318c;

    /* renamed from: com.google.android.gms.maps.model.StreetViewPanoramaOrientation$a */
    /* loaded from: classes.dex */
    public static final class C1634a {

        /* renamed from: a */
        public float f7319a;

        /* renamed from: b */
        public float f7320b;

        /* renamed from: a */
        public final C1634a m9060a(float f) {
            this.f7319a = f;
            return this;
        }

        /* renamed from: a */
        public final StreetViewPanoramaOrientation m9061a() {
            return new StreetViewPanoramaOrientation(this.f7320b, this.f7319a);
        }

        /* renamed from: b */
        public final C1634a m9062b(float f) {
            this.f7320b = f;
            return this;
        }
    }

    public StreetViewPanoramaOrientation(float f, float f2) {
        boolean z = -90.0f <= f && f <= 90.0f;
        StringBuilder sb = new StringBuilder(62);
        sb.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f);
        C1057u.m7294a(z, sb.toString());
        this.f7317b = f + 0.0f;
        this.f7318c = (((double) f2) <= 0.0d ? (f2 % 360.0f) + 360.0f : f2) % 360.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaOrientation)) {
            return false;
        }
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) obj;
        return Float.floatToIntBits(this.f7317b) == Float.floatToIntBits(streetViewPanoramaOrientation.f7317b) && Float.floatToIntBits(this.f7318c) == Float.floatToIntBits(streetViewPanoramaOrientation.f7318c);
    }

    public int hashCode() {
        return C1050s.m7203a(Float.valueOf(this.f7317b), Float.valueOf(this.f7318c));
    }

    public String toString() {
        C1050s.a m7204a = C1050s.m7204a(this);
        m7204a.m7206a("tilt", Float.valueOf(this.f7317b));
        m7204a.m7206a("bearing", Float.valueOf(this.f7318c));
        return m7204a.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7254a(parcel, 2, this.f7317b);
        C1053b.m7254a(parcel, 3, this.f7318c);
        C1053b.m7251a(parcel, m7250a);
    }
}
