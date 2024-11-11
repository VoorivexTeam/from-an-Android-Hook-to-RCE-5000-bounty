package com.google.firebase.iid;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.i0 */
/* loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC2100i0 implements ThreadFactory {

    /* renamed from: a */
    static final ThreadFactory f8913a = new ThreadFactoryC2100i0();

    private ThreadFactoryC2100i0() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return C2082b.m10637a(runnable);
    }
}
