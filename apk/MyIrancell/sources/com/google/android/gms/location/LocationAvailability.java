package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new C1586h();

    /* renamed from: b */
    @Deprecated
    private int f7064b;

    /* renamed from: c */
    @Deprecated
    private int f7065c;

    /* renamed from: d */
    private long f7066d;

    /* renamed from: e */
    private int f7067e;

    /* renamed from: f */
    private zzaj[] f7068f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationAvailability(int i, int i2, int i3, long j, zzaj[] zzajVarArr) {
        this.f7067e = i;
        this.f7064b = i2;
        this.f7065c = i3;
        this.f7066d = j;
        this.f7068f = zzajVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && LocationAvailability.class == obj.getClass()) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f7064b == locationAvailability.f7064b && this.f7065c == locationAvailability.f7065c && this.f7066d == locationAvailability.f7066d && this.f7067e == locationAvailability.f7067e && Arrays.equals(this.f7068f, locationAvailability.f7068f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C1050s.m7203a(Integer.valueOf(this.f7067e), Integer.valueOf(this.f7064b), Integer.valueOf(this.f7065c), Long.valueOf(this.f7066d), this.f7068f);
    }

    /* renamed from: j */
    public final boolean m8946j() {
        return this.f7067e < 1000;
    }

    public final String toString() {
        boolean m8946j = m8946j();
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(m8946j);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f7064b);
        C1053b.m7255a(parcel, 2, this.f7065c);
        C1053b.m7256a(parcel, 3, this.f7066d);
        C1053b.m7255a(parcel, 4, this.f7067e);
        C1053b.m7271a(parcel, 5, (Parcelable[]) this.f7068f, i, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
