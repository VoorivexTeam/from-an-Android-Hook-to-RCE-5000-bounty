package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.firebase.messaging.s */
/* loaded from: classes.dex */
public final class C2157s implements Parcelable.Creator<RemoteMessage> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RemoteMessage createFromParcel(Parcel parcel) {
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
        return new RemoteMessage(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RemoteMessage[] newArray(int i) {
        return new RemoteMessage[i];
    }
}
