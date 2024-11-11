package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C0915k;
import com.google.android.gms.location.AbstractBinderC1589i0;
import com.google.android.gms.location.C1574b;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* renamed from: com.google.android.gms.internal.location.l */
/* loaded from: classes.dex */
final class BinderC1176l extends AbstractBinderC1589i0 {

    /* renamed from: a */
    private final C0915k<C1574b> f6439a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC1176l(C0915k<C1574b> c0915k) {
        this.f6439a = c0915k;
    }

    /* renamed from: a */
    public final synchronized void m7491a() {
        this.f6439a.m6787a();
    }

    @Override // com.google.android.gms.location.InterfaceC1587h0
    /* renamed from: a */
    public final void mo7492a(LocationAvailability locationAvailability) {
        this.f6439a.m6788a(new C1178n(this, locationAvailability));
    }

    @Override // com.google.android.gms.location.InterfaceC1587h0
    /* renamed from: a */
    public final void mo7493a(LocationResult locationResult) {
        this.f6439a.m6788a(new C1177m(this, locationResult));
    }
}
