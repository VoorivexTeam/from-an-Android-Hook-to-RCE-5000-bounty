package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

/* loaded from: classes.dex */
public class StreetViewPanoramaCamera extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaCamera> CREATOR = new C1648n();

    /* renamed from: b */
    public final float f7308b;

    /* renamed from: c */
    public final float f7309c;

    /* renamed from: d */
    public final float f7310d;

    /* renamed from: e */
    private final StreetViewPanoramaOrientation f7311e;

    public StreetViewPanoramaCamera(float f, float f2, float f3) {
        boolean z = -90.0f <= f2 && f2 <= 90.0f;
        StringBuilder sb = new StringBuilder(62);
        sb.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f2);
        C1057u.m7294a(z, sb.toString());
        this.f7308b = ((double) f) <= 0.0d ? 0.0f : f;
        this.f7309c = 0.0f + f2;
        this.f7310d = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
        StreetViewPanoramaOrientation.C1634a c1634a = new StreetViewPanoramaOrientation.C1634a();
        c1634a.m9062b(f2);
        c1634a.m9060a(f3);
        this.f7311e = c1634a.m9061a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        return Float.floatToIntBits(this.f7308b) == Float.floatToIntBits(streetViewPanoramaCamera.f7308b) && Float.floatToIntBits(this.f7309c) == Float.floatToIntBits(streetViewPanoramaCamera.f7309c) && Float.floatToIntBits(this.f7310d) == Float.floatToIntBits(streetViewPanoramaCamera.f7310d);
    }

    public int hashCode() {
        return C1050s.m7203a(Float.valueOf(this.f7308b), Float.valueOf(this.f7309c), Float.valueOf(this.f7310d));
    }

    public String toString() {
        C1050s.a m7204a = C1050s.m7204a(this);
        m7204a.m7206a("zoom", Float.valueOf(this.f7308b));
        m7204a.m7206a("tilt", Float.valueOf(this.f7309c));
        m7204a.m7206a("bearing", Float.valueOf(this.f7310d));
        return m7204a.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7254a(parcel, 2, this.f7308b);
        C1053b.m7254a(parcel, 3, this.f7309c);
        C1053b.m7254a(parcel, 4, this.f7310d);
        C1053b.m7251a(parcel, m7250a);
    }
}
