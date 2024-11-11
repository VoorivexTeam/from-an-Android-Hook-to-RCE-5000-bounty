package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class zzan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzan> CREATOR = new C1839p();

    /* renamed from: b */
    public final String f8220b;

    /* renamed from: c */
    public final zzam f8221c;

    /* renamed from: d */
    public final String f8222d;

    /* renamed from: e */
    public final long f8223e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzan(zzan zzanVar, long j) {
        C1057u.m7286a(zzanVar);
        this.f8220b = zzanVar.f8220b;
        this.f8221c = zzanVar.f8221c;
        this.f8222d = zzanVar.f8222d;
        this.f8223e = j;
    }

    public zzan(String str, zzam zzamVar, String str2, long j) {
        this.f8220b = str;
        this.f8221c = zzamVar;
        this.f8222d = str2;
        this.f8223e = j;
    }

    public final String toString() {
        String str = this.f8222d;
        String str2 = this.f8220b;
        String valueOf = String.valueOf(this.f8221c);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7266a(parcel, 2, this.f8220b, false);
        C1053b.m7260a(parcel, 3, (Parcelable) this.f8221c, i, false);
        C1053b.m7266a(parcel, 4, this.f8222d, false);
        C1053b.m7256a(parcel, 5, this.f8223e);
        C1053b.m7251a(parcel, m7250a);
    }
}
