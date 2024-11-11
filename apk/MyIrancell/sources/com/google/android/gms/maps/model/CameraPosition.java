package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new C1636b();

    /* renamed from: b */
    public final LatLng f7230b;

    /* renamed from: c */
    public final float f7231c;

    /* renamed from: d */
    public final float f7232d;

    /* renamed from: e */
    public final float f7233e;

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        C1057u.m7287a(latLng, "null camera target");
        C1057u.m7295a(0.0f <= f2 && f2 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.f7230b = latLng;
        this.f7231c = f;
        this.f7232d = f2 + 0.0f;
        this.f7233e = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f7230b.equals(cameraPosition.f7230b) && Float.floatToIntBits(this.f7231c) == Float.floatToIntBits(cameraPosition.f7231c) && Float.floatToIntBits(this.f7232d) == Float.floatToIntBits(cameraPosition.f7232d) && Float.floatToIntBits(this.f7233e) == Float.floatToIntBits(cameraPosition.f7233e);
    }

    public final int hashCode() {
        return C1050s.m7203a(this.f7230b, Float.valueOf(this.f7231c), Float.valueOf(this.f7232d), Float.valueOf(this.f7233e));
    }

    public final String toString() {
        C1050s.a m7204a = C1050s.m7204a(this);
        m7204a.m7206a("target", this.f7230b);
        m7204a.m7206a("zoom", Float.valueOf(this.f7231c));
        m7204a.m7206a("tilt", Float.valueOf(this.f7232d));
        m7204a.m7206a("bearing", Float.valueOf(this.f7233e));
        return m7204a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7260a(parcel, 2, (Parcelable) this.f7230b, i, false);
        C1053b.m7254a(parcel, 3, this.f7231c);
        C1053b.m7254a(parcel, 4, this.f7232d);
        C1053b.m7254a(parcel, 5, this.f7233e);
        C1053b.m7251a(parcel, m7250a);
    }
}
