package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.location.places.internal.a */
/* loaded from: classes.dex */
public final class C1610a implements Parcelable.Creator<PlaceEntity> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PlaceEntity createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
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
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            switch (C1052a.m7215a(m7216a)) {
                case 1:
                    str = C1052a.m7238o(parcel, m7216a);
                    break;
                case 2:
                case 3:
                case 12:
                case 13:
                case 16:
                case 18:
                default:
                    C1052a.m7214G(parcel, m7216a);
                    break;
                case 4:
                    latLng = (LatLng) C1052a.m7217a(parcel, m7216a, LatLng.CREATOR);
                    break;
                case 5:
                    f = C1052a.m7247x(parcel, m7216a);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) C1052a.m7217a(parcel, m7216a, LatLngBounds.CREATOR);
                    break;
                case 7:
                    str5 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 8:
                    uri = (Uri) C1052a.m7217a(parcel, m7216a, Uri.CREATOR);
                    break;
                case 9:
                    z = C1052a.m7242s(parcel, m7216a);
                    break;
                case 10:
                    f2 = C1052a.m7247x(parcel, m7216a);
                    break;
                case 11:
                    i = C1052a.m7208A(parcel, m7216a);
                    break;
                case 14:
                    str3 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 15:
                    str4 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 17:
                    arrayList2 = C1052a.m7240q(parcel, m7216a);
                    break;
                case 19:
                    str2 = C1052a.m7238o(parcel, m7216a);
                    break;
                case 20:
                    arrayList = C1052a.m7234k(parcel, m7216a);
                    break;
                case 21:
                    zzalVar = (zzal) C1052a.m7217a(parcel, m7216a, zzal.CREATOR);
                    break;
                case 22:
                    zzaiVar = (zzai) C1052a.m7217a(parcel, m7216a, zzai.CREATOR);
                    break;
                case 23:
                    str6 = C1052a.m7238o(parcel, m7216a);
                    break;
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new PlaceEntity(str, arrayList, str2, str3, str4, arrayList2, latLng, f, latLngBounds, str5, uri, z, f2, i, zzalVar, zzaiVar, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PlaceEntity[] newArray(int i) {
        return new PlaceEntity[i];
    }
}
