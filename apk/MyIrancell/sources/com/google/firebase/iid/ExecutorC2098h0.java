package com.google.firebase.iid;

import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.iid.h0 */
/* loaded from: classes.dex */
final /* synthetic */ class ExecutorC2098h0 implements Executor {

    /* renamed from: a */
    static final Executor f8911a = new ExecutorC2098h0();

    private ExecutorC2098h0() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
