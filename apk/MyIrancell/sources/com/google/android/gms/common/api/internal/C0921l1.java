package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.google.android.gms.common.api.internal.l1 */
/* loaded from: classes.dex */
public final class C0921l1 extends BroadcastReceiver {

    /* renamed from: a */
    private Context f5888a;

    /* renamed from: b */
    private final AbstractC0917k1 f5889b;

    public C0921l1(AbstractC0917k1 abstractC0917k1) {
        this.f5889b = abstractC0917k1;
    }

    /* renamed from: a */
    public final synchronized void m6800a() {
        if (this.f5888a != null) {
            this.f5888a.unregisterReceiver(this);
        }
        this.f5888a = null;
    }

    /* renamed from: a */
    public final void m6801a(Context context) {
        this.f5888a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f5889b.mo6793a();
            m6800a();
        }
    }
}
