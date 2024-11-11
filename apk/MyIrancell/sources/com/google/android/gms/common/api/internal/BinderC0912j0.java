package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.BinderC1963d;
import com.google.android.gms.signin.internal.zak;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.j0 */
/* loaded from: classes.dex */
final class BinderC0912j0 extends BinderC1963d {

    /* renamed from: a */
    private final WeakReference<C0891e0> f5865a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC0912j0(C0891e0 c0891e0) {
        this.f5865a = new WeakReference<>(c0891e0);
    }

    @Override // com.google.android.gms.signin.internal.InterfaceC1962c
    /* renamed from: a */
    public final void mo6780a(zak zakVar) {
        C0976z0 c0976z0;
        C0891e0 c0891e0 = this.f5865a.get();
        if (c0891e0 == null) {
            return;
        }
        c0976z0 = c0891e0.f5774a;
        c0976z0.m6933a(new C0924m0(this, c0891e0, c0891e0, zakVar));
    }
}
