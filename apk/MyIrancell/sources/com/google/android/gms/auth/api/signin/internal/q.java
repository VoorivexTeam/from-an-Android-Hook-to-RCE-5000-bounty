package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class q extends com.google.android.gms.internal.p000authapi.b implements p {
    public q() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.p000authapi.b
    protected final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 101:
                a((GoogleSignInAccount) com.google.android.gms.internal.p000authapi.c.a(parcel, GoogleSignInAccount.CREATOR), (Status) com.google.android.gms.internal.p000authapi.c.a(parcel, Status.CREATOR));
                throw null;
            case 102:
                b((Status) com.google.android.gms.internal.p000authapi.c.a(parcel, Status.CREATOR));
                throw null;
            case 103:
                d((Status) com.google.android.gms.internal.p000authapi.c.a(parcel, Status.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
