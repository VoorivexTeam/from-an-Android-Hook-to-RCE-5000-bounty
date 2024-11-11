package com.google.android.gms.common.api.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000.ThreadFactoryC0431ap;

/* renamed from: com.google.android.gms.common.api.internal.r1 */
/* loaded from: classes.dex */
public final class C0945r1 {

    /* renamed from: a */
    private static final ExecutorService f5944a = new ThreadPoolExecutor(0, 4, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0431ap("GAC_Transform"));

    /* renamed from: a */
    public static ExecutorService m6851a() {
        return f5944a;
    }
}
