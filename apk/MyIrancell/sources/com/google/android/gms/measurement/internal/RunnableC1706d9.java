package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.d9 */
/* loaded from: classes.dex */
public final class RunnableC1706d9 implements Runnable {

    /* renamed from: b */
    long f7472b;

    /* renamed from: c */
    final /* synthetic */ C1694c9 f7473c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1706d9(C1694c9 c1694c9, long j) {
        this.f7473c = c1694c9;
        this.f7472b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7473c.f7437c.mo9320g().m9344a(new Runnable(this) { // from class: com.google.android.gms.measurement.internal.h9

            /* renamed from: b */
            private final RunnableC1706d9 f7604b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f7604b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                RunnableC1706d9 runnableC1706d9 = this.f7604b;
                C1694c9 c1694c9 = runnableC1706d9.f7473c;
                long j = runnableC1706d9.f7472b;
                c1694c9.f7437c.mo9194c();
                c1694c9.f7437c.mo9324k().m9303A().m9365a("Application going to the background");
                c1694c9.f7437c.m9197p().m9736a("auto", "_ab", j, new Bundle());
            }
        });
    }
}
