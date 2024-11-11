package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1052a;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.server.converter.c */
/* loaded from: classes.dex */
public final class C1081c implements Parcelable.Creator<StringToIntConverter> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ StringToIntConverter createFromParcel(Parcel parcel) {
        int m7222b = C1052a.m7222b(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < m7222b) {
            int m7216a = C1052a.m7216a(parcel);
            int m7215a = C1052a.m7215a(m7216a);
            if (m7215a == 1) {
                i = C1052a.m7208A(parcel, m7216a);
            } else if (m7215a != 2) {
                C1052a.m7214G(parcel, m7216a);
            } else {
                arrayList = C1052a.m7226c(parcel, m7216a, StringToIntConverter.zaa.CREATOR);
            }
        }
        C1052a.m7241r(parcel, m7222b);
        return new StringToIntConverter(i, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ StringToIntConverter[] newArray(int i) {
        return new StringToIntConverter[i];
    }
}
