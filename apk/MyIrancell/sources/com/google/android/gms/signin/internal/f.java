package com.google.android.gms.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import defpackage.aq;
import defpackage.cq;

/* loaded from: classes.dex */
public abstract class f extends aq implements c {
    public f() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // defpackage.aq
    protected boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 3) {
            a((ConnectionResult) cq.a(parcel, ConnectionResult.CREATOR), (zab) cq.a(parcel, zab.CREATOR));
        } else if (i == 4) {
            e((Status) cq.a(parcel, Status.CREATOR));
        } else if (i == 6) {
            a((Status) cq.a(parcel, Status.CREATOR));
        } else if (i == 7) {
            a((Status) cq.a(parcel, Status.CREATOR), (GoogleSignInAccount) cq.a(parcel, GoogleSignInAccount.CREATOR));
        } else {
            if (i != 8) {
                return false;
            }
            a((zak) cq.a(parcel, zak.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
