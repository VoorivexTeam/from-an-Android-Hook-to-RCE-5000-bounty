package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f1 implements Runnable {
    private final /* synthetic */ g.a b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1(g.a aVar) {
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.o();
    }
}
