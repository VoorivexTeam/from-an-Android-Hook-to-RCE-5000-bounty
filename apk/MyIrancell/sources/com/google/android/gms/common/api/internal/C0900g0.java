package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.internal.AbstractC1020d;
import com.google.android.gms.common.internal.C1057u;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.g0 */
/* loaded from: classes.dex */
final class C0900g0 implements AbstractC1020d.c {

    /* renamed from: a */
    private final WeakReference<C0891e0> f5844a;

    /* renamed from: b */
    private final C0859a<?> f5845b;

    /* renamed from: c */
    private final boolean f5846c;

    public C0900g0(C0891e0 c0891e0, C0859a<?> c0859a, boolean z) {
        this.f5844a = new WeakReference<>(c0891e0);
        this.f5845b = c0859a;
        this.f5846c = z;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1020d.c
    /* renamed from: a */
    public final void mo6763a(ConnectionResult connectionResult) {
        C0976z0 c0976z0;
        Lock lock;
        Lock lock2;
        boolean m6654b;
        boolean m6659d;
        C0891e0 c0891e0 = this.f5844a.get();
        if (c0891e0 == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        c0976z0 = c0891e0.f5774a;
        C1057u.m7298b(myLooper == c0976z0.f6037n.mo6563f(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        lock = c0891e0.f5775b;
        lock.lock();
        try {
            m6654b = c0891e0.m6654b(0);
            if (m6654b) {
                if (!connectionResult.m6488n()) {
                    c0891e0.m6653b(connectionResult, this.f5845b, this.f5846c);
                }
                m6659d = c0891e0.m6659d();
                if (m6659d) {
                    c0891e0.m6660e();
                }
            }
        } finally {
            lock2 = c0891e0.f5775b;
            lock2.unlock();
        }
    }
}
