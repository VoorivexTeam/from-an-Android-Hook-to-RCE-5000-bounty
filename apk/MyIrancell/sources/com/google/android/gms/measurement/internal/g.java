package com.google.android.gms.measurement.internal;

import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class g {
    private static volatile Handler d;
    private final h6 a;
    private final Runnable b;
    private volatile long c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(h6 h6Var) {
        com.google.android.gms.common.internal.u.a(h6Var);
        this.a = h6Var;
        this.b = new j(this, h6Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ long a(g gVar, long j) {
        gVar.c = 0L;
        return 0L;
    }

    private final Handler d() {
        Handler handler;
        if (d != null) {
            return d;
        }
        synchronized (g.class) {
            if (d == null) {
                d = new com.google.android.gms.internal.measurement.l8(this.a.l().getMainLooper());
            }
            handler = d;
        }
        return handler;
    }

    public abstract void a();

    public final void a(long j) {
        c();
        if (j >= 0) {
            this.c = this.a.h().a();
            if (d().postDelayed(this.b, j)) {
                return;
            }
            this.a.k().t().a("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    public final boolean b() {
        return this.c != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.c = 0L;
        d().removeCallbacks(this.b);
    }
}
