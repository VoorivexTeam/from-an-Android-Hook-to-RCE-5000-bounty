package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.common.api.AbstractC0864f;
import com.google.android.gms.common.api.internal.InterfaceC0931o;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p000.AbstractC3233t3;

/* renamed from: com.google.android.gms.auth.api.signin.internal.f */
/* loaded from: classes.dex */
public final class C0838f extends AbstractC3233t3<Void> implements InterfaceC0931o {

    /* renamed from: p */
    private Semaphore f5645p;

    /* renamed from: q */
    private Set<AbstractC0864f> f5646q;

    public C0838f(Context context, Set<AbstractC0864f> set) {
        super(context);
        this.f5645p = new Semaphore(0);
        this.f5646q = set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // p000.AbstractC3233t3
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final Void mo6458A() {
        Iterator<AbstractC0864f> it = this.f5646q.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().mo6556a(this)) {
                i++;
            }
        }
        try {
            this.f5645p.tryAcquire(i, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0931o
    /* renamed from: a */
    public final void mo6459a() {
        this.f5645p.release();
    }

    @Override // p000.C3329v3
    /* renamed from: q */
    protected final void mo6460q() {
        this.f5645p.drainPermits();
        m15906f();
    }
}
