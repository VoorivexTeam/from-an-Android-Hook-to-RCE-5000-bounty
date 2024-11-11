package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public class CountrySpecification extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CountrySpecification> CREATOR = new C1137a();

    /* renamed from: b */
    private String f6393b;

    public CountrySpecification(String str) {
        this.f6393b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7266a(parcel, 2, this.f6393b, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
