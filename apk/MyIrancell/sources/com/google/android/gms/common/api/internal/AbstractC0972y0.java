package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.y0 */
/* loaded from: classes.dex */
public abstract class AbstractC0972y0 {

    /* renamed from: a */
    private final InterfaceC0964w0 f6020a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0972y0(InterfaceC0964w0 interfaceC0964w0) {
        this.f6020a = interfaceC0964w0;
    }

    /* renamed from: a */
    protected abstract void mo6618a();

    /* renamed from: a */
    public final void m6927a(C0976z0 c0976z0) {
        Lock lock;
        Lock lock2;
        InterfaceC0964w0 interfaceC0964w0;
        lock = c0976z0.f6024a;
        lock.lock();
        try {
            interfaceC0964w0 = c0976z0.f6034k;
            if (interfaceC0964w0 == this.f6020a) {
                mo6618a();
            }
        } finally {
            lock2 = c0976z0.f6024a;
            lock2.unlock();
        }
    }
}
