package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.stats.e */
/* loaded from: classes.dex */
public final class C1092e implements Parcelable.Creator<WakeLockEvent> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ WakeLockEvent createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        boolean z = false;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            switch (C1052a.m7215a(m7216a)) {
                case 1:
                    i = C1052a.m7208A(parcel, m7216a);
                    break;
                case 2:
                    j = C1052a.m7210C(parcel, m7216a);
                    break;
                case 3:
                case 7:
                case 9:
                default:
                    C1052a.m7214G(parcel, m7216a);
                    break;
                case 4:
                    str = C1052a.m7238o(parcel, m7216a);
                    break;
                case 5:
                    i3 = C1052a.m7208A(parcel, m7216a);
                    break;
                case 6:
                    arrayList = C1052a.m7240q(parcel, m7216a);
                    break;
                case 8:
                    j2 = C1052a.m7210C(parcel, m7216a);
                    break;
                case 10:
                    str3 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 11:
                    i2 = C1052a.m7208A(parcel, m7216a);
                    break;
                case 12:
                    str2 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 13:
                    str4 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 14:
                    i4 = C1052a.m7208A(parcel, m7216a);
                    break;
                case 15:
                    f = C1052a.m7247x(parcel, m7216a);
                    break;
                case 16:
                    j3 = C1052a.m7210C(parcel, m7216a);
                    break;
                case 17:
                    str5 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 18:
                    z = C1052a.m7242s(parcel, m7216a);
                    break;
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new WakeLockEvent(i, j, i2, str, i3, arrayList, str2, j2, i4, str3, str4, f, j3, str5, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ WakeLockEvent[] newArray(int i) {
        return new WakeLockEvent[i];
    }
}
