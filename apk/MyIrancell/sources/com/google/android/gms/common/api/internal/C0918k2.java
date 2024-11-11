package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0861c;
import com.google.android.gms.common.api.InterfaceC0865g;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p000.AbstractC2871ks;
import p000.C0500c0;
import p000.C2908ls;

/* renamed from: com.google.android.gms.common.api.internal.k2 */
/* loaded from: classes.dex */
public final class C0918k2 {

    /* renamed from: d */
    private int f5884d;

    /* renamed from: b */
    private final C0500c0<C0875b<?>, String> f5882b = new C0500c0<>();

    /* renamed from: c */
    private final C2908ls<Map<C0875b<?>, String>> f5883c = new C2908ls<>();

    /* renamed from: e */
    private boolean f5885e = false;

    /* renamed from: a */
    private final C0500c0<C0875b<?>, ConnectionResult> f5881a = new C0500c0<>();

    public C0918k2(Iterable<? extends InterfaceC0865g<?>> iterable) {
        Iterator<? extends InterfaceC0865g<?>> it = iterable.iterator();
        while (it.hasNext()) {
            this.f5881a.put(it.next().mo6534a(), null);
        }
        this.f5884d = this.f5881a.keySet().size();
    }

    /* renamed from: a */
    public final AbstractC2871ks<Map<C0875b<?>, String>> m6794a() {
        return this.f5883c.m13924a();
    }

    /* renamed from: a */
    public final void m6795a(C0875b<?> c0875b, ConnectionResult connectionResult, String str) {
        this.f5881a.put(c0875b, connectionResult);
        this.f5882b.put(c0875b, str);
        this.f5884d--;
        if (!connectionResult.m6488n()) {
            this.f5885e = true;
        }
        if (this.f5884d == 0) {
            if (!this.f5885e) {
                this.f5883c.m13926a((C2908ls<Map<C0875b<?>, String>>) this.f5882b);
            } else {
                this.f5883c.m13925a(new C0861c(this.f5881a));
            }
        }
    }

    /* renamed from: b */
    public final Set<C0875b<?>> m6796b() {
        return this.f5881a.keySet();
    }
}
