package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0859a;
import com.google.android.gms.common.api.internal.C0899g;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.j1 */
/* loaded from: classes.dex */
final class RunnableC0913j1 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ ConnectionResult f5866b;

    /* renamed from: c */
    private final /* synthetic */ C0899g.b f5867c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0913j1(C0899g.b bVar, ConnectionResult connectionResult) {
        this.f5867c = bVar;
        this.f5866b = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0875b c0875b;
        C0859a.f fVar;
        C0859a.f fVar2;
        C0859a.f fVar3;
        Map map = C0899g.this.f5818i;
        c0875b = this.f5867c.f5837b;
        C0899g.a aVar = (C0899g.a) map.get(c0875b);
        if (aVar == null) {
            return;
        }
        if (!this.f5866b.m6488n()) {
            aVar.mo6740a(this.f5866b);
            return;
        }
        C0899g.b.m6760a(this.f5867c, true);
        fVar = this.f5867c.f5836a;
        if (fVar.mo6521n()) {
            this.f5867c.m6759a();
            return;
        }
        try {
            fVar2 = this.f5867c.f5836a;
            fVar3 = this.f5867c.f5836a;
            fVar2.m6512a(null, fVar3.mo6516f());
        } catch (SecurityException unused) {
            aVar.mo6740a(new ConnectionResult(10));
        }
    }
}
