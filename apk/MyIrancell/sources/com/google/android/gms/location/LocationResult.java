package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {

    /* renamed from: b */
    private final List<Location> f7078b;

    /* renamed from: c */
    static final List<Location> f7077c = Collections.emptyList();
    public static final Parcelable.Creator<LocationResult> CREATOR = new C1590j();

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationResult(List<Location> list) {
        this.f7078b = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.f7078b.size() != this.f7078b.size()) {
            return false;
        }
        Iterator<Location> it = locationResult.f7078b.iterator();
        Iterator<Location> it2 = this.f7078b.iterator();
        while (it.hasNext()) {
            if (it2.next().getTime() != it.next().getTime()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Iterator<Location> it = this.f7078b.iterator();
        int i = 17;
        while (it.hasNext()) {
            long time = it.next().getTime();
            i = (i * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i;
    }

    /* renamed from: j */
    public final Location m8952j() {
        int size = this.f7078b.size();
        if (size == 0) {
            return null;
        }
        return this.f7078b.get(size - 1);
    }

    /* renamed from: k */
    public final List<Location> m8953k() {
        return this.f7078b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f7078b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7279d(parcel, 1, m8953k(), false);
        C1053b.m7251a(parcel, m7250a);
    }
}
