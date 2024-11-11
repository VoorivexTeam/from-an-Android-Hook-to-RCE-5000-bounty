package com.google.android.gms.internal.location;

import com.google.android.gms.location.LocationSettingsResult;

/* loaded from: classes.dex */
final class t extends j {
    private com.google.android.gms.common.api.internal.e<LocationSettingsResult> a;

    public t(com.google.android.gms.common.api.internal.e<LocationSettingsResult> eVar) {
        com.google.android.gms.common.internal.u.a(eVar != null, "listener can't be null.");
        this.a = eVar;
    }

    @Override // com.google.android.gms.internal.location.i
    public final void a(LocationSettingsResult locationSettingsResult) {
        this.a.a(locationSettingsResult);
        this.a = null;
    }
}
