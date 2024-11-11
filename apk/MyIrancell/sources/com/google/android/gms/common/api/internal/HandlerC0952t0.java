package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import p000.HandlerC2824jq;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.t0 */
/* loaded from: classes.dex */
public final class HandlerC0952t0 extends HandlerC2824jq {

    /* renamed from: a */
    private final /* synthetic */ C0940q0 f5964a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0952t0(C0940q0 c0940q0, Looper looper) {
        super(looper);
        this.f5964a = c0940q0;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.f5964a.m6837q();
            return;
        }
        if (i == 2) {
            this.f5964a.m6835o();
            return;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("Unknown message id: ");
        sb.append(i);
        sb.toString();
    }
}
