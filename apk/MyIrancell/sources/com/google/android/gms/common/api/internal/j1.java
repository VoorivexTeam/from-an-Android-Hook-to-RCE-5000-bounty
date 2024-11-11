package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.g;
import java.util.Map;

/* loaded from: classes.dex */
final class j1 implements Runnable {
    private final /* synthetic */ ConnectionResult b;
    private final /* synthetic */ g.b c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j1(g.b bVar, ConnectionResult connectionResult) {
        this.c = bVar;
        this.b = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar;
        a.f fVar;
        a.f fVar2;
        a.f fVar3;
        Map map = g.this.i;
        bVar = this.c.b;
        g.a aVar = (g.a) map.get(bVar);
        if (aVar == null) {
            return;
        }
        if (!this.b.n()) {
            aVar.a(this.b);
            return;
        }
        g.b.a(this.c, true);
        fVar = this.c.a;
        if (fVar.n()) {
            this.c.a();
            return;
        }
        try {
            fVar2 = this.c.a;
            fVar3 = this.c.a;
            fVar2.a(null, fVar3.f());
        } catch (SecurityException unused) {
            aVar.a(new ConnectionResult(10));
        }
    }
}
