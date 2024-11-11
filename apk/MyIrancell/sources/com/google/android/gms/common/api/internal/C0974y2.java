package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0861c;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import p000.AbstractC2871ks;
import p000.C0500c0;
import p000.InterfaceC2484fs;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.y2 */
/* loaded from: classes.dex */
public final class C0974y2 implements InterfaceC2484fs<Map<C0875b<?>, String>> {

    /* renamed from: a */
    private final /* synthetic */ C0966w2 f6021a;

    private C0974y2(C0966w2 c0966w2) {
        this.f6021a = c0966w2;
    }

    @Override // p000.InterfaceC2484fs
    /* renamed from: a */
    public final void mo5523a(AbstractC2871ks<Map<C0875b<?>, String>> abstractC2871ks) {
        Lock lock;
        Lock lock2;
        boolean z;
        C0966w2 c0966w2;
        ConnectionResult connectionResult;
        boolean z2;
        Map map;
        Map map2;
        boolean m6902a;
        Map map3;
        Map map4;
        ConnectionResult connectionResult2;
        C0940q0 c0940q0;
        ConnectionResult connectionResult3;
        Condition condition;
        Map map5;
        Map map6;
        ConnectionResult m6915j;
        Map map7;
        Map map8;
        Map map9;
        lock = this.f6021a.f6000f;
        lock.lock();
        try {
            z = this.f6021a.f6008n;
            if (z) {
                if (abstractC2871ks.mo11825e()) {
                    C0966w2 c0966w22 = this.f6021a;
                    map7 = this.f6021a.f5995a;
                    c0966w22.f6009o = new C0500c0(map7.size());
                    map8 = this.f6021a.f5995a;
                    for (C0970x2 c0970x2 : map8.values()) {
                        map9 = this.f6021a.f6009o;
                        map9.put(c0970x2.mo6534a(), ConnectionResult.f5655f);
                    }
                } else {
                    if (abstractC2871ks.mo11802a() instanceof C0861c) {
                        C0861c c0861c = (C0861c) abstractC2871ks.mo11802a();
                        z2 = this.f6021a.f6006l;
                        if (z2) {
                            C0966w2 c0966w23 = this.f6021a;
                            map = this.f6021a.f5995a;
                            c0966w23.f6009o = new C0500c0(map.size());
                            map2 = this.f6021a.f5995a;
                            for (C0970x2 c0970x22 : map2.values()) {
                                Object mo6534a = c0970x22.mo6534a();
                                ConnectionResult m6529a = c0861c.m6529a(c0970x22);
                                m6902a = this.f6021a.m6902a((C0970x2<?>) c0970x22, m6529a);
                                if (m6902a) {
                                    map3 = this.f6021a.f6009o;
                                    m6529a = new ConnectionResult(16);
                                } else {
                                    map3 = this.f6021a.f6009o;
                                }
                                map3.put(mo6534a, m6529a);
                            }
                        } else {
                            this.f6021a.f6009o = c0861c.m6528a();
                        }
                        c0966w2 = this.f6021a;
                        connectionResult = this.f6021a.m6915j();
                    } else {
                        abstractC2871ks.mo11802a();
                        this.f6021a.f6009o = Collections.emptyMap();
                        c0966w2 = this.f6021a;
                        connectionResult = new ConnectionResult(8);
                    }
                    c0966w2.f6012r = connectionResult;
                }
                map4 = this.f6021a.f6010p;
                if (map4 != null) {
                    map5 = this.f6021a.f6009o;
                    map6 = this.f6021a.f6010p;
                    map5.putAll(map6);
                    C0966w2 c0966w24 = this.f6021a;
                    m6915j = this.f6021a.m6915j();
                    c0966w24.f6012r = m6915j;
                }
                connectionResult2 = this.f6021a.f6012r;
                if (connectionResult2 == null) {
                    this.f6021a.m6912h();
                    this.f6021a.m6913i();
                } else {
                    C0966w2.m6901a(this.f6021a, false);
                    c0940q0 = this.f6021a.f5999e;
                    connectionResult3 = this.f6021a.f6012r;
                    c0940q0.mo6822a(connectionResult3);
                }
                condition = this.f6021a.f6003i;
                condition.signalAll();
            }
        } finally {
            lock2 = this.f6021a.f6000f;
            lock2.unlock();
        }
    }
}
