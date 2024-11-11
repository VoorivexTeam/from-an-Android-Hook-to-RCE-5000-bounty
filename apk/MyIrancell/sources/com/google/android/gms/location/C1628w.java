package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.location.w */
/* loaded from: classes.dex */
public final class C1628w implements Parcelable.Creator<ActivityTransitionResult> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ActivityTransitionResult createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            if (C1052a.m7215a(m7216a) != 1) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                arrayList = C1052a.m7226c(parcel, m7216a, ActivityTransitionEvent.CREATOR);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new ActivityTransitionResult(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ActivityTransitionResult[] newArray(int i) {
        return new ActivityTransitionResult[i];
    }
}
