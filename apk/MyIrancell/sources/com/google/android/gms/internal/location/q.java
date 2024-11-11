package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.k;

/* loaded from: classes.dex */
final class q implements k.b<com.google.android.gms.location.c> {
    private final /* synthetic */ Location a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(p pVar, Location location) {
        this.a = location;
    }

    @Override // com.google.android.gms.common.api.internal.k.b
    public final void a() {
    }

    @Override // com.google.android.gms.common.api.internal.k.b
    public final /* synthetic */ void a(com.google.android.gms.location.c cVar) {
        cVar.a(this.a);
    }
}
