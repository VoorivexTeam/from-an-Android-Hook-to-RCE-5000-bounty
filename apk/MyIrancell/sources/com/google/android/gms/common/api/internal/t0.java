package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import defpackage.jq;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t0 extends jq {
    private final /* synthetic */ q0 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(q0 q0Var, Looper looper) {
        super(looper);
        this.a = q0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.a.q();
            return;
        }
        if (i == 2) {
            this.a.o();
            return;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("Unknown message id: ");
        sb.append(i);
        sb.toString();
    }
}
