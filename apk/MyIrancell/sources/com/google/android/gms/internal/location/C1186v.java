package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;

/* renamed from: com.google.android.gms.internal.location.v */
/* loaded from: classes.dex */
public final class C1186v implements Parcelable.Creator<zzbf> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbf createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        zzbd zzbdVar = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        int i = 1;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            switch (C1052a.m7215a(m7216a)) {
                case 1:
                    i = C1052a.m7208A(parcel, m7216a);
                    break;
                case 2:
                    zzbdVar = (zzbd) C1052a.m7217a(parcel, m7216a, zzbd.CREATOR);
                    break;
                case 3:
                    iBinder = C1052a.m7249z(parcel, m7216a);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) C1052a.m7217a(parcel, m7216a, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = C1052a.m7249z(parcel, m7216a);
                    break;
                case 6:
                    iBinder3 = C1052a.m7249z(parcel, m7216a);
                    break;
                default:
                    C1052a.m7214G(parcel, m7216a);
                    break;
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new zzbf(i, zzbdVar, iBinder, pendingIntent, iBinder2, iBinder3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbf[] newArray(int i) {
        return new zzbf[i];
    }
}
