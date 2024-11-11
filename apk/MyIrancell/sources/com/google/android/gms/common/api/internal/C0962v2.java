package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.v2 */
/* loaded from: classes.dex */
public final class C0962v2 implements InterfaceC0929n1 {

    /* renamed from: a */
    private final /* synthetic */ C0946r2 f5985a;

    private C0962v2(C0946r2 c0946r2) {
        this.f5985a = c0946r2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C0962v2(C0946r2 c0946r2, RunnableC0958u2 runnableC0958u2) {
        this(c0946r2);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0929n1
    /* renamed from: a */
    public final void mo6820a(int i, boolean z) {
        Lock lock;
        Lock lock2;
        boolean z2;
        C0976z0 c0976z0;
        lock = this.f5985a.f5957m;
        lock.lock();
        try {
            z2 = this.f5985a.f5956l;
            if (z2) {
                this.f5985a.f5956l = false;
                this.f5985a.m6855a(i, z);
            } else {
                this.f5985a.f5956l = true;
                c0976z0 = this.f5985a.f5948d;
                c0976z0.mo6688a(i);
            }
        } finally {
            lock2 = this.f5985a.f5957m;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0929n1
    /* renamed from: a */
    public final void mo6821a(Bundle bundle) {
        Lock lock;
        Lock lock2;
        lock = this.f5985a.f5957m;
        lock.lock();
        try {
            this.f5985a.f5955k = ConnectionResult.f5655f;
            this.f5985a.m6869h();
        } finally {
            lock2 = this.f5985a.f5957m;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0929n1
    /* renamed from: a */
    public final void mo6822a(ConnectionResult connectionResult) {
        Lock lock;
        Lock lock2;
        lock = this.f5985a.f5957m;
        lock.lock();
        try {
            this.f5985a.f5955k = connectionResult;
            this.f5985a.m6869h();
        } finally {
            lock2 = this.f5985a.f5957m;
            lock2.unlock();
        }
    }
}
