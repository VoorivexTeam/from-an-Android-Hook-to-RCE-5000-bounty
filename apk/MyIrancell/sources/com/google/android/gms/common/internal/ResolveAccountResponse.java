package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.InterfaceC1038m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public class ResolveAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResolveAccountResponse> CREATOR = new C1029h0();

    /* renamed from: b */
    private final int f6134b;

    /* renamed from: c */
    private IBinder f6135c;

    /* renamed from: d */
    private ConnectionResult f6136d;

    /* renamed from: e */
    private boolean f6137e;

    /* renamed from: f */
    private boolean f6138f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ResolveAccountResponse(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f6134b = i;
        this.f6135c = iBinder;
        this.f6136d = connectionResult;
        this.f6137e = z;
        this.f6138f = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolveAccountResponse)) {
            return false;
        }
        ResolveAccountResponse resolveAccountResponse = (ResolveAccountResponse) obj;
        return this.f6136d.equals(resolveAccountResponse.f6136d) && m7034j().equals(resolveAccountResponse.m7034j());
    }

    /* renamed from: j */
    public InterfaceC1038m m7034j() {
        return InterfaceC1038m.a.m7175a(this.f6135c);
    }

    /* renamed from: k */
    public ConnectionResult m7035k() {
        return this.f6136d;
    }

    /* renamed from: l */
    public boolean m7036l() {
        return this.f6137e;
    }

    /* renamed from: m */
    public boolean m7037m() {
        return this.f6138f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f6134b);
        C1053b.m7258a(parcel, 2, this.f6135c, false);
        C1053b.m7260a(parcel, 3, (Parcelable) m7035k(), i, false);
        C1053b.m7269a(parcel, 4, m7036l());
        C1053b.m7269a(parcel, 5, m7037m());
        C1053b.m7251a(parcel, m7250a);
    }
}
