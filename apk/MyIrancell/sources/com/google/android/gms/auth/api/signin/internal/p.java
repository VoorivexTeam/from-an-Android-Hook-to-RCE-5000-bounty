package com.google.android.gms.auth.api.signin.internal;

import android.os.IInterface;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public interface p extends IInterface {
    void a(GoogleSignInAccount googleSignInAccount, Status status);

    void b(Status status);

    void d(Status status);
}
