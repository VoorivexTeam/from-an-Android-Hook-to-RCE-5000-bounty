package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.g;

/* loaded from: classes.dex */
final class e1 implements Runnable {
    private final /* synthetic */ ConnectionResult b;
    private final /* synthetic */ g.a c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e1(g.a aVar, ConnectionResult connectionResult) {
        this.c = aVar;
        this.b = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a(this.b);
    }
}
