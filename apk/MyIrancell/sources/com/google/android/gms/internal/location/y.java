package com.google.android.gms.internal.location;

import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;

/* loaded from: classes.dex */
public final class y implements com.google.android.gms.location.f {
    @Override // com.google.android.gms.location.f
    public final com.google.android.gms.common.api.h<LocationSettingsResult> a(com.google.android.gms.common.api.f fVar, LocationSettingsRequest locationSettingsRequest) {
        return fVar.a((com.google.android.gms.common.api.f) new z(this, fVar, locationSettingsRequest, null));
    }
}
