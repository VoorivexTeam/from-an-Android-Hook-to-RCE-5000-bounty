package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C0915k;
import com.google.android.gms.location.C1574b;
import com.google.android.gms.location.LocationAvailability;

/* renamed from: com.google.android.gms.internal.location.n */
/* loaded from: classes.dex */
final class C1178n implements C0915k.b<C1574b> {

    /* renamed from: a */
    private final /* synthetic */ LocationAvailability f6441a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1178n(BinderC1176l binderC1176l, LocationAvailability locationAvailability) {
        this.f6441a = locationAvailability;
    }

    @Override // com.google.android.gms.common.api.internal.C0915k.b
    /* renamed from: a */
    public final void mo6791a() {
    }

    @Override // com.google.android.gms.common.api.internal.C0915k.b
    /* renamed from: a */
    public final /* synthetic */ void mo6792a(C1574b c1574b) {
        c1574b.mo5521a(this.f6441a);
    }
}
