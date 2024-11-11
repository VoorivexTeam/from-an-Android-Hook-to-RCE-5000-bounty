package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t2 implements n1 {
    private final /* synthetic */ r2 a;

    private t2(r2 r2Var) {
        this.a = r2Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ t2(r2 r2Var, u2 u2Var) {
        this(r2Var);
    }

    @Override // com.google.android.gms.common.api.internal.n1
    public final void a(int i, boolean z) {
        Lock lock;
        Lock lock2;
        boolean z2;
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        z0 z0Var;
        lock = this.a.m;
        lock.lock();
        try {
            z2 = this.a.l;
            if (!z2) {
                connectionResult = this.a.k;
                if (connectionResult != null) {
                    connectionResult2 = this.a.k;
                    if (connectionResult2.n()) {
                        this.a.l = true;
                        z0Var = this.a.e;
                        z0Var.a(i);
                    }
                }
            }
            this.a.l = false;
            this.a.a(i, z);
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
            this.a.a(bundle);
            this.a.j = ConnectionResult.f;
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
            this.a.j = connectionResult;
            this.a.h();
        } finally {
            lock2 = this.a.m;
            lock2.unlock();
        }
    }
}
