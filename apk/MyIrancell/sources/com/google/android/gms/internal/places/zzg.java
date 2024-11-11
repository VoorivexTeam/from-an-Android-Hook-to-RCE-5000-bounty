package com.google.android.gms.internal.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

@Deprecated
/* loaded from: classes.dex */
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new C1569a();

    /* renamed from: b */
    private final String f7039b;

    static {
        new zzg("Home");
        new zzg("Work");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzg(String str) {
        this.f7039b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzg) {
            return C1050s.m7205a(this.f7039b, ((zzg) obj).f7039b);
        }
        return false;
    }

    public final int hashCode() {
        return C1050s.m7203a(this.f7039b);
    }

    public final String toString() {
        C1050s.a m7204a = C1050s.m7204a(this);
        m7204a.m7206a("alias", this.f7039b);
        return m7204a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7266a(parcel, 1, this.f7039b, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
