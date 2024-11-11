package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new C1599o();

    /* renamed from: b */
    private final boolean f7088b;

    /* renamed from: c */
    private final boolean f7089c;

    /* renamed from: d */
    private final boolean f7090d;

    /* renamed from: e */
    private final boolean f7091e;

    /* renamed from: f */
    private final boolean f7092f;

    /* renamed from: g */
    private final boolean f7093g;

    public LocationSettingsStates(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f7088b = z;
        this.f7089c = z2;
        this.f7090d = z3;
        this.f7091e = z4;
        this.f7092f = z5;
        this.f7093g = z6;
    }

    /* renamed from: j */
    public final boolean m8957j() {
        return this.f7093g;
    }

    /* renamed from: k */
    public final boolean m8958k() {
        return this.f7090d;
    }

    /* renamed from: l */
    public final boolean m8959l() {
        return this.f7091e;
    }

    /* renamed from: m */
    public final boolean m8960m() {
        return this.f7088b;
    }

    /* renamed from: n */
    public final boolean m8961n() {
        return this.f7092f;
    }

    /* renamed from: o */
    public final boolean m8962o() {
        return this.f7089c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7269a(parcel, 1, m8960m());
        C1053b.m7269a(parcel, 2, m8962o());
        C1053b.m7269a(parcel, 3, m8958k());
        C1053b.m7269a(parcel, 4, m8959l());
        C1053b.m7269a(parcel, 5, m8961n());
        C1053b.m7269a(parcel, 6, m8957j());
        C1053b.m7251a(parcel, m7250a);
    }
}
