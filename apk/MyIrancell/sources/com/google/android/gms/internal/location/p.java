package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.location.l0;

/* loaded from: classes.dex */
final class p extends l0 {
    private final com.google.android.gms.common.api.internal.k<com.google.android.gms.location.c> a;

    @Override // com.google.android.gms.location.k0
    public final synchronized void a(Location location) {
        this.a.a(new q(this, location));
    }
}
