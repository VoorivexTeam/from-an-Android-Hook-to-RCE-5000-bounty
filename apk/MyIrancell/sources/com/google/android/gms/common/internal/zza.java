package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new C1035k0();

    /* renamed from: b */
    Bundle f6275b;

    /* renamed from: c */
    Feature[] f6276c;

    /* renamed from: d */
    private int f6277d;

    public zza() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zza(Bundle bundle, Feature[] featureArr, int i) {
        this.f6275b = bundle;
        this.f6276c = featureArr;
        this.f6277d = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7257a(parcel, 1, this.f6275b, false);
        C1053b.m7271a(parcel, 2, (Parcelable[]) this.f6276c, i, false);
        C1053b.m7255a(parcel, 3, this.f6277d);
        C1053b.m7251a(parcel, m7250a);
    }
}
