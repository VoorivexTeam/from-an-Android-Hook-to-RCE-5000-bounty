package com.google.firebase.iid;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class b {
    private static final Executor a = h0.a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ Thread a(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor b() {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), i0.a);
    }
}
