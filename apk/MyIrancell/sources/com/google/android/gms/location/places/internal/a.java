package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator<PlaceEntity> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PlaceEntity createFromParcel(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        String str = null;
        ArrayList<Integer> arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ArrayList<String> arrayList2 = null;
        LatLng latLng = null;
        LatLngBounds latLngBounds = null;
        String str5 = null;
        Uri uri = null;
        zzal zzalVar = null;
        zzai zzaiVar = null;
        String str6 = null;
        float f = 0.0f;
        boolean z = false;
        float f2 = 0.0f;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    str = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                case 2:
                case 3:
                case 12:
                case 13:
                case 16:
                case 18:
                default:
                    com.google.android.gms.common.internal.safeparcel.a.G(parcel, a);
                    break;
                case 4:
                    latLng = (LatLng) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, LatLng.CREATOR);
                    break;
                case 5:
                    f = com.google.android.gms.common.internal.safeparcel.a.x(parcel, a);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, LatLngBounds.CREATOR);
                    break;
                case 7:
                    str5 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                case 8:
                    uri = (Uri) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, Uri.CREATOR);
                    break;
                case 9:
                    z = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
                    break;
                case 10:
                    f2 = com.google.android.gms.common.internal.safeparcel.a.x(parcel, a);
                    break;
                case 11:
                    i = com.google.android.gms.common.internal.safeparcel.a.A(parcel, a);
                    break;
                case 14:
                    str3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                case 15:
                    str4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                case 17:
                    arrayList2 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 19:
                    str2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
                case 20:
                    arrayList = com.google.android.gms.common.internal.safeparcel.a.k(parcel, a);
                    break;
                case 21:
                    zzalVar = (zzal) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, zzal.CREATOR);
                    break;
                case 22:
                    zzaiVar = (zzai) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, zzai.CREATOR);
                    break;
                case 23:
                    str6 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, a);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.a.r(parcel, b);
        return new PlaceEntity(str, arrayList, str2, str3, str4, arrayList2, latLng, f, latLngBounds, str5, uri, z, f2, i, zzalVar, zzaiVar, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PlaceEntity[] newArray(int i) {
        return new PlaceEntity[i];
    }
}
