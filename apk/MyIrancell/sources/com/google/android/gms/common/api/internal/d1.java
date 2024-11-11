package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.g;

/* loaded from: classes.dex */
final class d1 implements Runnable {
    private final /* synthetic */ g.a b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d1(g.a aVar) {
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.n();
    }
}
