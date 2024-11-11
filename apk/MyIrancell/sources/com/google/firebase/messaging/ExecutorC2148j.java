package com.google.firebase.messaging;

import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.j */
/* loaded from: classes.dex */
final /* synthetic */ class ExecutorC2148j implements Executor {

    /* renamed from: a */
    static final Executor f9025a = new ExecutorC2148j();

    private ExecutorC2148j() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
