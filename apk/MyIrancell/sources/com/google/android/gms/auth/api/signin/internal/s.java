package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* loaded from: classes.dex */
public final class s extends com.google.android.gms.internal.p000authapi.a implements r {
    /* JADX INFO: Access modifiers changed from: package-private */
    public s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.auth.api.signin.internal.r
    public final void a(p pVar, GoogleSignInOptions googleSignInOptions) {
        Parcel a = a();
        com.google.android.gms.internal.p000authapi.c.a(a, pVar);
        com.google.android.gms.internal.p000authapi.c.a(a, googleSignInOptions);
        a(103, a);
    }
}
