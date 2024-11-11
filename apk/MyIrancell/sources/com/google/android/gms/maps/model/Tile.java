package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class Tile extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Tile> CREATOR = new C1653s();

    /* renamed from: b */
    public final int f7323b;

    /* renamed from: c */
    public final int f7324c;

    /* renamed from: d */
    public final byte[] f7325d;

    public Tile(int i, int i2, byte[] bArr) {
        this.f7323b = i;
        this.f7324c = i2;
        this.f7325d = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 2, this.f7323b);
        C1053b.m7255a(parcel, 3, this.f7324c);
        C1053b.m7270a(parcel, 4, this.f7325d, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
