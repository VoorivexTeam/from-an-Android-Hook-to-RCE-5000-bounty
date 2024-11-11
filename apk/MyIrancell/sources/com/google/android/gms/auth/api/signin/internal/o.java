package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class o extends com.google.android.gms.internal.p000authapi.b implements n {
    public o() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // com.google.android.gms.internal.p000authapi.b
    protected final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            m();
        } else {
            if (i != 2) {
                return false;
            }
            n();
        }
        return true;
    }
}
