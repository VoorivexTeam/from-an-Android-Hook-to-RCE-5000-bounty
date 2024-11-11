package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u6 implements Runnable {
    private final /* synthetic */ Bundle b;
    private final /* synthetic */ p6 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u6(p6 p6Var, Bundle bundle) {
        this.c = p6Var;
        this.b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.c(this.b);
    }
}
