package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.AbstractC0864f;
import com.google.android.gms.common.api.InterfaceC0982m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.C1578d;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: com.google.android.gms.internal.location.z */
/* loaded from: classes.dex */
final class C1190z extends C1578d.a<LocationSettingsResult> {

    /* renamed from: s */
    private final /* synthetic */ LocationSettingsRequest f6446s;

    /* renamed from: t */
    private final /* synthetic */ String f6447t = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1190z(C1189y c1189y, AbstractC0864f abstractC0864f, LocationSettingsRequest locationSettingsRequest, String str) {
        super(abstractC0864f);
        this.f6446s = locationSettingsRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: a */
    public final /* synthetic */ InterfaceC0982m mo6471a(Status status) {
        return new LocationSettingsResult(status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0885d
    /* renamed from: a */
    protected final /* synthetic */ void mo6472a(C1182r c1182r) {
        c1182r.m7497a(this.f6446s, this, this.f6447t);
    }
}
