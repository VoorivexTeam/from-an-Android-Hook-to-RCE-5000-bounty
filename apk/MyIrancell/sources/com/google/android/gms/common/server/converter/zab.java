package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* loaded from: classes.dex */
public final class zab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zab> CREATOR = new C1079a();

    /* renamed from: b */
    private final int f6301b;

    /* renamed from: c */
    private final StringToIntConverter f6302c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zab(int i, StringToIntConverter stringToIntConverter) {
        this.f6301b = i;
        this.f6302c = stringToIntConverter;
    }

    private zab(StringToIntConverter stringToIntConverter) {
        this.f6301b = 1;
        this.f6302c = stringToIntConverter;
    }

    /* renamed from: a */
    public static zab m7317a(FastJsonResponse.InterfaceC1082a<?, ?> interfaceC1082a) {
        if (interfaceC1082a instanceof StringToIntConverter) {
            return new zab((StringToIntConverter) interfaceC1082a);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    /* renamed from: j */
    public final FastJsonResponse.InterfaceC1082a<?, ?> m7318j() {
        StringToIntConverter stringToIntConverter = this.f6302c;
        if (stringToIntConverter != null) {
            return stringToIntConverter;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f6301b);
        C1053b.m7260a(parcel, 2, (Parcelable) this.f6302c, i, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
