package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.s1 */
/* loaded from: classes.dex */
public final class RunnableC0949s1 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ BinderC0953t1 f5962b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0949s1(BinderC0953t1 binderC0953t1) {
        this.f5962b = binderC0953t1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0957u1 interfaceC0957u1;
        interfaceC0957u1 = this.f5962b.f5972g;
        interfaceC0957u1.mo6765b(new ConnectionResult(4));
    }
}
