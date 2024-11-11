package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import com.google.android.gms.location.zzj;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzm extends AbstractSafeParcelable {

    /* renamed from: b */
    private zzj f6474b;

    /* renamed from: c */
    private List<ClientIdentity> f6475c;

    /* renamed from: d */
    private String f6476d;

    /* renamed from: e */
    static final List<ClientIdentity> f6472e = Collections.emptyList();

    /* renamed from: f */
    static final zzj f6473f = new zzj();
    public static final Parcelable.Creator<zzm> CREATOR = new C1167e0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzm(zzj zzjVar, List<ClientIdentity> list, String str) {
        this.f6474b = zzjVar;
        this.f6475c = list;
        this.f6476d = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzm)) {
            return false;
        }
        zzm zzmVar = (zzm) obj;
        return C1050s.m7205a(this.f6474b, zzmVar.f6474b) && C1050s.m7205a(this.f6475c, zzmVar.f6475c) && C1050s.m7205a(this.f6476d, zzmVar.f6476d);
    }

    public final int hashCode() {
        return this.f6474b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7260a(parcel, 1, (Parcelable) this.f6474b, i, false);
        C1053b.m7279d(parcel, 2, this.f6475c, false);
        C1053b.m7266a(parcel, 3, this.f6476d, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
