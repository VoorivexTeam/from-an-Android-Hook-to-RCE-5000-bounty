package com.google.android.gms.signin.internal;

import android.os.IInterface;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public interface c extends IInterface {
    void a(ConnectionResult connectionResult, zab zabVar);

    void a(Status status);

    void a(Status status, GoogleSignInAccount googleSignInAccount);

    void a(zak zakVar);

    void e(Status status);
}
