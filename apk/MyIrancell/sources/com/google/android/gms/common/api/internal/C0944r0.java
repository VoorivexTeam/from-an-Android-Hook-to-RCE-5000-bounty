package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC0864f;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.r0 */
/* loaded from: classes.dex */
final class C0944r0 implements AbstractC0864f.c {

    /* renamed from: a */
    private final /* synthetic */ C0939q f5943a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0944r0(C0940q0 c0940q0, C0939q c0939q) {
        this.f5943a = c0939q;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0923m
    /* renamed from: a */
    public final void mo6740a(ConnectionResult connectionResult) {
        this.f5943a.m6585a((C0939q) new Status(8));
    }
}
