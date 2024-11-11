package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public class SignInButtonConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInButtonConfig> CREATOR = new C1031i0();

    /* renamed from: b */
    private final int f6139b;

    /* renamed from: c */
    private final int f6140c;

    /* renamed from: d */
    private final int f6141d;

    /* renamed from: e */
    @Deprecated
    private final Scope[] f6142e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SignInButtonConfig(int i, int i2, int i3, Scope[] scopeArr) {
        this.f6139b = i;
        this.f6140c = i2;
        this.f6141d = i3;
        this.f6142e = scopeArr;
    }

    /* renamed from: j */
    public int m7038j() {
        return this.f6140c;
    }

    /* renamed from: k */
    public int m7039k() {
        return this.f6141d;
    }

    @Deprecated
    /* renamed from: l */
    public Scope[] m7040l() {
        return this.f6142e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f6139b);
        C1053b.m7255a(parcel, 2, m7038j());
        C1053b.m7255a(parcel, 3, m7039k());
        C1053b.m7271a(parcel, 4, (Parcelable[]) m7040l(), i, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
