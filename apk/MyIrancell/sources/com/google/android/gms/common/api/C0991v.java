package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.common.api.v */
/* loaded from: classes.dex */
public final class C0991v implements Parcelable.Creator<Status> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            if (m7215a == 1) {
                i2 = C1052a.m7208A(parcel, m7216a);
            } else if (m7215a == 2) {
                str = C1052a.m7238o(parcel, m7216a);
            } else if (m7215a == 3) {
                pendingIntent = (PendingIntent) C1052a.m7217a(parcel, m7216a, PendingIntent.CREATOR);
            } else if (m7215a != 1000) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                i = C1052a.m7208A(parcel, m7216a);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new Status(i, i2, str, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status[] newArray(int i) {
        return new Status[i];
    }
}
