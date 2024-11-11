package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class x8 extends c3 {
    private Handler c;
    protected i9 d;
    protected g9 e;
    private c9 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x8(j5 j5Var) {
        super(j5Var);
        this.d = new i9(this);
        this.e = new g9(this);
        this.f = new c9(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        c();
        if (this.c == null) {
            this.c = new com.google.android.gms.internal.measurement.l8(Looper.getMainLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(long j) {
        c();
        C();
        k().B().a("Activity resumed, time", Long.valueOf(j));
        this.f.a();
        this.e.a(j);
        i9 i9Var = this.d;
        i9Var.a.c();
        if (i9Var.a.a.c()) {
            if (i9Var.a.m().a(o.S)) {
                i9Var.a.j().y.a(false);
            }
            i9Var.a(i9Var.a.h().a(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(long j) {
        c();
        C();
        k().B().a("Activity paused, time", Long.valueOf(j));
        this.f.b();
        this.e.b(j);
        i9 i9Var = this.d;
        if (i9Var.a.m().a(o.S)) {
            i9Var.a.j().y.a(true);
        }
    }

    @Override // com.google.android.gms.measurement.internal.c3
    protected final boolean A() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void B() {
        g().a(new a9(this, h().b()));
    }

    public final boolean a(boolean z, boolean z2, long j) {
        return this.e.a(z, z2, j);
    }
}
