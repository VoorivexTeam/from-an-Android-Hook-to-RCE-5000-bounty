package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.internal.location.b */
/* loaded from: classes.dex */
public final class C1160b implements Parcelable.Creator<zzad> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzad createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        Status status = null;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            if (C1052a.m7215a(m7216a) != 1) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                status = (Status) C1052a.m7217a(parcel, m7216a, Status.CREATOR);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new zzad(status);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzad[] newArray(int i) {
        return new zzad[i];
    }
}
