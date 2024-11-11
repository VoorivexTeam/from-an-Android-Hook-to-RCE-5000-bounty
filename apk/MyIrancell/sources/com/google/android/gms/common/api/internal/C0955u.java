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
/* renamed from: com.google.android.gms.common.api.internal.u */
/* loaded from: classes.dex */
public final class C0955u implements InterfaceC2484fs<Map<C0875b<?>, String>> {

    /* renamed from: a */
    private InterfaceC0931o f5974a;

    /* renamed from: b */
    private final /* synthetic */ C0966w2 f5975b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0955u(C0966w2 c0966w2, InterfaceC0931o interfaceC0931o) {
        this.f5975b = c0966w2;
        this.f5974a = interfaceC0931o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m6885a() {
        this.f5974a.mo6459a();
    }

    @Override // p000.InterfaceC2484fs
    /* renamed from: a */
    public final void mo5523a(AbstractC2871ks<Map<C0875b<?>, String>> abstractC2871ks) {
        Lock lock;
        Lock lock2;
        boolean z;
        boolean z2;
        Map map;
        Map map2;
        boolean m6902a;
        Map map3;
        InterfaceC0931o interfaceC0931o;
        Map map4;
        Map map5;
        ConnectionResult m6915j;
        Condition condition;
        Map map6;
        Map map7;
        Map map8;
        lock = this.f5975b.f6000f;
        lock.lock();
        try {
            z = this.f5975b.f6008n;
            if (z) {
                if (abstractC2871ks.mo11825e()) {
                    C0966w2 c0966w2 = this.f5975b;
                    map6 = this.f5975b.f5996b;
                    c0966w2.f6010p = new C0500c0(map6.size());
                    map7 = this.f5975b.f5996b;
                    for (C0970x2 c0970x2 : map7.values()) {
                        map8 = this.f5975b.f6010p;
                        map8.put(c0970x2.mo6534a(), ConnectionResult.f5655f);
                    }
                } else if (abstractC2871ks.mo11802a() instanceof C0861c) {
                    C0861c c0861c = (C0861c) abstractC2871ks.mo11802a();
                    z2 = this.f5975b.f6006l;
                    if (z2) {
                        C0966w2 c0966w22 = this.f5975b;
                        map = this.f5975b.f5996b;
                        c0966w22.f6010p = new C0500c0(map.size());
                        map2 = this.f5975b.f5996b;
                        for (C0970x2 c0970x22 : map2.values()) {
                            Object mo6534a = c0970x22.mo6534a();
                            ConnectionResult m6529a = c0861c.m6529a(c0970x22);
                            m6902a = this.f5975b.m6902a((C0970x2<?>) c0970x22, m6529a);
                            if (m6902a) {
                                map3 = this.f5975b.f6010p;
                                m6529a = new ConnectionResult(16);
                            } else {
                                map3 = this.f5975b.f6010p;
                            }
                            map3.put(mo6534a, m6529a);
                        }
                    } else {
                        this.f5975b.f6010p = c0861c.m6528a();
                    }
                } else {
                    abstractC2871ks.mo11802a();
                    this.f5975b.f6010p = Collections.emptyMap();
                }
                if (this.f5975b.mo6807a()) {
                    map4 = this.f5975b.f6009o;
                    map5 = this.f5975b.f6010p;
                    map4.putAll(map5);
                    m6915j = this.f5975b.m6915j();
                    if (m6915j == null) {
                        this.f5975b.m6912h();
                        this.f5975b.m6913i();
                        condition = this.f5975b.f6003i;
                        condition.signalAll();
                    }
                }
                interfaceC0931o = this.f5974a;
            } else {
                interfaceC0931o = this.f5974a;
            }
            interfaceC0931o.mo6459a();
        } finally {
            lock2 = this.f5975b.f6000f;
            lock2.unlock();
        }
    }
}
