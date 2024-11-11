package com.google.android.gms.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import p000.BinderC0432aq;
import p000.C2355cq;

/* renamed from: com.google.android.gms.signin.internal.f */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1965f extends BinderC0432aq implements InterfaceC1962c {
    public AbstractBinderC1965f() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // p000.BinderC0432aq
    /* renamed from: a */
    protected boolean mo3179a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 3) {
            mo9976a((ConnectionResult) C2355cq.m11206a(parcel, ConnectionResult.CREATOR), (zab) C2355cq.m11206a(parcel, zab.CREATOR));
        } else if (i == 4) {
            mo9979e((Status) C2355cq.m11206a(parcel, Status.CREATOR));
        } else if (i == 6) {
            mo9977a((Status) C2355cq.m11206a(parcel, Status.CREATOR));
        } else if (i == 7) {
            mo9978a((Status) C2355cq.m11206a(parcel, Status.CREATOR), (GoogleSignInAccount) C2355cq.m11206a(parcel, GoogleSignInAccount.CREATOR));
        } else {
            if (i != 8) {
                return false;
            }
            mo6780a((zak) C2355cq.m11206a(parcel, zak.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
