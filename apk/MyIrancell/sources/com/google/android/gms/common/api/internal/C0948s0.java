package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.AbstractC0864f;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.common.api.internal.s0 */
/* loaded from: classes.dex */
final class C0948s0 implements AbstractC0864f.b {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f5959a;

    /* renamed from: b */
    private final /* synthetic */ C0939q f5960b;

    /* renamed from: c */
    private final /* synthetic */ C0940q0 f5961c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0948s0(C0940q0 c0940q0, AtomicReference atomicReference, C0939q c0939q) {
        this.f5961c = c0940q0;
        this.f5959a = atomicReference;
        this.f5960b = c0939q;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0895f
    /* renamed from: a */
    public final void mo6688a(int i) {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0895f
    /* renamed from: b */
    public final void mo6689b(Bundle bundle) {
        this.f5961c.m6828a((AbstractC0864f) this.f5959a.get(), this.f5960b, true);
    }
}
