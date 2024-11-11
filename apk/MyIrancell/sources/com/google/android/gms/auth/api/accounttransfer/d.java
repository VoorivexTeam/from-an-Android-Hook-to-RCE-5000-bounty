package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class d implements Parcelable.Creator<zzt> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzt createFromParcel(Parcel parcel) {
        int i;
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        byte[] bArr = null;
        PendingIntent pendingIntent = null;
        DeviceMetaData deviceMetaData = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    i2 = com.google.android.gms.common.internal.safeparcel.a.A(parcel, a);
                    i = 1;
                    break;
                case 2:
                    str = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    i = 2;
                    break;
                case 3:
                    i3 = com.google.android.gms.common.internal.safeparcel.a.A(parcel, a);
                    i = 3;
                    break;
                case 4:
                    bArr = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    i = 4;
                    break;
                case 5:
                    pendingIntent = (PendingIntent) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, PendingIntent.CREATOR);
                    i = 5;
                    break;
                case 6:
                    deviceMetaData = (DeviceMetaData) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, DeviceMetaData.CREATOR);
                    i = 6;
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.G(parcel, a);
                    continue;
            }
            hashSet.add(Integer.valueOf(i));
        }
        if (parcel.dataPosition() == b) {
            return new zzt(hashSet, i2, str, i3, bArr, pendingIntent, deviceMetaData);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new a.C0047a(sb.toString(), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzt[] newArray(int i) {
        return new zzt[i];
    }
}
