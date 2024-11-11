package com.google.android.gms.internal.location;

import android.content.Context;
import com.google.android.gms.common.api.internal.k;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class k {
    private final x<g> a;
    private boolean b = false;
    private final Map<k.a<com.google.android.gms.location.c>, p> c = new HashMap();
    private final Map<k.a<Object>, o> d = new HashMap();
    private final Map<k.a<com.google.android.gms.location.b>, l> e = new HashMap();

    public k(Context context, x<g> xVar) {
        this.a = xVar;
    }

    private final l a(com.google.android.gms.common.api.internal.k<com.google.android.gms.location.b> kVar) {
        l lVar;
        synchronized (this.e) {
            lVar = this.e.get(kVar.b());
            if (lVar == null) {
                lVar = new l(kVar);
            }
            this.e.put(kVar.b(), lVar);
        }
        return lVar;
    }

    public final void a() {
        synchronized (this.c) {
            for (p pVar : this.c.values()) {
                if (pVar != null) {
                    this.a.b().a(zzbf.a(pVar, (d) null));
                }
            }
            this.c.clear();
        }
        synchronized (this.e) {
            for (l lVar : this.e.values()) {
                if (lVar != null) {
                    this.a.b().a(zzbf.a(lVar, (d) null));
                }
            }
            this.e.clear();
        }
        synchronized (this.d) {
            for (o oVar : this.d.values()) {
                if (oVar != null) {
                    this.a.b().a(new zzo(2, null, oVar.asBinder(), null));
                }
            }
            this.d.clear();
        }
    }

    public final void a(k.a<com.google.android.gms.location.b> aVar, d dVar) {
        this.a.a();
        com.google.android.gms.common.internal.u.a(aVar, "Invalid null listener key");
        synchronized (this.e) {
            l remove = this.e.remove(aVar);
            if (remove != null) {
                remove.a();
                this.a.b().a(zzbf.a(remove, dVar));
            }
        }
    }

    public final void a(zzbd zzbdVar, com.google.android.gms.common.api.internal.k<com.google.android.gms.location.b> kVar, d dVar) {
        this.a.a();
        this.a.b().a(new zzbf(1, zzbdVar, null, null, a(kVar).asBinder(), dVar != null ? dVar.asBinder() : null));
    }

    public final void a(boolean z) {
        this.a.a();
        this.a.b().d(z);
        this.b = z;
    }

    public final void b() {
        if (this.b) {
            a(false);
        }
    }
}
