package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h5<V> extends FutureTask<V> implements Comparable<h5<V>> {
    private final long b;
    final boolean c;
    private final String d;
    private final /* synthetic */ g5 e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(g5 g5Var, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.e = g5Var;
        com.google.android.gms.common.internal.u.a(str);
        atomicLong = g5.l;
        long andIncrement = atomicLong.getAndIncrement();
        this.b = andIncrement;
        this.d = str;
        this.c = false;
        if (andIncrement == Long.MAX_VALUE) {
            g5Var.k().t().a("Tasks index overflow");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(g5 g5Var, Callable<V> callable, boolean z, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.e = g5Var;
        com.google.android.gms.common.internal.u.a(str);
        atomicLong = g5.l;
        long andIncrement = atomicLong.getAndIncrement();
        this.b = andIncrement;
        this.d = str;
        this.c = z;
        if (andIncrement == Long.MAX_VALUE) {
            g5Var.k().t().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        h5 h5Var = (h5) obj;
        boolean z = this.c;
        if (z != h5Var.c) {
            return z ? -1 : 1;
        }
        long j = this.b;
        long j2 = h5Var.b;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.e.k().u().a("Two tasks share the same index. index", Long.valueOf(this.b));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.e.k().t().a(this.d, th);
        super.setException(th);
    }
}
