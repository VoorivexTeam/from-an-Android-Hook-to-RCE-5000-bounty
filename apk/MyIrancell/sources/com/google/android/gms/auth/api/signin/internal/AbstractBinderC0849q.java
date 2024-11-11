package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p003authapi.BinderC1140b;
import com.google.android.gms.internal.p003authapi.C1141c;

/* renamed from: com.google.android.gms.auth.api.signin.internal.q */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0849q extends BinderC1140b implements InterfaceC0848p {
    public AbstractBinderC0849q() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.p003authapi.BinderC1140b
    /* renamed from: a */
    protected final boolean mo6480a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 101:
                mo6454a((GoogleSignInAccount) C1141c.m7463a(parcel, GoogleSignInAccount.CREATOR), (Status) C1141c.m7463a(parcel, Status.CREATOR));
                throw null;
            case 102:
                mo6455b((Status) C1141c.m7463a(parcel, Status.CREATOR));
                throw null;
            case 103:
                mo6473d((Status) C1141c.m7463a(parcel, Status.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
