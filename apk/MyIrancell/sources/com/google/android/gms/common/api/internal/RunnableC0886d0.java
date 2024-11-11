package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.google.android.gms.common.C0994d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.d0 */
/* loaded from: classes.dex */
public final class RunnableC0886d0 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ C0891e0 f5766b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0886d0(C0891e0 c0891e0) {
        this.f5766b = c0891e0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0994d c0994d;
        Context context;
        c0994d = this.f5766b.f5777d;
        context = this.f5766b.f5776c;
        c0994d.m6972a(context);
    }
}
