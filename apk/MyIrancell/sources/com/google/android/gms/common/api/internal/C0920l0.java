package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC0864f;
import com.google.android.gms.common.internal.C1022e;
import java.util.concurrent.locks.Lock;
import p000.InterfaceC3497yr;

/* renamed from: com.google.android.gms.common.api.internal.l0 */
/* loaded from: classes.dex */
final class C0920l0 implements AbstractC0864f.b, AbstractC0864f.c {

    /* renamed from: a */
    private final /* synthetic */ C0891e0 f5887a;

    private C0920l0(C0891e0 c0891e0) {
        this.f5887a = c0891e0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C0920l0(C0891e0 c0891e0, RunnableC0886d0 runnableC0886d0) {
        this(c0891e0);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0895f
    /* renamed from: a */
    public final void mo6688a(int i) {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0923m
    /* renamed from: a */
    public final void mo6740a(ConnectionResult connectionResult) {
        Lock lock;
        Lock lock2;
        boolean m6649a;
        lock = this.f5887a.f5775b;
        lock.lock();
        try {
            m6649a = this.f5887a.m6649a(connectionResult);
            if (m6649a) {
                this.f5887a.m6665g();
                this.f5887a.m6660e();
            } else {
                this.f5887a.m6652b(connectionResult);
            }
        } finally {
            lock2 = this.f5887a.f5775b;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0895f
    /* renamed from: b */
    public final void mo6689b(Bundle bundle) {
        C1022e c1022e;
        InterfaceC3497yr interfaceC3497yr;
        Lock lock;
        Lock lock2;
        InterfaceC3497yr interfaceC3497yr2;
        InterfaceC3497yr interfaceC3497yr3;
        c1022e = this.f5887a.f5791r;
        if (!c1022e.m7127k()) {
            interfaceC3497yr = this.f5887a.f5784k;
            interfaceC3497yr.mo9973a(new BinderC0912j0(this.f5887a));
            return;
        }
        lock = this.f5887a.f5775b;
        lock.lock();
        try {
            interfaceC3497yr2 = this.f5887a.f5784k;
            if (interfaceC3497yr2 == null) {
                return;
            }
            interfaceC3497yr3 = this.f5887a.f5784k;
            interfaceC3497yr3.mo9973a(new BinderC0912j0(this.f5887a));
        } finally {
            lock2 = this.f5887a.f5775b;
            lock2.unlock();
        }
    }
}
