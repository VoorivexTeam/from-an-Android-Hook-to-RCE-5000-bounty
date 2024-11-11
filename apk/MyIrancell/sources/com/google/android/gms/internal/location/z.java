package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.d;

/* loaded from: classes.dex */
final class z extends d.a<LocationSettingsResult> {
    private final /* synthetic */ LocationSettingsRequest s;
    private final /* synthetic */ String t = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(y yVar, com.google.android.gms.common.api.f fVar, LocationSettingsRequest locationSettingsRequest, String str) {
        super(fVar);
        this.s = locationSettingsRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.m a(Status status) {
        return new LocationSettingsResult(status);
    }

    @Override // com.google.android.gms.common.api.internal.d
    protected final /* synthetic */ void a(r rVar) {
        rVar.a(this.s, this, this.t);
    }
}
