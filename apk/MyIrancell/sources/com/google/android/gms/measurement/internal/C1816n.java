package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.measurement.internal.n */
/* loaded from: classes.dex */
public final class C1816n implements Parcelable.Creator<zzam> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzam createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            if (C1052a.m7215a(m7216a) != 2) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                bundle = C1052a.m7229f(parcel, m7216a);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new zzam(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzam[] newArray(int i) {
        return new zzam[i];
    }
}
