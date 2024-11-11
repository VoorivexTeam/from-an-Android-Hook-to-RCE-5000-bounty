package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new C1600p();

    /* renamed from: b */
    private final int f7191b;

    /* renamed from: c */
    private final int f7192c;

    /* renamed from: d */
    private final long f7193d;

    /* renamed from: e */
    private final long f7194e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaj(int i, int i2, long j, long j2) {
        this.f7191b = i;
        this.f7192c = i2;
        this.f7193d = j;
        this.f7194e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaj.class == obj.getClass()) {
            zzaj zzajVar = (zzaj) obj;
            if (this.f7191b == zzajVar.f7191b && this.f7192c == zzajVar.f7192c && this.f7193d == zzajVar.f7193d && this.f7194e == zzajVar.f7194e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C1050s.m7203a(Integer.valueOf(this.f7192c), Integer.valueOf(this.f7191b), Long.valueOf(this.f7194e), Long.valueOf(this.f7193d));
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f7191b + " Cell status: " + this.f7192c + " elapsed time NS: " + this.f7194e + " system time ms: " + this.f7193d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f7191b);
        C1053b.m7255a(parcel, 2, this.f7192c);
        C1053b.m7256a(parcel, 3, this.f7193d);
        C1053b.m7256a(parcel, 4, this.f7194e);
        C1053b.m7251a(parcel, m7250a);
    }
}
