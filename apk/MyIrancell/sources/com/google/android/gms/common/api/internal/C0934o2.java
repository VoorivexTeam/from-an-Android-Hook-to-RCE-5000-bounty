package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* renamed from: com.google.android.gms.common.api.internal.o2 */
/* loaded from: classes.dex */
final class C0934o2 extends AbstractC0917k1 {

    /* renamed from: a */
    private final /* synthetic */ Dialog f5908a;

    /* renamed from: b */
    private final /* synthetic */ RunnableC0926m2 f5909b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0934o2(RunnableC0926m2 runnableC0926m2, Dialog dialog) {
        this.f5909b = runnableC0926m2;
        this.f5908a = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0917k1
    /* renamed from: a */
    public final void mo6793a() {
        this.f5909b.f5897c.m6804g();
        if (this.f5908a.isShowing()) {
            this.f5908a.dismiss();
        }
    }
}
