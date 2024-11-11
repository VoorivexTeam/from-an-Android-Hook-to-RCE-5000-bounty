package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C0899g;

/* renamed from: com.google.android.gms.common.api.internal.e1 */
/* loaded from: classes.dex */
final class RunnableC0892e1 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ ConnectionResult f5795b;

    /* renamed from: c */
    private final /* synthetic */ C0899g.a f5796c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0892e1(C0899g.a aVar, ConnectionResult connectionResult) {
        this.f5796c = aVar;
        this.f5795b = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5796c.mo6740a(this.f5795b);
    }
}
