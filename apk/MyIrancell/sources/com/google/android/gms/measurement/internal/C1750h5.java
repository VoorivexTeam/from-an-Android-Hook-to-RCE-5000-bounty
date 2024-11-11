package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1057u;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.h5 */
/* loaded from: classes.dex */
public final class C1750h5<V> extends FutureTask<V> implements Comparable<C1750h5<V>> {

    /* renamed from: b */
    private final long f7593b;

    /* renamed from: c */
    final boolean f7594c;

    /* renamed from: d */
    private final String f7595d;

    /* renamed from: e */
    private final /* synthetic */ C1738g5 f7596e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1750h5(C1738g5 c1738g5, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.f7596e = c1738g5;
        C1057u.m7286a(str);
        atomicLong = C1738g5.f7566l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f7593b = andIncrement;
        this.f7595d = str;
        this.f7594c = false;
        if (andIncrement == Long.MAX_VALUE) {
            c1738g5.mo9324k().m9309t().m9365a("Tasks index overflow");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1750h5(C1738g5 c1738g5, Callable<V> callable, boolean z, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.f7596e = c1738g5;
        C1057u.m7286a(str);
        atomicLong = C1738g5.f7566l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f7593b = andIncrement;
        this.f7595d = str;
        this.f7594c = z;
        if (andIncrement == Long.MAX_VALUE) {
            c1738g5.mo9324k().m9309t().m9365a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        C1750h5 c1750h5 = (C1750h5) obj;
        boolean z = this.f7594c;
        if (z != c1750h5.f7594c) {
            return z ? -1 : 1;
        }
        long j = this.f7593b;
        long j2 = c1750h5.f7593b;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.f7596e.mo9324k().m9310u().m9366a("Two tasks share the same index. index", Long.valueOf(this.f7593b));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.f7596e.mo9324k().m9309t().m9366a(this.f7595d, th);
        super.setException(th);
    }
}
