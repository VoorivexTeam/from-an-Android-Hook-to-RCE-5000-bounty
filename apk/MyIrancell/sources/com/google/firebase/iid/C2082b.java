package com.google.firebase.iid;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.b */
/* loaded from: classes.dex */
final class C2082b {

    /* renamed from: a */
    private static final Executor f8887a = ExecutorC2098h0.f8911a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static final /* synthetic */ Thread m10637a(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Executor m10638a() {
        return f8887a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Executor m10639b() {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), ThreadFactoryC2100i0.f8913a);
    }
}
