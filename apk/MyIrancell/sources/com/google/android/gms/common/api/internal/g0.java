package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.d;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
final class g0 implements d.c {
    private final WeakReference<e0> a;
    private final com.google.android.gms.common.api.a<?> b;
    private final boolean c;

    public g0(e0 e0Var, com.google.android.gms.common.api.a<?> aVar, boolean z) {
        this.a = new WeakReference<>(e0Var);
        this.b = aVar;
        this.c = z;
    }

    @Override // com.google.android.gms.common.internal.d.c
    public final void a(ConnectionResult connectionResult) {
        z0 z0Var;
        Lock lock;
        Lock lock2;
        boolean b;
        boolean d;
        e0 e0Var = this.a.get();
        if (e0Var == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        z0Var = e0Var.a;
        com.google.android.gms.common.internal.u.b(myLooper == z0Var.n.f(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        lock = e0Var.b;
        lock.lock();
        try {
            b = e0Var.b(0);
            if (b) {
                if (!connectionResult.n()) {
                    e0Var.b(connectionResult, this.b, this.c);
                }
                d = e0Var.d();
                if (d) {
                    e0Var.e();
                }
            }
        } finally {
            lock2 = e0Var.b;
            lock2.unlock();
        }
    }
}
