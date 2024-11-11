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
public final class y2 implements fs<Map<b<?>, String>> {
    private final /* synthetic */ w2 a;

    private y2(w2 w2Var) {
        this.a = w2Var;
    }

    @Override // defpackage.fs
    public final void a(ks<Map<b<?>, String>> ksVar) {
        Lock lock;
        Lock lock2;
        boolean z;
        w2 w2Var;
        ConnectionResult connectionResult;
        boolean z2;
        Map map;
        Map map2;
        boolean a;
        Map map3;
        Map map4;
        ConnectionResult connectionResult2;
        q0 q0Var;
        ConnectionResult connectionResult3;
        Condition condition;
        Map map5;
        Map map6;
        ConnectionResult j;
        Map map7;
        Map map8;
        Map map9;
        lock = this.a.f;
        lock.lock();
        try {
            z = this.a.n;
            if (z) {
                if (ksVar.e()) {
                    w2 w2Var2 = this.a;
                    map7 = this.a.a;
                    w2Var2.o = new defpackage.c0(map7.size());
                    map8 = this.a.a;
                    for (x2 x2Var : map8.values()) {
                        map9 = this.a.o;
                        map9.put(x2Var.a(), ConnectionResult.f);
                    }
                } else {
                    if (ksVar.a() instanceof com.google.android.gms.common.api.c) {
                        com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) ksVar.a();
                        z2 = this.a.l;
                        if (z2) {
                            w2 w2Var3 = this.a;
                            map = this.a.a;
                            w2Var3.o = new defpackage.c0(map.size());
                            map2 = this.a.a;
                            for (x2 x2Var2 : map2.values()) {
                                Object a2 = x2Var2.a();
                                ConnectionResult a3 = cVar.a(x2Var2);
                                a = this.a.a((x2<?>) x2Var2, a3);
                                if (a) {
                                    map3 = this.a.o;
                                    a3 = new ConnectionResult(16);
                                } else {
                                    map3 = this.a.o;
                                }
                                map3.put(a2, a3);
                            }
                        } else {
                            this.a.o = cVar.a();
                        }
                        w2Var = this.a;
                        connectionResult = this.a.j();
                    } else {
                        ksVar.a();
                        this.a.o = Collections.emptyMap();
                        w2Var = this.a;
                        connectionResult = new ConnectionResult(8);
                    }
                    w2Var.r = connectionResult;
                }
                map4 = this.a.p;
                if (map4 != null) {
                    map5 = this.a.o;
                    map6 = this.a.p;
                    map5.putAll(map6);
                    w2 w2Var4 = this.a;
                    j = this.a.j();
                    w2Var4.r = j;
                }
                connectionResult2 = this.a.r;
                if (connectionResult2 == null) {
                    this.a.h();
                    this.a.i();
                } else {
                    w2.a(this.a, false);
                    q0Var = this.a.e;
                    connectionResult3 = this.a.r;
                    q0Var.a(connectionResult3);
                }
                condition = this.a.i;
                condition.signalAll();
            }
        } finally {
            lock2 = this.a.f;
            lock2.unlock();
        }
    }
}
