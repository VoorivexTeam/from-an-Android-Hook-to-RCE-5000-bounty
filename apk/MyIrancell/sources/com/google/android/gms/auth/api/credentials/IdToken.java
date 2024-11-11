package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1050s;
import com.google.android.gms.common.internal.C1057u;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = new C0818f();

    /* renamed from: b */
    private final String f5566b;

    /* renamed from: c */
    private final String f5567c;

    public IdToken(String str, String str2) {
        C1057u.m7294a(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        C1057u.m7294a(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.f5566b = str;
        this.f5567c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        return C1050s.m7205a(this.f5566b, idToken.f5566b) && C1050s.m7205a(this.f5567c, idToken.f5567c);
    }

    /* renamed from: j */
    public final String m6384j() {
        return this.f5566b;
    }

    /* renamed from: k */
    public final String m6385k() {
        return this.f5567c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7266a(parcel, 1, m6384j(), false);
        C1053b.m7266a(parcel, 2, m6385k(), false);
        C1053b.m7251a(parcel, m7250a);
    }
}
