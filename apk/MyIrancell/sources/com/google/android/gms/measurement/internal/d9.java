package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d9 implements Runnable {
    long b;
    final /* synthetic */ c9 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d9(c9 c9Var, long j) {
        this.c = c9Var;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.c.g().a(new Runnable(this) { // from class: com.google.android.gms.measurement.internal.h9
            private final d9 b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                d9 d9Var = this.b;
                c9 c9Var = d9Var.c;
                long j = d9Var.b;
                c9Var.c.c();
                c9Var.c.k().A().a("Application going to the background");
                c9Var.c.p().a("auto", "_ab", j, new Bundle());
            }
        });
    }
}
