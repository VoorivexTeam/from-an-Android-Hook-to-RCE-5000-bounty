package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import defpackage.ks;
import defpackage.ls;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class k2 {
    private int d;
    private final defpackage.c0<b<?>, String> b = new defpackage.c0<>();
    private final ls<Map<b<?>, String>> c = new ls<>();
    private boolean e = false;
    private final defpackage.c0<b<?>, ConnectionResult> a = new defpackage.c0<>();

    public k2(Iterable<? extends com.google.android.gms.common.api.g<?>> iterable) {
        Iterator<? extends com.google.android.gms.common.api.g<?>> it = iterable.iterator();
        while (it.hasNext()) {
            this.a.put(it.next().a(), null);
        }
        this.d = this.a.keySet().size();
    }

    public final ks<Map<b<?>, String>> a() {
        return this.c.a();
    }

    public final void a(b<?> bVar, ConnectionResult connectionResult, String str) {
        this.a.put(bVar, connectionResult);
        this.b.put(bVar, str);
        this.d--;
        if (!connectionResult.n()) {
            this.e = true;
        }
        if (this.d == 0) {
            if (!this.e) {
                this.c.a((ls<Map<b<?>, String>>) this.b);
            } else {
                this.c.a(new com.google.android.gms.common.api.c(this.a));
            }
        }
    }

    public final Set<b<?>> b() {
        return this.a.keySet();
    }
}
