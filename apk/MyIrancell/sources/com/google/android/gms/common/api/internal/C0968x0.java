package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.x0 */
/* loaded from: classes.dex */
public final class C0968x0 extends AbstractC0917k1 {

    /* renamed from: a */
    private WeakReference<C0940q0> f6013a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0968x0(C0940q0 c0940q0) {
        this.f6013a = new WeakReference<>(c0940q0);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0917k1
    /* renamed from: a */
    public final void mo6793a() {
        C0940q0 c0940q0 = this.f6013a.get();
        if (c0940q0 == null) {
            return;
        }
        c0940q0.m6835o();
    }
}
