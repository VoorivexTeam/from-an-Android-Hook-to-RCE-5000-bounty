package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import p000.HandlerC2824jq;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.b1 */
/* loaded from: classes.dex */
public final class HandlerC0877b1 extends HandlerC2824jq {

    /* renamed from: a */
    private final /* synthetic */ C0976z0 f5744a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0877b1(C0976z0 c0976z0, Looper looper) {
        super(looper);
        this.f5744a = c0976z0;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((AbstractC0972y0) message.obj).m6927a(this.f5744a);
        } else {
            if (i == 2) {
                throw ((RuntimeException) message.obj);
            }
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i);
            sb.toString();
        }
    }
}
