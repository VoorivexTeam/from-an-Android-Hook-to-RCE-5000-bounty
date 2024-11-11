package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.internal.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h1 implements d.e {
    final /* synthetic */ g.a a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h1(g.a aVar) {
        this.a = aVar;
    }

    @Override // com.google.android.gms.common.internal.d.e
    public final void a() {
        g.this.m.post(new g1(this));
    }
}
