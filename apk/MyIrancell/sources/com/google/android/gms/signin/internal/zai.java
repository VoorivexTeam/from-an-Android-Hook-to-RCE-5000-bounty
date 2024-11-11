package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new C1967h();

    /* renamed from: b */
    private final int f8272b;

    /* renamed from: c */
    private final ResolveAccountRequest f8273c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zai(int i, ResolveAccountRequest resolveAccountRequest) {
        this.f8272b = i;
        this.f8273c = resolveAccountRequest;
    }

    public zai(ResolveAccountRequest resolveAccountRequest) {
        this(1, resolveAccountRequest);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f8272b);
        C1053b.m7260a(parcel, 2, (Parcelable) this.f8273c, i, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
