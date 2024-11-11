package com.google.android.gms.identity.intents;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.List;

/* loaded from: classes.dex */
public final class UserAddressRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddressRequest> CREATOR = new C1136a();

    /* renamed from: b */
    List<CountrySpecification> f6392b;

    UserAddressRequest() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UserAddressRequest(List<CountrySpecification> list) {
        this.f6392b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7279d(parcel, 2, this.f6392b, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
