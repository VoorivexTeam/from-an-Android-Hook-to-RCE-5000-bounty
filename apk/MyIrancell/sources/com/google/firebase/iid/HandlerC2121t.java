package com.google.firebase.iid;

import android.os.Looper;
import android.os.Message;
import p000.HandlerC3447xq;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.t */
/* loaded from: classes.dex */
public final class HandlerC2121t extends HandlerC3447xq {

    /* renamed from: a */
    private final /* synthetic */ C2115q f8964a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2121t(C2115q c2115q, Looper looper) {
        super(looper);
        this.f8964a = c2115q;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.f8964a.m10676a(message);
    }
}
