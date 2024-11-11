package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import defpackage.fs;
import defpackage.ks;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u implements fs<Map<b<?>, String>> {
    private o a;
    private final /* synthetic */ w2 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(w2 w2Var, o oVar) {
        this.b = w2Var;
        this.a = oVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.fs
    public final void a(ks<Map<b<?>, String>> ksVar) {
        Lock lock;
        Lock lock2;
        boolean z;
        boolean z2;
        Map map;
        Map map2;
        boolean a;
        Map map3;
        o oVar;
        Map map4;
        Map map5;
        ConnectionResult j;
        Condition condition;
        Map map6;
        Map map7;
        Map map8;
        lock = this.b.f;
        lock.lock();
        try {
            z = this.b.n;
            if (z) {
                if (ksVar.e()) {
                    w2 w2Var = this.b;
                    map6 = this.b.b;
                    w2Var.p = new defpackage.c0(map6.size());
                    map7 = this.b.b;
                    for (x2 x2Var : map7.values()) {
                        map8 = this.b.p;
                        map8.put(x2Var.a(), ConnectionResult.f);
                    }
                } else if (ksVar.a() instanceof com.google.android.gms.common.api.c) {
                    com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) ksVar.a();
                    z2 = this.b.l;
                    if (z2) {
                        w2 w2Var2 = this.b;
                        map = this.b.b;
                        w2Var2.p = new defpackage.c0(map.size());
                        map2 = this.b.b;
                        for (x2 x2Var2 : map2.values()) {
                            Object a2 = x2Var2.a();
                            ConnectionResult a3 = cVar.a(x2Var2);
                            a = this.b.a((x2<?>) x2Var2, a3);
                            if (a) {
                                map3 = this.b.p;
                                a3 = new ConnectionResult(16);
                            } else {
                                map3 = this.b.p;
                            }
                            map3.put(a2, a3);
                        }
                    } else {
                        this.b.p = cVar.a();
                    }
                } else {
                    ksVar.a();
                    this.b.p = Collections.emptyMap();
                }
                if (this.b.a()) {
                    map4 = this.b.o;
                    map5 = this.b.p;
                    map4.putAll(map5);
                    j = this.b.j();
                    if (j == null) {
                        this.b.h();
                        this.b.i();
                        condition = this.b.i;
                        condition.signalAll();
                    }
                }
                oVar = this.a;
            } else {
                oVar = this.a;
            }
            oVar.a();
        } finally {
            lock2 = this.b.f;
            lock2.unlock();
        }
    }
}
