package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.internal.location.w */
/* loaded from: classes.dex */
public final class C1187w implements Parcelable.Creator<zzbh> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbh createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        String str = null;
        long j = 0;
        int i = 0;
        short s = 0;
        float f = 0.0f;
        int i2 = 0;
        int i3 = -1;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            switch (C1052a.m7215a(m7216a)) {
                case 1:
                    str = C1052a.m7238o(parcel, m7216a);
                    break;
                case 2:
                    j = C1052a.m7210C(parcel, m7216a);
                    break;
                case 3:
                    s = C1052a.m7212E(parcel, m7216a);
                    break;
                case 4:
                    d = C1052a.m7245v(parcel, m7216a);
                    break;
                case 5:
                    d2 = C1052a.m7245v(parcel, m7216a);
                    break;
                case 6:
                    f = C1052a.m7247x(parcel, m7216a);
                    break;
                case 7:
                    i = C1052a.m7208A(parcel, m7216a);
                    break;
                case 8:
                    i2 = C1052a.m7208A(parcel, m7216a);
                    break;
                case 9:
                    i3 = C1052a.m7208A(parcel, m7216a);
                    break;
                default:
                    C1052a.m7214G(parcel, m7216a);
                    break;
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new zzbh(str, i, s, d, d2, f, j, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbh[] newArray(int i) {
        return new zzbh[i];
    }
}
