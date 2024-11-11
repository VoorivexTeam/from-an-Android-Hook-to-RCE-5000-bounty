package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import defpackage.tl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    private final m b;
    private final tl c;
    private final int d;
    private final Runnable e;

    private h(m mVar, tl tlVar, int i, Runnable runnable) {
        this.b = mVar;
        this.c = tlVar;
        this.d = i;
        this.e = runnable;
    }

    public static Runnable a(m mVar, tl tlVar, int i, Runnable runnable) {
        return new h(mVar, tlVar, i, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        m.a(this.b, this.c, this.d, this.e);
    }
}
