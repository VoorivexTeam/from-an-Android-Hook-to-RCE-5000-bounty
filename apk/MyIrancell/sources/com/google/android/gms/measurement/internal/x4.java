package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class x4 implements ServiceConnection {
    private final String a;
    final /* synthetic */ y4 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x4(y4 y4Var, String str) {
        this.b = y4Var;
        this.a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.b.a.k().w().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.k2 a = com.google.android.gms.internal.measurement.k5.a(iBinder);
            if (a == null) {
                this.b.a.k().w().a("Install Referrer Service implementation was not found");
            } else {
                this.b.a.k().B().a("Install Referrer Service connected");
                this.b.a.g().a(new a5(this, a, this));
            }
        } catch (Exception e) {
            this.b.a.k().w().a("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.b.a.k().B().a("Install Referrer Service disconnected");
    }
}
