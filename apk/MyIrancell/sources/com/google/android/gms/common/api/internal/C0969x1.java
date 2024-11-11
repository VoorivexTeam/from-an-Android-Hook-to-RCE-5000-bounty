package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C0860b;
import com.google.android.gms.common.api.Status;
import p000.AbstractC2871ks;
import p000.InterfaceC2400ds;

/* renamed from: com.google.android.gms.common.api.internal.x1 */
/* loaded from: classes.dex */
final class C0969x1 implements InterfaceC2400ds<Boolean, Void> {
    @Override // p000.InterfaceC2400ds
    /* renamed from: a */
    public final /* synthetic */ Void mo6923a(AbstractC2871ks<Boolean> abstractC2871ks) {
        if (abstractC2871ks.mo11819b().booleanValue()) {
            return null;
        }
        throw new C0860b(new Status(13, "listener already unregistered"));
    }
}
