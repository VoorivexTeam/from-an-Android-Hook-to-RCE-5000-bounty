package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.AbstractC0864f;
import com.google.android.gms.common.api.AbstractC0866h;
import com.google.android.gms.location.InterfaceC1582f;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: com.google.android.gms.internal.location.y */
/* loaded from: classes.dex */
public final class C1189y implements InterfaceC1582f {
    @Override // com.google.android.gms.location.InterfaceC1582f
    /* renamed from: a */
    public final AbstractC0866h<LocationSettingsResult> mo7498a(AbstractC0864f abstractC0864f, LocationSettingsRequest locationSettingsRequest) {
        return abstractC0864f.mo6552a((AbstractC0864f) new C1190z(this, abstractC0864f, locationSettingsRequest, null));
    }
}
