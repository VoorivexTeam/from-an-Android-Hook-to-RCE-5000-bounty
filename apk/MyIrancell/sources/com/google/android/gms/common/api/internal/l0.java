package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.f;
import defpackage.yr;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
final class l0 implements f.b, f.c {
    private final /* synthetic */ e0 a;

    private l0(e0 e0Var) {
        this.a = e0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ l0(e0 e0Var, d0 d0Var) {
        this(e0Var);
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void a(int i) {
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final void a(ConnectionResult connectionResult) {
        Lock lock;
        Lock lock2;
        boolean a;
        lock = this.a.b;
        lock.lock();
        try {
            a = this.a.a(connectionResult);
            if (a) {
                this.a.g();
                this.a.e();
            } else {
                this.a.b(connectionResult);
            }
        } finally {
            lock2 = this.a.b;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void b(Bundle bundle) {
        com.google.android.gms.common.internal.e eVar;
        yr yrVar;
        Lock lock;
        Lock lock2;
        yr yrVar2;
        yr yrVar3;
        eVar = this.a.r;
        if (!eVar.k()) {
            yrVar = this.a.k;
            yrVar.a(new j0(this.a));
            return;
        }
        lock = this.a.b;
        lock.lock();
        try {
            yrVar2 = this.a.k;
            if (yrVar2 == null) {
                return;
            }
            yrVar3 = this.a.k;
            yrVar3.a(new j0(this.a));
        } finally {
            lock2 = this.a.b;
            lock2.unlock();
        }
    }
}
