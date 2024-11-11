package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1053b;

/* loaded from: classes.dex */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new C0835c();

    /* renamed from: b */
    private final int f5624b;

    /* renamed from: c */
    private int f5625c;

    /* renamed from: d */
    private Bundle f5626d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInOptionsExtensionParcelable(int i, int i2, Bundle bundle) {
        this.f5624b = i;
        this.f5625c = i2;
        this.f5626d = bundle;
    }

    /* renamed from: j */
    public int m6432j() {
        return this.f5625c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m7250a = C1053b.m7250a(parcel);
        C1053b.m7255a(parcel, 1, this.f5624b);
        C1053b.m7255a(parcel, 2, m6432j());
        C1053b.m7257a(parcel, 3, this.f5626d, false);
        C1053b.m7251a(parcel, m7250a);
    }
}
