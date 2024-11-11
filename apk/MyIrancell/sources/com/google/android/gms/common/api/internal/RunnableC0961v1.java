package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.zak;

/* renamed from: com.google.android.gms.common.api.internal.v1 */
/* loaded from: classes.dex */
final class RunnableC0961v1 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ zak f5983b;

    /* renamed from: c */
    private final /* synthetic */ BinderC0953t1 f5984c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0961v1(BinderC0953t1 binderC0953t1, zak zakVar) {
        this.f5984c = binderC0953t1;
        this.f5983b = zakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5984c.m6881b(this.f5983b);
    }
}
