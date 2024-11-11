package com.google.android.gms.internal.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new C1570b();

    /* renamed from: b */
    private final String f7040b;

    /* renamed from: c */
    private final String f7041c;

    /* renamed from: d */
    private final List<zzg> f7042d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzi(String str, String str2, List<zzg> list) {
        this.f7040b = str;
        this.f7041c = str2;
        this.f7042d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzi)) {
            return false;
        }
        zzi zziVar = (zzi) obj;
        return this.f7040b.equals(zziVar.f7040b) && this.f7041c.equals(zziVar.f7041c) && this.f7042d.equals(zziVar.f7042d);
    }

    public final int hashCode() {
        return C1050s.m7203a(this.f7040b, this.f7041c, this.f7042d);
    }

    public final String toString() {
        C1050s.a m7204a = C1050s.m7204a(this);
        m7204a.m7206a("accountName", this.f7040b);
        m7204a.m7206a("placeId", this.f7041c);
        m7204a.m7206a("placeAliases", this.f7042d);
        return m7204a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7266a(parcel, 1, this.f7040b, false);
        C1053b.m7266a(parcel, 2, this.f7041c, false);
        C1053b.m7279d(parcel, 6, this.f7042d, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
