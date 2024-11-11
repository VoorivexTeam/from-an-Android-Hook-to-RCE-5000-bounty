package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceMetaData> CREATOR = new C0809e();

    /* renamed from: b */
    private final int f5498b;

    /* renamed from: c */
    private boolean f5499c;

    /* renamed from: d */
    private long f5500d;

    /* renamed from: e */
    private final boolean f5501e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DeviceMetaData(int i, boolean z, long j, boolean z2) {
        this.f5498b = i;
        this.f5499c = z;
        this.f5500d = j;
        this.f5501e = z2;
    }

    /* renamed from: j */
    public long m6350j() {
        return this.f5500d;
    }

    /* renamed from: k */
    public boolean m6351k() {
        return this.f5501e;
    }

    /* renamed from: l */
    public boolean m6352l() {
        return this.f5499c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f5498b);
        C1053b.m7269a(parcel, 2, m6352l());
        C1053b.m7256a(parcel, 3, m6350j());
        C1053b.m7269a(parcel, 4, m6351k());
        C1053b.m7251a(parcel, m7250a);
    }
}
