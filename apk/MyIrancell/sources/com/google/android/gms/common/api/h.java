package com.google.android.gms.common.api;

import com.google.android.gms.common.api.m;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class h<R extends m> {

    /* loaded from: classes.dex */
    public interface a {
        void a(Status status);
    }

    public abstract R a(long j, TimeUnit timeUnit);

    public abstract void a(a aVar);

    public abstract void a(n<? super R> nVar);
}
