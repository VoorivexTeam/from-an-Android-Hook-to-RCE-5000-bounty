package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR = new C1620k();

    /* renamed from: b */
    private final int f7164b;

    /* renamed from: c */
    private final int f7165c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzao(int i, int i2) {
        this.f7164b = i;
        this.f7165c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f7164b);
        C1053b.m7255a(parcel, 2, this.f7165c);
        C1053b.m7251a(parcel, m7250a);
    }
}
