package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.common.api.u */
/* loaded from: classes.dex */
public final class C0990u implements Parcelable.Creator<Scope> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Scope createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            if (m7215a == 1) {
                i = C1052a.m7208A(parcel, m7216a);
            } else if (m7215a != 2) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                str = C1052a.m7238o(parcel, m7216a);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new Scope(i, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Scope[] newArray(int i) {
        return new Scope[i];
    }
}