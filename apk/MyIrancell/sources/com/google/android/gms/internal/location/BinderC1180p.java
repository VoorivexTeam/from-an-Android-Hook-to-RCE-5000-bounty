package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.C0915k;
import com.google.android.gms.location.AbstractBinderC1595l0;
import com.google.android.gms.location.InterfaceC1576c;

/* renamed from: com.google.android.gms.internal.location.p */
/* loaded from: classes.dex */
final class BinderC1180p extends AbstractBinderC1595l0 {

    /* renamed from: a */
    private final C0915k<InterfaceC1576c> f6442a;

    @Override // com.google.android.gms.location.InterfaceC1593k0
    /* renamed from: a */
    public final synchronized void mo7494a(Location location) {
        this.f6442a.m6788a(new C1181q(this, location));
    }
}
