package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.location.LocationAvailability;

/* loaded from: classes.dex */
final class n implements k.b<com.google.android.gms.location.b> {
    private final /* synthetic */ LocationAvailability a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(l lVar, LocationAvailability locationAvailability) {
        this.a = locationAvailability;
    }

    @Override // com.google.android.gms.common.api.internal.k.b
    public final void a() {
    }

    @Override // com.google.android.gms.common.api.internal.k.b
    public final /* synthetic */ void a(com.google.android.gms.location.b bVar) {
        bVar.a(this.a);
    }
}
