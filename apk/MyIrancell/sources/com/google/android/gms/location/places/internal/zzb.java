package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new C1616g();

    /* renamed from: b */
    final int f7172b;

    /* renamed from: c */
    final int f7173c;

    public zzb(int i, int i2) {
        this.f7172b = i;
        this.f7173c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzb)) {
            return false;
        }
        zzb zzbVar = (zzb) obj;
        return C1050s.m7205a(Integer.valueOf(this.f7172b), Integer.valueOf(zzbVar.f7172b)) && C1050s.m7205a(Integer.valueOf(this.f7173c), Integer.valueOf(zzbVar.f7173c));
    }

    public final int hashCode() {
        return C1050s.m7203a(Integer.valueOf(this.f7172b), Integer.valueOf(this.f7173c));
    }

    public final String toString() {
        C1050s.a m7204a = C1050s.m7204a(this);
        m7204a.m7206a("offset", Integer.valueOf(this.f7172b));
        m7204a.m7206a("length", Integer.valueOf(this.f7173c));
        return m7204a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f7172b);
        C1053b.m7255a(parcel, 2, this.f7173c);
        C1053b.m7251a(parcel, m7250a);
    }
}
