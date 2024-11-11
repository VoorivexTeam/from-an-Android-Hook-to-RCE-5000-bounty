package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.ComponentCallbacks2C0880c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.c1 */
/* loaded from: classes.dex */
public final class C0882c1 implements ComponentCallbacks2C0880c.a {

    /* renamed from: a */
    private final /* synthetic */ C0899g f5760a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0882c1(C0899g c0899g) {
        this.f5760a = c0899g;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C0880c.a
    /* renamed from: a */
    public final void mo6634a(boolean z) {
        this.f5760a.f5822m.sendMessage(this.f5760a.f5822m.obtainMessage(1, Boolean.valueOf(z)));
    }
}
