package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;
import java.util.HashSet;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.d */
/* loaded from: classes.dex */
public final class C0808d implements Parcelable.Creator<zzt> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzt createFromParcel(Parcel parcel) {
        int i;
        int m7222b = C1052a.m7222b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        byte[] bArr = null;
        PendingIntent pendingIntent = null;
        DeviceMetaData deviceMetaData = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            switch (C1052a.m7215a(m7216a)) {
                case 1:
                    i2 = C1052a.m7208A(parcel, m7216a);
                    i = 1;
                    break;
                case 2:
                    str = C1052a.m7238o(parcel, m7216a);
                    i = 2;
                    break;
                case 3:
                    i3 = C1052a.m7208A(parcel, m7216a);
                    i = 3;
                    break;
                case 4:
                    bArr = C1052a.m7230g(parcel, m7216a);
                    i = 4;
                    break;
                case 5:
                    pendingIntent = (PendingIntent) C1052a.m7217a(parcel, m7216a, PendingIntent.CREATOR);
                    i = 5;
                    break;
                case 6:
                    deviceMetaData = (DeviceMetaData) C1052a.m7217a(parcel, m7216a, DeviceMetaData.CREATOR);
                    i = 6;
                    break;
                default:
                    C1052a.m7214G(parcel, m7216a);
                    continue;
            }
            hashSet.add(Integer.valueOf(i));
        }
        if (parcel.dataPosition() == m7222b) {
            return new zzt(hashSet, i2, str, i3, bArr, pendingIntent, deviceMetaData);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(m7222b);
        throw new C1052a.a(sb.toString(), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzt[] newArray(int i) {
        return new zzt[i];
    }
}
