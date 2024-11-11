package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v2 implements n1 {
    private final /* synthetic */ r2 a;

    private v2(r2 r2Var) {
        this.a = r2Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ v2(r2 r2Var, u2 u2Var) {
        this(r2Var);
    }

    @Override // com.google.android.gms.common.api.internal.n1
    public final void a(int i, boolean z) {
        Lock lock;
        Lock lock2;
        boolean z2;
        z0 z0Var;
        lock = this.a.m;
        lock.lock();
        try {
            z2 = this.a.l;
            if (z2) {
                this.a.l = false;
                this.a.a(i, z);
            } else {
                this.a.l = true;
                z0Var = this.a.d;
                z0Var.a(i);
            }
        } finally {
            lock2 = this.a.m;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.n1
    public final void a(Bundle bundle) {
        Lock lock;
        Lock lock2;
        lock = this.a.m;
        lock.lock();
        try {
            this.a.k = ConnectionResult.f;
            this.a.h();
        } finally {
            lock2 = this.a.m;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.n1
    public final void a(ConnectionResult connectionResult) {
        Lock lock;
        Lock lock2;
        lock = this.a.m;
        lock.lock();
        try {
            this.a.k = connectionResult;
            this.a.h();
        } finally {
            lock2 = this.a.m;
            lock2.unlock();
        }
    }
}
