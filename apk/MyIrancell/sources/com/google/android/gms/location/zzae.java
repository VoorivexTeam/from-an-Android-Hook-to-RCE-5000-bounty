package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new C1594l();

    /* renamed from: b */
    private final String f7188b;

    /* renamed from: c */
    private final String f7189c;

    /* renamed from: d */
    private final String f7190d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzae(String str, String str2, String str3) {
        this.f7190d = str;
        this.f7188b = str2;
        this.f7189c = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7266a(parcel, 1, this.f7188b, false);
        C1053b.m7266a(parcel, 2, this.f7189c, false);
        C1053b.m7266a(parcel, 5, this.f7190d, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
