package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import defpackage.ds;
import defpackage.ks;

/* loaded from: classes.dex */
final class x1 implements ds<Boolean, Void> {
    @Override // defpackage.ds
    public final /* synthetic */ Void a(ks<Boolean> ksVar) {
        if (ksVar.b().booleanValue()) {
            return null;
        }
        throw new com.google.android.gms.common.api.b(new Status(13, "listener already unregistered"));
    }
}
