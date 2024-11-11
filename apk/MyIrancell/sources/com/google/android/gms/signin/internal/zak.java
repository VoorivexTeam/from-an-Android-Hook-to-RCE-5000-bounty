package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new C1968i();

    /* renamed from: b */
    private final int f8274b;

    /* renamed from: c */
    private final ConnectionResult f8275c;

    /* renamed from: d */
    private final ResolveAccountResponse f8276d;

    public zak(int i) {
        this(new ConnectionResult(8, null), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zak(int i, ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this.f8274b = i;
        this.f8275c = connectionResult;
        this.f8276d = resolveAccountResponse;
    }

    private zak(ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this(1, connectionResult, null);
    }

    /* renamed from: j */
    public final ConnectionResult m9983j() {
        return this.f8275c;
    }

    /* renamed from: k */
    public final ResolveAccountResponse m9984k() {
        return this.f8276d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f8274b);
        C1053b.m7260a(parcel, 2, (Parcelable) this.f8275c, i, false);
        C1053b.m7260a(parcel, 3, (Parcelable) this.f8276d, i, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
