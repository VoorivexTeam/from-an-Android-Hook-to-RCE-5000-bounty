package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import com.google.android.gms.common.util.C1100f;

/* loaded from: classes.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR;

    /* renamed from: d */
    private static final zzp f7183d = m8995a("test_type", 1);

    /* renamed from: e */
    private static final zzp f7184e = m8995a("labeled_place", 6);

    /* renamed from: f */
    private static final zzp f7185f;

    /* renamed from: b */
    private final String f7186b;

    /* renamed from: c */
    private final int f7187c;

    static {
        zzp m8995a = m8995a("here_content", 7);
        f7185f = m8995a;
        C1100f.m7382a(f7183d, f7184e, m8995a);
        CREATOR = new C1621j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzp(String str, int i) {
        C1057u.m7296b(str);
        this.f7186b = str;
        this.f7187c = i;
    }

    /* renamed from: a */
    private static zzp m8995a(String str, int i) {
        return new zzp(str, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzp)) {
            return false;
        }
        zzp zzpVar = (zzp) obj;
        return this.f7186b.equals(zzpVar.f7186b) && this.f7187c == zzpVar.f7187c;
    }

    public final int hashCode() {
        return this.f7186b.hashCode();
    }

    public final String toString() {
        return this.f7186b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7266a(parcel, 1, this.f7186b, false);
        C1053b.m7255a(parcel, 2, this.f7187c);
        C1053b.m7251a(parcel, m7250a);
    }
}
