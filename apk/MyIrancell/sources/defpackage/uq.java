package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public interface uq {
    ExecutorService a(ThreadFactory threadFactory, int i);

    ScheduledExecutorService a(int i, ThreadFactory threadFactory, int i2);
}
