package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
final class n2 {
    private final int a;
    private final ConnectionResult b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n2(ConnectionResult connectionResult, int i) {
        com.google.android.gms.common.internal.u.a(connectionResult);
        this.b = connectionResult;
        this.a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ConnectionResult a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b() {
        return this.a;
    }
}
