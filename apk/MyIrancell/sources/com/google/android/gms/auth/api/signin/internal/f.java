package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import defpackage.t3;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class f extends t3<Void> implements com.google.android.gms.common.api.internal.o {
    private Semaphore p;
    private Set<com.google.android.gms.common.api.f> q;

    public f(Context context, Set<com.google.android.gms.common.api.f> set) {
        super(context);
        this.p = new Semaphore(0);
        this.q = set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // defpackage.t3
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final Void A() {
        Iterator<com.google.android.gms.common.api.f> it = this.q.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().a(this)) {
                i++;
            }
        }
        try {
            this.p.tryAcquire(i, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.o
    public final void a() {
        this.p.release();
    }

    @Override // defpackage.v3
    protected final void q() {
        this.p.drainPermits();
        f();
    }
}
