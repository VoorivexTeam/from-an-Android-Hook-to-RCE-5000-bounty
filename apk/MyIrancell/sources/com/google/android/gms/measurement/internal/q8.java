package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* loaded from: classes.dex */
final class q8 implements Runnable {
    private final /* synthetic */ ComponentName b;
    private final /* synthetic */ o8 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q8(o8 o8Var, ComponentName componentName) {
        this.c = o8Var;
        this.b = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.c.a(this.b);
    }
}
