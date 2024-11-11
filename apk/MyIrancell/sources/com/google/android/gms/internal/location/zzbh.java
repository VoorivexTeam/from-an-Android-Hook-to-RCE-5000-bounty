package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzbh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbh> CREATOR = new C1187w();

    /* renamed from: b */
    private final String f6463b;

    /* renamed from: c */
    private final long f6464c;

    /* renamed from: d */
    private final short f6465d;

    /* renamed from: e */
    private final double f6466e;

    /* renamed from: f */
    private final double f6467f;

    /* renamed from: g */
    private final float f6468g;

    /* renamed from: h */
    private final int f6469h;

    /* renamed from: i */
    private final int f6470i;

    /* renamed from: j */
    private final int f6471j;

    public zzbh(String str, int i, short s, double d, double d2, float f, long j, int i2, int i3) {
        if (str == null || str.length() > 100) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "requestId is null or too long: ".concat(valueOf) : new String("requestId is null or too long: "));
        }
        if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("invalid radius: ");
            sb.append(f);
            throw new IllegalArgumentException(sb.toString());
        }
        if (d > 90.0d || d < -90.0d) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("invalid latitude: ");
            sb2.append(d);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (d2 > 180.0d || d2 < -180.0d) {
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append("invalid longitude: ");
            sb3.append(d2);
            throw new IllegalArgumentException(sb3.toString());
        }
        int i4 = i & 7;
        if (i4 == 0) {
            StringBuilder sb4 = new StringBuilder(46);
            sb4.append("No supported transition specified: ");
            sb4.append(i);
            throw new IllegalArgumentException(sb4.toString());
        }
        this.f6465d = s;
        this.f6463b = str;
        this.f6466e = d;
        this.f6467f = d2;
        this.f6468g = f;
        this.f6464c = j;
        this.f6469h = i4;
        this.f6470i = i2;
        this.f6471j = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzbh)) {
            return false;
        }
        zzbh zzbhVar = (zzbh) obj;
        return this.f6468g == zzbhVar.f6468g && this.f6466e == zzbhVar.f6466e && this.f6467f == zzbhVar.f6467f && this.f6465d == zzbhVar.f6465d;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f6466e);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.f6467f);
        return (((((((i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f6468g)) * 31) + this.f6465d) * 31) + this.f6469h;
    }

    /* renamed from: j */
    public final String m7502j() {
        return this.f6463b;
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        objArr[0] = this.f6465d != 1 ? null : "CIRCLE";
        objArr[1] = this.f6463b.replaceAll("\\p{C}", "?");
        objArr[2] = Integer.valueOf(this.f6469h);
        objArr[3] = Double.valueOf(this.f6466e);
        objArr[4] = Double.valueOf(this.f6467f);
        objArr[5] = Float.valueOf(this.f6468g);
        objArr[6] = Integer.valueOf(this.f6470i / 1000);
        objArr[7] = Integer.valueOf(this.f6471j);
        objArr[8] = Long.valueOf(this.f6464c);
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7266a(parcel, 1, m7502j(), false);
        C1053b.m7256a(parcel, 2, this.f6464c);
        C1053b.m7268a(parcel, 3, this.f6465d);
        C1053b.m7253a(parcel, 4, this.f6466e);
        C1053b.m7253a(parcel, 5, this.f6467f);
        C1053b.m7254a(parcel, 6, this.f6468g);
        C1053b.m7255a(parcel, 7, this.f6469h);
        C1053b.m7255a(parcel, 8, this.f6470i);
        C1053b.m7255a(parcel, 9, this.f6471j);
        C1053b.m7251a(parcel, m7250a);
    }
}
