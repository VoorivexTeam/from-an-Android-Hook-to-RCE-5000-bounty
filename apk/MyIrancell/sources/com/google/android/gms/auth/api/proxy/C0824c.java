package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.auth.api.proxy.c */
/* loaded from: classes.dex */
public final class C0824c implements Parcelable.Creator<ProxyResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ProxyResponse createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        PendingIntent pendingIntent = null;
        Bundle bundle = null;
        byte[] bArr = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            if (m7215a == 1) {
                i2 = C1052a.m7208A(parcel, m7216a);
            } else if (m7215a == 2) {
                pendingIntent = (PendingIntent) C1052a.m7217a(parcel, m7216a, PendingIntent.CREATOR);
            } else if (m7215a == 3) {
                i3 = C1052a.m7208A(parcel, m7216a);
            } else if (m7215a == 4) {
                bundle = C1052a.m7229f(parcel, m7216a);
            } else if (m7215a == 5) {
                bArr = C1052a.m7230g(parcel, m7216a);
            } else if (m7215a != 1000) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                i = C1052a.m7208A(parcel, m7216a);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new ProxyResponse(i, i2, pendingIntent, i3, bundle, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ProxyResponse[] newArray(int i) {
        return new ProxyResponse[i];
    }
}
