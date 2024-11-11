package com.google.android.gms.internal.location;

import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.i0;

/* loaded from: classes.dex */
final class l extends i0 {
    private final com.google.android.gms.common.api.internal.k<com.google.android.gms.location.b> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(com.google.android.gms.common.api.internal.k<com.google.android.gms.location.b> kVar) {
        this.a = kVar;
    }

    public final synchronized void a() {
        this.a.a();
    }

    @Override // com.google.android.gms.location.h0
    public final void a(LocationAvailability locationAvailability) {
        this.a.a(new n(this, locationAvailability));
    }

    @Override // com.google.android.gms.location.h0
    public final void a(LocationResult locationResult) {
        this.a.a(new m(this, locationResult));
    }
}
