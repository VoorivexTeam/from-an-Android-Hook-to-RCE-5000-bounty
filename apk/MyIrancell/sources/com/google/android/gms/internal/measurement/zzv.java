package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class zzv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzv> CREATOR = new C1385md();

    /* renamed from: b */
    public final long f7032b;

    /* renamed from: c */
    public final long f7033c;

    /* renamed from: d */
    public final boolean f7034d;

    /* renamed from: e */
    public final String f7035e;

    /* renamed from: f */
    public final String f7036f;

    /* renamed from: g */
    public final String f7037g;

    /* renamed from: h */
    public final Bundle f7038h;

    public zzv(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle) {
        this.f7032b = j;
        this.f7033c = j2;
        this.f7034d = z;
        this.f7035e = str;
        this.f7036f = str2;
        this.f7037g = str3;
        this.f7038h = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7256a(parcel, 1, this.f7032b);
        C1053b.m7256a(parcel, 2, this.f7033c);
        C1053b.m7269a(parcel, 3, this.f7034d);
        C1053b.m7266a(parcel, 4, this.f7035e, false);
        C1053b.m7266a(parcel, 5, this.f7036f, false);
        C1053b.m7266a(parcel, 6, this.f7037g, false);
        C1053b.m7257a(parcel, 7, this.f7038h, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
